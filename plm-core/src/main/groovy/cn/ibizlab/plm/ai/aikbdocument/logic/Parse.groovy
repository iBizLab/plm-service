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
class Parse extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(Parse.class)

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
            case "PREPAREPARAM_03":
                //执行逻辑节点[调整为待切片]
                executePrepareparam03(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_04":
                //执行逻辑节点[更新文件类文档状态]
                executeDeaction04(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_02":
                //执行逻辑节点[拷贝变量]
                executePrepareparam02(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_01":
                //执行逻辑节点[获取数据]
                executeDeaction01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_01":
                //执行逻辑节点[获取origin文件内容]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_03":
                //执行逻辑节点[提取元数据]
                executeDeaction03(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_03":
                //执行逻辑节点[实体打印]
                executeRawsfcode03(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_02":
                //执行逻辑节点[正则解析文档内容]
                executeRawsfcode02(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_01":
                //执行逻辑节点[准备参数]
                executePrepareparam01(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM_02":
                //执行逻辑节点[调试逻辑参数]
                executeDebugparam02(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_04":
                //执行逻辑节点[使用工具类解析]
                executeRawsfcode04(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[调整为待切片]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[更新文件类文档状态]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[拷贝变量]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
     * 执行逻辑节点[获取origin文件内容]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def _document = logic.param('document').getReal()
			// def _type = _default.get('type')
			// if (_type == 'file'){
			//     def iCloudOSSClient = sys.getSysUtilRuntime(net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime.class, false).getServiceClient("cloud-oss", net.ibizsys.central.cloud.core.cloudutil.client.ICloudOSSClient.class, true)
			//     def fileJson = _default.get("file")
			//     if (fileJson){
			//         def file = new groovy.json.JsonSlurper().parseText(fileJson)
			//         if (file.size() > 0){
			//             println("输出file"+file[0])
			//             def fileId = file[0].id
			//             def folder = file[0].folder
			//             def fileText = iCloudOSSClient.downloadText(folder, fileId)
			//             _default.set("parsed_content", fileText)
			//         }
			//     }
			// }
			_default.set("parsed_content", _document.get("original_content"))
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
     * 执行逻辑节点[提取元数据]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
			    net.ibizsys.central.cloud.core.security.IEmployeeContext lastEmployeeContext = net.ibizsys.central.cloud.core.security.EmployeeContext.getCurrent();
			    try {
			        net.ibizsys.central.cloud.core.security.EmployeeContext.setCurrent(sys.createSuperUserContext());
			        dstEntityRuntime.outputPrint(
			            dePrintCodeName,
			            bos,
			            keys,
			            null,
			            false
			        )
			    }
			    finally {
			        net.ibizsys.central.cloud.core.security.EmployeeContext.setCurrent(lastEmployeeContext);
			    }
			
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
			        
			        //移除Md格式中的图片与链接
			        if (rulesList.contains('remove_img_url')) {
			            // 移除Markdown图片格式：![alt](url)
			            parsed_content = parsed_content.replaceAll(/!\[([^\]]*)\]\(([^)]*)\)/, '')
			            // 移除Markdown链接格式：[text](url)
			            parsed_content = parsed_content.replaceAll(/\[([^\]]*)\]\(([^)]*)\)/, '')
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
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
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
     * 执行逻辑节点[使用工具类解析]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def parsed_content = _default.get('parsed_content')
			def parse_error =  _default.get('parse_error')?:""
			def custom_chunk = _default.get('custom_chunk')
			// 默认使用自定义规则
			def parser_config = _default.get('parser_config')
			if (custom_chunk == 0){
			    // 使用所属知识库默认规则
			    def knowledge_base_runtime = sys.dataentity('ai_knowledge_base')
			    def knowledge_base = knowledge_base_runtime.get(_default.get('kb_id'))
			    if (knowledge_base){
			        parser_config = knowledge_base.get('parser_config')
			    }
			}
			if (parsed_content && parser_config){
			    // 辅助函数：检测内容类型
			    def detectContentType = { content ->
			    if (!content || !(content instanceof String)) {
			        return null
			    }
			    try {
			        new groovy.json.JsonSlurper().parseText(content.trim())
			        return 'json'
			    } catch (ignore) {}
			    try {
			        new XmlSlurper(false, false).parseText(content.trim()) // 禁用DTD和命名空间简化验证
			        return 'xml'
			    } catch (ignore) {}
			    return null
			}
			
			    // 辅助函数：验证内容类型
			    def validateContentType = { content, expectedType ->
			    if (!content || !(content instanceof String) || !expectedType) {
			        return false
			    }
			    try {
			        if (expectedType == 'json') {
			            new groovy.json.JsonSlurper().parseText(content.trim())
			            return true
			        } else if (expectedType == 'xml') {
			            new XmlSlurper(false, false).parseText(content.trim())
			            return true
			        }
			    } catch (Exception e) {
			        return false
			    }
			    return false
			}
			
			    // 1、判断parsed_content类型为xml/json 
			    def contentType = detectContentType(parsed_content)
			    if (!contentType) {
			        parse_error = parse_error + "${parsed_content}不是有效JSON/XML"
			    }
			    // 2、进行文本预处理 
			    def pre_process_rules = parser_config.get('pre_process_rules')
			    if (pre_process_rules) {
			        def process_content = net.ibizsys.central.plugin.ai.util.TextPreprocessUtils.process(parsed_content,pre_process_rules)
			        // 3、判断预处理后文本是否符合原类型 
			        if (!validateContentType(process_content, contentType)) {
			            // 4、去掉文本预处理中可能干扰的选项，重新执行文本预处理 
			            // 定义针对结构化数据的高危规则（会破坏JSON/XML语法结构）
			            def dangerousRulesMap = [
			                'json': ['normalize_punctuation', 'remove_header_footer', 'remove_watermark'],
			                'xml':  ['remove_html_tags', 'remove_js_css', 'remove_header_footer', 'remove_watermark', 'normalize_punctuation']
			        ]
			
			            // 将逗号分隔的规则字符串转为规范列表（去空格、去空值）
			            def allRulesList = pre_process_rules.split(',').collect { it }.findAll { it }
			
			            // 获取当前内容类型对应的危险规则（小写匹配，增强健壮性）
			            def dangerousRules = (dangerousRulesMap[contentType] ?: []).collect { it.toLowerCase() }
			            def safeRulesList = allRulesList.findAll { rule -> !(rule.toLowerCase() in dangerousRules) }
			
			            // 仅当存在安全规则且与原规则不同时尝试修复
			            if (safeRulesList && safeRulesList.size() < allRulesList.size()) {
			                try {
			                    // 拼接为逗号分隔字符串（符合TextPreprocessUtils要求）
			                    def safeRulesStr = safeRulesList.join(',')
			                    def recoveredContent = net.ibizsys.central.plugin.ai.util.TextPreprocessUtils.process(parsed_content, safeRulesStr)
			
			                    if (validateContentType(recoveredContent, contentType)) {
			                        parsed_content = recoveredContent
			                        def fallbackMsg = "预处理成功：原始规则破坏${contentType}结构。移除高危规则[${dangerousRules.join(',')}]后成功解析"
			                        parse_error = parse_error + fallbackMsg
			
			                    }
			                } catch (Exception e) {
			                    def fallbackMsg = "预处理失败：原始规则破坏${contentType}结构。移除高危规则[${dangerousRules.join(',')}]后仍无效，保持原始内容"
			                    parse_error = parse_error + fallbackMsg
			                }
			            }
			
			        }else {
			            parsed_content = process_content
			        }
			    }
			    // 5、进行数据脱敏 
			    def data_masking_rules = parser_config.get('data_masking_rules')
			    if (data_masking_rules){
			        // 根据正则规则pattern对parsed_content进行替换
			        def pattern_replacement_map = [:]
			        data_masking_rules.each { rule ->
			            def pattern = rule?.get('pattern')
			            if (pattern) {
			                pattern_replacement_map[pattern] = rule?.get('replacement') ?: ''
			            }
			        }
			        if (!pattern_replacement_map.isEmpty()) {
			            parsed_content = net.ibizsys.central.plugin.ai.util.TextPreprocessUtils.process(parsed_content, pattern_replacement_map)
			        }
			    }
			    def masked_data = logic.param('masked_data').getReal()
			    masked_data.set("id", _default.get("id"))
			    masked_data.set("parsed_content", parsed_content)
			    masked_data.set("status", "3")
			    masked_data.set("parse_error", parse_error)
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

