package cn.ibizlab.plm.ai.aikbdocument.dto

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
class AiKbDocumentSimpleDTO extends GroovyDTO<AiKbDocumentSimpleDTO> {

    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「文档同步标识」
     */
    @JsonProperty("sync_id")
    String syncId
    /**
     * 「切片方法」
     * 字典[切片策略]
     */
    @JsonProperty("chunk_method")
    String chunkMethod
    /**
     * 「文档类型」
     * 字典[知识库文档类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「状态」
     * 字典[文档切片状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「文件类型」
     * 字典[文件类型]
     */
    @JsonProperty("file_type")
    String fileType
    /**
     * 「自定义切片」
     * 字典[自定义切片]
     */
    @JsonProperty("custom_chunk")
    Integer customChunk
    /**
     * 「标签集」
     * 字典[知识库标签集]
     */
    @JsonProperty("tag_sets")
    String tagSets

    /**
     * 设置「名称」值
     * @param val
     */
    AiKbDocumentSimpleDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKbDocumentSimpleDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「文档同步标识」值
     * @param val
     */
    AiKbDocumentSimpleDTO setSyncId(String syncId) {
        this.syncId = syncId
        return this
    }


    /**
     * 设置「切片方法」值
     * 字典[切片策略]
     * @param val
     */
    AiKbDocumentSimpleDTO setChunkMethod(String chunkMethod) {
        this.chunkMethod = chunkMethod
        return this
    }


    /**
     * 设置「文档类型」值
     * 字典[知识库文档类型]
     * @param val
     */
    AiKbDocumentSimpleDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「状态」值
     * 字典[文档切片状态]
     * @param val
     */
    AiKbDocumentSimpleDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「文件类型」值
     * 字典[文件类型]
     * @param val
     */
    AiKbDocumentSimpleDTO setFileType(String fileType) {
        this.fileType = fileType
        return this
    }


    /**
     * 设置「自定义切片」值
     * 字典[自定义切片]
     * @param val
     */
    AiKbDocumentSimpleDTO setCustomChunk(Integer customChunk) {
        this.customChunk = customChunk
        return this
    }


    /**
     * 设置「标签集」值
     * 字典[知识库标签集]
     * @param val
     */
    AiKbDocumentSimpleDTO setTagSets(String tagSets) {
        this.tagSets = tagSets
        return this
    }

}
