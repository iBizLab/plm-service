package cn.ibizlab.plm.ai.aikbgraphentity.dto

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
class AiKbGraphEntityDTO extends GroovyDTO<AiKbGraphEntityDTO> {

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
     * 「实体标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「类型」
     * 字典[图谱实体类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「规范名称」
     */
    @JsonProperty("normalized_name")
    String normalizedName
    /**
     * 「置信度」
     */
    @JsonProperty("confidence")
    BigDecimal confidence
    /**
     * 「上下文」
     */
    @JsonProperty("context")
    String context
    /**
     * 「关键词」
     */
    @JsonProperty("keywords")
    String keywords
    /**
     * 「知识库标识」
     */
    @JsonProperty("kb_id")
    String kbId
    /**
     * 「知识库名称」
     */
    @JsonProperty("kb_name")
    String kbName
    /**
     * 「上下文向量」
     */
    @JsonProperty("context_vector")
    Object contextVector
    /**
     * 「描述向量」
     */
    @JsonProperty("description_vector")
    Object descriptionVector
    /**
     * 「引用类型」
     * 字典[图实体引用类型]
     */
    @JsonProperty("reference_type")
    String referenceType
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
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
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbGraphEntityDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AiKbGraphEntityDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbGraphEntityDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKbGraphEntityDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「实体标识」值
     * @param val
     */
    AiKbGraphEntityDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiKbGraphEntityDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「类型」值
     * 字典[图谱实体类型]
     * @param val
     */
    AiKbGraphEntityDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「规范名称」值
     * @param val
     */
    AiKbGraphEntityDTO setNormalizedName(String normalizedName) {
        this.normalizedName = normalizedName
        return this
    }


    /**
     * 设置「置信度」值
     * @param val
     */
    AiKbGraphEntityDTO setConfidence(BigDecimal confidence) {
        this.confidence = confidence
        return this
    }


    /**
     * 设置「上下文」值
     * @param val
     */
    AiKbGraphEntityDTO setContext(String context) {
        this.context = context
        return this
    }


    /**
     * 设置「关键词」值
     * @param val
     */
    AiKbGraphEntityDTO setKeywords(String keywords) {
        this.keywords = keywords
        return this
    }


    /**
     * 设置「知识库标识」值
     * @param val
     */
    AiKbGraphEntityDTO setKbId(String kbId) {
        this.kbId = kbId
        return this
    }


    /**
     * 设置「知识库名称」值
     * @param val
     */
    AiKbGraphEntityDTO setKbName(String kbName) {
        this.kbName = kbName
        return this
    }


    /**
     * 设置「上下文向量」值
     * @param val
     */
    AiKbGraphEntityDTO setContextVector(Object contextVector) {
        this.contextVector = contextVector
        return this
    }


    /**
     * 设置「描述向量」值
     * @param val
     */
    AiKbGraphEntityDTO setDescriptionVector(Object descriptionVector) {
        this.descriptionVector = descriptionVector
        return this
    }


    /**
     * 设置「引用类型」值
     * 字典[图实体引用类型]
     * @param val
     */
    AiKbGraphEntityDTO setReferenceType(String referenceType) {
        this.referenceType = referenceType
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    AiKbGraphEntityDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「知识库文档标识」值
     * @param val
     */
    AiKbGraphEntityDTO setDocumentId(String documentId) {
        this.documentId = documentId
        return this
    }


    /**
     * 设置「知识库文档名称」值
     * @param val
     */
    AiKbGraphEntityDTO setDocumentName(String documentName) {
        this.documentName = documentName
        return this
    }

}
