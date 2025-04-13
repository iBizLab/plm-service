package cn.ibizlab.plm.prodmgmt.idea.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.attachment.dto.AttachmentDTO
import cn.ibizlab.plm.base.attention.dto.AttentionDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class IdeaDTO extends GroovyDTO<IdeaDTO> {

    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「状态」
     * 字典[需求状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「优先级」
     * 字典[需求优先级]
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「模块」
     */
    @JsonProperty("suite")
    String suite
    /**
     * 「计划时间」
     */
    @JsonProperty("plan_at")
    String planAt
    /**
     * 「计划开始时间」
     */
    @JsonProperty("plan_at_from")
    Timestamp planAtFrom
    /**
     * 「计划结束时间」
     */
    @JsonProperty("plan_at_to")
    Timestamp planAtTo
    /**
     * 「计划时间周期单位」
     */
    @JsonProperty("plan_at_granularity")
    String planAtGranularity
    /**
     * 「实际时间」
     */
    @JsonProperty("real_at")
    String realAt
    /**
     * 「实际开始时间」
     */
    @JsonProperty("real_at_from")
    Timestamp realAtFrom
    /**
     * 「实际结束时间」
     */
    @JsonProperty("real_at_to")
    Timestamp realAtTo
    /**
     * 「计划时间周期单位」
     */
    @JsonProperty("real_at_granularity")
    String realAtGranularity
    /**
     * 「进度」
     */
    @JsonProperty("progress")
    BigDecimal progress
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
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「产品标识」
     */
    @JsonProperty("product_identifier")
    String productIdentifier
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_id")
    String assigneeId
    /**
     * 「当前版本标识」
     */
    @JsonProperty("cur_version_id")
    String curVersionId
    /**
     * 「子产品名称」
     */
    @JsonProperty("section_name")
    String sectionName
    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
    /**
     * 「子产品标识」
     * 字典[需求子产品2]
     */
    @JsonProperty("section_id")
    String sectionId
    /**
     * 「关注」
     * 字典[云系统操作者]
     */
    @JsonProperty("attentions")
    List<AttentionDTO> attentions
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「类别路径」
     */
    @JsonProperty("categories")
    String categories
    /**
     * 「需求来源」
     * 字典[需求来源]
     */
    @JsonProperty("idea_from")
    String ideaFrom
    /**
     * 「需求类型」
     * 字典[需求类型]
     */
    @JsonProperty("idea_type")
    String ideaType
    /**
     * 「关联产品需求数」
     */
    @JsonProperty("relation_total_idea")
    BigDecimal relationTotalIdea
    /**
     * 「关联工单数」
     */
    @JsonProperty("relation_total_ticket")
    BigDecimal relationTotalTicket
    /**
     * 「工时进度」
     */
    @JsonProperty("workload_schedule")
    BigDecimal workloadSchedule
    /**
     * 「预估工时」
     */
    @JsonProperty("estimated_workload")
    BigDecimal estimatedWorkload
    /**
     * 「关联工作项数」
     */
    @JsonProperty("relation_total_work_item")
    BigDecimal relationTotalWorkItem
    /**
     * 「关联测试用例数」
     */
    @JsonProperty("relation_total_test_case")
    BigDecimal relationTotalTestCase
    /**
     * 「剩余工时」
     */
    @JsonProperty("remaining_workload")
    BigDecimal remainingWorkload
    /**
     * 「关联客户数」
     */
    @JsonProperty("relation_total_customer")
    BigDecimal relationTotalCustomer
    /**
     * 「实际工时」
     */
    @JsonProperty("actual_workload")
    BigDecimal actualWorkload
    /**
     * 「关注数」
     */
    @JsonProperty("attention_count")
    String attentionCount
    /**
     * 「评论数」
     */
    @JsonProperty("comment_count")
    String commentCount
    /**
     * 「产品是否删除」
     * 字典[是否]
     */
    @JsonProperty("product_is_deleted")
    Integer productIsDeleted
    /**
     * 「产品是否归档」
     * 字典[是否]
     */
    @JsonProperty("product_is_archived")
    Integer productIsArchived
    /**
     * 「当前版本名称」
     */
    @JsonProperty("cur_version_name")
    String curVersionName
    /**
     * 「选择版本标识」
     */
    @JsonProperty("choose_version_id")
    String chooseVersionId
    /**
     * 「选择版本名称」
     */
    @JsonProperty("choose_version_name")
    String chooseVersionName
    /**
     * 「关注人」
     */
    @JsonProperty("attentions_imp")
    String attentionsImp
    /**
     * 「最近创建日期」
     */
    @JsonProperty("recent_create_days")
    Integer recentCreateDays
    /**
     * 「序号」
     */
    @JsonProperty("sequence")
    BigDecimal sequence
    /**
     * 「类别标识」
     */
    @JsonProperty("category_id")
    String categoryId
    /**
     * 「名称」
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
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「产品」
     */
    @JsonProperty("product_id")
    String productId
    /**
     * 「所属产品」
     */
    @JsonProperty("product_name")
    String productName
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
     * 设置「编号」值
     * @param val
     */
    IdeaDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    IdeaDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「状态」值
     * 字典[需求状态]
     * @param val
     */
    IdeaDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[需求优先级]
     * @param val
     */
    IdeaDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「模块」值
     * @param val
     */
    IdeaDTO setSuite(String suite) {
        this.suite = suite
        return this
    }


    /**
     * 设置「计划时间」值
     * @param val
     */
    IdeaDTO setPlanAt(String planAt) {
        this.planAt = planAt
        return this
    }


    /**
     * 设置「计划开始时间」值
     * @param val
     */
    IdeaDTO setPlanAtFrom(Timestamp planAtFrom) {
        this.planAtFrom = planAtFrom
        return this
    }


    /**
     * 设置「计划结束时间」值
     * @param val
     */
    IdeaDTO setPlanAtTo(Timestamp planAtTo) {
        this.planAtTo = planAtTo
        return this
    }


    /**
     * 设置「计划时间周期单位」值
     * @param val
     */
    IdeaDTO setPlanAtGranularity(String planAtGranularity) {
        this.planAtGranularity = planAtGranularity
        return this
    }


    /**
     * 设置「实际时间」值
     * @param val
     */
    IdeaDTO setRealAt(String realAt) {
        this.realAt = realAt
        return this
    }


    /**
     * 设置「实际开始时间」值
     * @param val
     */
    IdeaDTO setRealAtFrom(Timestamp realAtFrom) {
        this.realAtFrom = realAtFrom
        return this
    }


    /**
     * 设置「实际结束时间」值
     * @param val
     */
    IdeaDTO setRealAtTo(Timestamp realAtTo) {
        this.realAtTo = realAtTo
        return this
    }


    /**
     * 设置「计划时间周期单位」值
     * @param val
     */
    IdeaDTO setRealAtGranularity(String realAtGranularity) {
        this.realAtGranularity = realAtGranularity
        return this
    }


    /**
     * 设置「进度」值
     * @param val
     */
    IdeaDTO setProgress(BigDecimal progress) {
        this.progress = progress
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    IdeaDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    IdeaDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    IdeaDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    IdeaDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「产品标识」值
     * @param val
     */
    IdeaDTO setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    IdeaDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    IdeaDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }


    /**
     * 设置「子产品名称」值
     * @param val
     */
    IdeaDTO setSectionName(String sectionName) {
        this.sectionName = sectionName
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    IdeaDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「子产品标识」值
     * 字典[需求子产品2]
     * @param val
     */
    IdeaDTO setSectionId(String sectionId) {
        this.sectionId = sectionId
        return this
    }


    /**
     * 设置「关注」值
     * 字典[云系统操作者]
     * @param val
     */
    IdeaDTO setAttentions(List<AttentionDTO> attentions) {
        this.attentions = attentions
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    IdeaDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「类别路径」值
     * @param val
     */
    IdeaDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「需求来源」值
     * 字典[需求来源]
     * @param val
     */
    IdeaDTO setIdeaFrom(String ideaFrom) {
        this.ideaFrom = ideaFrom
        return this
    }


    /**
     * 设置「需求类型」值
     * 字典[需求类型]
     * @param val
     */
    IdeaDTO setIdeaType(String ideaType) {
        this.ideaType = ideaType
        return this
    }


    /**
     * 设置「关联产品需求数」值
     * @param val
     */
    IdeaDTO setRelationTotalIdea(BigDecimal relationTotalIdea) {
        this.relationTotalIdea = relationTotalIdea
        return this
    }


    /**
     * 设置「关联工单数」值
     * @param val
     */
    IdeaDTO setRelationTotalTicket(BigDecimal relationTotalTicket) {
        this.relationTotalTicket = relationTotalTicket
        return this
    }


    /**
     * 设置「工时进度」值
     * @param val
     */
    IdeaDTO setWorkloadSchedule(BigDecimal workloadSchedule) {
        this.workloadSchedule = workloadSchedule
        return this
    }


    /**
     * 设置「预估工时」值
     * @param val
     */
    IdeaDTO setEstimatedWorkload(BigDecimal estimatedWorkload) {
        this.estimatedWorkload = estimatedWorkload
        return this
    }


    /**
     * 设置「关联工作项数」值
     * @param val
     */
    IdeaDTO setRelationTotalWorkItem(BigDecimal relationTotalWorkItem) {
        this.relationTotalWorkItem = relationTotalWorkItem
        return this
    }


    /**
     * 设置「关联测试用例数」值
     * @param val
     */
    IdeaDTO setRelationTotalTestCase(BigDecimal relationTotalTestCase) {
        this.relationTotalTestCase = relationTotalTestCase
        return this
    }


    /**
     * 设置「剩余工时」值
     * @param val
     */
    IdeaDTO setRemainingWorkload(BigDecimal remainingWorkload) {
        this.remainingWorkload = remainingWorkload
        return this
    }


    /**
     * 设置「关联客户数」值
     * @param val
     */
    IdeaDTO setRelationTotalCustomer(BigDecimal relationTotalCustomer) {
        this.relationTotalCustomer = relationTotalCustomer
        return this
    }


    /**
     * 设置「实际工时」值
     * @param val
     */
    IdeaDTO setActualWorkload(BigDecimal actualWorkload) {
        this.actualWorkload = actualWorkload
        return this
    }


    /**
     * 设置「关注数」值
     * @param val
     */
    IdeaDTO setAttentionCount(String attentionCount) {
        this.attentionCount = attentionCount
        return this
    }


    /**
     * 设置「评论数」值
     * @param val
     */
    IdeaDTO setCommentCount(String commentCount) {
        this.commentCount = commentCount
        return this
    }


    /**
     * 设置「产品是否删除」值
     * 字典[是否]
     * @param val
     */
    IdeaDTO setProductIsDeleted(Integer productIsDeleted) {
        this.productIsDeleted = productIsDeleted
        return this
    }


    /**
     * 设置「产品是否归档」值
     * 字典[是否]
     * @param val
     */
    IdeaDTO setProductIsArchived(Integer productIsArchived) {
        this.productIsArchived = productIsArchived
        return this
    }


    /**
     * 设置「当前版本名称」值
     * @param val
     */
    IdeaDTO setCurVersionName(String curVersionName) {
        this.curVersionName = curVersionName
        return this
    }


    /**
     * 设置「选择版本标识」值
     * @param val
     */
    IdeaDTO setChooseVersionId(String chooseVersionId) {
        this.chooseVersionId = chooseVersionId
        return this
    }


    /**
     * 设置「选择版本名称」值
     * @param val
     */
    IdeaDTO setChooseVersionName(String chooseVersionName) {
        this.chooseVersionName = chooseVersionName
        return this
    }


    /**
     * 设置「关注人」值
     * @param val
     */
    IdeaDTO setAttentionsImp(String attentionsImp) {
        this.attentionsImp = attentionsImp
        return this
    }


    /**
     * 设置「最近创建日期」值
     * @param val
     */
    IdeaDTO setRecentCreateDays(Integer recentCreateDays) {
        this.recentCreateDays = recentCreateDays
        return this
    }


    /**
     * 设置「序号」值
     * @param val
     */
    IdeaDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「类别标识」值
     * @param val
     */
    IdeaDTO setCategoryId(String categoryId) {
        this.categoryId = categoryId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IdeaDTO setCategoryName(String categoryName) {
        this.categoryName = categoryName
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    IdeaDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    IdeaDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IdeaDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IdeaDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「产品」值
     * @param val
     */
    IdeaDTO setProductId(String productId) {
        this.productId = productId
        return this
    }


    /**
     * 设置「所属产品」值
     * @param val
     */
    IdeaDTO setProductName(String productName) {
        this.productName = productName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    IdeaDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IdeaDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
