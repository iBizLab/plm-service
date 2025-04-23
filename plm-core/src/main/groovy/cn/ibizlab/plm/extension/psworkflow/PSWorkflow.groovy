package cn.ibizlab.plm.extension.psworkflow

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.extension.psworkflow.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSWORKFLOW]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSWorkflow extends GroovyPSModelDERuntime<PSWorkflow,PSWorkflowDTO,PSWorkflowFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSWorkflow _instance
    void setInstance(PSWorkflow instance) {
        _instance = instance
    }
    static PSWorkflow getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSWorkflowDTO create(PSWorkflowDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSWorkflowDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSWorkflowDTO update(PSWorkflowDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSWorkflowDTO.class)
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
    PSWorkflowDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSWorkflowDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSWorkflowDTO getDraft(PSWorkflowDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSWorkflowDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSWorkflowDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSWorkflowDTO save(PSWorkflowDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSWorkflowDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSWorkflowDTO> fetchDefault(PSWorkflowFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSWorkflowDTO.class)
    }

}