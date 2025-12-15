package cn.ibizlab.plm.ai.aiagentconversation

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aiagentconversation.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_AGENT_CONVERSATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiAgentConversation extends GroovyDynaDataEntityRuntime<AiAgentConversation,AiAgentConversationDTO,AiAgentConversationFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AiAgentConversation _instance
    void setInstance(AiAgentConversation instance) {
        _instance = instance
    }
    static AiAgentConversation getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiAgentConversationDTO create(AiAgentConversationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiAgentConversationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiAgentConversationDTO update(AiAgentConversationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiAgentConversationDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    AiAgentConversationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiAgentConversationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiAgentConversationDTO getDraft(AiAgentConversationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiAgentConversationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiAgentConversationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiAgentConversationDTO save(AiAgentConversationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiAgentConversationDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiAgentConversationDTO> fetchDefault(AiAgentConversationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiAgentConversationDTO.class)
    }

}