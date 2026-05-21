package cn.ibizlab.plm.base.template.dto

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
class TemplateDTO extends GroovyDTO<TemplateDTO> {

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
     * 「可见范围」
     */
    @JsonProperty("visibility")
    String visibility
    /**
     * 「是否已归档」
     * 字典[是否]
     */
    @JsonProperty("is_archived")
    Integer isArchived
    /**
     * 「是否已删除」
     * 字典[是否]
     */
    @JsonProperty("is_deleted")
    Integer isDeleted
    /**
     * 「所属数据标识」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「业务范围」
     */
    @JsonProperty("scope")
    String scope
    /**
     * 「模板类型」
     */
    @JsonProperty("broad_type")
    String broadType
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description

    /**
     * 设置「标识」值
     * @param val
     */
    TemplateDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    TemplateDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    TemplateDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    TemplateDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    TemplateDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    TemplateDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「可见范围」值
     * @param val
     */
    TemplateDTO setVisibility(String visibility) {
        this.visibility = visibility
        return this
    }


    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    TemplateDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    TemplateDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「所属数据标识」值
     * @param val
     */
    TemplateDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「业务范围」值
     * @param val
     */
    TemplateDTO setScope(String scope) {
        this.scope = scope
        return this
    }


    /**
     * 设置「模板类型」值
     * @param val
     */
    TemplateDTO setBroadType(String broadType) {
        this.broadType = broadType
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    TemplateDTO setDescription(String description) {
        this.description = description
        return this
    }

}
