package cn.ibizlab.plm.ai.aikbdocument.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[AI_KB_DOCUMENT]处理逻辑[文档解析处理]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class Parsing extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(Parsing.class)

    @Override
	protected void onInit() throws Exception {
		super.onInit()
	}

    @Override
    protected void onExecutePSDELogicNode(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        switch (iPSDELogicNode.getCodeName()) {
            case "Begin":
                //执行逻辑节点[开始]
                executeBegin(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_01":
                //执行逻辑节点[获取数据]
                executeDeaction01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_01":
                //执行逻辑节点[获取文件内容]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM_01":
                //执行逻辑节点[调试逻辑参数]
                executeDebugparam01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_03":
                //执行逻辑节点[实体打印]
                executeRawsfcode03(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_02":
                //执行逻辑节点[正则解析文档内容]
                executeRawsfcode02(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM_02":
                //执行逻辑节点[调试逻辑参数]
                executeDebugparam02(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_02":
                //执行逻辑节点[实体行为]
                executeDeaction02(iDELogicSession, iPSDELogicNode)
                break
            case "END_01":
                //执行逻辑节点[结束]
                executeEnd01(iDELogicSession, iPSDELogicNode)
                break
            default:
                super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode)
        }
    }

    /**
     * 执行逻辑节点[开始]，逻辑类型[BEGIN]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeBegin(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取数据]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取文件内容]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def _type = _default.get('type')
			if (_type == 'file'){
			    def iCloudOSSClient = sys.getSysUtilRuntime(net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime.class, false).getServiceClient("cloud-oss", net.ibizsys.central.cloud.core.cloudutil.client.ICloudOSSClient.class, true)
			    def fileJson = _default.get("file")
			    if (fileJson){
			        def file = new groovy.json.JsonSlurper().parseText(fileJson)
			        if (file.size() > 0){
			            println("输出file"+file[0])
			            def fileId = file[0].id
			            def folder = file[0].folder
			            def fileText = iCloudOSSClient.downloadText(folder, fileId)
			            _default.set("parsed_content", fileText)
			        }
			    }
			}
        }.call(iDELogicSession.getDELogicRuntime().getSystemRuntime(), iDELogicSession.getDELogicRuntime())
        //设置返回值
        iDELogicSession.setLastReturn(objRet);
        if(iPSDELogicNode.getRetPSDELogicParam() != null) {
            def retDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicNode.getRetPSDELogicParam().getCodeName(), false);
            retDELogicParamRuntime.bind(iDELogicSession, objRet);
        }
        //super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[调试逻辑参数]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDebugparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[实体打印]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def deCodeName = _default.get('source_type')
			def dstEntityKey = _default.get('source_id')
			if (deCodeName && dstEntityKey) {
			    def dstEntityRuntime = sys.dataentity(deCodeName)
			    def bos = new java.io.ByteArrayOutputStream()
			    def dePrintCodeName = "chat_resource"
			    def keys = [dstEntityKey] as Object[]
			    dstEntityRuntime.outputPrint(
			        dePrintCodeName,
			        bos,
			        keys,
			        null,
			        false
			    )
			    _default.set("parsed_content", bos.toString("utf-8"))
			}
        }.call(iDELogicSession.getDELogicRuntime().getSystemRuntime(), iDELogicSession.getDELogicRuntime())
        //设置返回值
        iDELogicSession.setLastReturn(objRet);
        if(iPSDELogicNode.getRetPSDELogicParam() != null) {
            def retDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicNode.getRetPSDELogicParam().getCodeName(), false);
            retDELogicParamRuntime.bind(iDELogicSession, objRet);
        }
        //super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[正则解析文档内容]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def parsed_content = _default.get('parsed_content')
			def custom_chunk = _default.get('custom_chunk')
			def parser_config
			if (custom_chunk == 0){
			    // 使用所属知识库默认规则
			    def knowledge_base_runtime = sys.dataentity('ai_knowledge_base')
			    def knowledge_base = knowledge_base_runtime.get(_default.get('kb_id'))
			    if (knowledge_base){
			        parser_config = knowledge_base.get('parser_config')
			    }
			}else if (custom_chunk == 1){
			    // 使用自定义规则
			    parser_config = _default.get('parser_config')
			}
			if (parser_config){
			    // 1. 预处理规则
			    def pre_process_rules = parser_config.get('pre_process_rules')
			    if (pre_process_rules) {
			        def rulesList = pre_process_rules.split(',')
			        // 合并多余空格/换行（保留单个空格，移除连续空白）
			        if (rulesList.contains('remove_extra_whitespace')) {
			            parsed_content = parsed_content.replaceAll(/[\s\u3000]+/, ' ')
			        }
			
			        // 移除 <script> 和 <style> 内容（保留其他标签，如 <div>）
			        if (rulesList.contains('remove_js_css')) {
			            // 先移除 <script> 标签内容
			            parsed_content = parsed_content.replaceAll(/<script[^>]*>[\s\S]*?<\/script>/, '')
			            // 再移除 <style> 标签内容
			            parsed_content = parsed_content.replaceAll(/<style[^>]*>[\s\S]*?<\/style>/, '')
			        }
			
			        // 剥离 HTML 标签（保留纯文本，如 <p>Hello</p> → Hello）
			        if (rulesList.contains('remove_html_tags')) {
			            parsed_content = parsed_content.replaceAll(/<[^>]+>/, '')
			        }
			
			        // 移除电子邮箱及 URL（精准匹配，避免误删）
			        if (rulesList.contains('remove_emails_url')) {
			            // 移除 URL（http/https 开头）
			            parsed_content = parsed_content.replaceAll(/https?:\/\/[^\s]+/, '')
			            // 移除电子邮箱（标准格式）
			            parsed_content = parsed_content.replaceAll(/[\w\.-]+@[\w\.-]+\.\w+/, '')
			        }
			
			        // 统一中英文标点（如 “” → "，‘’ → '）
			        if (rulesList.contains('normalize_punctuation')) {
			            parsed_content = parsed_content
			                .replace('，', ',')
			                .replace('。', '.')
			                .replace('！', '!')
			                .replace('？', '?')
			                .replace('；', ';')
			                .replace('：', ':')
			                .replace('（', '(')
			                .replace('）', ')')
			                .replace('“', '"')
			                .replace('”', '"')
			                .replace('‘', "'")
			                .replace('’', "'")
			        }
			    }
			    // 2. 自定义脱敏规则
			    def data_masking_rules = parser_config.get('data_masking_rules')
			    if (data_masking_rules){
			        // 根据正则规则pattern对parsed_content进行替换
			        def masked_data = logic.param('masked_data').getReal()
			        for (data_masking_rule in data_masking_rules){
			            def pattern = data_masking_rule.get('pattern')
			            def replacement = data_masking_rule.get('replacement')?:''
			            if (pattern){
			                parsed_content = parsed_content.replaceAll(pattern, replacement)
			            }
			        }
			    }
			    def masked_data = logic.param('masked_data').getReal()
			    masked_data.set("id", _default.get("id"))
			    masked_data.set("parsed_content", parsed_content)
			    masked_data.set("status", "3")
			
			}
        }.call(iDELogicSession.getDELogicRuntime().getSystemRuntime(), iDELogicSession.getDELogicRuntime())
        //设置返回值
        iDELogicSession.setLastReturn(objRet);
        if(iPSDELogicNode.getRetPSDELogicParam() != null) {
            def retDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicNode.getRetPSDELogicParam().getCodeName(), false);
            retDELogicParamRuntime.bind(iDELogicSession, objRet);
        }
        //super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[调试逻辑参数]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDebugparam02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[实体行为]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[结束]，逻辑类型[END]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeEnd01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

