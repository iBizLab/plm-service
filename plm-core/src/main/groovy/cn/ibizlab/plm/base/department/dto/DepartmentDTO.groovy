package cn.ibizlab.plm.base.department.dto

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
class DepartmentDTO extends GroovyDTO<DepartmentDTO> {

    /**
     * 「部门标识/编号」
     */
    @JsonProperty("identifier")
    String identifier
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
     * 「排序」
     */
    @JsonProperty("sort")
    BigInteger sort
    /**
     * 「父名称」
     */
    @JsonProperty("pname")
    String pname
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
     * 「部门负责人标识」
     */
    @JsonProperty("head_id")
    String headId
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
     * 「组织标识」
     */
    @JsonProperty("organization_id")
    String organizationId
    /**
     * 「父部门标识」
     */
    @JsonProperty("parent_id")
    String parentId
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
     * 设置「部门标识/编号」值
     * @param val
     */
    DepartmentDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    DepartmentDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「是否叶子节点」值
     * 字典[是否]
     * @param val
     */
    DepartmentDTO setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf
        return this
    }


    /**
     * 设置「排序」值
     * @param val
     */
    DepartmentDTO setSort(BigInteger sort) {
        this.sort = sort
        return this
    }


    /**
     * 设置「父名称」值
     * @param val
     */
    DepartmentDTO setPname(String pname) {
        this.pname = pname
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    DepartmentDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    DepartmentDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「部门负责人标识」值
     * @param val
     */
    DepartmentDTO setHeadId(String headId) {
        this.headId = headId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    DepartmentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    DepartmentDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「组织标识」值
     * @param val
     */
    DepartmentDTO setOrganizationId(String organizationId) {
        this.organizationId = organizationId
        return this
    }


    /**
     * 设置「父部门标识」值
     * @param val
     */
    DepartmentDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    DepartmentDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DepartmentDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
