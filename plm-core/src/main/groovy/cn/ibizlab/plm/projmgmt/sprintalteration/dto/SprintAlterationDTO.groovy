package cn.ibizlab.plm.projmgmt.sprintalteration.dto

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
class SprintAlterationDTO extends GroovyDTO<SprintAlterationDTO> {

    /**
     * 「是否删除」
     * 字典[是否]
     */
    @JsonProperty("is_deleted")
    Integer isDeleted
    /**
     * 「类型」
     * 字典[迭代变更类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「迭代状态」
     * 字典[迭代状态]
     */
    @JsonProperty("sprint_status")
    String sprintStatus
    /**
     * 「燃尽统计日期」
     */
    @JsonProperty("rep_date")
    Timestamp repDate
    /**
     * 「燃尽统计数值1」
     */
    @JsonProperty("rep_value1")
    BigDecimal repValue1
    /**
     * 「燃尽统计数值2」
     */
    @JsonProperty("rep_value2")
    BigDecimal repValue2
    /**
     * 「工作项完成时间」
     */
    @JsonProperty("work_item_completed_at")
    Timestamp workItemCompletedAt
    /**
     * 「工作项优先级」
     * 字典[优先级]
     */
    @JsonProperty("work_item_priority")
    String workItemPriority
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
     * 「迭代标识」
     */
    @JsonProperty("sprint_id")
    String sprintId
    /**
     * 「名称」
     */
    @JsonProperty("sprint_name")
    String sprintName
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
     * 「工作项标识」
     */
    @JsonProperty("work_item_id")
    String workItemId
    /**
     * 「标题」
     */
    @JsonProperty("work_item_title")
    String workItemTitle

    /**
     * 设置「是否删除」值
     * 字典[是否]
     * @param val
     */
    SprintAlterationDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「类型」值
     * 字典[迭代变更类型]
     * @param val
     */
    SprintAlterationDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「迭代状态」值
     * 字典[迭代状态]
     * @param val
     */
    SprintAlterationDTO setSprintStatus(String sprintStatus) {
        this.sprintStatus = sprintStatus
        return this
    }


    /**
     * 设置「燃尽统计日期」值
     * @param val
     */
    SprintAlterationDTO setRepDate(Timestamp repDate) {
        this.repDate = repDate
        return this
    }


    /**
     * 设置「燃尽统计数值1」值
     * @param val
     */
    SprintAlterationDTO setRepValue1(BigDecimal repValue1) {
        this.repValue1 = repValue1
        return this
    }


    /**
     * 设置「燃尽统计数值2」值
     * @param val
     */
    SprintAlterationDTO setRepValue2(BigDecimal repValue2) {
        this.repValue2 = repValue2
        return this
    }


    /**
     * 设置「工作项完成时间」值
     * @param val
     */
    SprintAlterationDTO setWorkItemCompletedAt(Timestamp workItemCompletedAt) {
        this.workItemCompletedAt = workItemCompletedAt
        return this
    }


    /**
     * 设置「工作项优先级」值
     * 字典[优先级]
     * @param val
     */
    SprintAlterationDTO setWorkItemPriority(String workItemPriority) {
        this.workItemPriority = workItemPriority
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    SprintAlterationDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    SprintAlterationDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    SprintAlterationDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    SprintAlterationDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「迭代标识」值
     * @param val
     */
    SprintAlterationDTO setSprintId(String sprintId) {
        this.sprintId = sprintId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    SprintAlterationDTO setSprintName(String sprintName) {
        this.sprintName = sprintName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    SprintAlterationDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    SprintAlterationDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「工作项标识」值
     * @param val
     */
    SprintAlterationDTO setWorkItemId(String workItemId) {
        this.workItemId = workItemId
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    SprintAlterationDTO setWorkItemTitle(String workItemTitle) {
        this.workItemTitle = workItemTitle
        return this
    }

}
