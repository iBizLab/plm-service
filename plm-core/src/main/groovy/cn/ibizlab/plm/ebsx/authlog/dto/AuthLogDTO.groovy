package cn.ibizlab.plm.ebsx.authlog.dto

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
class AuthLogDTO extends GroovyDTO<AuthLogDTO> {

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
     * 设置「标识」值
     * @param val
     */
    AuthLogDTO setLogId(String logId) {
        this.logId = logId
        return this
    }


    /**
     * 设置「用户全局标识」值
     * @param val
     */
    AuthLogDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「用户全局名」值
     * @param val
     */
    AuthLogDTO setUserName(String userName) {
        this.userName = userName
        return this
    }


    /**
     * 设置「用户名称」值
     * @param val
     */
    AuthLogDTO setPersonName(String personName) {
        this.personName = personName
        return this
    }


    /**
     * 设置「域」值
     * @param val
     */
    AuthLogDTO setDomain(String domain) {
        this.domain = domain
        return this
    }


    /**
     * 设置「认证时间」值
     * @param val
     */
    AuthLogDTO setAuthTime(Timestamp authTime) {
        this.authTime = authTime
        return this
    }


    /**
     * 设置「IP地址」值
     * @param val
     */
    AuthLogDTO setIPAddr(String iPAddr) {
        this.iPAddr = iPAddr
        return this
    }


    /**
     * 设置「MAC地址」值
     * @param val
     */
    AuthLogDTO setMacAddr(String macAddr) {
        this.macAddr = macAddr
        return this
    }


    /**
     * 设置「客户端」值
     * @param val
     */
    AuthLogDTO setUserAgent(String userAgent) {
        this.userAgent = userAgent
        return this
    }


    /**
     * 设置「认证方式」值
     * @param val
     */
    AuthLogDTO setAuthAgent(String authAgent) {
        this.authAgent = authAgent
        return this
    }


    /**
     * 设置「认证结果」值
     * 字典[登录结果]
     * @param val
     */
    AuthLogDTO setAuthCode(String authCode) {
        this.authCode = authCode
        return this
    }

}
