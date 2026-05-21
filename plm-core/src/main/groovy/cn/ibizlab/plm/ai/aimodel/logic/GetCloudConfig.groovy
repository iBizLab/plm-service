package cn.ibizlab.plm.ai.aimodel.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[AI_MODEL]处理逻辑[获取Cloud配置]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class GetCloudConfig extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(GetCloudConfig.class)

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
            case "END_01":
                //执行逻辑节点[结束]
                executeEnd01(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_02":
                //执行逻辑节点[设置流和vlm]
                executePrepareparam02(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_07":
                //执行逻辑节点[准备多模态类型]
                executePrepareparam07(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_01":
                //执行逻辑节点[发布oss配置代码]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_06":
                //执行逻辑节点[准备参数]
                executePrepareparam06(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_01":
                //执行逻辑节点[设置禁用]
                executePrepareparam01(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_08":
                //执行逻辑节点[准备embedding参数]
                executePrepareparam08(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_02":
                //执行逻辑节点[写入embeddingtoken]
                executeRawsfcode02(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_04":
                //执行逻辑节点[设置tools]
                executePrepareparam04(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_05":
                //执行逻辑节点[设置aitype]
                executePrepareparam05(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_09":
                //执行逻辑节点[准备rerank参数]
                executePrepareparam09(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_03":
                //执行逻辑节点[设置think]
                executePrepareparam03(iDELogicSession, iPSDELogicNode)
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
    private void executeEnd01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置流和vlm]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备多模态类型]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam07(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[发布oss配置代码]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            net.ibizsys.central.cloud.core.spring.rt.ServiceHub serviceHub = net.ibizsys.central.cloud.core.spring.rt.ServiceHub.getInstance();
			
			        org.yaml.snakeyaml.Yaml yaml = new org.yaml.snakeyaml.Yaml();
			        String strConfig = serviceHub.getConfig("cloud-oss");
			        java.util.Map config = (!org.springframework.util.StringUtils.hasLength(strConfig)) ? new java.util.HashMap() : yaml.loadAs(strConfig, java.util.Map.class);
			
			        java.util.Map aiimage = config.getOrDefault("aiimage",new java.util.HashMap());
			        aiimage.put("agent","${sys.getDeploySystemId()}-ai--vl".toString());
			        config.put("aiimage",aiimage);
			
			
			        if(!config.containsKey("filepath")) {
			            String filepath = "/app/file/oss/file";
			            String allinone = serviceHub.getConfig("servicehub-allinone");
			            if(org.springframework.util.StringUtils.hasLength(allinone)){
			                java.util.Map allinoneConfig = yaml.loadAs(allinone, java.util.Map.class);
			                if(allinoneConfig.containsKey("systemsettings")) {
			                    java.util.Map systemsettings  = allinoneConfig.getOrDefault("systemsettings",new java.util.HashMap());
			                    if(systemsettings.containsKey("cloudossutil")) {
			                        java.util.Map cloudossutil  = systemsettings.getOrDefault("cloudossutil",new java.util.HashMap());
			                        if(cloudossutil.containsKey("filepath")) {
			                            filepath = cloudossutil.remove("filepath");
			                            if (cloudossutil.size()==0) {
			                                systemsettings.remove("cloudossutil");
			                            }
			                            serviceHub.publishConfig("servicehub-allinone",allinoneConfig)
			                        }
			                    }
			                }
			            }
			            config.put("filepath", filepath)
			        }
			        if(!config.containsKey("libreoffice")) {
			            java.util.Map libreoffice = new java.util.HashMap()
			            libreoffice.put("path","/usr/bin/soffice")
			            config.put("libreoffice",libreoffice)
			        }
			
			
			        serviceHub.publishConfig("cloud-oss", config);
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
    private void executePrepareparam06(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置禁用]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备embedding参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam08(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[写入embeddingtoken]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def _map = logic.param('map').getReal()
			def key = _default.get("id")
			def token = "credential-${sys.getDeploySystemId()}-ai--${key}".toString()
			_map.set("embeddingtoken",token)
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
     * 执行逻辑节点[设置tools]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置aitype]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam05(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备rerank参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam09(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置think]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

