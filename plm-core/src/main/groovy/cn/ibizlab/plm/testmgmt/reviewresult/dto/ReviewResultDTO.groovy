package cn.ibizlab.plm.testmgmt.reviewresult.dto

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
class ReviewResultDTO extends GroovyDTO<ReviewResultDTO> {

    /**
     * 「状态」
     * 字典[评审结果]
     */
    @JsonProperty("result_state")
    Integer resultState
    /**
     * 「评审意见」
     */
    @JsonProperty("comment")
    String comment
    /**
     * 「是否可评审」
     * 字典[是否]
     */
    @JsonProperty("whether_review")
    String whetherReview
    /**
     * 「阶段标识」
     */
    @JsonProperty("stage_id")
    String stageId
    /**
     * 「顺序」
     */
    @JsonProperty("sequences")
    Integer sequences
    /**
     * 「评审内容标识」
     */
    @JsonProperty("content_id")
    String contentId
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
     * 设置「状态」值
     * 字典[评审结果]
     * @param val
     */
    ReviewResultDTO setResultState(Integer resultState) {
        this.resultState = resultState
        return this
    }


    /**
     * 设置「评审意见」值
     * @param val
     */
    ReviewResultDTO setComment(String comment) {
        this.comment = comment
        return this
    }


    /**
     * 设置「是否可评审」值
     * 字典[是否]
     * @param val
     */
    ReviewResultDTO setWhetherReview(String whetherReview) {
        this.whetherReview = whetherReview
        return this
    }


    /**
     * 设置「阶段标识」值
     * @param val
     */
    ReviewResultDTO setStageId(String stageId) {
        this.stageId = stageId
        return this
    }


    /**
     * 设置「顺序」值
     * @param val
     */
    ReviewResultDTO setSequences(Integer sequences) {
        this.sequences = sequences
        return this
    }


    /**
     * 设置「评审内容标识」值
     * @param val
     */
    ReviewResultDTO setContentId(String contentId) {
        this.contentId = contentId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewResultDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ReviewResultDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ReviewResultDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ReviewResultDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewResultDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ReviewResultDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
