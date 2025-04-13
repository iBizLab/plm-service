package cn.ibizlab.plm.testmgmt.reviewcontentextend.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.testmgmt.reviewresult.dto.ReviewResultDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ReviewContentExtendDTO extends GroovyDTO<ReviewContentExtendDTO> {

    /**
     * 「变更类型」
     * 字典[评审内容变更类型]
     */
    @JsonProperty("change_type")
    String changeType
    /**
     * 「变更版本」
     */
    @JsonProperty("change_version")
    List<IEntity> changeVersion
    /**
     * 「评审结果」
     */
    @JsonProperty("stage_results")
    List<ReviewResultDTO> stageResults
    /**
     * 「最终评审结果」
     * 字典[最终评审结果]
     */
    @JsonProperty("final_stage_results")
    String finalStageResults
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
     * 设置「变更类型」值
     * 字典[评审内容变更类型]
     * @param val
     */
    ReviewContentExtendDTO setChangeType(String changeType) {
        this.changeType = changeType
        return this
    }


    /**
     * 设置「变更版本」值
     * @param val
     */
    ReviewContentExtendDTO setChangeVersion(List<IEntity> changeVersion) {
        this.changeVersion = changeVersion
        return this
    }


    /**
     * 设置「评审结果」值
     * @param val
     */
    ReviewContentExtendDTO setStageResults(List<ReviewResultDTO> stageResults) {
        this.stageResults = stageResults
        return this
    }


    /**
     * 设置「最终评审结果」值
     * 字典[最终评审结果]
     * @param val
     */
    ReviewContentExtendDTO setFinalStageResults(String finalStageResults) {
        this.finalStageResults = finalStageResults
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewContentExtendDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ReviewContentExtendDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ReviewContentExtendDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ReviewContentExtendDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewContentExtendDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ReviewContentExtendDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
