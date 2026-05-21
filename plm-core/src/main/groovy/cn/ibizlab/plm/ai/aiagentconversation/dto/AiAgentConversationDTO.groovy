package cn.ibizlab.plm.ai.aiagentconversation.dto

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
class AiAgentConversationDTO extends GroovyDTO<AiAgentConversationDTO> {

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
     * 「会话类型」
     * 字典[会话类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「置顶」
     * 字典[是否]
     */
    @JsonProperty("is_top")
    Integer isTop
    /**
     * 「智能体业务上下文标识」
     */
    @JsonProperty("ai_agent_context_id")
    String aiAgentContextId
    /**
     * 「序号」
     */
    @JsonProperty("sequence")
    BigInteger sequence
    /**
     * 「外部会话ID」
     */
    @JsonProperty("session_id")
    String sessionId
    /**
     * 「会话状态」
     * 字典[AI会话状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「会话标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「用户ID」
     */
    @JsonProperty("user_id")
    String userId

    /**
     * 设置「标识」值
     * @param val
     */
    AiAgentConversationDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiAgentConversationDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiAgentConversationDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AiAgentConversationDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiAgentConversationDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiAgentConversationDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「会话类型」值
     * 字典[会话类型]
     * @param val
     */
    AiAgentConversationDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「置顶」值
     * 字典[是否]
     * @param val
     */
    AiAgentConversationDTO setIsTop(Integer isTop) {
        this.isTop = isTop
        return this
    }


    /**
     * 设置「智能体业务上下文标识」值
     * @param val
     */
    AiAgentConversationDTO setAiAgentContextId(String aiAgentContextId) {
        this.aiAgentContextId = aiAgentContextId
        return this
    }


    /**
     * 设置「序号」值
     * @param val
     */
    AiAgentConversationDTO setSequence(BigInteger sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「外部会话ID」值
     * @param val
     */
    AiAgentConversationDTO setSessionId(String sessionId) {
        this.sessionId = sessionId
        return this
    }


    /**
     * 设置「会话状态」值
     * 字典[AI会话状态]
     * @param val
     */
    AiAgentConversationDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「会话标题」值
     * @param val
     */
    AiAgentConversationDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「用户ID」值
     * @param val
     */
    AiAgentConversationDTO setUserId(String userId) {
        this.userId = userId
        return this
    }

}
