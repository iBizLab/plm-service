package cn.ibizlab.plm.base.version.dto

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
class VersionDTO extends GroovyDTO<VersionDTO> {

    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「所属数据标识」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「版本」
     */
    @JsonProperty("identifier")
    BigDecimal identifier
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「数据」
     */
    @JsonProperty("data")
    String data
    /**
     * 「支持恢复」
     */
    @JsonProperty("restorable")
    String restorable
    /**
     * 「手动提交」
     * 字典[是否]
     */
    @JsonProperty("manual")
    Integer manual
    /**
     * 「是否命名」
     * 字典[是否]
     */
    @JsonProperty("is_named")
    Integer isNamed
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
     * 设置「描述」值
     * @param val
     */
    VersionDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「所属数据标识」值
     * @param val
     */
    VersionDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「版本」值
     * @param val
     */
    VersionDTO setIdentifier(BigDecimal identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    VersionDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「数据」值
     * @param val
     */
    VersionDTO setData(String data) {
        this.data = data
        return this
    }


    /**
     * 设置「支持恢复」值
     * @param val
     */
    VersionDTO setRestorable(String restorable) {
        this.restorable = restorable
        return this
    }


    /**
     * 设置「手动提交」值
     * 字典[是否]
     * @param val
     */
    VersionDTO setManual(Integer manual) {
        this.manual = manual
        return this
    }


    /**
     * 设置「是否命名」值
     * 字典[是否]
     * @param val
     */
    VersionDTO setIsNamed(Integer isNamed) {
        this.isNamed = isNamed
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    VersionDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    VersionDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    VersionDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    VersionDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    VersionDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    VersionDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
