package cn.ibizlab.plm.prodmgmt.producttickettype.dto

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
class ProductTicketTypeDTO extends GroovyDTO<ProductTicketTypeDTO> {

    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
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
     * 「产品标识」
     */
    @JsonProperty("product_id")
    String productId
    /**
     * 「工单类型标识」
     */
    @JsonProperty("ticket_type_id")
    String ticketTypeId
    /**
     * 「名称」
     */
    @JsonProperty("ticket_type_name")
    String ticketTypeName
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
     * 设置「描述」值
     * @param val
     */
    ProductTicketTypeDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProductTicketTypeDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ProductTicketTypeDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ProductTicketTypeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ProductTicketTypeDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「产品标识」值
     * @param val
     */
    ProductTicketTypeDTO setProductId(String productId) {
        this.productId = productId
        return this
    }


    /**
     * 设置「工单类型标识」值
     * @param val
     */
    ProductTicketTypeDTO setTicketTypeId(String ticketTypeId) {
        this.ticketTypeId = ticketTypeId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ProductTicketTypeDTO setTicketTypeName(String ticketTypeName) {
        this.ticketTypeName = ticketTypeName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProductTicketTypeDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ProductTicketTypeDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
