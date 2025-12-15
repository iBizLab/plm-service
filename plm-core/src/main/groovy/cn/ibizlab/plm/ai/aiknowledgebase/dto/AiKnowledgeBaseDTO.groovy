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
     * 「解析配置」
     */
    @JsonProperty("parser_config")
    AiKbChunkingStrategyDTO parserConfig
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
     * 设置「解析配置」值
     * @param val
     */
    AiKnowledgeBaseDTO setParserConfig(AiKbChunkingStrategyDTO parserConfig) {
        this.parserConfig = parserConfig
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

}
