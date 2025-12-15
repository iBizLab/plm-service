package cn.ibizlab.plm.base.extendschedule

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.extendschedule.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[EXTEND_SCHEDULE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ExtendSchedule extends GroovyDynaDataEntityRuntime<ExtendSchedule,ExtendScheduleDTO,ExtendScheduleFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ExtendSchedule _instance
    void setInstance(ExtendSchedule instance) {
        _instance = instance
    }
    static ExtendSchedule getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ExtendScheduleDTO create(ExtendScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ExtendScheduleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ExtendScheduleDTO update(ExtendScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ExtendScheduleDTO.class)
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
    ExtendScheduleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ExtendScheduleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ExtendScheduleDTO getDraft(ExtendScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ExtendScheduleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ExtendScheduleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ExtendScheduleDTO save(ExtendScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ExtendScheduleDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ExtendScheduleDTO> fetchDefault(ExtendScheduleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ExtendScheduleDTO.class)
    }

}