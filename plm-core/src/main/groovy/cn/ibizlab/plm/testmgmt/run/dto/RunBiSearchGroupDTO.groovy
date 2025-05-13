package cn.ibizlab.plm.testmgmt.run.dto

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
class RunBiSearchGroupDTO extends GroovyDTO<RunBiSearchGroupDTO> {

    /**
     * 「是否最新」
     * 字典[是否]
     */
    @JsonProperty("is_newest")
    Integer isNewest
    /**
     * 「执行时间」
     */
    @JsonProperty("executed_at")
    Timestamp executedAt
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「执行人」
     */
    @JsonProperty("executor_name")
    String executorName
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「执行人标识」
     */
    @JsonProperty("executor_id")
    String executorId
    /**
     * 「当前版本标识」
     */
    @JsonProperty("cur_version_id")
    String curVersionId
    /**
     * 「工时进度」
     */
    @JsonProperty("workload_schedule")
    BigDecimal workloadSchedule
    /**
     * 「剩余工时」
     */
    @JsonProperty("remaining_workload")
    BigDecimal remainingWorkload
    /**
     * 「关联执行结果数」
     */
    @JsonProperty("relation_total_history")
    BigDecimal relationTotalHistory
    /**
     * 「关联缺陷数」
     */
    @JsonProperty("relation_total_bug")
    BigDecimal relationTotalBug
    /**
     * 「预估工时」
     */
    @JsonProperty("estimated_workload")
    BigDecimal estimatedWorkload
    /**
     * 「实际工时」
     */
    @JsonProperty("actual_workload")
    BigDecimal actualWorkload
    /**
     * 「所属测试库」
     */
    @JsonProperty("library_name")
    String libraryName
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
     * 「用例状态」
     * 字典[用例状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「维护人」
     */
    @JsonProperty("maintenance_name")
    String maintenanceName
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
     * 「测试库标识」
     * 字典[全部测试库]
     */
    @JsonProperty("library_id")
    String libraryId
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「所属模块」
     */
    @JsonProperty("suite_name")
    String suiteName
    /**
     * 「名称」
     */
    @JsonProperty("case_name")
    String caseName
    /**
     * 「测试计划」
     */
    @JsonProperty("plan_name")
    String planName
    /**
     * 「测试计划标识」
     */
    @JsonProperty("plan_id")
    String planId
    /**
     * 「测试用例标识」
     */
    @JsonProperty("case_id")
    String caseId
    /**
     * 「执行结果」
     * 字典[执行用例状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「优先级」
     * 字典[优先级]
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「bi测试计划名称」
     */
    @JsonProperty("bi_plan_name")
    String biPlanName
    /**
     * 「测试库是否删除」
     * 字典[是否]
     */
    @JsonProperty("library_is_deleted")
    Integer libraryIsDeleted

    /**
     * 设置「是否最新」值
     * 字典[是否]
     * @param val
     */
    RunBiSearchGroupDTO setIsNewest(Integer isNewest) {
        this.isNewest = isNewest
        return this
    }


    /**
     * 设置「执行时间」值
     * @param val
     */
    RunBiSearchGroupDTO setExecutedAt(Timestamp executedAt) {
        this.executedAt = executedAt
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    RunBiSearchGroupDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    RunBiSearchGroupDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「执行人」值
     * @param val
     */
    RunBiSearchGroupDTO setExecutorName(String executorName) {
        this.executorName = executorName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    RunBiSearchGroupDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    RunBiSearchGroupDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    RunBiSearchGroupDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「执行人标识」值
     * @param val
     */
    RunBiSearchGroupDTO setExecutorId(String executorId) {
        this.executorId = executorId
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    RunBiSearchGroupDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }


    /**
     * 设置「工时进度」值
     * @param val
     */
    RunBiSearchGroupDTO setWorkloadSchedule(BigDecimal workloadSchedule) {
        this.workloadSchedule = workloadSchedule
        return this
    }


    /**
     * 设置「剩余工时」值
     * @param val
     */
    RunBiSearchGroupDTO setRemainingWorkload(BigDecimal remainingWorkload) {
        this.remainingWorkload = remainingWorkload
        return this
    }


    /**
     * 设置「关联执行结果数」值
     * @param val
     */
    RunBiSearchGroupDTO setRelationTotalHistory(BigDecimal relationTotalHistory) {
        this.relationTotalHistory = relationTotalHistory
        return this
    }


    /**
     * 设置「关联缺陷数」值
     * @param val
     */
    RunBiSearchGroupDTO setRelationTotalBug(BigDecimal relationTotalBug) {
        this.relationTotalBug = relationTotalBug
        return this
    }


    /**
     * 设置「预估工时」值
     * @param val
     */
    RunBiSearchGroupDTO setEstimatedWorkload(BigDecimal estimatedWorkload) {
        this.estimatedWorkload = estimatedWorkload
        return this
    }


    /**
     * 设置「实际工时」值
     * @param val
     */
    RunBiSearchGroupDTO setActualWorkload(BigDecimal actualWorkload) {
        this.actualWorkload = actualWorkload
        return this
    }


    /**
     * 设置「所属测试库」值
     * @param val
     */
    RunBiSearchGroupDTO setLibraryName(String libraryName) {
        this.libraryName = libraryName
        return this
    }


    /**
     * 设置「用例类型」值
     * 字典[用例类型]
     * @param val
     */
    RunBiSearchGroupDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「重要程度」值
     * 字典[用例重要程度]
     * @param val
     */
    RunBiSearchGroupDTO setLevel(String level) {
        this.level = level
        return this
    }


    /**
     * 设置「用例状态」值
     * 字典[用例状态]
     * @param val
     */
    RunBiSearchGroupDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「维护人」值
     * @param val
     */
    RunBiSearchGroupDTO setMaintenanceName(String maintenanceName) {
        this.maintenanceName = maintenanceName
        return this
    }


    /**
     * 设置「测试类型」值
     * 字典[测试类型]
     * @param val
     */
    RunBiSearchGroupDTO setTestType(String testType) {
        this.testType = testType
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    RunBiSearchGroupDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「测试库标识」值
     * 字典[全部测试库]
     * @param val
     */
    RunBiSearchGroupDTO setLibraryId(String libraryId) {
        this.libraryId = libraryId
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    RunBiSearchGroupDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「所属模块」值
     * @param val
     */
    RunBiSearchGroupDTO setSuiteName(String suiteName) {
        this.suiteName = suiteName
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    RunBiSearchGroupDTO setCaseName(String caseName) {
        this.caseName = caseName
        return this
    }


    /**
     * 设置「测试计划」值
     * @param val
     */
    RunBiSearchGroupDTO setPlanName(String planName) {
        this.planName = planName
        return this
    }


    /**
     * 设置「测试计划标识」值
     * @param val
     */
    RunBiSearchGroupDTO setPlanId(String planId) {
        this.planId = planId
        return this
    }


    /**
     * 设置「测试用例标识」值
     * @param val
     */
    RunBiSearchGroupDTO setCaseId(String caseId) {
        this.caseId = caseId
        return this
    }


    /**
     * 设置「执行结果」值
     * 字典[执行用例状态]
     * @param val
     */
    RunBiSearchGroupDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[优先级]
     * @param val
     */
    RunBiSearchGroupDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    RunBiSearchGroupDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「bi测试计划名称」值
     * @param val
     */
    RunBiSearchGroupDTO setBiPlanName(String biPlanName) {
        this.biPlanName = biPlanName
        return this
    }


    /**
     * 设置「测试库是否删除」值
     * 字典[是否]
     * @param val
     */
    RunBiSearchGroupDTO setLibraryIsDeleted(Integer libraryIsDeleted) {
        this.libraryIsDeleted = libraryIsDeleted
        return this
    }

}
