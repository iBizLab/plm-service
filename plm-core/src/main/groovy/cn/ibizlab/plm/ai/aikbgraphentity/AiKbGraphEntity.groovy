package cn.ibizlab.plm.ai.aikbgraphentity

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aikbgraphentity.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_KB_GRAPH_ENTITY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiKbGraphEntity extends GroovyDynaDataEntityRuntime<AiKbGraphEntity,AiKbGraphEntityDTO,AiKbGraphEntityFilterDTO> {

    public static final String ACTION_GRAPH_INFO = "graph_info"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_ENTITY_TYPE = "cur_entity_type"
    public static final String DATASET_CUR_KB = "cur_kb"
    private static AiKbGraphEntity _instance
    void setInstance(AiKbGraphEntity instance) {
        _instance = instance
    }
    static AiKbGraphEntity getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiKbGraphEntityDTO create(AiKbGraphEntityDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiKbGraphEntityDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiKbGraphEntityDTO update(AiKbGraphEntityDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiKbGraphEntityDTO.class)
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
    AiKbGraphEntityDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiKbGraphEntityDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiKbGraphEntityDTO getDraft(AiKbGraphEntityDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiKbGraphEntityDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiKbGraphEntityDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiKbGraphEntityDTO save(AiKbGraphEntityDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiKbGraphEntityDTO.class)
    }

    /**
     * 行为：获取图谱实体/关系信息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GRAPH_INFO)
    def graphInfo(AiKbGraphEntityDTO dto) throws Throwable {
        return this.execute(ACTION_GRAPH_INFO, dto, AiKbGraphEntityDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiKbGraphEntityDTO> fetchDefault(AiKbGraphEntityFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiKbGraphEntityDTO.class)
    }

    /**
     * 数据集：实体类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_ENTITY_TYPE)
    Page<AiKbGraphEntityDTO> fetchCurEntityType(AiKbGraphEntityFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_ENTITY_TYPE, context, AiKbGraphEntityDTO.class)
    }

    /**
     * 数据集：当前数据库实体 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_KB)
    Page<AiKbGraphEntityDTO> fetchCurKb(AiKbGraphEntityFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_KB, context, AiKbGraphEntityDTO.class)
    }

}