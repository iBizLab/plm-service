package cn.ibizlab.plm.projmgmt.release.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.projmgmt.stage.dto.StageDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ReleaseDTO extends GroovyDTO<ReleaseDTO> {

    /**
     * 「开始时间」
     */
    @JsonProperty("start_at")
    Timestamp startAt
    /**
     * 「发布时间」
     */
    @JsonProperty("end_at")
    Timestamp endAt
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「阶段」
     * 字典[项目下的发布阶段]
     */
    @JsonProperty("status")
    String status
    /**
     * 「类别」
     * 字典[类别]
     */
    @JsonProperty("categories")
    String categories
    /**
     * 「类别」
     */
    @JsonProperty("categories_name")
    String categoriesName
    /**
     * 「发布阶段」
     */
    @JsonProperty("stage_transitions")
    List<StageDTO> stageTransitions
    /**
     * 「进度」
     */
    @JsonProperty("schedule")
    BigDecimal schedule
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
     * 「项目是否删除」
     * 字典[是否]
     */
    @JsonProperty("project_is_deleted")
    Integer projectIsDeleted
    /**
     * 「项目类型」
     * 字典[项目类型]
     */
    @JsonProperty("project_type")
    String projectType
    /**
     * 「发布年份」
     */
    @JsonProperty("end_year")
    String endYear
    /**
     * 「发布日志」
     */
    @JsonProperty("changelog")
    String changelog
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
     * 「项目标识」
     */
    @JsonProperty("project_id")
    String projectId
    /**
     * 「项目名称」
     */
    @JsonProperty("project_name")
    String projectName
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
     * 设置「开始时间」值
     * @param val
     */
    ReleaseDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「发布时间」值
     * @param val
     */
    ReleaseDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ReleaseDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「阶段」值
     * 字典[项目下的发布阶段]
     * @param val
     */
    ReleaseDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「类别」值
     * 字典[类别]
     * @param val
     */
    ReleaseDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    ReleaseDTO setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName
        return this
    }


    /**
     * 设置「发布阶段」值
     * @param val
     */
    ReleaseDTO setStageTransitions(List<StageDTO> stageTransitions) {
        this.stageTransitions = stageTransitions
        return this
    }


    /**
     * 设置「进度」值
     * @param val
     */
    ReleaseDTO setSchedule(BigDecimal schedule) {
        this.schedule = schedule
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    ReleaseDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「负责人标识」值
     * 字典[云系统操作者]
     * @param val
     */
    ReleaseDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「已完成工作项数」值
     * @param val
     */
    ReleaseDTO setCompletedWorkItems(BigDecimal completedWorkItems) {
        this.completedWorkItems = completedWorkItems
        return this
    }


    /**
     * 设置「全部工作项数」值
     * @param val
     */
    ReleaseDTO setAllWorkItems(BigDecimal allWorkItems) {
        this.allWorkItems = allWorkItems
        return this
    }


    /**
     * 设置「项目是否删除」值
     * 字典[是否]
     * @param val
     */
    ReleaseDTO setProjectIsDeleted(Integer projectIsDeleted) {
        this.projectIsDeleted = projectIsDeleted
        return this
    }


    /**
     * 设置「项目类型」值
     * 字典[项目类型]
     * @param val
     */
    ReleaseDTO setProjectType(String projectType) {
        this.projectType = projectType
        return this
    }


    /**
     * 设置「发布年份」值
     * @param val
     */
    ReleaseDTO setEndYear(String endYear) {
        this.endYear = endYear
        return this
    }


    /**
     * 设置「发布日志」值
     * @param val
     */
    ReleaseDTO setChangelog(String changelog) {
        this.changelog = changelog
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReleaseDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ReleaseDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ReleaseDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ReleaseDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「项目标识」值
     * @param val
     */
    ReleaseDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「项目名称」值
     * @param val
     */
    ReleaseDTO setProjectName(String projectName) {
        this.projectName = projectName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReleaseDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ReleaseDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
