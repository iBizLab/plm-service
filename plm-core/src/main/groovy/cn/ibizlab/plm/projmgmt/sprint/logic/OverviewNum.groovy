package cn.ibizlab.plm.projmgmt.sprint.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[SPRINT]处理逻辑[获取概览基本信息统计数字]运行时对象
 * 此代码用户功能扩展代码
 *
 * 获取概览基本信息统计数字
 */
class OverviewNum extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(OverviewNum.class)

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
            case "DEACTION1":
                //执行逻辑节点[获取迭代信息]
                executeDEACTION1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE1":
                //执行逻辑节点[计算迭代结束日期距离今天的天数]
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
     * 执行逻辑节点[获取迭代信息]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[计算迭代结束日期距离今天的天数]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('default').getReal()
			def daysDifference = 0
			if(_default.get('end_at') != null){
			    // 将 java.sql.Timestamp 转换为 java.time.LocalDateTime
			    java.time.LocalDateTime endDateTime = _default.get('end_at').toLocalDateTime();
			    java.time.LocalDateTime startDateTime = _default.get('start_at').toLocalDateTime();
			
			     // 获取当前时间的 java.time.LocalDateTime 对象
			    def currentDateTime = java.time.LocalDateTime.now()
			    // 将 LocalDateTime 转换为 LocalDate
			    def endDate = endDateTime.toLocalDate()
			    def startDate = startDateTime.toLocalDate()
			    def currentDate = currentDateTime.toLocalDate()
			    // 计算结束日期与今天的天数差
			    def enddaysDifference = endDate.toEpochDay() - currentDate.toEpochDay()
			    // 计算开始日期与今天的天数差
			    def startdaysDifference = currentDate.toEpochDay() - startDate.toEpochDay()
			    // 计算开始日期与结束日期的天数差
			    def betweenDifference = endDate.toEpochDay() - startDate.toEpochDay()
			    if(enddaysDifference < 0){
			        enddaysDifference = 0
			    }
			    if(startdaysDifference < 0){
			        startdaysDifference = 0
			    }
			    if(betweenDifference == 0){
			        betweenDifference = 1
			    }
			    if(enddaysDifference == 0){
			        // 日期已过比例
			        _default.set("past_days", 1)
			    } else {
			        if(startdaysDifference > 0 && betweenDifference > 0){
			            _default.set("past_days", startdaysDifference / betweenDifference)
			        }
			    }
			    // 剩余天数
			    _default.set("remaining_days", enddaysDifference)
			}
			def total_num = _default.get('all_work_items')
			def completed_num = _default.get('completed_work_items')
			def work_item_counts = completed_num + '/' + total_num
			_default.set('work_item_counts', work_item_counts)
			if(completed_num == 0 || total_num == 0){
			    // 工作项完成率
			    _default.set('work_item_complete_percent', 0)
			} else {
			    _default.set('work_item_complete_percent', completed_num / total_num)
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
    private void executeEND1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

