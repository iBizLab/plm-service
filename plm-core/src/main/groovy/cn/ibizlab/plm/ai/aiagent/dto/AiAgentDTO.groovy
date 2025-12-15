package cn.ibizlab.plm.ai.aiagent.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.ai.aiagentknowledgerel.dto.AiAgentKnowledgeRelDTO
import cn.ibizlab.plm.ai.aiagenttoolrel.dto.AiAgentToolRelDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class AiAgentDTO extends GroovyDTO<AiAgentDTO> {

    /**
     * 「智能体标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「智能体名称」
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
     * 「生成模式」
     * 字典[AI生成模式]
     */
    @JsonProperty("generation_mode")
    String generationMode
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「模型标识」
     */
    @JsonProperty("ai_model_id")
    String aiModelId
    /**
     * 「模型名称」
     */
    @JsonProperty("ai_model_name")
    String aiModelName
    /**
     * 「代码标识」
     */
    @JsonProperty("code_name")
    String codeName
    /**
     * 「自定义建议提示词」
     */
    @JsonProperty("custom_suggestion_prompt")
    String customSuggestionPrompt
    /**
     * 「默认系统提示词」
     */
    @JsonProperty("default_system_prompt")
    String defaultSystemPrompt
    /**
     * 「启用问题建议」
     */
    @JsonProperty("enable_suggested_questions")
    Integer enableSuggestedQuestions
    /**
     * 「启用思考链」
     */
    @JsonProperty("enable_thinking")
    Integer enableThinking
    /**
     * 「调用工具」
     */
    @JsonProperty("enable_tools")
    Integer enableTools
    /**
     * 「是否默认Agent」
     * 字典[是否]
     */
    @JsonProperty("is_default")
    Integer isDefault
    /**
     * 「最大输入token数」
     */
    @JsonProperty("max_input_tokens")
    Integer maxInputTokens
    /**
     * 「记忆对话轮数」
     */
    @JsonProperty("memory_max_turns")
    Integer memoryMaxTurns
    /**
     * 「记忆模式」
     * 字典[记忆模式]
     */
    @JsonProperty("memory_mode")
    String memoryMode
    /**
     * 「排序」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「流式输出」
     */
    @JsonProperty("stream")
    Integer stream
    /**
     * 「预置建议问题」
     */
    @JsonProperty("suggested_questions")
    List<String> suggestedQuestions
    /**
     * 「模型随机性参数」
     */
    @JsonProperty("temperature")
    BigDecimal temperature
    /**
     * 「工具调用超限提示语」
     */
    @JsonProperty("tool_exceed_message")
    String toolExceedMessage
    /**
     * 「最大工具调用次数」
     */
    @JsonProperty("tool_max_calls")
    Integer toolMaxCalls
    /**
     * 「概率核采样」
     */
    @JsonProperty("top_p")
    BigDecimal topP
    /**
     * 「截断策略」
     * 字典[截断策略]
     */
    @JsonProperty("trimming_strategy")
    String trimmingStrategy
    /**
     * 「欢迎消息模板」
     */
    @JsonProperty("welcome_message")
    String welcomeMessage
    /**
     * 「null」
     */
    @JsonProperty("ai_agent_knowledge_rels")
    List<AiAgentKnowledgeRelDTO> aiAgentKnowledgeRels
    /**
     * 「null」
     */
    @JsonProperty("ai_agent_tool_rels")
    List<AiAgentToolRelDTO> aiAgentToolRels

    /**
     * 设置「智能体标识」值
     * @param val
     */
    AiAgentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「智能体名称」值
     * @param val
     */
    AiAgentDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiAgentDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AiAgentDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiAgentDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiAgentDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「生成模式」值
     * 字典[AI生成模式]
     * @param val
     */
    AiAgentDTO setGenerationMode(String generationMode) {
        this.generationMode = generationMode
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    AiAgentDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「模型标识」值
     * @param val
     */
    AiAgentDTO setAiModelId(String aiModelId) {
        this.aiModelId = aiModelId
        return this
    }


    /**
     * 设置「模型名称」值
     * @param val
     */
    AiAgentDTO setAiModelName(String aiModelName) {
        this.aiModelName = aiModelName
        return this
    }


    /**
     * 设置「代码标识」值
     * @param val
     */
    AiAgentDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }


    /**
     * 设置「自定义建议提示词」值
     * @param val
     */
    AiAgentDTO setCustomSuggestionPrompt(String customSuggestionPrompt) {
        this.customSuggestionPrompt = customSuggestionPrompt
        return this
    }


    /**
     * 设置「默认系统提示词」值
     * @param val
     */
    AiAgentDTO setDefaultSystemPrompt(String defaultSystemPrompt) {
        this.defaultSystemPrompt = defaultSystemPrompt
        return this
    }


    /**
     * 设置「启用问题建议」值
     * @param val
     */
    AiAgentDTO setEnableSuggestedQuestions(Integer enableSuggestedQuestions) {
        this.enableSuggestedQuestions = enableSuggestedQuestions
        return this
    }


    /**
     * 设置「启用思考链」值
     * @param val
     */
    AiAgentDTO setEnableThinking(Integer enableThinking) {
        this.enableThinking = enableThinking
        return this
    }


    /**
     * 设置「调用工具」值
     * @param val
     */
    AiAgentDTO setEnableTools(Integer enableTools) {
        this.enableTools = enableTools
        return this
    }


    /**
     * 设置「是否默认Agent」值
     * 字典[是否]
     * @param val
     */
    AiAgentDTO setIsDefault(Integer isDefault) {
        this.isDefault = isDefault
        return this
    }


    /**
     * 设置「最大输入token数」值
     * @param val
     */
    AiAgentDTO setMaxInputTokens(Integer maxInputTokens) {
        this.maxInputTokens = maxInputTokens
        return this
    }


    /**
     * 设置「记忆对话轮数」值
     * @param val
     */
    AiAgentDTO setMemoryMaxTurns(Integer memoryMaxTurns) {
        this.memoryMaxTurns = memoryMaxTurns
        return this
    }


    /**
     * 设置「记忆模式」值
     * 字典[记忆模式]
     * @param val
     */
    AiAgentDTO setMemoryMode(String memoryMode) {
        this.memoryMode = memoryMode
        return this
    }


    /**
     * 设置「排序」值
     * @param val
     */
    AiAgentDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「流式输出」值
     * @param val
     */
    AiAgentDTO setStream(Integer stream) {
        this.stream = stream
        return this
    }


    /**
     * 设置「预置建议问题」值
     * @param val
     */
    AiAgentDTO setSuggestedQuestions(List<String> suggestedQuestions) {
        this.suggestedQuestions = suggestedQuestions
        return this
    }


    /**
     * 设置「模型随机性参数」值
     * @param val
     */
    AiAgentDTO setTemperature(BigDecimal temperature) {
        this.temperature = temperature
        return this
    }


    /**
     * 设置「工具调用超限提示语」值
     * @param val
     */
    AiAgentDTO setToolExceedMessage(String toolExceedMessage) {
        this.toolExceedMessage = toolExceedMessage
        return this
    }


    /**
     * 设置「最大工具调用次数」值
     * @param val
     */
    AiAgentDTO setToolMaxCalls(Integer toolMaxCalls) {
        this.toolMaxCalls = toolMaxCalls
        return this
    }


    /**
     * 设置「概率核采样」值
     * @param val
     */
    AiAgentDTO setTopP(BigDecimal topP) {
        this.topP = topP
        return this
    }


    /**
     * 设置「截断策略」值
     * 字典[截断策略]
     * @param val
     */
    AiAgentDTO setTrimmingStrategy(String trimmingStrategy) {
        this.trimmingStrategy = trimmingStrategy
        return this
    }


    /**
     * 设置「欢迎消息模板」值
     * @param val
     */
    AiAgentDTO setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    AiAgentDTO setAiAgentKnowledgeRels(List<AiAgentKnowledgeRelDTO> aiAgentKnowledgeRels) {
        this.aiAgentKnowledgeRels = aiAgentKnowledgeRels
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    AiAgentDTO setAiAgentToolRels(List<AiAgentToolRelDTO> aiAgentToolRels) {
        this.aiAgentToolRels = aiAgentToolRels
        return this
    }

}
