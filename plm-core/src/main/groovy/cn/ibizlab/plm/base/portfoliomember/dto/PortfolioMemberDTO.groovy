package cn.ibizlab.plm.base.portfoliomember.dto

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
class PortfolioMemberDTO extends GroovyDTO<PortfolioMemberDTO> {

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
     * 「文件夹名称」
     */
    @JsonProperty("portfolio_name")
    String portfolioName
    /**
     * 「文件夹标识」
     */
    @JsonProperty("portfolio_identifier")
    String portfolioIdentifier
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
     * 「文件夹标识」
     */
    @JsonProperty("portfolio_id")
    String portfolioId
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
    PortfolioMemberDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「角色」值
     * 字典[角色类型]
     * @param val
     */
    PortfolioMemberDTO setRoleId(String roleId) {
        this.roleId = roleId
        return this
    }


    /**
     * 设置「文件夹名称」值
     * @param val
     */
    PortfolioMemberDTO setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName
        return this
    }


    /**
     * 设置「文件夹标识」值
     * @param val
     */
    PortfolioMemberDTO setPortfolioIdentifier(String portfolioIdentifier) {
        this.portfolioIdentifier = portfolioIdentifier
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PortfolioMemberDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PortfolioMemberDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    PortfolioMemberDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「姓名」值
     * @param val
     */
    PortfolioMemberDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「文件夹标识」值
     * @param val
     */
    PortfolioMemberDTO setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PortfolioMemberDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PortfolioMemberDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
