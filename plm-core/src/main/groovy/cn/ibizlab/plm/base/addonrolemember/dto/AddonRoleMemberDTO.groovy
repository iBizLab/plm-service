package cn.ibizlab.plm.base.addonrolemember.dto

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
class AddonRoleMemberDTO extends GroovyDTO<AddonRoleMemberDTO> {

    /**
     * 「成员类型」
     * 字典[成员类型]
     */
    @JsonProperty("type")
    Integer type
    /**
     * 「用户对象标识」
     */
    @JsonProperty("user_obj_id")
    String userObjId
    /**
     * 「组件标识」
     */
    @JsonProperty("addon_id")
    String addonId
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
     * 设置「成员类型」值
     * 字典[成员类型]
     * @param val
     */
    AddonRoleMemberDTO setType(Integer type) {
        this.type = type
        return this
    }


    /**
     * 设置「用户对象标识」值
     * @param val
     */
    AddonRoleMemberDTO setUserObjId(String userObjId) {
        this.userObjId = userObjId
        return this
    }


    /**
     * 设置「组件标识」值
     * @param val
     */
    AddonRoleMemberDTO setAddonId(String addonId) {
        this.addonId = addonId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AddonRoleMemberDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AddonRoleMemberDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    AddonRoleMemberDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AddonRoleMemberDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AddonRoleMemberDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AddonRoleMemberDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
