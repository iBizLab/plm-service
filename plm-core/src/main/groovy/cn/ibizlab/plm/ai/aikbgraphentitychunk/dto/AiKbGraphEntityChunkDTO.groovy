package cn.ibizlab.plm.ai.aikbgraphentitychunk.dto

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
class AiKbGraphEntityChunkDTO extends GroovyDTO<AiKbGraphEntityChunkDTO> {

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
     * 「分块标识」
     */
    @JsonProperty("chunk_id")
    String chunkId
    /**
     * 「实体标识」
     */
    @JsonProperty("entity_id")
    String entityId

    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbGraphEntityChunkDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AiKbGraphEntityChunkDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbGraphEntityChunkDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKbGraphEntityChunkDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    AiKbGraphEntityChunkDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiKbGraphEntityChunkDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「文档标识」值
     * @param val
     */
    AiKbGraphEntityChunkDTO setDocumentId(String documentId) {
        this.documentId = documentId
        return this
    }


    /**
     * 设置「知识库标识」值
     * @param val
     */
    AiKbGraphEntityChunkDTO setKbId(String kbId) {
        this.kbId = kbId
        return this
    }


    /**
     * 设置「分块标识」值
     * @param val
     */
    AiKbGraphEntityChunkDTO setChunkId(String chunkId) {
        this.chunkId = chunkId
        return this
    }


    /**
     * 设置「实体标识」值
     * @param val
     */
    AiKbGraphEntityChunkDTO setEntityId(String entityId) {
        this.entityId = entityId
        return this
    }

}
