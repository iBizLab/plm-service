package cn.ibizlab.plm.base.attention.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[ATTENTION]处理逻辑[添加关注后发送通知]运行时对象
 * 此代码用户功能扩展代码
 *
 * 添加关注人员后，触发提醒关注通知消息给关注人员
 */
class AfterCreateNotify extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(AfterCreateNotify.class)

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
            case "DENOTIFY1":
                //执行逻辑节点[提醒关注工作项通知]
                executeDENOTIFY1(iDELogicSession, iPSDELogicNode)
                break
            case "DENOTIFY2":
                //执行逻辑节点[提醒关注页面通知]
                executeDENOTIFY2(iDELogicSession, iPSDELogicNode)
                break
            case "DENOTIFY3":
                //执行逻辑节点[提醒关注产品需求通知]
                executeDENOTIFY3(iDELogicSession, iPSDELogicNode)
                break
            case "DENOTIFY4":
                //执行逻辑节点[提醒关注工单通知]
                executeDENOTIFY4(iDELogicSession, iPSDELogicNode)
                break
            case "DENOTIFY5":
                //执行逻辑节点[提醒关注客户通知]
                executeDENOTIFY5(iDELogicSession, iPSDELogicNode)
                break
            case "DENOTIFY6":
                //执行逻辑节点[提醒关注测试用例通知]
                executeDENOTIFY6(iDELogicSession, iPSDELogicNode)
                break
            case "DENOTIFY7":
                //执行逻辑节点[提醒关注执行用例通知]
                executeDENOTIFY7(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[提醒关注工作项通知]，逻辑类型[DENOTIFY]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDENOTIFY1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[提醒关注页面通知]，逻辑类型[DENOTIFY]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDENOTIFY2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[提醒关注产品需求通知]，逻辑类型[DENOTIFY]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDENOTIFY3(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[提醒关注工单通知]，逻辑类型[DENOTIFY]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDENOTIFY4(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[提醒关注客户通知]，逻辑类型[DENOTIFY]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDENOTIFY5(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[提醒关注测试用例通知]，逻辑类型[DENOTIFY]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDENOTIFY6(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[提醒关注执行用例通知]，逻辑类型[DENOTIFY]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDENOTIFY7(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

