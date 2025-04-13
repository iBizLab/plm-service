package cn.ibizlab.plm.base.relation

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.relation.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RELATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Relation extends GroovyDataEntityRuntime<Relation,RelationDTO,RelationFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_ADD_DEPENDENCY = "add_dependency"
    public static final String ACTION_DEL_RELATION = "del_relation"
    public static final String ACTION_PROGRAM_TEST_CASE = "program_test_case"
    public static final String ACTION_RUN_DEL_RELATION_BUG = "run_del_relation_bug"
    public static final String ACTION_TEST_CASE_DEL_RELATION_BUG = "test_case_del_relation_bug"
    public static final String ACTION_WORK_ITEM_DEL_RELATION_CASE = "work_item_del_relation_case"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_DEPENDENCY = "dependency"
    public static final String DATASET_DEPENDENCY_WORK_ITEMS = "dependency_work_items"
    public static final String DATASET_EXISTS_RUN_RELATION_BUG = "exists_run_relation_bug"
    public static final String DATASET_IDEA_RE_CUSTOMER = "idea_re_customer"
    public static final String DATASET_IDEA_RE_IDEA = "idea_re_idea"
    public static final String DATASET_IDEA_RE_TEST_CASE = "idea_re_test_case"
    public static final String DATASET_IDEA_RE_TICKET = "idea_re_ticket"
    public static final String DATASET_IDEA_RE_WORK_ITEM = "idea_re_work_item"
    public static final String DATASET_IDEA_VERSION_RELATION = "idea_version_relation"
    public static final String DATASET_MY_RELATION = "my_relation"
    public static final String DATASET_PRODUCT_PLAN_IDEA = "product_plan_idea"
    public static final String DATASET_PRODUCT_RE_PROJECT = "product_re_project"
    public static final String DATASET_PROJECT_RE_PRODUCT = "project_re_product"
    public static final String DATASET_REVIEW_RE_TEST_CASE = "review_re_test_case"
    public static final String DATASET_RUN_RE_BUG = "run_re_bug"
    public static final String DATASET_RUN_RE_IDEA = "run_re_idea"
    public static final String DATASET_RUN_RE_WORK_ITEM = "run_re_work_item"
    public static final String DATASET_TEST_CASE_RE_BUG = "test_case_re_bug"
    public static final String DATASET_TEST_CASE_RE_IDEA = "test_case_re_idea"
    public static final String DATASET_TEST_CASE_RE_WORK_ITEM = "test_case_re_work_item"
    public static final String DATASET_TEST_CASE_VERSION_RELATION = "test_case_version_relation"
    public static final String DATASET_TICKET_RE_IDEA = "ticket_re_idea"
    public static final String DATASET_TICKET_RE_SELF = "ticket_re_self"
    public static final String DATASET_TICKET_RE_WORK_ITEM = "ticket_re_work_item"
    public static final String DATASET_WORK_ITEM_RELATION_IDEA = "work_item_relation_idea"
    public static final String DATASET_WORK_ITEM_RELATION_SELF = "work_item_relation_self"
    public static final String DATASET_WORK_ITEM_RELATION_TEST_CASE = "work_item_relation_test_case"
    public static final String DATASET_WORK_ITEM_RELATION_TICKET = "work_item_relation_ticket"
    public static final String DATASET_WORK_ITEM_VERSION_RELATION = "work_item_version_relation"
    private static Relation _instance;
    void setInstance(Relation instance) {
        _instance = instance
    }
    static Relation getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(RelationDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(RelationDTO dto) throws Throwable {
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
    def getDraft(RelationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(RelationDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(RelationDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：添加依赖 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_DEPENDENCY)
    def addDependency(RelationDTO dto) throws Throwable {
        return this.execute(ACTION_ADD_DEPENDENCY, dto)
    }

    /**
     * 行为：取消关联 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DEL_RELATION)
    def delRelation(RelationDTO dto) throws Throwable {
        this.execute(ACTION_DEL_RELATION, dto)
    }

    /**
     * 行为：规划用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PROGRAM_TEST_CASE)
    def programTestCase(RelationDTO dto) throws Throwable {
        return this.execute(ACTION_PROGRAM_TEST_CASE, dto)
    }

    /**
     * 行为：执行用例取消关联缺陷 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RUN_DEL_RELATION_BUG)
    def runDelRelationBug(RelationDTO dto) throws Throwable {
        this.execute(ACTION_RUN_DEL_RELATION_BUG, dto)
    }

    /**
     * 行为：测试用例取消关联缺陷 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_TEST_CASE_DEL_RELATION_BUG)
    def testCaseDelRelationBug(RelationDTO dto) throws Throwable {
        this.execute(ACTION_TEST_CASE_DEL_RELATION_BUG, dto)
    }

    /**
     * 行为：工作项取消关联测试用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_WORK_ITEM_DEL_RELATION_CASE)
    def workItemDelRelationCase(RelationDTO dto) throws Throwable {
        this.execute(ACTION_WORK_ITEM_DEL_RELATION_CASE, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    def fetchAll(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context)
    }

    /**
     * 数据集：工作项依赖 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEPENDENCY)
    def fetchDependency(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEPENDENCY, context)
    }

    /**
     * 数据集：工作项依赖 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEPENDENCY_WORK_ITEMS)
    def fetchDependencyWorkItems(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEPENDENCY_WORK_ITEMS, context)
    }

    /**
     * 数据集：测试用例下存在执行用例关联缺陷 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EXISTS_RUN_RELATION_BUG)
    def fetchExistsRunRelationBug(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EXISTS_RUN_RELATION_BUG, context)
    }

    /**
     * 数据集：需求关联客户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_RE_CUSTOMER)
    def fetchIdeaReCustomer(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_RE_CUSTOMER, context)
    }

    /**
     * 数据集：需求关联需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_RE_IDEA)
    def fetchIdeaReIdea(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_RE_IDEA, context)
    }

    /**
     * 数据集：需求关联测试用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_RE_TEST_CASE)
    def fetchIdeaReTestCase(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_RE_TEST_CASE, context)
    }

    /**
     * 数据集：需求关联工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_RE_TICKET)
    def fetchIdeaReTicket(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_RE_TICKET, context)
    }

    /**
     * 数据集：需求关联工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_RE_WORK_ITEM)
    def fetchIdeaReWorkItem(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_RE_WORK_ITEM, context)
    }

    /**
     * 数据集：版本需求关联数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_VERSION_RELATION)
    def fetchIdeaVersionRelation(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_VERSION_RELATION, context)
    }

    /**
     * 数据集：我的关联 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_RELATION)
    def fetchMyRelation(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_RELATION, context)
    }

    /**
     * 数据集：产品排期计划内关联事项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PRODUCT_PLAN_IDEA)
    def fetchProductPlanIdea(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PRODUCT_PLAN_IDEA, context)
    }

    /**
     * 数据集：产品关联项目 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PRODUCT_RE_PROJECT)
    def fetchProductReProject(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PRODUCT_RE_PROJECT, context)
    }

    /**
     * 数据集：项目关联产品 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROJECT_RE_PRODUCT)
    def fetchProjectReProduct(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROJECT_RE_PRODUCT, context)
    }

    /**
     * 数据集：评审关联测试用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_REVIEW_RE_TEST_CASE)
    def fetchReviewReTestCase(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_REVIEW_RE_TEST_CASE, context)
    }

    /**
     * 数据集：执行用例关联缺陷 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RUN_RE_BUG)
    def fetchRunReBug(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RUN_RE_BUG, context)
    }

    /**
     * 数据集：执行用例关联需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RUN_RE_IDEA)
    def fetchRunReIdea(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RUN_RE_IDEA, context)
    }

    /**
     * 数据集：执行用例关联工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RUN_RE_WORK_ITEM)
    def fetchRunReWorkItem(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RUN_RE_WORK_ITEM, context)
    }

    /**
     * 数据集：测试用例关联缺陷 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_CASE_RE_BUG)
    def fetchTestCaseReBug(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_CASE_RE_BUG, context)
    }

    /**
     * 数据集：测试用例关联需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_CASE_RE_IDEA)
    def fetchTestCaseReIdea(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_CASE_RE_IDEA, context)
    }

    /**
     * 数据集：测试用例关联工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_CASE_RE_WORK_ITEM)
    def fetchTestCaseReWorkItem(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_CASE_RE_WORK_ITEM, context)
    }

    /**
     * 数据集：版本用例关联数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_CASE_VERSION_RELATION)
    def fetchTestCaseVersionRelation(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_CASE_VERSION_RELATION, context)
    }

    /**
     * 数据集：工单关联产品需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TICKET_RE_IDEA)
    def fetchTicketReIdea(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TICKET_RE_IDEA, context)
    }

    /**
     * 数据集：工单关联工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TICKET_RE_SELF)
    def fetchTicketReSelf(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TICKET_RE_SELF, context)
    }

    /**
     * 数据集：工单关联工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TICKET_RE_WORK_ITEM)
    def fetchTicketReWorkItem(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TICKET_RE_WORK_ITEM, context)
    }

    /**
     * 数据集：工作项关联产品需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_RELATION_IDEA)
    def fetchWorkItemRelationIdea(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_RELATION_IDEA, context)
    }

    /**
     * 数据集：工作项关联工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_RELATION_SELF)
    def fetchWorkItemRelationSelf(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_RELATION_SELF, context)
    }

    /**
     * 数据集：工作项关联测试用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_RELATION_TEST_CASE)
    def fetchWorkItemRelationTestCase(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_RELATION_TEST_CASE, context)
    }

    /**
     * 数据集：工作项关联工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_RELATION_TICKET)
    def fetchWorkItemRelationTicket(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_RELATION_TICKET, context)
    }

    /**
     * 数据集：版本工作项关联数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_VERSION_RELATION)
    def fetchWorkItemVersionRelation(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_VERSION_RELATION, context)
    }

}