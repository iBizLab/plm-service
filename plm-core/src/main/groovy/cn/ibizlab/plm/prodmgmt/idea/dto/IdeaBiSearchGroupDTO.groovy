package cn.ibizlab.plm.prodmgmt.idea.dto

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
class IdeaBiSearchGroupDTO extends GroovyDTO<IdeaBiSearchGroupDTO> {

    /**
     * 「是否已删除」
     * 字典[是否]
     */
    @JsonProperty("is_deleted")
    Integer isDeleted
    /**
     * 「实际开始时间」
     */
    @JsonProperty("real_at_from")
    Timestamp realAtFrom
    /**
     * 「实际结束时间」
     */
    @JsonProperty("real_at_to")
    Timestamp realAtTo
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「计划结束时间」
     */
    @JsonProperty("plan_at_to")
    Timestamp planAtTo
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「计划开始时间」
     */
    @JsonProperty("plan_at_from")
    Timestamp planAtFrom
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「计划时间」
     */
    @JsonProperty("plan_at")
    String planAt
    /**
     * 「实际时间」
     */
    @JsonProperty("real_at")
    String realAt
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
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
     * 「当前版本名称」
     */
    @JsonProperty("cur_version_name")
    String curVersionName
    /**
     * 「选择版本标识」
     */
    @JsonProperty("choose_version_id")
    String chooseVersionId
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「模块」
     */
    @JsonProperty("suite")
    String suite
    /**
     * 「剩余工时」
     */
    @JsonProperty("remaining_workload")
    BigDecimal remainingWorkload
    /**
     * 「关联产品需求数」
     */
    @JsonProperty("relation_total_idea")
    BigDecimal relationTotalIdea
    /**
     * 「实际工时」
     */
    @JsonProperty("actual_workload")
    BigDecimal actualWorkload
    /**
     * 「关联工单数」
     */
    @JsonProperty("relation_total_ticket")
    BigDecimal relationTotalTicket
    /**
     * 「关联客户数」
     */
    @JsonProperty("relation_total_customer")
    BigDecimal relationTotalCustomer
    /**
     * 「关联测试用例数」
     */
    @JsonProperty("relation_total_test_case")
    BigDecimal relationTotalTestCase
    /**
     * 「预估工时」
     */
    @JsonProperty("estimated_workload")
    BigDecimal estimatedWorkload
    /**
     * 「工时进度」
     */
    @JsonProperty("workload_schedule")
    BigDecimal workloadSchedule
    /**
     * 「进度」
     */
    @JsonProperty("progress")
    BigDecimal progress
    /**
     * 「关联工作项数」
     */
    @JsonProperty("relation_total_work_item")
    BigDecimal relationTotalWorkItem
    /**
     * 「所属产品」
     */
    @JsonProperty("product_name")
    String productName
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「名称」
     */
    @JsonProperty("category_name")
    String categoryName
    /**
     * 「产品」
     */
    @JsonProperty("product_id")
    String productId
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_id")
    String assigneeId
    /**
     * 「类别标识」
     */
    @JsonProperty("category_id")
    String categoryId
    /**
     * 「需求来源」
     * 字典[需求来源]
     */
    @JsonProperty("idea_from")
    String ideaFrom
    /**
     * 「状态」
     * 字典[需求状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「优先级」
     * 字典[需求优先级]
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「需求类型」
     * 字典[需求类型]
     */
    @JsonProperty("idea_type")
    String ideaType
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「子产品名称」
     */
    @JsonProperty("section_name")
    String sectionName
    /**
     * 「子产品标识」
     * 字典[需求子产品2]
     */
    @JsonProperty("section_id")
    String sectionId
    /**
     * 「产品是否删除」
     * 字典[是否]
     */
    @JsonProperty("product_is_deleted")
    Integer productIsDeleted

    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    IdeaBiSearchGroupDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「实际开始时间」值
     * @param val
     */
    IdeaBiSearchGroupDTO setRealAtFrom(Timestamp realAtFrom) {
        this.realAtFrom = realAtFrom
        return this
    }


