package cn.ibizlab.plm.projmgmt.project.dto

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
class ProjectBiSearchGroupDTO extends GroovyDTO<ProjectBiSearchGroupDTO> {

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
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
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
     * 「所属对象」
     */
    @JsonProperty("scope_id")
    String scopeId
    /**
     * 「项目名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「项目标识」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
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
     * 「可见范围」
     * 字典[可见范围]
     */
    @JsonProperty("visibility")
    String visibility
    /**
     * 「所属」
     * 字典[所属类型（通用）]
     */
    @JsonProperty("scope_type")
    String scopeType
    /**
     * 「类型」
     * 字典[项目类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「项目状态」
     * 字典[项目状态（动态）]
     */
    @JsonProperty("state")
    String state
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id

    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    ProjectBiSearchGroupDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    ProjectBiSearchGroupDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ProjectBiSearchGroupDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ProjectBiSearchGroupDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    ProjectBiSearchGroupDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「结束时间」值
     * @param val
     */
    ProjectBiSearchGroupDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    ProjectBiSearchGroupDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「负责人标识」值
     * 字典[云系统操作者]
     * @param val
     */
    ProjectBiSearchGroupDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「所属对象」值
     * @param val
     */
    ProjectBiSearchGroupDTO setScopeId(String scopeId) {
        this.scopeId = scopeId
        return this
    }


    /**
     * 设置「项目名称」值
     * @param val
     */
    ProjectBiSearchGroupDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProjectBiSearchGroupDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「项目标识」值
     * @param val
     */
    ProjectBiSearchGroupDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProjectBiSearchGroupDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「已完成工作项数」值
     * @param val
     */
    ProjectBiSearchGroupDTO setCompletedWorkItems(BigDecimal completedWorkItems) {
        this.completedWorkItems = completedWorkItems
        return this
    }


    /**
     * 设置「全部工作项数」值
     * @param val
     */
    ProjectBiSearchGroupDTO setAllWorkItems(BigDecimal allWorkItems) {
        this.allWorkItems = allWorkItems
        return this
    }


    /**
     * 设置「进度」值
     * @param val
     */
    ProjectBiSearchGroupDTO setSchedule(BigDecimal schedule) {
        this.schedule = schedule
        return this
    }


    /**
     * 设置「可见范围」值
     * 字典[可见范围]
     * @param val
     */
    ProjectBiSearchGroupDTO setVisibility(String visibility) {
        this.visibility = visibility
        return this
    }


    /**
     * 设置「所属」值
     * 字典[所属类型（通用）]
     * @param val
     */
    ProjectBiSearchGroupDTO setScopeType(String scopeType) {
        this.scopeType = scopeType
        return this
    }


    /**
     * 设置「类型」值
     * 字典[项目类型]
     * @param val
     */
    ProjectBiSearchGroupDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「项目状态」值
     * 字典[项目状态（动态）]
     * @param val
     */
    ProjectBiSearchGroupDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ProjectBiSearchGroupDTO setId(String id) {
        this.id = id
        return this
    }

}
