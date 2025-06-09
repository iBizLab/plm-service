package cn.ibizlab.plm.testmgmt.review.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.attention.dto.AttentionDTO
import cn.ibizlab.plm.base.attachment.dto.AttachmentDTO
import cn.ibizlab.plm.testmgmt.reviewrule.dto.ReviewRuleDTO
import cn.ibizlab.plm.testmgmt.reviewstage.dto.ReviewStageDTO
import cn.ibizlab.plm.testmgmt.reviewactionrule.dto.ReviewActionRuleDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ReviewDTO extends GroovyDTO<ReviewDTO> {

    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「评审类型」
     * 字典[评审类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「评审主体标识」
     */
    @JsonProperty("principal_id")
    String principalId
    /**
     * 「评审主体名称」
     */
    @JsonProperty("principal_name")
    String principalName
    /**
     * 「评审主体类型」
     */
    @JsonProperty("principal_type")
    String principalType
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「下一个评审人」
     */
    @JsonProperty("next_reviewer")
    String nextReviewer
    /**
     * 「评审人」
     * 字典[云系统操作者]
     */
    @JsonProperty("reviewer")
    String reviewer
    /**
     * 「提交时间」
     */
    @JsonProperty("submitted_at")
    Timestamp submittedAt
    /**
     * 「完成时间」
     */
    @JsonProperty("completed_at")
    Timestamp completedAt
    /**
     * 「类别」
     */
    @JsonProperty("categories")
    String categories
    /**
     * 「类别」
     */
    @JsonProperty("categories_name")
    String categoriesName
    /**
     * 「测试库标识」
     */
    @JsonProperty("library_identifier")
    String libraryIdentifier
    /**
     * 「关注」
     */
    @JsonProperty("attentions")
    List<AttentionDTO> attentions
    /**
     * 「评审状态」
     * 字典[用例评审状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
    /**
     * 「评审内容」
     */
    @JsonProperty("contents")
    List<IEntity> contents
    /**
     * 「提交人标识」
     * 字典[云系统操作者]
     */
    @JsonProperty("submitter_id")
    String submitterId
    /**
     * 「提交人」
     */
    @JsonProperty("submitter_name")
    String submitterName
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
     * 「后置动作」
     */
    @JsonProperty("action_rule")
    List<ReviewActionRuleDTO> actionRule
    /**
     * 「测试库是否删除」
     * 字典[是否]
     */
    @JsonProperty("library_is_deleted")
    Integer libraryIsDeleted
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「关注人」
     */
    @JsonProperty("attentions_imp")
    String attentionsImp
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
     * 「流程准则标识」
     */
    @JsonProperty("guideline_id")
    String guidelineId
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「测试库标识」
     */
    @JsonProperty("library_id")
    String libraryId
    /**
     * 「测试库名称」
     */
    @JsonProperty("library_name")
    String libraryName
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
     * 设置「编号」值
     * @param val
     */
    ReviewDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「评审类型」值
     * 字典[评审类型]
     * @param val
     */
    ReviewDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「评审主体标识」值
     * @param val
     */
    ReviewDTO setPrincipalId(String principalId) {
        this.principalId = principalId
        return this
    }


    /**
     * 设置「评审主体名称」值
     * @param val
     */
    ReviewDTO setPrincipalName(String principalName) {
        this.principalName = principalName
        return this
    }


    /**
     * 设置「评审主体类型」值
     * @param val
     */
    ReviewDTO setPrincipalType(String principalType) {
        this.principalType = principalType
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ReviewDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「下一个评审人」值
     * @param val
     */
    ReviewDTO setNextReviewer(String nextReviewer) {
        this.nextReviewer = nextReviewer
        return this
    }


    /**
     * 设置「评审人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewDTO setReviewer(String reviewer) {
        this.reviewer = reviewer
        return this
    }


    /**
     * 设置「提交时间」值
     * @param val
     */
    ReviewDTO setSubmittedAt(Timestamp submittedAt) {
        this.submittedAt = submittedAt
        return this
    }


    /**
     * 设置「完成时间」值
     * @param val
     */
    ReviewDTO setCompletedAt(Timestamp completedAt) {
        this.completedAt = completedAt
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    ReviewDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    ReviewDTO setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName
        return this
    }


    /**
     * 设置「测试库标识」值
     * @param val
     */
    ReviewDTO setLibraryIdentifier(String libraryIdentifier) {
        this.libraryIdentifier = libraryIdentifier
        return this
    }


    /**
     * 设置「关注」值
     * @param val
     */
    ReviewDTO setAttentions(List<AttentionDTO> attentions) {
        this.attentions = attentions
        return this
    }


    /**
     * 设置「评审状态」值
     * 字典[用例评审状态]
     * @param val
     */
    ReviewDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    ReviewDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「评审内容」值
     * @param val
     */
    ReviewDTO setContents(List<IEntity> contents) {
        this.contents = contents
        return this
    }


    /**
     * 设置「提交人标识」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewDTO setSubmitterId(String submitterId) {
        this.submitterId = submitterId
        return this
    }


    /**
     * 设置「提交人」值
     * @param val
     */
    ReviewDTO setSubmitterName(String submitterName) {
        this.submitterName = submitterName
        return this
    }


    /**
     * 设置「规则」值
     * @param val
     */
    ReviewDTO setRule(List<ReviewRuleDTO> rule) {
        this.rule = rule
        return this
    }


    /**
     * 设置「阶段」值
     * @param val
     */
    ReviewDTO setStage(List<ReviewStageDTO> stage) {
        this.stage = stage
        return this
    }


    /**
     * 设置「后置动作」值
     * @param val
     */
    ReviewDTO setActionRule(List<ReviewActionRuleDTO> actionRule) {
        this.actionRule = actionRule
        return this
    }


    /**
     * 设置「测试库是否删除」值
     * 字典[是否]
     * @param val
     */
    ReviewDTO setLibraryIsDeleted(Integer libraryIsDeleted) {
        this.libraryIsDeleted = libraryIsDeleted
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    ReviewDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「关注人」值
     * @param val
     */
    ReviewDTO setAttentionsImp(String attentionsImp) {
        this.attentionsImp = attentionsImp
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ReviewDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「流程准则标识」值
     * @param val
     */
    ReviewDTO setGuidelineId(String guidelineId) {
        this.guidelineId = guidelineId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ReviewDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「测试库标识」值
     * @param val
     */
    ReviewDTO setLibraryId(String libraryId) {
        this.libraryId = libraryId
        return this
    }


    /**
     * 设置「测试库名称」值
     * @param val
     */
    ReviewDTO setLibraryName(String libraryName) {
        this.libraryName = libraryName
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ReviewDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ReviewDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
