package cn.ibizlab.plm.projmgmt.workitem.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.executor.dto.ExecutorDTO
import cn.ibizlab.plm.base.attention.dto.AttentionDTO
import cn.ibizlab.plm.base.deliverable.dto.DeliverableDTO
import cn.ibizlab.plm.base.attachment.dto.AttachmentDTO
import cn.ibizlab.plm.base.dependency.dto.DependencyDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class WorkItemPlanDTO extends GroovyDTO<WorkItemPlanDTO> {

    /**
     * 「看板标识」
     */
    @JsonProperty("board_id")
    String boardId
    /**
     * 「项目是否归档」
     * 字典[是否]
     */
    @JsonProperty("project_is_archived")
    Integer projectIsArchived
    /**
     * 「项目是否删除」
     * 字典[是否]
     */
    @JsonProperty("project_is_deleted")
    Integer projectIsDeleted
    /**
     * 「交付物」
     */
    @JsonProperty("deliverable_imp")
    String deliverableImp
    /**
     * 「逾期天数」
     */
    @JsonProperty("overdue_time")
    String overdueTime
    /**
     * 「完成人」
     */
    @JsonProperty("finisher")
    String finisher
    /**
     * 「实际结束时间」
     */
    @JsonProperty("actual_end_at")
    Timestamp actualEndAt
    /**
     * 「实际开始时间」
     */
    @JsonProperty("actual_start_at")
    Timestamp actualStartAt
    /**
     * 「多人任务」
     * 字典[是否]
     */
    @JsonProperty("multiple_people")
    Integer multiplePeople
    /**
     * 「执行人」
     */
    @JsonProperty("executors")
    List<ExecutorDTO> executors
    /**
     * 「是否超时」
     */
    @JsonProperty("is_overtime")
    Integer isOvertime
    /**
     * 「解决办法」
     */
    @JsonProperty("solution_way")
    String solutionWay
    /**
     * 「标签」
     */
    @JsonProperty("tags")
    String tags
    /**
     * 「父工作项类型」
     */
    @JsonProperty("p_work_item_type_id")
    String pWorkItemTypeId
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
     * 「关注」
     * 字典[云系统操作者]
     */
    @JsonProperty("attentions")
    List<AttentionDTO> attentions
    /**
     * 「原始状态」
     * 字典[工作项原始状态（类别）]
     */
    @JsonProperty("work_item_origin_state")
    String workItemOriginState
    /**
     * 「状态」
     * 字典[工作项状态（动态）]
     */
    @JsonProperty("state")
    String state
    /**
     * 「发布阶段」
     * 字典[发布所属阶段]
     */
    @JsonProperty("release_status")
    String releaseStatus
    /**
     * 「工作项状态类型」
     * 字典[工作项状态类型]
     */
    @JsonProperty("state_type")
    String stateType
    /**
     * 「序号」
     */
    @JsonProperty("sequence")
    BigDecimal sequence
    /**
     * 「所在看板栏位置」
     */
    @JsonProperty("entry_position")
    Integer entryPosition
    /**
     * 「统计日期字段」
     */
    @JsonProperty("rep_date")
    Timestamp repDate
    /**
     * 「截止时间」
     */
    @JsonProperty("end_at")
    Timestamp endAt
    /**
     * 「报表值3」
     */
    @JsonProperty("rep_value3")
    Integer repValue3
    /**
     * 「最近创建日期」
     */
    @JsonProperty("recent_create_days")
    Integer recentCreateDays
    /**
     * 「报表值2」
     */
    @JsonProperty("rep_value2")
    Integer repValue2
    /**
     * 「工作项类型序号」
     */
    @JsonProperty("work_item_type_sequence")
    BigDecimal workItemTypeSequence
    /**
     * 「工作项类型」
     * 字典[工作项类型]
     */
    @JsonProperty("work_item_type_id")
    String workItemTypeId
    /**
     * 「工作项类型分组」
     * 字典[工作项类型分组]
     */
    @JsonProperty("work_item_type_group")
    String workItemTypeGroup
    /**
     * 「工作项下级类型」
     */
    @JsonProperty("work_item_sub_type")
    String workItemSubType
    /**
     * 「顶级工作项标题」
     */
    @JsonProperty("top_title")
    String topTitle
    /**
     * 「顶级工作项标识」
     */
    @JsonProperty("top_id")
    String topId
    /**
     * 「测试计划ID」
     */
    @JsonProperty("test_plan_id")
    String testPlanId
    /**
     * 「泳道标识」
     */
    @JsonProperty("swimlane_id")
    String swimlaneId
    /**
     * 「迭代标识」
     */
    @JsonProperty("sprint_id")
    String sprintId
    /**
     * 「报表值1」
     */
    @JsonProperty("rep_value1")
    Integer repValue1
    /**
     * 「报表百分值」
     */
    @JsonProperty("rep_percent_value")
    Double repPercentValue
    /**
     * 「报表分组属性」
     */
    @JsonProperty("rep_group_value")
    String repGroupValue
    /**
     * 「项目发布标识」
     */
    @JsonProperty("release_id")
    String releaseId
    /**
     * 「项目标识」
     */
    @JsonProperty("project_identifier")
    String projectIdentifier
    /**
     * 「项目」
     */
    @JsonProperty("project_id")
    String projectId
    /**
     * 「父标识」
     */
    @JsonProperty("pid")
    String pid
    /**
     * 「是否叶子节点」
     * 字典[是否]
     */
    @JsonProperty("is_leaf")
    Integer isLeaf
    /**
     * 「是否已删除」
     * 字典[是否]
     */
    @JsonProperty("is_deleted")
    Integer isDeleted
    /**
     * 「是否已归档」
     * 字典[是否]
     */
    @JsonProperty("is_archived")
    Integer isArchived
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「看板栏状态」
     */
    @JsonProperty("entry_status")
    String entryStatus
    /**
     * 「看板栏标识」
     */
    @JsonProperty("entry_id")
    String entryId
    /**
     * 「交付物」
     */
    @JsonProperty("deliverable")
    List<DeliverableDTO> deliverable
    /**
     * 「当前版本名称」
     */
    @JsonProperty("cur_version_name")
    String curVersionName
    /**
     * 「当前版本标识」
     */
    @JsonProperty("cur_version_id")
    String curVersionId
    /**
     * 「选择版本名称」
     */
    @JsonProperty("choose_version_name")
    String chooseVersionName
    /**
     * 「选择版本标识」
     */
    @JsonProperty("choose_version_id")
    String chooseVersionId
    /**
     * 「关注人」
     */
    @JsonProperty("attentions_imp")
    String attentionsImp
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_id")
    String assigneeId
    /**
     * 「统计数」
     */
    @JsonProperty("rep_num")
    BigDecimal repNum
    /**
     * 「看板栏名称」
     */
    @JsonProperty("entry_name")
    String entryName
    /**
     * 「迭代状态」
     * 字典[迭代状态]
     */
    @JsonProperty("sprint_status")
    String sprintStatus
    /**
     * 「迭代名称」
     */
    @JsonProperty("sprint_name")
    String sprintName
    /**
     * 「项目发布名称」
     */
    @JsonProperty("release_name")
    String releaseName
    /**
     * 「剩余工时」
     */
    @JsonProperty("remaining_workload")
    BigDecimal remainingWorkload
    /**
     * 「风险」
     * 字典[风险]
     */
    @JsonProperty("risk")
    String risk
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「严重程度」
     * 字典[严重程度]
     */
    @JsonProperty("severity")
    String severity
    /**
     * 「开始时间」
     */
    @JsonProperty("start_at")
    Timestamp startAt
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「需求来源」
     * 字典[需求来源]
     */
    @JsonProperty("backlog_from")
    String backlogFrom
    /**
     * 「任务类别」
     * 字典[任务类别]
     */
    @JsonProperty("job_type")
    String jobType
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
     * 「项目类型」
     * 字典[项目类型]
     */
    @JsonProperty("project_type")
    String projectType
    /**
     * 「完成时间」
     */
    @JsonProperty("completed_at")
    Timestamp completedAt
    /**
     * 「复现概率」
     * 字典[复现概率]
     */
    @JsonProperty("reappear_probability")
    String reappearProbability
    /**
     * 「需求类型」
     * 字典[需求类型]
     */
    @JsonProperty("backlog_type")
    String backlogType
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「优先级」
     * 字典[优先级]
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「看板名称」
     */
    @JsonProperty("board_name")
    String boardName
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
     * 「所属项目」
     */
    @JsonProperty("project_name")
    String projectName
    /**
     * 「工作项类型」
     */
    @JsonProperty("work_item_type_name")
    String workItemTypeName
    /**
     * 「父工作项」
     */
    @JsonProperty("ptitle")
    String ptitle
    /**
     * 「依赖」
     */
    @JsonProperty("dependencies")
    List<DependencyDTO> dependencies

    /**
     * 设置「看板标识」值
     * @param val
     */
    WorkItemPlanDTO setBoardId(String boardId) {
        this.boardId = boardId
        return this
    }


    /**
     * 设置「项目是否归档」值
     * 字典[是否]
     * @param val
     */
    WorkItemPlanDTO setProjectIsArchived(Integer projectIsArchived) {
        this.projectIsArchived = projectIsArchived
        return this
    }


    /**
     * 设置「项目是否删除」值
     * 字典[是否]
     * @param val
     */
    WorkItemPlanDTO setProjectIsDeleted(Integer projectIsDeleted) {
        this.projectIsDeleted = projectIsDeleted
        return this
    }


    /**
     * 设置「交付物」值
     * @param val
     */
    WorkItemPlanDTO setDeliverableImp(String deliverableImp) {
        this.deliverableImp = deliverableImp
        return this
    }


    /**
     * 设置「逾期天数」值
     * @param val
     */
    WorkItemPlanDTO setOverdueTime(String overdueTime) {
        this.overdueTime = overdueTime
        return this
    }


    /**
     * 设置「完成人」值
     * @param val
     */
    WorkItemPlanDTO setFinisher(String finisher) {
        this.finisher = finisher
        return this
    }


    /**
     * 设置「实际结束时间」值
     * @param val
     */
    WorkItemPlanDTO setActualEndAt(Timestamp actualEndAt) {
        this.actualEndAt = actualEndAt
        return this
    }


    /**
     * 设置「实际开始时间」值
     * @param val
     */
    WorkItemPlanDTO setActualStartAt(Timestamp actualStartAt) {
        this.actualStartAt = actualStartAt
        return this
    }


    /**
     * 设置「多人任务」值
     * 字典[是否]
     * @param val
     */
    WorkItemPlanDTO setMultiplePeople(Integer multiplePeople) {
        this.multiplePeople = multiplePeople
        return this
    }


    /**
     * 设置「执行人」值
     * @param val
     */
    WorkItemPlanDTO setExecutors(List<ExecutorDTO> executors) {
        this.executors = executors
        return this
    }


    /**
     * 设置「是否超时」值
     * @param val
     */
    WorkItemPlanDTO setIsOvertime(Integer isOvertime) {
        this.isOvertime = isOvertime
        return this
    }


    /**
     * 设置「解决办法」值
     * @param val
     */
    WorkItemPlanDTO setSolutionWay(String solutionWay) {
        this.solutionWay = solutionWay
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    WorkItemPlanDTO setTags(String tags) {
        this.tags = tags
        return this
    }


    /**
     * 设置「父工作项类型」值
     * @param val
     */
    WorkItemPlanDTO setPWorkItemTypeId(String pWorkItemTypeId) {
        this.pWorkItemTypeId = pWorkItemTypeId
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    WorkItemPlanDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    WorkItemPlanDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「关注」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkItemPlanDTO setAttentions(List<AttentionDTO> attentions) {
        this.attentions = attentions
        return this
    }


    /**
     * 设置「原始状态」值
     * 字典[工作项原始状态（类别）]
     * @param val
     */
    WorkItemPlanDTO setWorkItemOriginState(String workItemOriginState) {
        this.workItemOriginState = workItemOriginState
        return this
    }


    /**
     * 设置「状态」值
     * 字典[工作项状态（动态）]
     * @param val
     */
    WorkItemPlanDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「发布阶段」值
     * 字典[发布所属阶段]
     * @param val
     */
    WorkItemPlanDTO setReleaseStatus(String releaseStatus) {
        this.releaseStatus = releaseStatus
        return this
    }


    /**
     * 设置「工作项状态类型」值
     * 字典[工作项状态类型]
     * @param val
     */
    WorkItemPlanDTO setStateType(String stateType) {
        this.stateType = stateType
        return this
    }


    /**
     * 设置「序号」值
     * @param val
     */
    WorkItemPlanDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「所在看板栏位置」值
     * @param val
     */
    WorkItemPlanDTO setEntryPosition(Integer entryPosition) {
        this.entryPosition = entryPosition
        return this
    }


    /**
     * 设置「统计日期字段」值
     * @param val
     */
    WorkItemPlanDTO setRepDate(Timestamp repDate) {
        this.repDate = repDate
        return this
    }


    /**
     * 设置「截止时间」值
     * @param val
     */
    WorkItemPlanDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「报表值3」值
     * @param val
     */
    WorkItemPlanDTO setRepValue3(Integer repValue3) {
        this.repValue3 = repValue3
        return this
    }


    /**
     * 设置「最近创建日期」值
     * @param val
     */
    WorkItemPlanDTO setRecentCreateDays(Integer recentCreateDays) {
        this.recentCreateDays = recentCreateDays
        return this
    }


    /**
     * 设置「报表值2」值
     * @param val
     */
    WorkItemPlanDTO setRepValue2(Integer repValue2) {
        this.repValue2 = repValue2
        return this
    }


    /**
     * 设置「工作项类型序号」值
     * @param val
     */
    WorkItemPlanDTO setWorkItemTypeSequence(BigDecimal workItemTypeSequence) {
        this.workItemTypeSequence = workItemTypeSequence
        return this
    }


    /**
     * 设置「工作项类型」值
     * 字典[工作项类型]
     * @param val
     */
    WorkItemPlanDTO setWorkItemTypeId(String workItemTypeId) {
        this.workItemTypeId = workItemTypeId
        return this
    }


    /**
     * 设置「工作项类型分组」值
     * 字典[工作项类型分组]
     * @param val
     */
    WorkItemPlanDTO setWorkItemTypeGroup(String workItemTypeGroup) {
        this.workItemTypeGroup = workItemTypeGroup
        return this
    }


    /**
     * 设置「工作项下级类型」值
     * @param val
     */
    WorkItemPlanDTO setWorkItemSubType(String workItemSubType) {
        this.workItemSubType = workItemSubType
        return this
    }


    /**
     * 设置「顶级工作项标题」值
     * @param val
     */
    WorkItemPlanDTO setTopTitle(String topTitle) {
        this.topTitle = topTitle
        return this
    }


    /**
     * 设置「顶级工作项标识」值
     * @param val
     */
    WorkItemPlanDTO setTopId(String topId) {
        this.topId = topId
        return this
    }


    /**
     * 设置「测试计划ID」值
     * @param val
     */
    WorkItemPlanDTO setTestPlanId(String testPlanId) {
        this.testPlanId = testPlanId
        return this
    }


    /**
     * 设置「泳道标识」值
     * @param val
     */
    WorkItemPlanDTO setSwimlaneId(String swimlaneId) {
        this.swimlaneId = swimlaneId
        return this
    }


    /**
     * 设置「迭代标识」值
     * @param val
     */
    WorkItemPlanDTO setSprintId(String sprintId) {
        this.sprintId = sprintId
        return this
    }


    /**
     * 设置「报表值1」值
     * @param val
     */
    WorkItemPlanDTO setRepValue1(Integer repValue1) {
        this.repValue1 = repValue1
        return this
    }


    /**
     * 设置「报表百分值」值
     * @param val
     */
    WorkItemPlanDTO setRepPercentValue(Double repPercentValue) {
        this.repPercentValue = repPercentValue
        return this
    }


    /**
     * 设置「报表分组属性」值
     * @param val
     */
    WorkItemPlanDTO setRepGroupValue(String repGroupValue) {
        this.repGroupValue = repGroupValue
        return this
    }


    /**
     * 设置「项目发布标识」值
     * @param val
     */
    WorkItemPlanDTO setReleaseId(String releaseId) {
        this.releaseId = releaseId
        return this
    }


    /**
     * 设置「项目标识」值
     * @param val
     */
    WorkItemPlanDTO setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier
        return this
    }


    /**
     * 设置「项目」值
     * @param val
     */
    WorkItemPlanDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    WorkItemPlanDTO setPid(String pid) {
        this.pid = pid
        return this
    }


    /**
     * 设置「是否叶子节点」值
     * 字典[是否]
     * @param val
     */
    WorkItemPlanDTO setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    WorkItemPlanDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    WorkItemPlanDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    WorkItemPlanDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「看板栏状态」值
     * @param val
     */
    WorkItemPlanDTO setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus
        return this
    }


    /**
     * 设置「看板栏标识」值
     * @param val
     */
    WorkItemPlanDTO setEntryId(String entryId) {
        this.entryId = entryId
        return this
    }


    /**
     * 设置「交付物」值
     * @param val
     */
    WorkItemPlanDTO setDeliverable(List<DeliverableDTO> deliverable) {
        this.deliverable = deliverable
        return this
    }


    /**
     * 设置「当前版本名称」值
     * @param val
     */
    WorkItemPlanDTO setCurVersionName(String curVersionName) {
        this.curVersionName = curVersionName
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    WorkItemPlanDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }


    /**
     * 设置「选择版本名称」值
     * @param val
     */
    WorkItemPlanDTO setChooseVersionName(String chooseVersionName) {
        this.chooseVersionName = chooseVersionName
        return this
    }


    /**
     * 设置「选择版本标识」值
     * @param val
     */
    WorkItemPlanDTO setChooseVersionId(String chooseVersionId) {
        this.chooseVersionId = chooseVersionId
        return this
    }


    /**
     * 设置「关注人」值
     * @param val
     */
    WorkItemPlanDTO setAttentionsImp(String attentionsImp) {
        this.attentionsImp = attentionsImp
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    WorkItemPlanDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「统计数」值
     * @param val
     */
    WorkItemPlanDTO setRepNum(BigDecimal repNum) {
        this.repNum = repNum
        return this
    }


    /**
     * 设置「看板栏名称」值
     * @param val
     */
    WorkItemPlanDTO setEntryName(String entryName) {
        this.entryName = entryName
        return this
    }


    /**
     * 设置「迭代状态」值
     * 字典[迭代状态]
     * @param val
     */
    WorkItemPlanDTO setSprintStatus(String sprintStatus) {
        this.sprintStatus = sprintStatus
        return this
    }


    /**
     * 设置「迭代名称」值
     * @param val
     */
    WorkItemPlanDTO setSprintName(String sprintName) {
        this.sprintName = sprintName
        return this
    }


    /**
     * 设置「项目发布名称」值
     * @param val
     */
    WorkItemPlanDTO setReleaseName(String releaseName) {
        this.releaseName = releaseName
        return this
    }


    /**
     * 设置「剩余工时」值
     * @param val
     */
    WorkItemPlanDTO setRemainingWorkload(BigDecimal remainingWorkload) {
        this.remainingWorkload = remainingWorkload
        return this
    }


    /**
     * 设置「风险」值
     * 字典[风险]
     * @param val
     */
    WorkItemPlanDTO setRisk(String risk) {
        this.risk = risk
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    WorkItemPlanDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「严重程度」值
     * 字典[严重程度]
     * @param val
     */
    WorkItemPlanDTO setSeverity(String severity) {
        this.severity = severity
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    WorkItemPlanDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkItemPlanDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    WorkItemPlanDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「需求来源」值
     * 字典[需求来源]
     * @param val
     */
    WorkItemPlanDTO setBacklogFrom(String backlogFrom) {
        this.backlogFrom = backlogFrom
        return this
    }


    /**
     * 设置「任务类别」值
     * 字典[任务类别]
     * @param val
     */
    WorkItemPlanDTO setJobType(String jobType) {
        this.jobType = jobType
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    WorkItemPlanDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「实际工时」值
     * @param val
     */
    WorkItemPlanDTO setActualWorkload(BigDecimal actualWorkload) {
        this.actualWorkload = actualWorkload
        return this
    }


    /**
     * 设置「项目类型」值
     * 字典[项目类型]
     * @param val
     */
    WorkItemPlanDTO setProjectType(String projectType) {
        this.projectType = projectType
        return this
    }


    /**
     * 设置「完成时间」值
     * @param val
     */
    WorkItemPlanDTO setCompletedAt(Timestamp completedAt) {
        this.completedAt = completedAt
        return this
    }


    /**
     * 设置「复现概率」值
     * 字典[复现概率]
     * @param val
     */
    WorkItemPlanDTO setReappearProbability(String reappearProbability) {
        this.reappearProbability = reappearProbability
        return this
    }


    /**
     * 设置「需求类型」值
     * 字典[需求类型]
     * @param val
     */
    WorkItemPlanDTO setBacklogType(String backlogType) {
        this.backlogType = backlogType
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    WorkItemPlanDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[优先级]
     * @param val
     */
    WorkItemPlanDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「看板名称」值
     * @param val
     */
    WorkItemPlanDTO setBoardName(String boardName) {
        this.boardName = boardName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkItemPlanDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    WorkItemPlanDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「预估工时」值
     * @param val
     */
    WorkItemPlanDTO setEstimatedWorkload(BigDecimal estimatedWorkload) {
        this.estimatedWorkload = estimatedWorkload
        return this
    }


    /**
     * 设置「工时进度」值
     * @param val
     */
    WorkItemPlanDTO setWorkloadSchedule(BigDecimal workloadSchedule) {
        this.workloadSchedule = workloadSchedule
        return this
    }


    /**
     * 设置「所属项目」值
     * @param val
     */
    WorkItemPlanDTO setProjectName(String projectName) {
        this.projectName = projectName
        return this
    }


    /**
     * 设置「工作项类型」值
     * @param val
     */
    WorkItemPlanDTO setWorkItemTypeName(String workItemTypeName) {
        this.workItemTypeName = workItemTypeName
        return this
    }


    /**
     * 设置「父工作项」值
     * @param val
     */
    WorkItemPlanDTO setPtitle(String ptitle) {
        this.ptitle = ptitle
        return this
    }


    /**
     * 设置「依赖」值
     * @param val
     */
    WorkItemPlanDTO setDependencies(List<DependencyDTO> dependencies) {
        this.dependencies = dependencies
        return this
    }

}
