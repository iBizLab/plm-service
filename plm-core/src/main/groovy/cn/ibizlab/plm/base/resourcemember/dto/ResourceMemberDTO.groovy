package cn.ibizlab.plm.base.resourcemember.dto

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
class ResourceMemberDTO extends GroovyDTO<ResourceMemberDTO> {

    /**
     * 「天容量」
     */
    @JsonProperty("day_capacity")
    IEntity dayCapacity
    /**
     * 「登录名」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「周工作日」
     * 字典[工作日]
     */
    @JsonProperty("weekday")
    String weekday
    /**
     * 「组件标识」
     */
    @JsonProperty("addon_id")
    String addonId
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
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「姓名」
     */
    @JsonProperty("name")
    String name
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
     * 设置「天容量」值
     * @param val
     */
    ResourceMemberDTO setDayCapacity(IEntity dayCapacity) {
        this.dayCapacity = dayCapacity
        return this
    }


    /**
     * 设置「登录名」值
     * @param val
     */
    ResourceMemberDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「周工作日」值
     * 字典[工作日]
     * @param val
     */
    ResourceMemberDTO setWeekday(String weekday) {
        this.weekday = weekday
        return this
    }


    /**
     * 设置「组件标识」值
     * @param val
     */
    ResourceMemberDTO setAddonId(String addonId) {
        this.addonId = addonId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResourceMemberDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResourceMemberDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResourceMemberDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「姓名」值
     * @param val
     */
    ResourceMemberDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResourceMemberDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResourceMemberDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
