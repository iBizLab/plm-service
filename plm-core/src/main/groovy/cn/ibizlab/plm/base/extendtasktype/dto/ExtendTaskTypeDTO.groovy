package cn.ibizlab.plm.base.extendtasktype.dto

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
class ExtendTaskTypeDTO extends GroovyDTO<ExtendTaskTypeDTO> {

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
     * 「执行器类型」
     * 字典[执行器类型]
     */
    @JsonProperty("executor_type")
    String executorType
    /**
     * 「执行器子类型」
     * 字典[执行器子类型]
     */
    @JsonProperty("executor_subtype")
    String executorSubtype
    /**
     * 「执行器标记」
     */
    @JsonProperty("executor_tag")
    String executorTag
    /**
     * 「执行器配置」
     */
    @JsonProperty("executor_config")
    String executorConfig
    /**
     * 「执行代码」
     */
    @JsonProperty("code")
    String code
    /**
     * 「是否允许重试」
     * 字典[是否]
     */
    @JsonProperty("retryable")
    Integer retryable
    /**
     * 「默认最大重试次数」
     */
    @JsonProperty("max_retry")
    Integer maxRetry
    /**
     * 「任务超时时间（秒）」
     */
    @JsonProperty("timeout_sec")
    Integer timeoutSec
    /**
     * 「详细说明」
     */
    @JsonProperty("description")
    String description
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
     * 设置「标识」值
     * @param val
     */
    ExtendTaskTypeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ExtendTaskTypeDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「执行器类型」值
     * 字典[执行器类型]
     * @param val
     */
    ExtendTaskTypeDTO setExecutorType(String executorType) {
        this.executorType = executorType
        return this
    }


    /**
     * 设置「执行器子类型」值
     * 字典[执行器子类型]
     * @param val
     */
    ExtendTaskTypeDTO setExecutorSubtype(String executorSubtype) {
        this.executorSubtype = executorSubtype
        return this
    }


    /**
     * 设置「执行器标记」值
     * @param val
     */
    ExtendTaskTypeDTO setExecutorTag(String executorTag) {
        this.executorTag = executorTag
        return this
    }


    /**
     * 设置「执行器配置」值
     * @param val
     */
    ExtendTaskTypeDTO setExecutorConfig(String executorConfig) {
        this.executorConfig = executorConfig
        return this
    }


    /**
     * 设置「执行代码」值
     * @param val
     */
    ExtendTaskTypeDTO setCode(String code) {
        this.code = code
        return this
    }


    /**
     * 设置「是否允许重试」值
     * 字典[是否]
     * @param val
     */
    ExtendTaskTypeDTO setRetryable(Integer retryable) {
        this.retryable = retryable
        return this
    }


    /**
     * 设置「默认最大重试次数」值
     * @param val
     */
    ExtendTaskTypeDTO setMaxRetry(Integer maxRetry) {
        this.maxRetry = maxRetry
        return this
    }


    /**
     * 设置「任务超时时间（秒）」值
     * @param val
     */
    ExtendTaskTypeDTO setTimeoutSec(Integer timeoutSec) {
        this.timeoutSec = timeoutSec
        return this
    }


    /**
     * 设置「详细说明」值
     * @param val
     */
    ExtendTaskTypeDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    ExtendTaskTypeDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    ExtendTaskTypeDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ExtendTaskTypeDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ExtendTaskTypeDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
