package cn.ibizlab.plm.prodmgmt.ticket.dto

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
class TicketBiSearchGroupDTO extends GroovyDTO<TicketBiSearchGroupDTO> {

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
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「提交时间」
     */
    @JsonProperty("submitted_at")
    Timestamp submittedAt
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「预计时间」
     */
    @JsonProperty("estimated_at")
    String estimatedAt
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「渠道」
     */
    @JsonProperty("channel")
    String channel
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
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「提交人」
     */
    @JsonProperty("submitter_name")
    String submitterName
    /**
     * 「关注人」
     */
    @JsonProperty("attentions_imp")
    String attentionsImp
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「客户」
     */
    @JsonProperty("customer_name")
    String customerName
    /**
     * 「客户标识」
     */
    @JsonProperty("customer_id")
    String customerId
    /**
     * 「产品标识」
     */
    @JsonProperty("product_id")
    String productId
    /**
     * 「负责人标识」
     */
    @JsonProperty("assignee_id")
    String assigneeId
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
     * 「状态」
     * 字典[工单状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「所属产品」
     */
    @JsonProperty("product_name")
    String productName
    /**
     * 「提交人标识」
     * 字典[云系统操作者]
     */
    @JsonProperty("submitter_id")
    String submitterId
    /**
     * 「标签」
     */
    @JsonProperty("tags")
    String tags
    /**
     * 「产品是否删除」
     * 字典[是否]
     */
    @JsonProperty("product_is_deleted")
    Integer productIsDeleted

    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    TicketBiSearchGroupDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    TicketBiSearchGroupDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    TicketBiSearchGroupDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「提交时间」值
     * @param val
     */
    TicketBiSearchGroupDTO setSubmittedAt(Timestamp submittedAt) {
        this.submittedAt = submittedAt
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    TicketBiSearchGroupDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    TicketBiSearchGroupDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「预计时间」值
     * @param val
     */
    TicketBiSearchGroupDTO setEstimatedAt(String estimatedAt) {
        this.estimatedAt = estimatedAt
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    TicketBiSearchGroupDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「渠道」值
     * @param val
     */
    TicketBiSearchGroupDTO setChannel(String channel) {
        this.channel = channel
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    TicketBiSearchGroupDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    TicketBiSearchGroupDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    TicketBiSearchGroupDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「提交人」值
     * @param val
     */
    TicketBiSearchGroupDTO setSubmitterName(String submitterName) {
        this.submitterName = submitterName
        return this
    }


    /**
     * 设置「关注人」值
     * @param val
     */
    TicketBiSearchGroupDTO setAttentionsImp(String attentionsImp) {
        this.attentionsImp = attentionsImp
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    TicketBiSearchGroupDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「客户」值
     * @param val
     */
    TicketBiSearchGroupDTO setCustomerName(String customerName) {
        this.customerName = customerName
        return this
    }


    /**
     * 设置「客户标识」值
     * @param val
     */
    TicketBiSearchGroupDTO setCustomerId(String customerId) {
        this.customerId = customerId
        return this
    }


    /**
     * 设置「产品标识」值
     * @param val
     */
    TicketBiSearchGroupDTO setProductId(String productId) {
        this.productId = productId
        return this
    }


    /**
     * 设置「负责人标识」值
     * @param val
     */
    TicketBiSearchGroupDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「类型」值
     * 字典[基础工单类型]
     * @param val
     */
    TicketBiSearchGroupDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「解决方案」值
     * 字典[工单解决方案]
     * @param val
     */
    TicketBiSearchGroupDTO setSolution(String solution) {
        this.solution = solution
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[工单优先级]
     * @param val
     */
    TicketBiSearchGroupDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「状态」值
     * 字典[工单状态]
     * @param val
     */
    TicketBiSearchGroupDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    TicketBiSearchGroupDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「所属产品」值
     * @param val
     */
    TicketBiSearchGroupDTO setProductName(String productName) {
        this.productName = productName
        return this
    }


    /**
     * 设置「提交人标识」值
     * 字典[云系统操作者]
     * @param val
     */
    TicketBiSearchGroupDTO setSubmitterId(String submitterId) {
        this.submitterId = submitterId
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    TicketBiSearchGroupDTO setTags(String tags) {
        this.tags = tags
        return this
    }


    /**
     * 设置「产品是否删除」值
     * 字典[是否]
     * @param val
     */
    TicketBiSearchGroupDTO setProductIsDeleted(Integer productIsDeleted) {
        this.productIsDeleted = productIsDeleted
        return this
    }

}
