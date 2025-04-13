package cn.ibizlab.plm.team.discusstopic.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.team.discussmember.dto.DiscussMemberDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class DiscussTopicDTO extends GroovyDTO<DiscussTopicDTO> {

    /**
     * 「话题标识」
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
     * 「是否已归档」
     * 字典[是否]
     */
    @JsonProperty("is_archived")
    Integer isArchived
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
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
     * 「话题成员」
     */
    @JsonProperty("members")
    List<DiscussMemberDTO> members
    /**
     * 「所属」
     * 字典[所属类型（通用）]
     */
    @JsonProperty("scope_type")
    String scopeType
    /**
     * 「所属对象」
     */
    @JsonProperty("scope_id")
    String scopeId
    /**
     * 「当日贴数」
     */
    @JsonProperty("today_post_count")
    String todayPostCount
    /**
     * 「当日人数」
     */
    @JsonProperty("today_read_count")
    String todayReadCount
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
     * 「话题名称」
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
     * 设置「话题标识」值
     * @param val
     */
    DiscussTopicDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「可见范围」值
     * 字典[可见范围]
     * @param val
     */
    DiscussTopicDTO setVisibility(String visibility) {
        this.visibility = visibility
        return this
    }


    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    DiscussTopicDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    DiscussTopicDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    DiscussTopicDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「是否星标」值
     * 字典[是否]
     * @param val
     */
    DiscussTopicDTO setIsFavorite(String isFavorite) {
        this.isFavorite = isFavorite
        return this
    }


    /**
     * 设置「话题成员」值
     * @param val
     */
    DiscussTopicDTO setMembers(List<DiscussMemberDTO> members) {
        this.members = members
        return this
    }


    /**
     * 设置「所属」值
     * 字典[所属类型（通用）]
     * @param val
     */
    DiscussTopicDTO setScopeType(String scopeType) {
        this.scopeType = scopeType
        return this
    }


    /**
     * 设置「所属对象」值
     * @param val
     */
    DiscussTopicDTO setScopeId(String scopeId) {
        this.scopeId = scopeId
        return this
    }


    /**
     * 设置「当日贴数」值
     * @param val
     */
    DiscussTopicDTO setTodayPostCount(String todayPostCount) {
        this.todayPostCount = todayPostCount
        return this
    }


    /**
     * 设置「当日人数」值
     * @param val
     */
    DiscussTopicDTO setTodayReadCount(String todayReadCount) {
        this.todayReadCount = todayReadCount
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    DiscussTopicDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    DiscussTopicDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    DiscussTopicDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「话题名称」值
     * @param val
     */
    DiscussTopicDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    DiscussTopicDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DiscussTopicDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
