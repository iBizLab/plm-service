package cn.ibizlab.plm.team.updaterecord.dto

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
class UpdateRecordDTO extends GroovyDTO<UpdateRecordDTO> {

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
     * 「关键结果标识」
     */
    @JsonProperty("key_result_id")
    String keyResultId
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「目标标识」
     */
    @JsonProperty("objective_id")
    String objectiveId
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
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    UpdateRecordDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    UpdateRecordDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    UpdateRecordDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「关键结果标识」值
     * @param val
     */
    UpdateRecordDTO setKeyResultId(String keyResultId) {
        this.keyResultId = keyResultId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    UpdateRecordDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「目标标识」值
     * @param val
     */
    UpdateRecordDTO setObjectiveId(String objectiveId) {
        this.objectiveId = objectiveId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    UpdateRecordDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    UpdateRecordDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
