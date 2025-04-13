package cn.ibizlab.plm.testmgmt.run

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.run.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RUN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Run extends GroovyDataEntityRuntime<Run,RunDTO,RunFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_ADD_PLAN_RUN = "add_plan_run"
    public static final String ACTION_BATCH_SAVE_RUN_HISTORY = "batch_save_run_history"
    public static final String ACTION_GET_ACTUAL_WORKLOAD = "get_actual_workload"
    public static final String ACTION_OTHER_RELATION_RUN = "other_relation_run"
    public static final String ACTION_PROGRAM_PLAN = "program_plan"
    public static final String ACTION_PROGRAM_PLAN_BY_RELEASE = "program_plan_by_release"
    public static final String ACTION_PROGRAM_PLAN_BY_SPRINT = "program_plan_by_sprint"
    public static final String ACTION_PROGRAM_PLAN_BY_WORKITEM = "program_plan_by_workitem"
    public static final String ACTION_RESET_NOT_TEST = "reset_not_test"
    public static final String ACTION_RUN_HISTORY_GET = "run_history_get"
    public static final String ACTION_RUN_RE_COUNTERS = "run_re_counters"
    public static final String ACTION_SAVE_RUN_HISTORY = "save_run_history"
    public static final String ACTION_SET_EXECUTOR = "set_executor"
    public static final String ACTION_THIS_RUN_DETAILS = "this_run_details"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_IMPLEMENTATIONRESULTS = "ImplementationResults"
    public static final String DATASET_BI_DETAIL = "bi_detail"
    public static final String DATASET_BI_SEARCH = "bi_search"
    public static final String DATASET_CASEPERSON = "casePerson"
    public static final String DATASET_CASE_LATEST_EXECUTED = "case_latest_executed"
    public static final String DATASET_COMMENT_NOTIFY_EXECUTOR = "comment_notify_executor"
    public static final String DATASET_COMPARATIVEANALYSIS = "comparativeAnalysis"
    public static final String DATASET_DAILYTENDENCIES = "dailyTendencies"
    public static final String DATASET_EVERYDAYTEST = "everydayTest"
    public static final String DATASET_MY_FILTER = "my_filter"
    public static final String DATASET_NORMAL = "normal"
    public static final String DATASET_PLAN_RUN_HISTORY = "plan_run_history"
    public static final String DATASET_PRIORITYDISTRIBUTIONS = "priorityDistributions"
    public static final String DATASET_READER = "reader"
    private static Run _instance;
    void setInstance(Run instance) {
        _instance = instance
    }
    static Run getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(RunDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(RunDTO dto) throws Throwable {
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
    def getDraft(RunDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(RunDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(RunDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：添加计划执行用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_PLAN_RUN)
    def addPlanRun(RunDTO dto) throws Throwable {
        this.execute(ACTION_ADD_PLAN_RUN, dto)
    }

    /**
     * 行为：批设置执行结果 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BATCH_SAVE_RUN_HISTORY)
    def batchSaveRunHistory(RunDTO dto) throws Throwable {
        this.execute(ACTION_BATCH_SAVE_RUN_HISTORY, dto)
    }

    /**
     * 行为：获取实际工时 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_ACTUAL_WORKLOAD)
    def getActualWorkload(String key) throws Throwable {
        return this.execute(ACTION_GET_ACTUAL_WORKLOAD, key)
    }

    /**
     * 行为：其他实体关联执行用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_OTHER_RELATION_RUN)
    def otherRelationRun(RunDTO dto) throws Throwable {
        this.execute(ACTION_OTHER_RELATION_RUN, dto)
    }

    /**
     * 行为：规划计划 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PROGRAM_PLAN)
    def programPlan(RunDTO dto) throws Throwable {
        return this.execute(ACTION_PROGRAM_PLAN, dto)
    }

    /**
     * 行为：通过发布规划计划 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PROGRAM_PLAN_BY_RELEASE)
    def programPlanByRelease(RunDTO dto) throws Throwable {
        return this.execute(ACTION_PROGRAM_PLAN_BY_RELEASE, dto)
    }

    /**
     * 行为：通过迭代规划计划 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PROGRAM_PLAN_BY_SPRINT)
    def programPlanBySprint(RunDTO dto) throws Throwable {
        return this.execute(ACTION_PROGRAM_PLAN_BY_SPRINT, dto)
    }

    /**
     * 行为：通过工作项规划计划 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PROGRAM_PLAN_BY_WORKITEM)
    def programPlanByWorkitem(RunDTO dto) throws Throwable {
        return this.execute(ACTION_PROGRAM_PLAN_BY_WORKITEM, dto)
    }

    /**
     * 行为：重置为未测 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RESET_NOT_TEST)
    def resetNotTest(RunDTO dto) throws Throwable {
        this.execute(ACTION_RESET_NOT_TEST, dto)
    }

    /**
     * 行为：执行结果获取 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RUN_HISTORY_GET)
    def runHistoryGet(RunDTO dto) throws Throwable {
        return this.execute(ACTION_RUN_HISTORY_GET, dto)
    }

    /**
     * 行为：执行用例关联分页计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RUN_RE_COUNTERS)
    def runReCounters(RunDTO dto) throws Throwable {
        this.execute(ACTION_RUN_RE_COUNTERS, dto)
    }

    /**
     * 行为：保存执行结果 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE_RUN_HISTORY)
    def saveRunHistory(RunDTO dto) throws Throwable {
        this.execute(ACTION_SAVE_RUN_HISTORY, dto)
    }

    /**
     * 行为：设置执行人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_EXECUTOR)
    def setExecutor(RunDTO dto) throws Throwable {
        this.execute(ACTION_SET_EXECUTOR, dto)
    }

    /**
     * 行为：当前执行用例详情 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_THIS_RUN_DETAILS)
    def thisRunDetails(String key) throws Throwable {
        return this.execute(ACTION_THIS_RUN_DETAILS, key)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：执行结果分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IMPLEMENTATIONRESULTS)
    def fetchImplementationResults(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IMPLEMENTATIONRESULTS, context)
    }

    /**
     * 数据集：BI反查 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_DETAIL)
    def fetchBiDetail(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_DETAIL, context)
    }

    /**
     * 数据集：BI查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    def fetchBiSearch(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context)
    }

    /**
     * 数据集：用例成员分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CASEPERSON)
    def fetchCasePerson(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CASEPERSON, context)
    }

    /**
     * 数据集：测试用例获取最新执行结果 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CASE_LATEST_EXECUTED)
    def fetchCaseLatestExecuted(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CASE_LATEST_EXECUTED, context)
    }

    /**
     * 数据集：评论通知执行人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMENT_NOTIFY_EXECUTOR)
    def fetchCommentNotifyExecutor(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMENT_NOTIFY_EXECUTOR, context)
    }

    /**
     * 数据集：测试用例计划对比分析 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMPARATIVEANALYSIS)
    def fetchComparativeAnalysis(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMPARATIVEANALYSIS, context)
    }

    /**
     * 数据集：每日执行用例趋势 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DAILYTENDENCIES)
    def fetchDailyTendencies(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DAILYTENDENCIES, context)
    }

    /**
     * 数据集：每日测试次数统计 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EVERYDAYTEST)
    def fetchEverydayTest(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EVERYDAYTEST, context)
    }

    /**
     * 数据集：过滤器默认查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_FILTER)
    def fetchMyFilter(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_FILTER, context)
    }

    /**
     * 数据集：当前模块下用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    def fetchNormal(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context)
    }

    /**
     * 数据集：测试计划内执行历史 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PLAN_RUN_HISTORY)
    def fetchPlanRunHistory(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PLAN_RUN_HISTORY, context)
    }

    /**
     * 数据集：优先级分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PRIORITYDISTRIBUTIONS)
    def fetchPriorityDistributions(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PRIORITYDISTRIBUTIONS, context)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    def fetchReader(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context)
    }

}