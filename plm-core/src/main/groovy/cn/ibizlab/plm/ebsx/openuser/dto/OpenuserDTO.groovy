package cn.ibizlab.plm.ebsx.openuser.dto

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
class OpenuserDTO extends GroovyDTO<OpenuserDTO> {

    /**
     * 「创建人」
     * 字典[云系统操作者]
     */
    @JsonProperty("createman")
    String createman
    /**
     * 「最后更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("updateman")
    String updateman
    /**
     * 「组织标识」
     */
    @JsonProperty("orgid")
    String orgid
    /**
     * 「用户标识」
     */
    @JsonProperty("userid")
    String userid
    /**
     * 「第三方用户标识」
     */
    @JsonProperty("openuserid")
    String openuserid
    /**
     * 「手机」
     */
    @JsonProperty("mobile")
    String mobile
    /**
     * 「第三方用户名称」
     */
    @JsonProperty("openusername")
    String openusername
    /**
     * 「第三方用户类型」
     */
    @JsonProperty("open_type")
    String openType
    /**
     * 「第三方用户代码」
     */
    @JsonProperty("openusercode")
    String openusercode
    /**
     * 「是否绑定」
     */
    @JsonProperty("isbinding")
    Integer isbinding
    /**
     * 「部门」
     */
    @JsonProperty("depts")
    String depts
    /**
     * 「建立时间」
     */
    @JsonProperty("createdate")
    Timestamp createdate
    /**
     * 「更新时间」
     */
    @JsonProperty("updatedate")
    Timestamp updatedate

    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    OpenuserDTO setCreateman(String createman) {
        this.createman = createman
        return this
    }


    /**
     * 设置「最后更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    OpenuserDTO setUpdateman(String updateman) {
        this.updateman = updateman
        return this
    }


    /**
     * 设置「组织标识」值
     * @param val
     */
    OpenuserDTO setOrgid(String orgid) {
        this.orgid = orgid
        return this
    }


    /**
     * 设置「用户标识」值
     * @param val
     */
    OpenuserDTO setUserid(String userid) {
        this.userid = userid
        return this
    }


    /**
     * 设置「第三方用户标识」值
     * @param val
     */
    OpenuserDTO setOpenuserid(String openuserid) {
        this.openuserid = openuserid
        return this
    }


    /**
     * 设置「手机」值
     * @param val
     */
    OpenuserDTO setMobile(String mobile) {
        this.mobile = mobile
        return this
    }


    /**
     * 设置「第三方用户名称」值
     * @param val
     */
    OpenuserDTO setOpenusername(String openusername) {
        this.openusername = openusername
        return this
    }


    /**
     * 设置「第三方用户类型」值
     * @param val
     */
    OpenuserDTO setOpenType(String openType) {
        this.openType = openType
        return this
    }


    /**
     * 设置「第三方用户代码」值
     * @param val
     */
    OpenuserDTO setOpenusercode(String openusercode) {
        this.openusercode = openusercode
        return this
    }


    /**
     * 设置「是否绑定」值
     * @param val
     */
    OpenuserDTO setIsbinding(Integer isbinding) {
        this.isbinding = isbinding
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    OpenuserDTO setDepts(String depts) {
        this.depts = depts
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    OpenuserDTO setCreatedate(Timestamp createdate) {
        this.createdate = createdate
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    OpenuserDTO setUpdatedate(Timestamp updatedate) {
        this.updatedate = updatedate
        return this
    }

}
