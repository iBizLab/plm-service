package cn.ibizlab.plm.projmgmt.daycapacity

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.daycapacity.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DAY_CAPACITY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DayCapacity extends GroovyDynaDataEntityRuntime<DayCapacity,DayCapacityDTO,DayCapacityFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static DayCapacity _instance
    void setInstance(DayCapacity instance) {
        _instance = instance
    }
    static DayCapacity getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DayCapacityDTO create(DayCapacityDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DayCapacityDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DayCapacityDTO update(DayCapacityDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DayCapacityDTO.class)
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
    DayCapacityDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DayCapacityDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DayCapacityDTO getDraft(DayCapacityDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DayCapacityDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DayCapacityDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DayCapacityDTO save(DayCapacityDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DayCapacityDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DayCapacityDTO> fetchDefault(DayCapacityFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DayCapacityDTO.class)
    }

}