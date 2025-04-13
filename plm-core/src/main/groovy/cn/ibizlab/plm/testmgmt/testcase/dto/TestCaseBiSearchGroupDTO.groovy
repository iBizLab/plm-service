package cn.ibizlab.plm.testmgmt.testcase.dto

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
class TestCaseBiSearchGroupDTO extends GroovyDTO<TestCaseBiSearchGroupDTO> {

    /**
     * 「执行人」
     */
    @JsonProperty("executor_name")
    String executorName
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「目标测试库」
     */
    @JsonProperty("target_library_id")
    String targetLibraryId
    /**
     * 「目标模板」
     */
    @JsonProperty("target_template")
    String targetTemplate
    /**
     * 「实际工时」
     */
    @JsonProperty("actual_workload")
    BigDecimal actualWorkload
    /**
     * 「预估工时」
     */
    @JsonProperty("estimated_workload")
    BigDecimal estimatedWorkload
    /**
     * 「剩余工时」
     */
    @JsonProperty("remaining_workload")
    BigDecimal remainingWorkload
    /**
     * 「工时进度」
     */
    @JsonProperty("workload_schedule")
    BigDecimal workloadSchedule
    /**
     * 「测试库标识」
     */
    @JsonProperty("library_identifier")
    String libraryIdentifier
    /**
     * 「所属测试库」
     */
    @JsonProperty("test_library_name")
    String testLibraryName
    /**
     * 「维护人」
     */
    @JsonProperty("maintenance_name")
    String maintenanceName
    /**
     * 「维护人」
     */
    @JsonProperty("maintenance_id")
    String maintenanceId
    /**
     * 「测试库」
     */
    @JsonProperty("test_library_id")
    String testLibraryId
    /**
     * 「用例模块标识」
     */
    @JsonProperty("suite_id")
    String suiteId
    /**
     * 「执行结果」
     * 字典[执行用例状态]
     */
    @JsonProperty("run_status")
    String runStatus
    /**
     * 「用例类型」
     * 字典[用例类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「重要程度」
     * 字典[用例重要程度]
     */
    @JsonProperty("level")
    String level
    /**
     * 「测试类型」
     * 字典[测试类型]
     */
    @JsonProperty("test_type")
    String testType
    /**
     * 「状态」
     * 字典[用例状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「评审结果」
     * 字典[评审结果]
     */
    @JsonProperty("review_result_state")
    String reviewResultState
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「最新执行结果」
     */
    @JsonProperty("latest_executed")
    List<IEntity> latestExecuted
    /**
     * 「是否已删除」
     * 字典[是否]
     */
    @JsonProperty("is_deleted")
    Integer isDeleted
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
     * 「测试库是否删除」
     * 字典[是否]
     */
    @JsonProperty("library_is_deleted")
    Integer libraryIsDeleted

    /**
     * 设置「执行人」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setExecutorName(String executorName) {
        this.executorName = executorName
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    TestCaseBiSearchGroupDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「目标测试库」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setTargetLibraryId(String targetLibraryId) {
        this.targetLibraryId = targetLibraryId
        return this
    }


    /**
     * 设置「目标模板」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setTargetTemplate(String targetTemplate) {
        this.targetTemplate = targetTemplate
        return this
    }


    /**
     * 设置「实际工时」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setActualWorkload(BigDecimal actualWorkload) {
        this.actualWorkload = actualWorkload
        return this
    }


    /**
     * 设置「预估工时」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setEstimatedWorkload(BigDecimal estimatedWorkload) {
        this.estimatedWorkload = estimatedWorkload
        return this
    }


    /**
     * 设置「剩余工时」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setRemainingWorkload(BigDecimal remainingWorkload) {
        this.remainingWorkload = remainingWorkload
        return this
    }


    /**
     * 设置「工时进度」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setWorkloadSchedule(BigDecimal workloadSchedule) {
        this.workloadSchedule = workloadSchedule
        return this
    }


    /**
     * 设置「测试库标识」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setLibraryIdentifier(String libraryIdentifier) {
        this.libraryIdentifier = libraryIdentifier
        return this
    }


    /**
     * 设置「所属测试库」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setTestLibraryName(String testLibraryName) {
        this.testLibraryName = testLibraryName
        return this
    }


    /**
     * 设置「维护人」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setMaintenanceName(String maintenanceName) {
        this.maintenanceName = maintenanceName
        return this
    }


    /**
     * 设置「维护人」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setMaintenanceId(String maintenanceId) {
        this.maintenanceId = maintenanceId
        return this
    }


    /**
     * 设置「测试库」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setTestLibraryId(String testLibraryId) {
        this.testLibraryId = testLibraryId
        return this
    }


    /**
     * 设置「用例模块标识」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setSuiteId(String suiteId) {
        this.suiteId = suiteId
        return this
    }


    /**
     * 设置「执行结果」值
     * 字典[执行用例状态]
     * @param val
     */
    TestCaseBiSearchGroupDTO setRunStatus(String runStatus) {
        this.runStatus = runStatus
        return this
    }


    /**
     * 设置「用例类型」值
     * 字典[用例类型]
     * @param val
     */
    TestCaseBiSearchGroupDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「重要程度」值
     * 字典[用例重要程度]
     * @param val
     */
    TestCaseBiSearchGroupDTO setLevel(String level) {
        this.level = level
        return this
    }


    /**
     * 设置「测试类型」值
     * 字典[测试类型]
     * @param val
     */
    TestCaseBiSearchGroupDTO setTestType(String testType) {
        this.testType = testType
        return this
    }


    /**
     * 设置「状态」值
     * 字典[用例状态]
     * @param val
     */
    TestCaseBiSearchGroupDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「评审结果」值
     * 字典[评审结果]
     * @param val
     */
    TestCaseBiSearchGroupDTO setReviewResultState(String reviewResultState) {
        this.reviewResultState = reviewResultState
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「最新执行结果」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setLatestExecuted(List<IEntity> latestExecuted) {
        this.latestExecuted = latestExecuted
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    TestCaseBiSearchGroupDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    TestCaseBiSearchGroupDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    TestCaseBiSearchGroupDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「测试库是否删除」值
     * 字典[是否]
     * @param val
     */
    TestCaseBiSearchGroupDTO setLibraryIsDeleted(Integer libraryIsDeleted) {
        this.libraryIsDeleted = libraryIsDeleted
        return this
    }

}
