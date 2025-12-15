package cn.ibizlab.plm.ai.aiagentmessage.dto

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
class AiAgentMessageDTO extends GroovyDTO<AiAgentMessageDTO> {

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
     * 「反馈内容」
     */
    @JsonProperty("feedback_content")
    String feedbackContent
    /**
     * 「是否点踩」
     * 字典[是否]
     */
    @JsonProperty("is_dislike")
    String isDislike
    /**
     * 「是否点赞」
     * 字典[是否]
     */
    @JsonProperty("is_like")
    String isLike
    /**
     * 「引用资料」
     */
    @JsonProperty("resources")
    List<IEntity> resources
    /**
     * 「会话标题」
     */
    @JsonProperty("conversation_title")
    String conversationTitle
    /**
     * 「消息状态」
     * 字典[AI消息状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「消息内容」
     */
    @JsonProperty("content")
    String content
    /**
     * 「内容类型」
     */
    @JsonProperty("content_type")
    String contentType
    /**
     * 「会话标识」
     */
    @JsonProperty("conversation_id")
    String conversationId
    /**
     * 「会话名称」
     */
    @JsonProperty("conversation_name")
    String conversationName
    /**
     * 「输入token数」
     */
    @JsonProperty("input_tokens")
    Integer inputTokens
    /**
     * 「消息元数据」
     */
    @JsonProperty("metadata")
    String metadata
    /**
     * 「发送者类型」
     * 字典[消息发送方类型]
     */
    @JsonProperty("sender_type")
    String senderType
    /**
     * 「消息序号」
     */
    @JsonProperty("sequence")
    BigInteger sequence
    /**
     * 「输出token数」
     */
    @JsonProperty("output_tokens")
    Integer outputTokens
    /**
     * 「总token数」
     */
    @JsonProperty("total_tokens")
    Integer totalTokens
    /**
     * 「处理耗时」
     */
    @JsonProperty("latency_ms")
    Integer latencyMs

    /**
     * 设置「标识」值
     * @param val
     */
    AiAgentMessageDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiAgentMessageDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiAgentMessageDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AiAgentMessageDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiAgentMessageDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiAgentMessageDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「反馈内容」值
     * @param val
     */
    AiAgentMessageDTO setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent
        return this
    }


    /**
     * 设置「是否点踩」值
     * 字典[是否]
     * @param val
     */
    AiAgentMessageDTO setIsDislike(String isDislike) {
        this.isDislike = isDislike
        return this
    }


    /**
     * 设置「是否点赞」值
     * 字典[是否]
     * @param val
     */
    AiAgentMessageDTO setIsLike(String isLike) {
        this.isLike = isLike
        return this
    }


    /**
     * 设置「引用资料」值
     * @param val
     */
    AiAgentMessageDTO setResources(List<IEntity> resources) {
        this.resources = resources
        return this
    }


    /**
     * 设置「会话标题」值
     * @param val
     */
    AiAgentMessageDTO setConversationTitle(String conversationTitle) {
        this.conversationTitle = conversationTitle
        return this
    }


    /**
     * 设置「消息状态」值
     * 字典[AI消息状态]
     * @param val
     */
    AiAgentMessageDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「消息内容」值
     * @param val
     */
    AiAgentMessageDTO setContent(String content) {
        this.content = content
        return this
    }


    /**
     * 设置「内容类型」值
     * @param val
     */
    AiAgentMessageDTO setContentType(String contentType) {
        this.contentType = contentType
        return this
    }


    /**
     * 设置「会话标识」值
     * @param val
     */
    AiAgentMessageDTO setConversationId(String conversationId) {
        this.conversationId = conversationId
        return this
    }


    /**
     * 设置「会话名称」值
     * @param val
     */
    AiAgentMessageDTO setConversationName(String conversationName) {
        this.conversationName = conversationName
        return this
    }


    /**
     * 设置「输入token数」值
     * @param val
     */
    AiAgentMessageDTO setInputTokens(Integer inputTokens) {
        this.inputTokens = inputTokens
        return this
    }


    /**
     * 设置「消息元数据」值
     * @param val
     */
    AiAgentMessageDTO setMetadata(String metadata) {
        this.metadata = metadata
        return this
    }


    /**
     * 设置「发送者类型」值
     * 字典[消息发送方类型]
     * @param val
     */
    AiAgentMessageDTO setSenderType(String senderType) {
        this.senderType = senderType
        return this
    }


    /**
     * 设置「消息序号」值
     * @param val
     */
    AiAgentMessageDTO setSequence(BigInteger sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「输出token数」值
     * @param val
     */
    AiAgentMessageDTO setOutputTokens(Integer outputTokens) {
        this.outputTokens = outputTokens
        return this
    }


    /**
     * 设置「总token数」值
     * @param val
     */
    AiAgentMessageDTO setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens
        return this
    }


    /**
     * 设置「处理耗时」值
     * @param val
     */
    AiAgentMessageDTO setLatencyMs(Integer latencyMs) {
        this.latencyMs = latencyMs
        return this
    }

}
