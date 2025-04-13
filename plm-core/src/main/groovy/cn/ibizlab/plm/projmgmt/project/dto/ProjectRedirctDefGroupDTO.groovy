package cn.ibizlab.plm.projmgmt.project.dto

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
class ProjectRedirctDefGroupDTO extends GroovyDTO<ProjectRedirctDefGroupDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「类型」
     * 字典[项目类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「项目状态」
     * 字典[项目状态（动态）]
     */
    @JsonProperty("state")
    String state
    /**
     * 「可见范围」
     * 字典[可见范围]
     */
    @JsonProperty("visibility")
    String visibility
    /**
     * 「项目名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「项目标识」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「主题色」
     */
    @JsonProperty("color")
    String color
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「负责人标识」
     * 字典[云系统操作者]
     */
    @JsonProperty("assignee_id")
    String assigneeId
    /**
     * 「是否星标」
     * 字典[是否]
     */
    @JsonProperty("is_favorite")
    String isFavorite
    /**
     * 「结束时间」
     */
    @JsonProperty("end_at")
    Timestamp endAt
    /**
     * 「开始时间」
     */
    @JsonProperty("start_at")
    Timestamp startAt
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「是否已删除」
     * 字典[是否]
     */
    @JsonProperty("is_deleted")
    Integer isDeleted
    /**
     * 「是否本地配置」
     * 字典[是否]
     */
    @JsonProperty("is_local_configure")
    Integer isLocalConfigure
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
     * 设置「标识」值
     * @param val
     */
    ProjectRedirctDefGroupDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「类型」值
     * 字典[项目类型]
     * @param val
     */
    ProjectRedirctDefGroupDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「项目状态」值
     * 字典[项目状态（动态）]
     * @param val
     */
    ProjectRedirctDefGroupDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「可见范围」值
     * 字典[可见范围]
     * @param val
     */
    ProjectRedirctDefGroupDTO setVisibility(String visibility) {
        this.visibility = visibility
        return this
    }


    /**
     * 设置「项目名称」值
     * @param val
     */
    ProjectRedirctDefGroupDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「项目标识」值
     * @param val
     */
    ProjectRedirctDefGroupDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「主题色」值
     * @param val
     */
    ProjectRedirctDefGroupDTO setColor(String color) {
        this.color = color
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProjectRedirctDefGroupDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProjectRedirctDefGroupDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    ProjectRedirctDefGroupDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「负责人标识」值
     * 字典[云系统操作者]
     * @param val
     */
    ProjectRedirctDefGroupDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「是否星标」值
     * 字典[是否]
     * @param val
     */
    ProjectRedirctDefGroupDTO setIsFavorite(String isFavorite) {
        this.isFavorite = isFavorite
        return this
    }


    /**
     * 设置「结束时间」值
     * @param val
     */
    ProjectRedirctDefGroupDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    ProjectRedirctDefGroupDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ProjectRedirctDefGroupDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ProjectRedirctDefGroupDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    ProjectRedirctDefGroupDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「是否本地配置」值
     * 字典[是否]
     * @param val
     */
    ProjectRedirctDefGroupDTO setIsLocalConfigure(Integer isLocalConfigure) {
        this.isLocalConfigure = isLocalConfigure
        return this
    }


    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    ProjectRedirctDefGroupDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ProjectRedirctDefGroupDTO setDescription(String description) {
        this.description = description
        return this
    }

}
