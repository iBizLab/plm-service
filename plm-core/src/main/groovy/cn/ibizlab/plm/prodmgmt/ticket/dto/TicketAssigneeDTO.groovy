package cn.ibizlab.plm.prodmgmt.ticket.dto

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
class TicketAssigneeDTO extends GroovyDTO<TicketAssigneeDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「负责人标识」
     */
    @JsonProperty("assignee_id")
    String assigneeId

    /**
     * 设置「标识」值
     * @param val
     */
    TicketAssigneeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    TicketAssigneeDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「负责人标识」值
     * @param val
     */
    TicketAssigneeDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }

}
