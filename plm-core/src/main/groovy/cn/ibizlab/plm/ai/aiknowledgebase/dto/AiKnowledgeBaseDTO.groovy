package cn.ibizlab.plm.ai.aiknowledgebase.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.ai.aikbchunkingstrategy.dto.AiKbChunkingStrategyDTO
import cn.ibizlab.plm.ai.aikbmember.dto.AiKbMemberDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class AiKnowledgeBaseDTO extends GroovyDTO<AiKnowledgeBaseDTO> {

    /**
     * 「知识库标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「知识库名称」
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
     * 「逻辑有效标识」
     */
    @JsonProperty("enable")
    Integer enable
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
     * 「可见范围」
     * 字典[可见范围]
     */
    @JsonProperty("visibility")
    String visibility
    /**
     * 「是否已删除」
     * 字典[是否]
     */
    @JsonProperty("is_deleted")
    Integer isDeleted
    /**
     * 「元数据」
     */
    @JsonProperty("meta_data")
    String metaData
    /**
     * 「标签集」
     * 字典[知识库标签集]
     */
    @JsonProperty("tag_sets")
    String tagSets
    /**
     * 「引导提示词」
     */
    @JsonProperty("guidance_prompt")
    String guidancePrompt
    /**
     * 「召回重排模型」
     */
    @JsonProperty("rerank_model")
    String rerankModel
    /**
     * 「交谈模型」
     */
    @JsonProperty("chat_model")
    String chatModel
    /**
     * 「从已有知识库克隆」
     * 字典[是否]
     */
    @JsonProperty("use_copy")
    Integer useCopy
    /**
     * 「目标知识库」
     */
    @JsonProperty("copy_target")
    String copyTarget
    /**
     * 「当前知识库模版」
     */
    @JsonProperty("cur_temp")
    String curTemp
    /**
     * 「描述向量」
     */
    @JsonProperty("description_vector")
    Object descriptionVector
    /**
     * 「引导词向量」
     */
    @JsonProperty("guidance_prompt_vector")
    Object guidancePromptVector
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
     * 「使用知识图谱」
     * 字典[是否]
     */
    @JsonProperty("use_kg")
    Integer useKg
    /**
     * 「智能目录索引」
     * 字典[是否]
     */
    @JsonProperty("pageindex")
    Integer pageindex
    /**
     * 「交谈模型标识」
     */
    @JsonProperty("chat_model_id")
    String chatModelId
    /**
     * 「切片方法」
     * 字典[切片策略]
     */
    @JsonProperty("chunk_method")
    String chunkMethod
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「embedding模型」
     */
    @JsonProperty("embedding_model")
    String embeddingModel
    /**
     * 「模型标识」
     */
    @JsonProperty("embedding_model_id")
    String embeddingModelId
    /**
     * 「解析配置」
     */
    @JsonProperty("parser_config")
    AiKbChunkingStrategyDTO parserConfig
    /**
     * 「模型标识」
     */
    @JsonProperty("rerank_model_id")
    String rerankModelId
    /**
     * 「知识库源标识」
     */
    @JsonProperty("source_id")
    String sourceId
    /**
     * 「知识库源名称」
     */
    @JsonProperty("source_name")
    String sourceName
    /**
     * 「null」
     */
    @JsonProperty("kb_members")
    List<AiKbMemberDTO> kbMembers

    /**
     * 设置「知识库标识」值
     * @param val
     */
    AiKnowledgeBaseDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「知识库名称」值
     * @param val
     */
    AiKnowledgeBaseDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKnowledgeBaseDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「逻辑有效标识」值
     * @param val
     */
    AiKnowledgeBaseDTO setEnable(Integer enable) {
        this.enable = enable
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AiKnowledgeBaseDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKnowledgeBaseDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKnowledgeBaseDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「可见范围」值
     * 字典[可见范围]
     * @param val
     */
    AiKnowledgeBaseDTO setVisibility(String visibility) {
        this.visibility = visibility
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    AiKnowledgeBaseDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「元数据」值
     * @param val
     */
    AiKnowledgeBaseDTO setMetaData(String metaData) {
        this.metaData = metaData
        return this
    }


    /**
     * 设置「标签集」值
     * 字典[知识库标签集]
     * @param val
     */
    AiKnowledgeBaseDTO setTagSets(String tagSets) {
        this.tagSets = tagSets
        return this
    }


    /**
     * 设置「引导提示词」值
     * @param val
     */
    AiKnowledgeBaseDTO setGuidancePrompt(String guidancePrompt) {
        this.guidancePrompt = guidancePrompt
        return this
    }


    /**
     * 设置「召回重排模型」值
     * @param val
     */
    AiKnowledgeBaseDTO setRerankModel(String rerankModel) {
        this.rerankModel = rerankModel
        return this
    }


    /**
     * 设置「交谈模型」值
     * @param val
     */
    AiKnowledgeBaseDTO setChatModel(String chatModel) {
        this.chatModel = chatModel
        return this
    }


    /**
     * 设置「从已有知识库克隆」值
     * 字典[是否]
     * @param val
     */
    AiKnowledgeBaseDTO setUseCopy(Integer useCopy) {
        this.useCopy = useCopy
        return this
    }


    /**
     * 设置「目标知识库」值
     * @param val
     */
    AiKnowledgeBaseDTO setCopyTarget(String copyTarget) {
        this.copyTarget = copyTarget
        return this
    }


    /**
     * 设置「当前知识库模版」值
     * @param val
     */
    AiKnowledgeBaseDTO setCurTemp(String curTemp) {
        this.curTemp = curTemp
        return this
    }


    /**
     * 设置「描述向量」值
     * @param val
     */
    AiKnowledgeBaseDTO setDescriptionVector(Object descriptionVector) {
        this.descriptionVector = descriptionVector
        return this
    }


    /**
     * 设置「引导词向量」值
     * @param val
     */
    AiKnowledgeBaseDTO setGuidancePromptVector(Object guidancePromptVector) {
        this.guidancePromptVector = guidancePromptVector
        return this
    }


    /**
     * 设置「召回相似度阈值」值
     * @param val
     */
    AiKnowledgeBaseDTO setSimilarityThreshold(BigDecimal similarityThreshold) {
        this.similarityThreshold = similarityThreshold
        return this
    }


    /**
     * 设置「向量相似度权重」值
     * @param val
     */
    AiKnowledgeBaseDTO setVectorSimilarityWeight(BigDecimal vectorSimilarityWeight) {
        this.vectorSimilarityWeight = vectorSimilarityWeight
        return this
    }


    /**
     * 设置「最大召回数量」值
     * @param val
     */
    AiKnowledgeBaseDTO setTopK(Integer topK) {
        this.topK = topK
        return this
    }


    /**
     * 设置「召回重排」值
     * 字典[是否]
     * @param val
     */
    AiKnowledgeBaseDTO setRerank(Integer rerank) {
        this.rerank = rerank
        return this
    }


    /**
     * 设置「使用知识图谱」值
     * 字典[是否]
     * @param val
     */
    AiKnowledgeBaseDTO setUseKg(Integer useKg) {
        this.useKg = useKg
        return this
    }


    /**
     * 设置「智能目录索引」值
     * 字典[是否]
     * @param val
     */
    AiKnowledgeBaseDTO setPageindex(Integer pageindex) {
        this.pageindex = pageindex
        return this
    }


    /**
     * 设置「交谈模型标识」值
     * @param val
     */
    AiKnowledgeBaseDTO setChatModelId(String chatModelId) {
        this.chatModelId = chatModelId
        return this
    }


    /**
     * 设置「切片方法」值
     * 字典[切片策略]
     * @param val
     */
    AiKnowledgeBaseDTO setChunkMethod(String chunkMethod) {
        this.chunkMethod = chunkMethod
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    AiKnowledgeBaseDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「embedding模型」值
     * @param val
     */
    AiKnowledgeBaseDTO setEmbeddingModel(String embeddingModel) {
        this.embeddingModel = embeddingModel
        return this
    }


    /**
     * 设置「模型标识」值
     * @param val
     */
    AiKnowledgeBaseDTO setEmbeddingModelId(String embeddingModelId) {
        this.embeddingModelId = embeddingModelId
        return this
    }


    /**
     * 设置「解析配置」值
     * @param val
     */
    AiKnowledgeBaseDTO setParserConfig(AiKbChunkingStrategyDTO parserConfig) {
        this.parserConfig = parserConfig
        return this
    }


    /**
     * 设置「模型标识」值
     * @param val
     */
    AiKnowledgeBaseDTO setRerankModelId(String rerankModelId) {
        this.rerankModelId = rerankModelId
        return this
    }


    /**
     * 设置「知识库源标识」值
     * @param val
     */
    AiKnowledgeBaseDTO setSourceId(String sourceId) {
        this.sourceId = sourceId
        return this
    }


    /**
     * 设置「知识库源名称」值
     * @param val
     */
    AiKnowledgeBaseDTO setSourceName(String sourceName) {
        this.sourceName = sourceName
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    AiKnowledgeBaseDTO setKbMembers(List<AiKbMemberDTO> kbMembers) {
        this.kbMembers = kbMembers
        return this
    }

}
