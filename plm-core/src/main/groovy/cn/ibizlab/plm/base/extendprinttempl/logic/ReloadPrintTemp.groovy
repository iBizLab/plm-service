package cn.ibizlab.plm.base.extendprinttempl.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[EXTEND_PRINT_TEMPL]处理逻辑[重载动态打印模版]运行时对象
 * 此代码用户功能扩展代码
 *
 * 重载动态打印模版
 */
class ReloadPrintTemp extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(ReloadPrintTemp.class)

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
            case "RAWSFCODE_01":
                //执行逻辑节点[触发刷新信号]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[触发刷新信号]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def de_tag = _default.get("de_tag")
			if (de_tag != null){
			    def de_runtime = sys.dataentity(de_tag)
			    def fullUniqueTag = de_runtime.getFullUniqueTag().replace(".", "-").toLowerCase()
			    def system_id = sys.deploySystemId
			    //合成当前系统AI工厂reload信号标识
			    def reload_signal_prefix = "reloadsignal"
			    def reload_signal_id = "${reload_signal_prefix}-${system_id}-deprint-${fullUniqueTag}-dynamic_chat_resource"
			    println "发布动态聊天资源配置:${reload_signal_id}"
			    def config = [:]
			    config.reload_time = net.ibizsys.runtime.util.DateUtils.getCurTimeString()
			    //发布配置
			    net.ibizsys.central.cloud.core.spring.rt.ServiceHub.getInstance().publishConfig(reload_signal_id, config)
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
}

