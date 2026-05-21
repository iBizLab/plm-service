package cn.ibizlab.plm.ai.aikbchunk.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[AI_KB_CHUNK]处理逻辑[检索测试]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class RetrievalTest extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(RetrievalTest.class)

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
                //执行逻辑节点[检索测试]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "BINDPARAM_01":
                //执行逻辑节点[绑定参数]
                executeBindparam01(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[检索测试]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def query = _default.get('query')
			def kb_id = _default.get('kb_id')
			if (query && kb_id){
			    def _params = [:]
			    def n_rerank_eq = (_default.get('n_rerank_eq') as Integer) ?: 0
			    def similarity_threshold = (_default.get("similarity_threshold") as BigDecimal) ?: 0
			    def keyword_similarity_weight = (_default.get("keyword_similarity_weight") as BigDecimal) ?: 0
			    def n_vector_similarity_gtandeq = 1 - keyword_similarity_weight
			    def top_k = (_default.get("top_k") as Integer) ?: 0
			    def cross_languages = _default.get("cross_languages") ?: ""
			    def use_kg = (_default.get("use_kg") as Boolean) ?: false
			    def n_pageindex_eq = (_default.get('n_pageindex_eq') as Integer) ?: 0
			    _params.put('size', top_k)
			    _params.put('query', query)
			    _params.put('n_rerank_eq', n_rerank_eq)
			    _params.put('n_similarity_gtandeq', similarity_threshold)
			    _params.put('n_vector_similarity_gtandeq', n_vector_similarity_gtandeq)
			    _params.put('top_k', top_k)
			    _params.put('cross_languages', cross_languages)
			    _params.put('use_kg', use_kg)
			    _params.put('n_pageindex_eq', n_pageindex_eq)
			    def iSysKnowledgeBaseUtilRuntime = sys.getSysUtilRuntime(net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.class, false)
			    def _page = iSysKnowledgeBaseUtilRuntime.fetchChunks(kb_id, _params)
			    if (_page){
			        def _content = _page.getContent()
			        if (_content){
			            def nodeMap = [:]
			            def roots = []
			            // 1. 遍历平铺数据，构建节点映射表
			            for (node in _content) {
			                def id = node.id
			                def pid = node.pid
			                if (!id) continue
			                // 复制原始节点数据并添加children字段
			                def newNode = [:]
			                newNode.putAll(node.any())
			                newNode.children = []
			                newNode.has_children = 0
			                nodeMap[id] = newNode
			            }
			            // 2. 构建父子关系
			            for (id in nodeMap.keySet()) {
			                def node = nodeMap[id]
			                def pid = node.pid?.toString()
			
			                // 判断是否为根节点（父ID为空）
			                if (!pid || pid == "") {
			                    roots.add(node)
			                } else {
			                    // 将当前节点添加到父节点的子节点列表
			                    def parentNode = nodeMap[pid]
			                    if (parentNode) {
			                        parentNode.children.add(node)
			                        parentNode.has_children = 1
			                    } else {
			                        // 父节点不存在，视为新根节点
			                        roots.add(node)
			                    }
			                }
			            }
			            // 3. 设置结果（返回树形结构）
			            _default.set('result', roots)
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
     * 执行逻辑节点[绑定参数]，逻辑类型[BINDPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeBindparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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

