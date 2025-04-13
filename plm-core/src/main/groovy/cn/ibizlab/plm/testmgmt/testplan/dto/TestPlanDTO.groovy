package cn.ibizlab.plm.testmgmt.testplan.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.relation.dto.RelationDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class TestPlanDTO extends GroovyDTO<TestPlanDTO> {

    /**
     * 「状态」
     * 字典[测试计划状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「测试分类」
     * 字典[测试分类]
     */
    @JsonProperty("type")
    String type
    /**
     * 「计划开始」
     */
    @JsonProperty("start_at")
    Timestamp startAt
    /**
     * 「计划结束」
     */
    @JsonProperty("end_at")
    Timestamp endAt
    /**
     * 「测试报告概要」
     */
    @JsonProperty("summary")
    String summary
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
     * 「关联缺陷」
     */
    @JsonProperty("work_item_relations")
    List<RelationDTO> workItemRelations
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
     * 「项目类型」
     * 字典[项目类型]
     */
    @JsonProperty("project_type")
    String projectType
    /**
     * 「测试库名称」
     */
    @JsonProperty("library_identifier")
    String libraryIdentifier
    /**
     * 「测试库是否删除」
     * 字典[是否]
     */
    @JsonProperty("library_is_deleted")
    Integer libraryIsDeleted
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
     * 「测试库标识」
     */
    @JsonProperty("library_id")
    String libraryId
    /**
     * 「所属测试库」
     */
    @JsonProperty("library_name")
    String libraryName
    /**
     * 「计划名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「关联项目」
     */
    @JsonProperty("project_id")
    String projectId
    /**
     * 「关联项目」
     */
    @JsonProperty("project_name")
    String projectName
    /**
     * 「项目发布标识」
     */
    @JsonProperty("release_id")
    String releaseId
    /**
     * 「名称」
     */
    @JsonProperty("release_name")
    String releaseName
    /**
     * 「关联迭代」
     */
    @JsonProperty("sprint_id")
    String sprintId
    /**
     * 「关联迭代」
     */
    @JsonProperty("sprint_name")
    String sprintName
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
     * 设置「状态」值
     * 字典[测试计划状态]
     * @param val
     */
    TestPlanDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「测试分类」值
     * 字典[测试分类]
     * @param val
     */
    TestPlanDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「计划开始」值
     * @param val
     */
    TestPlanDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「计划结束」值
     * @param val
     */
    TestPlanDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「测试报告概要」值
     * @param val
     */
    TestPlanDTO setSummary(String summary) {
        this.summary = summary
        return this
    }


    /**
     * 设置「类别」值
     * 字典[类别]
     * @param val
     */
    TestPlanDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    TestPlanDTO setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName
        return this
    }


    /**
     * 设置「关联缺陷」值
     * @param val
     */
    TestPlanDTO setWorkItemRelations(List<RelationDTO> workItemRelations) {
        this.workItemRelations = workItemRelations
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    TestPlanDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「负责人标识」值
     * 字典[云系统操作者]
     * @param val
     */
    TestPlanDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「项目类型」值
     * 字典[项目类型]
     * @param val
     */
    TestPlanDTO setProjectType(String projectType) {
        this.projectType = projectType
        return this
    }


    /**
     * 设置「测试库名称」值
     * @param val
     */
    TestPlanDTO setLibraryIdentifier(String libraryIdentifier) {
        this.libraryIdentifier = libraryIdentifier
        return this
    }


    /**
     * 设置「测试库是否删除」值
     * 字典[是否]
     * @param val
     */
    TestPlanDTO setLibraryIsDeleted(Integer libraryIsDeleted) {
        this.libraryIsDeleted = libraryIsDeleted
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    TestPlanDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    TestPlanDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    TestPlanDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「测试库标识」值
     * @param val
     */
    TestPlanDTO setLibraryId(String libraryId) {
        this.libraryId = libraryId
        return this
    }


    /**
     * 设置「所属测试库」值
     * @param val
     */
    TestPlanDTO setLibraryName(String libraryName) {
        this.libraryName = libraryName
        return this
    }


    /**
     * 设置「计划名称」值
     * @param val
     */
    TestPlanDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「关联项目」值
     * @param val
     */
    TestPlanDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「关联项目」值
     * @param val
     */
    TestPlanDTO setProjectName(String projectName) {
        this.projectName = projectName
        return this
    }


    /**
     * 设置「项目发布标识」值
     * @param val
     */
    TestPlanDTO setReleaseId(String releaseId) {
        this.releaseId = releaseId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    TestPlanDTO setReleaseName(String releaseName) {
        this.releaseName = releaseName
        return this
    }


    /**
     * 设置「关联迭代」值
     * @param val
     */
    TestPlanDTO setSprintId(String sprintId) {
        this.sprintId = sprintId
        return this
    }


    /**
     * 设置「关联迭代」值
     * @param val
     */
    TestPlanDTO setSprintName(String sprintName) {
        this.sprintName = sprintName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    TestPlanDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    TestPlanDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
