package cn.ibizlab.plm.ai.aikbdocumentsync.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[AI_KB_DOCUMENT_SYNC]处理逻辑[空间文档解析处理]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class SpaceParse extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(SpaceParse.class)

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
            case "PREPAREPARAM_02":
                //执行逻辑节点[准备文档参数]
                executePrepareparam02(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_01":
                //执行逻辑节点[获取文档同步数据]
                executeDeaction01(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_01":
                //执行逻辑节点[准备空间参数]
                executePrepareparam01(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET_01":
                //执行逻辑节点[查询空间启用的页面]
                executeDedataset01(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET_02":
                //执行逻辑节点[查询已同步页面]
                executeDedataset02(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET_03":
                //执行逻辑节点[查询最新空间文档]
                executeDedataset03(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_01":
                //执行逻辑节点[处理未同步页面]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_02":
                //执行逻辑节点[清理冗余的doc]
                executeRawsfcode02(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL_02":
                //执行逻辑节点[解析空间下文档]
                executeLoopsubcall02(iDELogicSession, iPSDELogicNode)
                break
            case "END_01":
                //执行逻辑节点[结束]
                executeEnd01(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_03":
                //执行逻辑节点[解析文档]
                executeDeaction03(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[准备文档参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取文档同步数据]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备空间参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[查询空间启用的页面]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDedataset01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[查询已同步页面]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDedataset02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[查询最新空间文档]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDedataset03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[处理未同步页面]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _all_pages = logic.param('all_pages')?.getReal() ?: []
			def _docs = logic.param('docs')?.getReal() ?: []
			def _doc_sync = logic.param('doc_sync')?.getReal() ?: []
			def doc_pageids_in_space = (_docs?.collect { it?.source_id }?.findAll { it != null } ?: []) as Set
			def doc_runtime = sys.dataentity('ai_kb_document')
			
			println "已有pageId: $doc_pageids_in_space"  
			
			def pages_without_doc = _all_pages.findAll { !doc_pageids_in_space.contains(it.id)}
			
			println "未存在pageId: ${pages_without_doc*.id}"  
			
			pages_without_doc.each { page ->
			    println "页面ID: ${page.id}, 页面: ${page.name}"
			    def new_doc = doc_runtime.entity()
			    new_doc.set('custom_chunk',0)
			    new_doc.set('source_id',page.id)
			    new_doc.set('name',page.name)
			    new_doc.set('sync_frequency',_doc_sync.sync_frequency)
			    new_doc.set('status',0)
			    new_doc.set('sync_id',_doc_sync.id)
			    new_doc.set('type','space')
			    new_doc.set('source_type','page')
			    new_doc.set('kb_id',_doc_sync.ai_knowledge_base_id)
			    doc_runtime.create(new_doc)
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
     * 执行逻辑节点[清理冗余的doc]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _all_pages = logic.param('all_pages')?.getReal() ?: []
			def _docs = logic.param('docs')?.getReal() ?: []
			def all_pages_in_space = _all_pages*.id.toSet()
			def no_exist_pages_doc = _docs.findAll { !all_pages_in_space.contains(it.source_id) }
			println "已删除page的doc: ${no_exist_pages_doc*.source_id}"  
			
			if(no_exist_pages_doc){
			    def doc_runtime = sys.dataentity('ai_kb_document')
			    no_exist_pages_doc.each { doc ->
			        doc_runtime.remove(doc)
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
     * 执行逻辑节点[解析空间下文档]，逻辑类型[LOOPSUBCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeLoopsubcall02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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

    /**
     * 执行逻辑节点[解析文档]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

