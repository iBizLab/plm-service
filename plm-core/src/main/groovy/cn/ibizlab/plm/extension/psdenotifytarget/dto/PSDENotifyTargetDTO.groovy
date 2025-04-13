package cn.ibizlab.plm.extension.psdenotifytarget.dto

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
class PSDENotifyTargetDTO extends GroovyDTO<PSDENotifyTargetDTO> {

    /**
     * 「目标数据」
     */
    @JsonProperty("data")
    String data
    /**
     * 「过滤项」
     */
    @JsonProperty("filter")
    String filter
    /**
     * 「实体通知」
     */
    @JsonProperty("psdenotifyid")
    String pSDENotifyId
    /**
     * 「实体通知」
     */
    @JsonProperty("psdenotifyname")
    String pSDENotifyName
    /**
     * 「实体通知目标标识」
     */
    @JsonProperty("psdenotifytargetid")
    String pSDENotifyTargetId
    /**
     * 「实体通知目标名称」
     */
    @JsonProperty("psdenotifytargetname")
    String pSDENotifyTargetName
    /**
     * 「目标类型」
     * 字典[实体通知目标类型]
     */
    @JsonProperty("targettype")
    String targetType
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
     * 设置「目标数据」值
     * @param val
     */
    PSDENotifyTargetDTO setData(String data) {
        this.data = data
        return this
    }


    /**
     * 设置「过滤项」值
     * @param val
     */
    PSDENotifyTargetDTO setFilter(String filter) {
        this.filter = filter
        return this
    }


    /**
     * 设置「实体通知」值
     * @param val
     */
    PSDENotifyTargetDTO setPSDENotifyId(String pSDENotifyId) {
        this.pSDENotifyId = pSDENotifyId
        return this
    }


    /**
     * 设置「实体通知」值
     * @param val
     */
    PSDENotifyTargetDTO setPSDENotifyName(String pSDENotifyName) {
        this.pSDENotifyName = pSDENotifyName
        return this
    }


    /**
     * 设置「实体通知目标标识」值
     * @param val
     */
    PSDENotifyTargetDTO setPSDENotifyTargetId(String pSDENotifyTargetId) {
        this.pSDENotifyTargetId = pSDENotifyTargetId
        return this
    }


    /**
     * 设置「实体通知目标名称」值
     * @param val
     */
    PSDENotifyTargetDTO setPSDENotifyTargetName(String pSDENotifyTargetName) {
        this.pSDENotifyTargetName = pSDENotifyTargetName
        return this
    }


    /**
     * 设置「目标类型」值
     * 字典[实体通知目标类型]
     * @param val
     */
    PSDENotifyTargetDTO setTargetType(String targetType) {
        this.targetType = targetType
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSDENotifyTargetDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PSDENotifyTargetDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSDENotifyTargetDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PSDENotifyTargetDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
