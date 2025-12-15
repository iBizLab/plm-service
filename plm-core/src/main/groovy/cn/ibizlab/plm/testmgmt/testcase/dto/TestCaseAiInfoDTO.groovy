package cn.ibizlab.plm.testmgmt.testcase.dto

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
class TestCaseAiInfoDTO extends GroovyDTO<TestCaseAiInfoDTO> {

    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「状态」
     * 字典[用例状态]
     */
    @JsonProperty("state")
    String state
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
     * 「前置条件」
     */
    @JsonProperty("precondition")
    String precondition
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
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「测试库」
     */
    @JsonProperty("test_library_id")
    String testLibraryId
    /**
     * 「所属测试库」
     */
    @JsonProperty("test_library_name")
    String testLibraryName

    /**
     * 设置「标题」值
     * @param val
     */
    TestCaseAiInfoDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    TestCaseAiInfoDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    TestCaseAiInfoDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    TestCaseAiInfoDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    TestCaseAiInfoDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    TestCaseAiInfoDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「状态」值
     * 字典[用例状态]
     * @param val
     */
    TestCaseAiInfoDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「用例类型」值
     * 字典[用例类型]
     * @param val
     */
    TestCaseAiInfoDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「测试类型」值
     * 字典[测试类型]
     * @param val
     */
    TestCaseAiInfoDTO setTestType(String testType) {
        this.testType = testType
        return this
    }


    /**
     * 设置「前置条件」值
     * @param val
     */
    TestCaseAiInfoDTO setPrecondition(String precondition) {
        this.precondition = precondition
        return this
    }


    /**
     * 设置「步骤」值
     * @param val
     */
    TestCaseAiInfoDTO setSteps(List<StepDTO> steps) {
        this.steps = steps
        return this
    }


    /**
     * 设置「测试计划名称」值
     * @param val
     */
    TestCaseAiInfoDTO setTestPlanName(String testPlanName) {
        this.testPlanName = testPlanName
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    TestCaseAiInfoDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「测试库」值
     * @param val
     */
    TestCaseAiInfoDTO setTestLibraryId(String testLibraryId) {
        this.testLibraryId = testLibraryId
        return this
    }


    /**
     * 设置「所属测试库」值
     * @param val
     */
    TestCaseAiInfoDTO setTestLibraryName(String testLibraryName) {
        this.testLibraryName = testLibraryName
        return this
    }

}
