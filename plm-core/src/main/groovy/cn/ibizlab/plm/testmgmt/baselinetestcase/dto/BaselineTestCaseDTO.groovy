package cn.ibizlab.plm.testmgmt.baselinetestcase.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.version.dto.VersionDTO
import cn.ibizlab.plm.base.baseline.dto.BaselineDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class BaselineTestCaseDTO extends GroovyDTO<BaselineTestCaseDTO> {

    /**
     * 「关联主体标识」
     */
    @JsonProperty("principal_id")
    String principalId
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
     * 「关联目标类型」
     */
    @JsonProperty("target_type")
    String targetType
    /**
     * 「关联目标标识」
     */
    @JsonProperty("target_id")
    String targetId
    /**
     * 「目标对象版本标识」
     */
    @JsonProperty("target_version_id")
    String targetVersionId
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「维护人」
     */
    @JsonProperty("maintenance_id")
    String maintenanceId
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「状态」
     */
    @JsonProperty("state")
    String state
    /**
     * 「维护人」
     */
    @JsonProperty("maintenance_name")
    String maintenanceName
    /**
     * 「测试库」
     */
    @JsonProperty("test_library_id")
    String testLibraryId
    /**
     * 「当前版本标识」
     */
    @JsonProperty("cur_version_id")
    String curVersionId
    /**
     * 「重要程度」
     * 字典[用例重要程度]
     */
    @JsonProperty("level")
    String level
    /**
     * 「用例类型」
     * 字典[用例类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「关联目标版本」
     */
    @JsonProperty("target_version")
    VersionDTO targetVersion
    /**
     * 「前置条件」
     */
    @JsonProperty("precondition")
    String precondition
    /**
     * 「评审结果」
     */
    @JsonProperty("review_result_state")
    String reviewResultState
    /**
     * 「测试类型」
     * 字典[测试类型]
     */
    @JsonProperty("test_type")
    String testType
    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「用例模块标识」
     */
    @JsonProperty("suite_id")
    String suiteId
    /**
     * 「所属测试库」
     */
    @JsonProperty("test_library_name")
    String testLibraryName
    /**
     * 「基线」
     */
    @JsonProperty("baseline")
    BaselineDTO baseline
    /**
     * 「是否已删除」
     */
    @JsonProperty("is_deleted")
    String isDeleted
    /**
     * 「是否已归档」
     */
    @JsonProperty("is_archived")
    String isArchived
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
     * 设置「关联主体标识」值
     * @param val
     */
    BaselineTestCaseDTO setPrincipalId(String principalId) {
        this.principalId = principalId
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    BaselineTestCaseDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「关联主体类型」值
     * @param val
     */
    BaselineTestCaseDTO setPrincipalType(String principalType) {
        this.principalType = principalType
        return this
    }


    /**
     * 设置「关联目标类型」值
     * @param val
     */
    BaselineTestCaseDTO setTargetType(String targetType) {
        this.targetType = targetType
        return this
    }


    /**
     * 设置「关联目标标识」值
     * @param val
     */
    BaselineTestCaseDTO setTargetId(String targetId) {
        this.targetId = targetId
        return this
    }


    /**
     * 设置「目标对象版本标识」值
     * @param val
     */
    BaselineTestCaseDTO setTargetVersionId(String targetVersionId) {
        this.targetVersionId = targetVersionId
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    BaselineTestCaseDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「维护人」值
     * @param val
     */
    BaselineTestCaseDTO setMaintenanceId(String maintenanceId) {
        this.maintenanceId = maintenanceId
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    BaselineTestCaseDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「状态」值
     * @param val
     */
    BaselineTestCaseDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「维护人」值
     * @param val
     */
    BaselineTestCaseDTO setMaintenanceName(String maintenanceName) {
        this.maintenanceName = maintenanceName
        return this
    }


    /**
     * 设置「测试库」值
     * @param val
     */
    BaselineTestCaseDTO setTestLibraryId(String testLibraryId) {
        this.testLibraryId = testLibraryId
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    BaselineTestCaseDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }


    /**
     * 设置「重要程度」值
     * 字典[用例重要程度]
     * @param val
     */
    BaselineTestCaseDTO setLevel(String level) {
        this.level = level
        return this
    }


    /**
     * 设置「用例类型」值
     * 字典[用例类型]
     * @param val
     */
    BaselineTestCaseDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「关联目标版本」值
     * @param val
     */
    BaselineTestCaseDTO setTargetVersion(VersionDTO targetVersion) {
        this.targetVersion = targetVersion
        return this
    }


    /**
     * 设置「前置条件」值
     * @param val
     */
    BaselineTestCaseDTO setPrecondition(String precondition) {
        this.precondition = precondition
        return this
    }


    /**
     * 设置「评审结果」值
     * @param val
     */
    BaselineTestCaseDTO setReviewResultState(String reviewResultState) {
        this.reviewResultState = reviewResultState
        return this
    }


    /**
     * 设置「测试类型」值
     * 字典[测试类型]
     * @param val
     */
    BaselineTestCaseDTO setTestType(String testType) {
        this.testType = testType
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    BaselineTestCaseDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    BaselineTestCaseDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「用例模块标识」值
     * @param val
     */
    BaselineTestCaseDTO setSuiteId(String suiteId) {
        this.suiteId = suiteId
        return this
    }


    /**
     * 设置「所属测试库」值
     * @param val
     */
    BaselineTestCaseDTO setTestLibraryName(String testLibraryName) {
        this.testLibraryName = testLibraryName
        return this
    }


    /**
     * 设置「基线」值
     * @param val
     */
    BaselineTestCaseDTO setBaseline(BaselineDTO baseline) {
        this.baseline = baseline
        return this
    }


    /**
     * 设置「是否已删除」值
     * @param val
     */
    BaselineTestCaseDTO setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「是否已归档」值
     * @param val
     */
    BaselineTestCaseDTO setIsArchived(String isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    BaselineTestCaseDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    BaselineTestCaseDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    BaselineTestCaseDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    BaselineTestCaseDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    BaselineTestCaseDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    BaselineTestCaseDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
