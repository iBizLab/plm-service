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
class IdeaAiInfoDTO extends GroovyDTO<IdeaAiInfoDTO> {

    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
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
     * 「内容格式」
     * 字典[报表输出格式]
     */
    @JsonProperty("format_type")
    String formatType
    /**
     * 「计划时间」
     */
    @JsonProperty("plan_at")
    String planAt
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「类别路径」
     */
    @JsonProperty("categories")
    String categories
    /**
     * 「需求类型」
     * 字典[需求类型]
     */
    @JsonProperty("idea_type")
    String ideaType
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
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime

    /**
     * 设置「标题」值
     * @param val
     */
    IdeaAiInfoDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「状态」值
     * 字典[需求状态]
     * @param val
     */
    IdeaAiInfoDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[需求优先级]
     * @param val
     */
    IdeaAiInfoDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「内容格式」值
     * 字典[报表输出格式]
     * @param val
     */
    IdeaAiInfoDTO setFormatType(String formatType) {
        this.formatType = formatType
        return this
    }


    /**
     * 设置「计划时间」值
     * @param val
     */
    IdeaAiInfoDTO setPlanAt(String planAt) {
        this.planAt = planAt
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    IdeaAiInfoDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    IdeaAiInfoDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「类别路径」值
     * @param val
     */
    IdeaAiInfoDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「需求类型」值
     * 字典[需求类型]
     * @param val
     */
    IdeaAiInfoDTO setIdeaType(String ideaType) {
        this.ideaType = ideaType
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    IdeaAiInfoDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IdeaAiInfoDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「产品」值
     * @param val
     */
    IdeaAiInfoDTO setProductId(String productId) {
        this.productId = productId
        return this
    }


    /**
     * 设置「所属产品」值
     * @param val
     */
    IdeaAiInfoDTO setProductName(String productName) {
        this.productName = productName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IdeaAiInfoDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
