package cn.ibizlab.plm.extension.about.dto

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
class ABOUTDTO extends GroovyDTO<ABOUTDTO> {

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
     * 「版本」
     */
    @JsonProperty("version")
    String version
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「说明文件」
     */
    @JsonProperty("readme")
    String readme
    /**
     * 「授权协议」
     */
    @JsonProperty("license")
    String license

    /**
     * 设置「标识」值
     * @param val
     */
    ABOUTDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ABOUTDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「版本」值
     * @param val
     */
    ABOUTDTO setVersion(String version) {
        this.version = version
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ABOUTDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ABOUTDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ABOUTDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「说明文件」值
     * @param val
     */
    ABOUTDTO setReadme(String readme) {
        this.readme = readme
        return this
    }


    /**
     * 设置「授权协议」值
     * @param val
     */
    ABOUTDTO setLicense(String license) {
        this.license = license
        return this
    }

}
