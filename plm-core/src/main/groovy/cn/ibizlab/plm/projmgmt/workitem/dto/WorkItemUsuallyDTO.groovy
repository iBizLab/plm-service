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
class WorkItemUsuallyDTO extends GroovyDTO<WorkItemUsuallyDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「是否已删除」
     * 字典[是否]
     */
    @JsonProperty("is_deleted")
    Integer isDeleted
    /**
     * 「状态」
     * 字典[工作项状态（动态）]
     */
    @JsonProperty("state")
    String state
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
     * 「父标识」
     */
    @JsonProperty("pid")
    String pid
    /**
     * 「顶级工作项标识」
     */
    @JsonProperty("top_id")
    String topId
    /**
     * 「项目」
     */
    @JsonProperty("project_id")
    String projectId
    /**
     * 「是否已归档」
     * 字典[是否]
     */
    @JsonProperty("is_archived")
    Integer isArchived
    /**
     * 「父工作项」
     */
    @JsonProperty("ptitle")
    String ptitle
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
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「所属项目」
     */
    @JsonProperty("project_name")
    String projectName
    /**
     * 「迭代标识」
     */
    @JsonProperty("sprint_id")
    String sprintId
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
     * 「风险」
     * 字典[风险]
     */
    @JsonProperty("risk")
    String risk
    /**
     * 「迭代名称」
     */
    @JsonProperty("sprint_name")
    String sprintName
    /**
     * 「当前版本标识」
     */
    @JsonProperty("cur_version_id")
    String curVersionId
    /**
     * 「截止时间」
     */
    @JsonProperty("end_at")
    Timestamp endAt
    /**
     * 「开始时间」
     */
    @JsonProperty("start_at")
    Timestamp startAt
    /**
     * 「工作项状态类型」
     * 字典[工作项状态类型]
     */
    @JsonProperty("state_type")
    String stateType
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「是否超时」
     */
    @JsonProperty("is_overtime")
    Integer isOvertime
    /**
     * 「多人任务」
     * 字典[是否]
     */
    @JsonProperty("multiple_people")
    Integer multiplePeople
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
     * 设置「标识」值
     * @param val
     */
    WorkItemUsuallyDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    WorkItemUsuallyDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    WorkItemUsuallyDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    WorkItemUsuallyDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「状态」值
     * 字典[工作项状态（动态）]
     * @param val
     */
    WorkItemUsuallyDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「工作项类型」值
     * 字典[工作项类型]
     * @param val
     */
    WorkItemUsuallyDTO setWorkItemTypeId(String workItemTypeId) {
        this.workItemTypeId = workItemTypeId
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    WorkItemUsuallyDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    WorkItemUsuallyDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[优先级]
     * @param val
     */
    WorkItemUsuallyDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    WorkItemUsuallyDTO setPid(String pid) {
        this.pid = pid
        return this
    }


    /**
     * 设置「顶级工作项标识」值
     * @param val
     */
    WorkItemUsuallyDTO setTopId(String topId) {
        this.topId = topId
        return this
    }


    /**
     * 设置「项目」值
     * @param val
     */
    WorkItemUsuallyDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    WorkItemUsuallyDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「父工作项」值
     * @param val
     */
    WorkItemUsuallyDTO setPtitle(String ptitle) {
        this.ptitle = ptitle
        return this
    }


    /**
     * 设置「复现概率」值
     * 字典[复现概率]
     * @param val
     */
    WorkItemUsuallyDTO setReappearProbability(String reappearProbability) {
        this.reappearProbability = reappearProbability
        return this
    }


    /**
     * 设置「严重程度」值
     * 字典[严重程度]
     * @param val
     */
    WorkItemUsuallyDTO setSeverity(String severity) {
        this.severity = severity
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    WorkItemUsuallyDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    WorkItemUsuallyDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「所属项目」值
     * @param val
     */
    WorkItemUsuallyDTO setProjectName(String projectName) {
        this.projectName = projectName
        return this
    }


    /**
     * 设置「迭代标识」值
     * @param val
     */
    WorkItemUsuallyDTO setSprintId(String sprintId) {
        this.sprintId = sprintId
        return this
    }


    /**
     * 设置「需求类型」值
     * 字典[需求类型]
     * @param val
     */
    WorkItemUsuallyDTO setBacklogType(String backlogType) {
        this.backlogType = backlogType
        return this
    }


    /**
     * 设置「需求来源」值
     * 字典[需求来源]
     * @param val
     */
    WorkItemUsuallyDTO setBacklogFrom(String backlogFrom) {
        this.backlogFrom = backlogFrom
        return this
    }


    /**
     * 设置「风险」值
     * 字典[风险]
     * @param val
     */
    WorkItemUsuallyDTO setRisk(String risk) {
        this.risk = risk
        return this
    }


    /**
     * 设置「迭代名称」值
     * @param val
     */
    WorkItemUsuallyDTO setSprintName(String sprintName) {
        this.sprintName = sprintName
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    WorkItemUsuallyDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }


    /**
     * 设置「截止时间」值
     * @param val
     */
    WorkItemUsuallyDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    WorkItemUsuallyDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「工作项状态类型」值
     * 字典[工作项状态类型]
     * @param val
     */
    WorkItemUsuallyDTO setStateType(String stateType) {
        this.stateType = stateType
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkItemUsuallyDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    WorkItemUsuallyDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkItemUsuallyDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「是否超时」值
     * @param val
     */
    WorkItemUsuallyDTO setIsOvertime(Integer isOvertime) {
        this.isOvertime = isOvertime
        return this
    }


    /**
     * 设置「多人任务」值
     * 字典[是否]
     * @param val
     */
    WorkItemUsuallyDTO setMultiplePeople(Integer multiplePeople) {
        this.multiplePeople = multiplePeople
        return this
    }


    /**
     * 设置「逾期天数」值
     * @param val
     */
    WorkItemUsuallyDTO setOverdueTime(String overdueTime) {
        this.overdueTime = overdueTime
        return this
    }


    /**
     * 设置「完成人」值
     * @param val
     */
    WorkItemUsuallyDTO setFinisher(String finisher) {
        this.finisher = finisher
        return this
    }


    /**
     * 设置「实际结束时间」值
     * @param val
     */
    WorkItemUsuallyDTO setActualEndAt(Timestamp actualEndAt) {
        this.actualEndAt = actualEndAt
        return this
    }


    /**
     * 设置「实际开始时间」值
     * @param val
     */
    WorkItemUsuallyDTO setActualStartAt(Timestamp actualStartAt) {
        this.actualStartAt = actualStartAt
        return this
    }

}
