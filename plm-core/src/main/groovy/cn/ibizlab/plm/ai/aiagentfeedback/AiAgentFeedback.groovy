package cn.ibizlab.plm.ai.aiagentfeedback

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aiagentfeedback.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_AGENT_FEEDBACK]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiAgentFeedback extends GroovyDynaDataEntityRuntime<AiAgentFeedback,AiAgentFeedbackDTO,AiAgentFeedbackFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AiAgentFeedback _instance
    void setInstance(AiAgentFeedback instance) {
        _instance = instance
    }
    static AiAgentFeedback getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiAgentFeedbackDTO create(AiAgentFeedbackDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiAgentFeedbackDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiAgentFeedbackDTO update(AiAgentFeedbackDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiAgentFeedbackDTO.class)
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
    AiAgentFeedbackDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiAgentFeedbackDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiAgentFeedbackDTO getDraft(AiAgentFeedbackDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiAgentFeedbackDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiAgentFeedbackDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiAgentFeedbackDTO save(AiAgentFeedbackDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiAgentFeedbackDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiAgentFeedbackDTO> fetchDefault(AiAgentFeedbackFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiAgentFeedbackDTO.class)
    }

}