package cn.ibizlab.plm.ai.aiagent

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aiagent.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_AGENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiAgent extends GroovyDynaDataEntityRuntime<AiAgent,AiAgentDTO,AiAgentFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_FULL_INFO = "full_info"
    private static AiAgent _instance
    void setInstance(AiAgent instance) {
        _instance = instance
    }
    static AiAgent getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiAgentDTO create(AiAgentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiAgentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiAgentDTO update(AiAgentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiAgentDTO.class)
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
    AiAgentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiAgentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiAgentDTO getDraft(AiAgentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiAgentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiAgentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiAgentDTO save(AiAgentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiAgentDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiAgentDTO> fetchDefault(AiAgentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiAgentDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FULL_INFO)
    Page<AiAgentDTO> fetchFullInfo(AiAgentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FULL_INFO, context, AiAgentDTO.class)
    }

}