package cn.ibizlab.plm.projmgmt.sprint.dto

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
class SprintBiSearchGroupDTO extends GroovyDTO<SprintBiSearchGroupDTO> {

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
     * 「结束时间」
     */
    @JsonProperty("end_at")
    Timestamp endAt
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「负责人标识」
     * 字典[云系统操作者]
     */
    @JsonProperty("assignee_id")
    String assigneeId
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「已完成工作项数」
     */
    @JsonProperty("completed_work_items")
    BigDecimal completedWorkItems
    /**
     * 「迭代已过天数」
     */
    @JsonProperty("past_days")
    BigDecimal pastDays
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
     * 「类别」
     * 字典[类别]
     */
    @JsonProperty("categories")
    String categories
    /**
     * 「项目名称」
     */
    @JsonProperty("project_name")
    String projectName
    /**
     * 「项目标识」
     */
    @JsonProperty("project_id")
    String projectId
    /**
     * 「状态」
     * 字典[迭代状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「项目是否删除」
     * 字典[是否]
     */
    @JsonProperty("project_is_deleted")
    Integer projectIsDeleted

    /**
     * 设置「建立时间」值
     * @param val
     */
    SprintBiSearchGroupDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    SprintBiSearchGroupDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    SprintBiSearchGroupDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「结束时间」值
     * @param val
     */
    SprintBiSearchGroupDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    SprintBiSearchGroupDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「负责人标识」值
     * 字典[云系统操作者]
     * @param val
     */
    SprintBiSearchGroupDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    SprintBiSearchGroupDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    SprintBiSearchGroupDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    SprintBiSearchGroupDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「已完成工作项数」值
     * @param val
     */
    SprintBiSearchGroupDTO setCompletedWorkItems(BigDecimal completedWorkItems) {
        this.completedWorkItems = completedWorkItems
        return this
    }


    /**
     * 设置「迭代已过天数」值
     * @param val
     */
    SprintBiSearchGroupDTO setPastDays(BigDecimal pastDays) {
        this.pastDays = pastDays
        return this
    }


    /**
     * 设置「全部工作项数」值
     * @param val
     */
    SprintBiSearchGroupDTO setAllWorkItems(BigDecimal allWorkItems) {
        this.allWorkItems = allWorkItems
        return this
    }


    /**
     * 设置「进度」值
     * @param val
     */
    SprintBiSearchGroupDTO setSchedule(BigDecimal schedule) {
        this.schedule = schedule
        return this
    }


    /**
     * 设置「类别」值
     * 字典[类别]
     * @param val
     */
    SprintBiSearchGroupDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「项目名称」值
     * @param val
     */
    SprintBiSearchGroupDTO setProjectName(String projectName) {
        this.projectName = projectName
        return this
    }


    /**
     * 设置「项目标识」值
     * @param val
     */
    SprintBiSearchGroupDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「状态」值
     * 字典[迭代状态]
     * @param val
     */
    SprintBiSearchGroupDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    SprintBiSearchGroupDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「项目是否删除」值
     * 字典[是否]
     * @param val
     */
    SprintBiSearchGroupDTO setProjectIsDeleted(Integer projectIsDeleted) {
        this.projectIsDeleted = projectIsDeleted
        return this
    }

}
