package cn.ibizlab.plm.team.objective

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.team.objective.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[OBJECTIVE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Objective extends GroovyDynaDataEntityRuntime<Objective,ObjectiveDTO,ObjectiveFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Objective _instance
    void setInstance(Objective instance) {
        _instance = instance
    }
    static Objective getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ObjectiveDTO create(ObjectiveDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ObjectiveDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ObjectiveDTO update(ObjectiveDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ObjectiveDTO.class)
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
    ObjectiveDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ObjectiveDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ObjectiveDTO getDraft(ObjectiveDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ObjectiveDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ObjectiveDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ObjectiveDTO save(ObjectiveDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ObjectiveDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ObjectiveDTO> fetchDefault(ObjectiveFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ObjectiveDTO.class)
    }

}