package cn.ibizlab.plm.projmgmt.workitem.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[WORK_ITEM]处理逻辑[工作项完成趋势]运行时对象
 * 此代码用户功能扩展代码
 *
 * 工作项完成趋势
 */
class CompleteTrend extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(CompleteTrend.class)

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
            case "RAWSQLCALL1":
                //执行逻辑节点[七天前创建且未完成的工作项数量]
                executeRAWSQLCALL1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL2":
                //执行逻辑节点[七天前完成的工作项数量]
                executeRAWSQLCALL2(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET1":
                //执行逻辑节点[获取七天内创建或完成的工作项]
                executeDEDATASET1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE1":
                //执行逻辑节点[统计七天内的完成/未完成数量]
                executeRAWSFCODE1(iDELogicSession, iPSDELogicNode)
                break
            case "BINDPARAM1":
                //执行逻辑节点[绑定返回统计结果]
                executeBINDPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "END1":
                //执行逻辑节点[绑定返回结果]
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
     * 执行逻辑节点[七天前创建且未完成的工作项数量]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSQLCALL1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[七天前完成的工作项数量]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSQLCALL2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取七天内创建或完成的工作项]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[统计七天内的完成/未完成数量]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def result_list = logic.param('result_list').getReal()
			def result_page = logic.param('result_page').getReal()
			def work_item = logic.param('work_item').getReal()
			
			// 七天前未完成数量
			def not_completed = work_item.get('seven_ago_not_completed')
			def completed = work_item.get('seven_ago_completed')
			
			def dateFormatter = new java.text.SimpleDateFormat("yyyy-MM-dd")
			def calendar = java.util.Calendar.getInstance()
			
			// 获取当前日期
			def endDate = calendar.time
			
			// 获取6天前的日期
			calendar.add(Calendar.DAY_OF_MONTH, -6)
			def startDate = calendar.time
			
			// 生成日期列表
			def datesInRange = []
			calendar.time = startDate // 重置日历到起始日期
			
			while (calendar.time <= endDate) {
			    def rep_date = dateFormatter.format(calendar.time)
			    def rep_obj = sys.entity('work_item')
			    rep_obj.set('rep_date', rep_date) 
			    result_list.add(rep_obj)
			    calendar.add(java.util.Calendar.DATE, 1)
			}
			result_list.each { it ->
			    def rep_date = dateFormatter.format(new Date(it.get('rep_date').time))
			    result_page.each { item ->
			        def state_type = item.get('state_type')
			        if(state_type != null){
			            if(state_type == 'completed' && item.get('completed_at') != null){
			                def completed_at = dateFormatter.format(new Date(item.get('completed_at').time))
			                if(completed_at == rep_date){
			                    completed++
			                    not_completed--
			                }   
			            } else if(state_type != 'completed' && item.get('create_time') != null){
			                def create_time = dateFormatter.format(new Date(item.get('create_time').time))
			                if(create_time == rep_date){
			                    not_completed++
			                }
			            }
			        }
			    }
			    it.set('rep_value1', not_completed)
			    it.set('rep_value2', completed)
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
     * 执行逻辑节点[绑定返回统计结果]，逻辑类型[BINDPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeBINDPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[绑定返回结果]，逻辑类型[END]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeEND1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

