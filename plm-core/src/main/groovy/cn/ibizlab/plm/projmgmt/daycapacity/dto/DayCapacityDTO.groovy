package cn.ibizlab.plm.projmgmt.daycapacity.dto

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
class DayCapacityDTO extends GroovyDTO<DayCapacityDTO> {

    /**
     * 「预估工时」
     */
    @JsonProperty("estimated_workload")
    BigDecimal estimatedWorkload
    /**
     * 「剩余工时」
     */
    @JsonProperty("remaining_workload")
    BigDecimal remainingWorkload
    /**
     * 「故事点」
     */
    @JsonProperty("story_points")
    BigDecimal storyPoints
    /**
     * 「工作项数量」
     */
    @JsonProperty("work_item_count")
    BigDecimal workItemCount
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
     * 设置「预估工时」值
     * @param val
     */
    DayCapacityDTO setEstimatedWorkload(BigDecimal estimatedWorkload) {
        this.estimatedWorkload = estimatedWorkload
        return this
    }


    /**
     * 设置「剩余工时」值
     * @param val
     */
    DayCapacityDTO setRemainingWorkload(BigDecimal remainingWorkload) {
        this.remainingWorkload = remainingWorkload
        return this
    }


    /**
     * 设置「故事点」值
     * @param val
     */
    DayCapacityDTO setStoryPoints(BigDecimal storyPoints) {
        this.storyPoints = storyPoints
        return this
    }


    /**
     * 设置「工作项数量」值
     * @param val
     */
    DayCapacityDTO setWorkItemCount(BigDecimal workItemCount) {
        this.workItemCount = workItemCount
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    DayCapacityDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    DayCapacityDTO setName(String name) {
        this.name = name
        return this
    }

}
