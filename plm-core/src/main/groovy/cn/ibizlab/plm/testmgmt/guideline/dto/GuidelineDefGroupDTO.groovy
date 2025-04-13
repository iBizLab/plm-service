package cn.ibizlab.plm.testmgmt.guideline.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.testmgmt.reviewactionrule.dto.ReviewActionRuleDTO
import cn.ibizlab.plm.testmgmt.reviewrule.dto.ReviewRuleDTO
import cn.ibizlab.plm.testmgmt.reviewstage.dto.ReviewStageDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class GuidelineDefGroupDTO extends GroovyDTO<GuidelineDefGroupDTO> {

    /**
     * 「评审后置动作」
     */
    @JsonProperty("review_action_rule")
    List<ReviewActionRuleDTO> reviewActionRule
    /**
     * 「评审规则」
     */
    @JsonProperty("review_rule")
    List<ReviewRuleDTO> reviewRule
    /**
     * 「评审阶段」
     */
    @JsonProperty("review_stage")
    List<ReviewStageDTO> reviewStage
    /**
     * 「主题类型」
     */
    @JsonProperty("subject_type")
    String subjectType
    /**
     * 「对象类型」
     */
    @JsonProperty("object_type")
    String objectType
    /**
     * 「所属主体标识」
     */
    @JsonProperty("scope_id")
    String scopeId
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「是否启用」
     * 字典[是否]
     */
    @JsonProperty("is_enabled")
    Integer isEnabled

    /**
     * 设置「评审后置动作」值
     * @param val
     */
    GuidelineDefGroupDTO setReviewActionRule(List<ReviewActionRuleDTO> reviewActionRule) {
        this.reviewActionRule = reviewActionRule
        return this
    }


    /**
     * 设置「评审规则」值
     * @param val
     */
    GuidelineDefGroupDTO setReviewRule(List<ReviewRuleDTO> reviewRule) {
        this.reviewRule = reviewRule
        return this
    }


    /**
     * 设置「评审阶段」值
     * @param val
     */
    GuidelineDefGroupDTO setReviewStage(List<ReviewStageDTO> reviewStage) {
        this.reviewStage = reviewStage
        return this
    }


    /**
     * 设置「主题类型」值
     * @param val
     */
    GuidelineDefGroupDTO setSubjectType(String subjectType) {
        this.subjectType = subjectType
        return this
    }


    /**
     * 设置「对象类型」值
     * @param val
     */
    GuidelineDefGroupDTO setObjectType(String objectType) {
        this.objectType = objectType
        return this
    }


    /**
     * 设置「所属主体标识」值
     * @param val
     */
    GuidelineDefGroupDTO setScopeId(String scopeId) {
        this.scopeId = scopeId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    GuidelineDefGroupDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    GuidelineDefGroupDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    GuidelineDefGroupDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    GuidelineDefGroupDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    GuidelineDefGroupDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    GuidelineDefGroupDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「是否启用」值
     * 字典[是否]
     * @param val
     */
    GuidelineDefGroupDTO setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled
        return this
    }

}
