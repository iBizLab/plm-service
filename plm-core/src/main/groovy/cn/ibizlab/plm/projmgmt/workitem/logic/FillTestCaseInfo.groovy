package cn.ibizlab.plm.projmgmt.workitem.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[WORK_ITEM]处理逻辑[填充用例信息]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class FillTestCaseInfo extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(FillTestCaseInfo.class)

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
            case "DEBUGPARAM1":
                //执行逻辑节点[调试逻辑参数]
                executeDEBUGPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM1":
                //执行逻辑节点[准备参数]
                executePREPAREPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM4":
                //执行逻辑节点[准备参数]
                executePREPAREPARAM4(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION1":
                //执行逻辑节点[获取测试用例]
                executeDEACTION1(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION2":
                //执行逻辑节点[获取执行用例]
                executeDEACTION2(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE1":
                //执行逻辑节点[拼接描述字段]
                executeRAWSFCODE1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE2":
                //执行逻辑节点[拼接描述字段]
                executeRAWSFCODE2(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM5":
                //执行逻辑节点[准备参数]
                executePREPAREPARAM5(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM6":
                //执行逻辑节点[设置用例ID]
                executePREPAREPARAM6(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION3":
                //执行逻辑节点[获取测试用例]
                executeDEACTION3(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE3":
                //执行逻辑节点[附件操作]
                executeRAWSFCODE3(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[调试逻辑参数]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEBUGPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM4(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取测试用例]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取执行用例]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[拼接描述字段]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal();
			def test_case = logic.param('test_case').getReal();
			
			def table_start = '<table style="width: auto;"><tbody><tr><th colSpan="1" rowSpan="1" width="56.32">#</th><th colSpan="1" rowSpan="1" width="auto">步骤描述</th><th colSpan="1" rowSpan="1" width="auto">预期结果</th></tr>';
			def table_end = '</tbody></table>';
			def steps = test_case.get('steps');
			def text = '<p><strong>前置条件：</strong></p>' + (test_case.get('precondition') ?: '') + '<p><strong>执行步骤：</strong></p>' + table_start;
			
			
			def content = '<td colSpan="1" rowSpan="1" width="auto">';
			def group = '<td colSpan="4" rowSpan="1" width="auto">';
			
			def order = 1;
			def group_order = 0.1;
			steps.each { item ->
			    println item;
			    if(item.get('is_group') == 0){
			        text += '<tr>' + content + order + '</td>';
			        text += content;
			        text += (item.get('description') ?: '') + '</td>';
			        text += content;
			        text += (item.get('expected_value') ?: '') + '</td>' + '</tr>';
			    }else if(item.get('is_group') == 1){
			        text += '<tr>' + content + order + '</td>';
			        text += group;
			        text += (item.get('name') ?: '') + '</td>' + '</tr>';
			        group_order = 0.1;
			    }else{
			        group_order += order;
			        text += '<tr>' + content + group_order + '</td>';
			        text += content;
			        text += (item.get('description') ?: '') + '</td>';
			        text += content;
			        text += (item.get('expected_value') ?: '') + '</td>' + '</tr>';
			        group_order += 0.1;
			    }
			    order++;
			}
			text += table_end + (_default.get('description') ?: '');
			
			_default.set('description', text);
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
     * 执行逻辑节点[拼接描述字段]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal();
			def run = logic.param('run').getReal();
			
			//获取代码表
			def run_status = sys.codelist('TestMgmt__run_status');
			
			
			def table_start = '<table style="width: auto;"><tbody><tr><th colSpan="1" rowSpan="1" width="55">#</th><th colSpan="1" rowSpan="1" width="auto">步骤描述</th><th colSpan="1" rowSpan="1" width="auto">预期结果</th><th colSpan="1" rowSpan="1" width="auto">实际结果</th><th colSpan="1" rowSpan="1" width="80">执行结果</th></tr>';
			def table_end = '</tbody></table>';
			def steps = run.get('steps');
			def text = '<p><strong>前置条件：</strong></p>' + (run.get('precondition') ?: '') + '<p><strong>执行步骤：</strong></p>' + table_start;
			
			
			def content = '<td colSpan="1" rowSpan="1" width="auto">';
			def group = '<td colSpan="4" rowSpan="1" width="auto">';
			
			def order = 1;
			def group_order = 0.1;
			steps.each { item ->
			    println item;
			    if(item.get('is_group') == 0){
			        text += '<tr>' + content + order + '</td>';
			        text += content;
			        text += (item.get('description') ?: '') + '</td>';
			        text += content;
			        text += (item.get('expected_value') ?: '') + '</td>';
			        text += content;
			        text += (item.get('actual_value') ?: '') + '</td>';
			        text += content;
			        text += (run_status.getText(item.get('status1'))) ?: '' + '</td>' + '</tr>';
			    }else if(item.get('is_group') == 1){
			        text += '<tr>' + content + order + '</td>';
			        text += group;
			        text += (item.get('name') ?: '') + '</td>' + '</tr>';
			        group_order = 0.1;
			    }else{
			        group_order += order;
			        text += '<tr>' + content + group_order + '</td>';
			        text += content;
			        text += (item.get('description') ?: '') + '</td>';
			        text += content;
			        text += (item.get('expected_value') ?: '') + '</td>';
			        text += content;
			        text += (item.get('actual_value') ?: '') + '</td>';
			        text += content;
			        text += (run_status.getText(item.get('status1'))) ?: '' + '</td>' + '</tr>';
			        group_order += 0.1;
			    }
			    order++;
			}
			text += table_end + (_default.get('description') ?: '');
			
			_default.set('description', text);
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
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM5(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置用例ID]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM6(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取测试用例]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION3(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[附件操作]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE3(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal();
			def attachments = logic.param('attachments').getReal();
			
			def _default_list = _default.get('attachments');
			def list = new ArrayList();
			
			attachments.each { item ->
			    println item;
			    item.set('owner_id',null);
			    item.set('owner_type',null);
			    item.set('id',null);
			    list.add(item);
			}
			
			_default_list.each { item ->
			    println item;
			    list.add(item);
			}
			println list;
			_default.set('attachments', list);
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

