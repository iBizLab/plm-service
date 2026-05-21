package cn.ibizlab.plm.ai.aikbtagset.dto

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
class AiKbTagSetDTO extends GroovyDTO<AiKbTagSetDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「展示名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「逻辑有效标识」
     */
    @JsonProperty("enable")
    Integer enable
    /**
     * 「创建人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「创建时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「范围」
     */
    @JsonProperty("scope")
    String scope
    /**
     * 「范围所属标识」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「源标识」
     */
    @JsonProperty("source_id")
    String sourceId

    /**
     * 设置「标识」值
     * @param val
     */
    AiKbTagSetDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「展示名称」值
     * @param val
     */
    AiKbTagSetDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「逻辑有效标识」值
     * @param val
     */
    AiKbTagSetDTO setEnable(Integer enable) {
        this.enable = enable
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbTagSetDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AiKbTagSetDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbTagSetDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    AiKbTagSetDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKbTagSetDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「范围」值
     * @param val
     */
    AiKbTagSetDTO setScope(String scope) {
        this.scope = scope
        return this
    }


    /**
     * 设置「范围所属标识」值
     * @param val
     */
    AiKbTagSetDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「源标识」值
     * @param val
     */
    AiKbTagSetDTO setSourceId(String sourceId) {
        this.sourceId = sourceId
        return this
    }

}
