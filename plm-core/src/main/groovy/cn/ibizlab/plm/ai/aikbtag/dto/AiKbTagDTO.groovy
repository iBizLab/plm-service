package cn.ibizlab.plm.ai.aikbtag.dto

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
class AiKbTagDTO extends GroovyDTO<AiKbTagDTO> {

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
     * 「标签集标识」
     */
    @JsonProperty("set_id")
    String setId
    /**
     * 「标签值」
     */
    @JsonProperty("value")
    String value

    /**
     * 设置「标识」值
     * @param val
     */
    AiKbTagDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiKbTagDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「逻辑有效标识」值
     * @param val
     */
    AiKbTagDTO setEnable(Integer enable) {
        this.enable = enable
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbTagDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AiKbTagDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbTagDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    AiKbTagDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKbTagDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「标签集标识」值
     * @param val
     */
    AiKbTagDTO setSetId(String setId) {
        this.setId = setId
        return this
    }


    /**
     * 设置「标签值」值
     * @param val
     */
    AiKbTagDTO setValue(String value) {
        this.value = value
        return this
    }

}
