package cn.ibizlab.plm.base.relation.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[RELATION]处理逻辑[工作项添加依赖]运行时对象
 * 此代码用户功能扩展代码
 *
 * 工作项添加依赖
 */
class AddDependency extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(AddDependency.class)

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
                //执行逻辑节点[绑定关联列表参数]
                executeBINDPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM1":
                //执行逻辑节点[准备前置依赖参数]
                executePREPAREPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE1":
                //执行逻辑节点[填充principal_id]
                executeRAWSFCODE1(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL1":
                //执行逻辑节点[循环子调用]
                executeLOOPSUBCALL1(iDELogicSession, iPSDELogicNode)
                break
            case "RENEWPARAM1":
                //执行逻辑节点[重新建立循环临时参数]
                executeRENEWPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION1":
                //执行逻辑节点[添加依赖]
                executeDEACTION1(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM2":
                //执行逻辑节点[准备后置依赖参数]
                executePREPAREPARAM2(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE2":
                //执行逻辑节点[填充target_id]
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
     * 执行逻辑节点[绑定关联列表参数]，逻辑类型[BINDPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeBINDPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备前置依赖参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[填充principal_id]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def for_temp_obj = logic.param('for_temp_obj').getReal()
			
			def dependency = logic.param('dependency').getReal()
			
			
			// PC端 target_id   mob端 使用id 
			if(for_temp_obj.get('id') != null){
			    dependency.set('principal_id', for_temp_obj.get('id'))
			}
			if(for_temp_obj.get('target_id') != null){
			    dependency.set('principal_id', for_temp_obj.get('target_id'))
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
     * 执行逻辑节点[循环子调用]，逻辑类型[LOOPSUBCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeLOOPSUBCALL1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[重新建立循环临时参数]，逻辑类型[RENEWPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRENEWPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[添加依赖]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备后置依赖参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[填充target_id]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def for_temp_obj = logic.param('for_temp_obj').getReal()
			
			def dependency = logic.param('dependency').getReal()
			
			
			// PC端 使用target_id   mob端 使用id 
			if(for_temp_obj.get('id') != null){
			    dependency.set('target_id', for_temp_obj.get('id'))
			}
			if(for_temp_obj.get('target_id') != null){
			    dependency.set('target_id', for_temp_obj.get('target_id'))
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

