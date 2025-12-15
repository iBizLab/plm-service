package cn.ibizlab.plm.wiki.space.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[SPACE]处理逻辑[获取关联的空间]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class GetReSpace extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(GetReSpace.class)

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
            case "RAWSQLCALL1":
                //执行逻辑节点[获取关联数据]
                executeRAWSQLCALL1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE1":
                //执行逻辑节点[执行脚本代码]
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
     * 执行逻辑节点[获取关联数据]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSQLCALL1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[执行脚本代码]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def page = logic.param('page').getReal()
			
			page.each { item ->
			    if (item.get('relation_type') == 'main_space') {
			        item.set('user_tag', '<?xml version="1.0" encoding="UTF-8"?><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" class="design-iconfont" width="20" height="20"><title>֪主知识库</title><path d="M17.5,15 L5,15 C4.53976667,15 4.16666667,15.3730833 4.16666667,15.8333333 C4.16666667,16.2935833 4.53976667,16.6666667 5,16.6666667 L17.5,16.6666667 L17.5,18.3333333 L5,18.3333333 C3.61929167,18.3333333 2.5,17.2140833 2.5,15.8333333 L2.5,3.33333333 C2.5,2.41285833 3.24619167,1.66666667 4.16666667,1.66666667 L17.5,1.66666667 L17.5,15 Z M13.3333333,7.5 L13.3333333,5.83333333 L6.66666667,5.83333333 L6.66666667,7.5 L13.3333333,7.5 Z" fill="orange" fill-rule="nonzero"></path></svg>')
			    } else {
			        item.set('user_tag', '<?xml version="1.0" encoding="UTF-8"?><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" class="design-iconfont" width="20" height="20"><title>֪知识库</title><path d="M17.5,15 L5,15 C4.53976667,15 4.16666667,15.3730833 4.16666667,15.8333333 C4.16666667,16.2935833 4.53976667,16.6666667 5,16.6666667 L17.5,16.6666667 L17.5,18.3333333 L5,18.3333333 C3.61929167,18.3333333 2.5,17.2140833 2.5,15.8333333 L2.5,3.33333333 C2.5,2.41285833 3.24619167,1.66666667 4.16666667,1.66666667 L17.5,1.66666667 L17.5,15 Z M13.3333333,7.5 L13.3333333,5.83333333 L6.66666667,5.83333333 L6.66666667,7.5 L13.3333333,7.5 Z" fill="#56ABFB" fill-rule="nonzero"></path></svg>')
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
     * 执行逻辑节点[结束]，逻辑类型[END]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeEND1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

