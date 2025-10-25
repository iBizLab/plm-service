package cn.ibizlab.plm.testmgmt.step

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.step.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[STEP]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Step extends GroovyDynaDataEntityRuntime<Step,StepDTO,StepFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Step _instance
    void setInstance(Step instance) {
        _instance = instance
    }
    static Step getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    StepDTO create(StepDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, StepDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    StepDTO update(StepDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, StepDTO.class)
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
    StepDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, StepDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    StepDTO getDraft(StepDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, StepDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(StepDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    StepDTO save(StepDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, StepDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<StepDTO> fetchDefault(StepFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, StepDTO.class)
    }

}