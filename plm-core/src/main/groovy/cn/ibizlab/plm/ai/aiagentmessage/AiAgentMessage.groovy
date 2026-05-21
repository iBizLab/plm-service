package cn.ibizlab.plm.ai.aiagentmessage

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aiagentmessage.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_AGENT_MESSAGE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiAgentMessage extends GroovyDynaDataEntityRuntime<AiAgentMessage,AiAgentMessageDTO,AiAgentMessageFilterDTO> {

    public static final String ACTION_CANCEL_FEEDBACK = "cancel_feedback"
    public static final String ACTION_DISLIKE = "dislike"
    public static final String ACTION_LIKE = "like"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    private static AiAgentMessage _instance
    void setInstance(AiAgentMessage instance) {
        _instance = instance
    }
    static AiAgentMessage getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiAgentMessageDTO create(AiAgentMessageDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiAgentMessageDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiAgentMessageDTO update(AiAgentMessageDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiAgentMessageDTO.class)
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
    AiAgentMessageDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiAgentMessageDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiAgentMessageDTO getDraft(AiAgentMessageDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiAgentMessageDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiAgentMessageDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiAgentMessageDTO save(AiAgentMessageDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiAgentMessageDTO.class)
    }

    /**
     * 行为：取消点赞或点踩 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CANCEL_FEEDBACK)
    def cancelFeedback(AiAgentMessageDTO dto) throws Throwable {
        this.execute(ACTION_CANCEL_FEEDBACK, dto, AiAgentMessageDTO.class)
    }

    /**
     * 行为：点踩 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DISLIKE)
    def dislike(AiAgentMessageDTO dto) throws Throwable {
        this.execute(ACTION_DISLIKE, dto, AiAgentMessageDTO.class)
    }

    /**
     * 行为：点赞 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_LIKE)
    def like(AiAgentMessageDTO dto) throws Throwable {
        this.execute(ACTION_LIKE, dto, AiAgentMessageDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiAgentMessageDTO> fetchDefault(AiAgentMessageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiAgentMessageDTO.class)
    }

    /**
     * 数据集：全部消息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<AiAgentMessageDTO> fetchAll(AiAgentMessageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, AiAgentMessageDTO.class)
    }

}