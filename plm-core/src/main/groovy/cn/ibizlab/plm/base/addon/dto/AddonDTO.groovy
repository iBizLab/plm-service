package cn.ibizlab.plm.base.addon.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.addonrolemember.dto.AddonRoleMemberDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class AddonDTO extends GroovyDTO<AddonDTO> {

    /**
     * 「组件类型」
     */
    @JsonProperty("addon_type")
    String addonType
    /**
     * 「所属子类型」
     */
    @JsonProperty("owner_subtype")
    String ownerSubtype
    /**
     * 「所属类型」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「所属标识」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「配置模型」
     */
    @JsonProperty("setting_model")
    String settingModel
    /**
     * 「启用」
     * 字典[是否]
     */
    @JsonProperty("is_enabled")
    Integer isEnabled
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「排序」
     */
    @JsonProperty("order_value")
    Integer orderValue
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
     * 「null」
     */
    @JsonProperty("addon_role_members")
    List<AddonRoleMemberDTO> addonRoleMembers

    /**
     * 设置「组件类型」值
     * @param val
     */
    AddonDTO setAddonType(String addonType) {
        this.addonType = addonType
        return this
    }


    /**
     * 设置「所属子类型」值
     * @param val
     */
    AddonDTO setOwnerSubtype(String ownerSubtype) {
        this.ownerSubtype = ownerSubtype
        return this
    }


    /**
     * 设置「所属类型」值
     * @param val
     */
    AddonDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所属标识」值
     * @param val
     */
    AddonDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「配置模型」值
     * @param val
     */
    AddonDTO setSettingModel(String settingModel) {
        this.settingModel = settingModel
        return this
    }


    /**
     * 设置「启用」值
     * 字典[是否]
     * @param val
     */
    AddonDTO setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    AddonDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「排序」值
     * @param val
     */
    AddonDTO setOrderValue(Integer orderValue) {
        this.orderValue = orderValue
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AddonDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AddonDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    AddonDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AddonDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AddonDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AddonDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    AddonDTO setAddonRoleMembers(List<AddonRoleMemberDTO> addonRoleMembers) {
        this.addonRoleMembers = addonRoleMembers
        return this
    }

}
