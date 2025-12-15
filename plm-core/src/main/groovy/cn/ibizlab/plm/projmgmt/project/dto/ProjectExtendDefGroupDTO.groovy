package cn.ibizlab.plm.projmgmt.project.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.projmgmt.projectmember.dto.ProjectMemberDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ProjectExtendDefGroupDTO extends GroovyDTO<ProjectExtendDefGroupDTO> {

    /**
     * 「可见范围」
     * 字典[可见范围]
     */
    @JsonProperty("visibility")
    String visibility
    /**
     * 「项目状态」
     * 字典[项目状态（动态）]
     */
    @JsonProperty("state")
    String state
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
     * 「主题色」
     */
    @JsonProperty("color")
    String color
    /**
     * 「类型」
     * 字典[项目类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「项目标识」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「是否已归档」
     * 字典[是否]
     */
    @JsonProperty("is_archived")
    Integer isArchived
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「是否已删除」
     * 字典[是否]
     */
    @JsonProperty("is_deleted")
    Integer isDeleted
    /**
     * 「是否星标」
     * 字典[是否]
     */
    @JsonProperty("is_favorite")
    String isFavorite
    /**
     * 「所属」
     * 字典[所属类型（通用）]
     */
    @JsonProperty("scope_type")
    String scopeType
    /**
     * 「所属对象」
     */
    @JsonProperty("scope_id")
    String scopeId
    /**
     * 「是否本地配置」
     * 字典[是否]
     */
    @JsonProperty("is_local_configure")
    Integer isLocalConfigure
    /**
     * 「成员」
     */
    @JsonProperty("members")
    List<ProjectMemberDTO> members
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「负责人标识」
     * 字典[云系统操作者]
     */
    @JsonProperty("assignee_id")
    String assigneeId
    /**
     * 「已完成工作项数」
     */
    @JsonProperty("completed_work_items")
    BigDecimal completedWorkItems
    /**
     * 「全部工作项数」
     */
    @JsonProperty("all_work_items")
    BigDecimal allWorkItems
    /**
     * 「进度」
     */
    @JsonProperty("schedule")
    BigDecimal schedule
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
     * 「预计工时」
     */
    @JsonProperty("expected_time")
    String expectedTime
    /**
     * 「消耗工时」
     */
    @JsonProperty("consume_time")
    String consumeTime
    /**
     * 「状态类型」
     * 字典[项目状态类型]
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
     * 「项目名称」
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
     * 设置「可见范围」值
     * 字典[可见范围]
     * @param val
     */
    ProjectExtendDefGroupDTO setVisibility(String visibility) {
        this.visibility = visibility
        return this
    }


    /**
     * 设置「项目状态」值
     * 字典[项目状态（动态）]
     * @param val
     */
    ProjectExtendDefGroupDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    ProjectExtendDefGroupDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「结束时间」值
     * @param val
     */
    ProjectExtendDefGroupDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「主题色」值
     * @param val
     */
    ProjectExtendDefGroupDTO setColor(String color) {
        this.color = color
        return this
    }


    /**
     * 设置「类型」值
     * 字典[项目类型]
     * @param val
     */
    ProjectExtendDefGroupDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「项目标识」值
     * @param val
     */
    ProjectExtendDefGroupDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    ProjectExtendDefGroupDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ProjectExtendDefGroupDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    ProjectExtendDefGroupDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「是否星标」值
     * 字典[是否]
     * @param val
     */
    ProjectExtendDefGroupDTO setIsFavorite(String isFavorite) {
        this.isFavorite = isFavorite
        return this
    }


    /**
     * 设置「所属」值
     * 字典[所属类型（通用）]
     * @param val
     */
    ProjectExtendDefGroupDTO setScopeType(String scopeType) {
        this.scopeType = scopeType
        return this
    }


    /**
     * 设置「所属对象」值
     * @param val
     */
    ProjectExtendDefGroupDTO setScopeId(String scopeId) {
        this.scopeId = scopeId
        return this
    }


    /**
     * 设置「是否本地配置」值
     * 字典[是否]
     * @param val
     */
    ProjectExtendDefGroupDTO setIsLocalConfigure(Integer isLocalConfigure) {
        this.isLocalConfigure = isLocalConfigure
        return this
    }


    /**
     * 设置「成员」值
     * @param val
     */
    ProjectExtendDefGroupDTO setMembers(List<ProjectMemberDTO> members) {
        this.members = members
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    ProjectExtendDefGroupDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「负责人标识」值
     * 字典[云系统操作者]
     * @param val
     */
    ProjectExtendDefGroupDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「已完成工作项数」值
     * @param val
     */
    ProjectExtendDefGroupDTO setCompletedWorkItems(BigDecimal completedWorkItems) {
        this.completedWorkItems = completedWorkItems
        return this
    }


    /**
     * 设置「全部工作项数」值
     * @param val
     */
    ProjectExtendDefGroupDTO setAllWorkItems(BigDecimal allWorkItems) {
        this.allWorkItems = allWorkItems
        return this
    }


    /**
     * 设置「进度」值
     * @param val
     */
    ProjectExtendDefGroupDTO setSchedule(BigDecimal schedule) {
        this.schedule = schedule
        return this
    }


    /**
     * 设置「实际开始时间」值
     * @param val
     */
    ProjectExtendDefGroupDTO setActualStartAt(Timestamp actualStartAt) {
        this.actualStartAt = actualStartAt
        return this
    }


    /**
     * 设置「实际结束时间」值
     * @param val
     */
    ProjectExtendDefGroupDTO setActualEndAt(Timestamp actualEndAt) {
        this.actualEndAt = actualEndAt
        return this
    }


    /**
     * 设置「预计工时」值
     * @param val
     */
    ProjectExtendDefGroupDTO setExpectedTime(String expectedTime) {
        this.expectedTime = expectedTime
        return this
    }


    /**
     * 设置「消耗工时」值
     * @param val
     */
    ProjectExtendDefGroupDTO setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime
        return this
    }


    /**
     * 设置「状态类型」值
     * 字典[项目状态类型]
     * @param val
     */
    ProjectExtendDefGroupDTO setStateType(String stateType) {
        this.stateType = stateType
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProjectExtendDefGroupDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ProjectExtendDefGroupDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ProjectExtendDefGroupDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「项目名称」值
     * @param val
     */
    ProjectExtendDefGroupDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProjectExtendDefGroupDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ProjectExtendDefGroupDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
