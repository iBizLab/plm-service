package cn.ibizlab.plm.ebsx.userrole.dto

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
class UserRoleDTO extends GroovyDTO<UserRoleDTO> {

    /**
     * 「用户角色关系标识」
     */
    @JsonProperty("userroleid")
    String userRoleId
    /**
     * 「建立时间」
     */
    @JsonProperty("createdate")
    Timestamp createDate
    /**
     * 「更新时间」
     */
    @JsonProperty("updatedate")
    Timestamp updateDate
    /**
     * 「用户标识」
     */
    @JsonProperty("userid")
    String userId
    /**
     * 「角色」
     */
    @JsonProperty("roleid")
    String roleId
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("createman")
    String createMan
    /**
     * 「创建人」
     */
    @JsonProperty("createmanname")
    String createManName
    /**
     * 「启用标志」
     * 字典[是否]
     */
    @JsonProperty("isvalid")
    Integer isValid
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("updateman")
    String updateMan
    /**
     * 「更新人」
     */
    @JsonProperty("updatemanname")
    String updateManName

    /**
     * 设置「用户角色关系标识」值
     * @param val
     */
    UserRoleDTO setUserRoleId(String userRoleId) {
        this.userRoleId = userRoleId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    UserRoleDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    UserRoleDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「用户标识」值
     * @param val
     */
    UserRoleDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「角色」值
     * @param val
     */
    UserRoleDTO setRoleId(String roleId) {
        this.roleId = roleId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    UserRoleDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建人」值
     * @param val
     */
    UserRoleDTO setCreateManName(String createManName) {
        this.createManName = createManName
        return this
    }


    /**
     * 设置「启用标志」值
     * 字典[是否]
     * @param val
     */
    UserRoleDTO setIsValid(Integer isValid) {
        this.isValid = isValid
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    UserRoleDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    UserRoleDTO setUpdateManName(String updateManName) {
        this.updateManName = updateManName
        return this
    }

}
