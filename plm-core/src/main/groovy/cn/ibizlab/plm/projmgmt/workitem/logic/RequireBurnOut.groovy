package cn.ibizlab.plm.projmgmt.workitem.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[WORK_ITEM]处理逻辑[需求数量燃尽图]运行时对象
 * 此代码用户功能扩展代码
 *
 * 需求数量燃尽图
 */
class RequireBurnOut extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(RequireBurnOut.class)

    @Override
	protected void onInit() throws Exception {
		super.onInit()
	}

    @Override
    protected void onExecutePSDELogicNode(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        switch (iPSDELogicNode.getCodeName()) {
            case "BEGIN1":
                //执行逻辑节点[开始]
                executeBEGIN1(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM1":
                //执行逻辑节点[填充迭代标识]
                executePREPAREPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION1":
                //执行逻辑节点[获取迭代]
                executeDEACTION1(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET1":
                //执行逻辑节点[查询迭代变更记录]
                executeDEDATASET1(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET2":
                //执行逻辑节点[获取迭代下的已完成工作项]
                executeDEDATASET2(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE2":
                //执行逻辑节点[根据迭代日期，计算统计数量]
                executeRAWSFCODE2(iDELogicSession, iPSDELogicNode)
                break
            case "BINDPARAM1":
                //执行逻辑节点[绑定返回结果]
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
    private void executeBEGIN1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[填充迭代标识]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取迭代]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[查询迭代变更记录]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取迭代下的已完成工作项]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[根据迭代日期，计算统计数量]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def change_page = logic.param('change_page').getReal()
			def work_item_page = logic.param('work_item_page').getReal()
			def sprint = logic.param('sprint').getReal()
			def result_list = logic.param('result_list').getReal()
			
			
			def startDate = new Date(sprint.get('start_at').time)
			def endDate = new Date(sprint.get('end_at').time)
			
			def dateFormatter = new java.text.SimpleDateFormat("yyyy-MM-dd")
			def calendar = java.util.Calendar.getInstance()
			calendar.time = startDate
			// 从开始到结束的所有日期
			while (!calendar.time.after(endDate)) {
			    def rep_date = dateFormatter.format(calendar.time)
			    def rep_obj = sys.entity('work_item')    
			    rep_obj.set('rep_date', rep_date)
			    result_list.add(rep_obj)
			    calendar.add(java.util.Calendar.DATE, 1)
			}
			
			// 计算开始迭代时的移入工作项数量
			def begin_count = 0
			change_page.each { it ->
			    // 迭代未开始 移入的记录
			    if(it.get('type') == '1' && it.get('sprint_status') == '1'){
			        begin_count++
			    }
			    if(it.get('type') == '2' && it.get('sprint_status') == '1' ){
			        begin_count--
			    }
			}
			def rep_num = begin_count
			result_list.eachWithIndex { item, index ->
			    def rep_date = dateFormatter.format(new Date(item.get('rep_date').time))
			    if(begin_count > 0){
			        // 计算递减步长
			        def decrementStep = begin_count / (result_list.size() - 1)
			        // 理想线 根据日期 从开始日期 逐天递减
			        def rep_value1 =  begin_count - (decrementStep * index)        
			        def formattedValue = String.format('%.2f', rep_value1)
			        item.set('rep_value1', formattedValue)
			    } else {
			        item.set('rep_value1', 0)
			    }
			    if(index == 0){
			        item.set('rep_value1', begin_count)
			    }
			    item.set('rep_value2', rep_num)
			    work_item_page.each { it ->
			        if(it.get('completed_at') != null){
			            // 工作项完成时间
			            def completed_at = dateFormatter.format(new Date(it.get('completed_at').time))
			            if(completed_at == rep_date){
			                rep_num--
			                if(rep_num < 0){
			                    rep_num = 0
			                }
			                item.set('rep_value2', rep_num)
			            }  
			        }    
			    }
			    change_page.each { it ->
			        if(it.get('create_time') != null){
			           // 移入移出迭代时间
			            def change_date = dateFormatter.format(new Date(it.get('create_time').time))
			            if(change_date == rep_date){
			                // 迭代开始后 移入的记录
			                if(it.get('type') == '1' && it.get('sprint_status') == '2'){
			                    rep_num++
			                    item.set('rep_value2', rep_num)
			                }
			                if(it.get('type') == '2' && it.get('sprint_status') == '2'){
			                    rep_num--
			                    if(rep_num < 0){
			                        rep_num = 0
			                    }
			                    item.set('rep_value2', rep_num)
			                }
			            } 
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
     * 执行逻辑节点[绑定返回结果]，逻辑类型[BINDPARAM]
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

