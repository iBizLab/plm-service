package cn.ibizlab.plm.ai.aiagentsession.dto

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
class AiAgentSessionDTO extends GroovyDTO<AiAgentSessionDTO> {

    /**
     * 「智能体会话标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「智能体业务上下文标识」
     */
    @JsonProperty("context_id")
    String contextId
    /**
     * 「上下文标记」
     */
    @JsonProperty("context_code_name")
    String contextCodeName
    /**
     * 「调试数据」
     */
    @JsonProperty("context_debug_data")
    String contextDebugData
    /**
     * 「调试反馈1」
     */
    @JsonProperty("debug_callback1")
    String debugCallback1
    /**
     * 「调试反馈2」
     */
    @JsonProperty("debug_callback2")
    String debugCallback2

    /**
     * 设置「智能体会话标识」值
     * @param val
     */
    AiAgentSessionDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiAgentSessionDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「智能体业务上下文标识」值
     * @param val
     */
    AiAgentSessionDTO setContextId(String contextId) {
        this.contextId = contextId
        return this
    }


    /**
     * 设置「上下文标记」值
     * @param val
     */
    AiAgentSessionDTO setContextCodeName(String contextCodeName) {
        this.contextCodeName = contextCodeName
        return this
    }


    /**
     * 设置「调试数据」值
     * @param val
     */
    AiAgentSessionDTO setContextDebugData(String contextDebugData) {
        this.contextDebugData = contextDebugData
        return this
    }


    /**
     * 设置「调试反馈1」值
     * @param val
     */
    AiAgentSessionDTO setDebugCallback1(String debugCallback1) {
        this.debugCallback1 = debugCallback1
        return this
    }


    /**
     * 设置「调试反馈2」值
     * @param val
     */
    AiAgentSessionDTO setDebugCallback2(String debugCallback2) {
        this.debugCallback2 = debugCallback2
        return this
    }

}
