package cn.ibizlab.plm.prodmgmt.idea.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[IDEA]处理逻辑[排期跟踪数据]运行时对象
 * 此代码用户功能扩展代码
 *
 * 返回该排期中所有的需求以及需求的关联数据
 */
class PlanTrackData extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(PlanTrackData.class)

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
            case "DEDATASET1":
                //执行逻辑节点[获取所有需求]
                executeDEDATASET1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE1":
                //执行逻辑节点[设置通用过滤器参数]
                executeRAWSFCODE1(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET2":
                //执行逻辑节点[获取关联需求]
                executeDEDATASET2(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET3":
                //执行逻辑节点[获取关联工作项]
                executeDEDATASET3(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET4":
                //执行逻辑节点[获取关联工单]
                executeDEDATASET4(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET5":
                //执行逻辑节点[获取关联测试用例]
                executeDEDATASET5(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE2":
                //执行逻辑节点[处理返回结果]
                executeRAWSFCODE2(iDELogicSession, iPSDELogicNode)
                break
            case "END":
                //执行逻辑节点[结束]
                executeEND(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[获取所有需求]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置通用过滤器参数]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def base_filter = logic.param('base_filter').getReal()
			String principal_id = _default.get("principal_id")
			base_filter.set("principal_id", "'" + principal_id + "'")
			base_filter.all()
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
     * 执行逻辑节点[获取关联需求]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取关联工作项]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET3(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取关联工单]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET4(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取关联测试用例]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET5(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[处理返回结果]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def page_ideas = logic.param('page_ideas').getReal()
			def relation_idea = logic.param('re_page_idea').getReal()
			def relation_work_item = logic.param('re_page_item').getReal()
			def relation_ticket = logic.param('re_page_ticket').getReal()
			def relation_test_case = logic.param('re_page_case').getReal()
			def result = logic.param('result').getReal()
			
			
			// 5. 主循环处理
			page_ideas.each { idea ->
			    String id = idea.get("id")
			
			    List<Object> relationIdeaList = new ArrayList<Object>()
			    List<Object> relationWorkItemList = new ArrayList<Object>()
			    List<Object> relationTicketList = new ArrayList<Object>()
			    List<Object> relationCaseList = new ArrayList<Object>()
			
			    relation_idea.each { it ->
			        String principal_id = it.get("principal_id")
			        if (principal_id.equals(id)) {
			            relationIdeaList.add(it)
			        }
			    }
			    relation_work_item.each { it ->
			        String principal_id = it.get("principal_id")
			        if (principal_id.equals(id)) {
			            relationWorkItemList.add(it)
			        }
			    }
			    relation_ticket.each { it ->
			        String principal_id = it.get("principal_id")
			        if (principal_id.equals(id)) {
			            relationTicketList.add(it)
			
			        }
			    }
			    relation_test_case.each { it ->
			        String principal_id = it.get("principal_id")
			        if (principal_id.equals(id)) {
			            relationCaseList.add(it)
			        }
			    }
			    def re_idea = sys.createEntity(null, false)
			    def re_item = sys.createEntity(null, false)
			    def re_ticket = sys.createEntity(null, false)
			    def re_case = sys.createEntity(null, false)
			
			    re_idea.set("content", relationIdeaList)
			    re_item.set("content", relationWorkItemList)
			    re_ticket.set("content", relationTicketList)
			    re_case.set("content", relationCaseList)
			
			    // 组装数据
			    idea.set("re_idea", re_idea)
			    idea.set("re_item", re_item)
			    idea.set("re_ticket", re_ticket)
			    idea.set("re_case", re_case)
			    idea.set("idea_sum", relationIdeaList.size())
			    idea.set("work_item_sum", relationWorkItemList.size())
			    idea.set("ticket_sum", relationTicketList.size())
			    idea.set("test_case_sum", relationCaseList.size())
			
			    // 添加到结果集
			    result.add(idea)
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
    private void executeEND(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

