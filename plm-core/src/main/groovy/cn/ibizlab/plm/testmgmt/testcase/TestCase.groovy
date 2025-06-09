package cn.ibizlab.plm.testmgmt.testcase

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.testcase.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[TEST_CASE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class TestCase extends GroovyDataEntityRuntime<TestCase,TestCaseDTO,TestCaseFilterDTO> {

    public static final String ACTION_CASE_MOVE_PLAN = "case_move_plan"
    public static final String ACTION_CHOOSE_CASE_TEMPLATE = "choose_case_template"
    public static final String ACTION_COPY_CASE = "copy_case"
    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_FINISH_ADD_ATTENTION = "finish_add_attention"
    public static final String ACTION_GET_BASELINE_NAME = "get_baseline_name"
    public static final String ACTION_MOVE_CASE = "move_case"
    public static final String ACTION_NEWEST_RUN = "newest_run"
    public static final String ACTION_OTHERS_RELATION_CASE = "others_relation_case"
    public static final String ACTION_PROGRAM_TEST_CASE = "program_test_case"
    public static final String ACTION_RECOVER = "recover"
    public static final String ACTION_SET_LEVEL = "set_level"
    public static final String ACTION_SET_MAINTENANCE = "set_maintenance"
    public static final String ACTION_SET_STATE = "set_state"
    public static final String ACTION_TEST_CASE_RE_COUNTERS = "test_case_re_counters"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_IMPLEMENTATIONRESULTS = "ImplementationResults"
    public static final String DATASET_PERSONDISTRIBUTIONS = "PersonDistributions"
    public static final String DATASET_ADVANCED_SEARCH = "advanced_search"
    public static final String DATASET_ASSESSMENTRESULT = "assessmentResult"
    public static final String DATASET_BASELINE_CHOOSE_CASE = "baseline_choose_case"
    public static final String DATASET_BASELINE_PLAN_CASE = "baseline_plan_case"
    public static final String DATASET_BASELINE_TEST_CASE = "baseline_test_case"
    public static final String DATASET_BI_DETAIL = "bi_detail"
    public static final String DATASET_BI_SEARCH = "bi_search"
    public static final String DATASET_CASEPERSON = "casePerson"
    public static final String DATASET_CASETYPE = "caseType"
    public static final String DATASET_CHECK_REFRESH_DATA = "check_refresh_data"
    public static final String DATASET_COMMENT_NOTIFY_MAINTENANCE = "comment_notify_maintenance"
    public static final String DATASET_COMMON = "common"
    public static final String DATASET_DAILYTENDENCIES = "dailyTendencies"
    public static final String DATASET_DEGREEIMPORTANCE = "degreeImportance"
    public static final String DATASET_DELETED = "deleted"
    public static final String DATASET_EVERYDAYTEST = "everydayTest"
    public static final String DATASET_IDEA_RELATION_TEST_CASE = "idea_relation_test_case"
    public static final String DATASET_MY_ASSIGN = "my_assign"
    public static final String DATASET_MY_ASSIGNEE_COUNT_TEST_CASE = "my_assignee_count_test_case"
    public static final String DATASET_MY_ATTENTION = "my_attention"
    public static final String DATASET_MY_CREATED = "my_created"
    public static final String DATASET_MY_FILTER = "my_filter"
    public static final String DATASET_MY_SUMMARY_CASE = "my_summary_case"
    public static final String DATASET_NORMAL = "normal"
    public static final String DATASET_NOSUITE_TEST_CASE = "nosuite_test_case"
    public static final String DATASET_NOT_ADD_CASE = "not_add_case"
    public static final String DATASET_NOT_EXSISTS_RELATION = "not_exsists_relation"
    public static final String DATASET_NOTIFY_ASSIGNEE = "notify_assignee"
    public static final String DATASET_PRIORITYDISTRIBUTIONS = "priorityDistributions"
    public static final String DATASET_PROGRAM_ANALYZE = "program_analyze"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_RECENT_TEST_CASE = "recent_test_case"
    public static final String DATASET_RELATION_TEST_CASE = "relation_test_case"
    public static final String DATASET_REVIEW_DATA = "review_data"
    public static final String DATASET_THIS_SUITE_TEST_CASE = "this_suite_test_case"
    public static final String DATASET_TEST_CASE_MANEUVER_CONTEXT = "test_case_maneuver_context"
    public static final String DATASET_TEST_PLAN_TEST_CASE = "test_plan_test_case"
    public static final String DATASET_WORK_ITEM_RELATION_TEST_CASE = "work_item_relation_test_case"
    private static TestCase _instance
    void setInstance(TestCase instance) {
        _instance = instance
    }
    static TestCase getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    TestCaseDTO create(TestCaseDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, TestCaseDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    TestCaseDTO update(TestCaseDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, TestCaseDTO.class)
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
    TestCaseDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, TestCaseDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    TestCaseDTO getDraft(TestCaseDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, TestCaseDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(TestCaseDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    TestCaseDTO save(TestCaseDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, TestCaseDTO.class)
    }

    /**
     * 行为：移入计划 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CASE_MOVE_PLAN)
    def caseMovePlan(TestCaseDTO dto) throws Throwable {
        this.execute(ACTION_CASE_MOVE_PLAN, dto, TestCaseDTO.class)
    }

    /**
     * 行为：选择用例模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHOOSE_CASE_TEMPLATE)
    def chooseCaseTemplate(TestCaseDTO dto) throws Throwable {
        return this.execute(ACTION_CHOOSE_CASE_TEMPLATE, dto, TestCaseDTO.class)
    }

    /**
     * 行为：复制用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COPY_CASE)
    def copyCase(TestCaseDTO dto) throws Throwable {
        this.execute(ACTION_COPY_CASE, dto, TestCaseDTO.class)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(TestCaseDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto, TestCaseDTO.class)
    }

    /**
     * 行为：完成关注 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FINISH_ADD_ATTENTION)
    def finishAddAttention(TestCaseDTO dto) throws Throwable {
        this.execute(ACTION_FINISH_ADD_ATTENTION, dto, TestCaseDTO.class)
    }

    /**
     * 行为：获取基线名称 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_BASELINE_NAME)
    def getBaselineName(String key) throws Throwable {
        return this.execute(ACTION_GET_BASELINE_NAME, key, TestCaseDTO.class)
    }

    /**
     * 行为：移动用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_CASE)
    def moveCase(TestCaseDTO dto) throws Throwable {
        this.execute(ACTION_MOVE_CASE, dto, TestCaseDTO.class)
    }

    /**
     * 行为：获取最近执行 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_NEWEST_RUN)
    def newestRun(String key) throws Throwable {
        return this.execute(ACTION_NEWEST_RUN, key, TestCaseDTO.class)
    }

    /**
     * 行为：其他实体关联用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_OTHERS_RELATION_CASE)
    def othersRelationCase(TestCaseDTO dto) throws Throwable {
        this.execute(ACTION_OTHERS_RELATION_CASE, dto, TestCaseDTO.class)
    }

    /**
     * 行为：规划用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PROGRAM_TEST_CASE)
    def programTestCase(TestCaseDTO dto) throws Throwable {
        this.execute(ACTION_PROGRAM_TEST_CASE, dto, TestCaseDTO.class)
    }

    /**
     * 行为：恢复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER)
    def recover(TestCaseDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER, dto, TestCaseDTO.class)
    }

    /**
     * 行为：设置重要程度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_LEVEL)
    def setLevel(TestCaseDTO dto) throws Throwable {
        this.execute(ACTION_SET_LEVEL, dto, TestCaseDTO.class)
    }

    /**
     * 行为：设置维护人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_MAINTENANCE)
    def setMaintenance(TestCaseDTO dto) throws Throwable {
        this.execute(ACTION_SET_MAINTENANCE, dto, TestCaseDTO.class)
    }

    /**
     * 行为：设置评审状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_STATE)
    def setState(TestCaseDTO dto) throws Throwable {
        this.execute(ACTION_SET_STATE, dto, TestCaseDTO.class)
    }

    /**
     * 行为：测试用例关联分页计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_TEST_CASE_RE_COUNTERS)
    def testCaseReCounters(TestCaseDTO dto) throws Throwable {
        this.execute(ACTION_TEST_CASE_RE_COUNTERS, dto, TestCaseDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<TestCaseDTO> fetchDefault(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, TestCaseDTO.class)
    }

    /**
     * 数据集：执行结果分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IMPLEMENTATIONRESULTS)
    Page<TestCaseDTO> fetchImplementationResults(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IMPLEMENTATIONRESULTS, context, TestCaseDTO.class)
    }

    /**
     * 数据集：用例维护人分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PERSONDISTRIBUTIONS)
    Page<TestCaseDTO> fetchPersonDistributions(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PERSONDISTRIBUTIONS, context, TestCaseDTO.class)
    }

    /**
     * 数据集：高级搜索 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADVANCED_SEARCH)
    Page<TestCaseDTO> fetchAdvancedSearch(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADVANCED_SEARCH, context, TestCaseDTO.class)
    }

    /**
     * 数据集：评审结果分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ASSESSMENTRESULT)
    Page<TestCaseDTO> fetchAssessmentResult(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ASSESSMENTRESULT, context, TestCaseDTO.class)
    }

    /**
     * 数据集：基线选择用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_CHOOSE_CASE)
    Page<TestCaseDTO> fetchBaselineChooseCase(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_CHOOSE_CASE, context, TestCaseDTO.class)
    }

    /**
     * 数据集：基线规划用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_PLAN_CASE)
    Page<TestCaseDTO> fetchBaselinePlanCase(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_PLAN_CASE, context, TestCaseDTO.class)
    }

    /**
     * 数据集：基线用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_TEST_CASE)
    Page<TestCaseDTO> fetchBaselineTestCase(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_TEST_CASE, context, TestCaseDTO.class)
    }

    /**
     * 数据集：BI反查 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_DETAIL)
    Page<TestCaseDTO> fetchBiDetail(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_DETAIL, context, TestCaseDTO.class)
    }

    /**
     * 数据集：BI查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    Page<TestCaseBiSearchGroupDTO> fetchBiSearch(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context, TestCaseBiSearchGroupDTO.class)
    }

    /**
     * 数据集：用例成员分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CASEPERSON)
    Page<TestCaseDTO> fetchCasePerson(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CASEPERSON, context, TestCaseDTO.class)
    }

    /**
     * 数据集：用例类型分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CASETYPE)
    Page<TestCaseDTO> fetchCaseType(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CASETYPE, context, TestCaseDTO.class)
    }

    /**
     * 数据集：检查更新数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHECK_REFRESH_DATA)
    Page<TestCaseDTO> fetchCheckRefreshData(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHECK_REFRESH_DATA, context, TestCaseDTO.class)
    }

    /**
     * 数据集：评论通知维护人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMENT_NOTIFY_MAINTENANCE)
    Page<TestCaseMaintenanceDTO> fetchCommentNotifyMaintenance(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMENT_NOTIFY_MAINTENANCE, context, TestCaseMaintenanceDTO.class)
    }

    /**
     * 数据集：测试用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMON)
    Page<TestCaseDTO> fetchCommon(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMON, context, TestCaseDTO.class)
    }

    /**
     * 数据集：每日执行用例趋势 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DAILYTENDENCIES)
    Page<TestCaseDTO> fetchDailyTendencies(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DAILYTENDENCIES, context, TestCaseDTO.class)
    }

    /**
     * 数据集：测试用例重要程度分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEGREEIMPORTANCE)
    Page<TestCaseDTO> fetchDegreeImportance(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEGREEIMPORTANCE, context, TestCaseDTO.class)
    }

    /**
     * 数据集：已删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DELETED)
    Page<TestCaseDTO> fetchDeleted(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DELETED, context, TestCaseDTO.class)
    }

    /**
     * 数据集：每日测试次数统计 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EVERYDAYTEST)
    Page<TestCaseDTO> fetchEverydayTest(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EVERYDAYTEST, context, TestCaseDTO.class)
    }

    /**
     * 数据集：需求关联测试用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_RELATION_TEST_CASE)
    Page<TestCaseDTO> fetchIdeaRelationTestCase(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_RELATION_TEST_CASE, context, TestCaseDTO.class)
    }

    /**
     * 数据集：我负责的测试用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ASSIGN)
    Page<TestCaseDTO> fetchMyAssign(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ASSIGN, context, TestCaseDTO.class)
    }

    /**
     * 数据集：我负责的用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ASSIGNEE_COUNT_TEST_CASE)
    Page<TestCaseDTO> fetchMyAssigneeCountTestCase(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ASSIGNEE_COUNT_TEST_CASE, context, TestCaseDTO.class)
    }

    /**
     * 数据集：我关注的测试用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ATTENTION)
    Page<TestCaseDTO> fetchMyAttention(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ATTENTION, context, TestCaseDTO.class)
    }

    /**
     * 数据集：我创建的测试用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_CREATED)
    Page<TestCaseDTO> fetchMyCreated(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_CREATED, context, TestCaseDTO.class)
    }

    /**
     * 数据集：过滤器默认查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_FILTER)
    Page<TestCaseDTO> fetchMyFilter(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_FILTER, context, TestCaseDTO.class)
    }

    /**
     * 数据集：我的事项测试用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_SUMMARY_CASE)
    Page<TestCaseDTO> fetchMySummaryCase(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_SUMMARY_CASE, context, TestCaseDTO.class)
    }

    /**
     * 数据集：正常状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    Page<TestCaseDTO> fetchNormal(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context, TestCaseDTO.class)
    }

    /**
     * 数据集：无模块用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOSUITE_TEST_CASE)
    Page<TestCaseDTO> fetchNosuiteTestCase(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOSUITE_TEST_CASE, context, TestCaseDTO.class)
    }

    /**
     * 数据集：未添加过的用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_ADD_CASE)
    Page<TestCaseDTO> fetchNotAddCase(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_ADD_CASE, context, TestCaseDTO.class)
    }

    /**
     * 数据集：未关联的用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_EXSISTS_RELATION)
    Page<TestCaseDTO> fetchNotExsistsRelation(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_EXSISTS_RELATION, context, TestCaseDTO.class)
    }

    /**
     * 数据集：用例通知维护人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOTIFY_ASSIGNEE)
    Page<TestCaseDTO> fetchNotifyAssignee(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOTIFY_ASSIGNEE, context, TestCaseDTO.class)
    }

    /**
     * 数据集：优先级分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PRIORITYDISTRIBUTIONS)
    Page<TestCaseDTO> fetchPriorityDistributions(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PRIORITYDISTRIBUTIONS, context, TestCaseDTO.class)
    }

    /**
     * 数据集：测试用例规划分析 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROGRAM_ANALYZE)
    Page<TestCaseDTO> fetchProgramAnalyze(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROGRAM_ANALYZE, context, TestCaseDTO.class)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<TestCaseDTO> fetchReader(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, TestCaseDTO.class)
    }

    /**
     * 数据集：最近浏览 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_TEST_CASE)
    Page<TestCaseDTO> fetchRecentTestCase(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_TEST_CASE, context, TestCaseDTO.class)
    }

    /**
     * 数据集：关联测试用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELATION_TEST_CASE)
    Page<TestCaseDTO> fetchRelationTestCase(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELATION_TEST_CASE, context, TestCaseDTO.class)
    }

    /**
     * 数据集：评审数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_REVIEW_DATA)
    Page<TestCaseDTO> fetchReviewData(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_REVIEW_DATA, context, TestCaseDTO.class)
    }

    /**
     * 数据集：当前模块下用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_THIS_SUITE_TEST_CASE)
    Page<TestCaseDTO> fetchSuitesTestCase(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_THIS_SUITE_TEST_CASE, context, TestCaseDTO.class)
    }

    /**
     * 数据集：测试用例活动情况 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_CASE_MANEUVER_CONTEXT)
    Page<TestCaseDTO> fetchTestCaseManeuverContext(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_CASE_MANEUVER_CONTEXT, context, TestCaseDTO.class)
    }

    /**
     * 数据集：测试计划用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_PLAN_TEST_CASE)
    Page<TestCaseDTO> fetchTestPlanTestCase(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_PLAN_TEST_CASE, context, TestCaseDTO.class)
    }

    /**
     * 数据集：工作项关联测试用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_RELATION_TEST_CASE)
    Page<TestCaseDTO> fetchWorkItemRelationTestCase(TestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_RELATION_TEST_CASE, context, TestCaseDTO.class)
    }

}