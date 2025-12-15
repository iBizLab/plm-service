package cn.ibizlab.plm.ebsx.systodo.dto

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
class SysTodoDTO extends GroovyDTO<SysTodoDTO> {

    /**
     * 「业务单号」
     */
    @JsonProperty("num")
    String num
    /**
     * 「业务数据标识」
     */
    @JsonProperty("bizkey")
    String bizKey
    /**
     * 「业务对象」
     * 字典[工作流类型]
     */
    @JsonProperty("biztype")
    String bizType
    /**
     * 「长文本参数01」
     */
    @JsonProperty("clobparam01")
    String clobParam01
    /**
     * 「长文本参数02」
     */
    @JsonProperty("clobparam02")
    String clobParam02
    /**
     * 「内容」
     */
    @JsonProperty("content")
    String content
    /**
     * 「创建时间」
     */
    @JsonProperty("createdate")
    Timestamp createDate
    /**
     * 「创建人」
     * 字典[云系统操作者]
     */
    @JsonProperty("createman")
    String createMan
    /**
     * 「上一环节处理人」
     */
    @JsonProperty("createmanname")
    String createManName
    /**
     * 「租户系统标识」
     */
    @JsonProperty("dcsystemid")
    String dCSystemId
    /**
     * 「租户系统名称」
     */
    @JsonProperty("dcsystemname")
    String dCSystemName
    /**
     * 「过期时间」
     */
    @JsonProperty("duedate")
    Timestamp dueDate
    /**
     * 「是否已读」
     * 字典[是否]
     */
    @JsonProperty("isread")
    Integer isRead
    /**
     * 「连接地址」
     */
    @JsonProperty("linkurl")
    String linkUrl
    /**
     * 「组织机构标识」
     */
    @JsonProperty("orgid")
    String orgId
    /**
     * 「参数01」
     */
    @JsonProperty("param01")
    String param01
    /**
     * 「参数02」
     */
    @JsonProperty("param02")
    String param02
    /**
     * 「参数03」
     */
    @JsonProperty("param03")
    String param03
    /**
     * 「参数04」
     */
    @JsonProperty("param04")
    String param04
    /**
     * 「参数05」
     */
    @JsonProperty("param05")
    String param05
    /**
     * 「参数06」
     */
    @JsonProperty("param06")
    String param06
    /**
     * 「参数07」
     */
    @JsonProperty("param07")
    String param07
    /**
     * 「参数08」
     */
    @JsonProperty("param08")
    String param08
    /**
     * 「参数09」
     */
    @JsonProperty("param09")
    String param09
    /**
     * 「处理时间」
     */
    @JsonProperty("processdate")
    Timestamp processDate
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「待办标识」
     */
    @JsonProperty("todoid")
    String todoId
    /**
     * 「待办状态」
     * 字典[待办状态]
     */
    @JsonProperty("todostate")
    String todoState
    /**
     * 「待办子类」
     */
    @JsonProperty("todosubtype")
    String todoSubType
    /**
     * 「待办类型」
     */
    @JsonProperty("todotype")
    String todoType
    /**
     * 「待办地址类型」
     */
    @JsonProperty("todourltype")
    String todoUrlType
    /**
     * 「更新时间」
     */
    @JsonProperty("updatedate")
    Timestamp updateDate
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("updateman")
    String updateMan
    /**
     * 「更新人」
     */
    @JsonProperty("updatemanname")
    String updateManName
    /**
     * 「待办用户标识」
     */
    @JsonProperty("userid")
    String userId

    /**
     * 设置「业务单号」值
     * @param val
     */
    SysTodoDTO setNum(String num) {
        this.num = num
        return this
    }


    /**
     * 设置「业务数据标识」值
     * @param val
     */
    SysTodoDTO setBizKey(String bizKey) {
        this.bizKey = bizKey
        return this
    }


    /**
     * 设置「业务对象」值
     * 字典[工作流类型]
     * @param val
     */
    SysTodoDTO setBizType(String bizType) {
        this.bizType = bizType
        return this
    }


    /**
     * 设置「长文本参数01」值
     * @param val
     */
    SysTodoDTO setClobParam01(String clobParam01) {
        this.clobParam01 = clobParam01
        return this
    }


