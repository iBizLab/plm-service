package cn.ibizlab.plm.projmgmt.workitemtype

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.workitemtype.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[WORK_ITEM_TYPE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class WorkItemType extends GroovyDynaDataEntityRuntime<WorkItemType,WorkItemTypeDTO,WorkItemTypeFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CHOOSE_TARGET_TYPE = "choose_target_type"
    public static final String DATASET_CUR_PROJECT_TYPE = "cur_project_type"
    public static final String DATASET_GROUP_BY_ORIGIN_STATE = "group_by_origin_state"
    public static final String DATASET_PROJECT_WORK_ITEM_TYPE = "project_work_item_type"
    public static final String DATASET_PROJECT_WORK_ITEM_TYPE_NOT_BUG = "project_work_item_type_not_bug"
    private static WorkItemType _instance
    void setInstance(WorkItemType instance) {
        _instance = instance
    }
    static WorkItemType getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    WorkItemTypeDTO create(WorkItemTypeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, WorkItemTypeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    WorkItemTypeDTO update(WorkItemTypeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, WorkItemTypeDTO.class)
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
    WorkItemTypeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, WorkItemTypeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    WorkItemTypeDTO getDraft(WorkItemTypeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, WorkItemTypeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(WorkItemTypeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    WorkItemTypeDTO save(WorkItemTypeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, WorkItemTypeDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<WorkItemTypeDTO> fetchDefault(WorkItemTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, WorkItemTypeDTO.class)
    }

    /**
     * 数据集：选择变更工作项类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_TARGET_TYPE)
    Page<WorkItemTypeDTO> fetchChooseTargetType(WorkItemTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_TARGET_TYPE, context, WorkItemTypeDTO.class)
    }

    /**
     * 数据集：当前项目工作项类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PROJECT_TYPE)
    Page<WorkItemTypeDTO> fetchCurProjectType(WorkItemTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PROJECT_TYPE, context, WorkItemTypeDTO.class)
    }

    /**
     * 数据集：原始状态分组 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_GROUP_BY_ORIGIN_STATE)
    Page<WorkItemTypeDTO> fetchGroupByOriginState(WorkItemTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_GROUP_BY_ORIGIN_STATE, context, WorkItemTypeDTO.class)
    }

    /**
     * 数据集：项目工作项类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROJECT_WORK_ITEM_TYPE)
    Page<WorkItemTypeDTO> fetchProjectWorkItemType(WorkItemTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROJECT_WORK_ITEM_TYPE, context, WorkItemTypeDTO.class)
    }

    /**
     * 数据集：非缺陷的工作项类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROJECT_WORK_ITEM_TYPE_NOT_BUG)
    Page<WorkItemTypeDTO> fetchProjectWorkItemTypeNotBug(WorkItemTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROJECT_WORK_ITEM_TYPE_NOT_BUG, context, WorkItemTypeDTO.class)
    }

}