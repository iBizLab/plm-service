package cn.ibizlab.plm.testmgmt.reviewstage.dto

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
class ReviewStageDTO extends GroovyDTO<ReviewStageDTO> {

    /**
     * 「评审人类型」
     * 字典[评审人类型]
     */
    @JsonProperty("reviewer_type")
    String reviewerType
    /**
     * 「评审人」
     */
    @JsonProperty("reviewer")
    String reviewer
    /**
     * 「评审人名称」
     */
    @JsonProperty("reviewer_name")
    String reviewerName
    /**
     * 「评审阶段状态」
     * 字典[评审阶段状态]
     */
    @JsonProperty("stage_state")
    String stageState
    /**
     * 「顺序」
     */
    @JsonProperty("order")
    Integer order
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
     * 「准则标识」
     */
    @JsonProperty("guideline_id")
    String guidelineId
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
     * 设置「评审人类型」值
     * 字典[评审人类型]
     * @param val
     */
    ReviewStageDTO setReviewerType(String reviewerType) {
        this.reviewerType = reviewerType
        return this
    }


    /**
     * 设置「评审人」值
     * @param val
     */
    ReviewStageDTO setReviewer(String reviewer) {
        this.reviewer = reviewer
        return this
    }


    /**
     * 设置「评审人名称」值
     * @param val
     */
    ReviewStageDTO setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName
        return this
    }


    /**
     * 设置「评审阶段状态」值
     * 字典[评审阶段状态]
     * @param val
     */
    ReviewStageDTO setStageState(String stageState) {
        this.stageState = stageState
        return this
    }


    /**
     * 设置「顺序」值
     * @param val
     */
    ReviewStageDTO setOrder(Integer order) {
        this.order = order
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewStageDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ReviewStageDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「准则标识」值
     * @param val
     */
    ReviewStageDTO setGuidelineId(String guidelineId) {
        this.guidelineId = guidelineId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ReviewStageDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ReviewStageDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewStageDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ReviewStageDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