    /**
     * 设置「长文本参数02」值
     * @param val
     */
    SysTodoDTO setClobParam02(String clobParam02) {
        this.clobParam02 = clobParam02
        return this
    }


    /**
     * 设置「内容」值
     * @param val
     */
    SysTodoDTO setContent(String content) {
        this.content = content
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    SysTodoDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    SysTodoDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「上一环节处理人」值
     * @param val
     */
    SysTodoDTO setCreateManName(String createManName) {
        this.createManName = createManName
        return this
    }


    /**
     * 设置「租户系统标识」值
     * @param val
     */
    SysTodoDTO setDCSystemId(String dCSystemId) {
        this.dCSystemId = dCSystemId
        return this
    }


    /**
     * 设置「租户系统名称」值
     * @param val
     */
    SysTodoDTO setDCSystemName(String dCSystemName) {
        this.dCSystemName = dCSystemName
        return this
    }


    /**
     * 设置「过期时间」值
     * @param val
     */
    SysTodoDTO setDueDate(Timestamp dueDate) {
        this.dueDate = dueDate
        return this
    }


    /**
     * 设置「是否已读」值
     * 字典[是否]
     * @param val
     */
    SysTodoDTO setIsRead(Integer isRead) {
        this.isRead = isRead
        return this
    }


    /**
     * 设置「连接地址」值
     * @param val
     */
    SysTodoDTO setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl
        return this
    }


    /**
     * 设置「组织机构标识」值
     * @param val
     */
    SysTodoDTO setOrgId(String orgId) {
        this.orgId = orgId
        return this
    }


    /**
     * 设置「参数01」值
     * @param val
     */
    SysTodoDTO setParam01(String param01) {
        this.param01 = param01
        return this
    }


    /**
     * 设置「参数02」值
     * @param val
     */
    SysTodoDTO setParam02(String param02) {
        this.param02 = param02
        return this
    }


    /**
     * 设置「参数03」值
     * @param val
     */
    SysTodoDTO setParam03(String param03) {
        this.param03 = param03
        return this
    }


    /**
     * 设置「参数04」值
     * @param val
     */
    SysTodoDTO setParam04(String param04) {
        this.param04 = param04
        return this
    }


    /**
     * 设置「参数05」值
     * @param val
     */
    SysTodoDTO setParam05(String param05) {
        this.param05 = param05
        return this
    }


    /**
     * 设置「参数06」值
     * @param val
     */
    SysTodoDTO setParam06(String param06) {
        this.param06 = param06
        return this
    }


    /**
     * 设置「参数07」值
     * @param val
     */
    SysTodoDTO setParam07(String param07) {
        this.param07 = param07
        return this
    }


    /**
     * 设置「参数08」值
     * @param val
     */
    SysTodoDTO setParam08(String param08) {
        this.param08 = param08
        return this
    }


    /**
     * 设置「参数09」值
     * @param val
     */
    SysTodoDTO setParam09(String param09) {
        this.param09 = param09
        return this
    }


    /**
     * 设置「处理时间」值
     * @param val
     */
    SysTodoDTO setProcessDate(Timestamp processDate) {
        this.processDate = processDate
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    SysTodoDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「待办标识」值
     * @param val
     */
    SysTodoDTO setTodoId(String todoId) {
        this.todoId = todoId
        return this
    }


    /**
     * 设置「待办状态」值
     * 字典[待办状态]
     * @param val
     */
    SysTodoDTO setTodoState(String todoState) {
        this.todoState = todoState
        return this
    }


    /**
     * 设置「待办子类」值
     * @param val
     */
    SysTodoDTO setTodoSubType(String todoSubType) {
        this.todoSubType = todoSubType
        return this
    }


    /**
     * 设置「待办类型」值
     * @param val
     */
    SysTodoDTO setTodoType(String todoType) {
        this.todoType = todoType
        return this
    }


    /**
     * 设置「待办地址类型」值
     * @param val
     */
    SysTodoDTO setTodoUrlType(String todoUrlType) {
        this.todoUrlType = todoUrlType
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    SysTodoDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    SysTodoDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    SysTodoDTO setUpdateManName(String updateManName) {
        this.updateManName = updateManName
        return this
    }


    /**
     * 设置「待办用户标识」值
     * @param val
     */
    SysTodoDTO setUserId(String userId) {
        this.userId = userId
        return this
    }

}
