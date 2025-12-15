package cn.ibizlab.plm.base.extendschedule.dto

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
class ExtendScheduleDTO extends GroovyDTO<ExtendScheduleDTO> {

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
     * 「调度类型」
     * 字典[调度类型]
     */
    @JsonProperty("schedule_type")
    String scheduleType
    /**
     * 「定时器策略」
     */
    @JsonProperty("timer_policy")
    String timerPolicy
    /**
     * 「下一次执行时间」
     */
    @JsonProperty("next_trigger_time")
    Timestamp nextTriggerTime
    /**
     * 「任务类型」
     */
    @JsonProperty("task_type")
    String taskType
    /**
     * 「任务类型名称」
     */
    @JsonProperty("task_type_name")
    String taskTypeName
    /**
     * 「任务执行参数」
     */
    @JsonProperty("payload")
    String payload
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
     * 「逻辑有效标识」
     */
    @JsonProperty("enable")
    Integer enable
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
    ExtendScheduleDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ExtendScheduleDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「调度类型」值
     * 字典[调度类型]
     * @param val
     */
    ExtendScheduleDTO setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType
        return this
    }


    /**
     * 设置「定时器策略」值
     * @param val
     */
    ExtendScheduleDTO setTimerPolicy(String timerPolicy) {
        this.timerPolicy = timerPolicy
        return this
    }


    /**
     * 设置「下一次执行时间」值
     * @param val
     */
    ExtendScheduleDTO setNextTriggerTime(Timestamp nextTriggerTime) {
        this.nextTriggerTime = nextTriggerTime
        return this
    }


    /**
     * 设置「任务类型」值
     * @param val
     */
    ExtendScheduleDTO setTaskType(String taskType) {
        this.taskType = taskType
        return this
    }


    /**
     * 设置「任务类型名称」值
     * @param val
     */
    ExtendScheduleDTO setTaskTypeName(String taskTypeName) {
        this.taskTypeName = taskTypeName
        return this
    }


    /**
     * 设置「任务执行参数」值
     * @param val
     */
    ExtendScheduleDTO setPayload(String payload) {
        this.payload = payload
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ExtendScheduleDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「任务主体标识」值
     * @param val
     */
    ExtendScheduleDTO setPrincipalId(String principalId) {
        this.principalId = principalId
        return this
    }


    /**
     * 设置「任务主体名称」值
     * @param val
     */
    ExtendScheduleDTO setPrincipalName(String principalName) {
        this.principalName = principalName
        return this
    }


    /**
     * 设置「任务主体类型」值
     * @param val
     */
    ExtendScheduleDTO setPrincipalType(String principalType) {
        this.principalType = principalType
        return this
    }


    /**
     * 设置「逻辑有效标识」值
     * @param val
     */
    ExtendScheduleDTO setEnable(Integer enable) {
        this.enable = enable
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    ExtendScheduleDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    ExtendScheduleDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ExtendScheduleDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ExtendScheduleDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
