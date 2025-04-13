package cn.ibizlab.plm.projmgmt.workitem.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class WorkItemBiSearchGroupDTO extends GroovyDTO<WorkItemBiSearchGroupDTO> {

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
     * 「完成时间」
     */
    @JsonProperty("completed_at")
    Timestamp completedAt
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
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
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「报表分组属性」
     */
    @JsonProperty("rep_group_value")
    String repGroupValue
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「关注人」
     */
    @JsonProperty("attentions_imp")
    String attentionsImp
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
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
     * 「关联测试用例数」
     */
    @JsonProperty("relation_total_test_case")
    BigDecimal relationTotalTestCase
    /**
     * 「关联产品需求数」
     */
    @JsonProperty("relation_total_idea")
    BigDecimal relationTotalIdea
    /**
     * 「项目类型」
     * 字典[项目类型]
     */
    @JsonProperty("project_type")
    String projectType
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
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「工作项类型」
     * 字典[工作项类型]
     */
    @JsonProperty("work_item_type_id")
    String workItemTypeId
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_id")
    String assigneeId
    /**
     * 「状态」
     * 字典[工作项状态（动态）]
     */
    @JsonProperty("state")
    String state
    /**
     * 「项目」
     */
    @JsonProperty("project_id")
    String projectId
    /**
     * 「任务类别」
     * 字典[任务类别]
     */
    @JsonProperty("job_type")
    String jobType
    /**
     * 「需求来源」
     * 字典[需求来源]
     */
    @JsonProperty("backlog_from")
    String backlogFrom
    /**
     * 「复现概率」
     * 字典[复现概率]
     */
    @JsonProperty("reappear_probability")
    String reappearProbability
    /**
     * 「优先级」
     * 字典[优先级]
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「需求类型」
     * 字典[需求类型]
     */
    @JsonProperty("backlog_type")
    String backlogType
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
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「工作项状态类型」
     * 字典[工作项状态类型]
     */
    @JsonProperty("state_type")
    String stateType
    /**
     * 「迭代标识」
     */
    @JsonProperty("sprint_id")
    String sprintId
    /**
     * 「工作项类型分组」
     * 字典[工作项类型分组]
     */
    @JsonProperty("work_item_type_group")
    String workItemTypeGroup
    /**
     * 「迭代名称」
     */
    @JsonProperty("sprint_name")
    String sprintName
    /**
     * 「实际工时」
     */
    @JsonProperty("actual_workload")
    BigDecimal actualWorkload
    /**
     * 「预估工时」
     */
    @JsonProperty("estimated_workload")
    BigDecimal estimatedWorkload
    /**
     * 「项目发布名称」
     */
    @JsonProperty("release_name")
    String releaseName
    /**
     * 「项目发布标识」
     */
    @JsonProperty("release_id")
    String releaseId
    /**
     * 「标签」
     */
    @JsonProperty("tags")
    String tags
    /**
     * 「看板栏名称」
     */
    @JsonProperty("entry_name")
    String entryName
    /**
     * 「看板栏标识」
     */
    @JsonProperty("entry_id")
    String entryId
    /**
     * 「原始状态」
     * 字典[工作项原始状态（类别）]
     */
    @JsonProperty("work_item_origin_state")
    String workItemOriginState
    /**
     * 「看板名称」
     */
    @JsonProperty("board_name")
    String boardName
    /**
     * 「看板标识」
     */
    @JsonProperty("board_id")
    String boardId
    /**
     * 「项目是否删除」
     * 字典[是否]
     */
    @JsonProperty("project_is_deleted")
    Integer projectIsDeleted

    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    WorkItemBiSearchGroupDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    WorkItemBiSearchGroupDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「完成时间」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setCompletedAt(Timestamp completedAt) {
        this.completedAt = completedAt
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「截止时间」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「报表分组属性」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setRepGroupValue(String repGroupValue) {
        this.repGroupValue = repGroupValue
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkItemBiSearchGroupDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「关注人」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setAttentionsImp(String attentionsImp) {
        this.attentionsImp = attentionsImp
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkItemBiSearchGroupDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「关联工单数」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setRelationTotalTicket(BigDecimal relationTotalTicket) {
        this.relationTotalTicket = relationTotalTicket
        return this
    }


    /**
     * 设置「关联工作项数」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setRelationTotalWorkItem(BigDecimal relationTotalWorkItem) {
        this.relationTotalWorkItem = relationTotalWorkItem
        return this
    }


    /**
     * 设置「工时进度」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setWorkloadSchedule(BigDecimal workloadSchedule) {
        this.workloadSchedule = workloadSchedule
        return this
    }


    /**
     * 设置「剩余工时」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setRemainingWorkload(BigDecimal remainingWorkload) {
        this.remainingWorkload = remainingWorkload
        return this
    }


    /**
     * 设置「关联测试用例数」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setRelationTotalTestCase(BigDecimal relationTotalTestCase) {
        this.relationTotalTestCase = relationTotalTestCase
        return this
    }


    /**
     * 设置「关联产品需求数」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setRelationTotalIdea(BigDecimal relationTotalIdea) {
        this.relationTotalIdea = relationTotalIdea
        return this
    }


    /**
     * 设置「项目类型」值
     * 字典[项目类型]
     * @param val
     */
    WorkItemBiSearchGroupDTO setProjectType(String projectType) {
        this.projectType = projectType
        return this
    }


    /**
     * 设置「所属项目」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setProjectName(String projectName) {
        this.projectName = projectName
        return this
    }


    /**
     * 设置「工作项类型」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setWorkItemTypeName(String workItemTypeName) {
        this.workItemTypeName = workItemTypeName
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「工作项类型」值
     * 字典[工作项类型]
     * @param val
     */
    WorkItemBiSearchGroupDTO setWorkItemTypeId(String workItemTypeId) {
        this.workItemTypeId = workItemTypeId
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「状态」值
     * 字典[工作项状态（动态）]
     * @param val
     */
    WorkItemBiSearchGroupDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「项目」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「任务类别」值
     * 字典[任务类别]
     * @param val
     */
    WorkItemBiSearchGroupDTO setJobType(String jobType) {
        this.jobType = jobType
        return this
    }


    /**
     * 设置「需求来源」值
     * 字典[需求来源]
     * @param val
     */
    WorkItemBiSearchGroupDTO setBacklogFrom(String backlogFrom) {
        this.backlogFrom = backlogFrom
        return this
    }


    /**
     * 设置「复现概率」值
     * 字典[复现概率]
     * @param val
     */
    WorkItemBiSearchGroupDTO setReappearProbability(String reappearProbability) {
        this.reappearProbability = reappearProbability
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[优先级]
     * @param val
     */
    WorkItemBiSearchGroupDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「需求类型」值
     * 字典[需求类型]
     * @param val
     */
    WorkItemBiSearchGroupDTO setBacklogType(String backlogType) {
        this.backlogType = backlogType
        return this
    }


    /**
     * 设置「严重程度」值
     * 字典[严重程度]
     * @param val
     */
    WorkItemBiSearchGroupDTO setSeverity(String severity) {
        this.severity = severity
        return this
    }


    /**
     * 设置「风险」值
     * 字典[风险]
     * @param val
     */
    WorkItemBiSearchGroupDTO setRisk(String risk) {
        this.risk = risk
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「工作项状态类型」值
     * 字典[工作项状态类型]
     * @param val
     */
    WorkItemBiSearchGroupDTO setStateType(String stateType) {
        this.stateType = stateType
        return this
    }


    /**
     * 设置「迭代标识」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setSprintId(String sprintId) {
        this.sprintId = sprintId
        return this
    }


    /**
     * 设置「工作项类型分组」值
     * 字典[工作项类型分组]
     * @param val
     */
    WorkItemBiSearchGroupDTO setWorkItemTypeGroup(String workItemTypeGroup) {
        this.workItemTypeGroup = workItemTypeGroup
        return this
    }


    /**
     * 设置「迭代名称」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setSprintName(String sprintName) {
        this.sprintName = sprintName
        return this
    }


    /**
     * 设置「实际工时」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setActualWorkload(BigDecimal actualWorkload) {
        this.actualWorkload = actualWorkload
        return this
    }


    /**
     * 设置「预估工时」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setEstimatedWorkload(BigDecimal estimatedWorkload) {
        this.estimatedWorkload = estimatedWorkload
        return this
    }


    /**
     * 设置「项目发布名称」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setReleaseName(String releaseName) {
        this.releaseName = releaseName
        return this
    }


    /**
     * 设置「项目发布标识」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setReleaseId(String releaseId) {
        this.releaseId = releaseId
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setTags(String tags) {
        this.tags = tags
        return this
    }


    /**
     * 设置「看板栏名称」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setEntryName(String entryName) {
        this.entryName = entryName
        return this
    }


    /**
     * 设置「看板栏标识」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setEntryId(String entryId) {
        this.entryId = entryId
        return this
    }


    /**
     * 设置「原始状态」值
     * 字典[工作项原始状态（类别）]
     * @param val
     */
    WorkItemBiSearchGroupDTO setWorkItemOriginState(String workItemOriginState) {
        this.workItemOriginState = workItemOriginState
        return this
    }


    /**
     * 设置「看板名称」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setBoardName(String boardName) {
        this.boardName = boardName
        return this
    }


    /**
     * 设置「看板标识」值
     * @param val
     */
    WorkItemBiSearchGroupDTO setBoardId(String boardId) {
        this.boardId = boardId
        return this
    }


    /**
     * 设置「项目是否删除」值
     * 字典[是否]
     * @param val
     */
    WorkItemBiSearchGroupDTO setProjectIsDeleted(Integer projectIsDeleted) {
        this.projectIsDeleted = projectIsDeleted
        return this
    }

}
