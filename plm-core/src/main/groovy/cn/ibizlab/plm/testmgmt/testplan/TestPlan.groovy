package cn.ibizlab.plm.testmgmt.testplan

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.testplan.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[TEST_PLAN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class TestPlan extends GroovyDataEntityRuntime<TestPlan,TestPlanDTO,TestPlanFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_DELETE_CATEGORIES = "delete_categories"
    public static final String ACTION_END_TEST_PLAN = "end_test_plan"
    public static final String ACTION_START_TEST_PLAN = "start_test_plan"
    public static final String ACTION_TEST_PLAN_REPORT_SURVEY = "test_plan_report_survey"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_BI_DETAIL = "bi_detail"
    public static final String DATASET_BI_SEARCH = "bi_search"
    public static final String DATASET_CUR_PROJECT = "cur_project"
    public static final String DATASET_MY_ASSIGNEE = "my_assignee"
    public static final String DATASET_MY_IN_PROGRESS = "my_in_progress"
    public static final String DATASET_MY_PARTICIPATE = "my_participate"
    public static final String DATASET_PENDING_AND_IN_PROGRESS = "pending_and_in_progress"
    public static final String DATASET_QUERY_NO_SHIFT_IN = "query_no_shift_in"
    public static final String DATASET_UN_JOIN_PLAN = "un_join_plan"
    private static TestPlan _instance;
    void setInstance(TestPlan instance) {
        _instance = instance
    }
    static TestPlan getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(TestPlanDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(TestPlanDTO dto) throws Throwable {
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
    def getDraft(TestPlanDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(TestPlanDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(TestPlanDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：删除类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_CATEGORIES)
    def deleteCategories(TestPlanDTO dto) throws Throwable {
        return this.execute(ACTION_DELETE_CATEGORIES, dto)
    }

    /**
     * 行为：结束测试 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_END_TEST_PLAN)
    def endTestPlan(TestPlanDTO dto) throws Throwable {
        this.execute(ACTION_END_TEST_PLAN, dto)
    }

    /**
     * 行为：开始测试 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_START_TEST_PLAN)
    def startTestPlan(TestPlanDTO dto) throws Throwable {
        this.execute(ACTION_START_TEST_PLAN, dto)
    }

    /**
     * 行为：测试报告概览数据源 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_TEST_PLAN_REPORT_SURVEY)
    def testPlanReportSurvey(String key) throws Throwable {
        return this.execute(ACTION_TEST_PLAN_REPORT_SURVEY, key)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(TestPlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：BI反查 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_DETAIL)
    def fetchBiDetail(TestPlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_DETAIL, context)
    }

    /**
     * 数据集：BI查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    def fetchBiSearch(TestPlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context)
    }

    /**
     * 数据集：当前项目 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PROJECT)
    def fetchCurProject(TestPlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PROJECT, context)
    }

    /**
     * 数据集：我负责的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ASSIGNEE)
    def fetchMyAssignee(TestPlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ASSIGNEE, context)
    }

    /**
     * 数据集：我的进行中的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_IN_PROGRESS)
    def fetchMyInProgress(TestPlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_IN_PROGRESS, context)
    }

    /**
     * 数据集：我参与的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_PARTICIPATE)
    def fetchMyParticipate(TestPlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_PARTICIPATE, context)
    }

    /**
     * 数据集：未开始和进行中的计划 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PENDING_AND_IN_PROGRESS)
    def fetchPendingAndInProgress(TestPlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PENDING_AND_IN_PROGRESS, context)
    }

    /**
     * 数据集：查询未移入过的计划 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_QUERY_NO_SHIFT_IN)
    def fetchQueryNoShiftIn(TestPlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_QUERY_NO_SHIFT_IN, context)
    }

    /**
     * 数据集：未加入计划 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_UN_JOIN_PLAN)
    def fetchUnJoinPlan(TestPlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_UN_JOIN_PLAN, context)
    }

}