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

    public static final String ACTION_ACTIVATE = "activate"
    public static final String ACTION_ARCHIVE = "archive"
    public static final String ACTION_CHANGE_STATE = "change_state"
    public static final String ACTION_CHOOSE_CASE_TEMPLATE = "choose_case_template"
    public static final String ACTION_DELETE = "delete"
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
    private static Idea _instance
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
    IdeaDTO create(IdeaDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IdeaDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IdeaDTO update(IdeaDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IdeaDTO.class)
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
    IdeaDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IdeaDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IdeaDTO getDraft(IdeaDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IdeaDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IdeaDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IdeaDTO save(IdeaDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IdeaDTO.class)
    }

    /**
     * 行为：激活 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ACTIVATE)
    def activate(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_ACTIVATE, dto, IdeaDTO.class)
    }

    /**
     * 行为：归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ARCHIVE)
    def archive(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_ARCHIVE, dto, IdeaDTO.class)
    }

    /**
     * 行为：变更需求状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_STATE)
    def changeState(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_STATE, dto, IdeaDTO.class)
    }

    /**
     * 行为：选择需求模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHOOSE_CASE_TEMPLATE)
    def chooseCaseTemplate(IdeaDTO dto) throws Throwable {
        return this.execute(ACTION_CHOOSE_CASE_TEMPLATE, dto, IdeaDTO.class)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto, IdeaDTO.class)
    }

    /**
     * 行为：获取基线名称 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_BASELINE_NAME)
    def getBaselineName(String key) throws Throwable {
        return this.execute(ACTION_GET_BASELINE_NAME, key, IdeaDTO.class)
    }

    /**
     * 行为：获取客户分数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_CUSTOMER_SCORE)
    def getCustomerScore(IdeaDTO dto) throws Throwable {
        return this.execute(ACTION_GET_CUSTOMER_SCORE, dto, IdeaDefGroupCommonDTO.class)
    }

    /**
     * 行为：获取工单数量 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_TICKET_NUM)
    def getTicketNum(String key) throws Throwable {
        return this.execute(ACTION_GET_TICKET_NUM, key, IdeaDTO.class)
    }

    /**
     * 行为：获取默认模块 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_IDEA_CATEGORY)
    def ideaCategory(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_IDEA_CATEGORY, dto, IdeaDTO.class)
    }

    /**
     * 行为：需求复制 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_IDEA_COPY)
    def ideaCopy(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_IDEA_COPY, dto, IdeaDTO.class)
    }

    /**
     * 行为：需求移动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_IDEA_MOVE)
    def ideaMove(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_IDEA_MOVE, dto, IdeaDTO.class)
    }

    /**
     * 行为：需求排期 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_IDEA_RE_PLAN)
    def ideaRePlan(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_IDEA_RE_PLAN, dto, IdeaDTO.class)
    }

    /**
     * 行为：需求只读用户判断 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_IDEA_READONLY_RECOGNIZE)
    def ideaReadonlyRecognize(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_IDEA_READONLY_RECOGNIZE, dto, IdeaDTO.class)
    }

    /**
     * 行为：需求关注（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOB_IDEA_ATTENTION)
    def mobIdeaAttention(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_MOB_IDEA_ATTENTION, dto, IdeaDTO.class)
    }

    /**
     * 行为：移动需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(IdeaDTO dto) throws Throwable {
        return this.executeForList(ACTION_MOVE_ORDER, dto, IdeaDTO.class)
    }

    /**
     * 行为：其他实体关联需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_OTHERS_RELATION_IDEA)
    def othersRelationIdea(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_OTHERS_RELATION_IDEA, dto, IdeaDTO.class)
    }

    /**
     * 行为：计划取消关联需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PLAN_DELETE_IDEA)
    def planDeleteIdea(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_PLAN_DELETE_IDEA, dto, IdeaDTO.class)
    }

    /**
     * 行为：产品需求关联分页计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PRODUCT_IDEA_RE_COUNTERS)
    def productIdeaReCounters(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_PRODUCT_IDEA_RE_COUNTERS, dto, IdeaDTO.class)
    }

    /**
     * 行为：恢复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER)
    def recover(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER, dto, IdeaDTO.class)
    }

    /**
     * 行为：更新需求进度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE_IDEA_PROGRESS)
    def updateIdeaProgress(IdeaDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE_IDEA_PROGRESS, dto, IdeaDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<IdeaDTO> fetchDefault(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, IdeaDTO.class)
    }

    /**
     * 数据集：管理员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADMIN)
    Page<IdeaDTO> fetchAdmin(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADMIN, context, IdeaDTO.class)
    }

    /**
     * 数据集：高级搜索 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADVANCED_SEARCH)
    Page<IdeaAdvancedSearchDTO> fetchAdvancedSearch(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADVANCED_SEARCH, context, IdeaAdvancedSearchDTO.class)
    }

    /**
     * 数据集：已归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ARCHIVED)
    Page<IdeaDTO> fetchArchived(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ARCHIVED, context, IdeaDTO.class)
    }

    /**
     * 数据集：基线选择需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_CHOOSE_IDEA)
    Page<IdeaDTO> fetchBaselineChooseIdea(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_CHOOSE_IDEA, context, IdeaDTO.class)
    }

    /**
     * 数据集：基线规划需求数据查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_PLAN_IDEA)
    Page<IdeaDTO> fetchBaselinePlanIdea(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_PLAN_IDEA, context, IdeaDTO.class)
    }

    /**
     * 数据集：BI反查 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_DETAIL)
    Page<IdeaDTO> fetchBiDetail(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_DETAIL, context, IdeaDTO.class)
    }

    /**
     * 数据集：BI查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    Page<IdeaBiSearchGroupDTO> fetchBiSearch(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context, IdeaBiSearchGroupDTO.class)
    }

    /**
     * 数据集：评论通知负责人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMENT_NOTIFY_ASSIGNEE)
    Page<IdeaAssigneeDTO> fetchCommentNotifyAssignee(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMENT_NOTIFY_ASSIGNEE, context, IdeaAssigneeDTO.class)
    }

    /**
     * 数据集：普通需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMON)
    Page<IdeaDTO> fetchCommon(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMON, context, IdeaDTO.class)
    }

    /**
     * 数据集：特定用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUSTOMER_USER)
    Page<IdeaDTO> fetchCustomerUser(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUSTOMER_USER, context, IdeaDTO.class)
    }

    /**
     * 数据集：已删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DELETED)
    Page<IdeaDTO> fetchDeleted(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DELETED, context, IdeaDTO.class)
    }

    /**
     * 数据集：需求未归档集合过滤（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_NOT_ARCHIVED)
    Page<IdeaDTO> fetchMobNotArchived(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_NOT_ARCHIVED, context, IdeaDTO.class)
    }

    /**
     * 数据集：移动需求数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOVE_IDEA)
    Page<IdeaDTO> fetchMoveIdea(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOVE_IDEA, context, IdeaDTO.class)
    }

    /**
     * 数据集：我负责的产品需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ASSIGN)
    Page<IdeaDTO> fetchMyAssign(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ASSIGN, context, IdeaDTO.class)
    }

    /**
     * 数据集：我负责的需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ASSIGNEE_COUNT)
    Page<IdeaDTO> fetchMyAssigneeCount(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ASSIGNEE_COUNT, context, IdeaDTO.class)
    }

    /**
     * 数据集：我关注的需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ATTENTION)
    Page<IdeaDTO> fetchMyAttention(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ATTENTION, context, IdeaDTO.class)
    }

    /**
     * 数据集：我创建的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_CREATED)
    Page<IdeaDTO> fetchMyCreated(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_CREATED, context, IdeaDTO.class)
    }

    /**
     * 数据集：过滤器默认查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_FILTER)
    Page<IdeaDTO> fetchMyFilter(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_FILTER, context, IdeaDTO.class)
    }

    /**
     * 数据集：我的事项需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_SUMMARY_IDEA)
    Page<IdeaDTO> fetchMySummaryIdea(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_SUMMARY_IDEA, context, IdeaDTO.class)
    }

    /**
     * 数据集：正常状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    Page<IdeaDTO> fetchNormal(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context, IdeaDTO.class)
    }

    /**
     * 数据集：未关联的需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_EXSISTS_RELATION)
    Page<IdeaDTO> fetchNotExsistsRelation(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_EXSISTS_RELATION, context, IdeaDTO.class)
    }

    /**
     * 数据集：需求通知负责人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOTIFY_ASSIGNEE)
    Page<IdeaAssigneeDTO> fetchNotifyAssignee(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOTIFY_ASSIGNEE, context, IdeaAssigneeDTO.class)
    }

    /**
     * 数据集：计划关联需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PLAN_RELATION_IDEA)
    Page<IdeaDTO> fetchPlanRelationIdea(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PLAN_RELATION_IDEA, context, IdeaDTO.class)
    }

    /**
     * 数据集：排期跟踪数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PLAN_TRACK_DATA)
    Page<IdeaDTO> fetchPlanTrackData(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PLAN_TRACK_DATA, context, IdeaDTO.class)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<IdeaDTO> fetchReader(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, IdeaDTO.class)
    }

    /**
     * 数据集：最近浏览 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_IDEA)
    Page<IdeaDTO> fetchRecentIdea(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_IDEA, context, IdeaDTO.class)
    }

    /**
     * 数据集：关联需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELATION_IDEA)
    Page<IdeaDTO> fetchRelationIdea(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELATION_IDEA, context, IdeaDTO.class)
    }

    /**
     * 数据集：普通用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    Page<IdeaDTO> fetchUser(IdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context, IdeaDTO.class)
    }

}