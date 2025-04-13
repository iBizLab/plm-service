package cn.ibizlab.plm.ibizsysmgr.sysdepartment.dto

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
class SysDepartmentDTO extends GroovyDTO<SysDepartmentDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「部门名称」
     */
    @JsonProperty("department_name")
    String departmentName
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
     * 「部门编号」
     */
    @JsonProperty("department_number")
    String departmentNumber
    /**
     * 「备注」
     */
    @JsonProperty("description")
    String description
    /**
     * 「是否叶子节点」
     * 字典[是否]
     */
    @JsonProperty("is_leaf")
    Integer isLeaf
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
     * 「业务类别」
     */
    @JsonProperty("business_category")
    List<String> businessCategory
    /**
     * 「上级标识」
     */
    @JsonProperty("parent_unit_id")
    String parentUnitId
    /**
     * 「上级部门标识」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「上级名称」
     */
    @JsonProperty("parent_unit_name")
    String parentUnitName
    /**
     * 「DN」
     */
    @JsonProperty("dn")
    String dn
    /**
     * 「上级部门名称」
     */
    @JsonProperty("parent_name")
    String parentName
    /**
     * 「组织机构标识」
     */
    @JsonProperty("organization_id")
    String organizationId
    /**
     * 「组织机构名称」
     */
    @JsonProperty("organization_name")
    String organizationName
    /**
     * 「机构编号」
     */
    @JsonProperty("organization_number")
    String organizationNumber

    /**
     * 设置「标识」值
     * @param val
     */
    SysDepartmentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「部门名称」值
     * @param val
     */
    SysDepartmentDTO setDepartmentName(String departmentName) {
        this.departmentName = departmentName
        return this
    }


    /**
     * 设置「创建人」值
     * @param val
     */
    SysDepartmentDTO setCreator(String creator) {
        this.creator = creator
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    SysDepartmentDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「最后更新人」值
     * @param val
     */
    SysDepartmentDTO setUpdater(String updater) {
        this.updater = updater
        return this
    }


    /**
     * 设置「最后更新时间」值
     * @param val
     */
    SysDepartmentDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「DC」值
     * @param val
     */
    SysDepartmentDTO setDc(String dc) {
        this.dc = dc
        return this
    }


    /**
     * 设置「部门编号」值
     * @param val
     */
    SysDepartmentDTO setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    SysDepartmentDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「是否叶子节点」值
     * 字典[是否]
     * @param val
     */
    SysDepartmentDTO setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf
        return this
    }


    /**
     * 设置「简称」值
     * @param val
     */
    SysDepartmentDTO setShortName(String shortName) {
        this.shortName = shortName
        return this
    }


    /**
     * 设置「排序」值
     * @param val
     */
    SysDepartmentDTO setSort(BigInteger sort) {
        this.sort = sort
        return this
    }


    /**
     * 设置「业务类别」值
     * @param val
     */
    SysDepartmentDTO setBusinessCategory(List<String> businessCategory) {
        this.businessCategory = businessCategory
        return this
    }


    /**
     * 设置「上级标识」值
     * @param val
     */
    SysDepartmentDTO setParentUnitId(String parentUnitId) {
        this.parentUnitId = parentUnitId
        return this
    }


    /**
     * 设置「上级部门标识」值
     * @param val
     */
    SysDepartmentDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「上级名称」值
     * @param val
     */
    SysDepartmentDTO setParentUnitName(String parentUnitName) {
        this.parentUnitName = parentUnitName
        return this
    }


    /**
     * 设置「DN」值
     * @param val
     */
    SysDepartmentDTO setDn(String dn) {
        this.dn = dn
        return this
    }


    /**
     * 设置「上级部门名称」值
     * @param val
     */
    SysDepartmentDTO setParentName(String parentName) {
        this.parentName = parentName
        return this
    }


    /**
     * 设置「组织机构标识」值
     * @param val
     */
    SysDepartmentDTO setOrganizationId(String organizationId) {
        this.organizationId = organizationId
        return this
    }


    /**
     * 设置「组织机构名称」值
     * @param val
     */
    SysDepartmentDTO setOrganizationName(String organizationName) {
        this.organizationName = organizationName
        return this
    }


    /**
     * 设置「机构编号」值
     * @param val
     */
    SysDepartmentDTO setOrganizationNumber(String organizationNumber) {
        this.organizationNumber = organizationNumber
        return this
    }

}
