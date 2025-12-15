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
class TicketAiInfoDTO extends GroovyDTO<TicketAiInfoDTO> {

    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「产品标识」
     */
    @JsonProperty("product_id")
    String productId
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「所属产品」
     */
    @JsonProperty("product_name")
    String productName
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「优先级」
     * 字典[工单优先级]
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
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
     * 「提交时间」
     */
    @JsonProperty("submitted_at")
    Timestamp submittedAt
    /**
     * 「预计时间」
     */
    @JsonProperty("estimated_at")
    String estimatedAt
    /**
     * 「标签」
     */
    @JsonProperty("tags")
    String tags
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier

    /**
     * 设置「标题」值
     * @param val
     */
    TicketAiInfoDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「产品标识」值
     * @param val
     */
    TicketAiInfoDTO setProductId(String productId) {
        this.productId = productId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    TicketAiInfoDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    TicketAiInfoDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「所属产品」值
     * @param val
     */
    TicketAiInfoDTO setProductName(String productName) {
        this.productName = productName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    TicketAiInfoDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[工单优先级]
     * @param val
     */
    TicketAiInfoDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    TicketAiInfoDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「状态」值
     * 字典[工单状态]
     * @param val
     */
    TicketAiInfoDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「类型」值
     * 字典[基础工单类型]
     * @param val
     */
    TicketAiInfoDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「提交时间」值
     * @param val
     */
    TicketAiInfoDTO setSubmittedAt(Timestamp submittedAt) {
        this.submittedAt = submittedAt
        return this
    }


    /**
     * 设置「预计时间」值
     * @param val
     */
    TicketAiInfoDTO setEstimatedAt(String estimatedAt) {
        this.estimatedAt = estimatedAt
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    TicketAiInfoDTO setTags(String tags) {
        this.tags = tags
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    TicketAiInfoDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }

}
