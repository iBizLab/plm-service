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
class ArticlePageNameDTO extends GroovyDTO<ArticlePageNameDTO> {

    /**
     * 「发布主题」
     */
    @JsonProperty("publish_name")
    String publishName
    /**
     * 「主题」
     */
    @JsonProperty("name")
    String name
    /**
     * 「空间标识」
     */
    @JsonProperty("space_id")
    String spaceId
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「父页面标识」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「图标」
     */
    @JsonProperty("icon")
    String icon

    /**
     * 设置「发布主题」值
     * @param val
     */
    ArticlePageNameDTO setPublishName(String publishName) {
        this.publishName = publishName
        return this
    }


    /**
     * 设置「主题」值
     * @param val
     */
    ArticlePageNameDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「空间标识」值
     * @param val
     */
    ArticlePageNameDTO setSpaceId(String spaceId) {
        this.spaceId = spaceId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ArticlePageNameDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「父页面标识」值
     * @param val
     */
    ArticlePageNameDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    ArticlePageNameDTO setIcon(String icon) {
        this.icon = icon
        return this
    }

}
