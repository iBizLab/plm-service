package cn.ibizlab.plm.base.portfolio.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.portfoliomember.dto.PortfolioMemberDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class PortfolioDTO extends GroovyDTO<PortfolioDTO> {

    /**
     * 「状态」
     * 字典[项目状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「开始时间」
     */
    @JsonProperty("start_at")
    Timestamp startAt
    /**
     * 「结束时间」
     */
    @JsonProperty("end_at")
    Timestamp endAt
    /**
     * 「项目集标识」
     */
    @JsonProperty("identifier")
    String identifier
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
     * 「项目集成员」
     */
    @JsonProperty("members")
    List<PortfolioMemberDTO> members
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「负责人标识」
     */
    @JsonProperty("assignee_id")
    String assigneeId
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
     * 「项目集名称」
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
     * 设置「状态」值
     * 字典[项目状态]
     * @param val
     */
    PortfolioDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    PortfolioDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「结束时间」值
     * @param val
     */
    PortfolioDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「项目集标识」值
     * @param val
     */
    PortfolioDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    PortfolioDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    PortfolioDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「是否星标」值
     * 字典[是否]
     * @param val
     */
    PortfolioDTO setIsFavorite(String isFavorite) {
        this.isFavorite = isFavorite
        return this
    }


    /**
     * 设置「项目集成员」值
     * @param val
     */
    PortfolioDTO setMembers(List<PortfolioMemberDTO> members) {
        this.members = members
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    PortfolioDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「负责人标识」值
     * @param val
     */
    PortfolioDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PortfolioDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PortfolioDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    PortfolioDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「项目集名称」值
     * @param val
     */
    PortfolioDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PortfolioDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PortfolioDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
