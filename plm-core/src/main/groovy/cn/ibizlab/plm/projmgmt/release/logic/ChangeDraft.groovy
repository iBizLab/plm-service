package cn.ibizlab.plm.projmgmt.release.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[RELEASE]处理逻辑[获取修改阶段]运行时对象
 * 此代码用户功能扩展代码
 *
 * 获取修改阶段
 */
class ChangeDraft extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(ChangeDraft.class)

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
                //执行逻辑节点[设置阶段查询过滤器参数]
                executePREPAREPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET1":
                //执行逻辑节点[获取阶段列表]
                executeDEDATASET1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE2":
                //执行逻辑节点[返回结果]
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
     * 执行逻辑节点[设置阶段查询过滤器参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取阶段列表]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[返回结果]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def first_stage = logic.param('first_stage').getReal()
			def last_stage = logic.param('last_stage').getReal()
			def current_stage = logic.param('current_stage').getReal()
			def target_stage = logic.param('target_stage').getReal()
			def stages = logic.param('stages').getReal()
			def stage_transitions = logic.param('stage_transitions').getReal()
			
			def current = _default.get('current_stage')
			def target = _default.get('target_stage')
			first_stage = stages.min { it.get('p_sequence') }
			last_stage = stages.max { it.get('p_sequence') }
			stages.each { it ->
			    if(it.get('id') == current){
			        it.set('current', 1)
			        current_stage = it
			    }
			    if(it.get('id') == target){
			        it.set('target', 1)
			        target_stage = it
			    }
			}
			
			// 向后变动阶段
			if(target_stage.get('p_sequence') > current_stage.get('p_sequence')){
			    target_stage.set('date_gt', current_stage.get('operated_time'))
			    // 若当前阶段未存在操作时间，目标阶段时间需大于首阶段时间
			    if(current_stage.get('operated_time') == null){
			        target_stage.set('date_gt', first_stage.get('operated_time'))
			    }
			    if(target_stage.get('id') != last_stage.get('id')){
			        target_stage.set('date_lt', last_stage.get('operated_time'))
			    }
			}
			// 向前变动阶段
			if(target_stage.get('p_sequence') < current_stage.get('p_sequence')){
			    target_stage.set('date_lt', last_stage.get('operated_time'))
			    if(target_stage.get('id') != first_stage.get('id')){
			        target_stage.set('date_gt', first_stage.get('operated_time'))
			    }
			}
			stage_transitions.add(current_stage)
			stage_transitions.add(target_stage)
			_default.set('stage_transitions', stage_transitions)
			
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

