package cn.ibizlab.plm.base.notifysetting.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.extension.notifyevent.dto.NotifyEventDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class NotifySettingDTO extends GroovyDTO<NotifySettingDTO> {

    /**
     * 「所有者类型」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「所有者标识」
     */
    @JsonProperty("owner_id")
    String ownerId
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
     * 「系统标记」
     */
    @JsonProperty("system_tag")
    String systemTag
    /**
     * 「设置模型」
     */
    @JsonProperty("setting_model")
    List<NotifyEventDTO> settingModel

    /**
     * 设置「所有者类型」值
     * @param val
     */
    NotifySettingDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所有者标识」值
     * @param val
     */
    NotifySettingDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    NotifySettingDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    NotifySettingDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    NotifySettingDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    NotifySettingDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    NotifySettingDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    NotifySettingDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「系统标记」值
     * @param val
     */
    NotifySettingDTO setSystemTag(String systemTag) {
        this.systemTag = systemTag
        return this
    }


    /**
     * 设置「设置模型」值
     * @param val
     */
    NotifySettingDTO setSettingModel(List<NotifyEventDTO> settingModel) {
        this.settingModel = settingModel
        return this
    }

}
