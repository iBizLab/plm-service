package cn.ibizlab.plm.base.addonresource.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.resourcemember.dto.ResourceMemberDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class AddonResourceDTO extends GroovyDTO<AddonResourceDTO> {

    /**
     * 「组件类型」
     */
    @JsonProperty("addon_type")
    String addonType
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
     * 「资源成员」
     */
    @JsonProperty("members")
    List<ResourceMemberDTO> members
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
     * 设置「组件类型」值
     * @param val
     */
    AddonResourceDTO setAddonType(String addonType) {
        this.addonType = addonType
        return this
    }


    /**
     * 设置「所属类型」值
     * @param val
     */
    AddonResourceDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所属标识」值
     * @param val
     */
    AddonResourceDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「配置模型」值
     * @param val
     */
    AddonResourceDTO setSettingModel(String settingModel) {
        this.settingModel = settingModel
        return this
    }


    /**
     * 设置「启用」值
     * 字典[是否]
     * @param val
     */
    AddonResourceDTO setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    AddonResourceDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「资源成员」值
     * @param val
     */
    AddonResourceDTO setMembers(List<ResourceMemberDTO> members) {
        this.members = members
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AddonResourceDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AddonResourceDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    AddonResourceDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AddonResourceDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AddonResourceDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AddonResourceDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
