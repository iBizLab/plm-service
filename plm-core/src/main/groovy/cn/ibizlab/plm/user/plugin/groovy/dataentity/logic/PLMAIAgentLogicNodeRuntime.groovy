package cn.ibizlab.plm.user.plugin.groovy.dataentity.logic;

import groovy.transform.CompileStatic
import net.ibizsys.central.cloud.core.IServiceSystemRuntime
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime
import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime
import net.ibizsys.central.cloud.core.dataentity.logic.DELogicSysAIChatAgentNodeRuntime
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResultEx
import net.ibizsys.central.cloud.core.util.domain.ChatMessage
import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime
import net.ibizsys.central.dataentity.logic.IDELogicRuntimeContext
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode
import net.ibizsys.model.dataentity.logic.IPSDESysAIChatAgentLogic
import net.ibizsys.model.util.JsonUtils
import net.ibizsys.runtime.util.Entity
import org.springframework.util.ObjectUtils

import java.util.regex.Matcher
import java.util.regex.Pattern

@CompileStatic
class PLMAIAgentLogicNodeRuntime extends DELogicSysAIChatAgentNodeRuntime {


    @Override
    protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecute(iDELogicRuntimeContext,iDELogicSession,iPSDELogicNode);
    }

    @Override
    protected void onExecuteChatDefault(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {
        IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)iDELogicRuntimeContext.getSystemRuntime();
        ISysAIFactoryRuntime iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
        ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
        IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);

        ChatCompletionResult chatCompletionResult = null;
        ChatCompletionRequest chatCompletionRequest = null;
        Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
        if(objParam instanceof ChatCompletionRequest || objParam instanceof String) {
            chatCompletionRequest = new ChatCompletionRequest();
            if(objParam instanceof ChatCompletionRequest) {
                ChatCompletionRequest chatCompletionRequest2 = (ChatCompletionRequest)objParam;
                //放入历史消息
                if(iPSDESysAIChatAgentLogic.getHistoryCount() > 0 && !ObjectUtils.isEmpty(chatCompletionRequest2.getMessages()) && chatCompletionRequest2.getMessages().size() > iPSDESysAIChatAgentLogic.getHistoryCount()) {
                    List<ChatMessage> list = chatCompletionRequest2.getMessages().subList(chatCompletionRequest2.getMessages().size() - iPSDESysAIChatAgentLogic.getHistoryCount(), chatCompletionRequest2.getMessages().size());
                    chatCompletionRequest.setMessages(list);
                }
                else {
                    chatCompletionRequest.setMessages(chatCompletionRequest2.getMessages());
                }
            }
            else
            if(objParam instanceof String) {
                chatCompletionRequest.setMessages(new ChatMessagesBuilder().user(objParam.toString()).build());
            }

            //指定智能体
            Map<String, String> options = JsonUtils.asMap(iPSDESysAIChatAgentLogic.getNodeParams());
            if(options.get("aiagenttag")!=null){
                chatCompletionRequest.set("srfaiagenttag",options.get("aiagenttag"));
            }
            chatCompletionResult = iSysAIChatAgentRuntime.chatCompletion(new Entity() , chatCompletionRequest, new LinkedHashMap<String, Object>(), true, false);
        }
        else {
            chatCompletionRequest = new ChatCompletionRequest();
            chatCompletionRequest.from(objParam)
            //指定智能体
            Map<String, String> options = JsonUtils.asMap(iPSDESysAIChatAgentLogic.getNodeParams());
            if(options.get("aiagenttag")!=null){
                chatCompletionRequest.set("srfaiagenttag",options.get("aiagenttag"));
            }
            chatCompletionResult = iSysAIChatAgentRuntime.chatCompletion(objParam , chatCompletionRequest, new LinkedHashMap<String, Object>(), true, true);
        }

        Object objRet = this.getRealResult(chatCompletionResult, chatCompletionRequest, objParam, iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic);

        iDELogicSession.setLastReturn(objRet);

        if(iPSDESysAIChatAgentLogic.getRetPSDELogicParam() != null) {
            IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getRetPSDELogicParam().getCodeName(), false);
            retDELogicParamRuntime.bind(iDELogicSession, objRet);
        }
    }

    protected Object getRealResult(ChatCompletionResult chatCompletionResult, ChatCompletionRequest chatCompletionRequest, Object objParam, IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic) throws Exception {
        java.lang.Object realResult = super.getRealResult(chatCompletionResult,chatCompletionRequest,objParam,iDELogicRuntimeContext,iDELogicSession,iPSDESysAIChatAgentLogic);
        if (realResult) {
            if (realResult instanceof String) {
                List<Map<String, Object>>  patterns = [
                        [p: /```json\s*([\s\S]*?)\s*```/, c: { String it -> it.replace('```json', '').replace('```', '').trim() } as Closure<String>],
                        [p: /```\s*([\s\S]*?)\s*```/,     c: { String it -> it.replace('```', '').trim() } as Closure<String>],
                        [p: /\{[\s\S]*?\}(?=\s*[\n\r]|$)/, c: { String it -> it.trim() } as Closure<String>],
                        [p: /\[[\s\S]*?\](?=\s*[\n\r]|$)/, c: { String it -> it.trim() } as Closure<String>]
                ] as List<Map<String, Object>>;

                groovy.json.JsonSlurper slurper = new groovy.json.JsonSlurper()

                for (Map<String, Object> e : patterns) {
                    Pattern pattern = Pattern.compile ((String)e.get('p'))
                    Matcher m = pattern.matcher(realResult)
                    if (m.find()) {
                        String raw = m.group(0)
                        Closure<String> cleanFn = (Closure<String>) e.get('c')
                        String clean = cleanFn.call(raw)

                        if (clean && !clean.isEmpty()) {
                            try {
                                Object data = slurper.parseText(clean)
                                return data
                            } catch (groovy.json.JsonException ignored) {
                                // 继续尝试下一个模式
                            }
                        }
                    }
                }
            }
        }
        return realResult;
    }
}