package cn.ibizlab.plm.extension.psdenotify.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.extension.psdenotifytarget.dto.PSDENotifyTargetDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class PSDENotifyDTO extends GroovyDTO<PSDENotifyDTO> {

    /**
     * 「通知目标」
     */
    @JsonProperty("psdenotifytargets")
    List<PSDENotifyTargetDTO> pSDENotifyTargets
    /**
     * 「开始时间属性」
     */
    @JsonProperty("beginpsdefid")
    String beginPSDEFId
    /**
     * 「开始时间属性」
     */
    @JsonProperty("beginpsdefname")
    String beginPSDEFName
    /**
     * 「检查间隔」
     */
    @JsonProperty("checktimer")
    Integer checkTimer
    /**
     * 「代码名称」
     */
    @JsonProperty("codename")
    String codeName
    /**
     * 「自定义条件」
     */
    @JsonProperty("customcond")
    String customCond
    /**
     * 「结束时间属性」
     */
    @JsonProperty("endpsdefid")
    String endPSDEFId
    /**
     * 「结束时间属性」
     */
    @JsonProperty("endpsdefname")
    String endPSDEFName
    /**
     * 「监控事件集」
     */
    @JsonProperty("events")
    String events
    /**
     * 「监控变化属性集」
     */
    @JsonProperty("fields")
    String fields
    /**
     * 「通知消息类型」
     * 字典[通知消息类型]
     */
    @JsonProperty("msgtype")
    Integer msgType
    /**
     * 「延后通知间隔」
     */
    @JsonProperty("notifyend")
    Integer notifyEnd
    /**
     * 「提前通知间隔」
     */
    @JsonProperty("notifystart")
    Integer notifyStart
    /**
     * 「通知子类」
     * 字典[通知子类]
     */
    @JsonProperty("notifysubtype")
    String notifySubType
    /**
     * 「通知标记」
     */
    @JsonProperty("notifytag")
    String notifyTag
    /**
     * 「通知标记2」
     */
    @JsonProperty("notifytag2")
    String notifyTag2
    /**
     * 「实体数据集」
     */
    @JsonProperty("psdedsid")
    String pSDEDSId
    /**
     * 「实体数据集」
     */
    @JsonProperty("psdedsname")
    String pSDEDSName
    /**
     * 「实体」
     */
    @JsonProperty("psdeid")
    String pSDEId
    /**
     * 「实体」
     */
    @JsonProperty("psdename")
    String pSDEName
    /**
     * 「实体通知标识」
     */
    @JsonProperty("psdenotifyid")
    String pSDENotifyId
    /**
     * 「实体通知名称」
     */
    @JsonProperty("psdenotifyname")
    String pSDENotifyName
    /**
     * 「系统消息队列」
     */
    @JsonProperty("pssysmsgqueueid")
    String pSSysMsgQueueId
    /**
     * 「系统消息队列」
     */
    @JsonProperty("pssysmsgqueuename")
    String pSSysMsgQueueName
    /**
     * 「系统消息模板」
     */
    @JsonProperty("pssysmsgtemplid")
    String pSSysMsgTemplId
    /**
     * 「系统消息模板」
     */
    @JsonProperty("pssysmsgtemplname")
    String pSSysMsgTemplName
    /**
     * 「后端模板插件」
     */
    @JsonProperty("pssyssfpluginid")
    String pSSysSFPluginId
    /**
     * 「后端模板插件」
     */
    @JsonProperty("pssyssfpluginname")
    String pSSysSFPluginName
    /**
     * 「附加任务模式」
     */
    @JsonProperty("taskmode")
    Integer taskMode
    /**
     * 「定时触发模式」
     * 字典[是否]
     */
    @JsonProperty("timermode")
    Integer timerMode
    /**
     * 「用户标识」
     */
    @JsonProperty("usertag")
    String userTag
    /**
     * 「用户标识2」
     */
    @JsonProperty("usertag2")
    String userTag2
    /**
     * 「用户标识3」
     */
    @JsonProperty("usertag3")
    String userTag3
    /**
     * 「用户标识4」
     */
    @JsonProperty("usertag4")
    String userTag4
    /**
     * 「启用」
     * 字典[是否]
     */
    @JsonProperty("validflag")
    Integer validFlag
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
     * 设置「通知目标」值
     * @param val
     */
    PSDENotifyDTO setPSDENotifyTargets(List<PSDENotifyTargetDTO> pSDENotifyTargets) {
        this.pSDENotifyTargets = pSDENotifyTargets
        return this
    }


    /**
     * 设置「开始时间属性」值
     * @param val
     */
    PSDENotifyDTO setBeginPSDEFId(String beginPSDEFId) {
        this.beginPSDEFId = beginPSDEFId
        return this
    }


    /**
     * 设置「开始时间属性」值
     * @param val
     */
    PSDENotifyDTO setBeginPSDEFName(String beginPSDEFName) {
        this.beginPSDEFName = beginPSDEFName
        return this
    }


    /**
     * 设置「检查间隔」值
     * @param val
     */
    PSDENotifyDTO setCheckTimer(Integer checkTimer) {
        this.checkTimer = checkTimer
        return this
    }


    /**
     * 设置「代码名称」值
     * @param val
     */
    PSDENotifyDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }


    /**
     * 设置「自定义条件」值
     * @param val
     */
    PSDENotifyDTO setCustomCond(String customCond) {
        this.customCond = customCond
        return this
    }


    /**
     * 设置「结束时间属性」值
     * @param val
     */
    PSDENotifyDTO setEndPSDEFId(String endPSDEFId) {
        this.endPSDEFId = endPSDEFId
        return this
    }


    /**
     * 设置「结束时间属性」值
     * @param val
     */
    PSDENotifyDTO setEndPSDEFName(String endPSDEFName) {
        this.endPSDEFName = endPSDEFName
        return this
    }


    /**
     * 设置「监控事件集」值
     * @param val
     */
    PSDENotifyDTO setEvents(String events) {
        this.events = events
        return this
    }


    /**
     * 设置「监控变化属性集」值
     * @param val
     */
    PSDENotifyDTO setFields(String fields) {
        this.fields = fields
        return this
    }


    /**
     * 设置「通知消息类型」值
     * 字典[通知消息类型]
     * @param val
     */
    PSDENotifyDTO setMsgType(Integer msgType) {
        this.msgType = msgType
        return this
    }


    /**
     * 设置「延后通知间隔」值
     * @param val
     */
    PSDENotifyDTO setNotifyEnd(Integer notifyEnd) {
        this.notifyEnd = notifyEnd
        return this
    }


    /**
     * 设置「提前通知间隔」值
     * @param val
     */
    PSDENotifyDTO setNotifyStart(Integer notifyStart) {
        this.notifyStart = notifyStart
        return this
    }


    /**
     * 设置「通知子类」值
     * 字典[通知子类]
     * @param val
     */
    PSDENotifyDTO setNotifySubType(String notifySubType) {
        this.notifySubType = notifySubType
        return this
    }


    /**
     * 设置「通知标记」值
     * @param val
     */
    PSDENotifyDTO setNotifyTag(String notifyTag) {
        this.notifyTag = notifyTag
        return this
    }


    /**
     * 设置「通知标记2」值
     * @param val
     */
    PSDENotifyDTO setNotifyTag2(String notifyTag2) {
        this.notifyTag2 = notifyTag2
        return this
    }


    /**
     * 设置「实体数据集」值
     * @param val
     */
    PSDENotifyDTO setPSDEDSId(String pSDEDSId) {
        this.pSDEDSId = pSDEDSId
        return this
    }


    /**
     * 设置「实体数据集」值
     * @param val
     */
    PSDENotifyDTO setPSDEDSName(String pSDEDSName) {
        this.pSDEDSName = pSDEDSName
        return this
    }


    /**
     * 设置「实体」值
     * @param val
     */
    PSDENotifyDTO setPSDEId(String pSDEId) {
        this.pSDEId = pSDEId
        return this
    }


    /**
     * 设置「实体」值
     * @param val
     */
    PSDENotifyDTO setPSDEName(String pSDEName) {
        this.pSDEName = pSDEName
        return this
    }


    /**
     * 设置「实体通知标识」值
     * @param val
     */
    PSDENotifyDTO setPSDENotifyId(String pSDENotifyId) {
        this.pSDENotifyId = pSDENotifyId
        return this
    }


    /**
     * 设置「实体通知名称」值
     * @param val
     */
    PSDENotifyDTO setPSDENotifyName(String pSDENotifyName) {
        this.pSDENotifyName = pSDENotifyName
        return this
    }


    /**
     * 设置「系统消息队列」值
     * @param val
     */
    PSDENotifyDTO setPSSysMsgQueueId(String pSSysMsgQueueId) {
        this.pSSysMsgQueueId = pSSysMsgQueueId
        return this
    }


    /**
     * 设置「系统消息队列」值
     * @param val
     */
    PSDENotifyDTO setPSSysMsgQueueName(String pSSysMsgQueueName) {
        this.pSSysMsgQueueName = pSSysMsgQueueName
        return this
    }


    /**
     * 设置「系统消息模板」值
     * @param val
     */
    PSDENotifyDTO setPSSysMsgTemplId(String pSSysMsgTemplId) {
        this.pSSysMsgTemplId = pSSysMsgTemplId
        return this
    }


    /**
     * 设置「系统消息模板」值
     * @param val
     */
    PSDENotifyDTO setPSSysMsgTemplName(String pSSysMsgTemplName) {
        this.pSSysMsgTemplName = pSSysMsgTemplName
        return this
    }


    /**
     * 设置「后端模板插件」值
     * @param val
     */
    PSDENotifyDTO setPSSysSFPluginId(String pSSysSFPluginId) {
        this.pSSysSFPluginId = pSSysSFPluginId
        return this
    }


    /**
     * 设置「后端模板插件」值
     * @param val
     */
    PSDENotifyDTO setPSSysSFPluginName(String pSSysSFPluginName) {
        this.pSSysSFPluginName = pSSysSFPluginName
        return this
    }


    /**
     * 设置「附加任务模式」值
     * @param val
     */
    PSDENotifyDTO setTaskMode(Integer taskMode) {
        this.taskMode = taskMode
        return this
    }


    /**
     * 设置「定时触发模式」值
     * 字典[是否]
     * @param val
     */
    PSDENotifyDTO setTimerMode(Integer timerMode) {
        this.timerMode = timerMode
        return this
    }


    /**
     * 设置「用户标识」值
     * @param val
     */
    PSDENotifyDTO setUserTag(String userTag) {
        this.userTag = userTag
        return this
    }


    /**
     * 设置「用户标识2」值
     * @param val
     */
    PSDENotifyDTO setUserTag2(String userTag2) {
        this.userTag2 = userTag2
        return this
    }


    /**
     * 设置「用户标识3」值
     * @param val
     */
    PSDENotifyDTO setUserTag3(String userTag3) {
        this.userTag3 = userTag3
        return this
    }


    /**
     * 设置「用户标识4」值
     * @param val
     */
    PSDENotifyDTO setUserTag4(String userTag4) {
        this.userTag4 = userTag4
        return this
    }


    /**
     * 设置「启用」值
     * 字典[是否]
     * @param val
     */
    PSDENotifyDTO setValidFlag(Integer validFlag) {
        this.validFlag = validFlag
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSDENotifyDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PSDENotifyDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSDENotifyDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PSDENotifyDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
