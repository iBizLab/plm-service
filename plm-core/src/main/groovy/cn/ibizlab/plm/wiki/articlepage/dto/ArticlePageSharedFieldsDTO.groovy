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
class ArticlePageSharedFieldsDTO extends GroovyDTO<ArticlePageSharedFieldsDTO> {

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
     * 「是否开启共享」
     * 字典[是否]
     */
    @JsonProperty("is_shared")
    String isShared
    /**
     * 「是否同时共享子页面」
     * 字典[是否]
     */
    @JsonProperty("is_shared_subset")
    String isSharedSubset
    /**
     * 「共享有效期」
     */
    @JsonProperty("expiration_date")
    Timestamp expirationDate
    /**
     * 「发布主题」
     */
    @JsonProperty("publish_name")
    String publishName
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「共享人」
     */
    @JsonProperty("shared_by")
    String sharedBy
    /**
     * 「共享时间」
     */
    @JsonProperty("shared_time")
    Timestamp sharedTime
    /**
     * 「空间标识」
     */
    @JsonProperty("space_id")
    String spaceId

    /**
     * 设置「标识」值
     * @param val
     */
    ArticlePageSharedFieldsDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「主题」值
     * @param val
     */
    ArticlePageSharedFieldsDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「是否开启共享」值
     * 字典[是否]
     * @param val
     */
    ArticlePageSharedFieldsDTO setIsShared(String isShared) {
        this.isShared = isShared
        return this
    }


    /**
     * 设置「是否同时共享子页面」值
     * 字典[是否]
     * @param val
     */
    ArticlePageSharedFieldsDTO setIsSharedSubset(String isSharedSubset) {
        this.isSharedSubset = isSharedSubset
        return this
    }


    /**
     * 设置「共享有效期」值
     * @param val
     */
    ArticlePageSharedFieldsDTO setExpirationDate(Timestamp expirationDate) {
        this.expirationDate = expirationDate
        return this
    }


    /**
     * 设置「发布主题」值
     * @param val
     */
    ArticlePageSharedFieldsDTO setPublishName(String publishName) {
        this.publishName = publishName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ArticlePageSharedFieldsDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ArticlePageSharedFieldsDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「共享人」值
     * @param val
     */
    ArticlePageSharedFieldsDTO setSharedBy(String sharedBy) {
        this.sharedBy = sharedBy
        return this
    }


    /**
     * 设置「共享时间」值
     * @param val
     */
    ArticlePageSharedFieldsDTO setSharedTime(Timestamp sharedTime) {
        this.sharedTime = sharedTime
        return this
    }


    /**
     * 设置「空间标识」值
     * @param val
     */
    ArticlePageSharedFieldsDTO setSpaceId(String spaceId) {
        this.spaceId = spaceId
        return this
    }

}
