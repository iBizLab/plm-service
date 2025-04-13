package cn.ibizlab.plm.testmgmt.reviewwizard.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.attention.dto.AttentionDTO
import cn.ibizlab.plm.testmgmt.reviewcontent.dto.ReviewContentDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ReviewWizardDTO extends GroovyDTO<ReviewWizardDTO> {

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
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「类别」
     */
    @JsonProperty("categories")
    String categories
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
     * 「评审内容」
     */
    @JsonProperty("contents")
    List<ReviewContentDTO> contents
    /**
     * 「提交人标识」
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
    List<IEntity> rule
    /**
     * 「阶段」
     */
    @JsonProperty("stage")
    List<IEntity> stage
    /**
     * 「后置动作」
     */
    @JsonProperty("action_rule")
    List<IEntity> actionRule
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
    ReviewWizardDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「评审类型」值
     * 字典[评审类型]
     * @param val
     */
    ReviewWizardDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ReviewWizardDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    ReviewWizardDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「测试库标识」值
     * @param val
     */
    ReviewWizardDTO setLibraryIdentifier(String libraryIdentifier) {
        this.libraryIdentifier = libraryIdentifier
        return this
    }


    /**
     * 设置「关注」值
     * @param val
     */
    ReviewWizardDTO setAttentions(List<AttentionDTO> attentions) {
        this.attentions = attentions
        return this
    }


    /**
     * 设置「评审状态」值
     * 字典[用例评审状态]
     * @param val
     */
    ReviewWizardDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「评审内容」值
     * @param val
     */
    ReviewWizardDTO setContents(List<ReviewContentDTO> contents) {
        this.contents = contents
        return this
    }


    /**
     * 设置「提交人标识」值
     * @param val
     */
    ReviewWizardDTO setSubmitterId(String submitterId) {
        this.submitterId = submitterId
        return this
    }


    /**
     * 设置「提交人」值
     * @param val
     */
    ReviewWizardDTO setSubmitterName(String submitterName) {
        this.submitterName = submitterName
        return this
    }


    /**
     * 设置「规则」值
     * @param val
     */
    ReviewWizardDTO setRule(List<IEntity> rule) {
        this.rule = rule
        return this
    }


    /**
     * 设置「阶段」值
     * @param val
     */
    ReviewWizardDTO setStage(List<IEntity> stage) {
        this.stage = stage
        return this
    }


    /**
     * 设置「后置动作」值
     * @param val
     */
    ReviewWizardDTO setActionRule(List<IEntity> actionRule) {
        this.actionRule = actionRule
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    ReviewWizardDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「关注人」值
     * @param val
     */
    ReviewWizardDTO setAttentionsImp(String attentionsImp) {
        this.attentionsImp = attentionsImp
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewWizardDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ReviewWizardDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「流程准则标识」值
     * @param val
     */
    ReviewWizardDTO setGuidelineId(String guidelineId) {
        this.guidelineId = guidelineId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ReviewWizardDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「测试库标识」值
     * @param val
     */
    ReviewWizardDTO setLibraryId(String libraryId) {
        this.libraryId = libraryId
        return this
    }


    /**
     * 设置「测试库名称」值
     * @param val
     */
    ReviewWizardDTO setLibraryName(String libraryName) {
        this.libraryName = libraryName
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ReviewWizardDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewWizardDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ReviewWizardDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
