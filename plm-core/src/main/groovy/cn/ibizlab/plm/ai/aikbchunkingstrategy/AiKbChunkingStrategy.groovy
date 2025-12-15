package cn.ibizlab.plm.ai.aikbchunkingstrategy

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aikbchunkingstrategy.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_KB_CHUNKING_STRATEGY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiKbChunkingStrategy extends GroovyDynaDataEntityRuntime<AiKbChunkingStrategy,AiKbChunkingStrategyDTO,AiKbChunkingStrategyFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AiKbChunkingStrategy _instance
    void setInstance(AiKbChunkingStrategy instance) {
        _instance = instance
    }
    static AiKbChunkingStrategy getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiKbChunkingStrategyDTO create(AiKbChunkingStrategyDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiKbChunkingStrategyDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiKbChunkingStrategyDTO update(AiKbChunkingStrategyDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiKbChunkingStrategyDTO.class)
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
    AiKbChunkingStrategyDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiKbChunkingStrategyDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiKbChunkingStrategyDTO getDraft(AiKbChunkingStrategyDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiKbChunkingStrategyDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiKbChunkingStrategyDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiKbChunkingStrategyDTO save(AiKbChunkingStrategyDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiKbChunkingStrategyDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiKbChunkingStrategyDTO> fetchDefault(AiKbChunkingStrategyFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiKbChunkingStrategyDTO.class)
    }

}