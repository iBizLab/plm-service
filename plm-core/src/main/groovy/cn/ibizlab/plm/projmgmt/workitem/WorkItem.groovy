package cn.ibizlab.plm.projmgmt.workitem

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.workitem.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[WORK_ITEM]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class WorkItem extends GroovyDataEntityRuntime<WorkItem,WorkItemDTO,WorkItemFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_ACTIVATE = "activate"
    public static final String ACTION_ARCHIVE = "archive"
    public static final String ACTION_BOARD_MOVE_POSITION = "board_move_position"
    public static final String ACTION_CHANGE_ASSIGNEE = "change_assignee"
    public static final String ACTION_CHANGE_PARENT = "change_parent"
    public static final String ACTION_CHANGE_STATE = "change_state"
    public static final String ACTION_CHANGE_TIME = "change_time"
    public static final String ACTION_CHILD_DEL_RELATION = "child_del_relation"
    public static final String ACTION_CHOOSE_CHILD = "choose_child"
    public static final String ACTION_COPY = "copy"
    public static final String ACTION_COUNT_MY_TODO = "count_my_todo"
    public static final String ACTION_CREATE_PLAN_SNAPSHOT = "create_plan_snapshot"
    public static final String ACTION_CUSTOM_DRAFT = "custom_draft"
    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_FILL_NOT_COMPLETED_NUM = "fill_not_completed_num"
    public static final String ACTION_FILL_TYPE_OF_STATE = "fill_type_of_state"
    public static final String ACTION_FIX_COMMIT = "fix_commit"
    public static final String ACTION_GET_ATTENTION = "get_attention"
    public static final String ACTION_GET_BASELINE_NAME = "get_baseline_name"
    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String ACTION_MOVE_WORK_ITEM = "move_work_item"
    public static final String ACTION_OTHERS_RELATION_WORK_ITEM = "others_relation_work_item"
    public static final String ACTION_PLAN_WORK_ITEM = "plan_work_item"
    public static final String ACTION_PROJECT_RESOURCE_SETTING = "project_resource_setting"
    public static final String ACTION_RECOVER = "recover"
    public static final String ACTION_RESOURCE_MEMBER_SETTING = "resource_member_setting"
    public static final String ACTION_RESTORE_VERSION = "restore_version"
    public static final String ACTION_SET_DEFAULT_ENTRY = "set_default_entry"
    public static final String ACTION_SET_TYPE_BUG = "set_type_bug"
    public static final String ACTION_SHIFT_IN_KANBAN = "shift_in_kanban"
    public static final String ACTION_SHIFT_IN_RELEASE = "shift_in_release"
    public static final String ACTION_SHIFT_IN_SPRINT = "shift_in_sprint"
    public static final String ACTION_SHIFT_OUT_RELEASE = "shift_out_release"
    public static final String ACTION_SHIFT_OUT_SPRINT = "shift_out_sprint"
    public static final String ACTION_WORK_ITEM_RE_COUNTERS = "work_item_re_counters"
    public static final String ACTION_WORK_ITEM_READONLY_RECOGNIZE = "work_item_readonly_recognize"
    public static final String ACTION_WORK_ITEM_TEST_PLAN_PROJECT = "work_item_test_plan_project"
    public static final String ACTION_WORK_ITEM_TYPE_ID = "work_item_type_id"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ADVANCED_SEARCH = "advanced_search"
    public static final String DATASET_ARCHIVED = "archived"
    public static final String DATASET_BACKLOG_ACCUMULATE_FLOW = "backlog_accumulate_flow"
    public static final String DATASET_BACKLOG_AGE_REPORT = "backlog_age_report"
    public static final String DATASET_BACKLOG_DAILY_TREND = "backlog_daily_trend"
    public static final String DATASET_BACKLOG_PROPERTY_DISTRIBUTION = "backlog_property_distribution"
    public static final String DATASET_BACKLOG_STATE_DISTRIBUTION = "backlog_state_distribution"
    public static final String DATASET_BASELINE_CHOOSE_WORK_ITEM = "baseline_choose_work_item"
    public static final String DATASET_BASELINE_PLAN_WORK_ITEM = "baseline_plan_work_item"
    public static final String DATASET_BI_DETAIL = "bi_detail"
    public static final String DATASET_BI_SEARCH = "bi_search"
    public static final String DATASET_BUG = "bug"
    public static final String DATASET_BUG_DAILY_TIDE = "bug_daily_tide"
    public static final String DATASET_BUG_STATE_GROUP_GRID = "bug_state_group_grid"
    public static final String DATASET_CHANGE_PARENT = "change_parent"
    public static final String DATASET_CHILD = "child"
    public static final String DATASET_CHOOSE = "choose"
    public static final String DATASET_CHOOSE_CHILD = "choose_child"
    public static final String DATASET_CHOOSE_DEPENDENCY = "choose_dependency"
    public static final String DATASET_CHOOSE_PARENT_WORK_ITEM = "choose_parent_work_item"
    public static final String DATASET_COMMENT_NOTIFY_ASSIGNEE = "comment_notify_assignee"
    public static final String DATASET_COMMON = "common"
    public static final String DATASET_COMMON_BUG = "common_bug"
    public static final String DATASET_COMPLETE_TREND = "complete_trend"
    public static final String DATASET_DEFECT_AGE_REPORT = "defect_age_report"
    public static final String DATASET_DEFECT_PROPERTY_DISTRIBUTION = "defect_property_distribution"
    public static final String DATASET_DEFECT_TOTAL_TREND = "defect_total_trend"
    public static final String DATASET_DELETED = "deleted"
    public static final String DATASET_IDEA_RELATION_WORK_ITEM = "idea_relation_work_item"
    public static final String DATASET_KANBAN_USER_STAT = "kanban_user_stat"
    public static final String DATASET_MILESTONE = "milestone"
    public static final String DATASET_MOVE_WORK_ITEM = "move_work_item"
    public static final String DATASET_MY_ASSIGNEE = "my_assignee"
    public static final String DATASET_MY_ASSIGNEE_COUNT = "my_assignee_count"
    public static final String DATASET_MY_ATTENTION = "my_attention"
    public static final String DATASET_MY_CREATED = "my_created"
    public static final String DATASET_MY_FILTER = "my_filter"
    public static final String DATASET_MY_SUMMARY_BUG = "my_summary_bug"
    public static final String DATASET_MY_SUMMARY_OTHER = "my_summary_other"
    public static final String DATASET_MY_SUMMARY_TASK = "my_summary_task"
    public static final String DATASET_MY_TODO = "my_todo"
    public static final String DATASET_NO_BUG_WORK_ITEM = "no_bug_work_item"
    public static final String DATASET_NO_COMPLETED = "no_completed"
    public static final String DATASET_NORMAL = "normal"
    public static final String DATASET_NOT_EXSISTS_BUG_RELATION = "not_exsists_bug_relation"
    public static final String DATASET_NOT_EXSISTS_RELATION = "not_exsists_relation"
    public static final String DATASET_NOTBUG_EXSISTS_RELATION = "notbug_exsists_relation"
    public static final String DATASET_NOTIFY_ASSIGNEE = "notify_assignee"
    public static final String DATASET_OVERDUE_WORK_ITEM = "overdue_work_item"
    public static final String DATASET_OVERVIEW_CHART = "overview_chart"
    public static final String DATASET_PLAN_SNAPSHOT = "plan_snapshot"
    public static final String DATASET_PROJECT_RESOURCE = "project_resource"
    public static final String DATASET_PROPERTY_DISTRIBUTION = "property_distribution"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_RECENT_WORK_ITEM = "recent_work_item"
    public static final String DATASET_RELATION_WORK_ITEM = "relation_work_item"
    public static final String DATASET_RELEASE = "release"
    public static final String DATASET_RELEASE_PLAN = "release_plan"
    public static final String DATASET_RELEASE_WORK_ITEM_CHART = "release_work_item_chart"
    public static final String DATASET_REQUIRE_BURN_OUT = "require_burn_out"
    public static final String DATASET_REQUIREMENT = "requirement"
    public static final String DATASET_REQUIREMENT_TREE = "requirement_tree"
    public static final String DATASET_REQUIREMENT_TREE_OR_TILE = "requirement_tree_or_tile"
    public static final String DATASET_RESOURCE = "resource"
    public static final String DATASET_SEVEN_DAYS = "seven_days"
    public static final String DATASET_SPRINT_COMPLETED = "sprint_completed"
    public static final String DATASET_SPRINT_CONTRIBUTION = "sprint_contribution"
    public static final String DATASET_SPRINT_MEMBER_CHART = "sprint_member_chart"
    public static final String DATASET_SPRINT_USER_STAT = "sprint_user_stat"
    public static final String DATASET_SPRINT_WORK_ITEM_CHART = "sprint_work_item_chart"
    public static final String DATASET_TEMP_SPEED_REPORT = "temp_speed_report"
    public static final String DATASET_TEST_PLAN_RELATION_BUG = "test_plan_relation_bug"
    public static final String DATASET_TOP = "top"
    public static final String DATASET_TREE = "tree"
    public static final String DATASET_TREE_OR_TILE = "tree_or_tile"
    public static final String DATASET_UNDER_WORK = "under_work"
    public static final String DATASET_UNDER_WORK_RESOURCE = "under_work_resource"
    public static final String DATASET_WORK_ITEM_DISTRIBUTION = "work_item_distribution"
    public static final String DATASET_WORK_ITEM_TYPE = "work_item_type"
    private static WorkItem _instance;
    void setInstance(WorkItem instance) {
        _instance = instance
    }
    static WorkItem getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(WorkItemDTO dto) throws Throwable {
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
    def getDraft(WorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(WorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：激活 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ACTIVATE)
    def activate(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_ACTIVATE, dto)
    }

    /**
     * 行为：归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ARCHIVE)
    def archive(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_ARCHIVE, dto)
    }

    /**
     * 行为：看板工作项移动位置 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BOARD_MOVE_POSITION)
    def boardMovePosition(WorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_BOARD_MOVE_POSITION, dto)
    }

    /**
     * 行为：分配负责人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ASSIGNEE)
    def changeAssignee(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ASSIGNEE, dto)
    }

    /**
     * 行为：变更父工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_PARENT)
    def changeParent(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_PARENT, dto)
    }

    /**
     * 行为：变更状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_STATE)
    def changeState(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_STATE, dto)
    }

    /**
     * 行为：修改时间 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_TIME)
    def changeTime(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_TIME, dto)
    }

    /**
     * 行为：子工作项取消关联 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHILD_DEL_RELATION)
    def childDelRelation(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_CHILD_DEL_RELATION, dto)
    }

    /**
     * 行为：选择子工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHOOSE_CHILD)
    def chooseChild(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_CHOOSE_CHILD, dto)
    }

    /**
     * 行为：复制 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COPY)
    def copy(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_COPY, dto)
    }

    /**
     * 行为：首页待完成项计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COUNT_MY_TODO)
    def countMyTodo(WorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_COUNT_MY_TODO, dto)
    }

    /**
     * 行为：新建规划快照 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_PLAN_SNAPSHOT)
    def createPlanSnapshot(WorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE_PLAN_SNAPSHOT, dto)
    }

    /**
     * 行为：自定义draft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CUSTOM_DRAFT)
    def customDraft(WorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_CUSTOM_DRAFT, dto)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto)
    }

    /**
     * 行为：填充待完成事项数量 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILL_NOT_COMPLETED_NUM)
    def fillNotCompletedNum(WorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_FILL_NOT_COMPLETED_NUM, dto)
    }

    /**
     * 行为：填充状态的类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILL_TYPE_OF_STATE)
    def fillTypeOfState(WorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_FILL_TYPE_OF_STATE, dto)
    }

    /**
     * 行为：修复版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FIX_COMMIT)
    def fixCommit(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_FIX_COMMIT, dto)
    }

    /**
     * 行为：获取关注人 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_ATTENTION)
    def getAttention(String key) throws Throwable {
        return this.execute(ACTION_GET_ATTENTION, key)
    }

    /**
     * 行为：获取基线名称 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_BASELINE_NAME)
    def getBaselineName(String key) throws Throwable {
        return this.execute(ACTION_GET_BASELINE_NAME, key)
    }

    /**
     * 行为：移动排序工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(WorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_MOVE_ORDER, dto)
    }

    /**
     * 行为：移动工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_WORK_ITEM)
    def moveWorkItem(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_MOVE_WORK_ITEM, dto)
    }

    /**
     * 行为：其他实体关联工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_OTHERS_RELATION_WORK_ITEM)
    def othersRelationWorkItem(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_OTHERS_RELATION_WORK_ITEM, dto)
    }

    /**
     * 行为：规划工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PLAN_WORK_ITEM)
    def planWorkItem(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_PLAN_WORK_ITEM, dto)
    }

    /**
     * 行为：项目资源成员设置 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PROJECT_RESOURCE_SETTING)
    def projectResourceSetting(WorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_PROJECT_RESOURCE_SETTING, dto)
    }

    /**
     * 行为：恢复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER)
    def recover(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER, dto)
    }

    /**
     * 行为：资源成员设置 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RESOURCE_MEMBER_SETTING)
    def resourceMemberSetting(WorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_RESOURCE_MEMBER_SETTING, dto)
    }

    /**
     * 行为：恢复到历史版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RESTORE_VERSION)
    def restoreVersion(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_RESTORE_VERSION, dto)
    }

    /**
     * 行为：选择看板后填充默认看板栏 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_DEFAULT_ENTRY)
    def setDefaultEntry(WorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_SET_DEFAULT_ENTRY, dto)
    }

    /**
     * 行为：设置缺陷类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_TYPE_BUG)
    def setTypeBug(WorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_SET_TYPE_BUG, dto)
    }

    /**
     * 行为：移入看板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHIFT_IN_KANBAN)
    def shiftInKanban(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_SHIFT_IN_KANBAN, dto)
    }

    /**
     * 行为：移入发布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHIFT_IN_RELEASE)
    def shiftInRelease(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_SHIFT_IN_RELEASE, dto)
    }

    /**
     * 行为：移入迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHIFT_IN_SPRINT)
    def shiftInSprint(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_SHIFT_IN_SPRINT, dto)
    }

    /**
     * 行为：移出发布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHIFT_OUT_RELEASE)
    def shiftOutRelease(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_SHIFT_OUT_RELEASE, dto)
    }

    /**
     * 行为：移出迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHIFT_OUT_SPRINT)
    def shiftOutSprint(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_SHIFT_OUT_SPRINT, dto)
    }

    /**
     * 行为：工作项关联分页计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_WORK_ITEM_RE_COUNTERS)
    def workItemReCounters(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_WORK_ITEM_RE_COUNTERS, dto)
    }

    /**
     * 行为：工作项只读用户判断 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_WORK_ITEM_READONLY_RECOGNIZE)
    def workItemReadonlyRecognize(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_WORK_ITEM_READONLY_RECOGNIZE, dto)
    }

    /**
     * 行为：获取测试计划对应项目 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_WORK_ITEM_TEST_PLAN_PROJECT)
    def workItemTestPlanProject(WorkItemDTO dto) throws Throwable {
        this.execute(ACTION_WORK_ITEM_TEST_PLAN_PROJECT, dto)
    }

    /**
     * 行为：获取工作项类型 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_WORK_ITEM_TYPE_ID)
    def workItemTypeId(String key) throws Throwable {
        return this.execute(ACTION_WORK_ITEM_TYPE_ID, key)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：高级搜索 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADVANCED_SEARCH)
    def fetchAdvancedSearch(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADVANCED_SEARCH, context)
    }

    /**
     * 数据集：已归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ARCHIVED)
    def fetchArchived(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ARCHIVED, context)
    }

    /**
     * 数据集：需求累计流图 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BACKLOG_ACCUMULATE_FLOW)
    def fetchBacklogAccumulateFlow(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BACKLOG_ACCUMULATE_FLOW, context)
    }

    /**
     * 数据集：需求年龄报告 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BACKLOG_AGE_REPORT)
    def fetchBacklogAgeReport(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BACKLOG_AGE_REPORT, context)
    }

    /**
     * 数据集：需求每日趋势 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BACKLOG_DAILY_TREND)
    def fetchBacklogDailyTrend(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BACKLOG_DAILY_TREND, context)
    }

    /**
     * 数据集：需求属性分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BACKLOG_PROPERTY_DISTRIBUTION)
    def fetchBacklogPropertyDistribution(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BACKLOG_PROPERTY_DISTRIBUTION, context)
    }

    /**
     * 数据集：需求状态分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BACKLOG_STATE_DISTRIBUTION)
    def fetchBacklogStateDistribution(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BACKLOG_STATE_DISTRIBUTION, context)
    }

    /**
     * 数据集：基线选择工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_CHOOSE_WORK_ITEM)
    def fetchBaselineChooseWorkItem(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_CHOOSE_WORK_ITEM, context)
    }

    /**
     * 数据集：基线规划工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_PLAN_WORK_ITEM)
    def fetchBaselinePlanWorkItem(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_PLAN_WORK_ITEM, context)
    }

    /**
     * 数据集：BI反查 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_DETAIL)
    def fetchBiDetail(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_DETAIL, context)
    }

    /**
     * 数据集：BI查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    def fetchBiSearch(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context)
    }

    /**
     * 数据集：缺陷工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BUG)
    def fetchBug(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BUG, context)
    }

    /**
     * 数据集：缺陷每日趋势 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BUG_DAILY_TIDE)
    def fetchBugDailyTide(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BUG_DAILY_TIDE, context)
    }

    /**
     * 数据集：缺陷状态分布表格 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BUG_STATE_GROUP_GRID)
    def fetchBugStateGroupGrid(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BUG_STATE_GROUP_GRID, context)
    }

    /**
     * 数据集：变更父工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHANGE_PARENT)
    def fetchChangeParent(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHANGE_PARENT, context)
    }

    /**
     * 数据集：查询子工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHILD)
    def fetchChild(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHILD, context)
    }

    /**
     * 数据集：选择工作项(规划计划) 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE)
    def fetchChoose(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE, context)
    }

    /**
     * 数据集：选择子工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_CHILD)
    def fetchChooseChild(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_CHILD, context)
    }

    /**
     * 数据集：选择依赖 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_DEPENDENCY)
    def fetchChooseDependency(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_DEPENDENCY, context)
    }

    /**
     * 数据集：选择父工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_PARENT_WORK_ITEM)
    def fetchChooseParentWorkItem(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_PARENT_WORK_ITEM, context)
    }

    /**
     * 数据集：评论通知负责人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMENT_NOTIFY_ASSIGNEE)
    def fetchCommentNotifyAssignee(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMENT_NOTIFY_ASSIGNEE, context)
    }

    /**
     * 数据集：普通工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMON)
    def fetchCommon(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMON, context)
    }

    /**
     * 数据集：普通状态缺陷 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMON_BUG)
    def fetchCommonBug(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMON_BUG, context)
    }

    /**
     * 数据集：工作项完成趋势 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMPLETE_TREND)
    def fetchCompleteTrend(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMPLETE_TREND, context)
    }

    /**
     * 数据集：缺陷年龄报告 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFECT_AGE_REPORT)
    def fetchDefectAgeReport(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFECT_AGE_REPORT, context)
    }

    /**
     * 数据集：缺陷属性分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFECT_PROPERTY_DISTRIBUTION)
    def fetchDefectPropertyDistribution(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFECT_PROPERTY_DISTRIBUTION, context)
    }

    /**
     * 数据集：缺陷累计趋势 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFECT_TOTAL_TREND)
    def fetchDefectTotalTrend(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFECT_TOTAL_TREND, context)
    }

    /**
     * 数据集：已删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DELETED)
    def fetchDeleted(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DELETED, context)
    }

    /**
     * 数据集：需求关联工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_RELATION_WORK_ITEM)
    def fetchIdeaRelationWorkItem(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_RELATION_WORK_ITEM, context)
    }

    /**
     * 数据集：kanban成员负荷报告 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_KANBAN_USER_STAT)
    def fetchKanbanUserStat(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_KANBAN_USER_STAT, context)
    }

    /**
     * 数据集：里程碑 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MILESTONE)
    def fetchMilestone(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MILESTONE, context)
    }

    /**
     * 数据集：移动工作项数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOVE_WORK_ITEM)
    def fetchMoveWorkItem(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOVE_WORK_ITEM, context)
    }

    /**
     * 数据集：我负责的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ASSIGNEE)
    def fetchMyAssignee(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ASSIGNEE, context)
    }

    /**
     * 数据集：我负责的（统计） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ASSIGNEE_COUNT)
    def fetchMyAssigneeCount(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ASSIGNEE_COUNT, context)
    }

    /**
     * 数据集：我关注的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ATTENTION)
    def fetchMyAttention(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ATTENTION, context)
    }

    /**
     * 数据集：我创建的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_CREATED)
    def fetchMyCreated(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_CREATED, context)
    }

    /**
     * 数据集：过滤器默认查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_FILTER)
    def fetchMyFilter(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_FILTER, context)
    }

    /**
     * 数据集：我的事项_缺陷数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_SUMMARY_BUG)
    def fetchMySummaryBug(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_SUMMARY_BUG, context)
    }

    /**
     * 数据集：我的事项_其他工作项数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_SUMMARY_OTHER)
    def fetchMySummaryOther(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_SUMMARY_OTHER, context)
    }

    /**
     * 数据集：我的事项_任务数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_SUMMARY_TASK)
    def fetchMySummaryTask(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_SUMMARY_TASK, context)
    }

    /**
     * 数据集：我待完成的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_TODO)
    def fetchMyTodo(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_TODO, context)
    }

    /**
     * 数据集：排除缺陷类型的工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_BUG_WORK_ITEM)
    def fetchNoBugWorkItem(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_BUG_WORK_ITEM, context)
    }

    /**
     * 数据集：未完成 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_COMPLETED)
    def fetchNoCompleted(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_COMPLETED, context)
    }

    /**
     * 数据集：正常状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    def fetchNormal(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context)
    }

    /**
     * 数据集：未关联的缺陷 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_EXSISTS_BUG_RELATION)
    def fetchNotExsistsBugRelation(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_EXSISTS_BUG_RELATION, context)
    }

    /**
     * 数据集：未关联的工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_EXSISTS_RELATION)
    def fetchNotExsistsRelation(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_EXSISTS_RELATION, context)
    }

    /**
     * 数据集：未关联工作项且不为缺陷 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOTBUG_EXSISTS_RELATION)
    def fetchNotbugExsistsRelation(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOTBUG_EXSISTS_RELATION, context)
    }

    /**
     * 数据集：工作项通知负责人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOTIFY_ASSIGNEE)
    def fetchNotifyAssignee(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOTIFY_ASSIGNEE, context)
    }

    /**
     * 数据集：逾期工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OVERDUE_WORK_ITEM)
    def fetchOverdueWorkItem(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OVERDUE_WORK_ITEM, context)
    }

    /**
     * 数据集：项目概览-工作项统计 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OVERVIEW_CHART)
    def fetchOverviewChart(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OVERVIEW_CHART, context)
    }

    /**
     * 数据集：新建规划快照时查询工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PLAN_SNAPSHOT)
    def fetchPlanSnapshot(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PLAN_SNAPSHOT, context)
    }

    /**
     * 数据集：项目资源分配 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROJECT_RESOURCE)
    def fetchProjectResource(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROJECT_RESOURCE, context)
    }

    /**
     * 数据集：需求分组过滤 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROPERTY_DISTRIBUTION)
    def fetchPropertyDistribution(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROPERTY_DISTRIBUTION, context)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    def fetchReader(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context)
    }

    /**
     * 数据集：最近浏览 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_WORK_ITEM)
    def fetchRecentWorkItem(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_WORK_ITEM, context)
    }

    /**
     * 数据集：关联工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELATION_WORK_ITEM)
    def fetchRelationWorkItem(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELATION_WORK_ITEM, context)
    }

    /**
     * 数据集：项目发布下工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELEASE)
    def fetchRelease(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELEASE, context)
    }

    /**
     * 数据集：项目发布规划工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELEASE_PLAN)
    def fetchReleasePlan(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELEASE_PLAN, context)
    }

    /**
     * 数据集：发布工作项统计 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELEASE_WORK_ITEM_CHART)
    def fetchReleaseWorkItemChart(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELEASE_WORK_ITEM_CHART, context)
    }

    /**
     * 数据集：需求数量燃尽图 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_REQUIRE_BURN_OUT)
    def fetchRequireBurnOut(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_REQUIRE_BURN_OUT, context)
    }

    /**
     * 数据集：需求工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_REQUIREMENT)
    def fetchRequirement(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_REQUIREMENT, context)
    }

    /**
     * 数据集：需求树表查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_REQUIREMENT_TREE)
    def fetchRequirementTree(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_REQUIREMENT_TREE, context)
    }

    /**
     * 数据集：需求工作项树状或平铺 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_REQUIREMENT_TREE_OR_TILE)
    def fetchRequirementTreeOrTile(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_REQUIREMENT_TREE_OR_TILE, context)
    }

    /**
     * 数据集：资源分配 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RESOURCE)
    def fetchResource(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RESOURCE, context)
    }

    /**
     * 数据集：七天内创建或完成的工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SEVEN_DAYS)
    def fetchSevenDays(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SEVEN_DAYS, context)
    }

    /**
     * 数据集：迭代下完成的工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPRINT_COMPLETED)
    def fetchSprintCompleted(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPRINT_COMPLETED, context)
    }

    /**
     * 数据集：迭代贡献度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPRINT_CONTRIBUTION)
    def fetchSprintContribution(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPRINT_CONTRIBUTION, context)
    }

    /**
     * 数据集：项目迭代成员查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPRINT_MEMBER_CHART)
    def fetchSprintMemberChart(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPRINT_MEMBER_CHART, context)
    }

    /**
     * 数据集：成员负荷报告（Scrum） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPRINT_USER_STAT)
    def fetchSprintUserStat(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPRINT_USER_STAT, context)
    }

    /**
     * 数据集：项目迭代工作项统计 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPRINT_WORK_ITEM_CHART)
    def fetchSprintWorkItemChart(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPRINT_WORK_ITEM_CHART, context)
    }

    /**
     * 数据集：团队速度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEMP_SPEED_REPORT)
    def fetchTempSpeedReport(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEMP_SPEED_REPORT, context)
    }

    /**
     * 数据集：测试计划关联缺陷 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_PLAN_RELATION_BUG)
    def fetchTestPlanRelationBug(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_PLAN_RELATION_BUG, context)
    }

    /**
     * 数据集：顶层工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TOP)
    def fetchTop(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TOP, context)
    }

    /**
     * 数据集：树表数据集合 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TREE)
    def fetchTree(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TREE, context)
    }

    /**
     * 数据集：工作项树状或平铺表格查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TREE_OR_TILE)
    def fetchTreeOrTile(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TREE_OR_TILE, context)
    }

    /**
     * 数据集：项目集工作下的工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_UNDER_WORK)
    def fetchUnderWork(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_UNDER_WORK, context)
    }

    /**
     * 数据集：项目集工作下的资源工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_UNDER_WORK_RESOURCE)
    def fetchUnderWorkResource(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_UNDER_WORK_RESOURCE, context)
    }

    /**
     * 数据集：工作项分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_DISTRIBUTION)
    def fetchWorkItemDistribution(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_DISTRIBUTION, context)
    }

    /**
     * 数据集：获取指定工作项的类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_TYPE)
    def fetchWorkItemType(WorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_TYPE, context)
    }

}