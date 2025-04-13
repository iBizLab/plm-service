package cn.ibizlab.plm.wiki.sharedspace.dto

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
class SharedSpaceDTO extends GroovyDTO<SharedSpaceDTO> {

    /**
     * 「是否开启共享」
     * 字典[空间共享状态]
     */
    @JsonProperty("is_shared")
    String isShared
    /**
     * 「共享页面标识」
     * 字典[共享页面]
     */
    @JsonProperty("shared_pages")
    String sharedPages
    /**
     * 「共享有效期」
     */
    @JsonProperty("expiration_date")
    Timestamp expirationDate
    /**
     * 「访问密码」
     */
    @JsonProperty("access_password")
    String accessPassword
    /**
     * 「共享展示标题」
     */
    @JsonProperty("show_title")
    String showTitle
    /**
     * 「共享展示图标」
     */
    @JsonProperty("show_logo")
    String showLogo
    /**
     * 「所属」
     * 字典[所属类型（包含个人）]
     */
    @JsonProperty("scope_type")
    String scopeType
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
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「空间名称」
     */
    @JsonProperty("name")
    String name

    /**
     * 设置「是否开启共享」值
     * 字典[空间共享状态]
     * @param val
     */
    SharedSpaceDTO setIsShared(String isShared) {
        this.isShared = isShared
        return this
    }


    /**
     * 设置「共享页面标识」值
     * 字典[共享页面]
     * @param val
     */
    SharedSpaceDTO setSharedPages(String sharedPages) {
        this.sharedPages = sharedPages
        return this
    }


    /**
     * 设置「共享有效期」值
     * @param val
     */
    SharedSpaceDTO setExpirationDate(Timestamp expirationDate) {
        this.expirationDate = expirationDate
        return this
    }


    /**
     * 设置「访问密码」值
     * @param val
     */
    SharedSpaceDTO setAccessPassword(String accessPassword) {
        this.accessPassword = accessPassword
        return this
    }


    /**
     * 设置「共享展示标题」值
     * @param val
     */
    SharedSpaceDTO setShowTitle(String showTitle) {
        this.showTitle = showTitle
        return this
    }


    /**
     * 设置「共享展示图标」值
     * @param val
     */
    SharedSpaceDTO setShowLogo(String showLogo) {
        this.showLogo = showLogo
        return this
    }


    /**
     * 设置「所属」值
     * 字典[所属类型（包含个人）]
     * @param val
     */
    SharedSpaceDTO setScopeType(String scopeType) {
        this.scopeType = scopeType
        return this
    }


    /**
     * 设置「共享人」值
     * @param val
     */
    SharedSpaceDTO setSharedBy(String sharedBy) {
        this.sharedBy = sharedBy
        return this
    }


    /**
     * 设置「共享时间」值
     * @param val
     */
    SharedSpaceDTO setSharedTime(Timestamp sharedTime) {
        this.sharedTime = sharedTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    SharedSpaceDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「空间名称」值
     * @param val
     */
    SharedSpaceDTO setName(String name) {
        this.name = name
        return this
    }

}
