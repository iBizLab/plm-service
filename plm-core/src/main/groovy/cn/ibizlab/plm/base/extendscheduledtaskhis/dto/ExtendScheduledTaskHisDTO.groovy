package cn.ibizlab.plm.base.extendscheduledtaskhis.dto

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
class ExtendScheduledTaskHisDTO extends GroovyDTO<ExtendScheduledTaskHisDTO> {

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
     * 「逻辑有效标识」
     */
    @JsonProperty("enable")
    Integer enable
    /**
     * 「任务类型」
     */
    @JsonProperty("task_type_name")
    String taskTypeName
    /**
     * 「任务类型」
     */
    @JsonProperty("task_type")
    String taskType
    /**
     * 「任务状态」
     * 字典[任务状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「已重试次数」
     */
    @JsonProperty("retry_count")
    Integer retryCount
    /**
     * 「最大重试次数」
     */
    @JsonProperty("max_retry")
    Integer maxRetry
    /**
     * 「任务执行参数」
     */
    @JsonProperty("payload")
    String payload
    /**
     * 「执行信息」
     */
    @JsonProperty("result_message")
    String resultMessage
    /**
     * 「执行结果」
     */
    @JsonProperty("result")
    String result
    /**
     * 「计划执行时间」
     */
    @JsonProperty("scheduled_at")
    Timestamp scheduledAt
    /**
     * 「执行完成时间」
     */
    @JsonProperty("finished_at")
    Timestamp finishedAt
    /**
     * 「实际开始时间」
     */
    @JsonProperty("started_at")
    Timestamp startedAt
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「任务主体标识」
     */
    @JsonProperty("principal_id")
    String principalId
    /**
     * 「任务主体名称」
     */
    @JsonProperty("principal_name")
    String principalName
    /**
     * 「任务主体类型」
     */
    @JsonProperty("principal_type")
    String principalType
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
    ExtendScheduledTaskHisDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「逻辑有效标识」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setEnable(Integer enable) {
        this.enable = enable
        return this
    }


    /**
     * 设置「任务类型」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setTaskTypeName(String taskTypeName) {
        this.taskTypeName = taskTypeName
        return this
    }


    /**
     * 设置「任务类型」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setTaskType(String taskType) {
        this.taskType = taskType
        return this
    }


    /**
     * 设置「任务状态」值
     * 字典[任务状态]
     * @param val
     */
    ExtendScheduledTaskHisDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「已重试次数」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setRetryCount(Integer retryCount) {
        this.retryCount = retryCount
        return this
    }


    /**
     * 设置「最大重试次数」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setMaxRetry(Integer maxRetry) {
        this.maxRetry = maxRetry
        return this
    }


    /**
     * 设置「任务执行参数」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setPayload(String payload) {
        this.payload = payload
        return this
    }


    /**
     * 设置「执行信息」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage
        return this
    }


    /**
     * 设置「执行结果」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setResult(String result) {
        this.result = result
        return this
    }


    /**
     * 设置「计划执行时间」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setScheduledAt(Timestamp scheduledAt) {
        this.scheduledAt = scheduledAt
        return this
    }


    /**
     * 设置「执行完成时间」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setFinishedAt(Timestamp finishedAt) {
        this.finishedAt = finishedAt
        return this
    }


    /**
     * 设置「实际开始时间」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setStartedAt(Timestamp startedAt) {
        this.startedAt = startedAt
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「任务主体标识」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setPrincipalId(String principalId) {
        this.principalId = principalId
        return this
    }


    /**
     * 设置「任务主体名称」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setPrincipalName(String principalName) {
        this.principalName = principalName
        return this
    }


    /**
     * 设置「任务主体类型」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setPrincipalType(String principalType) {
        this.principalType = principalType
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    ExtendScheduledTaskHisDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ExtendScheduledTaskHisDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ExtendScheduledTaskHisDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
