package cn.ibizlab.plm.prodmgmt.customer.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.attention.dto.AttentionDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class CustomerDTO extends GroovyDTO<CustomerDTO> {

    /**
     * 「规模」
     */
    @JsonProperty("scale")
    Integer scale
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
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
     * 「品牌标识」
     */
    @JsonProperty("logo")
    String logo
    /**
     * 「等级」
     * 字典[客户等级]
     */
    @JsonProperty("grade_id")
    String gradeId
    /**
     * 「行业」
     * 字典[客户行业]
     */
    @JsonProperty("industry_id")
    String industryId
    /**
     * 「类别」
     */
    @JsonProperty("categories")
    String categories
    /**
     * 「类别」
     */
    @JsonProperty("categories_name")
    String categoriesName
    /**
     * 「产品名称」
     */
    @JsonProperty("product_name")
    String productName
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「负责人标识」
     */
    @JsonProperty("assignee_id")
    String assigneeId
    /**
     * 「关注」
     */
    @JsonProperty("attentions")
    List<AttentionDTO> attentions
    /**
     * 「产品是否归档」
     * 字典[是否]
     */
    @JsonProperty("product_is_archived")
    Integer productIsArchived
    /**
     * 「工单总数」
     */
    @JsonProperty("ticket_total")
    Integer ticketTotal
    /**
     * 「已完成工单数」
     */
    @JsonProperty("ticket_finish")
    Integer ticketFinish
    /**
     * 「关注人」
     */
    @JsonProperty("attentions_imp")
    String attentionsImp
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
     * 「客户名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「产品标识」
     */
    @JsonProperty("product_id")
    String productId
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
     * 设置「规模」值
     * @param val
     */
    CustomerDTO setScale(Integer scale) {
        this.scale = scale
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    CustomerDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    CustomerDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    CustomerDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「品牌标识」值
     * @param val
     */
    CustomerDTO setLogo(String logo) {
        this.logo = logo
        return this
    }


    /**
     * 设置「等级」值
     * 字典[客户等级]
     * @param val
     */
    CustomerDTO setGradeId(String gradeId) {
        this.gradeId = gradeId
        return this
    }


    /**
     * 设置「行业」值
     * 字典[客户行业]
     * @param val
     */
    CustomerDTO setIndustryId(String industryId) {
        this.industryId = industryId
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    CustomerDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    CustomerDTO setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName
        return this
    }


    /**
     * 设置「产品名称」值
     * @param val
     */
    CustomerDTO setProductName(String productName) {
        this.productName = productName
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    CustomerDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「负责人标识」值
     * @param val
     */
    CustomerDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「关注」值
     * @param val
     */
    CustomerDTO setAttentions(List<AttentionDTO> attentions) {
        this.attentions = attentions
        return this
    }


    /**
     * 设置「产品是否归档」值
     * 字典[是否]
     * @param val
     */
    CustomerDTO setProductIsArchived(Integer productIsArchived) {
        this.productIsArchived = productIsArchived
        return this
    }


    /**
     * 设置「工单总数」值
     * @param val
     */
    CustomerDTO setTicketTotal(Integer ticketTotal) {
        this.ticketTotal = ticketTotal
        return this
    }


    /**
     * 设置「已完成工单数」值
     * @param val
     */
    CustomerDTO setTicketFinish(Integer ticketFinish) {
        this.ticketFinish = ticketFinish
        return this
    }


    /**
     * 设置「关注人」值
     * @param val
     */
    CustomerDTO setAttentionsImp(String attentionsImp) {
        this.attentionsImp = attentionsImp
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CustomerDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    CustomerDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CustomerDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「客户名称」值
     * @param val
     */
    CustomerDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「产品标识」值
     * @param val
     */
    CustomerDTO setProductId(String productId) {
        this.productId = productId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CustomerDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CustomerDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
