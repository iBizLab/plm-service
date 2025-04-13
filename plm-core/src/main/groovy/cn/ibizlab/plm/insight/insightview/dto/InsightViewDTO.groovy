package cn.ibizlab.plm.insight.insightview.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.insight.insightmember.dto.InsightMemberDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class InsightViewDTO extends GroovyDTO<InsightViewDTO> {

    /**
     * 「视图标识」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「可见范围」
     * 字典[可见范围]
     */
    @JsonProperty("visibility")
    String visibility
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
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
     * 「是否星标」
     * 字典[是否]
     */
    @JsonProperty("is_favorite")
    String isFavorite
    /**
     * 「效能视图成员」
     */
    @JsonProperty("members")
    List<InsightMemberDTO> members
    /**
     * 「所属」
     * 字典[所属类型（包含个人）]
     */
    @JsonProperty("scope_type")
    String scopeType
    /**
     * 「所属对象」
     */
    @JsonProperty("scope_id")
    String scopeId
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
     * 设置「视图标识」值
     * @param val
     */
    InsightViewDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「可见范围」值
     * 字典[可见范围]
     * @param val
     */
    InsightViewDTO setVisibility(String visibility) {
        this.visibility = visibility
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    InsightViewDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    InsightViewDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    InsightViewDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「是否星标」值
     * 字典[是否]
     * @param val
     */
    InsightViewDTO setIsFavorite(String isFavorite) {
        this.isFavorite = isFavorite
        return this
    }


    /**
     * 设置「效能视图成员」值
     * @param val
     */
    InsightViewDTO setMembers(List<InsightMemberDTO> members) {
        this.members = members
        return this
    }


    /**
     * 设置「所属」值
     * 字典[所属类型（包含个人）]
     * @param val
     */
    InsightViewDTO setScopeType(String scopeType) {
        this.scopeType = scopeType
        return this
    }


    /**
     * 设置「所属对象」值
     * @param val
     */
    InsightViewDTO setScopeId(String scopeId) {
        this.scopeId = scopeId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    InsightViewDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    InsightViewDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    InsightViewDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    InsightViewDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    InsightViewDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    InsightViewDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
