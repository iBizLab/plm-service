package cn.ibizlab.plm.ai.aikbgraphrelationchunk.dto

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
class AiKbGraphRelationChunkDTO extends GroovyDTO<AiKbGraphRelationChunkDTO> {

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
     * 「分块标识」
     */
    @JsonProperty("chunk_id")
    String chunkId
    /**
     * 「关系标识」
     */
    @JsonProperty("relation_id")
    String relationId

    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbGraphRelationChunkDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AiKbGraphRelationChunkDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbGraphRelationChunkDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKbGraphRelationChunkDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    AiKbGraphRelationChunkDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiKbGraphRelationChunkDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「分块标识」值
     * @param val
     */
    AiKbGraphRelationChunkDTO setChunkId(String chunkId) {
        this.chunkId = chunkId
        return this
    }


    /**
     * 设置「关系标识」值
     * @param val
     */
    AiKbGraphRelationChunkDTO setRelationId(String relationId) {
        this.relationId = relationId
        return this
    }

}
