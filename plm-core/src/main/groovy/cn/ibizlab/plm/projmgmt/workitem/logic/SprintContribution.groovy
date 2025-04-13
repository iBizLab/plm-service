package cn.ibizlab.plm.projmgmt.workitem.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[WORK_ITEM]处理逻辑[迭代成员贡献度]运行时对象
 * 此代码用户功能扩展代码
 *
 * 迭代成员贡献度
 */
class SprintContribution extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(SprintContribution.class)

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
            case "PREPAREPARAM1":
                //执行逻辑节点[准备工作项查询过滤器参数]
                executePREPAREPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET1":
                //执行逻辑节点[查询此迭代下的工作项]
                executeDEDATASET1(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL1":
                //执行逻辑节点[循环子调用]
                executeLOOPSUBCALL1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE1":
                //执行逻辑节点[计算统计数字]
                executeRAWSFCODE1(iDELogicSession, iPSDELogicNode)
                break
            case "BINDPARAM1":
                //执行逻辑节点[绑定工作项分页查询结果]
                executeBINDPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "END1":
                //执行逻辑节点[结束]
                executeEND1(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[准备工作项查询过滤器参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[查询此迭代下的工作项]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[循环子调用]，逻辑类型[LOOPSUBCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeLOOPSUBCALL1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[计算统计数字]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def for_obj = logic.param('for_obj').getReal()
			// 工作项类型统计
			def work_item_type = for_obj.get('work_item_type_id')
			// scrum_story scrum_task scrum_bug 用户故事/任务/缺陷 使用rep_value统计字段
			for_obj.set('rep_value1', 0)
			for_obj.set('rep_value2', 0)
			for_obj.set('rep_value3', 0)
			if(work_item_type == 'scrum_story'){
			    for_obj.set('rep_value1', 1)
			}
			if(work_item_type == 'scrum_task'){
			    for_obj.set('rep_value2', 1)
			}
			if(work_item_type == 'scrum_bug'){
			    for_obj.set('rep_value3', 1)
			}
			// 工作项工时统计
			if(for_obj.get('estimated_workload') == null ){
			    for_obj.set('estimated_workload', 0)
			}
			if(for_obj.get('actual_workload') == null ){
			    for_obj.set('actual_workload', 0)
			}
			// 统计结果列表变量
			def result_list = logic.param('result_list').getReal()
			def assignee_id = for_obj.get('assignee_id')
			if(assignee_id != null){
			    def exists = result_list.any { it.assignee_id == assignee_id }
			    if(exists){
			        result_list.each { item ->
			            if(item.get('assignee_id') == assignee_id){
			                item.set('rep_num', item.get('rep_num') + for_obj.get('rep_num'))
			                item.set('estimated_workload', item.get('estimated_workload') + for_obj.get('estimated_workload'))
			                item.set('actual_workload', item.get('actual_workload') + for_obj.get('actual_workload'))
			                item.set('rep_value1', item.get('rep_value1') + for_obj.get('rep_value1'))
			                item.set('rep_value2', item.get('rep_value2') + for_obj.get('rep_value2'))
			                item.set('rep_value3', item.get('rep_value3') + for_obj.get('rep_value3'))
			            }
			        }
			    } else {
			        result_list.add(for_obj)
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
     * 执行逻辑节点[绑定工作项分页查询结果]，逻辑类型[BINDPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeBINDPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[结束]，逻辑类型[END]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeEND1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

