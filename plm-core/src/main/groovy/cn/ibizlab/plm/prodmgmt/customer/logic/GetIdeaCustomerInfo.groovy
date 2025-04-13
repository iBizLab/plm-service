package cn.ibizlab.plm.prodmgmt.customer.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[CUSTOMER]处理逻辑[获取需求中客户信息]运行时对象
 * 此代码用户功能扩展代码
 *
 * 获取需求中客户信息
 */
class GetIdeaCustomerInfo extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(GetIdeaCustomerInfo.class)

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
            case "END1":
                //执行逻辑节点[结束]
                executeEND1(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM1":
                //执行逻辑节点[设置过滤器]
                executePREPAREPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET1":
                //执行逻辑节点[获取需求关联的客户]
                executeDEDATASET1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE1":
                //执行逻辑节点[计算分数]
                executeRAWSFCODE1(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[结束]，逻辑类型[END]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeEND1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置过滤器]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取需求关联的客户]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[计算分数]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def list = logic.param("relation_page").getReal().content
			def result = logic.param("result").getReal()
			def score = 0
			def customer_num = list.size()
			def very_important = 0
			def very_important_precent = 0
			def important = 0
			def important_precent = 0
			def normal = 0
			def normal_precent = 0
			def unknown = 0
			def unknown_precent = 0
			def not_important = 0
			def not_important_precent = 0
			def score_precent = 0
			
			list.each{ item -> 
			    sys.info('level', item.get("level"))
			    switch(item.get("level")) {
			        case '10':
			            score += 3
			            very_important++
			            break
			        case '20':
			            score += 2
			            important++
			            break
			        case '30':
			            score += 1
			            normal++
			            break
			        case '40':
			            score += 0
			            not_important++
			            break
			        case '50':
			            score += 1
			            unknown++
			            break
			        default:
			            score += 0;
			    }
			}
			
			if (customer_num != 0) {
			    very_important_precent = very_important / customer_num
			    important_precent = important / customer_num
			    normal_precent = normal / customer_num
			    unknown_precent = unknown / customer_num
			    not_important_precent = not_important / customer_num
			    score_precent = score / (customer_num * 3)
			}
			
			result.set("score", score + "分")
			result.set("customer_num", customer_num)
			result.set("very_important", very_important)
			result.set("important", important)
			result.set("normal", normal)
			result.set("unknown", unknown)
			result.set("not_important", not_important)
			result.set("very_important_precent", very_important_precent)
			result.set("important_precent", important_precent)
			result.set("normal_precent", normal_precent)
			result.set("unknown_precent", unknown_precent)
			result.set("not_important_precent", not_important_precent)
			result.set("score_precent", score_precent)
        }.call(iDELogicSession.getDELogicRuntime().getSystemRuntime(), iDELogicSession.getDELogicRuntime())
        //设置返回值
        iDELogicSession.setLastReturn(objRet);
        if(iPSDELogicNode.getRetPSDELogicParam() != null) {
            def retDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicNode.getRetPSDELogicParam().getCodeName(), false);
            retDELogicParamRuntime.bind(iDELogicSession, objRet);
        }
        //super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

