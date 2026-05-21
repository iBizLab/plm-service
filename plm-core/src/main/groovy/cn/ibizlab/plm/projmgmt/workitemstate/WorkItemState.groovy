package cn.ibizlab.plm.projmgmt.workitemstate

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.workitemstate.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[WORK_ITEM_STATE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class WorkItemState extends GroovyDynaDataEntityRuntime<WorkItemState,WorkItemStateDTO,WorkItemStateFilterDTO> {

    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String DATASET_BI_FORM = "BI_FORM"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static WorkItemState _instance
    void setInstance(WorkItemState instance) {
        _instance = instance
    }
    static WorkItemState getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    WorkItemStateDTO create(WorkItemStateDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, WorkItemStateDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    WorkItemStateDTO update(WorkItemStateDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, WorkItemStateDTO.class)
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
    WorkItemStateDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, WorkItemStateDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    WorkItemStateDTO getDraft(WorkItemStateDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, WorkItemStateDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(WorkItemStateDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    WorkItemStateDTO save(WorkItemStateDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, WorkItemStateDTO.class)
    }

    /**
     * 行为：移动排序 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(WorkItemStateDTO dto) throws Throwable {
        return this.executeForList(ACTION_MOVE_ORDER, dto, WorkItemStateDTO.class)
    }

    /**
     * 数据集：BI报表数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_FORM)
    Page<WorkItemStateDTO> fetchBiForm(WorkItemStateFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_FORM, context, WorkItemStateDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<WorkItemStateDTO> fetchDefault(WorkItemStateFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, WorkItemStateDTO.class)
    }

}