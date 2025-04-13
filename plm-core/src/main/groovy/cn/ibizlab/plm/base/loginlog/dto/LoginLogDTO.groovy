package cn.ibizlab.plm.base.loginlog.dto

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
class LoginLogDTO extends GroovyDTO<LoginLogDTO> {

    /**
     * 「登录时间」
     */
    @JsonProperty("auth_time")
    Timestamp authTime
    /**
     * 「区/县」
     */
    @JsonProperty("county")
    String county
    /**
     * 「国家」
     */
    @JsonProperty("country")
    String country
    /**
     * 「城市」
     */
    @JsonProperty("city")
    String city
    /**
     * 「IP地址」
     */
    @JsonProperty("ip")
    String ip
    /**
     * 「登录方式」
     */
    @JsonProperty("login_method")
    String loginMethod
    /**
     * 「省」
     */
    @JsonProperty("province")
    String province
    /**
     * 「客户端」
     */
    @JsonProperty("user_agent")
    String userAgent
    /**
     * 「用户标识」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「用户名称」
     */
    @JsonProperty("user_name")
    String userName
    /**
     * 「网络提供商」
     */
    @JsonProperty("isp")
    String isp
    /**
     * 「认证结果」
     * 字典[登录结果]
     */
    @JsonProperty("auth_code")
    String authCode
    /**
     * 「活跃成员数」
     */
    @JsonProperty("active_members")
    String activeMembers
    /**
     * 「活跃率」
     */
    @JsonProperty("active_rate")
    String activeRate
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
     * 设置「登录时间」值
     * @param val
     */
    LoginLogDTO setAuthTime(Timestamp authTime) {
        this.authTime = authTime
        return this
    }


    /**
     * 设置「区/县」值
     * @param val
     */
    LoginLogDTO setCounty(String county) {
        this.county = county
        return this
    }


    /**
     * 设置「国家」值
     * @param val
     */
    LoginLogDTO setCountry(String country) {
        this.country = country
        return this
    }


    /**
     * 设置「城市」值
     * @param val
     */
    LoginLogDTO setCity(String city) {
        this.city = city
        return this
    }


    /**
     * 设置「IP地址」值
     * @param val
     */
    LoginLogDTO setIp(String ip) {
        this.ip = ip
        return this
    }


    /**
     * 设置「登录方式」值
     * @param val
     */
    LoginLogDTO setLoginMethod(String loginMethod) {
        this.loginMethod = loginMethod
        return this
    }


    /**
     * 设置「省」值
     * @param val
     */
    LoginLogDTO setProvince(String province) {
        this.province = province
        return this
    }


    /**
     * 设置「客户端」值
     * @param val
     */
    LoginLogDTO setUserAgent(String userAgent) {
        this.userAgent = userAgent
        return this
    }


    /**
     * 设置「用户标识」值
     * @param val
     */
    LoginLogDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「用户名称」值
     * @param val
     */
    LoginLogDTO setUserName(String userName) {
        this.userName = userName
        return this
    }


    /**
     * 设置「网络提供商」值
     * @param val
     */
    LoginLogDTO setIsp(String isp) {
        this.isp = isp
        return this
    }


    /**
     * 设置「认证结果」值
     * 字典[登录结果]
     * @param val
     */
    LoginLogDTO setAuthCode(String authCode) {
        this.authCode = authCode
        return this
    }


    /**
     * 设置「活跃成员数」值
     * @param val
     */
    LoginLogDTO setActiveMembers(String activeMembers) {
        this.activeMembers = activeMembers
        return this
    }


    /**
     * 设置「活跃率」值
     * @param val
     */
    LoginLogDTO setActiveRate(String activeRate) {
        this.activeRate = activeRate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    LoginLogDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    LoginLogDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    LoginLogDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    LoginLogDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    LoginLogDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    LoginLogDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
