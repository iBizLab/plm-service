package cn.ibizlab.plm.ai.aikbsearchquery.dto

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
class AiKbSearchQueryDTO extends GroovyDTO<AiKbSearchQueryDTO> {

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
     * 「原始问题」
     */
    @JsonProperty("raw_query")
    String rawQuery
    /**
     * 「标准化问题」
     */
    @JsonProperty("normalized_query")
    String normalizedQuery
    /**
     * 「查询向量」
     */
    @JsonProperty("embedding")
    Object embedding
    /**
     * 「有效回答」
     * 字典[是否]
     */
    @JsonProperty("is_answered")
    Integer isAnswered
    /**
     * 「满意度评分」
     */
    @JsonProperty("user_satisfaction")
    Integer userSatisfaction
    /**
     * 「知识缺口」
     * 字典[是否]
     */
    @JsonProperty("is_knowledge_gap")
    Integer isKnowledgeGap
    /**
     * 「用户标识」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「检索标签」
     * 字典[标签集标签]
     */
    @JsonProperty("tags")
    String tags
    /**
     * 「用户反馈信息」
     */
    @JsonProperty("feedback")
    String feedback
    /**
     * 「召回配置」
     */
    @JsonProperty("retrieval_config")
    IEntity retrievalConfig
    /**
     * 「总耗时」
     */
    @JsonProperty("total_duration")
    BigDecimal totalDuration
    /**
     * 「来源」
     * 字典[知识库检索记录来源]
     */
    @JsonProperty("source")
    String source
    /**
     * 「来源元数据」
     */
    @JsonProperty("source_metadata")
    String sourceMetadata
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
     * 设置「标识」值
     * @param val
     */
    AiKbSearchQueryDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiKbSearchQueryDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「原始问题」值
     * @param val
     */
    AiKbSearchQueryDTO setRawQuery(String rawQuery) {
        this.rawQuery = rawQuery
        return this
    }


    /**
     * 设置「标准化问题」值
     * @param val
     */
    AiKbSearchQueryDTO setNormalizedQuery(String normalizedQuery) {
        this.normalizedQuery = normalizedQuery
        return this
    }


    /**
     * 设置「查询向量」值
     * @param val
     */
    AiKbSearchQueryDTO setEmbedding(Object embedding) {
        this.embedding = embedding
        return this
    }


    /**
     * 设置「有效回答」值
     * 字典[是否]
     * @param val
     */
    AiKbSearchQueryDTO setIsAnswered(Integer isAnswered) {
        this.isAnswered = isAnswered
        return this
    }


    /**
     * 设置「满意度评分」值
     * @param val
     */
    AiKbSearchQueryDTO setUserSatisfaction(Integer userSatisfaction) {
        this.userSatisfaction = userSatisfaction
        return this
    }


    /**
     * 设置「知识缺口」值
     * 字典[是否]
     * @param val
     */
    AiKbSearchQueryDTO setIsKnowledgeGap(Integer isKnowledgeGap) {
        this.isKnowledgeGap = isKnowledgeGap
        return this
    }


    /**
     * 设置「用户标识」值
     * @param val
     */
    AiKbSearchQueryDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「检索标签」值
     * 字典[标签集标签]
     * @param val
     */
    AiKbSearchQueryDTO setTags(String tags) {
        this.tags = tags
        return this
    }


    /**
     * 设置「用户反馈信息」值
     * @param val
     */
    AiKbSearchQueryDTO setFeedback(String feedback) {
        this.feedback = feedback
        return this
    }


    /**
     * 设置「召回配置」值
     * @param val
     */
    AiKbSearchQueryDTO setRetrievalConfig(IEntity retrievalConfig) {
        this.retrievalConfig = retrievalConfig
        return this
    }


    /**
     * 设置「总耗时」值
     * @param val
     */
    AiKbSearchQueryDTO setTotalDuration(BigDecimal totalDuration) {
        this.totalDuration = totalDuration
        return this
    }


    /**
     * 设置「来源」值
     * 字典[知识库检索记录来源]
     * @param val
     */
    AiKbSearchQueryDTO setSource(String source) {
        this.source = source
        return this
    }


    /**
     * 设置「来源元数据」值
     * @param val
     */
    AiKbSearchQueryDTO setSourceMetadata(String sourceMetadata) {
        this.sourceMetadata = sourceMetadata
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbSearchQueryDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AiKbSearchQueryDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbSearchQueryDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKbSearchQueryDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
