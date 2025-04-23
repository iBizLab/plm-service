package cn.ibizlab.plm.base.parameter

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.parameter.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PARAMETER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Parameter extends GroovyDataEntityRuntime<Parameter,ParameterDTO,ParameterFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Parameter _instance
    void setInstance(Parameter instance) {
        _instance = instance
    }
    static Parameter getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ParameterDTO create(ParameterDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ParameterDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ParameterDTO update(ParameterDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ParameterDTO.class)
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
    ParameterDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ParameterDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ParameterDTO getDraft(ParameterDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ParameterDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ParameterDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ParameterDTO save(ParameterDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ParameterDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ParameterDTO> fetchDefault(ParameterFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ParameterDTO.class)
    }

}