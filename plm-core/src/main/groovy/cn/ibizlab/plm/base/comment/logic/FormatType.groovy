package cn.ibizlab.plm.base.comment.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[COMMENT]处理逻辑[识别内容格式]运行时对象
 * 此代码用户功能扩展代码
 *
 * 识别评论内容格式
 */
class FormatType extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(FormatType.class)

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
            case "RAWSFCODE_01":
                //执行逻辑节点[判断内容格式]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[判断内容格式]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('default').getReal()
			def _content = _default.get('content').trim()
			
			
			if(_content != null){
			
			     // 检查 HTML（使用更简单的匹配）
			    boolean isHtml = false
			    boolean isMarkdown = false
			    
			    // 检查 HTML 标签
			    if (_content.contains("</") && _content.contains(">")) {
			        // 检查成对的标签
			        def tags = ["html", "body", "head", "div", "p", "span", "table", "ul", "ol"]
			        tags.each { tag ->
			            if (_content.contains("<${tag}") && _content.contains("</${tag}>")) {
			                isHtml = true
			            }
			        }
			        
			        // 检查自闭合标签
			        def selfClosing = ["br", "hr", "img", "input", "meta", "link"]
			        selfClosing.each { tag ->
			            if (_content.contains("<${tag}") && _content.contains("/>")) {
			                isHtml = true
			            }
			        }
			    }
			    
			    // 检查 HTML 文档声明
			    if (_content.toLowerCase().contains("<!doctype html")) {
			        isHtml = true
			    }
			    
			
			    // 链接 [_content](url)
			    if (_content.contains("[") && _content.contains("](") && _content.contains(")")) {
			        isMarkdown = true
			    }
			    
			    // 列表
			    if (_content.contains("- ") || _content.contains("* ") || _content.contains("1. ")) {
			        isMarkdown = true
			    }
			    
			    // 代码块
			    if (_content.contains("```") || _content.contains("~~~")) {
			        isMarkdown = true
			    }
			    
			    println "评论1#######:$_default"
			    
			    // 返回结果
			    if (isHtml && isMarkdown) {
			        _default.set('format_type', "HTML")
			    } else if (isMarkdown) {
			          _default.set('format_type', "MD")
			    } else {
			         _default.set('format_type', "HTML")
			    }
			    println "评论2#######:$_default"
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
}

