package cn.ibizlab.plm.prodmgmtmfg.resource.dto

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
class ResourceDTO extends GroovyDTO<ResourceDTO> {

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
     * 「资源类型」
     */
    @JsonProperty("category")
    String category
    /**
     * 「资源编号」
     */
    @JsonProperty("resource_no")
    String resourceNo
    /**
     * 「状态」
     */
    @JsonProperty("status")
    String status
    /**
     * 「资源大类」
     */
    @JsonProperty("type")
    String type
    /**
     * 「统计数」
     */
    @JsonProperty("rep_num")
    BigDecimal repNum

    /**
     * 设置「标识」值
     * @param val
     */
    ResourceDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResourceDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResourceDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    ResourceDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResourceDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResourceDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「资源类型」值
     * @param val
     */
    ResourceDTO setCategory(String category) {
        this.category = category
        return this
    }


    /**
     * 设置「资源编号」值
     * @param val
     */
    ResourceDTO setResourceNo(String resourceNo) {
        this.resourceNo = resourceNo
        return this
    }


    /**
     * 设置「状态」值
     * @param val
     */
    ResourceDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「资源大类」值
     * @param val
     */
    ResourceDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「统计数」值
     * @param val
     */
    ResourceDTO setRepNum(BigDecimal repNum) {
        this.repNum = repNum
        return this
    }

}
