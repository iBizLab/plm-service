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
    List<String> keywords
    /**
     * 「关键问题」
     */
    @JsonProperty("key_questions")
    List<String> keyQuestions
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
    AiKbChunkDTO setKeywords(List<String> keywords) {
        this.keywords = keywords
        return this
    }


    /**
     * 设置「关键问题」值
     * @param val
     */
    AiKbChunkDTO setKeyQuestions(List<String> keyQuestions) {
        this.keyQuestions = keyQuestions
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

}
