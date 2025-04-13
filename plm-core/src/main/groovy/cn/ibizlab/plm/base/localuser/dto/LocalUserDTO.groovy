package cn.ibizlab.plm.base.localuser.dto

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
class LocalUserDTO extends GroovyDTO<LocalUserDTO> {

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
     * 「部门标识」
     */
    @JsonProperty("department_id")
    String departmentId
    /**
     * 「部门名称」
     */
    @JsonProperty("department_name")
    String departmentName
    /**
     * 「统计」
     * 字典[启停状态]
     */
    @JsonProperty("report_flag")
    Integer reportFlag
    /**
     * 「组织标识」
     */
    @JsonProperty("organization_id")
    String organizationId
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan

    /**
     * 设置「标识」值
     * @param val
     */
    LocalUserDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    LocalUserDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「姓名」值
     * @param val
     */
    LocalUserDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「邮箱」值
     * @param val
     */
    LocalUserDTO setEmail(String email) {
        this.email = email
        return this
    }


    /**
     * 设置「手机号」值
     * @param val
     */
    LocalUserDTO setMobile(String mobile) {
        this.mobile = mobile
        return this
    }


    /**
     * 设置「密码」值
     * @param val
     */
    LocalUserDTO setPassword(String password) {
        this.password = password
        return this
    }


    /**
     * 设置「工号」值
     * @param val
     */
    LocalUserDTO setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber
        return this
    }


    /**
     * 设置「头像」值
     * @param val
     */
    LocalUserDTO setAvatar(String avatar) {
        this.avatar = avatar
        return this
    }


    /**
     * 设置「状态」值
     * @param val
     */
    LocalUserDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「部门标识」值
     * @param val
     */
    LocalUserDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「部门名称」值
     * @param val
     */
    LocalUserDTO setDepartmentName(String departmentName) {
        this.departmentName = departmentName
        return this
    }


    /**
     * 设置「统计」值
     * 字典[启停状态]
     * @param val
     */
    LocalUserDTO setReportFlag(Integer reportFlag) {
        this.reportFlag = reportFlag
        return this
    }


    /**
     * 设置「组织标识」值
     * @param val
     */
    LocalUserDTO setOrganizationId(String organizationId) {
        this.organizationId = organizationId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    LocalUserDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    LocalUserDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    LocalUserDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    LocalUserDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }

}
