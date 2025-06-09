package cn.ibizlab.plm.base.workload.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[WORKLOAD]处理逻辑[删除工时记录前附加逻辑]运行时对象
 * 此代码用户功能扩展代码
 *
 * 更新动态存储中的剩余工时
 */
class BeforeRemove extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(BeforeRemove.class)

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
                //执行逻辑节点[获取工时明细]
                executeDEACTION1(iDELogicSession, iPSDELogicNode)
                break
            case "BINDPARAM1":
                //执行逻辑节点[绑定预估工时]
                executeBINDPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL2":
                //执行逻辑节点[获取已登记工时]
                executeRAWSQLCALL2(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM7":
                //执行逻辑节点[预估工时]
                executePREPAREPARAM7(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET1":
                //执行逻辑节点[获取预估/实际工时]
                executeDEDATASET1(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM2":
                //执行逻辑节点[填充实际/预估/剩余工时]
                executePREPAREPARAM2(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE1":
                //执行逻辑节点[计算剩余工时]
                executeRAWSFCODE1(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM1":
                //执行逻辑节点[准备查询过滤器参数]
                executePREPAREPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM6":
                //执行逻辑节点[实际工时]
                executePREPAREPARAM6(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM4":
                //执行逻辑节点[设置工作项标识]
                executePREPAREPARAM4(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION3":
                //执行逻辑节点[更新实际/预估工时]
                executeDEACTION3(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION2":
                //执行逻辑节点[更新剩余工时]
                executeDEACTION2(iDELogicSession, iPSDELogicNode)
                break
            case "BINDPARAM3":
                //执行逻辑节点[绑定实际工时]
                executeBINDPARAM3(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION4":
                //执行逻辑节点[获取工作项]
                executeDEACTION4(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM3":
                //执行逻辑节点[置空实际工时]
                executePREPAREPARAM3(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM5":
                //执行逻辑节点[填充父工作项标识]
                executePREPAREPARAM5(iDELogicSession, iPSDELogicNode)
                break
            case "DELOGIC1":
                //执行逻辑节点[自动计算父工时]
                executeDELOGIC1(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[获取工时明细]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[绑定预估工时]，逻辑类型[BINDPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeBINDPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取已登记工时]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSQLCALL2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[预估工时]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM7(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取预估/实际工时]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[填充实际/预估/剩余工时]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[计算剩余工时]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
     * 执行逻辑节点[实际工时]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM6(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置工作项标识]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM4(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[更新实际/预估工时]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION3(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[更新剩余工时]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[绑定实际工时]，逻辑类型[BINDPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeBINDPARAM3(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取工作项]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION4(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[置空实际工时]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM3(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[填充父工作项标识]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM5(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[自动计算父工时]，逻辑类型[DELOGIC]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDELOGIC1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

