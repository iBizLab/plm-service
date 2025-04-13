package cn.ibizlab.plm.projmgmt.release.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[RELEASE]处理逻辑[新建后附加逻辑]运行时对象
 * 此代码用户功能扩展代码
 *
 * 根据全局定义的阶段，生成发布阶段
 */
class AfterCreate extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(AfterCreate.class)

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
                //执行逻辑节点[获取全局发布阶段]
                executeDEDATASET1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL1":
                //执行逻辑节点[获取首发布阶段标识]
                executeRAWSQLCALL1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL2":
                //执行逻辑节点[获取末发布阶段标识]
                executeRAWSQLCALL2(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE1":
                //执行逻辑节点[根据全局预定义阶段生成发布阶段]
                executeRAWSFCODE1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL3":
                //执行逻辑节点[同步默认首阶段至初始阶段]
                executeRAWSQLCALL3(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[获取全局发布阶段]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取首发布阶段标识]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSQLCALL1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取末发布阶段标识]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSQLCALL2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[根据全局预定义阶段生成发布阶段]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def stages = logic.param('stages').getReal()
			def _default = logic.param('Default').getReal()
			def first_stage_id = _default.get('first_stage_id')
			def last_stage_id = _default.get('last_stage_id')
			//获取实体运行对象 参数实体名
			def stage_runtime = sys.dataentity('stage')
			def release_runtime = sys.dataentity('release')
			stages.each { it ->
			    //构造阶段对象
			    def new_stage = stage_runtime.entity()
			    new_stage.set('release_id', _default.get('id'))
			    new_stage.set('pid', it.get('id'))
			    new_stage.set('name', it.get('name'))
			    new_stage.set('type', it.get('type'))
			    new_stage.set('sequence', it.get('sequence'))
			    new_stage.set('color', it.get('color'))
			    new_stage.set('style', it.get('style'))
			    new_stage.set('is_current', 0)
			    if(it.get('id') == first_stage_id){
			        new_stage.set('is_current', 1)
			        new_stage.set('operated_time', _default.get('start_at'))
			    }
			    if(it.get('id') == last_stage_id){
			        new_stage.set('operated_time', _default.get('end_at'))
			    }
			    //新建发布
			    stage_runtime.create(new_stage)
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
     * 执行逻辑节点[同步默认首阶段至初始阶段]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSQLCALL3(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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

