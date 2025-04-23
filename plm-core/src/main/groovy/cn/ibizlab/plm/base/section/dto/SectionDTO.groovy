package cn.ibizlab.plm.base.section.dto

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
class SectionDTO extends GroovyDTO<SectionDTO> {

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
     * 「用户标记」
     */
    @JsonProperty("user_tag")
    String userTag
    /**
     * 「用户标记2」
     */
    @JsonProperty("user_tag2")
    String userTag2

    /**
     * 设置「所属数据标识」值
     * @param val
     */
    SectionDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「序号」值
     * @param val
     */
    SectionDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    SectionDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所属对象子类型」值
     * @param val
     */
    SectionDTO setOwnerSubtype(String ownerSubtype) {
        this.ownerSubtype = ownerSubtype
        return this
    }


    /**
     * 设置「是否叶子节点」值
     * 字典[是否]
     * @param val
     */
    SectionDTO setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf
        return this
    }


    /**
     * 设置「是否叶子节点2」值
     * 字典[是否]
     * @param val
     */
    SectionDTO setIsLeaf2(Integer isLeaf2) {
        this.isLeaf2 = isLeaf2
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    SectionDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    SectionDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    SectionDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    SectionDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    SectionDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    SectionDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「用户标记」值
     * @param val
     */
    SectionDTO setUserTag(String userTag) {
        this.userTag = userTag
        return this
    }


    /**
     * 设置「用户标记2」值
     * @param val
     */
    SectionDTO setUserTag2(String userTag2) {
        this.userTag2 = userTag2
        return this
    }

}
