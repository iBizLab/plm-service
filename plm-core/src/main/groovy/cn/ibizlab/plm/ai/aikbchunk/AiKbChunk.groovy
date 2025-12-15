package cn.ibizlab.plm.ai.aikbchunk

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aikbchunk.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_KB_CHUNK]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiKbChunk extends GroovyDynaDataEntityRuntime<AiKbChunk,AiKbChunkDTO,AiKbChunkFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AiKbChunk _instance
    void setInstance(AiKbChunk instance) {
        _instance = instance
    }
    static AiKbChunk getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiKbChunkDTO create(AiKbChunkDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiKbChunkDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiKbChunkDTO update(AiKbChunkDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiKbChunkDTO.class)
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
    AiKbChunkDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiKbChunkDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiKbChunkDTO getDraft(AiKbChunkDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiKbChunkDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiKbChunkDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiKbChunkDTO save(AiKbChunkDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiKbChunkDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiKbChunkDTO> fetchDefault(AiKbChunkFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiKbChunkDTO.class)
    }

}