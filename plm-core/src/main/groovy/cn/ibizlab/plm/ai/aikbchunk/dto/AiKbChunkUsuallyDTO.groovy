package cn.ibizlab.plm.ai.aikbchunk.dto

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
class AiKbChunkUsuallyDTO extends GroovyDTO<AiKbChunkUsuallyDTO> {

    /**
     * 「分块标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「分块名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「文档位置」
     */
    @JsonProperty("positions")
    String positions
    /**
     * 「标签」
     * 字典[标签集标签]
     */
    @JsonProperty("tags")
    String tags
    /**
     * 「分块路径」
     */
    @JsonProperty("path")
    String path
    /**
     * 「文档索引顺序」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「文档类型」
     * 字典[知识库文档类型]
     */
    @JsonProperty("document_type")
    String documentType
    /**
     * 「分块类型」
     * 字典[文档分块类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「源分块索引」
     */
    @JsonProperty("source_indices")
    List<String> sourceIndices
    /**
     * 「源分块计数」
     */
    @JsonProperty("source_count")
    Integer sourceCount
    /**
     * 「知识库文档名称」
     */
    @JsonProperty("document_name")
    String documentName
    /**
     * 「父分块标识」
     */
    @JsonProperty("pid")
    String pid

    /**
     * 设置「分块标识」值
     * @param val
     */
    AiKbChunkUsuallyDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「分块名称」值
     * @param val
     */
    AiKbChunkUsuallyDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「文档位置」值
     * @param val
     */
    AiKbChunkUsuallyDTO setPositions(String positions) {
        this.positions = positions
        return this
    }


    /**
     * 设置「标签」值
     * 字典[标签集标签]
     * @param val
     */
    AiKbChunkUsuallyDTO setTags(String tags) {
        this.tags = tags
        return this
    }


    /**
     * 设置「分块路径」值
     * @param val
     */
    AiKbChunkUsuallyDTO setPath(String path) {
        this.path = path
        return this
    }


    /**
     * 设置「文档索引顺序」值
     * @param val
     */
    AiKbChunkUsuallyDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「文档类型」值
     * 字典[知识库文档类型]
     * @param val
     */
    AiKbChunkUsuallyDTO setDocumentType(String documentType) {
        this.documentType = documentType
        return this
    }


    /**
     * 设置「分块类型」值
     * 字典[文档分块类型]
     * @param val
     */
    AiKbChunkUsuallyDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「源分块索引」值
     * @param val
     */
    AiKbChunkUsuallyDTO setSourceIndices(List<String> sourceIndices) {
        this.sourceIndices = sourceIndices
        return this
    }


    /**
     * 设置「源分块计数」值
     * @param val
     */
    AiKbChunkUsuallyDTO setSourceCount(Integer sourceCount) {
        this.sourceCount = sourceCount
        return this
    }


    /**
     * 设置「知识库文档名称」值
     * @param val
     */
    AiKbChunkUsuallyDTO setDocumentName(String documentName) {
        this.documentName = documentName
        return this
    }


    /**
     * 设置「父分块标识」值
     * @param val
     */
    AiKbChunkUsuallyDTO setPid(String pid) {
        this.pid = pid
        return this
    }

}
