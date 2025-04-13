package cn.ibizlab.plm.testmgmt.librarymember.dto

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
class LibraryMemberDTO extends GroovyDTO<LibraryMemberDTO> {

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
     * 「测试库名称」
     */
    @JsonProperty("library_name")
    String libraryName
    /**
     * 「测试库编号」
     */
    @JsonProperty("library_identifier")
    String libraryIdentifier
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
     * 「测试库标识」
     */
    @JsonProperty("library_id")
    String libraryId
    /**
     * 「姓名」
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
     * 设置「登录名」值
     * @param val
     */
    LibraryMemberDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「角色」值
     * 字典[角色类型]
     * @param val
     */
    LibraryMemberDTO setRoleId(String roleId) {
        this.roleId = roleId
        return this
    }


    /**
     * 设置「测试库名称」值
     * @param val
     */
    LibraryMemberDTO setLibraryName(String libraryName) {
        this.libraryName = libraryName
        return this
    }


    /**
     * 设置「测试库编号」值
     * @param val
     */
    LibraryMemberDTO setLibraryIdentifier(String libraryIdentifier) {
        this.libraryIdentifier = libraryIdentifier
        return this
    }


    /**
     * 设置「职位」值
     * 字典[职位（动态）]
     * @param val
     */
    LibraryMemberDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    LibraryMemberDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    LibraryMemberDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    LibraryMemberDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「测试库标识」值
     * @param val
     */
    LibraryMemberDTO setLibraryId(String libraryId) {
        this.libraryId = libraryId
        return this
    }


    /**
     * 设置「姓名」值
     * @param val
     */
    LibraryMemberDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    LibraryMemberDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    LibraryMemberDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
