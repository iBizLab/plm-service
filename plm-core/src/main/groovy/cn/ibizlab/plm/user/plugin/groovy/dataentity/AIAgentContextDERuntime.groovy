package cn.ibizlab.plm.user.plugin.groovy.dataentity

import net.ibizsys.central.cloud.core.dataentity.DataEntityRuntime
import net.ibizsys.central.dataentity.IDataEntityRuntime
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.ISearchContextDTO
import net.ibizsys.model.dataentity.IPSDataEntity
import net.ibizsys.model.dataentity.action.IPSDEAction
import net.ibizsys.model.dataentity.ds.IPSDEDataSet
import net.ibizsys.runtime.IDynaInstRuntime
import net.ibizsys.runtime.util.IEntityBase
import net.ibizsys.runtime.util.ISearchContextBase
import org.springframework.util.StringUtils

public class AIAgentContextDERuntime extends DataEntityRuntime {

    private IDataEntityRuntime AIAgentDERuntime = null;

    protected IDataEntityRuntime getAIAgentDERuntimeDERuntime() {
        if(this.AIAgentDERuntime == null) {
            this.AIAgentDERuntime = this.getSystemRuntime().getDataEntityRuntime("AI_AGENT");
        }
        return this.AIAgentDERuntime;
    }

    @Override
    protected void translateEntitiesAfterProceed(ISearchContextBase arg0, List<? extends IEntityBase> list, String strDataSetName, IPSDEDataSet iPSDEDataSet, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
        super.translateEntitiesAfterProceed(arg0, list, strDataSetName, iPSDEDataSet, iPSDataEntity, iDynaInstRuntime, actionData);
        Map<String,List<IEntityBase>> cacheDtoMap = new LinkedHashMap<>();
        for(IEntityBase item : list) {
            IEntityDTO aiAgentContextDTO = null;
            if (item instanceof IEntityDTO) {
                aiAgentContextDTO = (IEntityDTO) item;
            }

            if (aiAgentContextDTO == null) {
                return;
            }
            if (StringUtils.hasLength(aiAgentContextDTO.get("ai_agent_id"))) {
                String agentId = aiAgentContextDTO.get("ai_agent_id") as String;
                if(!cacheDtoMap.containsKey(agentId)){
                    List<IEntityBase> dtoList = new ArrayList<>();
                    cacheDtoMap.put(agentId,dtoList);
                    dtoList.add(aiAgentContextDTO)
                }else {
                    cacheDtoMap.get(agentId).add(aiAgentContextDTO)
                }
            }
        }
        for (Map.Entry<String, List<String>> entry : cacheDtoMap.entrySet()) {
            String agentId = entry.getKey();

            List<IEntityBase> dtoList = entry.getValue();
            List<String> idList = new ArrayList<>();
            for(IEntityBase item : dtoList) {
                IEntityDTO aiAgentContextDTO = null;
                if (item instanceof IEntityDTO) {
                    aiAgentContextDTO = (IEntityDTO) item;
                }
                if (aiAgentContextDTO == null) {
                    return;
                }
                idList.add(aiAgentContextDTO.get("ai_agent_id") as String);
            }

            IDataEntityRuntime iDataEntityRuntime = this.getAIAgentDERuntimeDERuntime();
            ISearchContextDTO iSearchContextDTO =  iDataEntityRuntime.createSearchContext();
            iSearchContextDTO.all().in(iDataEntityRuntime.getKeyPSDEField().getCodeName(),idList)
            List<IEntityDTO> resList = iDataEntityRuntime.selectDataSet("full_info",iSearchContextDTO);
            for(IEntityDTO item : resList) {
                for(IEntityBase item2 : dtoList) {
                    IEntityDTO aiAgentContextDTO = null;
                    if (item2 instanceof IEntityDTO) {
                        aiAgentContextDTO = (IEntityDTO) item2;
                    }
                    if (aiAgentContextDTO == null) {
                        return;
                    }
                    if (item.getId().equals(aiAgentContextDTO.get("ai_agent_id"))) {
                        Iterator<Map.Entry<String, Object>> it = aiAgentContextDTO.any().entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<String, Object> itentry = it.next();
                            Object value = itentry.getValue();

                            if (value == null) {
                                it.remove();
                            }
                        }
                        item.copyToIf(aiAgentContextDTO)
                    }
                }
            }
        }
    }

    @Override
    protected void translateEntityAfterProceed(Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
        super.translateEntityAfterProceed(arg0, objRet, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData)
        if (objRet instanceof IEntityDTO && "fill_with_agent".equalsIgnoreCase(strActionName)) {
            IEntityDTO aiAgentContextDTO = (IEntityDTO) objRet;
            if (StringUtils.hasLength(aiAgentContextDTO.get("ai_agent_id"))) {
                IDataEntityRuntime iDataEntityRuntime = this.getAIAgentDERuntimeDERuntime();
                ISearchContextDTO iSearchContextDTO =  iDataEntityRuntime.createSearchContext();
                iSearchContextDTO.all().in(iDataEntityRuntime.getKeyPSDEField().getCodeName(),aiAgentContextDTO.get("ai_agent_id"))
                List<IEntityDTO> resList = iDataEntityRuntime.selectDataSet("full_info",iSearchContextDTO);
                for(IEntityDTO item : resList) {
                    Iterator<Map.Entry<String, Object>> it = aiAgentContextDTO.any().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Object> itentry = it.next();
                        Object value = itentry.getValue();

                        if (value == null) {
                            it.remove();
                        }
                    }
                    item.copyToIf(aiAgentContextDTO)
                }
            }
        }
    }
}