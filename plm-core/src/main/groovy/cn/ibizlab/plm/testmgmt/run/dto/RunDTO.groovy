package cn.ibizlab.plm.testmgmt.run.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.testmgmt.step.dto.StepDTO
import cn.ibizlab.plm.base.attention.dto.AttentionDTO
import cn.ibizlab.plm.testmgmt.runattachment.dto.RunAttachmentDTO
import cn.ibizlab.plm.base.executor.dto.ExecutorDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class RunDTO extends GroovyDTO<RunDTO> {

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
     * 「用例状态」
     * 字典[用例状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「父对象版本标识」
     */
    @JsonProperty("parent_version_id")
    String parentVersionId
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
     * 「执行时间」
     */
    @JsonProperty("executed_at")
    Timestamp executedAt
    /**
     * 「执行结果」
     * 字典[执行用例状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「备注」
     */
    @JsonProperty("remark")
    String remark
    /**
     * 「步骤」
     */
    @JsonProperty("steps")
    List<StepDTO> steps
    /**
     * 「测试计划」
     */
    @JsonProperty("plan_name")
    String planName
    /**
     * 「测试类型」
     * 字典[测试类型]
     */
    @JsonProperty("test_type")
    String testType
    /**
     * 「当前版本标识」
     */
    @JsonProperty("cur_version_id")
    String curVersionId
    /**
     * 「维护人」
     */
    @JsonProperty("maintenance_name")
    String maintenanceName
    /**
     * 「执行人标识」
     */
    @JsonProperty("executor_id")
    String executorId
    /**
     * 「执行人」
     */
    @JsonProperty("executor_name")
    String executorName
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
     * 「前置条件」
     */
    @JsonProperty("precondition")
    String precondition
    /**
     * 「模块路径」
     */
    @JsonProperty("suites")
    String suites
    /**
     * 「关联缺陷数」
     */
    @JsonProperty("relation_total_bug")
    BigDecimal relationTotalBug
    /**
     * 「所属测试库」
     */
    @JsonProperty("library_name")
    String libraryName
    /**
     * 「测试库标识」
     * 字典[全部测试库]
     */
    @JsonProperty("library_id")
    String libraryId
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「关注」
     * 字典[云系统操作者]
     */
    @JsonProperty("attentions")
    List<AttentionDTO> attentions
    /**
     * 「预估工时」
     */
    @JsonProperty("estimated_workload")
    BigDecimal estimatedWorkload
    /**
     * 「工时进度」
     */
    @JsonProperty("workload_schedule")
    BigDecimal workloadSchedule
    /**
     * 「剩余工时」
     */
    @JsonProperty("remaining_workload")
    BigDecimal remainingWorkload
    /**
     * 「实际工时」
     */
    @JsonProperty("actual_workload")
    BigDecimal actualWorkload
    /**
     * 「结果附件」
     */
    @JsonProperty("run_attachment")
    List<RunAttachmentDTO> runAttachment
    /**
     * 「关联执行结果数」
     */
    @JsonProperty("relation_total_history")
    BigDecimal relationTotalHistory
    /**
     * 「优先级」
     * 字典[优先级]
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「是否最新」
     * 字典[是否]
     */
    @JsonProperty("is_newest")
    Integer isNewest
    /**
     * 「测试库编号」
     */
    @JsonProperty("library_identifier")
    String libraryIdentifier
    /**
     * 「bi测试计划名称」
     */
    @JsonProperty("bi_plan_name")
    String biPlanName
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
     * 「评审结果」
     * 字典[评审结果]
     */
    @JsonProperty("review_result_state")
    String reviewResultState
    /**
     * 「执行人」
     */
    @JsonProperty("executors")
    List<ExecutorDTO> executors
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
     * 「多人任务」
     * 字典[是否]
     */
    @JsonProperty("multiple_people")
    Integer multiplePeople
    /**
     * 「测试用例标识」
     */
    @JsonProperty("case_id")
    String caseId
    /**
     * 「名称」
     */
    @JsonProperty("case_name")
    String caseName
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
     * 「测试计划标识」
     */
    @JsonProperty("plan_id")
    String planId
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
    RunDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    RunDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「用例状态」值
     * 字典[用例状态]
     * @param val
     */
    RunDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「父对象版本标识」值
     * @param val
     */
    RunDTO setParentVersionId(String parentVersionId) {
        this.parentVersionId = parentVersionId
        return this
    }


    /**
     * 设置「重要程度」值
     * 字典[用例重要程度]
     * @param val
     */
    RunDTO setLevel(String level) {
        this.level = level
        return this
    }


    /**
     * 设置「用例类型」值
     * 字典[用例类型]
     * @param val
     */
    RunDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「执行时间」值
     * @param val
     */
    RunDTO setExecutedAt(Timestamp executedAt) {
        this.executedAt = executedAt
        return this
    }


    /**
     * 设置「执行结果」值
     * 字典[执行用例状态]
     * @param val
     */
    RunDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    RunDTO setRemark(String remark) {
        this.remark = remark
        return this
    }


    /**
     * 设置「步骤」值
     * @param val
     */
    RunDTO setSteps(List<StepDTO> steps) {
        this.steps = steps
        return this
    }


    /**
     * 设置「测试计划」值
     * @param val
     */
    RunDTO setPlanName(String planName) {
        this.planName = planName
        return this
    }


    /**
     * 设置「测试类型」值
     * 字典[测试类型]
     * @param val
     */
    RunDTO setTestType(String testType) {
        this.testType = testType
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    RunDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }


    /**
     * 设置「维护人」值
     * @param val
     */
    RunDTO setMaintenanceName(String maintenanceName) {
        this.maintenanceName = maintenanceName
        return this
    }


    /**
     * 设置「执行人标识」值
     * @param val
     */
    RunDTO setExecutorId(String executorId) {
        this.executorId = executorId
        return this
    }


    /**
     * 设置「执行人」值
     * @param val
     */
    RunDTO setExecutorName(String executorName) {
        this.executorName = executorName
        return this
    }


    /**
     * 设置「用例模块标识」值
     * @param val
     */
    RunDTO setSuiteId(String suiteId) {
        this.suiteId = suiteId
        return this
    }


    /**
     * 设置「所属模块」值
     * @param val
     */
    RunDTO setSuiteName(String suiteName) {
        this.suiteName = suiteName
        return this
    }


    /**
     * 设置「前置条件」值
     * @param val
     */
    RunDTO setPrecondition(String precondition) {
        this.precondition = precondition
        return this
    }


    /**
     * 设置「模块路径」值
     * @param val
     */
    RunDTO setSuites(String suites) {
        this.suites = suites
        return this
    }


    /**
     * 设置「关联缺陷数」值
     * @param val
     */
    RunDTO setRelationTotalBug(BigDecimal relationTotalBug) {
        this.relationTotalBug = relationTotalBug
        return this
    }


    /**
     * 设置「所属测试库」值
     * @param val
     */
    RunDTO setLibraryName(String libraryName) {
        this.libraryName = libraryName
        return this
    }


    /**
     * 设置「测试库标识」值
     * 字典[全部测试库]
     * @param val
     */
    RunDTO setLibraryId(String libraryId) {
        this.libraryId = libraryId
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    RunDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「关注」值
     * 字典[云系统操作者]
     * @param val
     */
    RunDTO setAttentions(List<AttentionDTO> attentions) {
        this.attentions = attentions
        return this
    }


    /**
     * 设置「预估工时」值
     * @param val
     */
    RunDTO setEstimatedWorkload(BigDecimal estimatedWorkload) {
        this.estimatedWorkload = estimatedWorkload
        return this
    }


    /**
     * 设置「工时进度」值
     * @param val
     */
    RunDTO setWorkloadSchedule(BigDecimal workloadSchedule) {
        this.workloadSchedule = workloadSchedule
        return this
    }


    /**
     * 设置「剩余工时」值
     * @param val
     */
    RunDTO setRemainingWorkload(BigDecimal remainingWorkload) {
        this.remainingWorkload = remainingWorkload
        return this
    }


    /**
     * 设置「实际工时」值
     * @param val
     */
    RunDTO setActualWorkload(BigDecimal actualWorkload) {
        this.actualWorkload = actualWorkload
        return this
    }


    /**
     * 设置「结果附件」值
     * @param val
     */
    RunDTO setRunAttachment(List<RunAttachmentDTO> runAttachment) {
        this.runAttachment = runAttachment
        return this
    }


    /**
     * 设置「关联执行结果数」值
     * @param val
     */
    RunDTO setRelationTotalHistory(BigDecimal relationTotalHistory) {
        this.relationTotalHistory = relationTotalHistory
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[优先级]
     * @param val
     */
    RunDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「是否最新」值
     * 字典[是否]
     * @param val
     */
    RunDTO setIsNewest(Integer isNewest) {
        this.isNewest = isNewest
        return this
    }


    /**
     * 设置「测试库编号」值
     * @param val
     */
    RunDTO setLibraryIdentifier(String libraryIdentifier) {
        this.libraryIdentifier = libraryIdentifier
        return this
    }


    /**
     * 设置「bi测试计划名称」值
     * @param val
     */
    RunDTO setBiPlanName(String biPlanName) {
        this.biPlanName = biPlanName
        return this
    }


    /**
     * 设置「关注数」值
     * @param val
     */
    RunDTO setAttentionCount(String attentionCount) {
        this.attentionCount = attentionCount
        return this
    }


    /**
     * 设置「评论数」值
     * @param val
     */
    RunDTO setCommentCount(String commentCount) {
        this.commentCount = commentCount
        return this
    }


    /**
     * 设置「测试库是否删除」值
     * 字典[是否]
     * @param val
     */
    RunDTO setLibraryIsDeleted(Integer libraryIsDeleted) {
        this.libraryIsDeleted = libraryIsDeleted
        return this
    }


    /**
     * 设置「测试库是否归档」值
     * 字典[是否]
     * @param val
     */
    RunDTO setLibraryIsArchived(Integer libraryIsArchived) {
        this.libraryIsArchived = libraryIsArchived
        return this
    }


    /**
     * 设置「评审结果」值
     * 字典[评审结果]
     * @param val
     */
    RunDTO setReviewResultState(String reviewResultState) {
        this.reviewResultState = reviewResultState
        return this
    }


    /**
     * 设置「执行人」值
     * @param val
     */
    RunDTO setExecutors(List<ExecutorDTO> executors) {
        this.executors = executors
        return this
    }


    /**
     * 设置「关注人」值
     * @param val
     */
    RunDTO setAttentionsImp(String attentionsImp) {
        this.attentionsImp = attentionsImp
        return this
    }


    /**
     * 设置「最近创建日期」值
     * @param val
     */
    RunDTO setRecentCreateDays(Integer recentCreateDays) {
        this.recentCreateDays = recentCreateDays
        return this
    }


    /**
     * 设置「多人任务」值
     * 字典[是否]
     * @param val
     */
    RunDTO setMultiplePeople(Integer multiplePeople) {
        this.multiplePeople = multiplePeople
        return this
    }


    /**
     * 设置「测试用例标识」值
     * @param val
     */
    RunDTO setCaseId(String caseId) {
        this.caseId = caseId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    RunDTO setCaseName(String caseName) {
        this.caseName = caseName
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    RunDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    RunDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    RunDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    RunDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「测试计划标识」值
     * @param val
     */
    RunDTO setPlanId(String planId) {
        this.planId = planId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    RunDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    RunDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
