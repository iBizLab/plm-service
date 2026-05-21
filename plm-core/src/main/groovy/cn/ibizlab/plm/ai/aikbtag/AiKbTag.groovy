package cn.ibizlab.plm.ai.aikbtag

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aikbtag.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_KB_TAG]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiKbTag extends GroovyDynaDataEntityRuntime<AiKbTag,AiKbTagDTO,AiKbTagFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_VALID = "VALID"
    private static AiKbTag _instance
    void setInstance(AiKbTag instance) {
        _instance = instance
    }
    static AiKbTag getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiKbTagDTO create(AiKbTagDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiKbTagDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiKbTagDTO update(AiKbTagDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiKbTagDTO.class)
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
    AiKbTagDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiKbTagDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiKbTagDTO getDraft(AiKbTagDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiKbTagDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiKbTagDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiKbTagDTO save(AiKbTagDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiKbTagDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiKbTagDTO> fetchDefault(AiKbTagFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiKbTagDTO.class)
    }

    /**
     * 数据集：启用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_VALID)
    Page<AiKbTagDTO> fetchValid(AiKbTagFilterDTO context) throws Throwable {
        return this.fetch(DATASET_VALID, context, AiKbTagDTO.class)
    }

}