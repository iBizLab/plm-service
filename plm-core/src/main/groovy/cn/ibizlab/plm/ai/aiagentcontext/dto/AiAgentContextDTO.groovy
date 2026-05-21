package cn.ibizlab.plm.ai.aiagentcontext.dto

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
class AiAgentContextDTO extends GroovyDTO<AiAgentContextDTO> {

    /**
     * 「智能体业务上下文标识」
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
     * 「系统标记」
     * 字典[是否]
     */
    @JsonProperty("system_flag")
    Integer systemFlag
    /**
     * 「生成模式」
     * 字典[AI生成模式]
     */
    @JsonProperty("generation_mode")
    String generationMode
    /**
     * 「智能体工作流模式」
     * 字典[智能体工作流模式]
     */
    @JsonProperty("flow_mode")
    String flowMode
    /**
     * 「调试数据」
     */
    @JsonProperty("context_debug_data")
    String contextDebugData
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「业务范围」
     * 字典[智能体业务范围]
     */
    @JsonProperty("scopes")
    String scopes
    /**
     * 「知识库标识集合」
     */
    @JsonProperty("kb_tags")
    String kbTags
    /**
     * 「mcp服务标识集合」
     */
    @JsonProperty("mcp_server_tags")
    String mcpServerTags
    /**
     * 「召回相似度阈值」
     */
    @JsonProperty("similarity_threshold")
    BigDecimal similarityThreshold
    /**
     * 「向量相似度权重」
     */
    @JsonProperty("vector_similarity_weight")
    BigDecimal vectorSimilarityWeight
    /**
     * 「最大召回数量」
     */
    @JsonProperty("top_k")
    Integer topK
    /**
     * 「召回重排」
     * 字典[是否]
     */
    @JsonProperty("rerank")
    Integer rerank
    /**
     * 「召回重排模型」
     */
    @JsonProperty("rerank_model")
    String rerankModel
    /**
     * 「使用知识图谱」
     * 字典[是否]
     */
    @JsonProperty("use_kg")
    Integer useKg
    /**
     * 「知识库模式」
     * 字典[智能体知识库模式]
     */
    @JsonProperty("kb_mode")
    String kbMode
    /**
     * 「视觉识别提示词」
     */
    @JsonProperty("vlm_prompt")
    String vlmPrompt
    /**
     * 「发布技能」
     * 字典[是否]
     */
    @JsonProperty("publish_skill")
    Integer publishSkill
    /**
     * 「技能提示词」
     */
    @JsonProperty("skill_prompt")
    String skillPrompt
    /**
     * 「支持联网搜索」
     * 字典[是否]
     */
    @JsonProperty("enable_searching")
    Integer enableSearching
    /**
     * 「记忆存储知识库标记」
     */
    @JsonProperty("memory_kb_tag")
    String memoryKbTag
    /**
     * 「记忆存储文档标记」
     */
    @JsonProperty("memory_doc_tag")
    String memoryDocTag
    /**
     * 「规格库」
     */
    @JsonProperty("spec_kb_name")
    String specKbName
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
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
     * 字典[是否]
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
     * 「模型标识」
     */
    @JsonProperty("rerank_model_id")
    String rerankModelId
    /**
     * 「排序」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「规格库标识」
     */
    @JsonProperty("spec_kb_id")
    String specKbId
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
     * 设置「智能体业务上下文标识」值
     * @param val
     */
    AiAgentContextDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiAgentContextDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiAgentContextDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AiAgentContextDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiAgentContextDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiAgentContextDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「系统标记」值
     * 字典[是否]
     * @param val
     */
    AiAgentContextDTO setSystemFlag(Integer systemFlag) {
        this.systemFlag = systemFlag
        return this
    }


    /**
     * 设置「生成模式」值
     * 字典[AI生成模式]
     * @param val
     */
    AiAgentContextDTO setGenerationMode(String generationMode) {
        this.generationMode = generationMode
        return this
    }


    /**
     * 设置「智能体工作流模式」值
     * 字典[智能体工作流模式]
     * @param val
     */
    AiAgentContextDTO setFlowMode(String flowMode) {
        this.flowMode = flowMode
        return this
    }


