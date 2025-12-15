package cn.ibizlab.plm.base.dictionarydata.dto

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
class DictionaryDataDTO extends GroovyDTO<DictionaryDataDTO> {

    /**
     * 「序号」
     */
    @JsonProperty("sequence")
    BigDecimal sequence
    /**
     * 「类型」
     * 字典[字典项类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「值」
     */
    @JsonProperty("val")
    String val
    /**
     * 「颜色」
     */
    @JsonProperty("color")
    String color
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「是否系统默认」
     * 字典[是否]
     */
    @JsonProperty("is_system")
    Integer isSystem
    /**
     * 「背景样式」
     * 字典[背景样式]
     */
    @JsonProperty("style")
    String style
    /**
     * 「字典目录」
     * 字典[字典目录]
     */
    @JsonProperty("catalog")
    String catalog
    /**
     * 「图标」
     */
    @JsonProperty("icon")
    String icon
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
     * 设置「序号」值
     * @param val
     */
    DictionaryDataDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「类型」值
     * 字典[字典项类型]
     * @param val
     */
    DictionaryDataDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「值」值
     * @param val
     */
    DictionaryDataDTO setVal(String val) {
        this.val = val
        return this
    }


    /**
     * 设置「颜色」值
     * @param val
     */
    DictionaryDataDTO setColor(String color) {
        this.color = color
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    DictionaryDataDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「是否系统默认」值
     * 字典[是否]
     * @param val
     */
    DictionaryDataDTO setIsSystem(Integer isSystem) {
        this.isSystem = isSystem
        return this
    }


    /**
     * 设置「背景样式」值
     * 字典[背景样式]
     * @param val
     */
    DictionaryDataDTO setStyle(String style) {
        this.style = style
        return this
    }


    /**
     * 设置「字典目录」值
     * 字典[字典目录]
     * @param val
     */
    DictionaryDataDTO setCatalog(String catalog) {
        this.catalog = catalog
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    DictionaryDataDTO setIcon(String icon) {
        this.icon = icon
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    DictionaryDataDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    DictionaryDataDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    DictionaryDataDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    DictionaryDataDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    DictionaryDataDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DictionaryDataDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
