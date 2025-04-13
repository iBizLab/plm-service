package cn.ibizlab.plm.testmgmt.review.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.attachment.dto.AttachmentDTO
import cn.ibizlab.plm.base.attention.dto.AttentionDTO
import cn.ibizlab.plm.testmgmt.reviewactionrule.dto.ReviewActionRuleDTO
import cn.ibizlab.plm.testmgmt.reviewrule.dto.ReviewRuleDTO
import cn.ibizlab.plm.testmgmt.reviewstage.dto.ReviewStageDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ReviewDefGroupDTO extends GroovyDTO<ReviewDefGroupDTO> {

    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
    /**
     * 「关注」
     */
    @JsonProperty("attentions")
    List<AttentionDTO> attentions
    /**
     * 「关注人」
     */
    @JsonProperty("attentions_imp")
    String attentionsImp
    /**
     * 「类别」
     */
    @JsonProperty("categories")
    String categories
    /**
     * 「完成时间」
     */
    @JsonProperty("completed_at")
    Timestamp completedAt
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
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「测试库标识」
     */
    @JsonProperty("library_id")
    String libraryId
    /**
     * 「测试库标识」
     */
    @JsonProperty("library_identifier")
    String libraryIdentifier
    /**
     * 「测试库名称」
     */
    @JsonProperty("library_name")
    String libraryName
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「评审类型」
     * 字典[评审类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「评审状态」
     * 字典[用例评审状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「提交人标识」
     * 字典[云系统操作者]
     */
    @JsonProperty("submitter_id")
    String submitterId
    /**
     * 「提交时间」
     */
    @JsonProperty("submitted_at")
    Timestamp submittedAt
    /**
     * 「提交人」
     */
    @JsonProperty("submitter_name")
    String submitterName
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「后置动作」
     */
    @JsonProperty("action_rule")
    List<ReviewActionRuleDTO> actionRule
    /**
     * 「规则」
     */
    @JsonProperty("rule")
    List<ReviewRuleDTO> rule
    /**
     * 「阶段」
     */
    @JsonProperty("stage")
    List<ReviewStageDTO> stage
    /**
     * 「评审内容」
     */
    @JsonProperty("contents")
    List<IEntity> contents

    /**
     * 设置「附件」值
     * @param val
     */
    ReviewDefGroupDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「关注」值
     * @param val
     */
    ReviewDefGroupDTO setAttentions(List<AttentionDTO> attentions) {
        this.attentions = attentions
        return this
    }


    /**
     * 设置「关注人」值
     * @param val
     */
    ReviewDefGroupDTO setAttentionsImp(String attentionsImp) {
        this.attentionsImp = attentionsImp
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    ReviewDefGroupDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「完成时间」值
     * @param val
     */
    ReviewDefGroupDTO setCompletedAt(Timestamp completedAt) {
        this.completedAt = completedAt
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewDefGroupDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ReviewDefGroupDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ReviewDefGroupDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ReviewDefGroupDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    ReviewDefGroupDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「测试库标识」值
     * @param val
     */
    ReviewDefGroupDTO setLibraryId(String libraryId) {
        this.libraryId = libraryId
        return this
    }


    /**
     * 设置「测试库标识」值
     * @param val
     */
    ReviewDefGroupDTO setLibraryIdentifier(String libraryIdentifier) {
        this.libraryIdentifier = libraryIdentifier
        return this
    }


    /**
     * 设置「测试库名称」值
     * @param val
     */
    ReviewDefGroupDTO setLibraryName(String libraryName) {
        this.libraryName = libraryName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ReviewDefGroupDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewDefGroupDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「评审类型」值
     * 字典[评审类型]
     * @param val
     */
    ReviewDefGroupDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「评审状态」值
     * 字典[用例评审状态]
     * @param val
     */
    ReviewDefGroupDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「提交人标识」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewDefGroupDTO setSubmitterId(String submitterId) {
        this.submitterId = submitterId
        return this
    }


    /**
     * 设置「提交时间」值
     * @param val
     */
    ReviewDefGroupDTO setSubmittedAt(Timestamp submittedAt) {
        this.submittedAt = submittedAt
        return this
    }


    /**
     * 设置「提交人」值
     * @param val
     */
    ReviewDefGroupDTO setSubmitterName(String submitterName) {
        this.submitterName = submitterName
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ReviewDefGroupDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「后置动作」值
     * @param val
     */
    ReviewDefGroupDTO setActionRule(List<ReviewActionRuleDTO> actionRule) {
        this.actionRule = actionRule
        return this
    }


    /**
     * 设置「规则」值
     * @param val
     */
    ReviewDefGroupDTO setRule(List<ReviewRuleDTO> rule) {
        this.rule = rule
        return this
    }


    /**
     * 设置「阶段」值
     * @param val
     */
    ReviewDefGroupDTO setStage(List<ReviewStageDTO> stage) {
        this.stage = stage
        return this
    }


    /**
     * 设置「评审内容」值
     * @param val
     */
    ReviewDefGroupDTO setContents(List<IEntity> contents) {
        this.contents = contents
        return this
    }

}
