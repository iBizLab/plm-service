package cn.ibizlab.plm.prodmgmt.idea

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.prodmgmt.idea.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IDEA]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Idea extends GroovyDataEntityRuntime<Idea,IdeaDTO,IdeaFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_ACTIVATE = "activate"
    public static final String ACTION_ARCHIVE = "archive"
    public static final String ACTION_CHANGE_STATE = "change_state"
    public static final String ACTION_CHOOSE_CASE_TEMPLATE = "choose_case_template"
    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_GET_ATTENTION = "get_attention"
    public static final String ACTION_GET_BASELINE_NAME = "get_baseline_name"
    public static final String ACTION_GET_CUSTOMER_SCORE = "get_customer_score"
    public static final String ACTION_GET_TICKET_NUM = "get_ticket_num"
    public static final String ACTION_IDEA_CATEGORY = "idea_category"
    public static final String ACTION_IDEA_COPY = "idea_copy"
    public static final String ACTION_IDEA_MOVE = "idea_move"
    public static final String ACTION_IDEA_RE_PLAN = "idea_re_plan"
    public static final String ACTION_IDEA_READONLY_RECOGNIZE = "idea_readonly_recognize"
    public static final String ACTION_MOB_IDEA_ATTENTION = "mob_idea_attention"
    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String ACTION_OTHERS_RELATION_IDEA = "others_relation_idea"
    public static final String ACTION_PLAN_DELETE_IDEA = "plan_delete_idea"
    public static final String ACTION_PRODUCT_IDEA_RE_COUNTERS = "product_idea_re_counters"
    public static final String ACTION_RECOVER = "recover"
    public static final String ACTION_UPDATE_IDEA_PROGRESS = "update_idea_progress"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ADMIN = "admin"
    public static final String DATASET_ADVANCED_SEARCH = "advanced_search"
    public static final String DATASET_ARCHIVED = "archived"
    public static final String DATASET_BASELINE_CHOOSE_IDEA = "baseline_choose_idea"
    public static final String DATASET_BASELINE_PLAN_IDEA = "baseline_plan_idea"
    public static final String DATASET_BI_DETAIL = "bi_detail"
    public static final String DATASET_BI_SEARCH = "bi_search"
    public static final String DATASET_COMMENT_NOTIFY_ASSIGNEE = "comment_notify_assignee"
    public static final String DATASET_COMMON = "common"
    public static final String DATASET_CUSTOMER_USER = "customer_user"
    public static final String DATASET_DELETED = "deleted"
    public static final String DATASET_MOB_NOT_ARCHIVED = "mob_not_archived"
    public static final String DATASET_MOVE_IDEA = "move_idea"
    public static final String DATASET_MY_ASSIGN = "my_assign"
    public static final String DATASET_MY_ASSIGNEE_COUNT = "my_assignee_count"
    public static final String DATASET_MY_ATTENTION = "my_attention"
    public static final String DATASET_MY_CREATED = "my_created"
    public static final String DATASET_MY_FILTER = "my_filter"
    public static final String DATASET_MY_SUMMARY_IDEA = "my_summary_idea"
    public static final String DATASET_NORMAL = "normal"
    public static final String DATASET_NOT_EXSISTS_RELATION = "not_exsists_relation"
    public static final String DATASET_NOTIFY_ASSIGNEE = "notify_assignee"
    public static final String DATASET_PLAN_RELATION_IDEA = "plan_relation_idea"
    public static final String DATASET_PLAN_TRACK_DATA = "plan_track_data"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_RECENT_IDEA = "recent_idea"
    public static final String DATASET_RELATION_IDEA = "relation_idea"
    public static final String DATASET_USER = "user"
    private static Idea _instance;
    void setInstance(Idea instance) {
        _instance = instance
    }
    static Idea getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(IdeaDTO dto) throws Throwable {
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
    def getDraft(IdeaDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(IdeaDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：激活 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ACTIVATE)
    def activate(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_ACTIVATE, dto)
    }

    /**
     * 行为：归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ARCHIVE)
    def archive(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_ARCHIVE, dto)
    }

    /**
     * 行为：变更需求状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_STATE)
    def changeState(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_STATE, dto)
    }

    /**
     * 行为：选择需求模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHOOSE_CASE_TEMPLATE)
    def chooseCaseTemplate(IdeaDTO dto) throws Throwable {
        return this.execute(ACTION_CHOOSE_CASE_TEMPLATE, dto)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto)
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
     * 行为：获取客户分数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_CUSTOMER_SCORE)
    def getCustomerScore(IdeaDTO dto) throws Throwable {
        return this.execute(ACTION_GET_CUSTOMER_SCORE, dto)
    }

    /**
     * 行为：获取工单数量 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_TICKET_NUM)
    def getTicketNum(String key) throws Throwable {
        return this.execute(ACTION_GET_TICKET_NUM, key)
    }

    /**
     * 行为：获取默认模块 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_IDEA_CATEGORY)
    def ideaCategory(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_IDEA_CATEGORY, dto)
    }

    /**
     * 行为：需求复制 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_IDEA_COPY)
    def ideaCopy(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_IDEA_COPY, dto)
    }

    /**
     * 行为：需求移动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_IDEA_MOVE)
    def ideaMove(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_IDEA_MOVE, dto)
    }

    /**
     * 行为：需求排期 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_IDEA_RE_PLAN)
    def ideaRePlan(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_IDEA_RE_PLAN, dto)
    }

    /**
     * 行为：需求只读用户判断 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_IDEA_READONLY_RECOGNIZE)
    def ideaReadonlyRecognize(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_IDEA_READONLY_RECOGNIZE, dto)
    }

    /**
     * 行为：需求关注（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOB_IDEA_ATTENTION)
    def mobIdeaAttention(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_MOB_IDEA_ATTENTION, dto)
    }

    /**
     * 行为：移动需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(IdeaDTO dto) throws Throwable {
        return this.execute(ACTION_MOVE_ORDER, dto)
    }

    /**
     * 行为：其他实体关联需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_OTHERS_RELATION_IDEA)
    def othersRelationIdea(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_OTHERS_RELATION_IDEA, dto)
    }

    /**
     * 行为：计划取消关联需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PLAN_DELETE_IDEA)
    def planDeleteIdea(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_PLAN_DELETE_IDEA, dto)
    }

    /**
     * 行为：产品需求关联分页计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PRODUCT_IDEA_RE_COUNTERS)
    def productIdeaReCounters(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_PRODUCT_IDEA_RE_COUNTERS, dto)
    }

    /**
     * 行为：恢复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER)
    def recover(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER, dto)
    }

    /**
     * 行为：更新需求进度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE_IDEA_PROGRESS)
    def updateIdeaProgress(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE_IDEA_PROGRESS, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：管理员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADMIN)
    def fetchAdmin(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADMIN, context)
    }

    /**
     * 数据集：高级搜索 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADVANCED_SEARCH)
    def fetchAdvancedSearch(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADVANCED_SEARCH, context)
    }

    /**
     * 数据集：已归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ARCHIVED)
    def fetchArchived(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ARCHIVED, context)
    }

    /**
     * 数据集：基线选择需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_CHOOSE_IDEA)
    def fetchBaselineChooseIdea(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_CHOOSE_IDEA, context)
    }

    /**
     * 数据集：基线规划需求数据查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_PLAN_IDEA)
    def fetchBaselinePlanIdea(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_PLAN_IDEA, context)
    }

    /**
     * 数据集：BI反查 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_DETAIL)
    def fetchBiDetail(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_DETAIL, context)
    }

    /**
     * 数据集：BI查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    def fetchBiSearch(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context)
    }

    /**
     * 数据集：评论通知负责人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMENT_NOTIFY_ASSIGNEE)
    def fetchCommentNotifyAssignee(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMENT_NOTIFY_ASSIGNEE, context)
    }

    /**
     * 数据集：普通需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMON)
    def fetchCommon(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMON, context)
    }

    /**
     * 数据集：特定用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUSTOMER_USER)
    def fetchCustomerUser(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUSTOMER_USER, context)
    }

    /**
     * 数据集：已删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DELETED)
    def fetchDeleted(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DELETED, context)
    }

    /**
     * 数据集：需求未归档集合过滤（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_NOT_ARCHIVED)
    def fetchMobNotArchived(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_NOT_ARCHIVED, context)
    }

    /**
     * 数据集：移动需求数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOVE_IDEA)
    def fetchMoveIdea(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOVE_IDEA, context)
    }

    /**
     * 数据集：我负责的产品需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ASSIGN)
    def fetchMyAssign(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ASSIGN, context)
    }

    /**
     * 数据集：我负责的需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ASSIGNEE_COUNT)
    def fetchMyAssigneeCount(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ASSIGNEE_COUNT, context)
    }

    /**
     * 数据集：我关注的需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ATTENTION)
    def fetchMyAttention(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ATTENTION, context)
    }

    /**
     * 数据集：我创建的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_CREATED)
    def fetchMyCreated(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_CREATED, context)
    }

    /**
     * 数据集：过滤器默认查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_FILTER)
    def fetchMyFilter(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_FILTER, context)
    }

    /**
     * 数据集：我的事项需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_SUMMARY_IDEA)
    def fetchMySummaryIdea(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_SUMMARY_IDEA, context)
    }

    /**
     * 数据集：正常状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    def fetchNormal(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context)
    }

    /**
     * 数据集：未关联的需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_EXSISTS_RELATION)
    def fetchNotExsistsRelation(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_EXSISTS_RELATION, context)
    }

    /**
     * 数据集：需求通知负责人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOTIFY_ASSIGNEE)
    def fetchNotifyAssignee(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOTIFY_ASSIGNEE, context)
    }

    /**
     * 数据集：计划关联需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PLAN_RELATION_IDEA)
    def fetchPlanRelationIdea(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PLAN_RELATION_IDEA, context)
    }

    /**
     * 数据集：排期跟踪数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PLAN_TRACK_DATA)
    def fetchPlanTrackData(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PLAN_TRACK_DATA, context)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    def fetchReader(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context)
    }

    /**
     * 数据集：最近浏览 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_IDEA)
    def fetchRecentIdea(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_IDEA, context)
    }

    /**
     * 数据集：关联需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELATION_IDEA)
    def fetchRelationIdea(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELATION_IDEA, context)
    }

    /**
     * 数据集：普通用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    def fetchUser(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context)
    }

}