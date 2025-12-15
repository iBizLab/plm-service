package cn.ibizlab.plm.ai.aitool.dto

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
class AiToolDTO extends GroovyDTO<AiToolDTO> {

    /**
     * 「AI调用工具标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「AI调用工具名称」
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
     * 「工具标记」
     */
    @JsonProperty("tool_tag")
    String toolTag
    /**
     * 「访问密钥」
     */
    @JsonProperty("access_key")
    String accessKey
    /**
     * 「认证方式」
     * 字典[认证方式]
     */
    @JsonProperty("api_auth_type")
    String apiAuthType
    /**
     * 「请求头」
     */
    @JsonProperty("api_headers")
    String apiHeaders
    /**
     * 「HTTP 方法」
     * 字典[HTTP 方法]
     */
    @JsonProperty("api_method")
    String apiMethod
    /**
     * 「接口地址」
     */
    @JsonProperty("api_url")
    String apiUrl
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
     * 「输入参数 Schema」
     */
    @JsonProperty("input_schema")
    String inputSchema
    /**
     * 「安全密钥」
     */
    @JsonProperty("secret_key")
    String secretKey
    /**
     * 「超时时间」
     */
    @JsonProperty("timeout")
    Integer timeout
    /**
     * 「令牌地址」
     */
    @JsonProperty("token_url")
    String tokenUrl
    /**
     * 「工具类型」
     * 字典[Tool类型]
     */
    @JsonProperty("tool_type")
    String toolType

    /**
     * 设置「AI调用工具标识」值
     * @param val
     */
    AiToolDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「AI调用工具名称」值
     * @param val
     */
    AiToolDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiToolDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AiToolDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiToolDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiToolDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「api密钥」值
     * @param val
     */
    AiToolDTO setApiKey(String apiKey) {
        this.apiKey = apiKey
        return this
    }


    /**
     * 设置「工具标记」值
     * @param val
     */
    AiToolDTO setToolTag(String toolTag) {
        this.toolTag = toolTag
        return this
    }


    /**
     * 设置「访问密钥」值
     * @param val
     */
    AiToolDTO setAccessKey(String accessKey) {
        this.accessKey = accessKey
        return this
    }


    /**
     * 设置「认证方式」值
     * 字典[认证方式]
     * @param val
     */
    AiToolDTO setApiAuthType(String apiAuthType) {
        this.apiAuthType = apiAuthType
        return this
    }


    /**
     * 设置「请求头」值
     * @param val
     */
    AiToolDTO setApiHeaders(String apiHeaders) {
        this.apiHeaders = apiHeaders
        return this
    }


    /**
     * 设置「HTTP 方法」值
     * 字典[HTTP 方法]
     * @param val
     */
    AiToolDTO setApiMethod(String apiMethod) {
        this.apiMethod = apiMethod
        return this
    }


    /**
     * 设置「接口地址」值
     * @param val
     */
    AiToolDTO setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl
        return this
    }


    /**
     * 设置「Bearer令牌」值
     * @param val
     */
    AiToolDTO setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken
        return this
    }


    /**
     * 设置「客户端ID」值
     * @param val
     */
    AiToolDTO setClientId(String clientId) {
        this.clientId = clientId
        return this
    }


    /**
     * 设置「客户端密钥」值
     * @param val
     */
    AiToolDTO setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret
        return this
    }


    /**
     * 设置「输入参数 Schema」值
     * @param val
     */
    AiToolDTO setInputSchema(String inputSchema) {
        this.inputSchema = inputSchema
        return this
    }


    /**
     * 设置「安全密钥」值
     * @param val
     */
    AiToolDTO setSecretKey(String secretKey) {
        this.secretKey = secretKey
        return this
    }


    /**
     * 设置「超时时间」值
     * @param val
     */
    AiToolDTO setTimeout(Integer timeout) {
        this.timeout = timeout
        return this
    }


    /**
     * 设置「令牌地址」值
     * @param val
     */
    AiToolDTO setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl
        return this
    }


    /**
     * 设置「工具类型」值
     * 字典[Tool类型]
     * @param val
     */
    AiToolDTO setToolType(String toolType) {
        this.toolType = toolType
        return this
    }

}
