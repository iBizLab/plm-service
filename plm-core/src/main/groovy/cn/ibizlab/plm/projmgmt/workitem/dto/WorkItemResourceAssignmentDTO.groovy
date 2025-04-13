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
class WorkItemResourceAssignmentDTO extends GroovyDTO<WorkItemResourceAssignmentDTO> {

    /**
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「项目标识」
     */
    @JsonProperty("project_identifier")
    String projectIdentifier
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
     * 「项目」
     */
    @JsonProperty("project_id")
    String projectId
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
     * 「状态」
     * 字典[工作项状态（动态）]
     */
    @JsonProperty("state")
    String state
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
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
     * 「负责人」
     */
    @JsonProperty("assignee_id")
    String assigneeId
    /**
     * 「剩余工时」
     */
    @JsonProperty("remaining_workload")
    BigDecimal remainingWorkload
    /**
     * 「预估工时」
     */
    @JsonProperty("estimated_workload")
    BigDecimal estimatedWorkload

    /**
     * 设置「负责人」值
     * @param val
     */
    WorkItemResourceAssignmentDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    WorkItemResourceAssignmentDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「项目标识」值
     * @param val
     */
    WorkItemResourceAssignmentDTO setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier
        return this
    }


    /**
     * 设置「项目类型」值
     * 字典[项目类型]
     * @param val
     */
    WorkItemResourceAssignmentDTO setProjectType(String projectType) {
        this.projectType = projectType
        return this
    }


    /**
     * 设置「所属项目」值
     * @param val
     */
    WorkItemResourceAssignmentDTO setProjectName(String projectName) {
        this.projectName = projectName
        return this
    }


    /**
     * 设置「项目」值
     * @param val
     */
    WorkItemResourceAssignmentDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「工作项类型」值
     * 字典[工作项类型]
     * @param val
     */
    WorkItemResourceAssignmentDTO setWorkItemTypeId(String workItemTypeId) {
        this.workItemTypeId = workItemTypeId
        return this
    }


    /**
     * 设置「工作项类型」值
     * @param val
     */
    WorkItemResourceAssignmentDTO setWorkItemTypeName(String workItemTypeName) {
        this.workItemTypeName = workItemTypeName
        return this
    }


    /**
     * 设置「截止时间」值
     * @param val
     */
    WorkItemResourceAssignmentDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    WorkItemResourceAssignmentDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「状态」值
     * 字典[工作项状态（动态）]
     * @param val
     */
    WorkItemResourceAssignmentDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    WorkItemResourceAssignmentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    WorkItemResourceAssignmentDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    WorkItemResourceAssignmentDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    WorkItemResourceAssignmentDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「剩余工时」值
     * @param val
     */
    WorkItemResourceAssignmentDTO setRemainingWorkload(BigDecimal remainingWorkload) {
        this.remainingWorkload = remainingWorkload
        return this
    }


    /**
     * 设置「预估工时」值
     * @param val
     */
    WorkItemResourceAssignmentDTO setEstimatedWorkload(BigDecimal estimatedWorkload) {
        this.estimatedWorkload = estimatedWorkload
        return this
    }

}
