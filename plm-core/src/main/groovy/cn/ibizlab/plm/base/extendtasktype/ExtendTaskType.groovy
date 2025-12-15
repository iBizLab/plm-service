package cn.ibizlab.plm.base.extendtasktype

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.extendtasktype.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[EXTEND_TASK_TYPE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ExtendTaskType extends GroovyDynaDataEntityRuntime<ExtendTaskType,ExtendTaskTypeDTO,ExtendTaskTypeFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ExtendTaskType _instance
    void setInstance(ExtendTaskType instance) {
        _instance = instance
    }
    static ExtendTaskType getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ExtendTaskTypeDTO create(ExtendTaskTypeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ExtendTaskTypeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ExtendTaskTypeDTO update(ExtendTaskTypeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ExtendTaskTypeDTO.class)
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
    ExtendTaskTypeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ExtendTaskTypeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ExtendTaskTypeDTO getDraft(ExtendTaskTypeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ExtendTaskTypeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ExtendTaskTypeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ExtendTaskTypeDTO save(ExtendTaskTypeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ExtendTaskTypeDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ExtendTaskTypeDTO> fetchDefault(ExtendTaskTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ExtendTaskTypeDTO.class)
    }

}