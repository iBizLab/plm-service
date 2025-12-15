package cn.ibizlab.plm.wiki.articlepage.dto

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
class ArticlePageAiInfoDTO extends GroovyDTO<ArticlePageAiInfoDTO> {

    /**
     * 「正文」
     */
    @JsonProperty("content")
    String content
    /**
     * 「类型」
     * 字典[页面类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「类别路径」
     */
    @JsonProperty("categories")
    String categories
    /**
     * 「发布人」
     */
    @JsonProperty("publish_man")
    String publishMan
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
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
     * 「主题」
     */
    @JsonProperty("name")
    String name
    /**
     * 「空间名称」
     */
    @JsonProperty("space_name")
    String spaceName
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime

    /**
     * 设置「正文」值
     * @param val
     */
    ArticlePageAiInfoDTO setContent(String content) {
        this.content = content
        return this
    }


    /**
     * 设置「类型」值
     * 字典[页面类型]
     * @param val
     */
    ArticlePageAiInfoDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「类别路径」值
     * @param val
     */
    ArticlePageAiInfoDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「发布人」值
     * @param val
     */
    ArticlePageAiInfoDTO setPublishMan(String publishMan) {
        this.publishMan = publishMan
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    ArticlePageAiInfoDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ArticlePageAiInfoDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ArticlePageAiInfoDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「主题」值
     * @param val
     */
    ArticlePageAiInfoDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「空间名称」值
     * @param val
     */
    ArticlePageAiInfoDTO setSpaceName(String spaceName) {
        this.spaceName = spaceName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ArticlePageAiInfoDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
