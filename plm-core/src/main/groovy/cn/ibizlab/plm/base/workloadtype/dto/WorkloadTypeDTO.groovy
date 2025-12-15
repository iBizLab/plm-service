package cn.ibizlab.plm.base.workloadtype.dto

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
class WorkloadTypeDTO extends GroovyDTO<WorkloadTypeDTO> {

    /**
     * 「序号」
     */
    @JsonProperty("sequence")
    BigDecimal sequence
    /**
     * 「是否系统默认」
     * 字典[是否]
     */
    @JsonProperty("is_system")
    Integer isSystem
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
     * 设置「序号」值
     * @param val
     */
    WorkloadTypeDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「是否系统默认」值
     * 字典[是否]
     * @param val
     */
    WorkloadTypeDTO setIsSystem(Integer isSystem) {
        this.isSystem = isSystem
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkloadTypeDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    WorkloadTypeDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    WorkloadTypeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    WorkloadTypeDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkloadTypeDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    WorkloadTypeDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
