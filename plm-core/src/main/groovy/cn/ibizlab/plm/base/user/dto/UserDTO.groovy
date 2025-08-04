package cn.ibizlab.plm.base.user.dto

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
class UserDTO extends GroovyDTO<UserDTO> {

    /**
     * 「姓名」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「邮箱」
     */
    @JsonProperty("email")
    String email
    /**
     * 「手机号」
     */
    @JsonProperty("mobile")
    String mobile
    /**
     * 「密码」
     */
    @JsonProperty("password")
    String password
    /**
     * 「工号」
     */
    @JsonProperty("employee_number")
    String employeeNumber
    /**
     * 「头像」
     */
    @JsonProperty("avatar")
    String avatar
    /**
     * 「状态」
     */
    @JsonProperty("status")
    String status
    /**
     * 「统计」
     * 字典[启停状态]
     */
    @JsonProperty("report_flag")
    Integer reportFlag
    /**
     * 「用户ID」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「职位」
     * 字典[职位（动态）]
     */
    @JsonProperty("title")
    String title
    /**
     * 「第三方用户标识」
     */
    @JsonProperty("open_user_tag")
    String openUserTag
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
     * 「部门标识」
     */
    @JsonProperty("department_id")
    String departmentId
    /**
     * 「部门」
     */
    @JsonProperty("department_name")
    String departmentName
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「岗位标识」
     */
    @JsonProperty("job_id")
    String jobId
    /**
     * 「职位名称」
     */
    @JsonProperty("job_name")
    String jobName
    /**
     * 「登录名」
     */
    @JsonProperty("name")
    String name
    /**
     * 「组织标识」
     */
    @JsonProperty("organization_id")
    String organizationId
    /**
     * 「组织名称」
     */
    @JsonProperty("organization_name")
    String organizationName
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
     * 设置「姓名」值
     * @param val
     */
    UserDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「邮箱」值
     * @param val
     */
    UserDTO setEmail(String email) {
        this.email = email
        return this
    }


    /**
     * 设置「手机号」值
     * @param val
     */
    UserDTO setMobile(String mobile) {
        this.mobile = mobile
        return this
    }


    /**
     * 设置「密码」值
     * @param val
     */
    UserDTO setPassword(String password) {
        this.password = password
        return this
    }


    /**
     * 设置「工号」值
     * @param val
     */
    UserDTO setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber
        return this
    }


    /**
     * 设置「头像」值
     * @param val
     */
    UserDTO setAvatar(String avatar) {
        this.avatar = avatar
        return this
    }


    /**
     * 设置「状态」值
     * @param val
     */
    UserDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「统计」值
     * 字典[启停状态]
     * @param val
     */
    UserDTO setReportFlag(Integer reportFlag) {
        this.reportFlag = reportFlag
        return this
    }


    /**
     * 设置「用户ID」值
     * @param val
     */
    UserDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「职位」值
     * 字典[职位（动态）]
     * @param val
     */
    UserDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「第三方用户标识」值
     * @param val
     */
    UserDTO setOpenUserTag(String openUserTag) {
        this.openUserTag = openUserTag
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    UserDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    UserDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「部门标识」值
     * @param val
     */
    UserDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    UserDTO setDepartmentName(String departmentName) {
        this.departmentName = departmentName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    UserDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「岗位标识」值
     * @param val
     */
    UserDTO setJobId(String jobId) {
        this.jobId = jobId
        return this
    }


    /**
     * 设置「职位名称」值
     * @param val
     */
    UserDTO setJobName(String jobName) {
        this.jobName = jobName
        return this
    }


    /**
     * 设置「登录名」值
     * @param val
     */
    UserDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「组织标识」值
     * @param val
     */
    UserDTO setOrganizationId(String organizationId) {
        this.organizationId = organizationId
        return this
    }


    /**
     * 设置「组织名称」值
     * @param val
     */
    UserDTO setOrganizationName(String organizationName) {
        this.organizationName = organizationName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    UserDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    UserDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
