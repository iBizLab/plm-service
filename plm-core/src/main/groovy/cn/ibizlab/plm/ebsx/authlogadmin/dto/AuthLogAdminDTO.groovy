package cn.ibizlab.plm.ebsx.authlogadmin.dto

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
class AuthLogAdminDTO extends GroovyDTO<AuthLogAdminDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("logid")
    String logId
    /**
     * 「用户全局标识」
     */
    @JsonProperty("userid")
    String userId
    /**
     * 「用户全局名」
     */
    @JsonProperty("username")
    String userName
    /**
     * 「用户名称」
     */
    @JsonProperty("personname")
    String personName
    /**
     * 「域」
     */
    @JsonProperty("domain")
    String domain
    /**
     * 「认证时间」
     */
    @JsonProperty("authtime")
    Timestamp authTime
    /**
     * 「IP地址」
     */
    @JsonProperty("ipaddr")
    String iPAddr
    /**
     * 「MAC地址」
     */
    @JsonProperty("macaddr")
    String macAddr
    /**
     * 「客户端」
     */
    @JsonProperty("useragent")
    String userAgent
    /**
     * 「认证方式」
     */
    @JsonProperty("authagent")
    String authAgent
    /**
     * 「认证结果」
     * 字典[登录结果]
     */
    @JsonProperty("authcode")
    String authCode
    /**
     * 「活跃成员数」
     */
    @JsonProperty("active_members")
    String activeMembers

    /**
     * 设置「标识」值
     * @param val
     */
    AuthLogAdminDTO setLogId(String logId) {
        this.logId = logId
        return this
    }


    /**
     * 设置「用户全局标识」值
     * @param val
     */
    AuthLogAdminDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「用户全局名」值
     * @param val
     */
    AuthLogAdminDTO setUserName(String userName) {
        this.userName = userName
        return this
    }


    /**
     * 设置「用户名称」值
     * @param val
     */
    AuthLogAdminDTO setPersonName(String personName) {
        this.personName = personName
        return this
    }


    /**
     * 设置「域」值
     * @param val
     */
    AuthLogAdminDTO setDomain(String domain) {
        this.domain = domain
        return this
    }


    /**
     * 设置「认证时间」值
     * @param val
     */
    AuthLogAdminDTO setAuthTime(Timestamp authTime) {
        this.authTime = authTime
        return this
    }


    /**
     * 设置「IP地址」值
     * @param val
     */
    AuthLogAdminDTO setIPAddr(String iPAddr) {
        this.iPAddr = iPAddr
        return this
    }


    /**
     * 设置「MAC地址」值
     * @param val
     */
    AuthLogAdminDTO setMacAddr(String macAddr) {
        this.macAddr = macAddr
        return this
    }


    /**
     * 设置「客户端」值
     * @param val
     */
    AuthLogAdminDTO setUserAgent(String userAgent) {
        this.userAgent = userAgent
        return this
    }


    /**
     * 设置「认证方式」值
     * @param val
     */
    AuthLogAdminDTO setAuthAgent(String authAgent) {
        this.authAgent = authAgent
        return this
    }


    /**
     * 设置「认证结果」值
     * 字典[登录结果]
     * @param val
     */
    AuthLogAdminDTO setAuthCode(String authCode) {
        this.authCode = authCode
        return this
    }


    /**
     * 设置「活跃成员数」值
     * @param val
     */
    AuthLogAdminDTO setActiveMembers(String activeMembers) {
        this.activeMembers = activeMembers
        return this
    }

}
