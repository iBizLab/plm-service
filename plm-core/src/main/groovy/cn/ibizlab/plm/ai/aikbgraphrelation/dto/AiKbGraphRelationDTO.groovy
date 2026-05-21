package cn.ibizlab.plm.ai.aikbgraphrelation.dto

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
class AiKbGraphRelationDTO extends GroovyDTO<AiKbGraphRelationDTO> {

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
     * 「关系标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「关系名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「主体标识」
     */
    @JsonProperty("subject_id")
    String subjectId
    /**
     * 「客体标识」
     */
    @JsonProperty("object_id")
    String objectId
    /**
     * 「关系谓词」
     */
    @JsonProperty("predicate")
    String predicate
    /**
     * 「置信度」
     */
    @JsonProperty("confidence")
    BigDecimal confidence
    /**
     * 「知识库标识」
     */
    @JsonProperty("kb_id")
    String kbId
    /**
     * 「主体名称」
     */
    @JsonProperty("subject_name")
    String subjectName
    /**
     * 「客体名称」
     */
    @JsonProperty("object_name")
    String objectName
    /**
     * 「知识库名称」
     */
    @JsonProperty("kb_name")
    String kbName
    /**
     * 「描述向量」
     */
    @JsonProperty("description_vector")
    Object descriptionVector
    /**
     * 「是否启用」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description

    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbGraphRelationDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AiKbGraphRelationDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbGraphRelationDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKbGraphRelationDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「关系标识」值
     * @param val
     */
    AiKbGraphRelationDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「关系名称」值
     * @param val
     */
    AiKbGraphRelationDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「主体标识」值
     * @param val
     */
    AiKbGraphRelationDTO setSubjectId(String subjectId) {
        this.subjectId = subjectId
        return this
    }


    /**
     * 设置「客体标识」值
     * @param val
     */
    AiKbGraphRelationDTO setObjectId(String objectId) {
        this.objectId = objectId
        return this
    }


    /**
     * 设置「关系谓词」值
     * @param val
     */
    AiKbGraphRelationDTO setPredicate(String predicate) {
        this.predicate = predicate
        return this
    }


    /**
     * 设置「置信度」值
     * @param val
     */
    AiKbGraphRelationDTO setConfidence(BigDecimal confidence) {
        this.confidence = confidence
        return this
    }


    /**
     * 设置「知识库标识」值
     * @param val
     */
    AiKbGraphRelationDTO setKbId(String kbId) {
        this.kbId = kbId
        return this
    }


    /**
     * 设置「主体名称」值
     * @param val
     */
    AiKbGraphRelationDTO setSubjectName(String subjectName) {
        this.subjectName = subjectName
        return this
    }


    /**
     * 设置「客体名称」值
     * @param val
     */
    AiKbGraphRelationDTO setObjectName(String objectName) {
        this.objectName = objectName
        return this
    }


    /**
     * 设置「知识库名称」值
     * @param val
     */
    AiKbGraphRelationDTO setKbName(String kbName) {
        this.kbName = kbName
        return this
    }


    /**
     * 设置「描述向量」值
     * @param val
     */
    AiKbGraphRelationDTO setDescriptionVector(Object descriptionVector) {
        this.descriptionVector = descriptionVector
        return this
    }


    /**
     * 设置「是否启用」值
     * 字典[是否]
     * @param val
     */
    AiKbGraphRelationDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    AiKbGraphRelationDTO setDescription(String description) {
        this.description = description
        return this
    }

}
