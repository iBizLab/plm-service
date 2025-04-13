package cn.ibizlab.plm.prodmgmt.baselineidea.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.version.dto.VersionDTO
import cn.ibizlab.plm.base.baseline.dto.BaselineDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class BaselineIdeaDTO extends GroovyDTO<BaselineIdeaDTO> {

    /**
     * 「关联主体标识」
     */
    @JsonProperty("principal_id")
    String principalId
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「关联主体类型」
     */
    @JsonProperty("principal_type")
    String principalType
    /**
     * 「关联目标类型」
     */
    @JsonProperty("target_type")
    String targetType
    /**
     * 「关联目标标识」
     */
    @JsonProperty("target_id")
    String targetId
    /**
     * 「目标对象版本标识」
     */
    @JsonProperty("target_version_id")
    String targetVersionId
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「状态」
     */
    @JsonProperty("state")
    String state
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_id")
    String assigneeId
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「当前版本标识」
     */
    @JsonProperty("cur_version_id")
    String curVersionId
    /**
     * 「优先级」
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「产品」
     */
    @JsonProperty("product_id")
    String productId
    /**
     * 「关联目标版本」
     */
    @JsonProperty("target_version")
    VersionDTO targetVersion
    /**
     * 「需求类型」
     * 字典[需求类型]
     */
    @JsonProperty("idea_type")
    String ideaType
    /**
     * 「需求来源」
     */
    @JsonProperty("idea_from")
    String ideaFrom
    /**
     * 「实际开始时间」
     */
    @JsonProperty("real_at_from")
    Timestamp realAtFrom
    /**
     * 「进度」
     */
    @JsonProperty("progress")
    BigDecimal progress
    /**
     * 「计划时间周期单位」
     */
    @JsonProperty("plan_at_granularity")
    String planAtGranularity
    /**
     * 「计划时间」
     */
    @JsonProperty("plan_at")
    String planAt
    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「实际时间」
     */
    @JsonProperty("real_at")
    String realAt
    /**
     * 「类别标识」
     */
    @JsonProperty("category_id")
    String categoryId
    /**
     * 「实际结束时间」
     */
    @JsonProperty("real_at_to")
    Timestamp realAtTo
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「是否已删除」
     */
    @JsonProperty("is_deleted")
    String isDeleted
    /**
     * 「是否已归档」
     */
    @JsonProperty("is_archived")
    String isArchived
    /**
     * 「计划结束时间」
     */
    @JsonProperty("plan_at_to")
    Timestamp planAtTo
    /**
     * 「基线」
     */
    @JsonProperty("baseline")
    BaselineDTO baseline
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
     * 设置「关联主体标识」值
     * @param val
     */
    BaselineIdeaDTO setPrincipalId(String principalId) {
        this.principalId = principalId
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    BaselineIdeaDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「关联主体类型」值
     * @param val
     */
    BaselineIdeaDTO setPrincipalType(String principalType) {
        this.principalType = principalType
        return this
    }


    /**
     * 设置「关联目标类型」值
     * @param val
     */
    BaselineIdeaDTO setTargetType(String targetType) {
        this.targetType = targetType
        return this
    }


    /**
     * 设置「关联目标标识」值
     * @param val
     */
    BaselineIdeaDTO setTargetId(String targetId) {
        this.targetId = targetId
        return this
    }


    /**
     * 设置「目标对象版本标识」值
     * @param val
     */
    BaselineIdeaDTO setTargetVersionId(String targetVersionId) {
        this.targetVersionId = targetVersionId
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    BaselineIdeaDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    BaselineIdeaDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「状态」值
     * @param val
     */
    BaselineIdeaDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    BaselineIdeaDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    BaselineIdeaDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    BaselineIdeaDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }


    /**
     * 设置「优先级」值
     * @param val
     */
    BaselineIdeaDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「产品」值
     * @param val
     */
    BaselineIdeaDTO setProductId(String productId) {
        this.productId = productId
        return this
    }


    /**
     * 设置「关联目标版本」值
     * @param val
     */
    BaselineIdeaDTO setTargetVersion(VersionDTO targetVersion) {
        this.targetVersion = targetVersion
        return this
    }


    /**
     * 设置「需求类型」值
     * 字典[需求类型]
     * @param val
     */
    BaselineIdeaDTO setIdeaType(String ideaType) {
        this.ideaType = ideaType
        return this
    }


    /**
     * 设置「需求来源」值
     * @param val
     */
    BaselineIdeaDTO setIdeaFrom(String ideaFrom) {
        this.ideaFrom = ideaFrom
        return this
    }


    /**
     * 设置「实际开始时间」值
     * @param val
     */
    BaselineIdeaDTO setRealAtFrom(Timestamp realAtFrom) {
        this.realAtFrom = realAtFrom
        return this
    }


    /**
     * 设置「进度」值
     * @param val
     */
    BaselineIdeaDTO setProgress(BigDecimal progress) {
        this.progress = progress
        return this
    }


    /**
     * 设置「计划时间周期单位」值
     * @param val
     */
    BaselineIdeaDTO setPlanAtGranularity(String planAtGranularity) {
        this.planAtGranularity = planAtGranularity
        return this
    }


    /**
     * 设置「计划时间」值
     * @param val
     */
    BaselineIdeaDTO setPlanAt(String planAt) {
        this.planAt = planAt
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    BaselineIdeaDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「实际时间」值
     * @param val
     */
    BaselineIdeaDTO setRealAt(String realAt) {
        this.realAt = realAt
        return this
    }


    /**
     * 设置「类别标识」值
     * @param val
     */
    BaselineIdeaDTO setCategoryId(String categoryId) {
        this.categoryId = categoryId
        return this
    }


    /**
     * 设置「实际结束时间」值
     * @param val
     */
    BaselineIdeaDTO setRealAtTo(Timestamp realAtTo) {
        this.realAtTo = realAtTo
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    BaselineIdeaDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「是否已删除」值
     * @param val
     */
    BaselineIdeaDTO setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「是否已归档」值
     * @param val
     */
    BaselineIdeaDTO setIsArchived(String isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「计划结束时间」值
     * @param val
     */
    BaselineIdeaDTO setPlanAtTo(Timestamp planAtTo) {
        this.planAtTo = planAtTo
        return this
    }


    /**
     * 设置「基线」值
     * @param val
     */
    BaselineIdeaDTO setBaseline(BaselineDTO baseline) {
        this.baseline = baseline
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    BaselineIdeaDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    BaselineIdeaDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    BaselineIdeaDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    BaselineIdeaDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    BaselineIdeaDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    BaselineIdeaDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
