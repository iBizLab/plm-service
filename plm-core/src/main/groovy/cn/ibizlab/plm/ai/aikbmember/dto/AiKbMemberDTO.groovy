package cn.ibizlab.plm.ai.aikbmember.dto

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
class AiKbMemberDTO extends GroovyDTO<AiKbMemberDTO> {

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
     * 「创建人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「创建时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
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
     * 「角色」
     * 字典[角色类型]
     */
    @JsonProperty("role_id")
    String roleId
    /**
     * 「知识库名称」
     */
    @JsonProperty("kb_name")
    String kbName
    /**
     * 「知识库标识」
     */
    @JsonProperty("kb_id")
    String kbId
    /**
     * 「标识」
     */
    @JsonProperty("user_id")
    String userId

    /**
     * 设置「标识」值
     * @param val
     */
    AiKbMemberDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiKbMemberDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbMemberDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AiKbMemberDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbMemberDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKbMemberDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「角色」值
     * 字典[角色类型]
     * @param val
     */
    AiKbMemberDTO setRoleId(String roleId) {
        this.roleId = roleId
        return this
    }


    /**
     * 设置「知识库名称」值
     * @param val
     */
    AiKbMemberDTO setKbName(String kbName) {
        this.kbName = kbName
        return this
    }


    /**
     * 设置「知识库标识」值
     * @param val
     */
    AiKbMemberDTO setKbId(String kbId) {
        this.kbId = kbId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    AiKbMemberDTO setUserId(String userId) {
        this.userId = userId
        return this
    }

}
