package cn.ibizlab.plm.testmgmt.testplan.dto

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
class TestPlanBiSearchGroupDTO extends GroovyDTO<TestPlanBiSearchGroupDTO> {

    /**
     * 「类别」
     */
    @JsonProperty("categories_name")
    String categoriesName
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
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
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
     * 「计划名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「类别」
     * 字典[类别]
     */
    @JsonProperty("categories")
    String categories
    /**
     * 「测试库名称」
     */
    @JsonProperty("library_identifier")
    String libraryIdentifier
    /**
     * 「项目类型」
     * 字典[项目类型]
     */
    @JsonProperty("project_type")
    String projectType
    /**
     * 「关联项目」
     */
    @JsonProperty("project_name")
    String projectName
    /**
     * 「关联迭代」
     */
    @JsonProperty("sprint_name")
    String sprintName
    /**
     * 「名称」
     */
    @JsonProperty("release_name")
    String releaseName
    /**
     * 「所属测试库」
     */
    @JsonProperty("library_name")
    String libraryName
    /**
     * 「关联项目」
     */
    @JsonProperty("project_id")
    String projectId
    /**
     * 「测试库标识」
     */
    @JsonProperty("library_id")
    String libraryId
    /**
     * 「项目发布标识」
     */
    @JsonProperty("release_id")
    String releaseId
    /**
     * 「关联迭代」
     */
    @JsonProperty("sprint_id")
    String sprintId
    /**
     * 「测试分类」
     * 字典[测试分类]
     */
    @JsonProperty("type")
    String type
    /**
     * 「状态」
     * 字典[测试计划状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「测试库是否删除」
     * 字典[是否]
     */
    @JsonProperty("library_is_deleted")
    Integer libraryIsDeleted

    /**
     * 设置「类别」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「计划开始」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「计划结束」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    TestPlanBiSearchGroupDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    TestPlanBiSearchGroupDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「负责人标识」值
     * 字典[云系统操作者]
     * @param val
     */
    TestPlanBiSearchGroupDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「计划名称」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「类别」值
     * 字典[类别]
     * @param val
     */
    TestPlanBiSearchGroupDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「测试库名称」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setLibraryIdentifier(String libraryIdentifier) {
        this.libraryIdentifier = libraryIdentifier
        return this
    }


    /**
     * 设置「项目类型」值
     * 字典[项目类型]
     * @param val
     */
    TestPlanBiSearchGroupDTO setProjectType(String projectType) {
        this.projectType = projectType
        return this
    }


    /**
     * 设置「关联项目」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setProjectName(String projectName) {
        this.projectName = projectName
        return this
    }


    /**
     * 设置「关联迭代」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setSprintName(String sprintName) {
        this.sprintName = sprintName
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setReleaseName(String releaseName) {
        this.releaseName = releaseName
        return this
    }


    /**
     * 设置「所属测试库」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setLibraryName(String libraryName) {
        this.libraryName = libraryName
        return this
    }


    /**
     * 设置「关联项目」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「测试库标识」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setLibraryId(String libraryId) {
        this.libraryId = libraryId
        return this
    }


    /**
     * 设置「项目发布标识」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setReleaseId(String releaseId) {
        this.releaseId = releaseId
        return this
    }


    /**
     * 设置「关联迭代」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setSprintId(String sprintId) {
        this.sprintId = sprintId
        return this
    }


    /**
     * 设置「测试分类」值
     * 字典[测试分类]
     * @param val
     */
    TestPlanBiSearchGroupDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「状态」值
     * 字典[测试计划状态]
     * @param val
     */
    TestPlanBiSearchGroupDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    TestPlanBiSearchGroupDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「测试库是否删除」值
     * 字典[是否]
     * @param val
     */
    TestPlanBiSearchGroupDTO setLibraryIsDeleted(Integer libraryIsDeleted) {
        this.libraryIsDeleted = libraryIsDeleted
        return this
    }

}
