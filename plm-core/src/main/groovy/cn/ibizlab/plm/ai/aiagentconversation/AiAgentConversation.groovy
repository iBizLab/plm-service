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

    public static final String ACTION_CLEAR_ALL_EXCEPT = "clear_all_except"
    public static final String ACTION_CLEAR_MESSAGE = "clear_message"
    public static final String ACTION_DELETE = "delete"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ACTIVE = "active"
    public static final String DATASET_CUR_USER_ACTIVE = "cur_user_active"
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
     * 行为：除指定外清空会话 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CLEAR_ALL_EXCEPT)
    def clearAllExcept(AiAgentConversationDTO dto) throws Throwable {
        return this.execute(ACTION_CLEAR_ALL_EXCEPT, dto, Integer.class)
    }

    /**
     * 行为：清空消息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CLEAR_MESSAGE)
    def clearMessage(AiAgentConversationDTO dto) throws Throwable {
        return this.execute(ACTION_CLEAR_MESSAGE, dto, Integer.class)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(AiAgentConversationDTO dto) throws Throwable {
        return this.execute(ACTION_DELETE, dto, Integer.class)
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

    /**
     * 数据集：有效会话 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ACTIVE)
    Page<AiAgentConversationDTO> fetchActive(AiAgentConversationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ACTIVE, context, AiAgentConversationDTO.class)
    }

    /**
     * 数据集：当前用户会话 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_USER_ACTIVE)
    Page<AiAgentConversationDTO> fetchCurUserActive(AiAgentConversationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER_ACTIVE, context, AiAgentConversationDTO.class)
    }

}