package cn.ibizlab.plm.base.organization.dto

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
class OrganizationDTO extends GroovyDTO<OrganizationDTO> {

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
     * 「父标识」
     */
    @JsonProperty("pid")
    String pid
    /**
     * 「名称」
     */
    @JsonProperty("pname")
    String pname
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
     * 设置「机构编号」值
     * @param val
     */
    OrganizationDTO setOrganizationNumber(String organizationNumber) {
        this.organizationNumber = organizationNumber
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    OrganizationDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「简称」值
     * @param val
     */
    OrganizationDTO setShortName(String shortName) {
        this.shortName = shortName
        return this
    }


    /**
     * 设置「排序」值
     * @param val
     */
    OrganizationDTO setSort(BigInteger sort) {
        this.sort = sort
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    OrganizationDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    OrganizationDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    OrganizationDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    OrganizationDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    OrganizationDTO setPid(String pid) {
        this.pid = pid
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    OrganizationDTO setPname(String pname) {
        this.pname = pname
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    OrganizationDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    OrganizationDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
