package cn.ibizlab.plm.ai.aikbsearchquery

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aikbsearchquery.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_KB_SEARCH_QUERY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiKbSearchQuery extends GroovyDynaDataEntityRuntime<AiKbSearchQuery,AiKbSearchQueryDTO,AiKbSearchQueryFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AiKbSearchQuery _instance
    void setInstance(AiKbSearchQuery instance) {
        _instance = instance
    }
    static AiKbSearchQuery getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiKbSearchQueryDTO create(AiKbSearchQueryDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiKbSearchQueryDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiKbSearchQueryDTO update(AiKbSearchQueryDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiKbSearchQueryDTO.class)
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
    AiKbSearchQueryDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiKbSearchQueryDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiKbSearchQueryDTO getDraft(AiKbSearchQueryDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiKbSearchQueryDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiKbSearchQueryDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiKbSearchQueryDTO save(AiKbSearchQueryDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiKbSearchQueryDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiKbSearchQueryDTO> fetchDefault(AiKbSearchQueryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiKbSearchQueryDTO.class)
    }

}