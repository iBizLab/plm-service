package cn.ibizlab.plm.ai.aikbdocumentwizard.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[AI_KB_DOCUMENT_WIZARD]处理逻辑[创建知识库文档]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class CreateAiKbDoc extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(CreateAiKbDoc.class)

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
                //执行逻辑节点[创建知识库文档]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[创建知识库文档]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('default').getReal(); 
			def doc_runtime = sys.dataentity('ai_kb_document')
			def doc_sync_runtime = sys.dataentity('ai_kb_document_sync')
			def page_list = sys.codelist('Wiki__page_list')
			def space_list = sys.codelist('Wiki__space_list')
			
			def import_method=_default["import_method"];
			def kb_id=_default["kb_id"]
			def space_selection=_default["space_selection"]
			def sync_frequency=_default["sync_frequency"]
			def parser_config=_default["parser_config"]
			def custom_chunk=_default["custom_chunk"]
			def chunk_method=_default["chunk_method"]
			
			//手动从空间导入
			if(import_method == "space_manual"){
			    def selection_page_ids=_default["selection_page_ids"]
			    if(selection_page_ids){
			        //创建文档
			        selection_page_ids.split(',').each { String page_id ->
			            def new_doc=doc_runtime.entity()
			            def  page_name=page_list.getText(page_id)  
			            new_doc.set("name",page_name)
			            new_doc.set("source_id",page_id)
			            new_doc.set("source_type","page")
			            new_doc.set("sync_frequency",sync_frequency)
			            new_doc.set("parser_config",parser_config)
			            new_doc.set("type","space")
			            new_doc.set("custom_chunk",custom_chunk)
			            new_doc.set("chunk_method",chunk_method)
			            new_doc.set("active",1)
			            new_doc.set("kb_id",kb_id)
			            new_doc.set("status",0)
			            doc_runtime.create(new_doc)
			        }
			    }
			}
			
			//自动从空间同步
			if(import_method == "space_auto_sync"){
			    //创建文档同步
			    def new_doc_sync=doc_sync_runtime.entity()
			    def  space_name=space_list.getText(space_selection)  
			    new_doc_sync.set("name",space_name)
			    new_doc_sync.set("ai_knowledge_base_id",kb_id)
			    new_doc_sync.set("source_id",space_selection)
			    new_doc_sync.set("source_type","space")
			    new_doc_sync.set("sync_frequency",sync_frequency)
			    new_doc_sync.set("parser_config",parser_config)
			    new_doc_sync.set("custom_chunk",custom_chunk)
			    new_doc_sync.set("chunk_method",chunk_method)
			    doc_sync_runtime.create(new_doc_sync)
			}
			
			//上传本地文件
			if(import_method == "local_upload"){
			    def selection_file_ids=_default["selection_file_ids"]
			    if(selection_file_ids){
			        //创建文档
			        def files = new groovy.json.JsonSlurper().parseText(selection_file_ids)
			        files.each { file ->
			            def new_doc=doc_runtime.entity()
			            def file_name = file.name
			            int last_index = file.name.lastIndexOf(".")
			            if (last_index > 0) {
			                file_name = file.name.substring(0, last_index)
			            }
			            new_doc.set("name",file_name)
			            new_doc.set("source_id",file.id)
			            new_doc.set("source_type","page")
			            new_doc.set("parser_config",parser_config)
			            new_doc.set("type","file")
			            new_doc.set("custom_chunk",custom_chunk)
			            new_doc.set("chunk_method",chunk_method)
			            new_doc.set("active",1)
			            new_doc.set("kb_id",kb_id)
			            new_doc.set("status",0)
			            doc_runtime.create(new_doc)
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
     * 执行逻辑节点[结束]，逻辑类型[END]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeEnd01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

