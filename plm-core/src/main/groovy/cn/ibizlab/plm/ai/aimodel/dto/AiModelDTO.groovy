package cn.ibizlab.plm.ai.aimodel.dto

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
class AiModelDTO extends GroovyDTO<AiModelDTO> {

    /**
     * 「模型标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「模型名称」
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
     * 「启用该模型」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「模型提供商」
     * 字典[AI模型提供商]
     */
    @JsonProperty("provider")
    String provider
    /**
     * 「模型 API 地址」
     */
    @JsonProperty("api_base_url")
    String apiBaseUrl
    /**
     * 「模型类别」
     * 字典[模型类别]
     */
    @JsonProperty("model_category")
    String modelCategory
    /**
     * 「模型能力」
     * 字典[模型能力]
     */
    @JsonProperty("model_capability")
    String modelCapability
    /**
     * 「最大上下文长度（token）」
     */
    @JsonProperty("max_context_tokens")
    Integer maxContextTokens
    /**
     * 「最大输出长度」
     */
    @JsonProperty("max_output_tokens")
    Integer maxOutputTokens
    /**
     * 「模型额外参数」
     */
    @JsonProperty("extra_params")
    String extraParams
    /**
     * 「多模态图片解析」
     * 字典[是否]
     */
    @JsonProperty("desc_oss_image")
    Integer descOssImage
    /**
     * 「AI凭证标识」
     */
    @JsonProperty("ai_credential_id")
    String aiCredentialId
    /**
     * 「AI凭证名称」
     */
    @JsonProperty("ai_credential_name")
    String aiCredentialName
    /**
     * 「模型标识」
     */
    @JsonProperty("code_name")
    String codeName

    /**
     * 设置「模型标识」值
     * @param val
     */
    AiModelDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「模型名称」值
     * @param val
     */
    AiModelDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiModelDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AiModelDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiModelDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiModelDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「启用该模型」值
     * 字典[是否]
     * @param val
     */
    AiModelDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「模型提供商」值
     * 字典[AI模型提供商]
     * @param val
     */
    AiModelDTO setProvider(String provider) {
        this.provider = provider
        return this
    }


    /**
     * 设置「模型 API 地址」值
     * @param val
     */
    AiModelDTO setApiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl
        return this
    }


    /**
     * 设置「模型类别」值
     * 字典[模型类别]
     * @param val
     */
    AiModelDTO setModelCategory(String modelCategory) {
        this.modelCategory = modelCategory
        return this
    }


    /**
     * 设置「模型能力」值
     * 字典[模型能力]
     * @param val
     */
    AiModelDTO setModelCapability(String modelCapability) {
        this.modelCapability = modelCapability
        return this
    }


    /**
     * 设置「最大上下文长度（token）」值
     * @param val
     */
    AiModelDTO setMaxContextTokens(Integer maxContextTokens) {
        this.maxContextTokens = maxContextTokens
        return this
    }


    /**
     * 设置「最大输出长度」值
     * @param val
     */
    AiModelDTO setMaxOutputTokens(Integer maxOutputTokens) {
        this.maxOutputTokens = maxOutputTokens
        return this
    }


    /**
     * 设置「模型额外参数」值
     * @param val
     */
    AiModelDTO setExtraParams(String extraParams) {
        this.extraParams = extraParams
        return this
    }


    /**
     * 设置「多模态图片解析」值
     * 字典[是否]
     * @param val
     */
    AiModelDTO setDescOssImage(Integer descOssImage) {
        this.descOssImage = descOssImage
        return this
    }


    /**
     * 设置「AI凭证标识」值
     * @param val
     */
    AiModelDTO setAiCredentialId(String aiCredentialId) {
        this.aiCredentialId = aiCredentialId
        return this
    }


    /**
     * 设置「AI凭证名称」值
     * @param val
     */
    AiModelDTO setAiCredentialName(String aiCredentialName) {
        this.aiCredentialName = aiCredentialName
        return this
    }


    /**
     * 设置「模型标识」值
     * @param val
     */
    AiModelDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }

}
