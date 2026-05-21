package cn.ibizlab.plm.projmgmt.workitemtype.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[WORK_ITEM_TYPE]处理逻辑[准备默认扩展模型]运行时对象
 * 此代码用户功能扩展代码
 *
 * 给新建的工作项类型绑定默认模型
 */
class PrepareDefaultModel extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(PrepareDefaultModel.class)

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
            case "RAWSFCODE_04":
                //执行逻辑节点[构造默认主状态逻辑标识]
                executeRawsfcode04(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_01":
                //执行逻辑节点[构造默认表单id]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_02":
                //执行逻辑节点[获取默认任务主视图表单]
                executeDeaction02(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_01":
                //执行逻辑节点[获取默认任务新建表单]
                executeDeaction01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_02":
                //执行逻辑节点[准备主视图表单参数]
                executeRawsfcode02(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_07":
                //执行逻辑节点[获取默认任务主状态逻辑]
                executeDeaction07(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_03":
                //执行逻辑节点[准备新建表单的参数]
                executeRawsfcode03(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_05":
                //执行逻辑节点[准备主状态逻辑参数]
                executeRawsfcode05(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_03":
                //执行逻辑节点[创建新建表单]
                executeDeaction03(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_05":
                //执行逻辑节点[创建主视图表单]
                executeDeaction05(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_08":
                //执行逻辑节点[创建主状态逻辑]
                executeDeaction08(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_04":
                //执行逻辑节点[应用新建表单]
                executeDeaction04(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_06":
                //执行逻辑节点[应用主视图表单]
                executeDeaction06(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_09":
                //执行逻辑节点[应用主状态逻辑]
                executeDeaction09(iDELogicSession, iPSDELogicNode)
                break
            case "END_01":
                //执行逻辑节点[结束]
                executeEnd01(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[构造默认主状态逻辑标识]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def default_ms_logic = logic.param('default_ms_logic').getReal()
			def _default =  logic.param('default').getReal()
			def project_type=_default.project_type
			
			default_ms_logic.id="ProjMgmt.work_item."+project_type+"_task"
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
     * 执行逻辑节点[构造默认表单id]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default_create_form = logic.param('default_create_form').getReal()
			def _default_main_form = logic.param('default_main_form').getReal()
			def _default =  logic.param('default').getReal()
			def project_type=_default.project_type
			
			_default_create_form.id="ProjMgmt.work_item.new_"+project_type+"_task"
			_default_main_form.id="ProjMgmt.work_item."+project_type+"_task"
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
     * 执行逻辑节点[获取默认任务主视图表单]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取默认任务新建表单]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备主视图表单参数]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default_main_form = logic.param('default_main_form').getReal();
			def _default =  logic.param('default').getReal(); 
			def code_name=_default.id
			
			_default_main_form.id="ProjMgmt.work_item."+code_name
			_default_main_form.psdeid="ProjMgmt.work_item"
			_default_main_form.name=_default.name
			_default_main_form.codename=code_name
			_default_main_form.datatype=code_name
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
     * 执行逻辑节点[获取默认任务主状态逻辑]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction07(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备新建表单的参数]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default_create_form = logic.param('default_create_form').getReal();
			def _default =  logic.param('default').getReal(); 
			def code_name=_default.id
			
			_default_create_form.id="ProjMgmt.work_item.new_"+code_name
			_default_create_form.psdeid="ProjMgmt.work_item"
			_default_create_form.name="新建"+_default.name
			_default_create_form.codename="new_"+code_name
			_default_create_form.datatype=code_name
			
			
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
     * 执行逻辑节点[准备主状态逻辑参数]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode05(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def default_ms_logic = logic.param('default_ms_logic').getReal();
			def _default =  logic.param('default').getReal(); 
			def code_name=_default.id
			
			default_ms_logic.id="ProjMgmt.work_item."+code_name
			default_ms_logic.psdeid="ProjMgmt.work_item"
			default_ms_logic.name=_default.name
			default_ms_logic.codename=code_name
			default_ms_logic.logictag=code_name
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
     * 执行逻辑节点[创建新建表单]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[创建主视图表单]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction05(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[创建主状态逻辑]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction08(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[应用新建表单]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[应用主视图表单]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction06(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[应用主状态逻辑]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction09(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[结束]，逻辑类型[END]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeEnd01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

