package cn.ibizlab.plm.prodmgmt.ticket

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.prodmgmt.ticket.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[TICKET]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Ticket extends GroovyDynaDataEntityRuntime<Ticket,TicketDTO,TicketFilterDTO> {

    public static final String ACTION_ACTIVATE = "activate"
    public static final String ACTION_ALLOCATE_PERSON = "allocate_person"
    public static final String ACTION_ARCHIVE = "archive"
    public static final String ACTION_CHOOSE_TAG = "choose_tag"
    public static final String ACTION_CUSTOMER_CHOOSE_TICKET = "customer_choose_ticket"
    public static final String ACTION_CUSTOMER_DEL_TICKET = "customer_del_ticket"
    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_MOB_TICKET_ATTENTION = "mob_ticket_attention"
    public static final String ACTION_OTHERS_RELATION_TICKET = "others_relation_ticket"
    public static final String ACTION_PRODUCT_TICKET_RE_COUNTERS = "product_ticket_re_counters"
    public static final String ACTION_RECOVER = "recover"
    public static final String ACTION_TEST_GET_ARCHIVED_INFO = "test_get_archived_info"
    public static final String ACTION_TICKET_READONLY_RECOGNIZE = "ticket_readonly_recognize"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ADMIN = "admin"
    public static final String DATASET_ADVANCED_SEARCH = "advanced_search"
    public static final String DATASET_ARCHIVED = "archived"
    public static final String DATASET_BI_DETAIL = "bi_detail"
    public static final String DATASET_BI_SEARCH = "bi_search"
    public static final String DATASET_COMMENT_NOTIFY_ASSIGNEE = "comment_notify_assignee"
    public static final String DATASET_COMMON = "common"
    public static final String DATASET_CUSTOMER_NOTRE_TICKET = "customer_notre_ticket"
    public static final String DATASET_CUSTOMER_RELATION_TICKET = "customer_relation_ticket"
    public static final String DATASET_CUSTOMER_USER = "customer_user"
    public static final String DATASET_DELETED = "deleted"
    public static final String DATASET_IDEA_RELATION_TICKET = "idea_relation_ticket"
    public static final String DATASET_IDEAS_RELATION_TICKET = "ideas_relation_ticket"
    public static final String DATASET_MOB_TICKET_LIST = "mob_ticket_list"
    public static final String DATASET_MY_ASSIGN = "my_assign"
    public static final String DATASET_MY_ASSIGNEE_COUNT = "my_assignee_count"
    public static final String DATASET_MY_ATTENTION = "my_attention"
    public static final String DATASET_MY_CREATED = "my_created"
    public static final String DATASET_MY_FILTER = "my_filter"
    public static final String DATASET_MY_SUMMARY_TICKET = "my_summary_ticket"
    public static final String DATASET_NORMAL = "normal"
    public static final String DATASET_NOT_EXSISTS_RELATION = "not_exsists_relation"
    public static final String DATASET_NOTIFY_ASSIGNEE = "notify_assignee"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_RECENT_TICKET = "recent_ticket"
    public static final String DATASET_RELATION_TICKET = "relation_ticket"
    public static final String DATASET_TICKET_RE_PRODUCT_TAG = "ticket_re_product_tag"
    public static final String DATASET_TICKET_RELATION_TICKET = "ticket_relation_ticket"
    public static final String DATASET_TICKET_STATE_PIE_CHART = "ticket_state_pie_chart"
    public static final String DATASET_USER = "user"
    public static final String DATASET_WORK_ITEM_RELATION_TICKET = "work_item_relation_ticket"
    private static Ticket _instance
    void setInstance(Ticket instance) {
        _instance = instance
    }
    static Ticket getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    TicketDTO create(TicketDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, TicketDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    TicketDTO update(TicketDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, TicketDTO.class)
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
    TicketDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, TicketDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    TicketDTO getDraft(TicketDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, TicketDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(TicketDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    TicketDTO save(TicketDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, TicketDTO.class)
    }

    /**
     * 行为：激活 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ACTIVATE)
    def activate(TicketDTO dto) throws Throwable {
        this.execute(ACTION_ACTIVATE, dto, TicketDTO.class)
    }

    /**
     * 行为：分配负责人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ALLOCATE_PERSON)
    def allocatePerson(TicketDTO dto) throws Throwable {
        this.execute(ACTION_ALLOCATE_PERSON, dto, TicketDTO.class)
    }

    /**
     * 行为：归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ARCHIVE)
    def archive(TicketDTO dto) throws Throwable {
        this.execute(ACTION_ARCHIVE, dto, TicketDTO.class)
    }

    /**
     * 行为：设置标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHOOSE_TAG)
    def chooseTag(TicketDTO dto) throws Throwable {
        this.execute(ACTION_CHOOSE_TAG, dto, TicketDTO.class)
    }

    /**
     * 行为：客户选择工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CUSTOMER_CHOOSE_TICKET)
    def customerChooseTicket(TicketDTO dto) throws Throwable {
        this.execute(ACTION_CUSTOMER_CHOOSE_TICKET, dto, TicketDTO.class)
    }

    /**
     * 行为：客户取消关联工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CUSTOMER_DEL_TICKET)
    def customerDelTicket(TicketDTO dto) throws Throwable {
        this.execute(ACTION_CUSTOMER_DEL_TICKET, dto, TicketDTO.class)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(TicketDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto, TicketDTO.class)
    }

    /**
     * 行为：工单关注（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOB_TICKET_ATTENTION)
    def mobTicketAttention(TicketDTO dto) throws Throwable {
        this.execute(ACTION_MOB_TICKET_ATTENTION, dto, TicketDTO.class)
    }

    /**
     * 行为：其他实体关联工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_OTHERS_RELATION_TICKET)
    def othersRelationTicket(TicketDTO dto) throws Throwable {
        this.execute(ACTION_OTHERS_RELATION_TICKET, dto, TicketDTO.class)
    }

    /**
     * 行为：产品工单关联分页计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PRODUCT_TICKET_RE_COUNTERS)
    def productTicketReCounters(TicketDTO dto) throws Throwable {
        this.execute(ACTION_PRODUCT_TICKET_RE_COUNTERS, dto, TicketDTO.class)
    }

    /**
     * 行为：恢复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER)
    def recover(TicketDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER, dto, TicketDTO.class)
    }

    /**
     * 行为：测试获取归档数据 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_TEST_GET_ARCHIVED_INFO)
    def testGetArchivedInfo(String key) throws Throwable {
        return this.execute(ACTION_TEST_GET_ARCHIVED_INFO, key, TicketDTO.class)
    }

    /**
     * 行为：工单只读用户判断 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_TICKET_READONLY_RECOGNIZE)
    def ticketReadonlyRecognize(TicketDTO dto) throws Throwable {
        this.execute(ACTION_TICKET_READONLY_RECOGNIZE, dto, TicketDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<TicketDTO> fetchDefault(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, TicketDTO.class)
    }

    /**
     * 数据集：管理员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADMIN)
    Page<TicketDTO> fetchAdmin(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADMIN, context, TicketDTO.class)
    }

    /**
     * 数据集：高级搜索 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADVANCED_SEARCH)
    Page<TicketAdvancedSearchDTO> fetchAdvancedSearch(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADVANCED_SEARCH, context, TicketAdvancedSearchDTO.class)
    }

    /**
     * 数据集：已归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ARCHIVED)
    Page<TicketDTO> fetchArchived(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ARCHIVED, context, TicketDTO.class)
    }

    /**
     * 数据集：BI反查 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_DETAIL)
    Page<TicketDTO> fetchBiDetail(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_DETAIL, context, TicketDTO.class)
    }

    /**
     * 数据集：BI查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    Page<TicketBiSearchGroupDTO> fetchBiSearch(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context, TicketBiSearchGroupDTO.class)
    }

    /**
     * 数据集：评论通知负责人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMENT_NOTIFY_ASSIGNEE)
    Page<TicketAssigneeDTO> fetchCommentNotifyAssignee(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMENT_NOTIFY_ASSIGNEE, context, TicketAssigneeDTO.class)
    }

    /**
     * 数据集：普通工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMON)
    Page<TicketDTO> fetchCommon(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMON, context, TicketDTO.class)
    }

    /**
     * 数据集：客户未关联工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUSTOMER_NOTRE_TICKET)
    Page<TicketDTO> fetchCustomerNotreTicket(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUSTOMER_NOTRE_TICKET, context, TicketDTO.class)
    }

    /**
     * 数据集：客户关联工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUSTOMER_RELATION_TICKET)
    Page<TicketDTO> fetchCustomerRelationTicket(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUSTOMER_RELATION_TICKET, context, TicketDTO.class)
    }

    /**
     * 数据集：特定用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUSTOMER_USER)
    Page<TicketDTO> fetchCustomerUser(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUSTOMER_USER, context, TicketDTO.class)
    }

    /**
     * 数据集：已删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DELETED)
    Page<TicketDTO> fetchDeleted(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DELETED, context, TicketDTO.class)
    }

    /**
     * 数据集：产品需求关联工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_RELATION_TICKET)
    Page<TicketDTO> fetchIdeaRelationTicket(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_RELATION_TICKET, context, TicketDTO.class)
    }

    /**
     * 数据集：关联工单（多需求） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEAS_RELATION_TICKET)
    Page<TicketDTO> fetchIdeasRelationTicket(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEAS_RELATION_TICKET, context, TicketDTO.class)
    }

    /**
     * 数据集：产品工单集合（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_TICKET_LIST)
    Page<TicketDTO> fetchMobTicketList(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_TICKET_LIST, context, TicketDTO.class)
    }

    /**
     * 数据集：我负责的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ASSIGN)
    Page<TicketDTO> fetchMyAssign(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ASSIGN, context, TicketDTO.class)
    }

    /**
     * 数据集：我负责的工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ASSIGNEE_COUNT)
    Page<TicketDTO> fetchMyAssigneeCount(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ASSIGNEE_COUNT, context, TicketDTO.class)
    }

    /**
     * 数据集：我关注的工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ATTENTION)
    Page<TicketDTO> fetchMyAttention(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ATTENTION, context, TicketDTO.class)
    }

    /**
     * 数据集：我创建的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_CREATED)
    Page<TicketDTO> fetchMyCreated(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_CREATED, context, TicketDTO.class)
    }

    /**
     * 数据集：过滤器默认查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_FILTER)
    Page<TicketDTO> fetchMyFilter(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_FILTER, context, TicketDTO.class)
    }

    /**
     * 数据集：我的事项工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_SUMMARY_TICKET)
    Page<TicketDTO> fetchMySummaryTicket(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_SUMMARY_TICKET, context, TicketDTO.class)
    }

    /**
     * 数据集：正常状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    Page<TicketDTO> fetchNormal(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context, TicketDTO.class)
    }

    /**
     * 数据集：未关联的工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_EXSISTS_RELATION)
    Page<TicketDTO> fetchNotExsistsRelation(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_EXSISTS_RELATION, context, TicketDTO.class)
    }

    /**
     * 数据集：工单通知负责人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOTIFY_ASSIGNEE)
    Page<TicketAssigneeDTO> fetchNotifyAssignee(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOTIFY_ASSIGNEE, context, TicketAssigneeDTO.class)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<TicketDTO> fetchReader(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, TicketDTO.class)
    }

    /**
     * 数据集：最近浏览 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_TICKET)
    Page<TicketDTO> fetchRecentTicket(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_TICKET, context, TicketDTO.class)
    }

    /**
     * 数据集：关联工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELATION_TICKET)
    Page<TicketDTO> fetchRelationTicket(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELATION_TICKET, context, TicketDTO.class)
    }

    /**
     * 数据集：当前标签下工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TICKET_RE_PRODUCT_TAG)
    Page<TicketDTO> fetchTicketReProductTag(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TICKET_RE_PRODUCT_TAG, context, TicketDTO.class)
    }

    /**
     * 数据集：工单关联工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TICKET_RELATION_TICKET)
    Page<TicketDTO> fetchTicketRelationTicket(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TICKET_RELATION_TICKET, context, TicketDTO.class)
    }

    /**
     * 数据集：工单状态饼图数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TICKET_STATE_PIE_CHART)
    Page<TicketDTO> fetchTicketStatePieChart(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TICKET_STATE_PIE_CHART, context, TicketDTO.class)
    }

    /**
     * 数据集：普通用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    Page<TicketDTO> fetchUser(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context, TicketDTO.class)
    }

    /**
     * 数据集：工作项关联工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_RELATION_TICKET)
    Page<TicketDTO> fetchWorkItemRelationTicket(TicketFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_RELATION_TICKET, context, TicketDTO.class)
    }

}