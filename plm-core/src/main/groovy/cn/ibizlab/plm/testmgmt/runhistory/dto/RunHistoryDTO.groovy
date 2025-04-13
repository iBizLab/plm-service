package cn.ibizlab.plm.testmgmt.runhistory.dto

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
class RunHistoryDTO extends GroovyDTO<RunHistoryDTO> {

    /**
     * 「测试用例」
     */
    @JsonProperty("case_id")
    String caseId
    /**
     * 「备注」
     */
    @JsonProperty("remark")
    String remark
    /**
     * 「执行时间」
     */
    @JsonProperty("executed_at")
    Timestamp executedAt
    /**
     * 「执行结果」
     * 字典[执行用例状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「步骤」
     */
    @JsonProperty("steps")
    List<StepDTO> steps
    /**
     * 「执行人标识」
     */
    @JsonProperty("executor_id")
    String executorId
    /**
     * 「执行人」
     */
    @JsonProperty("executor_name")
    String executorName
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
     * 「执行用例标识」
     */
    @JsonProperty("run_id")
    String runId
    /**
     * 「标题」
     */
    @JsonProperty("run_title")
    String runTitle
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
     * 设置「测试用例」值
     * @param val
     */
    RunHistoryDTO setCaseId(String caseId) {
        this.caseId = caseId
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    RunHistoryDTO setRemark(String remark) {
        this.remark = remark
        return this
    }


    /**
     * 设置「执行时间」值
     * @param val
     */
    RunHistoryDTO setExecutedAt(Timestamp executedAt) {
        this.executedAt = executedAt
        return this
    }


    /**
     * 设置「执行结果」值
     * 字典[执行用例状态]
     * @param val
     */
    RunHistoryDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「步骤」值
     * @param val
     */
    RunHistoryDTO setSteps(List<StepDTO> steps) {
        this.steps = steps
        return this
    }


    /**
     * 设置「执行人标识」值
     * @param val
     */
    RunHistoryDTO setExecutorId(String executorId) {
        this.executorId = executorId
        return this
    }


    /**
     * 设置「执行人」值
     * @param val
     */
    RunHistoryDTO setExecutorName(String executorName) {
        this.executorName = executorName
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    RunHistoryDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    RunHistoryDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    RunHistoryDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    RunHistoryDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「执行用例标识」值
     * @param val
     */
    RunHistoryDTO setRunId(String runId) {
        this.runId = runId
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    RunHistoryDTO setRunTitle(String runTitle) {
        this.runTitle = runTitle
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    RunHistoryDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    RunHistoryDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
