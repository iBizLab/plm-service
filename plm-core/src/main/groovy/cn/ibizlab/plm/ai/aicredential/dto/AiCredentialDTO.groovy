package cn.ibizlab.plm.ai.aicredential.dto

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
class AiCredentialDTO extends GroovyDTO<AiCredentialDTO> {

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
     * 「api密钥」
     */
    @JsonProperty("api_key")
    String apiKey
    /**
     * 「访问密钥」
     */
    @JsonProperty("access_key")
    String accessKey
    /**
     * 「启用凭证」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「Bearer令牌」
     */
    @JsonProperty("bearer_token")
    String bearerToken
    /**
     * 「客户端ID」
     */
    @JsonProperty("client_id")
    String clientId
    /**
     * 「客户端密钥」
     */
    @JsonProperty("client_secret")
    String clientSecret
    /**
     * 「代码标识」
     */
    @JsonProperty("code_name")
    String codeName
    /**
     * 「凭证类型」
     * 字典[凭证类型]
     */
    @JsonProperty("credential_type")
    String credentialType
    /**
     * 「用途说明」
     */
    @JsonProperty("description")
    String description
    /**
     * 「模型提供商」
     * 字典[AI模型提供商]
     */
    @JsonProperty("provider")
    String provider
    /**
     * 「区域」
     */
    @JsonProperty("region")
    String region
    /**
     * 「权限范围」
     */
    @JsonProperty("scope")
    String scope
    /**
     * 「安全密钥」
     */
    @JsonProperty("secret_key")
    String secretKey
    /**
     * 「令牌地址」
     */
    @JsonProperty("token_url")
    String tokenUrl

    /**
     * 设置「标识」值
     * @param val
     */
    AiCredentialDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiCredentialDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiCredentialDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AiCredentialDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiCredentialDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiCredentialDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「api密钥」值
     * @param val
     */
    AiCredentialDTO setApiKey(String apiKey) {
        this.apiKey = apiKey
        return this
    }


    /**
     * 设置「访问密钥」值
     * @param val
     */
    AiCredentialDTO setAccessKey(String accessKey) {
        this.accessKey = accessKey
        return this
    }


    /**
     * 设置「启用凭证」值
     * 字典[是否]
     * @param val
     */
    AiCredentialDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「Bearer令牌」值
     * @param val
     */
    AiCredentialDTO setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken
        return this
    }


    /**
     * 设置「客户端ID」值
     * @param val
     */
    AiCredentialDTO setClientId(String clientId) {
        this.clientId = clientId
        return this
    }


    /**
     * 设置「客户端密钥」值
     * @param val
     */
    AiCredentialDTO setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret
        return this
    }


    /**
     * 设置「代码标识」值
     * @param val
     */
    AiCredentialDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }


    /**
     * 设置「凭证类型」值
     * 字典[凭证类型]
     * @param val
     */
    AiCredentialDTO setCredentialType(String credentialType) {
        this.credentialType = credentialType
        return this
    }


    /**
     * 设置「用途说明」值
     * @param val
     */
    AiCredentialDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「模型提供商」值
     * 字典[AI模型提供商]
     * @param val
     */
    AiCredentialDTO setProvider(String provider) {
        this.provider = provider
        return this
    }


    /**
     * 设置「区域」值
     * @param val
     */
    AiCredentialDTO setRegion(String region) {
        this.region = region
        return this
    }


    /**
     * 设置「权限范围」值
     * @param val
     */
    AiCredentialDTO setScope(String scope) {
        this.scope = scope
        return this
    }


    /**
     * 设置「安全密钥」值
     * @param val
     */
    AiCredentialDTO setSecretKey(String secretKey) {
        this.secretKey = secretKey
        return this
    }


    /**
     * 设置「令牌地址」值
     * @param val
     */
    AiCredentialDTO setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl
        return this
    }

}
