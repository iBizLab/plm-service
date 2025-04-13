package cn.ibizlab.plm.prodmgmt.productplan.dto

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
class ProductPlanDTO extends GroovyDTO<ProductPlanDTO> {

    /**
     * 「类别」
     * 字典[类别]
     */
    @JsonProperty("type")
    String type
    /**
     * 「计划开始」
     */
    @JsonProperty("start_at")
    Timestamp startAt
    /**
     * 「计划结束」
     */
    @JsonProperty("end_at")
    Timestamp endAt
    /**
     * 「是否叶子节点」
     * 字典[是否]
     */
    @JsonProperty("is_leaf")
    Integer isLeaf
    /**
     * 「类别」
     * 字典[类别]
     */
    @JsonProperty("categories")
    String categories
    /**
     * 「类别」
     */
    @JsonProperty("categories_name")
    String categoriesName
    /**
     * 「是否已删除」
     * 字典[是否]
     */
    @JsonProperty("is_deleted")
    Integer isDeleted
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
     * 「序号」
     */
    @JsonProperty("sequence")
    BigDecimal sequence
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
     * 「计划名称」
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
     * 设置「类别」值
     * 字典[类别]
     * @param val
     */
    ProductPlanDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「计划开始」值
     * @param val
     */
    ProductPlanDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「计划结束」值
     * @param val
     */
    ProductPlanDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「是否叶子节点」值
     * 字典[是否]
     * @param val
     */
    ProductPlanDTO setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf
        return this
    }


    /**
     * 设置「类别」值
     * 字典[类别]
     * @param val
     */
    ProductPlanDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    ProductPlanDTO setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    ProductPlanDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    ProductPlanDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「负责人标识」值
     * @param val
     */
    ProductPlanDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「序号」值
     * @param val
     */
    ProductPlanDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProductPlanDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ProductPlanDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ProductPlanDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「计划名称」值
     * @param val
     */
    ProductPlanDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「产品标识」值
     * @param val
     */
    ProductPlanDTO setProductId(String productId) {
        this.productId = productId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProductPlanDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ProductPlanDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
