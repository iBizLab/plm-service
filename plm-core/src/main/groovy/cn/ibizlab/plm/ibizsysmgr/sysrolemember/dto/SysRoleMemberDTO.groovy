package cn.ibizlab.plm.ibizsysmgr.sysrolemember.dto

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
class SysRoleMemberDTO extends GroovyDTO<SysRoleMemberDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「创建人」
     */
    @JsonProperty("creator")
    String creator
    /**
     * 「创建时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「最后更新人」
     */
    @JsonProperty("updater")
    String updater
    /**
     * 「最后更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「DC」
     */
    @JsonProperty("dc")
    String dc
    /**
     * 「用户组/人员标识」
     */
    @JsonProperty("member_uid")
    String memberUid
    /**
     * 「系统角色标识」
     */
    @JsonProperty("role_id")
    String roleId
    /**
     * 「成员姓名」
     */
    @JsonProperty("member_name")
    String memberName
    /**
     * 「成员分组名称」
     */
    @JsonProperty("member_group_name")
    String memberGroupName
    /**
     * 「Mail」
     */
    @JsonProperty("mail")
    String mail

    /**
     * 设置「标识」值
     * @param val
     */
    SysRoleMemberDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「创建人」值
     * @param val
     */
    SysRoleMemberDTO setCreator(String creator) {
        this.creator = creator
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    SysRoleMemberDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「最后更新人」值
     * @param val
     */
    SysRoleMemberDTO setUpdater(String updater) {
        this.updater = updater
        return this
    }


    /**
     * 设置「最后更新时间」值
     * @param val
     */
    SysRoleMemberDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「DC」值
     * @param val
     */
    SysRoleMemberDTO setDc(String dc) {
        this.dc = dc
        return this
    }


    /**
     * 设置「用户组/人员标识」值
     * @param val
     */
    SysRoleMemberDTO setMemberUid(String memberUid) {
        this.memberUid = memberUid
        return this
    }


    /**
     * 设置「系统角色标识」值
     * @param val
     */
    SysRoleMemberDTO setRoleId(String roleId) {
        this.roleId = roleId
        return this
    }


    /**
     * 设置「成员姓名」值
     * @param val
     */
    SysRoleMemberDTO setMemberName(String memberName) {
        this.memberName = memberName
        return this
    }


    /**
     * 设置「成员分组名称」值
     * @param val
     */
    SysRoleMemberDTO setMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName
        return this
    }


    /**
     * 设置「Mail」值
     * @param val
     */
    SysRoleMemberDTO setMail(String mail) {
        this.mail = mail
        return this
    }

}
