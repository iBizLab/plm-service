package cn.ibizlab.plm.testmgmt.step.dto

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
class StepDTO extends GroovyDTO<StepDTO> {

    /**
     * 「步骤描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「预期结果」
     */
    @JsonProperty("expected_value")
    String expectedValue
    /**
     * 「分组标识」
     */
    @JsonProperty("group_id")
    String groupId
    /**
     * 「实际」
     */
    @JsonProperty("actual_value")
    String actualValue
    /**
     * 「是否分组」
     * 字典[是否]
     */
    @JsonProperty("is_group")
    Integer isGroup
    /**
     * 「执行结果」
     */
    @JsonProperty("status")
    String status
    /**
     * 「用例标识」
     */
    @JsonProperty("case_id")
    String caseId
    /**
     * 「用例模板标识」
     */
    @JsonProperty("case_template_id")
    String caseTemplateId
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
     * 设置「步骤描述」值
     * @param val
     */
    StepDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「预期结果」值
     * @param val
     */
    StepDTO setExpectedValue(String expectedValue) {
        this.expectedValue = expectedValue
        return this
    }


    /**
     * 设置「分组标识」值
     * @param val
     */
    StepDTO setGroupId(String groupId) {
        this.groupId = groupId
        return this
    }


    /**
     * 设置「实际」值
     * @param val
     */
    StepDTO setActualValue(String actualValue) {
        this.actualValue = actualValue
        return this
    }


    /**
     * 设置「是否分组」值
     * 字典[是否]
     * @param val
     */
    StepDTO setIsGroup(Integer isGroup) {
        this.isGroup = isGroup
        return this
    }


    /**
     * 设置「执行结果」值
     * @param val
     */
    StepDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「用例标识」值
     * @param val
     */
    StepDTO setCaseId(String caseId) {
        this.caseId = caseId
        return this
    }


    /**
     * 设置「用例模板标识」值
     * @param val
     */
    StepDTO setCaseTemplateId(String caseTemplateId) {
        this.caseTemplateId = caseTemplateId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    StepDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    StepDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    StepDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    StepDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「执行用例标识」值
     * @param val
     */
    StepDTO setRunId(String runId) {
        this.runId = runId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    StepDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    StepDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
