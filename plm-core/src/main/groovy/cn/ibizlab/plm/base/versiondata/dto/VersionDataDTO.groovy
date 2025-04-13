package cn.ibizlab.plm.base.versiondata.dto

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
class VersionDataDTO extends GroovyDTO<VersionDataDTO> {

    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「所属数据标识」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「所属父数据标识」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「所属父数据对象」
     */
    @JsonProperty("parent_type")
    String parentType
    /**
     * 「父对象版本标识」
     */
    @JsonProperty("parent_version_id")
    String parentVersionId
    /**
     * 「数据」
     */
    @JsonProperty("data")
    String data
    /**
     * 「过滤属性」
     */
    @JsonProperty("filter")
    String filter
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
    VersionDataDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「所属数据标识」值
     * @param val
     */
    VersionDataDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「所属父数据标识」值
     * @param val
     */
    VersionDataDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    VersionDataDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所属父数据对象」值
     * @param val
     */
    VersionDataDTO setParentType(String parentType) {
        this.parentType = parentType
        return this
    }


    /**
     * 设置「父对象版本标识」值
     * @param val
     */
    VersionDataDTO setParentVersionId(String parentVersionId) {
        this.parentVersionId = parentVersionId
        return this
    }


    /**
     * 设置「数据」值
     * @param val
     */
    VersionDataDTO setData(String data) {
        this.data = data
        return this
    }


    /**
     * 设置「过滤属性」值
     * @param val
     */
    VersionDataDTO setFilter(String filter) {
        this.filter = filter
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    VersionDataDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    VersionDataDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    VersionDataDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    VersionDataDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    VersionDataDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    VersionDataDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
