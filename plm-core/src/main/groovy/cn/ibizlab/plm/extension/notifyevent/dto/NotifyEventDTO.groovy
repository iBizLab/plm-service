package cn.ibizlab.plm.extension.notifyevent.dto

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
class NotifyEventDTO extends GroovyDTO<NotifyEventDTO> {

    /**
     * 「消息类型」
     * 字典[通知消息类型]
     */
    @JsonProperty("msg_type")
    Integer msgType
    /**
     * 「事件分类」
     */
    @JsonProperty("group")
    String group
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
     * 设置「消息类型」值
     * 字典[通知消息类型]
     * @param val
     */
    NotifyEventDTO setMsgType(Integer msgType) {
        this.msgType = msgType
        return this
    }


    /**
     * 设置「事件分类」值
     * @param val
     */
    NotifyEventDTO setGroup(String group) {
        this.group = group
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    NotifyEventDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    NotifyEventDTO setName(String name) {
        this.name = name
        return this
    }

}
