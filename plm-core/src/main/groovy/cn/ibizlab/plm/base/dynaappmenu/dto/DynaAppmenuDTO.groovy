package cn.ibizlab.plm.base.dynaappmenu.dto

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
class DynaAppmenuDTO extends GroovyDTO<DynaAppmenuDTO> {

    /**
     * 「看板类型」
     */
    @JsonProperty("type")
    String type
    /**
     * 「所属数据类型」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「所属数据标识」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「应用标识」
     */
    @JsonProperty("app_id")
    String appId
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
     * 「模型」
     */
    @JsonProperty("model")
    String model
    /**
     * 「模型标识」
     */
    @JsonProperty("model_id")
    String modelId
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
     * 「用户标识」
     */
    @JsonProperty("user_id")
    String userId

    /**
     * 设置「看板类型」值
     * @param val
     */
    DynaAppmenuDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「所属数据类型」值
     * @param val
     */
    DynaAppmenuDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所属数据标识」值
     * @param val
     */
    DynaAppmenuDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「应用标识」值
     * @param val
     */
    DynaAppmenuDTO setAppId(String appId) {
        this.appId = appId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    DynaAppmenuDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    DynaAppmenuDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    DynaAppmenuDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「模型」值
     * @param val
     */
    DynaAppmenuDTO setModel(String model) {
        this.model = model
        return this
    }


    /**
     * 设置「模型标识」值
     * @param val
     */
    DynaAppmenuDTO setModelId(String modelId) {
        this.modelId = modelId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    DynaAppmenuDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    DynaAppmenuDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DynaAppmenuDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「用户标识」值
     * @param val
     */
    DynaAppmenuDTO setUserId(String userId) {
        this.userId = userId
        return this
    }

}
