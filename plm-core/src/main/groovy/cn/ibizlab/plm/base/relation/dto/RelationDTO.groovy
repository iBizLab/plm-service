package cn.ibizlab.plm.base.relation.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.projmgmt.workitem.dto.WorkItemDTO
import cn.ibizlab.plm.prodmgmt.idea.dto.IdeaDTO
import cn.ibizlab.plm.prodmgmt.ticket.dto.TicketDTO
import cn.ibizlab.plm.prodmgmt.customer.dto.CustomerDTO
import cn.ibizlab.plm.testmgmt.testcase.dto.TestCaseDTO
import cn.ibizlab.plm.projmgmt.workitem.dto.WorkItemDTO
import cn.ibizlab.plm.prodmgmt.product.dto.ProductDTO
import cn.ibizlab.plm.projmgmt.project.dto.ProjectDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class RelationDTO extends GroovyDTO<RelationDTO> {

    /**
     * 「重要程度」
     * 字典[通用重要程度]
     */
    @JsonProperty("level")
    String level
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
     * 「目标主体标识」
     */
    @JsonProperty("target_id")
    String targetId
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
     * 「工作项」
     */
    @JsonProperty("work_item")
    WorkItemDTO workItem
    /**
     * 「产品需求」
     */
    @JsonProperty("idea")
    IdeaDTO idea
    /**
     * 「工单」
     */
    @JsonProperty("ticket")
    TicketDTO ticket
    /**
     * 「客户」
     */
    @JsonProperty("customer")
    CustomerDTO customer
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
     * 「关联类型」
     */
    @JsonProperty("relation_type")
    String relationType
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
     * 「源工作项」
     */
    @JsonProperty("principal_work_item")
    WorkItemDTO principalWorkItem
    /**
     * 「前后置任务」
     * 字典[选择前后置任务]
     */
    @JsonProperty("job_type")
    String jobType
    /**
     * 「排序」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「产品」
     */
    @JsonProperty("product")
    ProductDTO product
    /**
     * 「项目对象」
     */
    @JsonProperty("project_obj")
    ProjectDTO projectObj
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
     * 设置「重要程度」值
     * 字典[通用重要程度]
     * @param val
     */
    RelationDTO setLevel(String level) {
        this.level = level
        return this
    }


    /**
     * 设置「关联主体标识」值
     * @param val
     */
    RelationDTO setPrincipalId(String principalId) {
        this.principalId = principalId
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    RelationDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「关联主体类型」值
     * @param val
     */
    RelationDTO setPrincipalType(String principalType) {
        this.principalType = principalType
        return this
    }


    /**
     * 设置「关联目标类型」值
     * @param val
     */
    RelationDTO setTargetType(String targetType) {
        this.targetType = targetType
        return this
    }


    /**
     * 设置「目标主体标识」值
     * @param val
     */
    RelationDTO setTargetId(String targetId) {
        this.targetId = targetId
        return this
    }


    /**
     * 设置「父对象版本标识」值
     * @param val
     */
    RelationDTO setParentVersionId(String parentVersionId) {
        this.parentVersionId = parentVersionId
        return this
    }


    /**
     * 设置「目标对象版本标识」值
     * @param val
     */
    RelationDTO setTargetVersionId(String targetVersionId) {
        this.targetVersionId = targetVersionId
        return this
    }


    /**
     * 设置「工作项」值
     * @param val
     */
    RelationDTO setWorkItem(WorkItemDTO workItem) {
        this.workItem = workItem
        return this
    }


    /**
     * 设置「产品需求」值
     * @param val
     */
    RelationDTO setIdea(IdeaDTO idea) {
        this.idea = idea
        return this
    }


    /**
     * 设置「工单」值
     * @param val
     */
    RelationDTO setTicket(TicketDTO ticket) {
        this.ticket = ticket
        return this
    }


    /**
     * 设置「客户」值
     * @param val
     */
    RelationDTO setCustomer(CustomerDTO customer) {
        this.customer = customer
        return this
    }


    /**
     * 设置「测试用例」值
     * @param val
     */
    RelationDTO setTestCase(TestCaseDTO testCase) {
        this.testCase = testCase
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    RelationDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }


    /**
     * 设置「目标对象编号」值
     * @param val
     */
    RelationDTO setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier
        return this
    }


    /**
     * 设置「目标对象标题」值
     * @param val
     */
    RelationDTO setTargetTitle(String targetTitle) {
        this.targetTitle = targetTitle
        return this
    }


    /**
     * 设置「目标对象状态」值
     * @param val
     */
    RelationDTO setTargetState(String targetState) {
        this.targetState = targetState
        return this
    }


    /**
     * 设置「目标对象负责人」值
     * @param val
     */
    RelationDTO setTargetAssignee(String targetAssignee) {
        this.targetAssignee = targetAssignee
        return this
    }


    /**
     * 设置「关联类型」值
     * @param val
     */
    RelationDTO setRelationType(String relationType) {
        this.relationType = relationType
        return this
    }


    /**
     * 设置「目标对象优先级」值
     * @param val
     */
    RelationDTO setTargetPriority(String targetPriority) {
        this.targetPriority = targetPriority
        return this
    }


    /**
     * 设置「目标对象父标识」值
     * @param val
     */
    RelationDTO setTargetParentId(String targetParentId) {
        this.targetParentId = targetParentId
        return this
    }


    /**
     * 设置「源工作项」值
     * @param val
     */
    RelationDTO setPrincipalWorkItem(WorkItemDTO principalWorkItem) {
        this.principalWorkItem = principalWorkItem
        return this
    }


    /**
     * 设置「前后置任务」值
     * 字典[选择前后置任务]
     * @param val
     */
    RelationDTO setJobType(String jobType) {
        this.jobType = jobType
        return this
    }


    /**
     * 设置「排序」值
     * @param val
     */
    RelationDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「产品」值
     * @param val
     */
    RelationDTO setProduct(ProductDTO product) {
        this.product = product
        return this
    }


    /**
     * 设置「项目对象」值
     * @param val
     */
    RelationDTO setProjectObj(ProjectDTO projectObj) {
        this.projectObj = projectObj
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    RelationDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    RelationDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    RelationDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    RelationDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    RelationDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    RelationDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
