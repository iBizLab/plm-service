package cn.ibizlab.plm.testmgmt.testcase.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.testmgmt.step.dto.StepDTO
import cn.ibizlab.plm.base.attachment.dto.AttachmentDTO
import cn.ibizlab.plm.base.attention.dto.AttentionDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class TestCaseDTO extends GroovyDTO<TestCaseDTO> {

    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「重要程度」
     * 字典[用例重要程度]
     */
    @JsonProperty("level")
    String level
    /**
     * 「用例类型」
     * 字典[用例类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「测试类型」
     * 字典[测试类型]
     */
    @JsonProperty("test_type")
    String testType
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「前置条件」
     */
    @JsonProperty("precondition")
    String precondition
    /**
     * 「是否已归档」
     * 字典[是否]
     */
    @JsonProperty("is_archived")
    Integer isArchived
    /**
     * 「是否已删除」
     * 字典[是否]
     */
    @JsonProperty("is_deleted")
    Integer isDeleted
    /**
     * 「状态」
     * 字典[用例状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「步骤」
     */
    @JsonProperty("steps")
    List<StepDTO> steps
    /**
     * 「当前版本标识」
     */
    @JsonProperty("cur_version_id")
    String curVersionId
    /**
     * 「维护人」
     */
    @JsonProperty("maintenance_id")
    String maintenanceId
    /**
     * 「维护人」
     */
    @JsonProperty("maintenance_name")
    String maintenanceName
    /**
     * 「测试计划名称」
     */
    @JsonProperty("test_plan_name")
    String testPlanName
    /**
     * 「执行时间」
     */
    @JsonProperty("executed_at")
    Timestamp executedAt
    /**
     * 「执行人」
     */
    @JsonProperty("executor_name")
    String executorName
    /**
     * 「执行结果」
     * 字典[执行用例状态]
     */
    @JsonProperty("run_status")
    String runStatus
    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
    /**
     * 「模块路径」
     */
    @JsonProperty("suites")
    String suites
    /**
     * 「目标测试库」
     */
    @JsonProperty("target_library_id")
    String targetLibraryId
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「测试库标识」
     */
    @JsonProperty("library_identifier")
    String libraryIdentifier
    /**
     * 「关注」
     */
    @JsonProperty("attentions")
    List<AttentionDTO> attentions
    /**
     * 「工时进度」
     */
    @JsonProperty("workload_schedule")
    BigDecimal workloadSchedule
    /**
     * 「预估工时」
     */
    @JsonProperty("estimated_workload")
    BigDecimal estimatedWorkload
    /**
     * 「目标模板」
     */
    @JsonProperty("target_template")
    String targetTemplate
    /**
     * 「评审结果」
     * 字典[评审结果]
     */
    @JsonProperty("review_result_state")
    String reviewResultState
    /**
     * 「剩余工时」
     */
    @JsonProperty("remaining_workload")
    BigDecimal remainingWorkload
    /**
     * 「最新执行结果」
     */
    @JsonProperty("latest_executed")
    List<IEntity> latestExecuted
    /**
     * 「实际工时」
     */
    @JsonProperty("actual_workload")
    BigDecimal actualWorkload
    /**
     * 「步骤」
     */
    @JsonProperty("steps_imp")
    String stepsImp
    /**
     * 「关注数」
     */
    @JsonProperty("attention_count")
    String attentionCount
    /**
     * 「评论数」
     */
    @JsonProperty("comment_count")
    String commentCount
    /**
     * 「步骤描述」
     */
    @JsonProperty("step_desc_imp")
    String stepDescImp
    /**
     * 「预期结果」
     */
    @JsonProperty("step_value_imp")
    String stepValueImp
    /**
     * 「测试库是否删除」
     * 字典[是否]
     */
    @JsonProperty("library_is_deleted")
    Integer libraryIsDeleted
    /**
     * 「测试库是否归档」
     * 字典[是否]
     */
    @JsonProperty("library_is_archived")
    Integer libraryIsArchived
    /**
     * 「当前版本名称」
     */
    @JsonProperty("cur_version_name")
    String curVersionName
    /**
     * 「选择版本标识」
     */
    @JsonProperty("choose_version_id")
    String chooseVersionId
    /**
     * 「选择版本名称」
     */
    @JsonProperty("choose_version_name")
    String chooseVersionName
    /**
     * 「关注人」
     */
    @JsonProperty("attentions_imp")
    String attentionsImp
    /**
     * 「最近创建日期」
     */
    @JsonProperty("recent_create_days")
    Integer recentCreateDays
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「用例模块标识」
     */
    @JsonProperty("suite_id")
    String suiteId
    /**
     * 「所属模块」
     */
    @JsonProperty("suite_name")
    String suiteName
    /**
     * 「测试库」
     */
    @JsonProperty("test_library_id")
    String testLibraryId
    /**
     * 「所属测试库」
     */
    @JsonProperty("test_library_name")
    String testLibraryName
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime

    /**
     * 设置「编号」值
     * @param val
     */
    TestCaseDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    TestCaseDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「重要程度」值
     * 字典[用例重要程度]
     * @param val
     */
    TestCaseDTO setLevel(String level) {
        this.level = level
        return this
    }


    /**
     * 设置「用例类型」值
     * 字典[用例类型]
     * @param val
     */
    TestCaseDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「测试类型」值
     * 字典[测试类型]
     * @param val
     */
    TestCaseDTO setTestType(String testType) {
        this.testType = testType
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    TestCaseDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「前置条件」值
     * @param val
     */
    TestCaseDTO setPrecondition(String precondition) {
        this.precondition = precondition
        return this
    }


    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    TestCaseDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    TestCaseDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「状态」值
     * 字典[用例状态]
     * @param val
     */
    TestCaseDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「步骤」值
     * @param val
     */
    TestCaseDTO setSteps(List<StepDTO> steps) {
        this.steps = steps
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    TestCaseDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }


    /**
     * 设置「维护人」值
     * @param val
     */
    TestCaseDTO setMaintenanceId(String maintenanceId) {
        this.maintenanceId = maintenanceId
        return this
    }


    /**
     * 设置「维护人」值
     * @param val
     */
    TestCaseDTO setMaintenanceName(String maintenanceName) {
        this.maintenanceName = maintenanceName
        return this
    }


    /**
     * 设置「测试计划名称」值
     * @param val
     */
    TestCaseDTO setTestPlanName(String testPlanName) {
        this.testPlanName = testPlanName
        return this
    }


    /**
     * 设置「执行时间」值
     * @param val
     */
    TestCaseDTO setExecutedAt(Timestamp executedAt) {
        this.executedAt = executedAt
        return this
    }


    /**
     * 设置「执行人」值
     * @param val
     */
    TestCaseDTO setExecutorName(String executorName) {
        this.executorName = executorName
        return this
    }


    /**
     * 设置「执行结果」值
     * 字典[执行用例状态]
     * @param val
     */
    TestCaseDTO setRunStatus(String runStatus) {
        this.runStatus = runStatus
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    TestCaseDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「模块路径」值
     * @param val
     */
    TestCaseDTO setSuites(String suites) {
        this.suites = suites
        return this
    }


    /**
     * 设置「目标测试库」值
     * @param val
     */
    TestCaseDTO setTargetLibraryId(String targetLibraryId) {
        this.targetLibraryId = targetLibraryId
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    TestCaseDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「测试库标识」值
     * @param val
     */
    TestCaseDTO setLibraryIdentifier(String libraryIdentifier) {
        this.libraryIdentifier = libraryIdentifier
        return this
    }


    /**
     * 设置「关注」值
     * @param val
     */
    TestCaseDTO setAttentions(List<AttentionDTO> attentions) {
        this.attentions = attentions
        return this
    }


    /**
     * 设置「工时进度」值
     * @param val
     */
    TestCaseDTO setWorkloadSchedule(BigDecimal workloadSchedule) {
        this.workloadSchedule = workloadSchedule
        return this
    }


    /**
     * 设置「预估工时」值
     * @param val
     */
    TestCaseDTO setEstimatedWorkload(BigDecimal estimatedWorkload) {
        this.estimatedWorkload = estimatedWorkload
        return this
    }


    /**
     * 设置「目标模板」值
     * @param val
     */
    TestCaseDTO setTargetTemplate(String targetTemplate) {
        this.targetTemplate = targetTemplate
        return this
    }


    /**
     * 设置「评审结果」值
     * 字典[评审结果]
     * @param val
     */
    TestCaseDTO setReviewResultState(String reviewResultState) {
        this.reviewResultState = reviewResultState
        return this
    }


    /**
     * 设置「剩余工时」值
     * @param val
     */
    TestCaseDTO setRemainingWorkload(BigDecimal remainingWorkload) {
        this.remainingWorkload = remainingWorkload
        return this
    }


    /**
     * 设置「最新执行结果」值
     * @param val
     */
    TestCaseDTO setLatestExecuted(List<IEntity> latestExecuted) {
        this.latestExecuted = latestExecuted
        return this
    }


    /**
     * 设置「实际工时」值
     * @param val
     */
    TestCaseDTO setActualWorkload(BigDecimal actualWorkload) {
        this.actualWorkload = actualWorkload
        return this
    }


    /**
     * 设置「步骤」值
     * @param val
     */
    TestCaseDTO setStepsImp(String stepsImp) {
        this.stepsImp = stepsImp
        return this
    }


    /**
     * 设置「关注数」值
     * @param val
     */
    TestCaseDTO setAttentionCount(String attentionCount) {
        this.attentionCount = attentionCount
        return this
    }


    /**
     * 设置「评论数」值
     * @param val
     */
    TestCaseDTO setCommentCount(String commentCount) {
        this.commentCount = commentCount
        return this
    }


    /**
     * 设置「步骤描述」值
     * @param val
     */
    TestCaseDTO setStepDescImp(String stepDescImp) {
        this.stepDescImp = stepDescImp
        return this
    }


    /**
     * 设置「预期结果」值
     * @param val
     */
    TestCaseDTO setStepValueImp(String stepValueImp) {
        this.stepValueImp = stepValueImp
        return this
    }


    /**
     * 设置「测试库是否删除」值
     * 字典[是否]
     * @param val
     */
    TestCaseDTO setLibraryIsDeleted(Integer libraryIsDeleted) {
        this.libraryIsDeleted = libraryIsDeleted
        return this
    }


    /**
     * 设置「测试库是否归档」值
     * 字典[是否]
     * @param val
     */
    TestCaseDTO setLibraryIsArchived(Integer libraryIsArchived) {
        this.libraryIsArchived = libraryIsArchived
        return this
    }


    /**
     * 设置「当前版本名称」值
     * @param val
     */
    TestCaseDTO setCurVersionName(String curVersionName) {
        this.curVersionName = curVersionName
        return this
    }


    /**
     * 设置「选择版本标识」值
     * @param val
     */
    TestCaseDTO setChooseVersionId(String chooseVersionId) {
        this.chooseVersionId = chooseVersionId
        return this
    }


    /**
     * 设置「选择版本名称」值
     * @param val
     */
    TestCaseDTO setChooseVersionName(String chooseVersionName) {
        this.chooseVersionName = chooseVersionName
        return this
    }


    /**
     * 设置「关注人」值
     * @param val
     */
    TestCaseDTO setAttentionsImp(String attentionsImp) {
        this.attentionsImp = attentionsImp
        return this
    }


    /**
     * 设置「最近创建日期」值
     * @param val
     */
    TestCaseDTO setRecentCreateDays(Integer recentCreateDays) {
        this.recentCreateDays = recentCreateDays
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    TestCaseDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    TestCaseDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    TestCaseDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    TestCaseDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「用例模块标识」值
     * @param val
     */
    TestCaseDTO setSuiteId(String suiteId) {
        this.suiteId = suiteId
        return this
    }


    /**
     * 设置「所属模块」值
     * @param val
     */
    TestCaseDTO setSuiteName(String suiteName) {
        this.suiteName = suiteName
        return this
    }


    /**
     * 设置「测试库」值
     * @param val
     */
    TestCaseDTO setTestLibraryId(String testLibraryId) {
        this.testLibraryId = testLibraryId
        return this
    }


    /**
     * 设置「所属测试库」值
     * @param val
     */
    TestCaseDTO setTestLibraryName(String testLibraryName) {
        this.testLibraryName = testLibraryName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    TestCaseDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    TestCaseDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
