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
class AiKbChunkDTO extends GroovyDTO<AiKbChunkDTO> {

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
     * 「块内容（预览）」
     */
    @JsonProperty("content_preview")
    String contentPreview
    /**
     * 「块内容」
     */
    @JsonProperty("content")
    String content
    /**
     * 「文档位置」
     */
    @JsonProperty("positions")
    String positions
    /**
     * 「关键词」
     */
    @JsonProperty("keywords")
    String keywords
    /**
     * 「关键问题」
     */
    @JsonProperty("key_questions")
    String keyQuestions
    /**
     * 「标签」
     * 字典[标签集标签]
     */
    @JsonProperty("tags")
    String tags
    /**
     * 「关键问题向量」
     */
    @JsonProperty("key_questions_vector")
    Object keyQuestionsVector
    /**
     * 「块内容向量」
     */
    @JsonProperty("content_vector")
    Object contentVector
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
     * 「知识库标识」
     */
    @JsonProperty("kb_id")
    String kbId
    /**
     * 「是否启用」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「知识库文档标识」
     */
    @JsonProperty("document_id")
    String documentId
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
     * 「用户标记」
     */
    @JsonProperty("user_tag")
    String userTag
    /**
     * 「用户标记2」
     */
    @JsonProperty("user_tag2")
    String userTag2

    /**
     * 设置「分块标识」值
     * @param val
     */
    AiKbChunkDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「分块名称」值
     * @param val
     */
    AiKbChunkDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbChunkDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AiKbChunkDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbChunkDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKbChunkDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「块内容（预览）」值
     * @param val
     */
    AiKbChunkDTO setContentPreview(String contentPreview) {
        this.contentPreview = contentPreview
        return this
    }


    /**
     * 设置「块内容」值
     * @param val
     */
    AiKbChunkDTO setContent(String content) {
        this.content = content
        return this
    }


    /**
     * 设置「文档位置」值
     * @param val
     */
    AiKbChunkDTO setPositions(String positions) {
        this.positions = positions
        return this
    }


    /**
     * 设置「关键词」值
     * @param val
     */
    AiKbChunkDTO setKeywords(String keywords) {
        this.keywords = keywords
        return this
    }


    /**
     * 设置「关键问题」值
     * @param val
     */
    AiKbChunkDTO setKeyQuestions(String keyQuestions) {
        this.keyQuestions = keyQuestions
        return this
    }


    /**
     * 设置「标签」值
     * 字典[标签集标签]
     * @param val
     */
    AiKbChunkDTO setTags(String tags) {
        this.tags = tags
        return this
    }


    /**
     * 设置「关键问题向量」值
     * @param val
     */
    AiKbChunkDTO setKeyQuestionsVector(Object keyQuestionsVector) {
        this.keyQuestionsVector = keyQuestionsVector
        return this
    }


    /**
     * 设置「块内容向量」值
     * @param val
     */
    AiKbChunkDTO setContentVector(Object contentVector) {
        this.contentVector = contentVector
        return this
    }


    /**
     * 设置「分块路径」值
     * @param val
     */
    AiKbChunkDTO setPath(String path) {
        this.path = path
        return this
    }


    /**
     * 设置「文档索引顺序」值
     * @param val
     */
    AiKbChunkDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「文档类型」值
     * 字典[知识库文档类型]
     * @param val
     */
    AiKbChunkDTO setDocumentType(String documentType) {
        this.documentType = documentType
        return this
    }


    /**
     * 设置「分块类型」值
     * 字典[文档分块类型]
     * @param val
     */
    AiKbChunkDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「源分块索引」值
     * @param val
     */
    AiKbChunkDTO setSourceIndices(List<String> sourceIndices) {
        this.sourceIndices = sourceIndices
        return this
    }


    /**
     * 设置「源分块计数」值
     * @param val
     */
    AiKbChunkDTO setSourceCount(Integer sourceCount) {
        this.sourceCount = sourceCount
        return this
    }


    /**
     * 设置「知识库标识」值
     * @param val
     */
    AiKbChunkDTO setKbId(String kbId) {
        this.kbId = kbId
        return this
    }


    /**
     * 设置「是否启用」值
     * 字典[是否]
     * @param val
     */
    AiKbChunkDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「知识库文档标识」值
     * @param val
     */
    AiKbChunkDTO setDocumentId(String documentId) {
        this.documentId = documentId
        return this
    }


    /**
     * 设置「知识库文档名称」值
     * @param val
     */
    AiKbChunkDTO setDocumentName(String documentName) {
        this.documentName = documentName
        return this
    }


    /**
     * 设置「父分块标识」值
     * @param val
     */
    AiKbChunkDTO setPid(String pid) {
        this.pid = pid
        return this
    }


    /**
     * 设置「用户标记」值
     * @param val
     */
    AiKbChunkDTO setUserTag(String userTag) {
        this.userTag = userTag
        return this
    }


    /**
     * 设置「用户标记2」值
     * @param val
     */
    AiKbChunkDTO setUserTag2(String userTag2) {
        this.userTag2 = userTag2
        return this
    }

}
