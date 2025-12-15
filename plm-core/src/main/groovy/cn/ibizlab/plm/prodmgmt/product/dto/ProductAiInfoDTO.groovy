package cn.ibizlab.plm.prodmgmt.product.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.prodmgmt.productmember.dto.ProductMemberDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ProductAiInfoDTO extends GroovyDTO<ProductAiInfoDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「产品名称」
     */
    @JsonProperty("name")
    String name
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
     * 「产品标识」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「产品成员」
     */
    @JsonProperty("members")
    List<ProductMemberDTO> members

    /**
     * 设置「标识」值
     * @param val
     */
    ProductAiInfoDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「产品名称」值
     * @param val
     */
    ProductAiInfoDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ProductAiInfoDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ProductAiInfoDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「产品标识」值
     * @param val
     */
    ProductAiInfoDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ProductAiInfoDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「产品成员」值
     * @param val
     */
    ProductAiInfoDTO setMembers(List<ProductMemberDTO> members) {
        this.members = members
        return this
    }

}
