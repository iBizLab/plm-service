package cn.ibizlab.plm.projmgmt.release.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[RELEASE]处理逻辑[修改发布当前阶段]运行时对象
 * 此代码用户功能扩展代码
 *
 * 修改发布当前阶段
 */
class ChangeStage extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(ChangeStage.class)

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
            case "BINDPARAM1":
                //执行逻辑节点[绑定发布阶段列表参数]
                executeBINDPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM1":
                //执行逻辑节点[设置发布更新对象的标识]
                executePREPAREPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM2":
                //执行逻辑节点[准备阶段查询参数]
                executePREPAREPARAM2(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET1":
                //执行逻辑节点[查询发布阶段]
                executeDEDATASET1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE2":
                //执行逻辑节点[修改发布当前阶段]
                executeRAWSFCODE2(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[绑定发布阶段列表参数]，逻辑类型[BINDPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeBINDPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置发布更新对象的标识]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备阶段查询参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[查询发布阶段]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[修改发布当前阶段]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def stage_transitions = logic.param('stage_transitions').getReal()
			def stages = logic.param('stages').getReal()
			def update_obj = logic.param('update_obj').getReal()
			
			def first_stage = logic.param('first_stage').getReal()
			def last_stage = logic.param('last_stage').getReal()
			def current_stage = logic.param('current_stage').getReal()
			def target_stage = logic.param('target_stage').getReal()
			
			first_stage = stages.min { it.get('p_sequence') }
			last_stage = stages.max { it.get('p_sequence') }
			//首阶段标识
			def first_stage_id = first_stage.get('id')
			//末阶段标识
			def last_stage_id = last_stage.get('id')
			//获取实体运行对象
			def stage_runtime = sys.dataentity('stage')
			def release_runtime = sys.dataentity('release')
			//循环处理
			stage_transitions.each { it ->
			    def stage_id = it.get('id')
			    if(it.get('target') == 1){
			        it.set('is_current', 1)
			        target_stage = it
			        if(first_stage_id != null){
			            if(first_stage_id == stage_id){
			                update_obj.set('start_at', it.get('operated_time'))
			            }
			        }
			        if(last_stage_id != null){
			            if(last_stage_id == stage_id){
			                update_obj.set('end_at', it.get('operated_time'))
			            }
			        }
			        update_obj.set('status', stage_id) 
			    }
			    if(it.get('current') == 1){
			        it.set('is_current', 0)
			        current_stage = it
			    }
			    //更新阶段
			    stage_runtime.update(it)
			}
			// 向前变动阶段时, 从当前阶段 -> 目标阶段 的中间阶段将操作时间置空
			if(target_stage.get('p_sequence') < current_stage.get('p_sequence')){
			    stages.each { it ->
			        if(it.get('p_sequence') > target_stage.get('p_sequence')){
			            // 构造阶段更新对象
			            def update_stage = stage_runtime.entity()
			            update_stage.set('id', it.get('id'))
			            if(current_stage.get('id') == last_stage_id){
			                if(it.get('p_sequence') < current_stage.get('p_sequence')){
			                    update_stage.set('operated_time', null)
			                    stage_runtime.update(update_stage)
			                }
			            } else {
			                if(it.get('p_sequence') <= current_stage.get('p_sequence')){
			                    update_stage.set('operated_time', null)
			                    stage_runtime.update(update_stage)
			                }
			            }
			        }
			    }
			}
			release_runtime.update(update_obj)
			
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

