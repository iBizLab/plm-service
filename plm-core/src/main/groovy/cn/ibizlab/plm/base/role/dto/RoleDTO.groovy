package cn.ibizlab.plm.base.role.dto

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
class RoleDTO extends GroovyDTO<RoleDTO> {

    /**
     * 「角色标识」
     */
    @JsonProperty("authority")
    String authority
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
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
     * 「租户系统标识」
     */
    @JsonProperty("dc_system_id")
    String dcSystemId
    /**
     * 「全局标记」
     * 字典[是否]
     */
    @JsonProperty("global_flag")
    Integer globalFlag
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「角色名称」
     */
    @JsonProperty("name")
    String name
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
     * 设置「角色标识」值
     * @param val
     */
    RoleDTO setAuthority(String authority) {
        this.authority = authority
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    RoleDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    RoleDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    RoleDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「租户系统标识」值
     * @param val
     */
    RoleDTO setDcSystemId(String dcSystemId) {
        this.dcSystemId = dcSystemId
        return this
    }


    /**
     * 设置「全局标记」值
     * 字典[是否]
     * @param val
     */
    RoleDTO setGlobalFlag(Integer globalFlag) {
        this.globalFlag = globalFlag
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    RoleDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「角色名称」值
     * @param val
     */
    RoleDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    RoleDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    RoleDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
