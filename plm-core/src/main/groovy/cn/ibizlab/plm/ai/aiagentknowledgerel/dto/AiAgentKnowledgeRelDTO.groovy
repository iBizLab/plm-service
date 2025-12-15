package cn.ibizlab.plm.ai.aiagentknowledgerel.dto

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
class AiAgentKnowledgeRelDTO extends GroovyDTO<AiAgentKnowledgeRelDTO> {

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
     * 「智能体标识」
     */
    @JsonProperty("ai_agent_id")
    String aiAgentId
    /**
     * 「智能体名称」
     */
    @JsonProperty("ai_agent_name")
    String aiAgentName
    /**
     * 「知识库标识」
     */
    @JsonProperty("ai_knowledge_base_id")
    String aiKnowledgeBaseId
    /**
     * 「知识库名称」
     */
    @JsonProperty("ai_knowledge_base_name")
    String aiKnowledgeBaseName

    /**
     * 设置「标识」值
     * @param val
     */
    AiAgentKnowledgeRelDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiAgentKnowledgeRelDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiAgentKnowledgeRelDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AiAgentKnowledgeRelDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiAgentKnowledgeRelDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiAgentKnowledgeRelDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「智能体标识」值
     * @param val
     */
    AiAgentKnowledgeRelDTO setAiAgentId(String aiAgentId) {
        this.aiAgentId = aiAgentId
        return this
    }


    /**
     * 设置「智能体名称」值
     * @param val
     */
    AiAgentKnowledgeRelDTO setAiAgentName(String aiAgentName) {
        this.aiAgentName = aiAgentName
        return this
    }


    /**
     * 设置「知识库标识」值
     * @param val
     */
    AiAgentKnowledgeRelDTO setAiKnowledgeBaseId(String aiKnowledgeBaseId) {
        this.aiKnowledgeBaseId = aiKnowledgeBaseId
        return this
    }


    /**
     * 设置「知识库名称」值
     * @param val
     */
    AiAgentKnowledgeRelDTO setAiKnowledgeBaseName(String aiKnowledgeBaseName) {
        this.aiKnowledgeBaseName = aiKnowledgeBaseName
        return this
    }

}
