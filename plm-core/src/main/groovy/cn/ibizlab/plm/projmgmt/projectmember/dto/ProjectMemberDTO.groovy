package cn.ibizlab.plm.projmgmt.projectmember.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.projmgmt.daycapacity.dto.DayCapacityDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ProjectMemberDTO extends GroovyDTO<ProjectMemberDTO> {

    /**
     * 「登录名」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「角色」
     * 字典[角色类型]
     */
    @JsonProperty("role_id")
    String roleId
    /**
     * 「项目名称」
     */
    @JsonProperty("project_name")
    String projectName
    /**
     * 「项目标识（编号）」
     */
    @JsonProperty("project_identifier")
    String projectIdentifier
    /**
     * 「周工作日」
     * 字典[星期（1～7）(数值)]
     */
    @JsonProperty("weekday")
    Integer weekday
    /**
     * 「日容量」
     */
    @JsonProperty("day_capacities")
    DayCapacityDTO dayCapacities
    /**
     * 「项目类型」
     * 字典[项目类型]
     */
    @JsonProperty("project_type")
    String projectType
    /**
     * 「职位」
     * 字典[职位（动态）]
     */
    @JsonProperty("title")
    String title
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
     * 「姓名」
     */
    @JsonProperty("name")
    String name
    /**
     * 「项目标识」
     */
    @JsonProperty("project_id")
    String projectId
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
     * 设置「登录名」值
     * @param val
     */
    ProjectMemberDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「角色」值
     * 字典[角色类型]
     * @param val
     */
    ProjectMemberDTO setRoleId(String roleId) {
        this.roleId = roleId
        return this
    }


    /**
     * 设置「项目名称」值
     * @param val
     */
    ProjectMemberDTO setProjectName(String projectName) {
        this.projectName = projectName
        return this
    }


    /**
     * 设置「项目标识（编号）」值
     * @param val
     */
    ProjectMemberDTO setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier
        return this
    }


    /**
     * 设置「周工作日」值
     * 字典[星期（1～7）(数值)]
     * @param val
     */
    ProjectMemberDTO setWeekday(Integer weekday) {
        this.weekday = weekday
        return this
    }


    /**
     * 设置「日容量」值
     * @param val
     */
    ProjectMemberDTO setDayCapacities(DayCapacityDTO dayCapacities) {
        this.dayCapacities = dayCapacities
        return this
    }


    /**
     * 设置「项目类型」值
     * 字典[项目类型]
     * @param val
     */
    ProjectMemberDTO setProjectType(String projectType) {
        this.projectType = projectType
        return this
    }


    /**
     * 设置「职位」值
     * 字典[职位（动态）]
     * @param val
     */
    ProjectMemberDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProjectMemberDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ProjectMemberDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ProjectMemberDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「姓名」值
     * @param val
     */
    ProjectMemberDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「项目标识」值
     * @param val
     */
    ProjectMemberDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProjectMemberDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ProjectMemberDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
