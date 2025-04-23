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
    private static Run _instance
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
    RunDTO create(RunDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, RunDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    RunDTO update(RunDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, RunDTO.class)
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
    RunDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, RunDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    RunDTO getDraft(RunDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, RunDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(RunDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    RunDTO save(RunDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, RunDTO.class)
    }

    /**
     * 行为：添加计划执行用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_PLAN_RUN)
    def addPlanRun(RunDTO dto) throws Throwable {
        this.execute(ACTION_ADD_PLAN_RUN, dto, RunDTO.class)
    }

    /**
     * 行为：批设置执行结果 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BATCH_SAVE_RUN_HISTORY)
    def batchSaveRunHistory(RunDTO dto) throws Throwable {
        this.execute(ACTION_BATCH_SAVE_RUN_HISTORY, dto, RunDTO.class)
    }

    /**
     * 行为：获取实际工时 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_ACTUAL_WORKLOAD)
    def getActualWorkload(String key) throws Throwable {
        return this.execute(ACTION_GET_ACTUAL_WORKLOAD, key, RunDTO.class)
    }

    /**
     * 行为：其他实体关联执行用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_OTHER_RELATION_RUN)
    def otherRelationRun(RunDTO dto) throws Throwable {
        this.execute(ACTION_OTHER_RELATION_RUN, dto, RunDTO.class)
    }

    /**
     * 行为：规划计划 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PROGRAM_PLAN)
    def programPlan(RunDTO dto) throws Throwable {
        return this.execute(ACTION_PROGRAM_PLAN, dto, RunDTO.class)
    }

    /**
     * 行为：通过发布规划计划 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PROGRAM_PLAN_BY_RELEASE)
    def programPlanByRelease(RunDTO dto) throws Throwable {
        return this.execute(ACTION_PROGRAM_PLAN_BY_RELEASE, dto, RunDTO.class)
    }

    /**
     * 行为：通过迭代规划计划 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PROGRAM_PLAN_BY_SPRINT)
    def programPlanBySprint(RunDTO dto) throws Throwable {
        return this.execute(ACTION_PROGRAM_PLAN_BY_SPRINT, dto, RunDTO.class)
    }

    /**
     * 行为：通过工作项规划计划 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PROGRAM_PLAN_BY_WORKITEM)
    def programPlanByWorkitem(RunDTO dto) throws Throwable {
        return this.execute(ACTION_PROGRAM_PLAN_BY_WORKITEM, dto, RunDTO.class)
    }

    /**
     * 行为：重置为未测 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RESET_NOT_TEST)
    def resetNotTest(RunDTO dto) throws Throwable {
        this.execute(ACTION_RESET_NOT_TEST, dto, RunDTO.class)
    }

    /**
     * 行为：执行结果获取 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RUN_HISTORY_GET)
    def runHistoryGet(RunDTO dto) throws Throwable {
        return this.execute(ACTION_RUN_HISTORY_GET, dto, RunDTO.class)
    }

    /**
     * 行为：执行用例关联分页计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RUN_RE_COUNTERS)
    def runReCounters(RunDTO dto) throws Throwable {
        this.execute(ACTION_RUN_RE_COUNTERS, dto, RunDTO.class)
    }

    /**
     * 行为：保存执行结果 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE_RUN_HISTORY)
    def saveRunHistory(RunDTO dto) throws Throwable {
        this.execute(ACTION_SAVE_RUN_HISTORY, dto, RunDTO.class)
    }

    /**
     * 行为：设置执行人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_EXECUTOR)
    def setExecutor(RunDTO dto) throws Throwable {
        this.execute(ACTION_SET_EXECUTOR, dto, RunDTO.class)
    }

    /**
     * 行为：当前执行用例详情 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_THIS_RUN_DETAILS)
    def thisRunDetails(String key) throws Throwable {
        return this.execute(ACTION_THIS_RUN_DETAILS, key, RunDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<RunDTO> fetchDefault(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, RunDTO.class)
    }

    /**
     * 数据集：执行结果分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IMPLEMENTATIONRESULTS)
    Page<RunDTO> fetchImplementationResults(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IMPLEMENTATIONRESULTS, context, RunDTO.class)
    }

    /**
     * 数据集：BI反查 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_DETAIL)
    Page<RunDTO> fetchBiDetail(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_DETAIL, context, RunDTO.class)
    }

    /**
     * 数据集：BI查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    Page<RunBiSearchGroupDTO> fetchBiSearch(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context, RunBiSearchGroupDTO.class)
    }

    /**
     * 数据集：用例成员分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CASEPERSON)
    Page<RunDTO> fetchCasePerson(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CASEPERSON, context, RunDTO.class)
    }

    /**
     * 数据集：测试用例获取最新执行结果 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CASE_LATEST_EXECUTED)
    Page<RunDTO> fetchCaseLatestExecuted(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CASE_LATEST_EXECUTED, context, RunDTO.class)
    }

    /**
     * 数据集：评论通知执行人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMENT_NOTIFY_EXECUTOR)
    Page<RunExecutorDTO> fetchCommentNotifyExecutor(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMENT_NOTIFY_EXECUTOR, context, RunExecutorDTO.class)
    }

    /**
     * 数据集：测试用例计划对比分析 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMPARATIVEANALYSIS)
    Page<RunDTO> fetchComparativeAnalysis(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMPARATIVEANALYSIS, context, RunDTO.class)
    }

    /**
     * 数据集：每日执行用例趋势 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DAILYTENDENCIES)
    Page<RunDTO> fetchDailyTendencies(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DAILYTENDENCIES, context, RunDTO.class)
    }

    /**
     * 数据集：每日测试次数统计 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EVERYDAYTEST)
    Page<RunDTO> fetchEverydayTest(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EVERYDAYTEST, context, RunDTO.class)
    }

    /**
     * 数据集：过滤器默认查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_FILTER)
    Page<RunDTO> fetchMyFilter(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_FILTER, context, RunDTO.class)
    }

    /**
     * 数据集：当前模块下用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    Page<RunDTO> fetchNormal(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context, RunDTO.class)
    }

    /**
     * 数据集：测试计划内执行历史 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PLAN_RUN_HISTORY)
    Page<RunDTO> fetchPlanRunHistory(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PLAN_RUN_HISTORY, context, RunDTO.class)
    }

    /**
     * 数据集：优先级分布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PRIORITYDISTRIBUTIONS)
    Page<RunDTO> fetchPriorityDistributions(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PRIORITYDISTRIBUTIONS, context, RunDTO.class)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<RunDTO> fetchReader(RunFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, RunDTO.class)
    }

}