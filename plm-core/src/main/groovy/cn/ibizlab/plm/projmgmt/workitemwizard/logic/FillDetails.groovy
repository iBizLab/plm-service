package cn.ibizlab.plm.projmgmt.workitemwizard.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[WORK_ITEM_WIZARD]处理逻辑[填充操作明细属性]运行时对象
 * 此代码用户功能扩展代码
 *
 * 变更工作项类型前，填充操作明细属性
 */
class FillDetails extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(FillDetails.class)

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
                //执行逻辑节点[准备查询过滤器参数]
                executePREPAREPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET1":
                //执行逻辑节点[获取工作项集合]
                executeDEDATASET1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE1":
                //执行逻辑节点[封装属性]
                executeRAWSFCODE1(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[准备查询过滤器参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取工作项集合]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[封装属性]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('default').getReal()
			def project_id = _default.get('project_id')
			def project_runtime = sys.dataentity('project')
			def entity_runtime = sys.dataentity('work_item_wizard_detail')
			def work_item_runtime = sys.dataentity('work_item')
			def work_item_type_runtime = sys.dataentity('work_item_type')
			def project = project_runtime.get(project_id);
			def details = entity_runtime.list()
			def work_items = logic.param('work_items').getReal()
			def influence_ids = ''
			
			work_items.each { item ->
			    if(influence_ids != ''){
			        influence_ids = influence_ids + ',' + item.get('id')
			    } else {
			        influence_ids = item.get('id')
			    }
			    def work_item_wizard_detail = sys.entity('work_item_wizard_detail')
			    work_item_wizard_detail.set('origin_type', item.get('work_item_type_id'))
			    def work_item_type_filter = work_item_type_runtime.filter()
			    work_item_type_filter.eq('project_type', project.get('type'))
			    work_item_type_filter.ne('id', item.get('work_item_type_id'))
			    def choose_types = work_item_type_filter.select('')
			    if(choose_types.size() > 0){
			        work_item_wizard_detail.set('target_type', choose_types.get(0).get('id'))
			    }
			    work_item_wizard_detail.set('id', item.get('id'))
			    work_item_wizard_detail.set('wizard_id', _default.get('id'))
			    work_item_wizard_detail.set('origin_state', item.get('state'))
			    work_item_wizard_detail.set('target_state', '10')
			    work_item_wizard_detail.set('project_id', item.get('project_id'))
			    work_item_wizard_detail.set('title', item.get('title'))
			    work_item_wizard_detail.set('assignee_name', item.get('assignee_name'))
			    work_item_wizard_detail.set('priority', item.get('priority'))
			    work_item_wizard_detail.set('influence', 1)
			    // 子工作项
			    def child_filter = sys.filter('work_item')
			    child_filter.eq('pid', item.get('id'))
			    def childs = child_filter.select('')
			    work_item_wizard_detail.set('influence_childs', 0)
			    if(childs.size() > 0){
			        work_item_wizard_detail.set('influence_childs', childs.size())
			        def child_work_item_types = work_item_runtime.list()
			        def childItems = childs.groupBy { it.get('work_item_type_id') }
			        childItems.each { work_item_type_id, itemList ->
			            def child_work_item = sys.entity('work_item')
			            def influence_child_ids = ''
			            child_work_item.set('child_work_item_type', work_item_type_id)
			            itemList.each { it ->
			                if(influence_child_ids != ''){
			                    influence_child_ids = influence_child_ids + ',' + it.get('id')
			                } else {
			                    influence_child_ids = it.get('id')
			                }
			            }
			            child_work_item.set('influence_child_ids', influence_child_ids)
			            child_work_item.set('parent_title', work_item_wizard_detail.get('title'))
			            child_work_item.set('influence', itemList.size())
			            child_work_item.set('id', work_item_type_id)
			            child_work_item.set('parent_origin_type', item.get('work_item_type_id'))
			            child_work_item_types.add(child_work_item)
			        }
			        work_item_wizard_detail.set('child_work_item_types', child_work_item_types)
			    }
			    details.add(work_item_wizard_detail)
			}
			_default.set('details', details)
			_default.set('influence_ids', influence_ids)
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
    private void executeEND1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

