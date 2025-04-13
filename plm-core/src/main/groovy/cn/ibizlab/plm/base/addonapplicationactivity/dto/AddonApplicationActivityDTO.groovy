package cn.ibizlab.plm.base.addonapplicationactivity.dto

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
class AddonApplicationActivityDTO extends GroovyDTO<AddonApplicationActivityDTO> {

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
     * 「父标识」
     */
    @JsonProperty("pid")
    String pid
    /**
     * 「级别」
     */
    @JsonProperty("level")
    String level
    /**
     * 「操作」
     */
    @JsonProperty("action")
    String action
    /**
     * 「调试日志信息」
     */
    @JsonProperty("debug_info")
    String debugInfo
    /**
     * 「日志信息」
     */
    @JsonProperty("info")
    String info
    /**
     * 「系统标识」
     */
    @JsonProperty("system_id")
    String systemId
    /**
     * 「起始时间」
     */
    @JsonProperty("start_at")
    Timestamp startAt
    /**
     * 「结束时间」
     */
    @JsonProperty("end_at")
    Timestamp endAt
    /**
     * 「持续时间」
     */
    @JsonProperty("elapsed_time")
    Integer elapsedTime
    /**
     * 「状态」
     */
    @JsonProperty("state")
    String state
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
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
    AddonApplicationActivityDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AddonApplicationActivityDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    AddonApplicationActivityDTO setPid(String pid) {
        this.pid = pid
        return this
    }


    /**
     * 设置「级别」值
     * @param val
     */
    AddonApplicationActivityDTO setLevel(String level) {
        this.level = level
        return this
    }


    /**
     * 设置「操作」值
     * @param val
     */
    AddonApplicationActivityDTO setAction(String action) {
        this.action = action
        return this
    }


    /**
     * 设置「调试日志信息」值
     * @param val
     */
    AddonApplicationActivityDTO setDebugInfo(String debugInfo) {
        this.debugInfo = debugInfo
        return this
    }


    /**
     * 设置「日志信息」值
     * @param val
     */
    AddonApplicationActivityDTO setInfo(String info) {
        this.info = info
        return this
    }


    /**
     * 设置「系统标识」值
     * @param val
     */
    AddonApplicationActivityDTO setSystemId(String systemId) {
        this.systemId = systemId
        return this
    }


    /**
     * 设置「起始时间」值
     * @param val
     */
    AddonApplicationActivityDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「结束时间」值
     * @param val
     */
    AddonApplicationActivityDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「持续时间」值
     * @param val
     */
    AddonApplicationActivityDTO setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime
        return this
    }


    /**
     * 设置「状态」值
     * @param val
     */
    AddonApplicationActivityDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AddonApplicationActivityDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AddonApplicationActivityDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AddonApplicationActivityDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AddonApplicationActivityDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
