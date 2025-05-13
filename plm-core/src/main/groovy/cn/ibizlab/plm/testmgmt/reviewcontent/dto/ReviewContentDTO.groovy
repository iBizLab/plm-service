package cn.ibizlab.plm.testmgmt.reviewcontent.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.testmgmt.reviewresult.dto.ReviewResultDTO
import cn.ibizlab.plm.testmgmt.review.dto.ReviewDTO
import cn.ibizlab.plm.testmgmt.testcase.dto.TestCaseDTO
import cn.ibizlab.plm.base.version.dto.VersionDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ReviewContentDTO extends GroovyDTO<ReviewContentDTO> {

    /**
     * 「变更类型」
     * 字典[评审内容变更类型]
     */
    @JsonProperty("change_type")
    String changeType
    /**
     * 「关联主体标识」
     */
    @JsonProperty("principal_id")
    String principalId
    /**
     * 「变更版本」
     */
    @JsonProperty("change_version")
    List<IEntity> changeVersion
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「关联主体类型」
     */
    @JsonProperty("principal_type")
    String principalType
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
     * 「关联目标类型」
     */
    @JsonProperty("target_type")
    String targetType
    /**
     * 「父对象版本标识」
     */
    @JsonProperty("parent_version_id")
    String parentVersionId
    /**
     * 「目标对象版本标识」
     */
    @JsonProperty("target_version_id")
    String targetVersionId
    /**
     * 「评审数据」
     */
    @JsonProperty("review_data")
    ReviewDTO reviewData
    /**
     * 「测试用例」
     */
    @JsonProperty("test_case")
    TestCaseDTO testCase
    /**
     * 「当前版本标识」
     */
    @JsonProperty("cur_version_id")
    String curVersionId
    /**
     * 「目标对象编号」
     */
    @JsonProperty("target_identifier")
    String targetIdentifier
    /**
     * 「目标对象标题」
     */
    @JsonProperty("target_title")
    String targetTitle
    /**
     * 「目标对象状态」
     */
    @JsonProperty("target_state")
    String targetState
    /**
     * 「目标对象负责人」
     */
    @JsonProperty("target_assignee")
    String targetAssignee
    /**
     * 「关联目标版本」
     */
    @JsonProperty("target_version")
    VersionDTO targetVersion
    /**
     * 「目标对象优先级」
     */
    @JsonProperty("target_priority")
    String targetPriority
    /**
     * 「目标对象父标识」
     */
    @JsonProperty("target_parent_id")
    String targetParentId
    /**
     * 「关联目标标识」
     */
    @JsonProperty("target_id")
    String targetId
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
    ReviewContentDTO setChangeType(String changeType) {
        this.changeType = changeType
        return this
    }


    /**
     * 设置「关联主体标识」值
     * @param val
     */
    ReviewContentDTO setPrincipalId(String principalId) {
        this.principalId = principalId
        return this
    }


    /**
     * 设置「变更版本」值
     * @param val
     */
    ReviewContentDTO setChangeVersion(List<IEntity> changeVersion) {
        this.changeVersion = changeVersion
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    ReviewContentDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「关联主体类型」值
     * @param val
     */
    ReviewContentDTO setPrincipalType(String principalType) {
        this.principalType = principalType
        return this
    }


    /**
     * 设置「评审结果」值
     * @param val
     */
    ReviewContentDTO setStageResults(List<ReviewResultDTO> stageResults) {
        this.stageResults = stageResults
        return this
    }


    /**
     * 设置「最终评审结果」值
     * 字典[最终评审结果]
     * @param val
     */
    ReviewContentDTO setFinalStageResults(String finalStageResults) {
        this.finalStageResults = finalStageResults
        return this
    }


    /**
     * 设置「关联目标类型」值
     * @param val
     */
    ReviewContentDTO setTargetType(String targetType) {
        this.targetType = targetType
        return this
    }


    /**
     * 设置「父对象版本标识」值
     * @param val
     */
    ReviewContentDTO setParentVersionId(String parentVersionId) {
        this.parentVersionId = parentVersionId
        return this
    }


    /**
     * 设置「目标对象版本标识」值
     * @param val
     */
    ReviewContentDTO setTargetVersionId(String targetVersionId) {
        this.targetVersionId = targetVersionId
        return this
    }


    /**
     * 设置「评审数据」值
     * @param val
     */
    ReviewContentDTO setReviewData(ReviewDTO reviewData) {
        this.reviewData = reviewData
        return this
    }


    /**
     * 设置「测试用例」值
     * @param val
     */
    ReviewContentDTO setTestCase(TestCaseDTO testCase) {
        this.testCase = testCase
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    ReviewContentDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }


    /**
     * 设置「目标对象编号」值
     * @param val
     */
    ReviewContentDTO setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier
        return this
    }


    /**
     * 设置「目标对象标题」值
     * @param val
     */
    ReviewContentDTO setTargetTitle(String targetTitle) {
        this.targetTitle = targetTitle
        return this
    }


    /**
     * 设置「目标对象状态」值
     * @param val
     */
    ReviewContentDTO setTargetState(String targetState) {
        this.targetState = targetState
        return this
    }


    /**
     * 设置「目标对象负责人」值
     * @param val
     */
    ReviewContentDTO setTargetAssignee(String targetAssignee) {
        this.targetAssignee = targetAssignee
        return this
    }


    /**
     * 设置「关联目标版本」值
     * @param val
     */
    ReviewContentDTO setTargetVersion(VersionDTO targetVersion) {
        this.targetVersion = targetVersion
        return this
    }


    /**
     * 设置「目标对象优先级」值
     * @param val
     */
    ReviewContentDTO setTargetPriority(String targetPriority) {
        this.targetPriority = targetPriority
        return this
    }


    /**
     * 设置「目标对象父标识」值
     * @param val
     */
    ReviewContentDTO setTargetParentId(String targetParentId) {
        this.targetParentId = targetParentId
        return this
    }


    /**
     * 设置「关联目标标识」值
     * @param val
     */
    ReviewContentDTO setTargetId(String targetId) {
        this.targetId = targetId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewContentDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ReviewContentDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ReviewContentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ReviewContentDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewContentDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ReviewContentDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
