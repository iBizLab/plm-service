package cn.ibizlab.plm.base.insight.dto

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
class InsightDTO extends GroovyDTO<InsightDTO> {

    /**
     * 「图表类型」
     * 字典[报表类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「描述」
     */
    @JsonProperty("desc")
    String desc
    /**
     * 「组别」
     * 字典[报表组别]
     */
    @JsonProperty("group")
    String group
    /**
     * 「归属」
     */
    @JsonProperty("belong")
    String belong
    /**
     * 「报表呈现视图」
     */
    @JsonProperty("view_url")
    String viewUrl
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
     * 设置「图表类型」值
     * 字典[报表类型]
     * @param val
     */
    InsightDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    InsightDTO setDesc(String desc) {
        this.desc = desc
        return this
    }


    /**
     * 设置「组别」值
     * 字典[报表组别]
     * @param val
     */
    InsightDTO setGroup(String group) {
        this.group = group
        return this
    }


    /**
     * 设置「归属」值
     * @param val
     */
    InsightDTO setBelong(String belong) {
        this.belong = belong
        return this
    }


    /**
     * 设置「报表呈现视图」值
     * @param val
     */
    InsightDTO setViewUrl(String viewUrl) {
        this.viewUrl = viewUrl
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    InsightDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    InsightDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    InsightDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    InsightDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    InsightDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    InsightDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
