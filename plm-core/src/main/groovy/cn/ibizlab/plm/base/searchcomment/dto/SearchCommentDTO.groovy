package cn.ibizlab.plm.base.searchcomment.dto

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
import cn.ibizlab.plm.testmgmt.run.dto.RunDTO
import cn.ibizlab.plm.wiki.articlepage.dto.ArticlePageDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class SearchCommentDTO extends GroovyDTO<SearchCommentDTO> {

    /**
     * 「评论主体标识」
     */
    @JsonProperty("principal_id")
    String principalId
    /**
     * 「评论主体名称」
     */
    @JsonProperty("principal_name")
    String principalName
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「评论主体类型」
     * 字典[评论主体类型]
     */
    @JsonProperty("principal_type")
    String principalType
    /**
     * 「内容」
     */
    @JsonProperty("content")
    String content
    /**
     * 「评论主体标题」
     */
    @JsonProperty("principal_title")
    String principalTitle
    /**
     * 「评论主体编号」
     */
    @JsonProperty("principal_identifier")
    String principalIdentifier
    /**
     * 「评论主体父标识」
     */
    @JsonProperty("principal_parent_id")
    String principalParentId
    /**
     * 「评论主体父名称」
     */
    @JsonProperty("principal_parent_name")
    String principalParentName
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
     * 「执行用例」
     */
    @JsonProperty("run")
    RunDTO run
    /**
     * 「页面」
     */
    @JsonProperty("page")
    ArticlePageDTO page
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
     * 设置「评论主体标识」值
     * @param val
     */
    SearchCommentDTO setPrincipalId(String principalId) {
        this.principalId = principalId
        return this
    }


    /**
     * 设置「评论主体名称」值
     * @param val
     */
    SearchCommentDTO setPrincipalName(String principalName) {
        this.principalName = principalName
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    SearchCommentDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「评论主体类型」值
     * 字典[评论主体类型]
     * @param val
     */
    SearchCommentDTO setPrincipalType(String principalType) {
        this.principalType = principalType
        return this
    }


    /**
     * 设置「内容」值
     * @param val
     */
    SearchCommentDTO setContent(String content) {
        this.content = content
        return this
    }


    /**
     * 设置「评论主体标题」值
     * @param val
     */
    SearchCommentDTO setPrincipalTitle(String principalTitle) {
        this.principalTitle = principalTitle
        return this
    }


    /**
     * 设置「评论主体编号」值
     * @param val
     */
    SearchCommentDTO setPrincipalIdentifier(String principalIdentifier) {
        this.principalIdentifier = principalIdentifier
        return this
    }


    /**
     * 设置「评论主体父标识」值
     * @param val
     */
    SearchCommentDTO setPrincipalParentId(String principalParentId) {
        this.principalParentId = principalParentId
        return this
    }


    /**
     * 设置「评论主体父名称」值
     * @param val
     */
    SearchCommentDTO setPrincipalParentName(String principalParentName) {
        this.principalParentName = principalParentName
        return this
    }


    /**
     * 设置「工作项」值
     * @param val
     */
    SearchCommentDTO setWorkItem(WorkItemDTO workItem) {
        this.workItem = workItem
        return this
    }


    /**
     * 设置「产品需求」值
     * @param val
     */
    SearchCommentDTO setIdea(IdeaDTO idea) {
        this.idea = idea
        return this
    }


    /**
     * 设置「工单」值
     * @param val
     */
    SearchCommentDTO setTicket(TicketDTO ticket) {
        this.ticket = ticket
        return this
    }


    /**
     * 设置「客户」值
     * @param val
     */
    SearchCommentDTO setCustomer(CustomerDTO customer) {
        this.customer = customer
        return this
    }


    /**
     * 设置「测试用例」值
     * @param val
     */
    SearchCommentDTO setTestCase(TestCaseDTO testCase) {
        this.testCase = testCase
        return this
    }


    /**
     * 设置「执行用例」值
     * @param val
     */
    SearchCommentDTO setRun(RunDTO run) {
        this.run = run
        return this
    }


    /**
     * 设置「页面」值
     * @param val
     */
    SearchCommentDTO setPage(ArticlePageDTO page) {
        this.page = page
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    SearchCommentDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    SearchCommentDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    SearchCommentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    SearchCommentDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    SearchCommentDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    SearchCommentDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
