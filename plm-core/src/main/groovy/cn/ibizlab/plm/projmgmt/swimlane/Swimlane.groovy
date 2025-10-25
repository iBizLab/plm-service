package cn.ibizlab.plm.projmgmt.swimlane

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.swimlane.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SWIMLANE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Swimlane extends GroovyDynaDataEntityRuntime<Swimlane,SwimlaneDTO,SwimlaneFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Swimlane _instance
    void setInstance(Swimlane instance) {
        _instance = instance
    }
    static Swimlane getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    SwimlaneDTO create(SwimlaneDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SwimlaneDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SwimlaneDTO update(SwimlaneDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SwimlaneDTO.class)
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
    SwimlaneDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SwimlaneDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SwimlaneDTO getDraft(SwimlaneDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SwimlaneDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SwimlaneDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SwimlaneDTO save(SwimlaneDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SwimlaneDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SwimlaneDTO> fetchDefault(SwimlaneFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SwimlaneDTO.class)
    }

}