package cn.ibizlab.plm.projmgmt.workitem.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.attachment.dto.AttachmentDTO
import cn.ibizlab.plm.base.deliverable.dto.DeliverableDTO
import cn.ibizlab.plm.base.attention.dto.AttentionDTO
import cn.ibizlab.plm.base.executor.dto.ExecutorDTO
import cn.ibizlab.plm.base.dependency.dto.DependencyDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class WorkItemDTO extends GroovyDTO<WorkItemDTO> {

    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「内容格式」
     * 字典[报表输出格式]
     */
    @JsonProperty("format_type")
    String formatType
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
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「开始时间」
     */
    @JsonProperty("start_at")
    Timestamp startAt
    /**
     * 「截止时间」
     */
    @JsonProperty("end_at")
    Timestamp endAt
    /**
     * 「状态」
     * 字典[工作项状态（动态）]
     */
    @JsonProperty("state")
    String state
    /**
     * 「优先级」
     * 字典[优先级]
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「是否叶子节点」
     * 字典[是否]
     */
    @JsonProperty("is_leaf")
    Integer isLeaf
    /**
     * 「需求类型」
     * 字典[需求类型]
     */
    @JsonProperty("backlog_type")
    String backlogType
    /**
     * 「需求来源」
     * 字典[需求来源]
     */
    @JsonProperty("backlog_from")
    String backlogFrom
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_id")
    String assigneeId
    /**
     * 「当前版本标识」
     */
    @JsonProperty("cur_version_id")
    String curVersionId
    /**
     * 「复现概率」
     * 字典[复现概率]
     */
    @JsonProperty("reappear_probability")
    String reappearProbability
    /**
     * 「严重程度」
     * 字典[严重程度]
     */
    @JsonProperty("severity")
    String severity
    /**
     * 「风险」
     * 字典[风险]
     */
    @JsonProperty("risk")
    String risk
    /**
     * 「项目类型」
     * 字典[项目类型]
     */
    @JsonProperty("project_type")
    String projectType
    /**
     * 「工作项类型分组」
     * 字典[工作项类型分组]
     */
    @JsonProperty("work_item_type_group")
    String workItemTypeGroup
    /**
     * 「标签」
     */
    @JsonProperty("tags")
    String tags
    /**
     * 「看板栏状态」
     */
    @JsonProperty("entry_status")
    String entryStatus
    /**
     * 「所在看板栏位置」
     */
    @JsonProperty("entry_position")
    Integer entryPosition
    /**
     * 「统计数」
     */
    @JsonProperty("rep_num")
    BigDecimal repNum
    /**
     * 「解决办法」
     */
    @JsonProperty("solution_way")
    String solutionWay
    /**
     * 「工作项类型序号」
     */
    @JsonProperty("work_item_type_sequence")
    BigDecimal workItemTypeSequence
    /**
     * 「完成时间」
     */
    @JsonProperty("completed_at")
    Timestamp completedAt
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
     * 「任务类别」
     * 字典[任务类别]
     */
    @JsonProperty("job_type")
    String jobType
    /**
     * 「评审结果」
     * 字典[评审结果]
     */
    @JsonProperty("review_result_state")
    String reviewResultState
    /**
     * 「测试计划ID」
     */
    @JsonProperty("test_plan_id")
    String testPlanId
    /**
     * 「剩余工时」
     */
    @JsonProperty("remaining_workload")
    BigDecimal remainingWorkload
    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
    /**
     * 「实际工时」
     */
    @JsonProperty("actual_workload")
    BigDecimal actualWorkload
    /**
     * 「交付物」
     */
    @JsonProperty("deliverable")
    List<DeliverableDTO> deliverable
    /**
     * 「关注数」
     */
    @JsonProperty("attention_count")
    String attentionCount
    /**
     * 「父工作项类型」
     */
    @JsonProperty("p_work_item_type_id")
    String pWorkItemTypeId
    /**
     * 「评论数」
     */
    @JsonProperty("comment_count")
    String commentCount
    /**
     * 「项目标识」
     */
    @JsonProperty("project_identifier")
    String projectIdentifier
    /**
     * 「关注」
     * 字典[云系统操作者]
     */
    @JsonProperty("attentions")
    List<AttentionDTO> attentions
    /**
     * 「报表分组属性」
     */
    @JsonProperty("rep_group_value")
    String repGroupValue
    /**
     * 「报表百分值」
     */
    @JsonProperty("rep_percent_value")
    Double repPercentValue
    /**
     * 「报表值1」
     */
    @JsonProperty("rep_value1")
    Integer repValue1
    /**
     * 「报表值3」
     */
    @JsonProperty("rep_value3")
    Integer repValue3
    /**
     * 「报表值2」
     */
    @JsonProperty("rep_value2")
    Integer repValue2
    /**
     * 「工作项状态类型」
     * 字典[工作项状态类型]
     */
    @JsonProperty("state_type")
    String stateType
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
     * 「迭代状态」
     * 字典[迭代状态]
     */
    @JsonProperty("sprint_status")
    String sprintStatus
    /**
     * 「发布阶段」
     * 字典[发布所属阶段]
     */
    @JsonProperty("release_status")
    String releaseStatus
    /**
     * 「工作项下级类型」
     */
    @JsonProperty("work_item_sub_type")
    String workItemSubType
    /**
     * 「统计日期字段」
     */
    @JsonProperty("rep_date")
    Timestamp repDate
    /**
     * 「最近创建日期」
     */
    @JsonProperty("recent_create_days")
    Integer recentCreateDays
    /**
     * 「序号」
     */
    @JsonProperty("sequence")
    BigDecimal sequence
    /**
     * 「关联产品需求数」
     */
    @JsonProperty("relation_total_idea")
    BigDecimal relationTotalIdea
    /**
     * 「关联测试用例数」
     */
    @JsonProperty("relation_total_test_case")
    BigDecimal relationTotalTestCase
    /**
     * 「关联工单数」
     */
    @JsonProperty("relation_total_ticket")
    BigDecimal relationTotalTicket
    /**
     * 「关联工作项数」
     */
    @JsonProperty("relation_total_work_item")
    BigDecimal relationTotalWorkItem
    /**
     * 「原始状态」
     * 字典[工作项原始状态（类别）]
     */
    @JsonProperty("work_item_origin_state")
    String workItemOriginState
    /**
     * 「是否超时」
     */
    @JsonProperty("is_overtime")
    Integer isOvertime
    /**
     * 「执行人」
     */
    @JsonProperty("executors")
    List<ExecutorDTO> executors
    /**
     * 「多人任务」
     * 字典[是否]
     */
    @JsonProperty("multiple_people")
    Integer multiplePeople
    /**
     * 「实际开始时间」
     */
    @JsonProperty("actual_start_at")
    Timestamp actualStartAt
    /**
     * 「实际结束时间」
     */
    @JsonProperty("actual_end_at")
    Timestamp actualEndAt
    /**
     * 「完成人」
     */
    @JsonProperty("finisher")
    String finisher
    /**
     * 「逾期天数」
     */
    @JsonProperty("overdue_time")
    String overdueTime
    /**
     * 「交付物」
     */
    @JsonProperty("deliverable_imp")
    String deliverableImp
    /**
     * 「项目是否删除」
     * 字典[是否]
     */
    @JsonProperty("project_is_deleted")
    Integer projectIsDeleted
    /**
     * 「项目是否归档」
     * 字典[是否]
     */
    @JsonProperty("project_is_archived")
    Integer projectIsArchived
    /**
     * 「依赖」
     */
    @JsonProperty("dependencies")
    List<DependencyDTO> dependencies
    /**
     * 「看板标识」
     */
    @JsonProperty("board_id")
    String boardId
    /**
     * 「看板名称」
     */
    @JsonProperty("board_name")
    String boardName
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
     * 「看板栏标识」
     */
    @JsonProperty("entry_id")
    String entryId
    /**
     * 「看板栏名称」
     */
    @JsonProperty("entry_name")
    String entryName
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「父标识」
     */
    @JsonProperty("pid")
    String pid
    /**
     * 「项目」
     */
    @JsonProperty("project_id")
    String projectId
    /**
     * 「所属项目」
     */
    @JsonProperty("project_name")
    String projectName
    /**
     * 「父工作项」
     */
    @JsonProperty("ptitle")
    String ptitle
    /**
     * 「项目发布标识」
     */
    @JsonProperty("release_id")
    String releaseId
    /**
     * 「项目发布名称」
     */
    @JsonProperty("release_name")
    String releaseName
    /**
     * 「迭代标识」
     */
    @JsonProperty("sprint_id")
    String sprintId
    /**
     * 「迭代名称」
     */
    @JsonProperty("sprint_name")
    String sprintName
    /**
     * 「泳道标识」
     */
    @JsonProperty("swimlane_id")
    String swimlaneId
    /**
     * 「顶级工作项标识」
     */
    @JsonProperty("top_id")
    String topId
    /**
     * 「顶级工作项标题」
     */
    @JsonProperty("top_title")
    String topTitle
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
     * 「工作项类型」
     * 字典[工作项类型]
     */
    @JsonProperty("work_item_type_id")
    String workItemTypeId
    /**
     * 「工作项类型」
     */
    @JsonProperty("work_item_type_name")
    String workItemTypeName
    /**
     * 「用户标记」
     */
    @JsonProperty("user_tag")
    String userTag
    /**
     * 「用户标记2」
     */
    @JsonProperty("user_tag2")
    String userTag2

    /**
     * 设置「编号」值
     * @param val
     */
    WorkItemDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    WorkItemDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「内容格式」值
     * 字典[报表输出格式]
     * @param val
     */
    WorkItemDTO setFormatType(String formatType) {
        this.formatType = formatType
        return this
    }


    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    WorkItemDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    WorkItemDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    WorkItemDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    WorkItemDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「截止时间」值
     * @param val
     */
    WorkItemDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「状态」值
     * 字典[工作项状态（动态）]
     * @param val
     */
    WorkItemDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[优先级]
     * @param val
     */
    WorkItemDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「是否叶子节点」值
     * 字典[是否]
     * @param val
     */
    WorkItemDTO setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf
        return this
    }


    /**
     * 设置「需求类型」值
     * 字典[需求类型]
     * @param val
     */
    WorkItemDTO setBacklogType(String backlogType) {
        this.backlogType = backlogType
        return this
    }


    /**
     * 设置「需求来源」值
     * 字典[需求来源]
     * @param val
     */
    WorkItemDTO setBacklogFrom(String backlogFrom) {
        this.backlogFrom = backlogFrom
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    WorkItemDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    WorkItemDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    WorkItemDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    WorkItemDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }


    /**
     * 设置「复现概率」值
     * 字典[复现概率]
     * @param val
     */
    WorkItemDTO setReappearProbability(String reappearProbability) {
        this.reappearProbability = reappearProbability
        return this
    }


    /**
     * 设置「严重程度」值
     * 字典[严重程度]
     * @param val
     */
    WorkItemDTO setSeverity(String severity) {
        this.severity = severity
        return this
    }


    /**
     * 设置「风险」值
     * 字典[风险]
     * @param val
     */
    WorkItemDTO setRisk(String risk) {
        this.risk = risk
        return this
    }


    /**
     * 设置「项目类型」值
     * 字典[项目类型]
     * @param val
     */
    WorkItemDTO setProjectType(String projectType) {
        this.projectType = projectType
        return this
    }


    /**
     * 设置「工作项类型分组」值
     * 字典[工作项类型分组]
     * @param val
     */
    WorkItemDTO setWorkItemTypeGroup(String workItemTypeGroup) {
        this.workItemTypeGroup = workItemTypeGroup
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    WorkItemDTO setTags(String tags) {
        this.tags = tags
        return this
    }


    /**
     * 设置「看板栏状态」值
     * @param val
     */
    WorkItemDTO setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus
        return this
    }


    /**
     * 设置「所在看板栏位置」值
     * @param val
     */
    WorkItemDTO setEntryPosition(Integer entryPosition) {
        this.entryPosition = entryPosition
        return this
    }


    /**
     * 设置「统计数」值
     * @param val
     */
    WorkItemDTO setRepNum(BigDecimal repNum) {
        this.repNum = repNum
        return this
    }


    /**
     * 设置「解决办法」值
     * @param val
     */
    WorkItemDTO setSolutionWay(String solutionWay) {
        this.solutionWay = solutionWay
        return this
    }


    /**
     * 设置「工作项类型序号」值
     * @param val
     */
    WorkItemDTO setWorkItemTypeSequence(BigDecimal workItemTypeSequence) {
        this.workItemTypeSequence = workItemTypeSequence
        return this
    }


    /**
     * 设置「完成时间」值
     * @param val
     */
    WorkItemDTO setCompletedAt(Timestamp completedAt) {
        this.completedAt = completedAt
        return this
    }


    /**
     * 设置「工时进度」值
     * @param val
     */
    WorkItemDTO setWorkloadSchedule(BigDecimal workloadSchedule) {
        this.workloadSchedule = workloadSchedule
        return this
    }


    /**
     * 设置「预估工时」值
     * @param val
     */
    WorkItemDTO setEstimatedWorkload(BigDecimal estimatedWorkload) {
        this.estimatedWorkload = estimatedWorkload
        return this
    }


    /**
     * 设置「任务类别」值
     * 字典[任务类别]
     * @param val
     */
    WorkItemDTO setJobType(String jobType) {
        this.jobType = jobType
        return this
    }


    /**
     * 设置「评审结果」值
     * 字典[评审结果]
     * @param val
     */
    WorkItemDTO setReviewResultState(String reviewResultState) {
        this.reviewResultState = reviewResultState
        return this
    }


    /**
     * 设置「测试计划ID」值
     * @param val
     */
    WorkItemDTO setTestPlanId(String testPlanId) {
        this.testPlanId = testPlanId
        return this
    }


    /**
     * 设置「剩余工时」值
     * @param val
     */
    WorkItemDTO setRemainingWorkload(BigDecimal remainingWorkload) {
        this.remainingWorkload = remainingWorkload
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    WorkItemDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「实际工时」值
     * @param val
     */
    WorkItemDTO setActualWorkload(BigDecimal actualWorkload) {
        this.actualWorkload = actualWorkload
        return this
    }


    /**
     * 设置「交付物」值
     * @param val
     */
    WorkItemDTO setDeliverable(List<DeliverableDTO> deliverable) {
        this.deliverable = deliverable
        return this
    }


    /**
     * 设置「关注数」值
     * @param val
     */
    WorkItemDTO setAttentionCount(String attentionCount) {
        this.attentionCount = attentionCount
        return this
    }


    /**
     * 设置「父工作项类型」值
     * @param val
     */
    WorkItemDTO setPWorkItemTypeId(String pWorkItemTypeId) {
        this.pWorkItemTypeId = pWorkItemTypeId
        return this
    }


    /**
     * 设置「评论数」值
     * @param val
     */
    WorkItemDTO setCommentCount(String commentCount) {
        this.commentCount = commentCount
        return this
    }


    /**
     * 设置「项目标识」值
     * @param val
     */
    WorkItemDTO setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier
        return this
    }


    /**
     * 设置「关注」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkItemDTO setAttentions(List<AttentionDTO> attentions) {
        this.attentions = attentions
        return this
    }


    /**
     * 设置「报表分组属性」值
     * @param val
     */
    WorkItemDTO setRepGroupValue(String repGroupValue) {
        this.repGroupValue = repGroupValue
        return this
    }


    /**
     * 设置「报表百分值」值
     * @param val
     */
    WorkItemDTO setRepPercentValue(Double repPercentValue) {
        this.repPercentValue = repPercentValue
        return this
    }


    /**
     * 设置「报表值1」值
     * @param val
     */
    WorkItemDTO setRepValue1(Integer repValue1) {
        this.repValue1 = repValue1
        return this
    }


    /**
     * 设置「报表值3」值
     * @param val
     */
    WorkItemDTO setRepValue3(Integer repValue3) {
        this.repValue3 = repValue3
        return this
    }


    /**
     * 设置「报表值2」值
     * @param val
     */
    WorkItemDTO setRepValue2(Integer repValue2) {
        this.repValue2 = repValue2
        return this
    }


    /**
     * 设置「工作项状态类型」值
     * 字典[工作项状态类型]
     * @param val
     */
    WorkItemDTO setStateType(String stateType) {
        this.stateType = stateType
        return this
    }


    /**
     * 设置「当前版本名称」值
     * @param val
     */
    WorkItemDTO setCurVersionName(String curVersionName) {
        this.curVersionName = curVersionName
        return this
    }


    /**
     * 设置「选择版本标识」值
     * @param val
     */
    WorkItemDTO setChooseVersionId(String chooseVersionId) {
        this.chooseVersionId = chooseVersionId
        return this
    }


    /**
     * 设置「选择版本名称」值
     * @param val
     */
    WorkItemDTO setChooseVersionName(String chooseVersionName) {
        this.chooseVersionName = chooseVersionName
        return this
    }


    /**
     * 设置「关注人」值
     * @param val
     */
    WorkItemDTO setAttentionsImp(String attentionsImp) {
        this.attentionsImp = attentionsImp
        return this
    }


    /**
     * 设置「迭代状态」值
     * 字典[迭代状态]
     * @param val
     */
    WorkItemDTO setSprintStatus(String sprintStatus) {
        this.sprintStatus = sprintStatus
        return this
    }


    /**
     * 设置「发布阶段」值
     * 字典[发布所属阶段]
     * @param val
     */
    WorkItemDTO setReleaseStatus(String releaseStatus) {
        this.releaseStatus = releaseStatus
        return this
    }


    /**
     * 设置「工作项下级类型」值
     * @param val
     */
    WorkItemDTO setWorkItemSubType(String workItemSubType) {
        this.workItemSubType = workItemSubType
        return this
    }


    /**
     * 设置「统计日期字段」值
     * @param val
     */
    WorkItemDTO setRepDate(Timestamp repDate) {
        this.repDate = repDate
        return this
    }


    /**
     * 设置「最近创建日期」值
     * @param val
     */
    WorkItemDTO setRecentCreateDays(Integer recentCreateDays) {
        this.recentCreateDays = recentCreateDays
        return this
    }


    /**
     * 设置「序号」值
     * @param val
     */
    WorkItemDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「关联产品需求数」值
     * @param val
     */
    WorkItemDTO setRelationTotalIdea(BigDecimal relationTotalIdea) {
        this.relationTotalIdea = relationTotalIdea
        return this
    }


    /**
     * 设置「关联测试用例数」值
     * @param val
     */
    WorkItemDTO setRelationTotalTestCase(BigDecimal relationTotalTestCase) {
        this.relationTotalTestCase = relationTotalTestCase
        return this
    }


    /**
     * 设置「关联工单数」值
     * @param val
     */
    WorkItemDTO setRelationTotalTicket(BigDecimal relationTotalTicket) {
        this.relationTotalTicket = relationTotalTicket
        return this
    }


    /**
     * 设置「关联工作项数」值
     * @param val
     */
    WorkItemDTO setRelationTotalWorkItem(BigDecimal relationTotalWorkItem) {
        this.relationTotalWorkItem = relationTotalWorkItem
        return this
    }


    /**
     * 设置「原始状态」值
     * 字典[工作项原始状态（类别）]
     * @param val
     */
    WorkItemDTO setWorkItemOriginState(String workItemOriginState) {
        this.workItemOriginState = workItemOriginState
        return this
    }


    /**
     * 设置「是否超时」值
     * @param val
     */
    WorkItemDTO setIsOvertime(Integer isOvertime) {
        this.isOvertime = isOvertime
        return this
    }


    /**
     * 设置「执行人」值
     * @param val
     */
    WorkItemDTO setExecutors(List<ExecutorDTO> executors) {
        this.executors = executors
        return this
    }


    /**
     * 设置「多人任务」值
     * 字典[是否]
     * @param val
     */
    WorkItemDTO setMultiplePeople(Integer multiplePeople) {
        this.multiplePeople = multiplePeople
        return this
    }


    /**
     * 设置「实际开始时间」值
     * @param val
     */
    WorkItemDTO setActualStartAt(Timestamp actualStartAt) {
        this.actualStartAt = actualStartAt
        return this
    }


    /**
     * 设置「实际结束时间」值
     * @param val
     */
    WorkItemDTO setActualEndAt(Timestamp actualEndAt) {
        this.actualEndAt = actualEndAt
        return this
    }


    /**
     * 设置「完成人」值
     * @param val
     */
    WorkItemDTO setFinisher(String finisher) {
        this.finisher = finisher
        return this
    }


    /**
     * 设置「逾期天数」值
     * @param val
     */
    WorkItemDTO setOverdueTime(String overdueTime) {
        this.overdueTime = overdueTime
        return this
    }


    /**
     * 设置「交付物」值
     * @param val
     */
    WorkItemDTO setDeliverableImp(String deliverableImp) {
        this.deliverableImp = deliverableImp
        return this
    }


    /**
     * 设置「项目是否删除」值
     * 字典[是否]
     * @param val
     */
    WorkItemDTO setProjectIsDeleted(Integer projectIsDeleted) {
        this.projectIsDeleted = projectIsDeleted
        return this
    }


    /**
     * 设置「项目是否归档」值
     * 字典[是否]
     * @param val
     */
    WorkItemDTO setProjectIsArchived(Integer projectIsArchived) {
        this.projectIsArchived = projectIsArchived
        return this
    }


    /**
     * 设置「依赖」值
     * @param val
     */
    WorkItemDTO setDependencies(List<DependencyDTO> dependencies) {
        this.dependencies = dependencies
        return this
    }


    /**
     * 设置「看板标识」值
     * @param val
     */
    WorkItemDTO setBoardId(String boardId) {
        this.boardId = boardId
        return this
    }


    /**
     * 设置「看板名称」值
     * @param val
     */
    WorkItemDTO setBoardName(String boardName) {
        this.boardName = boardName
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkItemDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    WorkItemDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「看板栏标识」值
     * @param val
     */
    WorkItemDTO setEntryId(String entryId) {
        this.entryId = entryId
        return this
    }


    /**
     * 设置「看板栏名称」值
     * @param val
     */
    WorkItemDTO setEntryName(String entryName) {
        this.entryName = entryName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    WorkItemDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    WorkItemDTO setPid(String pid) {
        this.pid = pid
        return this
    }


    /**
     * 设置「项目」值
     * @param val
     */
    WorkItemDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「所属项目」值
     * @param val
     */
    WorkItemDTO setProjectName(String projectName) {
        this.projectName = projectName
        return this
    }


    /**
     * 设置「父工作项」值
     * @param val
     */
    WorkItemDTO setPtitle(String ptitle) {
        this.ptitle = ptitle
        return this
    }


    /**
     * 设置「项目发布标识」值
     * @param val
     */
    WorkItemDTO setReleaseId(String releaseId) {
        this.releaseId = releaseId
        return this
    }


    /**
     * 设置「项目发布名称」值
     * @param val
     */
    WorkItemDTO setReleaseName(String releaseName) {
        this.releaseName = releaseName
        return this
    }


    /**
     * 设置「迭代标识」值
     * @param val
     */
    WorkItemDTO setSprintId(String sprintId) {
        this.sprintId = sprintId
        return this
    }


    /**
     * 设置「迭代名称」值
     * @param val
     */
    WorkItemDTO setSprintName(String sprintName) {
        this.sprintName = sprintName
        return this
    }


    /**
     * 设置「泳道标识」值
     * @param val
     */
    WorkItemDTO setSwimlaneId(String swimlaneId) {
        this.swimlaneId = swimlaneId
        return this
    }


    /**
     * 设置「顶级工作项标识」值
     * @param val
     */
    WorkItemDTO setTopId(String topId) {
        this.topId = topId
        return this
    }


    /**
     * 设置「顶级工作项标题」值
     * @param val
     */
    WorkItemDTO setTopTitle(String topTitle) {
        this.topTitle = topTitle
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkItemDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    WorkItemDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「工作项类型」值
     * 字典[工作项类型]
     * @param val
     */
    WorkItemDTO setWorkItemTypeId(String workItemTypeId) {
        this.workItemTypeId = workItemTypeId
        return this
    }


    /**
     * 设置「工作项类型」值
     * @param val
     */
    WorkItemDTO setWorkItemTypeName(String workItemTypeName) {
        this.workItemTypeName = workItemTypeName
        return this
    }


    /**
     * 设置「用户标记」值
     * @param val
     */
    WorkItemDTO setUserTag(String userTag) {
        this.userTag = userTag
        return this
    }


    /**
     * 设置「用户标记2」值
     * @param val
     */
    WorkItemDTO setUserTag2(String userTag2) {
        this.userTag2 = userTag2
        return this
    }

}
