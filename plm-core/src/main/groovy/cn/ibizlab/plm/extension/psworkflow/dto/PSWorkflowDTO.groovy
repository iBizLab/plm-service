package cn.ibizlab.plm.extension.psworkflow.dto

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
class PSWorkflowDTO extends GroovyDTO<PSWorkflowDTO> {

    /**
     * 「代码标识」
     */
    @JsonProperty("codename")
    String codeName
    /**
     * 「建立时间」
     */
    @JsonProperty("createdate")
    Timestamp createDate
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("createman")
    String createMan
    /**
     * 「逻辑有效标志」
     */
    @JsonProperty("enable")
    Integer enable
    /**
     * 「工作流标识」
     */
    @JsonProperty("psworkflowid")
    String pSWorkflowId
    /**
     * 「工作流名称」
     */
    @JsonProperty("psworkflowname")
    String pSWorkflowName
    /**
     * 「更新时间」
     */
    @JsonProperty("updatedate")
    Timestamp updateDate
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("updateman")
    String updateMan
    /**
     * 「扩展标记」
     */
    @JsonProperty("extension_tag")
    String extensionTag
    /**
     * 「扩展标记2」
     */
    @JsonProperty("extension_tag2")
    String extensionTag2
    /**
     * 「扩展标记3」
     */
    @JsonProperty("extension_tag3")
    String extensionTag3
    /**
     * 「扩展标记4」
     */
    @JsonProperty("extension_tag4")
    String extensionTag4

    /**
     * 设置「代码标识」值
     * @param val
     */
    PSWorkflowDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PSWorkflowDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSWorkflowDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「逻辑有效标志」值
     * @param val
     */
    PSWorkflowDTO setEnable(Integer enable) {
        this.enable = enable
        return this
    }


    /**
     * 设置「工作流标识」值
     * @param val
     */
    PSWorkflowDTO setPSWorkflowId(String pSWorkflowId) {
        this.pSWorkflowId = pSWorkflowId
        return this
    }


    /**
     * 设置「工作流名称」值
     * @param val
     */
    PSWorkflowDTO setPSWorkflowName(String pSWorkflowName) {
        this.pSWorkflowName = pSWorkflowName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PSWorkflowDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSWorkflowDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「扩展标记」值
     * @param val
     */
    PSWorkflowDTO setExtensionTag(String extensionTag) {
        this.extensionTag = extensionTag
        return this
    }


    /**
     * 设置「扩展标记2」值
     * @param val
     */
    PSWorkflowDTO setExtensionTag2(String extensionTag2) {
        this.extensionTag2 = extensionTag2
        return this
    }


    /**
     * 设置「扩展标记3」值
     * @param val
     */
    PSWorkflowDTO setExtensionTag3(String extensionTag3) {
        this.extensionTag3 = extensionTag3
        return this
    }


    /**
     * 设置「扩展标记4」值
     * @param val
     */
    PSWorkflowDTO setExtensionTag4(String extensionTag4) {
        this.extensionTag4 = extensionTag4
        return this
    }

}
