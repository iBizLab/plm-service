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
class WorkItemType extends GroovyDataEntityRuntime<WorkItemType,WorkItemTypeDTO,WorkItemTypeFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CHOOSE_TARGET_TYPE = "choose_target_type"
    public static final String DATASET_CUR_PROJECT_TYPE = "cur_project_type"
    public static final String DATASET_GROUP_BY_ORIGIN_STATE = "group_by_origin_state"
    public static final String DATASET_PROJECT_WORK_ITEM_TYPE = "project_work_item_type"
    public static final String DATASET_PROJECT_WORK_ITEM_TYPE_NOT_BUG = "project_work_item_type_not_bug"
    private static WorkItemType _instance;
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
    def create(WorkItemTypeDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(WorkItemTypeDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE, dto)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    def remove(List<String> keys) throws Throwable {
        this.execute(ACTION_REMOVE, keys)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    def get(String key) throws Throwable {
        return this.execute(ACTION_GET, key)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    def getDraft(WorkItemTypeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(WorkItemTypeDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(WorkItemTypeDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(WorkItemTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：选择变更工作项类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_TARGET_TYPE)
    def fetchChooseTargetType(WorkItemTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_TARGET_TYPE, context)
    }

    /**
     * 数据集：当前项目工作项类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PROJECT_TYPE)
    def fetchCurProjectType(WorkItemTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PROJECT_TYPE, context)
    }

    /**
     * 数据集：原始状态分组 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_GROUP_BY_ORIGIN_STATE)
    def fetchGroupByOriginState(WorkItemTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_GROUP_BY_ORIGIN_STATE, context)
    }

    /**
     * 数据集：项目工作项类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROJECT_WORK_ITEM_TYPE)
    def fetchProjectWorkItemType(WorkItemTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROJECT_WORK_ITEM_TYPE, context)
    }

    /**
     * 数据集：非缺陷的工作项类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROJECT_WORK_ITEM_TYPE_NOT_BUG)
    def fetchProjectWorkItemTypeNotBug(WorkItemTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROJECT_WORK_ITEM_TYPE_NOT_BUG, context)
    }

}