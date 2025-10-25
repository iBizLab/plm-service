package cn.ibizlab.plm.projmgmt.workitemwizard

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.workitemwizard.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[WORK_ITEM_WIZARD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class WorkItemWizard extends GroovyDynaDataEntityRuntime<WorkItemWizard,WorkItemWizardDTO,WorkItemWizardFilterDTO> {

    public static final String ACTION_CHANGE = "change"
    public static final String ACTION_FILL_DETAILS = "fill_details"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static WorkItemWizard _instance
    void setInstance(WorkItemWizard instance) {
        _instance = instance
    }
    static WorkItemWizard getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    WorkItemWizardDTO create(WorkItemWizardDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, WorkItemWizardDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    WorkItemWizardDTO update(WorkItemWizardDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, WorkItemWizardDTO.class)
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
    WorkItemWizardDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, WorkItemWizardDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    WorkItemWizardDTO getDraft(WorkItemWizardDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, WorkItemWizardDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(WorkItemWizardDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    WorkItemWizardDTO save(WorkItemWizardDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, WorkItemWizardDTO.class)
    }

    /**
     * 行为：变更工作项类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE)
    def change(WorkItemWizardDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE, dto, WorkItemWizardDTO.class)
    }

    /**
     * 行为：填充属性 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILL_DETAILS)
    def fillDetails(WorkItemWizardDTO dto) throws Throwable {
        this.execute(ACTION_FILL_DETAILS, dto, WorkItemWizardDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<WorkItemWizardDTO> fetchDefault(WorkItemWizardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, WorkItemWizardDTO.class)
    }

}