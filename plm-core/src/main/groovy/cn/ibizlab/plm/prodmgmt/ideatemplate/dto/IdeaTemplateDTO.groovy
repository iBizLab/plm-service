package cn.ibizlab.plm.prodmgmt.ideatemplate.dto

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
class IdeaTemplateDTO extends GroovyDTO<IdeaTemplateDTO> {

    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「全局模板」
     * 字典[是否]
     */
    @JsonProperty("is_global")
    Integer isGlobal
    /**
     * 「产品标识」
     */
    @JsonProperty("product_identifier")
    String productIdentifier
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「子产品名称」
     */
    @JsonProperty("section_name")
    String sectionName
    /**
     * 「子产品标识」
     */
    @JsonProperty("section_id")
    String sectionId
    /**
     * 「类别路径」
     */
    @JsonProperty("categories")
    String categories
    /**
     * 「类别标识」
     */
    @JsonProperty("category_id")
    String categoryId
    /**
     * 「名称」
     */
    @JsonProperty("category_name")
    String categoryName
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
     * 「产品」
     */
    @JsonProperty("product_id")
    String productId
    /**
     * 「产品名称」
     */
    @JsonProperty("product_name")
    String productName
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
     * 设置「标题」值
     * @param val
     */
    IdeaTemplateDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「全局模板」值
     * 字典[是否]
     * @param val
     */
    IdeaTemplateDTO setIsGlobal(Integer isGlobal) {
        this.isGlobal = isGlobal
        return this
    }


    /**
     * 设置「产品标识」值
     * @param val
     */
    IdeaTemplateDTO setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    IdeaTemplateDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「子产品名称」值
     * @param val
     */
    IdeaTemplateDTO setSectionName(String sectionName) {
        this.sectionName = sectionName
        return this
    }


    /**
     * 设置「子产品标识」值
     * @param val
     */
    IdeaTemplateDTO setSectionId(String sectionId) {
        this.sectionId = sectionId
        return this
    }


    /**
     * 设置「类别路径」值
     * @param val
     */
    IdeaTemplateDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「类别标识」值
     * @param val
     */
    IdeaTemplateDTO setCategoryId(String categoryId) {
        this.categoryId = categoryId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IdeaTemplateDTO setCategoryName(String categoryName) {
        this.categoryName = categoryName
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    IdeaTemplateDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    IdeaTemplateDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IdeaTemplateDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IdeaTemplateDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「产品」值
     * @param val
     */
    IdeaTemplateDTO setProductId(String productId) {
        this.productId = productId
        return this
    }


    /**
     * 设置「产品名称」值
     * @param val
     */
    IdeaTemplateDTO setProductName(String productName) {
        this.productName = productName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    IdeaTemplateDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IdeaTemplateDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
