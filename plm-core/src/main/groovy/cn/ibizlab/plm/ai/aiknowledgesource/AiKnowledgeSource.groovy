package cn.ibizlab.plm.ai.aiknowledgesource

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aiknowledgesource.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_KNOWLEDGE_SOURCE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiKnowledgeSource extends GroovyDynaDataEntityRuntime<AiKnowledgeSource,AiKnowledgeSourceDTO,AiKnowledgeSourceFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AiKnowledgeSource _instance
    void setInstance(AiKnowledgeSource instance) {
        _instance = instance
    }
    static AiKnowledgeSource getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiKnowledgeSourceDTO create(AiKnowledgeSourceDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiKnowledgeSourceDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiKnowledgeSourceDTO update(AiKnowledgeSourceDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiKnowledgeSourceDTO.class)
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
    AiKnowledgeSourceDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiKnowledgeSourceDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiKnowledgeSourceDTO getDraft(AiKnowledgeSourceDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiKnowledgeSourceDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiKnowledgeSourceDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiKnowledgeSourceDTO save(AiKnowledgeSourceDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiKnowledgeSourceDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiKnowledgeSourceDTO> fetchDefault(AiKnowledgeSourceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiKnowledgeSourceDTO.class)
    }

}