package cn.ibizlab.plm.ibizsysmgr.sysrole.dto

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
class SysRoleDTO extends GroovyDTO<SysRoleDTO> {

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
     * 「角色代码标记」
     */
    @JsonProperty("authority")
    String authority
    /**
     * 「是否是工作流用户组」
     * 字典[是否]
     */
    @JsonProperty("workflow_group")
    Integer workflowGroup
    /**
     * 「范围」
     */
    @JsonProperty("group_scope")
    String groupScope
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「部署系统标识」
     */
    @JsonProperty("deploy_system_id")
    String deploySystemId

    /**
     * 设置「标识」值
     * @param val
     */
    SysRoleDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    SysRoleDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「创建人」值
     * @param val
     */
    SysRoleDTO setCreator(String creator) {
        this.creator = creator
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    SysRoleDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「最后更新人」值
     * @param val
     */
    SysRoleDTO setUpdater(String updater) {
        this.updater = updater
        return this
    }


    /**
     * 设置「最后更新时间」值
     * @param val
     */
    SysRoleDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「DC」值
     * @param val
     */
    SysRoleDTO setDc(String dc) {
        this.dc = dc
        return this
    }


    /**
     * 设置「角色代码标记」值
     * @param val
     */
    SysRoleDTO setAuthority(String authority) {
        this.authority = authority
        return this
    }


    /**
     * 设置「是否是工作流用户组」值
     * 字典[是否]
     * @param val
     */
    SysRoleDTO setWorkflowGroup(Integer workflowGroup) {
        this.workflowGroup = workflowGroup
        return this
    }


    /**
     * 设置「范围」值
     * @param val
     */
    SysRoleDTO setGroupScope(String groupScope) {
        this.groupScope = groupScope
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    SysRoleDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「部署系统标识」值
     * @param val
     */
    SysRoleDTO setDeploySystemId(String deploySystemId) {
        this.deploySystemId = deploySystemId
        return this
    }

}
