package cn.ibizlab.plm.ftr.searchhub.dto

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
class SearchHubDTO extends GroovyDTO<SearchHubDTO> {

    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「类型」
     */
    @JsonProperty("type")
    String type
    /**
     * 「所属」
     */
    @JsonProperty("belong_to")
    String belongTo
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「标签」
     */
    @JsonProperty("tags")
    String tags
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「名称」
     */
    @JsonProperty("title")
    String title

    /**
     * 设置「编号」值
     * @param val
     */
    SearchHubDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「类型」值
     * @param val
     */
    SearchHubDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「所属」值
     * @param val
     */
    SearchHubDTO setBelongTo(String belongTo) {
        this.belongTo = belongTo
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    SearchHubDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    SearchHubDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    SearchHubDTO setTags(String tags) {
        this.tags = tags
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    SearchHubDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    SearchHubDTO setTitle(String title) {
        this.title = title
        return this
    }

}
