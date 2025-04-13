package cn.ibizlab.plm.base.category.dto

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
class CategoryDTO extends GroovyDTO<CategoryDTO> {

    /**
     * 「所属数据标识」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「序号」
     */
    @JsonProperty("sequence")
    BigDecimal sequence
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「所属对象子类型」
     */
    @JsonProperty("owner_subtype")
    String ownerSubtype
    /**
     * 「是否叶子节点」
     * 字典[是否]
     */
    @JsonProperty("is_leaf")
    Integer isLeaf
    /**
     * 「是否叶子节点2」
     * 字典[是否]
     */
    @JsonProperty("is_leaf2")
    Integer isLeaf2
    /**
     * 「类别路径」
     */
    @JsonProperty("categories")
    String categories
    /**
     * 「叶子节点标识」
     */
    @JsonProperty("leaf_flag")
    Integer leafFlag
    /**
     * 「是否叶子节点3」
     * 字典[是否]
     */
    @JsonProperty("is_leaf3")
    Integer isLeaf3
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
     * 「分组标识」
     */
    @JsonProperty("section_id")
    String sectionId
    /**
     * 「名称」
     */
    @JsonProperty("section_name")
    String sectionName
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
     * 设置「所属数据标识」值
     * @param val
     */
    CategoryDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「序号」值
     * @param val
     */
    CategoryDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    CategoryDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所属对象子类型」值
     * @param val
     */
    CategoryDTO setOwnerSubtype(String ownerSubtype) {
        this.ownerSubtype = ownerSubtype
        return this
    }


    /**
     * 设置「是否叶子节点」值
     * 字典[是否]
     * @param val
     */
    CategoryDTO setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf
        return this
    }


    /**
     * 设置「是否叶子节点2」值
     * 字典[是否]
     * @param val
     */
    CategoryDTO setIsLeaf2(Integer isLeaf2) {
        this.isLeaf2 = isLeaf2
        return this
    }


    /**
     * 设置「类别路径」值
     * @param val
     */
    CategoryDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「叶子节点标识」值
     * @param val
     */
    CategoryDTO setLeafFlag(Integer leafFlag) {
        this.leafFlag = leafFlag
        return this
    }


    /**
     * 设置「是否叶子节点3」值
     * 字典[是否]
     * @param val
     */
    CategoryDTO setIsLeaf3(Integer isLeaf3) {
        this.isLeaf3 = isLeaf3
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CategoryDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    CategoryDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CategoryDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CategoryDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    CategoryDTO setPid(String pid) {
        this.pid = pid
        return this
    }


    /**
     * 设置「分组标识」值
     * @param val
     */
    CategoryDTO setSectionId(String sectionId) {
        this.sectionId = sectionId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CategoryDTO setSectionName(String sectionName) {
        this.sectionName = sectionName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CategoryDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CategoryDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
