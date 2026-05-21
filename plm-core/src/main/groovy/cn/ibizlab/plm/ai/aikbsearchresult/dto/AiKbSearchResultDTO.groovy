package cn.ibizlab.plm.ai.aikbsearchresult.dto

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
class AiKbSearchResultDTO extends GroovyDTO<AiKbSearchResultDTO> {

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
     * 「标识」
     */
    @JsonProperty("query_id")
    String queryId
    /**
     * 「文档标识」
     */
    @JsonProperty("document_id")
    String documentId
    /**
     * 「知识库标识」
     */
    @JsonProperty("kb_id")
    String kbId
    /**
     * 「结果排序」
     */
    @JsonProperty("rank")
    Integer rank
    /**
     * 「召回模式」
     * 字典[检索召回结果模式]
     */
    @JsonProperty("retrieval_mode")
    String retrievalMode
    /**
     * 「命中内容快照」
     */
    @JsonProperty("hit_content")
    String hitContent
    /**
     * 「合并内容快照」
     */
    @JsonProperty("merged_content")
    String mergedContent
    /**
     * 「相似度得分」
     */
    @JsonProperty("similarity")
    BigDecimal similarity
    /**
     * 「分块快照集合」
     */
    @JsonProperty("chunk_snapshots")
    List<IEntity> chunkSnapshots
    /**
     * 「原始问题」
     */
    @JsonProperty("raw_query")
    String rawQuery
    /**
     * 「创建时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「创建人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
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
    AiKbSearchResultDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiKbSearchResultDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    AiKbSearchResultDTO setQueryId(String queryId) {
        this.queryId = queryId
        return this
    }


    /**
     * 设置「文档标识」值
     * @param val
     */
    AiKbSearchResultDTO setDocumentId(String documentId) {
        this.documentId = documentId
        return this
    }


    /**
     * 设置「知识库标识」值
     * @param val
     */
    AiKbSearchResultDTO setKbId(String kbId) {
        this.kbId = kbId
        return this
    }


    /**
     * 设置「结果排序」值
     * @param val
     */
    AiKbSearchResultDTO setRank(Integer rank) {
        this.rank = rank
        return this
    }


    /**
     * 设置「召回模式」值
     * 字典[检索召回结果模式]
     * @param val
     */
    AiKbSearchResultDTO setRetrievalMode(String retrievalMode) {
        this.retrievalMode = retrievalMode
        return this
    }


    /**
     * 设置「命中内容快照」值
     * @param val
     */
    AiKbSearchResultDTO setHitContent(String hitContent) {
        this.hitContent = hitContent
        return this
    }


    /**
     * 设置「合并内容快照」值
     * @param val
     */
    AiKbSearchResultDTO setMergedContent(String mergedContent) {
        this.mergedContent = mergedContent
        return this
    }


    /**
     * 设置「相似度得分」值
     * @param val
     */
    AiKbSearchResultDTO setSimilarity(BigDecimal similarity) {
        this.similarity = similarity
        return this
    }


    /**
     * 设置「分块快照集合」值
     * @param val
     */
    AiKbSearchResultDTO setChunkSnapshots(List<IEntity> chunkSnapshots) {
        this.chunkSnapshots = chunkSnapshots
        return this
    }


    /**
     * 设置「原始问题」值
     * @param val
     */
    AiKbSearchResultDTO setRawQuery(String rawQuery) {
        this.rawQuery = rawQuery
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AiKbSearchResultDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbSearchResultDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbSearchResultDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKbSearchResultDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