    /**
     * 设置「实际结束时间」值
     * @param val
     */
    IdeaBiSearchGroupDTO setRealAtTo(Timestamp realAtTo) {
        this.realAtTo = realAtTo
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IdeaBiSearchGroupDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「计划结束时间」值
     * @param val
     */
    IdeaBiSearchGroupDTO setPlanAtTo(Timestamp planAtTo) {
        this.planAtTo = planAtTo
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    IdeaBiSearchGroupDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「计划开始时间」值
     * @param val
     */
    IdeaBiSearchGroupDTO setPlanAtFrom(Timestamp planAtFrom) {
        this.planAtFrom = planAtFrom
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IdeaBiSearchGroupDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「计划时间」值
     * @param val
     */
    IdeaBiSearchGroupDTO setPlanAt(String planAt) {
        this.planAt = planAt
        return this
    }


    /**
     * 设置「实际时间」值
     * @param val
     */
    IdeaBiSearchGroupDTO setRealAt(String realAt) {
        this.realAt = realAt
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    IdeaBiSearchGroupDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    IdeaBiSearchGroupDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「关注人」值
     * @param val
     */
    IdeaBiSearchGroupDTO setAttentionsImp(String attentionsImp) {
        this.attentionsImp = attentionsImp
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    IdeaBiSearchGroupDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    IdeaBiSearchGroupDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「当前版本名称」值
     * @param val
     */
    IdeaBiSearchGroupDTO setCurVersionName(String curVersionName) {
        this.curVersionName = curVersionName
        return this
    }


    /**
     * 设置「选择版本标识」值
     * @param val
     */
    IdeaBiSearchGroupDTO setChooseVersionId(String chooseVersionId) {
        this.chooseVersionId = chooseVersionId
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    IdeaBiSearchGroupDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「模块」值
     * @param val
     */
    IdeaBiSearchGroupDTO setSuite(String suite) {
        this.suite = suite
        return this
    }


    /**
     * 设置「剩余工时」值
     * @param val
     */
    IdeaBiSearchGroupDTO setRemainingWorkload(BigDecimal remainingWorkload) {
        this.remainingWorkload = remainingWorkload
        return this
    }


    /**
     * 设置「关联产品需求数」值
     * @param val
     */
    IdeaBiSearchGroupDTO setRelationTotalIdea(BigDecimal relationTotalIdea) {
        this.relationTotalIdea = relationTotalIdea
        return this
    }


    /**
     * 设置「实际工时」值
     * @param val
     */
    IdeaBiSearchGroupDTO setActualWorkload(BigDecimal actualWorkload) {
        this.actualWorkload = actualWorkload
        return this
    }


    /**
     * 设置「关联工单数」值
     * @param val
     */
    IdeaBiSearchGroupDTO setRelationTotalTicket(BigDecimal relationTotalTicket) {
        this.relationTotalTicket = relationTotalTicket
        return this
    }


    /**
     * 设置「关联客户数」值
     * @param val
     */
    IdeaBiSearchGroupDTO setRelationTotalCustomer(BigDecimal relationTotalCustomer) {
        this.relationTotalCustomer = relationTotalCustomer
        return this
    }


    /**
     * 设置「关联测试用例数」值
     * @param val
     */
    IdeaBiSearchGroupDTO setRelationTotalTestCase(BigDecimal relationTotalTestCase) {
        this.relationTotalTestCase = relationTotalTestCase
        return this
    }


    /**
     * 设置「预估工时」值
     * @param val
     */
    IdeaBiSearchGroupDTO setEstimatedWorkload(BigDecimal estimatedWorkload) {
        this.estimatedWorkload = estimatedWorkload
        return this
    }


    /**
     * 设置「工时进度」值
     * @param val
     */
    IdeaBiSearchGroupDTO setWorkloadSchedule(BigDecimal workloadSchedule) {
        this.workloadSchedule = workloadSchedule
        return this
    }


    /**
     * 设置「进度」值
     * @param val
     */
    IdeaBiSearchGroupDTO setProgress(BigDecimal progress) {
        this.progress = progress
        return this
    }


    /**
     * 设置「关联工作项数」值
     * @param val
     */
    IdeaBiSearchGroupDTO setRelationTotalWorkItem(BigDecimal relationTotalWorkItem) {
        this.relationTotalWorkItem = relationTotalWorkItem
        return this
    }


    /**
     * 设置「所属产品」值
     * @param val
     */
    IdeaBiSearchGroupDTO setProductName(String productName) {
        this.productName = productName
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    IdeaBiSearchGroupDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IdeaBiSearchGroupDTO setCategoryName(String categoryName) {
        this.categoryName = categoryName
        return this
    }


    /**
     * 设置「产品」值
     * @param val
     */
    IdeaBiSearchGroupDTO setProductId(String productId) {
        this.productId = productId
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    IdeaBiSearchGroupDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「类别标识」值
     * @param val
     */
    IdeaBiSearchGroupDTO setCategoryId(String categoryId) {
        this.categoryId = categoryId
        return this
    }


    /**
     * 设置「需求来源」值
     * 字典[需求来源]
     * @param val
     */
    IdeaBiSearchGroupDTO setIdeaFrom(String ideaFrom) {
        this.ideaFrom = ideaFrom
        return this
    }


    /**
     * 设置「状态」值
     * 字典[需求状态]
     * @param val
     */
    IdeaBiSearchGroupDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[需求优先级]
     * @param val
     */
    IdeaBiSearchGroupDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「需求类型」值
     * 字典[需求类型]
     * @param val
     */
    IdeaBiSearchGroupDTO setIdeaType(String ideaType) {
        this.ideaType = ideaType
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IdeaBiSearchGroupDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「子产品名称」值
     * @param val
     */
    IdeaBiSearchGroupDTO setSectionName(String sectionName) {
        this.sectionName = sectionName
        return this
    }


    /**
     * 设置「子产品标识」值
     * 字典[需求子产品2]
     * @param val
     */
    IdeaBiSearchGroupDTO setSectionId(String sectionId) {
        this.sectionId = sectionId
        return this
    }


    /**
     * 设置「产品是否删除」值
     * 字典[是否]
     * @param val
     */
    IdeaBiSearchGroupDTO setProductIsDeleted(Integer productIsDeleted) {
        this.productIsDeleted = productIsDeleted
        return this
    }

}
