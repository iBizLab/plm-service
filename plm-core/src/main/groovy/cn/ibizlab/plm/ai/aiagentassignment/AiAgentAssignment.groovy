package cn.ibizlab.plm.ai.aiagentassignment

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aiagentassignment.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_AGENT_ASSIGNMENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiAgentAssignment extends GroovyDynaDataEntityRuntime<AiAgentAssignment,AiAgentAssignmentDTO,AiAgentAssignmentFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AiAgentAssignment _instance
    void setInstance(AiAgentAssignment instance) {
        _instance = instance
    }
    static AiAgentAssignment getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiAgentAssignmentDTO create(AiAgentAssignmentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiAgentAssignmentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiAgentAssignmentDTO update(AiAgentAssignmentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiAgentAssignmentDTO.class)
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
    AiAgentAssignmentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiAgentAssignmentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiAgentAssignmentDTO getDraft(AiAgentAssignmentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiAgentAssignmentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiAgentAssignmentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiAgentAssignmentDTO save(AiAgentAssignmentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiAgentAssignmentDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiAgentAssignmentDTO> fetchDefault(AiAgentAssignmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiAgentAssignmentDTO.class)
    }

}