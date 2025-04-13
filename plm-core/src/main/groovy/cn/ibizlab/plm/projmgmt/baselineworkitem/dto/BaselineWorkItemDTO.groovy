package cn.ibizlab.plm.projmgmt.baselineworkitem.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.version.dto.VersionDTO
import cn.ibizlab.plm.base.baseline.dto.BaselineDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class BaselineWorkItemDTO extends GroovyDTO<BaselineWorkItemDTO> {

    /**
     * 「关联主体标识」
     */
    @JsonProperty("principal_id")
    String principalId
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「关联主体类型」
     */
    @JsonProperty("principal_type")
    String principalType
    /**
     * 「关联目标类型」
     */
    @JsonProperty("target_type")
    String targetType
    /**
     * 「关联目标标识」
     */
    @JsonProperty("target_id")
    String targetId
    /**
     * 「目标对象版本标识」
     */
    @JsonProperty("target_version_id")
    String targetVersionId
    /**
     * 「项目」
     */
    @JsonProperty("project_id")
    String projectId
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「父工作项」
     */
    @JsonProperty("ptitle")
    String ptitle
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「状态」
     * 字典[工作项状态]
     */
    @JsonProperty("state")
    String state
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
     * 「当前版本标识」
     */
    @JsonProperty("cur_version_id")
    String curVersionId
    /**
     * 「优先级」
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「关联目标版本」
     */
    @JsonProperty("target_version")
    VersionDTO targetVersion
    /**
     * 「预估工时」
     */
    @JsonProperty("estimated_workload")
    BigDecimal estimatedWorkload
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
     * 「迭代名称」
     */
    @JsonProperty("sprint_name")
    String sprintName
    /**
     * 「迭代标识」
     */
    @JsonProperty("sprint_id")
    String sprintId
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
     * 「父标识」
     */
    @JsonProperty("pid")
    String pid
    /**
     * 「是否已删除」
     */
    @JsonProperty("is_deleted")
    String isDeleted
    /**
     * 「是否已归档」
     */
    @JsonProperty("is_archived")
    String isArchived
    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「完成时间」
     */
    @JsonProperty("completed_at")
    Timestamp completedAt
    /**
     * 「风险」
     * 字典[风险]
     */
    @JsonProperty("risk")
    String risk
    /**
     * 「需求来源」
     * 字典[需求来源]
     */
    @JsonProperty("backlog_from")
    String backlogFrom
    /**
     * 「需求类型」
     */
    @JsonProperty("backlog_type")
    String backlogType
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「基线」
     */
    @JsonProperty("baseline")
    BaselineDTO baseline
    /**
     * 「开始时间」
     */
    @JsonProperty("start_at")
    Timestamp startAt
    /**
     * 「结束时间」
     */
    @JsonProperty("end_at")
    Timestamp endAt
    /**
     * 「是否叶子节点」
     * 字典[是否]
     */
    @JsonProperty("is_leaf")
    Integer isLeaf
    /**
     * 「工作项类型」
     */
    @JsonProperty("work_item_type_id")
    String workItemTypeId
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
     * 设置「关联主体标识」值
     * @param val
     */
    BaselineWorkItemDTO setPrincipalId(String principalId) {
        this.principalId = principalId
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    BaselineWorkItemDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「关联主体类型」值
     * @param val
     */
    BaselineWorkItemDTO setPrincipalType(String principalType) {
        this.principalType = principalType
        return this
    }


    /**
     * 设置「关联目标类型」值
     * @param val
     */
    BaselineWorkItemDTO setTargetType(String targetType) {
        this.targetType = targetType
        return this
    }


    /**
     * 设置「关联目标标识」值
     * @param val
     */
    BaselineWorkItemDTO setTargetId(String targetId) {
        this.targetId = targetId
        return this
    }


    /**
     * 设置「目标对象版本标识」值
     * @param val
     */
    BaselineWorkItemDTO setTargetVersionId(String targetVersionId) {
        this.targetVersionId = targetVersionId
        return this
    }


    /**
     * 设置「项目」值
     * @param val
     */
    BaselineWorkItemDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    BaselineWorkItemDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「父工作项」值
     * @param val
     */
    BaselineWorkItemDTO setPtitle(String ptitle) {
        this.ptitle = ptitle
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    BaselineWorkItemDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「状态」值
     * 字典[工作项状态]
     * @param val
     */
    BaselineWorkItemDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    BaselineWorkItemDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    BaselineWorkItemDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    BaselineWorkItemDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }


    /**
     * 设置「优先级」值
     * @param val
     */
    BaselineWorkItemDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「关联目标版本」值
     * @param val
     */
    BaselineWorkItemDTO setTargetVersion(VersionDTO targetVersion) {
        this.targetVersion = targetVersion
        return this
    }


    /**
     * 设置「预估工时」值
     * @param val
     */
    BaselineWorkItemDTO setEstimatedWorkload(BigDecimal estimatedWorkload) {
        this.estimatedWorkload = estimatedWorkload
        return this
    }


    /**
     * 设置「剩余工时」值
     * @param val
     */
    BaselineWorkItemDTO setRemainingWorkload(BigDecimal remainingWorkload) {
        this.remainingWorkload = remainingWorkload
        return this
    }


    /**
     * 设置「实际工时」值
     * @param val
     */
    BaselineWorkItemDTO setActualWorkload(BigDecimal actualWorkload) {
        this.actualWorkload = actualWorkload
        return this
    }


    /**
     * 设置「项目发布标识」值
     * @param val
     */
    BaselineWorkItemDTO setReleaseId(String releaseId) {
        this.releaseId = releaseId
        return this
    }


    /**
     * 设置「项目发布名称」值
     * @param val
     */
    BaselineWorkItemDTO setReleaseName(String releaseName) {
        this.releaseName = releaseName
        return this
    }


    /**
     * 设置「迭代名称」值
     * @param val
     */
    BaselineWorkItemDTO setSprintName(String sprintName) {
        this.sprintName = sprintName
        return this
    }


    /**
     * 设置「迭代标识」值
     * @param val
     */
    BaselineWorkItemDTO setSprintId(String sprintId) {
        this.sprintId = sprintId
        return this
    }


    /**
     * 设置「看板名称」值
     * @param val
     */
    BaselineWorkItemDTO setBoardName(String boardName) {
        this.boardName = boardName
        return this
    }


    /**
     * 设置「看板标识」值
     * @param val
     */
    BaselineWorkItemDTO setBoardId(String boardId) {
        this.boardId = boardId
        return this
    }


    /**
     * 设置「看板栏名称」值
     * @param val
     */
    BaselineWorkItemDTO setEntryName(String entryName) {
        this.entryName = entryName
        return this
    }


    /**
     * 设置「看板栏标识」值
     * @param val
     */
    BaselineWorkItemDTO setEntryId(String entryId) {
        this.entryId = entryId
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    BaselineWorkItemDTO setPid(String pid) {
        this.pid = pid
        return this
    }


    /**
     * 设置「是否已删除」值
     * @param val
     */
    BaselineWorkItemDTO setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「是否已归档」值
     * @param val
     */
    BaselineWorkItemDTO setIsArchived(String isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    BaselineWorkItemDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「完成时间」值
     * @param val
     */
    BaselineWorkItemDTO setCompletedAt(Timestamp completedAt) {
        this.completedAt = completedAt
        return this
    }


    /**
     * 设置「风险」值
     * 字典[风险]
     * @param val
     */
    BaselineWorkItemDTO setRisk(String risk) {
        this.risk = risk
        return this
    }


    /**
     * 设置「需求来源」值
     * 字典[需求来源]
     * @param val
     */
    BaselineWorkItemDTO setBacklogFrom(String backlogFrom) {
        this.backlogFrom = backlogFrom
        return this
    }


    /**
     * 设置「需求类型」值
     * @param val
     */
    BaselineWorkItemDTO setBacklogType(String backlogType) {
        this.backlogType = backlogType
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    BaselineWorkItemDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「基线」值
     * @param val
     */
    BaselineWorkItemDTO setBaseline(BaselineDTO baseline) {
        this.baseline = baseline
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    BaselineWorkItemDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「结束时间」值
     * @param val
     */
    BaselineWorkItemDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「是否叶子节点」值
     * 字典[是否]
     * @param val
     */
    BaselineWorkItemDTO setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf
        return this
    }


    /**
     * 设置「工作项类型」值
     * @param val
     */
    BaselineWorkItemDTO setWorkItemTypeId(String workItemTypeId) {
        this.workItemTypeId = workItemTypeId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    BaselineWorkItemDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    BaselineWorkItemDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    BaselineWorkItemDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    BaselineWorkItemDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    BaselineWorkItemDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    BaselineWorkItemDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
