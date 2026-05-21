package cn.ibizlab.plm.ai.aikbgraphentitytype.dto

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
class AiKbGraphEntityTypeDTO extends GroovyDTO<AiKbGraphEntityTypeDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「类型名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「类型值」
     */
    @JsonProperty("value")
    String value
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
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「显示图标」
     */
    @JsonProperty("icon")
    String icon

    /**
     * 设置「标识」值
     * @param val
     */
    AiKbGraphEntityTypeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「类型名称」值
     * @param val
     */
    AiKbGraphEntityTypeDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「类型值」值
     * @param val
     */
    AiKbGraphEntityTypeDTO setValue(String value) {
        this.value = value
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbGraphEntityTypeDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AiKbGraphEntityTypeDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbGraphEntityTypeDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKbGraphEntityTypeDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    AiKbGraphEntityTypeDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「显示图标」值
     * @param val
     */
    AiKbGraphEntityTypeDTO setIcon(String icon) {
        this.icon = icon
        return this
    }

}