    /**
     * 设置「调试数据」值
     * @param val
     */
    AiAgentContextDTO setContextDebugData(String contextDebugData) {
        this.contextDebugData = contextDebugData
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    AiAgentContextDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「业务范围」值
     * 字典[智能体业务范围]
     * @param val
     */
    AiAgentContextDTO setScopes(String scopes) {
        this.scopes = scopes
        return this
    }


    /**
     * 设置「知识库标识集合」值
     * @param val
     */
    AiAgentContextDTO setKbTags(String kbTags) {
        this.kbTags = kbTags
        return this
    }


    /**
     * 设置「mcp服务标识集合」值
     * @param val
     */
    AiAgentContextDTO setMcpServerTags(String mcpServerTags) {
        this.mcpServerTags = mcpServerTags
        return this
    }


    /**
     * 设置「召回相似度阈值」值
     * @param val
     */
    AiAgentContextDTO setSimilarityThreshold(BigDecimal similarityThreshold) {
        this.similarityThreshold = similarityThreshold
        return this
    }


    /**
     * 设置「向量相似度权重」值
     * @param val
     */
    AiAgentContextDTO setVectorSimilarityWeight(BigDecimal vectorSimilarityWeight) {
        this.vectorSimilarityWeight = vectorSimilarityWeight
        return this
    }


    /**
     * 设置「最大召回数量」值
     * @param val
     */
    AiAgentContextDTO setTopK(Integer topK) {
        this.topK = topK
        return this
    }


    /**
     * 设置「召回重排」值
     * 字典[是否]
     * @param val
     */
    AiAgentContextDTO setRerank(Integer rerank) {
        this.rerank = rerank
        return this
    }


    /**
     * 设置「召回重排模型」值
     * @param val
     */
    AiAgentContextDTO setRerankModel(String rerankModel) {
        this.rerankModel = rerankModel
        return this
    }


    /**
     * 设置「使用知识图谱」值
     * 字典[是否]
     * @param val
     */
    AiAgentContextDTO setUseKg(Integer useKg) {
        this.useKg = useKg
        return this
    }


    /**
     * 设置「知识库模式」值
     * 字典[智能体知识库模式]
     * @param val
     */
    AiAgentContextDTO setKbMode(String kbMode) {
        this.kbMode = kbMode
        return this
    }


    /**
     * 设置「视觉识别提示词」值
     * @param val
     */
    AiAgentContextDTO setVlmPrompt(String vlmPrompt) {
        this.vlmPrompt = vlmPrompt
        return this
    }


    /**
     * 设置「发布技能」值
     * 字典[是否]
     * @param val
     */
    AiAgentContextDTO setPublishSkill(Integer publishSkill) {
        this.publishSkill = publishSkill
        return this
    }


    /**
     * 设置「技能提示词」值
     * @param val
     */
    AiAgentContextDTO setSkillPrompt(String skillPrompt) {
        this.skillPrompt = skillPrompt
        return this
    }


    /**
     * 设置「支持联网搜索」值
     * 字典[是否]
     * @param val
     */
    AiAgentContextDTO setEnableSearching(Integer enableSearching) {
        this.enableSearching = enableSearching
        return this
    }


    /**
     * 设置「记忆存储知识库标记」值
     * @param val
     */
    AiAgentContextDTO setMemoryKbTag(String memoryKbTag) {
        this.memoryKbTag = memoryKbTag
        return this
    }


    /**
     * 设置「记忆存储文档标记」值
     * @param val
     */
    AiAgentContextDTO setMemoryDocTag(String memoryDocTag) {
        this.memoryDocTag = memoryDocTag
        return this
    }


    /**
     * 设置「规格库」值
     * @param val
     */
    AiAgentContextDTO setSpecKbName(String specKbName) {
        this.specKbName = specKbName
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    AiAgentContextDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「智能体标识」值
     * @param val
     */
    AiAgentContextDTO setAiAgentId(String aiAgentId) {
        this.aiAgentId = aiAgentId
        return this
    }


    /**
     * 设置「智能体名称」值
     * @param val
     */
    AiAgentContextDTO setAiAgentName(String aiAgentName) {
        this.aiAgentName = aiAgentName
        return this
    }


    /**
     * 设置「模型标识」值
     * @param val
     */
    AiAgentContextDTO setAiModelId(String aiModelId) {
        this.aiModelId = aiModelId
        return this
    }


    /**
     * 设置「模型名称」值
     * @param val
     */
    AiAgentContextDTO setAiModelName(String aiModelName) {
        this.aiModelName = aiModelName
        return this
    }


    /**
     * 设置「代码标识」值
     * @param val
     */
    AiAgentContextDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }


    /**
     * 设置「自定义建议提示词」值
     * @param val
     */
    AiAgentContextDTO setCustomSuggestionPrompt(String customSuggestionPrompt) {
        this.customSuggestionPrompt = customSuggestionPrompt
        return this
    }


    /**
     * 设置「默认系统提示词」值
     * @param val
     */
    AiAgentContextDTO setDefaultSystemPrompt(String defaultSystemPrompt) {
        this.defaultSystemPrompt = defaultSystemPrompt
        return this
    }


    /**
     * 设置「启用问题建议」值
     * @param val
     */
    AiAgentContextDTO setEnableSuggestedQuestions(Integer enableSuggestedQuestions) {
        this.enableSuggestedQuestions = enableSuggestedQuestions
        return this
    }


    /**
     * 设置「启用思考链」值
     * 字典[是否]
     * @param val
     */
    AiAgentContextDTO setEnableThinking(Integer enableThinking) {
        this.enableThinking = enableThinking
        return this
    }


    /**
     * 设置「调用工具」值
     * @param val
     */
    AiAgentContextDTO setEnableTools(Integer enableTools) {
        this.enableTools = enableTools
        return this
    }


    /**
     * 设置「是否默认Agent」值
     * 字典[是否]
     * @param val
     */
    AiAgentContextDTO setIsDefault(Integer isDefault) {
        this.isDefault = isDefault
        return this
    }


    /**
     * 设置「最大输入token数」值
     * @param val
     */
    AiAgentContextDTO setMaxInputTokens(Integer maxInputTokens) {
        this.maxInputTokens = maxInputTokens
        return this
    }


    /**
     * 设置「记忆对话轮数」值
     * @param val
     */
    AiAgentContextDTO setMemoryMaxTurns(Integer memoryMaxTurns) {
        this.memoryMaxTurns = memoryMaxTurns
        return this
    }


    /**
     * 设置「记忆模式」值
     * 字典[记忆模式]
     * @param val
     */
    AiAgentContextDTO setMemoryMode(String memoryMode) {
        this.memoryMode = memoryMode
        return this
    }


    /**
     * 设置「模型标识」值
     * @param val
     */
    AiAgentContextDTO setRerankModelId(String rerankModelId) {
        this.rerankModelId = rerankModelId
        return this
    }


    /**
     * 设置「排序」值
     * @param val
     */
    AiAgentContextDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「规格库标识」值
     * @param val
     */
    AiAgentContextDTO setSpecKbId(String specKbId) {
        this.specKbId = specKbId
        return this
    }


    /**
     * 设置「流式输出」值
     * @param val
     */
    AiAgentContextDTO setStream(Integer stream) {
        this.stream = stream
        return this
    }


    /**
     * 设置「预置建议问题」值
     * @param val
     */
    AiAgentContextDTO setSuggestedQuestions(List<String> suggestedQuestions) {
        this.suggestedQuestions = suggestedQuestions
        return this
    }


    /**
     * 设置「模型随机性参数」值
     * @param val
     */
    AiAgentContextDTO setTemperature(BigDecimal temperature) {
        this.temperature = temperature
        return this
    }


    /**
     * 设置「工具调用超限提示语」值
     * @param val
     */
    AiAgentContextDTO setToolExceedMessage(String toolExceedMessage) {
        this.toolExceedMessage = toolExceedMessage
        return this
    }


    /**
     * 设置「最大工具调用次数」值
     * @param val
     */
    AiAgentContextDTO setToolMaxCalls(Integer toolMaxCalls) {
        this.toolMaxCalls = toolMaxCalls
        return this
    }


    /**
     * 设置「概率核采样」值
     * @param val
     */
    AiAgentContextDTO setTopP(BigDecimal topP) {
        this.topP = topP
        return this
    }


    /**
     * 设置「截断策略」值
     * 字典[截断策略]
     * @param val
     */
    AiAgentContextDTO setTrimmingStrategy(String trimmingStrategy) {
        this.trimmingStrategy = trimmingStrategy
        return this
    }


    /**
     * 设置「欢迎消息模板」值
     * @param val
     */
    AiAgentContextDTO setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage
        return this
    }

}
