package cn.ibizlab.plm.prodmgmt.ticket.dto

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
class TicketDTO extends GroovyDTO<TicketDTO> {

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
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「产品标识」
     */
    @JsonProperty("product_id")
    String productId
    /**
     * 「所属产品」
     */
    @JsonProperty("product_name")
    String productName
    /**
     * 「客户标识」
     */
    @JsonProperty("customer_id")
    String customerId
    /**
     * 「客户」
     */
    @JsonProperty("customer_name")
    String customerName
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
     * 字典[工单状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「类型」
     * 字典[基础工单类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「解决方案」
     * 字典[工单解决方案]
     */
    @JsonProperty("solution")
    String solution
    /**
     * 「优先级」
     * 字典[工单优先级]
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「渠道」
     */
    @JsonProperty("channel")
    String channel
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「提交时间」
     */
    @JsonProperty("submitted_at")
    Timestamp submittedAt
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
     * 「预计时间」
     */
    @JsonProperty("estimated_at")
    String estimatedAt
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「标签」
     */
    @JsonProperty("tags")
    String tags
    /**
     * 「负责人标识」
     */
    @JsonProperty("assignee_id")
    String assigneeId
    /**
     * 「提交人标识」
     * 字典[云系统操作者]
     */
    @JsonProperty("submitter_id")
    String submitterId
    /**
     * 「提交人」
     */
    @JsonProperty("submitter_name")
    String submitterName
    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「产品标识」
     */
    @JsonProperty("product_identifier")
    String productIdentifier
    /**
     * 「关注」
     */
    @JsonProperty("attentions")
    List<AttentionDTO> attentions
    /**
     * 「工单数」
     */
    @JsonProperty("rep_num")
    String repNum
    /**
     * 「解决办法」
     */
    @JsonProperty("solution_way")
    String solutionWay
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
     * 设置「标识」值
     * @param val
     */
    TicketDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    TicketDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    TicketDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    TicketDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    TicketDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    TicketDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「产品标识」值
     * @param val
     */
    TicketDTO setProductId(String productId) {
        this.productId = productId
        return this
    }


    /**
     * 设置「所属产品」值
     * @param val
     */
    TicketDTO setProductName(String productName) {
        this.productName = productName
        return this
    }


    /**
     * 设置「客户标识」值
     * @param val
     */
    TicketDTO setCustomerId(String customerId) {
        this.customerId = customerId
        return this
    }


    /**
     * 设置「客户」值
     * @param val
     */
    TicketDTO setCustomerName(String customerName) {
        this.customerName = customerName
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    TicketDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    TicketDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「状态」值
     * 字典[工单状态]
     * @param val
     */
    TicketDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「类型」值
     * 字典[基础工单类型]
     * @param val
     */
    TicketDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「解决方案」值
     * 字典[工单解决方案]
     * @param val
     */
    TicketDTO setSolution(String solution) {
        this.solution = solution
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[工单优先级]
     * @param val
     */
    TicketDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「渠道」值
     * @param val
     */
    TicketDTO setChannel(String channel) {
        this.channel = channel
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    TicketDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「提交时间」值
     * @param val
     */
    TicketDTO setSubmittedAt(Timestamp submittedAt) {
        this.submittedAt = submittedAt
        return this
    }


    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    TicketDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    TicketDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「预计时间」值
     * @param val
     */
    TicketDTO setEstimatedAt(String estimatedAt) {
        this.estimatedAt = estimatedAt
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    TicketDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    TicketDTO setTags(String tags) {
        this.tags = tags
        return this
    }


    /**
     * 设置「负责人标识」值
     * @param val
     */
    TicketDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「提交人标识」值
     * 字典[云系统操作者]
     * @param val
     */
    TicketDTO setSubmitterId(String submitterId) {
        this.submitterId = submitterId
        return this
    }


    /**
     * 设置「提交人」值
     * @param val
     */
    TicketDTO setSubmitterName(String submitterName) {
        this.submitterName = submitterName
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    TicketDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    TicketDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「产品标识」值
     * @param val
     */
    TicketDTO setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier
        return this
    }


    /**
     * 设置「关注」值
     * @param val
     */
    TicketDTO setAttentions(List<AttentionDTO> attentions) {
        this.attentions = attentions
        return this
    }


    /**
     * 设置「工单数」值
     * @param val
     */
    TicketDTO setRepNum(String repNum) {
        this.repNum = repNum
        return this
    }


    /**
     * 设置「解决办法」值
     * @param val
     */
    TicketDTO setSolutionWay(String solutionWay) {
        this.solutionWay = solutionWay
        return this
    }


    /**
     * 设置「关注数」值
     * @param val
     */
    TicketDTO setAttentionCount(String attentionCount) {
        this.attentionCount = attentionCount
        return this
    }


    /**
     * 设置「评论数」值
     * @param val
     */
    TicketDTO setCommentCount(String commentCount) {
        this.commentCount = commentCount
        return this
    }


    /**
     * 设置「产品是否删除」值
     * 字典[是否]
     * @param val
     */
    TicketDTO setProductIsDeleted(Integer productIsDeleted) {
        this.productIsDeleted = productIsDeleted
        return this
    }


    /**
     * 设置「产品是否归档」值
     * 字典[是否]
     * @param val
     */
    TicketDTO setProductIsArchived(Integer productIsArchived) {
        this.productIsArchived = productIsArchived
        return this
    }


    /**
     * 设置「关注人」值
     * @param val
     */
    TicketDTO setAttentionsImp(String attentionsImp) {
        this.attentionsImp = attentionsImp
        return this
    }


    /**
     * 设置「最近创建日期」值
     * @param val
     */
    TicketDTO setRecentCreateDays(Integer recentCreateDays) {
        this.recentCreateDays = recentCreateDays
        return this
    }

}
