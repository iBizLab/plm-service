package cn.ibizlab.plm.base.searchattachment.dto

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
import cn.ibizlab.plm.wiki.articlepage.dto.ArticlePageDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class SearchAttachmentDTO extends GroovyDTO<SearchAttachmentDTO> {

    /**
     * 「所属数据标识」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「所属对象子类型」
     */
    @JsonProperty("owner_subtype")
    String ownerSubtype
    /**
     * 「文件标识」
     */
    @JsonProperty("file_id")
    String fileId
    /**
     * 「所属数据标题」
     */
    @JsonProperty("owner_title")
    String ownerTitle
    /**
     * 「父对象版本标识」
     */
    @JsonProperty("parent_version_id")
    String parentVersionId
    /**
     * 「所属数据编号」
     */
    @JsonProperty("owner_identifier")
    String ownerIdentifier
    /**
     * 「所属数据父标识」
     */
    @JsonProperty("owner_parent_id")
    String ownerParentId
    /**
     * 「所属数据父名称」
     */
    @JsonProperty("owner_parent_name")
    String ownerParentName
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
     * 「页面」
     */
    @JsonProperty("page")
    ArticlePageDTO page
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
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
     * 「文件名称」
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
     * 设置「所属数据标识」值
     * @param val
     */
    SearchAttachmentDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    SearchAttachmentDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所属对象子类型」值
     * @param val
     */
    SearchAttachmentDTO setOwnerSubtype(String ownerSubtype) {
        this.ownerSubtype = ownerSubtype
        return this
    }


    /**
     * 设置「文件标识」值
     * @param val
     */
    SearchAttachmentDTO setFileId(String fileId) {
        this.fileId = fileId
        return this
    }


    /**
     * 设置「所属数据标题」值
     * @param val
     */
    SearchAttachmentDTO setOwnerTitle(String ownerTitle) {
        this.ownerTitle = ownerTitle
        return this
    }


    /**
     * 设置「父对象版本标识」值
     * @param val
     */
    SearchAttachmentDTO setParentVersionId(String parentVersionId) {
        this.parentVersionId = parentVersionId
        return this
    }


    /**
     * 设置「所属数据编号」值
     * @param val
     */
    SearchAttachmentDTO setOwnerIdentifier(String ownerIdentifier) {
        this.ownerIdentifier = ownerIdentifier
        return this
    }


    /**
     * 设置「所属数据父标识」值
     * @param val
     */
    SearchAttachmentDTO setOwnerParentId(String ownerParentId) {
        this.ownerParentId = ownerParentId
        return this
    }


    /**
     * 设置「所属数据父名称」值
     * @param val
     */
    SearchAttachmentDTO setOwnerParentName(String ownerParentName) {
        this.ownerParentName = ownerParentName
        return this
    }


    /**
     * 设置「工作项」值
     * @param val
     */
    SearchAttachmentDTO setWorkItem(WorkItemDTO workItem) {
        this.workItem = workItem
        return this
    }


    /**
     * 设置「产品需求」值
     * @param val
     */
    SearchAttachmentDTO setIdea(IdeaDTO idea) {
        this.idea = idea
        return this
    }


    /**
     * 设置「工单」值
     * @param val
     */
    SearchAttachmentDTO setTicket(TicketDTO ticket) {
        this.ticket = ticket
        return this
    }


    /**
     * 设置「客户」值
     * @param val
     */
    SearchAttachmentDTO setCustomer(CustomerDTO customer) {
        this.customer = customer
        return this
    }


    /**
     * 设置「测试用例」值
     * @param val
     */
    SearchAttachmentDTO setTestCase(TestCaseDTO testCase) {
        this.testCase = testCase
        return this
    }


    /**
     * 设置「页面」值
     * @param val
     */
    SearchAttachmentDTO setPage(ArticlePageDTO page) {
        this.page = page
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    SearchAttachmentDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    SearchAttachmentDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    SearchAttachmentDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    SearchAttachmentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「文件名称」值
     * @param val
     */
    SearchAttachmentDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    SearchAttachmentDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    SearchAttachmentDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
