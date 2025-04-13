package cn.ibizlab.plm.testmgmt.testcasetemplate.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.testmgmt.step.dto.StepDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class TestCaseTemplateDTO extends GroovyDTO<TestCaseTemplateDTO> {

    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
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
     * 「测试类型」
     * 字典[测试类型]
     */
    @JsonProperty("test_type")
    String testType
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「前置条件」
     */
    @JsonProperty("precondition")
    String precondition
    /**
     * 「是否已归档」
     * 字典[是否]
     */
    @JsonProperty("is_archived")
    Integer isArchived
    /**
     * 「是否已删除」
     * 字典[是否]
     */
    @JsonProperty("is_deleted")
    Integer isDeleted
    /**
     * 「评审状态」
     * 字典[用例评审状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「模块路径」
     */
    @JsonProperty("suites")
    String suites
    /**
     * 「步骤」
     */
    @JsonProperty("steps")
    List<StepDTO> steps
    /**
     * 「测试计划名称」
     */
    @JsonProperty("test_plan_name")
    String testPlanName
    /**
     * 「执行时间」
     */
    @JsonProperty("executed_at")
    Timestamp executedAt
    /**
     * 「执行人」
     */
    @JsonProperty("executor_name")
    String executorName
    /**
     * 「执行结果」
     * 字典[执行用例状态]
     */
    @JsonProperty("run_status")
    String runStatus
    /**
     * 「目标测试库」
     */
    @JsonProperty("target_library_id")
    String targetLibraryId
    /**
     * 「工时进度」
     */
    @JsonProperty("workload_schedule")
    BigDecimal workloadSchedule
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
     * 「实际工时」
     */
    @JsonProperty("actual_workload")
    BigDecimal actualWorkload
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
     * 「用例模块标识」
     */
    @JsonProperty("suite_id")
    String suiteId
    /**
     * 「模块名称」
     */
    @JsonProperty("suite_name")
    String suiteName
    /**
     * 「测试库标识」
     */
    @JsonProperty("test_library_id")
    String testLibraryId
    /**
     * 「测试库名称」
     */
    @JsonProperty("test_library_name")
    String testLibraryName
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
     * 设置「标题」值
     * @param val
     */
    TestCaseTemplateDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「重要程度」值
     * 字典[用例重要程度]
     * @param val
     */
    TestCaseTemplateDTO setLevel(String level) {
        this.level = level
        return this
    }


    /**
     * 设置「用例类型」值
     * 字典[用例类型]
     * @param val
     */
    TestCaseTemplateDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「测试类型」值
     * 字典[测试类型]
     * @param val
     */
    TestCaseTemplateDTO setTestType(String testType) {
        this.testType = testType
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    TestCaseTemplateDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「前置条件」值
     * @param val
     */
    TestCaseTemplateDTO setPrecondition(String precondition) {
        this.precondition = precondition
        return this
    }


    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    TestCaseTemplateDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    TestCaseTemplateDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「评审状态」值
     * 字典[用例评审状态]
     * @param val
     */
    TestCaseTemplateDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「模块路径」值
     * @param val
     */
    TestCaseTemplateDTO setSuites(String suites) {
        this.suites = suites
        return this
    }


    /**
     * 设置「步骤」值
     * @param val
     */
    TestCaseTemplateDTO setSteps(List<StepDTO> steps) {
        this.steps = steps
        return this
    }


    /**
     * 设置「测试计划名称」值
     * @param val
     */
    TestCaseTemplateDTO setTestPlanName(String testPlanName) {
        this.testPlanName = testPlanName
        return this
    }


    /**
     * 设置「执行时间」值
     * @param val
     */
    TestCaseTemplateDTO setExecutedAt(Timestamp executedAt) {
        this.executedAt = executedAt
        return this
    }


    /**
     * 设置「执行人」值
     * @param val
     */
    TestCaseTemplateDTO setExecutorName(String executorName) {
        this.executorName = executorName
        return this
    }


    /**
     * 设置「执行结果」值
     * 字典[执行用例状态]
     * @param val
     */
    TestCaseTemplateDTO setRunStatus(String runStatus) {
        this.runStatus = runStatus
        return this
    }


    /**
     * 设置「目标测试库」值
     * @param val
     */
    TestCaseTemplateDTO setTargetLibraryId(String targetLibraryId) {
        this.targetLibraryId = targetLibraryId
        return this
    }


    /**
     * 设置「工时进度」值
     * @param val
     */
    TestCaseTemplateDTO setWorkloadSchedule(BigDecimal workloadSchedule) {
        this.workloadSchedule = workloadSchedule
        return this
    }


    /**
     * 设置「预估工时」值
     * @param val
     */
    TestCaseTemplateDTO setEstimatedWorkload(BigDecimal estimatedWorkload) {
        this.estimatedWorkload = estimatedWorkload
        return this
    }


    /**
     * 设置「剩余工时」值
     * @param val
     */
    TestCaseTemplateDTO setRemainingWorkload(BigDecimal remainingWorkload) {
        this.remainingWorkload = remainingWorkload
        return this
    }


    /**
     * 设置「实际工时」值
     * @param val
     */
    TestCaseTemplateDTO setActualWorkload(BigDecimal actualWorkload) {
        this.actualWorkload = actualWorkload
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    TestCaseTemplateDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    TestCaseTemplateDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    TestCaseTemplateDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    TestCaseTemplateDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「用例模块标识」值
     * @param val
     */
    TestCaseTemplateDTO setSuiteId(String suiteId) {
        this.suiteId = suiteId
        return this
    }


    /**
     * 设置「模块名称」值
     * @param val
     */
    TestCaseTemplateDTO setSuiteName(String suiteName) {
        this.suiteName = suiteName
        return this
    }


    /**
     * 设置「测试库标识」值
     * @param val
     */
    TestCaseTemplateDTO setTestLibraryId(String testLibraryId) {
        this.testLibraryId = testLibraryId
        return this
    }


    /**
     * 设置「测试库名称」值
     * @param val
     */
    TestCaseTemplateDTO setTestLibraryName(String testLibraryName) {
        this.testLibraryName = testLibraryName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    TestCaseTemplateDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    TestCaseTemplateDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
