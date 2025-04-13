package cn.ibizlab.plm.prodmgmt.productmember.dto

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
class ProductMemberDTO extends GroovyDTO<ProductMemberDTO> {

    /**
     * 「登录名」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「角色」
     * 字典[产品角色类型]
     */
    @JsonProperty("role_id")
    String roleId
    /**
     * 「产品名称」
     */
    @JsonProperty("product_name")
    String productName
    /**
     * 「产品编号」
     */
    @JsonProperty("product_identifier")
    String productIdentifier
    /**
     * 「职位」
     * 字典[职位（动态）]
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
     * 「姓名」
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
     * 设置「登录名」值
     * @param val
     */
    ProductMemberDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「角色」值
     * 字典[产品角色类型]
     * @param val
     */
    ProductMemberDTO setRoleId(String roleId) {
        this.roleId = roleId
        return this
    }


    /**
     * 设置「产品名称」值
     * @param val
     */
    ProductMemberDTO setProductName(String productName) {
        this.productName = productName
        return this
    }


    /**
     * 设置「产品编号」值
     * @param val
     */
    ProductMemberDTO setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier
        return this
    }


    /**
     * 设置「职位」值
     * 字典[职位（动态）]
     * @param val
     */
    ProductMemberDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProductMemberDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ProductMemberDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ProductMemberDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「姓名」值
     * @param val
     */
    ProductMemberDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「产品标识」值
     * @param val
     */
    ProductMemberDTO setProductId(String productId) {
        this.productId = productId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProductMemberDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ProductMemberDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
