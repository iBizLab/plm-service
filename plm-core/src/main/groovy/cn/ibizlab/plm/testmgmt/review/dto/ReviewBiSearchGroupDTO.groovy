package cn.ibizlab.plm.testmgmt.review.dto

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
class ReviewBiSearchGroupDTO extends GroovyDTO<ReviewBiSearchGroupDTO> {

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
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
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
     * 「关注人」
     */
    @JsonProperty("attentions_imp")
    String attentionsImp
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
     * 「提交人标识」
     * 字典[云系统操作者]
     */
    @JsonProperty("submitter_id")
    String submitterId
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「测试库名称」
     */
    @JsonProperty("library_name")
    String libraryName
    /**
     * 「测试库标识」
     */
    @JsonProperty("library_id")
    String libraryId
    /**
     * 「流程准则标识」
     */
    @JsonProperty("guideline_id")
    String guidelineId
    /**
     * 「评审状态」
     * 字典[用例评审状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「评审类型」
     * 字典[评审类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「测试库是否删除」
     * 字典[是否]
     */
    @JsonProperty("library_is_deleted")
    Integer libraryIsDeleted

    /**
     * 设置「类别」值
     * @param val
     */
    ReviewBiSearchGroupDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    ReviewBiSearchGroupDTO setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName
        return this
    }


    /**
     * 设置「提交时间」值
     * @param val
     */
    ReviewBiSearchGroupDTO setSubmittedAt(Timestamp submittedAt) {
        this.submittedAt = submittedAt
        return this
    }


    /**
     * 设置「完成时间」值
     * @param val
     */
    ReviewBiSearchGroupDTO setCompletedAt(Timestamp completedAt) {
        this.completedAt = completedAt
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ReviewBiSearchGroupDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ReviewBiSearchGroupDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewBiSearchGroupDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「关注人」值
     * @param val
     */
    ReviewBiSearchGroupDTO setAttentionsImp(String attentionsImp) {
        this.attentionsImp = attentionsImp
        return this
    }


    /**
     * 设置「提交人」值
     * @param val
     */
    ReviewBiSearchGroupDTO setSubmitterName(String submitterName) {
        this.submitterName = submitterName
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ReviewBiSearchGroupDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「提交人标识」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewBiSearchGroupDTO setSubmitterId(String submitterId) {
        this.submitterId = submitterId
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    ReviewBiSearchGroupDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    ReviewBiSearchGroupDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ReviewBiSearchGroupDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「测试库名称」值
     * @param val
     */
    ReviewBiSearchGroupDTO setLibraryName(String libraryName) {
        this.libraryName = libraryName
        return this
    }


    /**
     * 设置「测试库标识」值
     * @param val
     */
    ReviewBiSearchGroupDTO setLibraryId(String libraryId) {
        this.libraryId = libraryId
        return this
    }


    /**
     * 设置「流程准则标识」值
     * @param val
     */
    ReviewBiSearchGroupDTO setGuidelineId(String guidelineId) {
        this.guidelineId = guidelineId
        return this
    }


    /**
     * 设置「评审状态」值
     * 字典[用例评审状态]
     * @param val
     */
    ReviewBiSearchGroupDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「评审类型」值
     * 字典[评审类型]
     * @param val
     */
    ReviewBiSearchGroupDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ReviewBiSearchGroupDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「测试库是否删除」值
     * 字典[是否]
     * @param val
     */
    ReviewBiSearchGroupDTO setLibraryIsDeleted(Integer libraryIsDeleted) {
        this.libraryIsDeleted = libraryIsDeleted
        return this
    }

}
