package cn.ibizlab.plm.base.group.dto

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
class GroupDTO extends GroovyDTO<GroupDTO> {

    /**
     * 「可见范围」
     * 字典[可见范围]
     */
    @JsonProperty("visibility")
    String visibility
    /**
     * 「序号」
     */
    @JsonProperty("sequence")
    BigDecimal sequence
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「团队头像」
     */
    @JsonProperty("avatar")
    String avatar
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
     * 「团队名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「分组标识」
     */
    @JsonProperty("section_id")
    String sectionId
    /**
     * 「所属分组」
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
     * 设置「可见范围」值
     * 字典[可见范围]
     * @param val
     */
    GroupDTO setVisibility(String visibility) {
        this.visibility = visibility
        return this
    }


    /**
     * 设置「序号」值
     * @param val
     */
    GroupDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    GroupDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「团队头像」值
     * @param val
     */
    GroupDTO setAvatar(String avatar) {
        this.avatar = avatar
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    GroupDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    GroupDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    GroupDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「团队名称」值
     * @param val
     */
    GroupDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「分组标识」值
     * @param val
     */
    GroupDTO setSectionId(String sectionId) {
        this.sectionId = sectionId
        return this
    }


    /**
     * 设置「所属分组」值
     * @param val
     */
    GroupDTO setSectionName(String sectionName) {
        this.sectionName = sectionName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    GroupDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    GroupDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
