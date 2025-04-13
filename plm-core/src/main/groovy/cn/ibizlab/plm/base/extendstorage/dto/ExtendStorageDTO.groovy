package cn.ibizlab.plm.base.extendstorage.dto

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
class ExtendStorageDTO extends GroovyDTO<ExtendStorageDTO> {

    /**
     * 「所属数据标识」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「文本值」
     */
    @JsonProperty("string_value")
    String stringValue
    /**
     * 「长文本值」
     */
    @JsonProperty("longstring_value")
    String longstringValue
    /**
     * 「浮点值」
     */
    @JsonProperty("double_value")
    Double doubleValue
    /**
     * 「时间值」
     */
    @JsonProperty("datetime_value")
    Timestamp datetimeValue
    /**
     * 「数值值」
     */
    @JsonProperty("decimal_value")
    BigDecimal decimalValue
    /**
     * 「整形值」
     */
    @JsonProperty("int_value")
    Integer intValue
    /**
     * 「大整形值」
     */
    @JsonProperty("bigint_value")
    BigInteger bigintValue
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
     * 设置「所属数据标识」值
     * @param val
     */
    ExtendStorageDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    ExtendStorageDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「文本值」值
     * @param val
     */
    ExtendStorageDTO setStringValue(String stringValue) {
        this.stringValue = stringValue
        return this
    }


    /**
     * 设置「长文本值」值
     * @param val
     */
    ExtendStorageDTO setLongstringValue(String longstringValue) {
        this.longstringValue = longstringValue
        return this
    }


    /**
     * 设置「浮点值」值
     * @param val
     */
    ExtendStorageDTO setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue
        return this
    }


    /**
     * 设置「时间值」值
     * @param val
     */
    ExtendStorageDTO setDatetimeValue(Timestamp datetimeValue) {
        this.datetimeValue = datetimeValue
        return this
    }


    /**
     * 设置「数值值」值
     * @param val
     */
    ExtendStorageDTO setDecimalValue(BigDecimal decimalValue) {
        this.decimalValue = decimalValue
        return this
    }


    /**
     * 设置「整形值」值
     * @param val
     */
    ExtendStorageDTO setIntValue(Integer intValue) {
        this.intValue = intValue
        return this
    }


    /**
     * 设置「大整形值」值
     * @param val
     */
    ExtendStorageDTO setBigintValue(BigInteger bigintValue) {
        this.bigintValue = bigintValue
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ExtendStorageDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ExtendStorageDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ExtendStorageDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ExtendStorageDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ExtendStorageDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ExtendStorageDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
