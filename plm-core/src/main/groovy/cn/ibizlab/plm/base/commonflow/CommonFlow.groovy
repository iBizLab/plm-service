package cn.ibizlab.plm.base.commonflow

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.commonflow.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[COMMON_FLOW]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CommonFlow extends GroovyDynaDataEntityRuntime<CommonFlow,CommonFlowDTO,CommonFlowFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static CommonFlow _instance
    void setInstance(CommonFlow instance) {
        _instance = instance
    }
    static CommonFlow getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CommonFlowDTO create(CommonFlowDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CommonFlowDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CommonFlowDTO update(CommonFlowDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CommonFlowDTO.class)
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
    CommonFlowDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CommonFlowDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CommonFlowDTO getDraft(CommonFlowDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CommonFlowDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CommonFlowDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CommonFlowDTO save(CommonFlowDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CommonFlowDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<CommonFlowDTO> fetchDefault(CommonFlowFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, CommonFlowDTO.class)
    }

}