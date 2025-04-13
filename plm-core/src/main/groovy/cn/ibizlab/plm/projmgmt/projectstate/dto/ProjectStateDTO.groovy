package cn.ibizlab.plm.projmgmt.projectstate.dto

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
class ProjectStateDTO extends GroovyDTO<ProjectStateDTO> {

    /**
     * 「序号」
     */
    @JsonProperty("sequence")
    BigDecimal sequence
    /**
     * 「是否系统类型」
     * 字典[是否]
     */
    @JsonProperty("is_system")
    Integer isSystem
    /**
     * 「字体颜色」
     */
    @JsonProperty("color")
    String color
    /**
     * 「背景样式」
     * 字典[背景样式]
     */
    @JsonProperty("style")
    String style
    /**
     * 「状态类别」
     * 字典[项目状态类型]
     */
    @JsonProperty("type")
    String type
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
     * 「状态名称」
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
    ProjectStateDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「是否系统类型」值
     * 字典[是否]
     * @param val
     */
    ProjectStateDTO setIsSystem(Integer isSystem) {
        this.isSystem = isSystem
        return this
    }


    /**
     * 设置「字体颜色」值
     * @param val
     */
    ProjectStateDTO setColor(String color) {
        this.color = color
        return this
    }


    /**
     * 设置「背景样式」值
     * 字典[背景样式]
     * @param val
     */
    ProjectStateDTO setStyle(String style) {
        this.style = style
        return this
    }


    /**
     * 设置「状态类别」值
     * 字典[项目状态类型]
     * @param val
     */
    ProjectStateDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProjectStateDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ProjectStateDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ProjectStateDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「状态名称」值
     * @param val
     */
    ProjectStateDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProjectStateDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ProjectStateDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
