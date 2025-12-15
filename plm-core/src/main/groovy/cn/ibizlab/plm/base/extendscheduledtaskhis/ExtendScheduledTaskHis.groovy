package cn.ibizlab.plm.base.extendscheduledtaskhis

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.extendscheduledtaskhis.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[EXTEND_SCHEDULED_TASK_HIS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ExtendScheduledTaskHis extends GroovyDynaDataEntityRuntime<ExtendScheduledTaskHis,ExtendScheduledTaskHisDTO,ExtendScheduledTaskHisFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ExtendScheduledTaskHis _instance
    void setInstance(ExtendScheduledTaskHis instance) {
        _instance = instance
    }
    static ExtendScheduledTaskHis getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ExtendScheduledTaskHisDTO create(ExtendScheduledTaskHisDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ExtendScheduledTaskHisDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ExtendScheduledTaskHisDTO update(ExtendScheduledTaskHisDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ExtendScheduledTaskHisDTO.class)
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
    ExtendScheduledTaskHisDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ExtendScheduledTaskHisDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ExtendScheduledTaskHisDTO getDraft(ExtendScheduledTaskHisDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ExtendScheduledTaskHisDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ExtendScheduledTaskHisDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ExtendScheduledTaskHisDTO save(ExtendScheduledTaskHisDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ExtendScheduledTaskHisDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ExtendScheduledTaskHisDTO> fetchDefault(ExtendScheduledTaskHisFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ExtendScheduledTaskHisDTO.class)
    }

}