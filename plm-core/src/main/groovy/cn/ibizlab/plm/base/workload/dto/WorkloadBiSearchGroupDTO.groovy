package cn.ibizlab.plm.base.workload.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.projmgmt.workitem.dto.WorkItemDTO
import cn.ibizlab.plm.testmgmt.testcase.dto.TestCaseDTO
import cn.ibizlab.plm.prodmgmt.idea.dto.IdeaDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class WorkloadBiSearchGroupDTO extends GroovyDTO<WorkloadBiSearchGroupDTO> {

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
     * 「工作日期」
     */
    @JsonProperty("register_date")
    Timestamp registerDate
    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「工时主体类型」
     */
    @JsonProperty("principal_type")
    String principalType
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「事项」
     */
    @JsonProperty("name")
    String name
    /**
     * 「工时主体标识」
     */
    @JsonProperty("principal_id")
    String principalId
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「访问父类」
     */
    @JsonProperty("recent_parent")
    String recentParent
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「时长」
     */
    @JsonProperty("duration")
    BigDecimal duration
    /**
     * 「名称」
     */
    @JsonProperty("type_name")
    String typeName
    /**
     * 「工作项」
     */
    @JsonProperty("work_item")
    WorkItemDTO workItem
    /**
     * 「用例」
     */
    @JsonProperty("test_case")
    TestCaseDTO testCase
    /**
     * 「需求」
     */
    @JsonProperty("idea")
    IdeaDTO idea
    /**
     * 「类别」
     */
    @JsonProperty("type_id")
    String typeId
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id

    /**
     * 设置「建立时间」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「工作日期」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setRegisterDate(Timestamp registerDate) {
        this.registerDate = registerDate
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「工时主体类型」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setPrincipalType(String principalType) {
        this.principalType = principalType
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkloadBiSearchGroupDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「事项」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「工时主体标识」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setPrincipalId(String principalId) {
        this.principalId = principalId
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「访问父类」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setRecentParent(String recentParent) {
        this.recentParent = recentParent
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkloadBiSearchGroupDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「时长」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setDuration(BigDecimal duration) {
        this.duration = duration
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setTypeName(String typeName) {
        this.typeName = typeName
        return this
    }


    /**
     * 设置「工作项」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setWorkItem(WorkItemDTO workItem) {
        this.workItem = workItem
        return this
    }


    /**
     * 设置「用例」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setTestCase(TestCaseDTO testCase) {
        this.testCase = testCase
        return this
    }


    /**
     * 设置「需求」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setIdea(IdeaDTO idea) {
        this.idea = idea
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setTypeId(String typeId) {
        this.typeId = typeId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    WorkloadBiSearchGroupDTO setId(String id) {
        this.id = id
        return this
    }

}
