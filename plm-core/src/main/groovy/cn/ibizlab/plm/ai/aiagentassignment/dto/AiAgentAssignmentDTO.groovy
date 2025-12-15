package cn.ibizlab.plm.ai.aiagentassignment.dto

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
class AiAgentAssignmentDTO extends GroovyDTO<AiAgentAssignmentDTO> {

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
     * 「智能体业务上下文标识」
     */
    @JsonProperty("context_id")
    String contextId
    /**
     * 「智能体标记」
     */
    @JsonProperty("context_code_name")
    String contextCodeName
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「引用标记」
     */
    @JsonProperty("use_tag")
    String useTag
    /**
     * 「系统标记」
     * 字典[是否]
     */
    @JsonProperty("system_flag")
    Integer systemFlag
    /**
     * 「智能体上下文名称」
     */
    @JsonProperty("context_name")
    String contextName

    /**
     * 设置「标识」值
     * @param val
     */
    AiAgentAssignmentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiAgentAssignmentDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiAgentAssignmentDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AiAgentAssignmentDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiAgentAssignmentDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiAgentAssignmentDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「智能体业务上下文标识」值
     * @param val
     */
    AiAgentAssignmentDTO setContextId(String contextId) {
        this.contextId = contextId
        return this
    }


    /**
     * 设置「智能体标记」值
     * @param val
     */
    AiAgentAssignmentDTO setContextCodeName(String contextCodeName) {
        this.contextCodeName = contextCodeName
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    AiAgentAssignmentDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「引用标记」值
     * @param val
     */
    AiAgentAssignmentDTO setUseTag(String useTag) {
        this.useTag = useTag
        return this
    }


    /**
     * 设置「系统标记」值
     * 字典[是否]
     * @param val
     */
    AiAgentAssignmentDTO setSystemFlag(Integer systemFlag) {
        this.systemFlag = systemFlag
        return this
    }


    /**
     * 设置「智能体上下文名称」值
     * @param val
     */
    AiAgentAssignmentDTO setContextName(String contextName) {
        this.contextName = contextName
        return this
    }

}
