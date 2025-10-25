package cn.ibizlab.plm.base.dynaappmenu

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.dynaappmenu.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DYNA_APPMENU]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DynaAppmenu extends GroovyDynaDataEntityRuntime<DynaAppmenu,DynaAppmenuDTO,DynaAppmenuFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static DynaAppmenu _instance
    void setInstance(DynaAppmenu instance) {
        _instance = instance
    }
    static DynaAppmenu getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DynaAppmenuDTO create(DynaAppmenuDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DynaAppmenuDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DynaAppmenuDTO update(DynaAppmenuDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DynaAppmenuDTO.class)
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
    DynaAppmenuDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DynaAppmenuDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DynaAppmenuDTO getDraft(DynaAppmenuDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DynaAppmenuDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DynaAppmenuDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DynaAppmenuDTO save(DynaAppmenuDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DynaAppmenuDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DynaAppmenuDTO> fetchDefault(DynaAppmenuFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DynaAppmenuDTO.class)
    }

}