package cn.ibizlab.plm.wiki.spacemember.dto

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
class SpaceMemberDTO extends GroovyDTO<SpaceMemberDTO> {

    /**
     * 「登录名」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「角色」
     * 字典[角色类型]
     */
    @JsonProperty("role_id")
    String roleId
    /**
     * 「空间编号」
     */
    @JsonProperty("space_identifier")
    String spaceIdentifier
    /**
     * 「职位」
     * 字典[职位（动态）]
     */
    @JsonProperty("title")
    String title
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
     * 「姓名」
     */
    @JsonProperty("name")
    String name
    /**
     * 「空间标识」
     */
    @JsonProperty("space_id")
    String spaceId
    /**
     * 「名称」
     */
    @JsonProperty("space_name")
    String spaceName
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
     * 设置「登录名」值
     * @param val
     */
    SpaceMemberDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「角色」值
     * 字典[角色类型]
     * @param val
     */
    SpaceMemberDTO setRoleId(String roleId) {
        this.roleId = roleId
        return this
    }


    /**
     * 设置「空间编号」值
     * @param val
     */
    SpaceMemberDTO setSpaceIdentifier(String spaceIdentifier) {
        this.spaceIdentifier = spaceIdentifier
        return this
    }


    /**
     * 设置「职位」值
     * 字典[职位（动态）]
     * @param val
     */
    SpaceMemberDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    SpaceMemberDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    SpaceMemberDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    SpaceMemberDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「姓名」值
     * @param val
     */
    SpaceMemberDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「空间标识」值
     * @param val
     */
    SpaceMemberDTO setSpaceId(String spaceId) {
        this.spaceId = spaceId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    SpaceMemberDTO setSpaceName(String spaceName) {
        this.spaceName = spaceName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    SpaceMemberDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    SpaceMemberDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
