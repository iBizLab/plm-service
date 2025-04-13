package cn.ibizlab.plm.base.referencesindex.dto

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
class ReferencesIndexDTO extends GroovyDTO<ReferencesIndexDTO> {

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
     * 「索引类型」
     * 字典[索引类型]
     */
    @JsonProperty("type")
    String type

    /**
     * 设置「标识」值
     * @param val
     */
    ReferencesIndexDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ReferencesIndexDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「索引类型」值
     * 字典[索引类型]
     * @param val
     */
    ReferencesIndexDTO setType(String type) {
        this.type = type
        return this
    }

}
