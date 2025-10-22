package cn.ibizlab.plm.testmgmt.reviewcontent.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[REVIEW_CONTENT]处理逻辑[提交评审]运行时对象
 * 此代码用户功能扩展代码
 *
 * 测试
 */
class SubmitReview extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(SubmitReview.class)

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
                //执行逻辑节点[通知第一评审人（需求）]
                executeDENOTIFY1(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION4":
                //执行逻辑节点[获取评审详情]
                executeDEACTION4(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE1":
                //执行逻辑节点[设置提交时间]
                executeRAWSFCODE1(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM3":
                //执行逻辑节点[调试逻辑参数]
                executeDEBUGPARAM3(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM1":
                //执行逻辑节点[设置提交人、状态]
                executePREPAREPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM3":
                //执行逻辑节点[设置关系过滤器参数]
                executePREPAREPARAM3(iDELogicSession, iPSDELogicNode)
                break
            case "DENOTIFY3":
                //执行逻辑节点[通知第一评审人（项目工作项）]
                executeDENOTIFY3(iDELogicSession, iPSDELogicNode)
                break
            case "BINDPARAM1":
                //执行逻辑节点[绑定参数]
                executeBINDPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET1":
                //执行逻辑节点[获取关系数据集]
                executeDEDATASET1(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM2":
                //执行逻辑节点[设置阶段的状态]
                executePREPAREPARAM2(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM6":
                //执行逻辑节点[获取评审ID]
                executePREPAREPARAM6(iDELogicSession, iPSDELogicNode)
                break
            case "DENOTIFY4":
                //执行逻辑节点[通知第一评审人（空间页面）]
                executeDENOTIFY4(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM2":
                //执行逻辑节点[调试逻辑参数]
                executeDEBUGPARAM2(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL2":
                //执行逻辑节点[循环子调用]
                executeLOOPSUBCALL2(iDELogicSession, iPSDELogicNode)
                break
            case "DENOTIFY2":
                //执行逻辑节点[通知第一评审人（测试用例）]
                executeDENOTIFY2(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION1":
                //执行逻辑节点[更新评审]
                executeDEACTION1(iDELogicSession, iPSDELogicNode)
                break
            case "THROWEXCEPTION1":
                //执行逻辑节点[评审内容为空]
                executeTHROWEXCEPTION1(iDELogicSession, iPSDELogicNode)
                break
            case "END1":
                //执行逻辑节点[结束]
                executeEND1(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM9":
                //执行逻辑节点[准备参数]
                executePREPAREPARAM9(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL1":
                //执行逻辑节点[循环子调用]
                executeLOOPSUBCALL1(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM1":
                //执行逻辑节点[调试逻辑参数]
                executeDEBUGPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM12":
                //执行逻辑节点[获取页面ID]
                executePREPAREPARAM12(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM10":
                //执行逻辑节点[获取工作项ID]
                executePREPAREPARAM10(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM7":
                //执行逻辑节点[获取需求ID]
                executePREPAREPARAM7(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM4":
                //执行逻辑节点[获取测试用例ID]
                executePREPAREPARAM4(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION9":
                //执行逻辑节点[获取空间页面详情]
                executeDEACTION9(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION7":
                //执行逻辑节点[获取项目工作项详情]
                executeDEACTION7(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION5":
                //执行逻辑节点[获取产品需求详情]
                executeDEACTION5(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION2":
                //执行逻辑节点[获取测试用例详情]
                executeDEACTION2(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM13":
                //执行逻辑节点[设置空间页面评审状态]
                executePREPAREPARAM13(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM11":
                //执行逻辑节点[设置项目工作项评审状态]
                executePREPAREPARAM11(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM8":
                //执行逻辑节点[设置产品需求评审状态]
                executePREPAREPARAM8(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM5":
                //执行逻辑节点[设置测试用例评审状态]
                executePREPAREPARAM5(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION10":
                //执行逻辑节点[更新空间页面]
                executeDEACTION10(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION8":
                //执行逻辑节点[更新项目工作项]
                executeDEACTION8(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION6":
                //执行逻辑节点[更新产品需求]
                executeDEACTION6(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION3":
                //执行逻辑节点[更新测试用例]
                executeDEACTION3(iDELogicSession, iPSDELogicNode)
                break
            case "RESETPARAM4":
                //执行逻辑节点[重置空间页面参数]
                executeRESETPARAM4(iDELogicSession, iPSDELogicNode)
                break
            case "RESETPARAM3":
                //执行逻辑节点[重置项目工作项参数]
                executeRESETPARAM3(iDELogicSession, iPSDELogicNode)
                break
            case "RESETPARAM2":
                //执行逻辑节点[重置产品需求参数]
                executeRESETPARAM2(iDELogicSession, iPSDELogicNode)
                break
            case "RESETPARAM1":
                //执行逻辑节点[重置测试用例参数]
                executeRESETPARAM1(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[通知第一评审人（需求）]，逻辑类型[DENOTIFY]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDENOTIFY1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取评审详情]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION4(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置提交时间]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[调试逻辑参数]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEBUGPARAM3(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置提交人、状态]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置关系过滤器参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM3(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[通知第一评审人（项目工作项）]，逻辑类型[DENOTIFY]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDENOTIFY3(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[绑定参数]，逻辑类型[BINDPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeBINDPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取关系数据集]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置阶段的状态]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取评审ID]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM6(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[通知第一评审人（空间页面）]，逻辑类型[DENOTIFY]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDENOTIFY4(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[调试逻辑参数]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEBUGPARAM2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[循环子调用]，逻辑类型[LOOPSUBCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeLOOPSUBCALL2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[通知第一评审人（测试用例）]，逻辑类型[DENOTIFY]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDENOTIFY2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[更新评审]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[评审内容为空]，逻辑类型[THROWEXCEPTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeTHROWEXCEPTION1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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

    /**
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM9(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
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
     * 执行逻辑节点[调试逻辑参数]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEBUGPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取页面ID]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM12(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取工作项ID]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM10(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取需求ID]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM7(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取测试用例ID]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM4(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取空间页面详情]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION9(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取项目工作项详情]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION7(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取产品需求详情]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION5(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取测试用例详情]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置空间页面评审状态]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM13(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置项目工作项评审状态]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM11(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置产品需求评审状态]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM8(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置测试用例评审状态]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM5(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[更新空间页面]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION10(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[更新项目工作项]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION8(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[更新产品需求]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION6(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[更新测试用例]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION3(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[重置空间页面参数]，逻辑类型[RESETPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRESETPARAM4(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[重置项目工作项参数]，逻辑类型[RESETPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRESETPARAM3(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[重置产品需求参数]，逻辑类型[RESETPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRESETPARAM2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[重置测试用例参数]，逻辑类型[RESETPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRESETPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

