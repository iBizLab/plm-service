package cn.ibizlab.plm.ai.aiagentfeedback.dto

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
class AiAgentFeedbackDTO extends GroovyDTO<AiAgentFeedbackDTO> {

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
     * 「创建人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「创建时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
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
     * 「反馈类型」
     * 字典[反馈类型]
     */
    @JsonProperty("feedback_type")
    String feedbackType
    /**
     * 「反馈内容」
     */
    @JsonProperty("feedback_content")
    String feedbackContent
    /**
     * 「用户标识」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「会话标识」
     */
    @JsonProperty("conversation_id")
    String conversationId
    /**
     * 「消息标识」
     */
    @JsonProperty("message_id")
    String messageId

    /**
     * 设置「标识」值
     * @param val
     */
    AiAgentFeedbackDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiAgentFeedbackDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiAgentFeedbackDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AiAgentFeedbackDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiAgentFeedbackDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiAgentFeedbackDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「反馈类型」值
     * 字典[反馈类型]
     * @param val
     */
    AiAgentFeedbackDTO setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType
        return this
    }


    /**
     * 设置「反馈内容」值
     * @param val
     */
    AiAgentFeedbackDTO setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent
        return this
    }


    /**
     * 设置「用户标识」值
     * @param val
     */
    AiAgentFeedbackDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「会话标识」值
     * @param val
     */
    AiAgentFeedbackDTO setConversationId(String conversationId) {
        this.conversationId = conversationId
        return this
    }


    /**
     * 设置「消息标识」值
     * @param val
     */
    AiAgentFeedbackDTO setMessageId(String messageId) {
        this.messageId = messageId
        return this
    }

}
