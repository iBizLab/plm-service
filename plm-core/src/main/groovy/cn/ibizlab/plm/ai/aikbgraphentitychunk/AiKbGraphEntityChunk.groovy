package cn.ibizlab.plm.ai.aikbgraphentitychunk

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aikbgraphentitychunk.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_KB_GRAPH_ENTITY_CHUNK]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiKbGraphEntityChunk extends GroovyDynaDataEntityRuntime<AiKbGraphEntityChunk,AiKbGraphEntityChunkDTO,AiKbGraphEntityChunkFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AiKbGraphEntityChunk _instance
    void setInstance(AiKbGraphEntityChunk instance) {
        _instance = instance
    }
    static AiKbGraphEntityChunk getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiKbGraphEntityChunkDTO create(AiKbGraphEntityChunkDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiKbGraphEntityChunkDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiKbGraphEntityChunkDTO update(AiKbGraphEntityChunkDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiKbGraphEntityChunkDTO.class)
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
    AiKbGraphEntityChunkDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiKbGraphEntityChunkDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiKbGraphEntityChunkDTO getDraft(AiKbGraphEntityChunkDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiKbGraphEntityChunkDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiKbGraphEntityChunkDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiKbGraphEntityChunkDTO save(AiKbGraphEntityChunkDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiKbGraphEntityChunkDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiKbGraphEntityChunkDTO> fetchDefault(AiKbGraphEntityChunkFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiKbGraphEntityChunkDTO.class)
    }

}