package cn.ibizlab.plm.projmgmt.stage.dto

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
class StageDTO extends GroovyDTO<StageDTO> {

    /**
     * 「颜色」
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
     * 「是否发布当前阶段」
     * 字典[是否]
     */
    @JsonProperty("is_current")
    Integer isCurrent
    /**
     * 「操作时间」
     */
    @JsonProperty("operated_time")
    Timestamp operatedTime
    /**
     * 「阶段类型」
     * 字典[阶段类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「父颜色」
     */
    @JsonProperty("p_color")
    String pColor
    /**
     * 「父阶段类型」
     * 字典[阶段类型]
     */
    @JsonProperty("p_type")
    String pType
    /**
     * 「父阶段排序」
     */
    @JsonProperty("p_sequence")
    BigDecimal pSequence
    /**
     * 「排序」
     */
    @JsonProperty("sequence")
    BigDecimal sequence
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
     * 「父标识」
     */
    @JsonProperty("pid")
    String pid
    /**
     * 「父名称」
     */
    @JsonProperty("pname")
    String pname
    /**
     * 「项目发布标识」
     */
    @JsonProperty("release_id")
    String releaseId
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
     * 设置「颜色」值
     * @param val
     */
    StageDTO setColor(String color) {
        this.color = color
        return this
    }


    /**
     * 设置「背景样式」值
     * 字典[背景样式]
     * @param val
     */
    StageDTO setStyle(String style) {
        this.style = style
        return this
    }


    /**
     * 设置「是否发布当前阶段」值
     * 字典[是否]
     * @param val
     */
    StageDTO setIsCurrent(Integer isCurrent) {
        this.isCurrent = isCurrent
        return this
    }


    /**
     * 设置「操作时间」值
     * @param val
     */
    StageDTO setOperatedTime(Timestamp operatedTime) {
        this.operatedTime = operatedTime
        return this
    }


    /**
     * 设置「阶段类型」值
     * 字典[阶段类型]
     * @param val
     */
    StageDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「父颜色」值
     * @param val
     */
    StageDTO setPColor(String pColor) {
        this.pColor = pColor
        return this
    }


    /**
     * 设置「父阶段类型」值
     * 字典[阶段类型]
     * @param val
     */
    StageDTO setPType(String pType) {
        this.pType = pType
        return this
    }


    /**
     * 设置「父阶段排序」值
     * @param val
     */
    StageDTO setPSequence(BigDecimal pSequence) {
        this.pSequence = pSequence
        return this
    }


    /**
     * 设置「排序」值
     * @param val
     */
    StageDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    StageDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    StageDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    StageDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    StageDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    StageDTO setPid(String pid) {
        this.pid = pid
        return this
    }


    /**
     * 设置「父名称」值
     * @param val
     */
    StageDTO setPname(String pname) {
        this.pname = pname
        return this
    }


    /**
     * 设置「项目发布标识」值
     * @param val
     */
    StageDTO setReleaseId(String releaseId) {
        this.releaseId = releaseId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    StageDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    StageDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
