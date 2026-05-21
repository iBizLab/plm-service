package cn.ibizlab.plm.ai.aiagentcontext

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aiagentcontext.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_AGENT_CONTEXT]运行时对象
 * 此代码用户功能扩展代码
 *
 * 该实体存在实体映射或者自定义动态扩展对象，开启RTCode模式会导致映射功能失效
 */
class AiAgentContext extends cn.ibizlab.plm.user.plugin.groovy.dataentity.AIAgentContextDERuntime {

    public static final String ACTION_AGENT_FLOW_CLONE = "agent_flow_clone"
    public static final String ACTION_FILL_WITH_AGENT = "fill_with_agent"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_FILTER = "filter"
    public static final String DATASET_FLOW_AGENTS = "flow_agents"
    public static final String DATASET_FULL_INFO = "full_info"
    private static AiAgentContext _instance
    void setInstance(AiAgentContext instance) {
        _instance = instance
    }
    static AiAgentContext getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CREATE)
    AiAgentContextDTO create(AiAgentContextDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiAgentContextDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    AiAgentContextDTO update(AiAgentContextDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiAgentContextDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    //@DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    //@DEAction(ACTION_GET)
    AiAgentContextDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiAgentContextDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    AiAgentContextDTO getDraft(AiAgentContextDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiAgentContextDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    int checkKey(AiAgentContextDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    AiAgentContextDTO save(AiAgentContextDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiAgentContextDTO.class)
    }

    /**
     * 行为：flow智能体克隆 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_AGENT_FLOW_CLONE)
    def agentFlowClone(AiAgentContextDTO dto) throws Throwable {
        this.execute(ACTION_AGENT_FLOW_CLONE, dto, AiAgentContextDTO.class)
    }

    /**
     * 行为：填充智能体参数 实际功能
     * @param key
     * @throws Throwable
     */
    //@DEAction(ACTION_FILL_WITH_AGENT)
    def fillWithAgent(String key) throws Throwable {
        return this.execute(ACTION_FILL_WITH_AGENT, key, AiAgentContextDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    Page<AiAgentContextDTO> fetchDefault(AiAgentContextFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiAgentContextDTO.class)
    }

    /**
     * 数据集：业务过滤 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_FILTER)
    Page<AiAgentContextDTO> fetchFilter(AiAgentContextFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FILTER, context, AiAgentContextDTO.class)
    }

    /**
     * 数据集：flow智能体 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_FLOW_AGENTS)
    Page<AiAgentContextDTO> fetchFlowAgents(AiAgentContextFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FLOW_AGENTS, context, AiAgentContextDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_FULL_INFO)
    Page<AiAgentContextDTO> fetchFullInfo(AiAgentContextFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FULL_INFO, context, AiAgentContextDTO.class)
    }

}