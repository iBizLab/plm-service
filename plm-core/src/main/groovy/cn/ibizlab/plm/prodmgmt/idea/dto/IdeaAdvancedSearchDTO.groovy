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
class IdeaAdvancedSearchDTO extends GroovyDTO<IdeaAdvancedSearchDTO> {

    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「产品」
     */
    @JsonProperty("product_id")
    String productId
    /**
     * 「所属产品」
     */
    @JsonProperty("product_name")
    String productName
    /**
     * 「状态」
     * 字典[需求状态]
     */
    @JsonProperty("state")
    String state

    /**
     * 设置「标题」值
     * @param val
     */
    IdeaAdvancedSearchDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IdeaAdvancedSearchDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    IdeaAdvancedSearchDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    IdeaAdvancedSearchDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「产品」值
     * @param val
     */
    IdeaAdvancedSearchDTO setProductId(String productId) {
        this.productId = productId
        return this
    }


    /**
     * 设置「所属产品」值
     * @param val
     */
    IdeaAdvancedSearchDTO setProductName(String productName) {
        this.productName = productName
        return this
    }


    /**
     * 设置「状态」值
     * 字典[需求状态]
     * @param val
     */
    IdeaAdvancedSearchDTO setState(String state) {
        this.state = state
        return this
    }

}
