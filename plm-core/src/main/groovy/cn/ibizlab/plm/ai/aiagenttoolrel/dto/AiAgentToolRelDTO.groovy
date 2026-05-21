package cn.ibizlab.plm.ai.aiagenttoolrel.dto

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
class AiAgentToolRelDTO extends GroovyDTO<AiAgentToolRelDTO> {

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
     * 「工具标识」
     */
    @JsonProperty("tool_tag")
    String toolTag
    /**
     * 「工具类型」
     * 字典[Tool类型]
     */
    @JsonProperty("tool_type")
    String toolType
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
     * 「AI调用工具标识」
     */
    @JsonProperty("ai_tool_id")
    String aiToolId
    /**
     * 「AI调用工具名称」
     */
    @JsonProperty("ai_tool_name")
    String aiToolName

    /**
     * 设置「标识」值
     * @param val
     */
    AiAgentToolRelDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiAgentToolRelDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiAgentToolRelDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AiAgentToolRelDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiAgentToolRelDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiAgentToolRelDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「工具标识」值
     * @param val
     */
    AiAgentToolRelDTO setToolTag(String toolTag) {
        this.toolTag = toolTag
        return this
    }


    /**
     * 设置「工具类型」值
     * 字典[Tool类型]
     * @param val
     */
    AiAgentToolRelDTO setToolType(String toolType) {
        this.toolType = toolType
        return this
    }


    /**
     * 设置「智能体标识」值
     * @param val
     */
    AiAgentToolRelDTO setAiAgentId(String aiAgentId) {
        this.aiAgentId = aiAgentId
        return this
    }


    /**
     * 设置「智能体名称」值
     * @param val
     */
    AiAgentToolRelDTO setAiAgentName(String aiAgentName) {
        this.aiAgentName = aiAgentName
        return this
    }


    /**
     * 设置「AI调用工具标识」值
     * @param val
     */
    AiAgentToolRelDTO setAiToolId(String aiToolId) {
        this.aiToolId = aiToolId
        return this
    }


    /**
     * 设置「AI调用工具名称」值
     * @param val
     */
    AiAgentToolRelDTO setAiToolName(String aiToolName) {
        this.aiToolName = aiToolName
        return this
    }

}
