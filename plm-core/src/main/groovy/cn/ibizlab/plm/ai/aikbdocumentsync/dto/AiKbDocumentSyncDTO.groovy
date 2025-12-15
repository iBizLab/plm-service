package cn.ibizlab.plm.ai.aikbdocumentsync.dto

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
class AiKbDocumentSyncDTO extends GroovyDTO<AiKbDocumentSyncDTO> {

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
     * 「同步频率」
     * 字典[知识库同步频率]
     */
    @JsonProperty("sync_frequency")
    String syncFrequency
    /**
     * 「源类型」
     * 字典[最近访问对象]
     */
    @JsonProperty("source_type")
    String sourceType
    /**
     * 「源标识」
     */
    @JsonProperty("source_id")
    String sourceId
    /**
     * 「知识库标识」
     */
    @JsonProperty("ai_knowledge_base_id")
    String aiKnowledgeBaseId

    /**
     * 设置「标识」值
     * @param val
     */
    AiKbDocumentSyncDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiKbDocumentSyncDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbDocumentSyncDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AiKbDocumentSyncDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbDocumentSyncDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKbDocumentSyncDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「同步频率」值
     * 字典[知识库同步频率]
     * @param val
     */
    AiKbDocumentSyncDTO setSyncFrequency(String syncFrequency) {
        this.syncFrequency = syncFrequency
        return this
    }


    /**
     * 设置「源类型」值
     * 字典[最近访问对象]
     * @param val
     */
    AiKbDocumentSyncDTO setSourceType(String sourceType) {
        this.sourceType = sourceType
        return this
    }


    /**
     * 设置「源标识」值
     * @param val
     */
    AiKbDocumentSyncDTO setSourceId(String sourceId) {
        this.sourceId = sourceId
        return this
    }


    /**
     * 设置「知识库标识」值
     * @param val
     */
    AiKbDocumentSyncDTO setAiKnowledgeBaseId(String aiKnowledgeBaseId) {
        this.aiKnowledgeBaseId = aiKnowledgeBaseId
        return this
    }

}
