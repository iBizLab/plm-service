package cn.ibizlab.plm.wiki.space.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.wiki.spacemember.dto.SpaceMemberDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class SpaceDTO extends GroovyDTO<SpaceDTO> {

    /**
     * 「空间标识」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「是否开启共享」
     * 字典[空间共享状态]
     */
    @JsonProperty("is_shared")
    String isShared
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
     * 「分类路径」
     */
    @JsonProperty("categories")
    String categories
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
     * 「成员」
     */
    @JsonProperty("members")
    List<SpaceMemberDTO> members
    /**
     * 「分类」
     */
    @JsonProperty("category_id")
    String categoryId
    /**
     * 「分类」
     */
    @JsonProperty("category_name")
    String categoryName
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
     * 「空间名称」
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
     * 「用户标记」
     */
    @JsonProperty("user_tag")
    String userTag
    /**
     * 「用户标记2」
     */
    @JsonProperty("user_tag2")
    String userTag2

    /**
     * 设置「空间标识」值
     * @param val
     */
    SpaceDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「是否开启共享」值
     * 字典[空间共享状态]
     * @param val
     */
    SpaceDTO setIsShared(String isShared) {
        this.isShared = isShared
        return this
    }


    /**
     * 设置「可见范围」值
     * 字典[可见范围]
     * @param val
     */
    SpaceDTO setVisibility(String visibility) {
        this.visibility = visibility
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    SpaceDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    SpaceDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    SpaceDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「是否星标」值
     * 字典[是否]
     * @param val
     */
    SpaceDTO setIsFavorite(String isFavorite) {
        this.isFavorite = isFavorite
        return this
    }


    /**
     * 设置「分类路径」值
     * @param val
     */
    SpaceDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「所属」值
     * 字典[所属类型（包含个人）]
     * @param val
     */
    SpaceDTO setScopeType(String scopeType) {
        this.scopeType = scopeType
        return this
    }


    /**
     * 设置「所属对象」值
     * @param val
     */
    SpaceDTO setScopeId(String scopeId) {
        this.scopeId = scopeId
        return this
    }


    /**
     * 设置「成员」值
     * @param val
     */
    SpaceDTO setMembers(List<SpaceMemberDTO> members) {
        this.members = members
        return this
    }


    /**
     * 设置「分类」值
     * @param val
     */
    SpaceDTO setCategoryId(String categoryId) {
        this.categoryId = categoryId
        return this
    }


    /**
     * 设置「分类」值
     * @param val
     */
    SpaceDTO setCategoryName(String categoryName) {
        this.categoryName = categoryName
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    SpaceDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    SpaceDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    SpaceDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「空间名称」值
     * @param val
     */
    SpaceDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    SpaceDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    SpaceDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「用户标记」值
     * @param val
     */
    SpaceDTO setUserTag(String userTag) {
        this.userTag = userTag
        return this
    }


    /**
     * 设置「用户标记2」值
     * @param val
     */
    SpaceDTO setUserTag2(String userTag2) {
        this.userTag2 = userTag2
        return this
    }

}
