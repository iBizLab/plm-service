package cn.ibizlab.plm.prodmgmt.customer

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.prodmgmt.customer.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CUSTOMER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Customer extends GroovyDataEntityRuntime<Customer,CustomerDTO,CustomerFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_ADD_CATEGORIES = "add_categories"
    public static final String ACTION_CUSTOMER_CHOOSE_TICKET = "customer_choose_ticket"
    public static final String ACTION_CUSTOMER_READONLY_RECOGNIZE = "customer_readonly_recognize"
    public static final String ACTION_DEL_RELATION = "del_relation"
    public static final String ACTION_DELETE_CATEGORIES = "delete_categories"
    public static final String ACTION_GET_ATTENTION = "get_attention"
    public static final String ACTION_GET_IDEA_CUSTOMER_INFO = "get_idea_customer_info"
    public static final String ACTION_OTHERS_RELATION_CUSTOMER = "others_relation_customer"
    public static final String ACTION_PRODUCT_CUSTOMER_RE_COUNTERS = "product_customer_re_counters"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_COMMENT_NOTIFY_ASSIGNEE = "comment_notify_assignee"
    public static final String DATASET_IDEA_NOITRE_CUSTOMER = "idea_noitre_customer"
    public static final String DATASET_IDEA_RELATION_CUSTOMER = "idea_relation_customer"
    public static final String DATASET_NORMAL = "normal"
    public static final String DATASET_NOTIFY_ASSIGNEE = "notify_assignee"
    private static Customer _instance;
    void setInstance(Customer instance) {
        _instance = instance
    }
    static Customer getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(CustomerDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(CustomerDTO dto) throws Throwable {
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
    def getDraft(CustomerDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(CustomerDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(CustomerDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：添加至类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_CATEGORIES)
    def addCategories(CustomerDTO dto) throws Throwable {
        this.execute(ACTION_ADD_CATEGORIES, dto)
    }

    /**
     * 行为：客户选择工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CUSTOMER_CHOOSE_TICKET)
    def customerChooseTicket(CustomerDTO dto) throws Throwable {
        this.execute(ACTION_CUSTOMER_CHOOSE_TICKET, dto)
    }

    /**
     * 行为：客户只读用户判断 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CUSTOMER_READONLY_RECOGNIZE)
    def customerReadonlyRecognize(CustomerDTO dto) throws Throwable {
        this.execute(ACTION_CUSTOMER_READONLY_RECOGNIZE, dto)
    }

    /**
     * 行为：取消关联 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DEL_RELATION)
    def delRelation(CustomerDTO dto) throws Throwable {
        this.execute(ACTION_DEL_RELATION, dto)
    }

    /**
     * 行为：删除类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_CATEGORIES)
    def deleteCategories(CustomerDTO dto) throws Throwable {
        return this.execute(ACTION_DELETE_CATEGORIES, dto)
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
     * 行为：获取需求中客户的信息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_IDEA_CUSTOMER_INFO)
    def getIdeaCustomerInfo(CustomerDTO dto) throws Throwable {
        return this.execute(ACTION_GET_IDEA_CUSTOMER_INFO, dto)
    }

    /**
     * 行为：其他实体关联客户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_OTHERS_RELATION_CUSTOMER)
    def othersRelationCustomer(CustomerDTO dto) throws Throwable {
        this.execute(ACTION_OTHERS_RELATION_CUSTOMER, dto)
    }

    /**
     * 行为：产品客户关联分页计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PRODUCT_CUSTOMER_RE_COUNTERS)
    def productCustomerReCounters(CustomerDTO dto) throws Throwable {
        this.execute(ACTION_PRODUCT_CUSTOMER_RE_COUNTERS, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(CustomerFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：评论通知负责人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMENT_NOTIFY_ASSIGNEE)
    def fetchCommentNotifyAssignee(CustomerFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMENT_NOTIFY_ASSIGNEE, context)
    }

    /**
     * 数据集：需求未关联的客户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_NOITRE_CUSTOMER)
    def fetchIdeaNotreCustomer(CustomerFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_NOITRE_CUSTOMER, context)
    }

    /**
     * 数据集：需求关联客户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_RELATION_CUSTOMER)
    def fetchIdeaRelationCustomer(CustomerFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_RELATION_CUSTOMER, context)
    }

    /**
     * 数据集：正常状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    def fetchNormal(CustomerFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context)
    }

    /**
     * 数据集：客户通知负责人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOTIFY_ASSIGNEE)
    def fetchNotifyAssignee(CustomerFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOTIFY_ASSIGNEE, context)
    }

}