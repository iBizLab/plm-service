package cn.ibizlab.plm.projmgmt.workitemstate.dto

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
class WorkItemStateDTO extends GroovyDTO<WorkItemStateDTO> {

    /**
     * 「序号」
     */
    @JsonProperty("sequence")
    BigDecimal sequence
    /**
     * 「是否系统类型」
     * 字典[是否]
     */
    @JsonProperty("is_system")
    Integer isSystem
    /**
     * 「颜色」
     */
    @JsonProperty("color")
    String color
    /**
     * 「样式表」
     */
    @JsonProperty("style")
    String style
    /**
     * 「状态类型」
     * 字典[工作项状态类型]
     */
    @JsonProperty("type")
    String type
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
     * 「名称」
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
     * 「工作项类型标识」
     */
    @JsonProperty("work_item_type_id")
    String workItemTypeId

    /**
     * 设置「序号」值
     * @param val
     */
    WorkItemStateDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「是否系统类型」值
     * 字典[是否]
     * @param val
     */
    WorkItemStateDTO setIsSystem(Integer isSystem) {
        this.isSystem = isSystem
        return this
    }


    /**
     * 设置「颜色」值
     * @param val
     */
    WorkItemStateDTO setColor(String color) {
        this.color = color
        return this
    }


    /**
     * 设置「样式表」值
     * @param val
     */
    WorkItemStateDTO setStyle(String style) {
        this.style = style
        return this
    }


    /**
     * 设置「状态类型」值
     * 字典[工作项状态类型]
     * @param val
     */
    WorkItemStateDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkItemStateDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    WorkItemStateDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    WorkItemStateDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    WorkItemStateDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkItemStateDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    WorkItemStateDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「工作项类型标识」值
     * @param val
     */
    WorkItemStateDTO setWorkItemTypeId(String workItemTypeId) {
        this.workItemTypeId = workItemTypeId
        return this
    }

}
