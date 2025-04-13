package cn.ibizlab.plm.ibizsysmgr.sysorganization.dto

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
class SysOrganizationDTO extends GroovyDTO<SysOrganizationDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「名称」
     */
    @JsonProperty("organization_name")
    String organizationName
    /**
     * 「创建人」
     */
    @JsonProperty("creator")
    String creator
    /**
     * 「创建时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「最后更新人」
     */
    @JsonProperty("updater")
    String updater
    /**
     * 「最后更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「DC」
     */
    @JsonProperty("dc")
    String dc
    /**
     * 「上级名称」
     */
    @JsonProperty("parent_name")
    String parentName
    /**
     * 「机构编号」
     */
    @JsonProperty("organization_number")
    String organizationNumber
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「简称」
     */
    @JsonProperty("short_name")
    String shortName
    /**
     * 「排序」
     */
    @JsonProperty("sort")
    BigInteger sort
    /**
     * 「父标识」
     */
    @JsonProperty("parent_id")
    String parentId

    /**
     * 设置「标识」值
     * @param val
     */
    SysOrganizationDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    SysOrganizationDTO setOrganizationName(String organizationName) {
        this.organizationName = organizationName
        return this
    }


    /**
     * 设置「创建人」值
     * @param val
     */
    SysOrganizationDTO setCreator(String creator) {
        this.creator = creator
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    SysOrganizationDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「最后更新人」值
     * @param val
     */
    SysOrganizationDTO setUpdater(String updater) {
        this.updater = updater
        return this
    }


    /**
     * 设置「最后更新时间」值
     * @param val
     */
    SysOrganizationDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「DC」值
     * @param val
     */
    SysOrganizationDTO setDc(String dc) {
        this.dc = dc
        return this
    }


    /**
     * 设置「上级名称」值
     * @param val
     */
    SysOrganizationDTO setParentName(String parentName) {
        this.parentName = parentName
        return this
    }


    /**
     * 设置「机构编号」值
     * @param val
     */
    SysOrganizationDTO setOrganizationNumber(String organizationNumber) {
        this.organizationNumber = organizationNumber
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    SysOrganizationDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「简称」值
     * @param val
     */
    SysOrganizationDTO setShortName(String shortName) {
        this.shortName = shortName
        return this
    }


    /**
     * 设置「排序」值
     * @param val
     */
    SysOrganizationDTO setSort(BigInteger sort) {
        this.sort = sort
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    SysOrganizationDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }

}
