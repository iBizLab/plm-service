package cn.ibizlab.plm.base.localdepartment.dto

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
class LocalDepartmentDTO extends GroovyDTO<LocalDepartmentDTO> {

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
     * 「父部门标识」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「部门负责人标识」
     */
    @JsonProperty("head_id")
    String headId
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
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
     * 设置「标识」值
     * @param val
     */
    LocalDepartmentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    LocalDepartmentDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「父部门标识」值
     * @param val
     */
    LocalDepartmentDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「部门负责人标识」值
     * @param val
     */
    LocalDepartmentDTO setHeadId(String headId) {
        this.headId = headId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    LocalDepartmentDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    LocalDepartmentDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    LocalDepartmentDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    LocalDepartmentDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }

}
