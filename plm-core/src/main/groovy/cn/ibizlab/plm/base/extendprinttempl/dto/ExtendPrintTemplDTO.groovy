package cn.ibizlab.plm.base.extendprinttempl.dto

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
class ExtendPrintTemplDTO extends GroovyDTO<ExtendPrintTemplDTO> {

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
     * 「打印模型」
     */
    @JsonProperty("print_model")
    String printModel
    /**
     * 「打印类型」
     * 字典[打印格式]
     */
    @JsonProperty("print_type")
    String printType
    /**
     * 「打印标识」
     */
    @JsonProperty("print_tag")
    String printTag
    /**
     * 「报表类型」
     * 字典[报表格式]
     */
    @JsonProperty("report_type")
    String reportType
    /**
     * 「实体标识」
     * 字典[实体标识]
     */
    @JsonProperty("de_tag")
    String deTag

    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    ExtendPrintTemplDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    ExtendPrintTemplDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ExtendPrintTemplDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ExtendPrintTemplDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ExtendPrintTemplDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ExtendPrintTemplDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「打印模型」值
     * @param val
     */
    ExtendPrintTemplDTO setPrintModel(String printModel) {
        this.printModel = printModel
        return this
    }


    /**
     * 设置「打印类型」值
     * 字典[打印格式]
     * @param val
     */
    ExtendPrintTemplDTO setPrintType(String printType) {
        this.printType = printType
        return this
    }


    /**
     * 设置「打印标识」值
     * @param val
     */
    ExtendPrintTemplDTO setPrintTag(String printTag) {
        this.printTag = printTag
        return this
    }


    /**
     * 设置「报表类型」值
     * 字典[报表格式]
     * @param val
     */
    ExtendPrintTemplDTO setReportType(String reportType) {
        this.reportType = reportType
        return this
    }


    /**
     * 设置「实体标识」值
     * 字典[实体标识]
     * @param val
     */
    ExtendPrintTemplDTO setDeTag(String deTag) {
        this.deTag = deTag
        return this
    }

}
