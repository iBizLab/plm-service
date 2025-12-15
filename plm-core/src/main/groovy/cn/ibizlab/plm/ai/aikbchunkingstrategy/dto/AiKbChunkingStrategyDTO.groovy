package cn.ibizlab.plm.ai.aikbchunkingstrategy.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.ai.aikbchunkingstrategy.dto.AiKbChunkingStrategyRedactionRuleDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class AiKbChunkingStrategyDTO extends GroovyDTO<AiKbChunkingStrategyDTO> {

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
     * 「文本预处理规则」
     * 字典[通用文本清洗配置]
     */
    @JsonProperty("pre_process_rules")
    String preProcessRules
    /**
     * 「脱敏规则」
     */
    @JsonProperty("redaction_rules")
    List<AiKbChunkingStrategyRedactionRuleDTO> redactionRules
    /**
     * 「块重叠」
     */
    @JsonProperty("chunk_overlap")
    Integer chunkOverlap
    /**
     * 「块大小」
     */
    @JsonProperty("chunk_size")
    Integer chunkSize
    /**
     * 「保留分隔符」
     * 字典[是否]
     */
    @JsonProperty("keep_separator")
    Integer keepSeparator
    /**
     * 「单文档最大块数」
     */
    @JsonProperty("max_chunk_count_per_doc")
    Integer maxChunkCountPerDoc
    /**
     * 「分隔符」
     */
    @JsonProperty("separator")
    String separator

    /**
     * 设置「标识」值
     * @param val
     */
    AiKbChunkingStrategyDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiKbChunkingStrategyDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「文本预处理规则」值
     * 字典[通用文本清洗配置]
     * @param val
     */
    AiKbChunkingStrategyDTO setPreProcessRules(String preProcessRules) {
        this.preProcessRules = preProcessRules
        return this
    }


    /**
     * 设置「脱敏规则」值
     * @param val
     */
    AiKbChunkingStrategyDTO setRedactionRules(List<AiKbChunkingStrategyRedactionRuleDTO> redactionRules) {
        this.redactionRules = redactionRules
        return this
    }


    /**
     * 设置「块重叠」值
     * @param val
     */
    AiKbChunkingStrategyDTO setChunkOverlap(Integer chunkOverlap) {
        this.chunkOverlap = chunkOverlap
        return this
    }


    /**
     * 设置「块大小」值
     * @param val
     */
    AiKbChunkingStrategyDTO setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize
        return this
    }


    /**
     * 设置「保留分隔符」值
     * 字典[是否]
     * @param val
     */
    AiKbChunkingStrategyDTO setKeepSeparator(Integer keepSeparator) {
        this.keepSeparator = keepSeparator
        return this
    }


    /**
     * 设置「单文档最大块数」值
     * @param val
     */
    AiKbChunkingStrategyDTO setMaxChunkCountPerDoc(Integer maxChunkCountPerDoc) {
        this.maxChunkCountPerDoc = maxChunkCountPerDoc
        return this
    }


    /**
     * 设置「分隔符」值
     * @param val
     */
    AiKbChunkingStrategyDTO setSeparator(String separator) {
        this.separator = separator
        return this
    }

}
