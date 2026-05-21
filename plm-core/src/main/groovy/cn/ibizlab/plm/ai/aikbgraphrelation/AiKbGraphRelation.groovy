package cn.ibizlab.plm.ai.aikbgraphrelation

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aikbgraphrelation.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_KB_GRAPH_RELATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiKbGraphRelation extends GroovyDynaDataEntityRuntime<AiKbGraphRelation,AiKbGraphRelationDTO,AiKbGraphRelationFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_KB = "cur_kb"
    private static AiKbGraphRelation _instance
    void setInstance(AiKbGraphRelation instance) {
        _instance = instance
    }
    static AiKbGraphRelation getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiKbGraphRelationDTO create(AiKbGraphRelationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiKbGraphRelationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiKbGraphRelationDTO update(AiKbGraphRelationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiKbGraphRelationDTO.class)
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
    AiKbGraphRelationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiKbGraphRelationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiKbGraphRelationDTO getDraft(AiKbGraphRelationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiKbGraphRelationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiKbGraphRelationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiKbGraphRelationDTO save(AiKbGraphRelationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiKbGraphRelationDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiKbGraphRelationDTO> fetchDefault(AiKbGraphRelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiKbGraphRelationDTO.class)
    }

    /**
     * 数据集：当前数据库 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_KB)
    Page<AiKbGraphRelationDTO> fetchCurKb(AiKbGraphRelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_KB, context, AiKbGraphRelationDTO.class)
    }

}