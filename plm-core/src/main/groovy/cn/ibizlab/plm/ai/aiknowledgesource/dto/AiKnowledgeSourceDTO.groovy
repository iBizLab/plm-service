package cn.ibizlab.plm.ai.aiknowledgesource.dto

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
class AiKnowledgeSourceDTO extends GroovyDTO<AiKnowledgeSourceDTO> {

    /**
     * 「知识库源标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「知识库源名称」
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
     * 「源类型」
     * 字典[知识库源类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「是否启用」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「API密钥」
     */
    @JsonProperty("api_key")
    String apiKey
    /**
     * 「接口URL」
     */
    @JsonProperty("base_url")
    String baseUrl
    /**
     * 「最后同步时间」
     */
    @JsonProperty("last_sync_time")
    Timestamp lastSyncTime

    /**
     * 设置「知识库源标识」值
     * @param val
     */
    AiKnowledgeSourceDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「知识库源名称」值
     * @param val
     */
    AiKnowledgeSourceDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKnowledgeSourceDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AiKnowledgeSourceDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKnowledgeSourceDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKnowledgeSourceDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「源类型」值
     * 字典[知识库源类型]
     * @param val
     */
    AiKnowledgeSourceDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「是否启用」值
     * 字典[是否]
     * @param val
     */
    AiKnowledgeSourceDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「API密钥」值
     * @param val
     */
    AiKnowledgeSourceDTO setApiKey(String apiKey) {
        this.apiKey = apiKey
        return this
    }


    /**
     * 设置「接口URL」值
     * @param val
     */
    AiKnowledgeSourceDTO setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl
        return this
    }


    /**
     * 设置「最后同步时间」值
     * @param val
     */
    AiKnowledgeSourceDTO setLastSyncTime(Timestamp lastSyncTime) {
        this.lastSyncTime = lastSyncTime
        return this
    }

}
