package cn.ibizlab.plm.testmgmt.run.dto

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
class RunExecutorDTO extends GroovyDTO<RunExecutorDTO> {

    /**
     * 「执行人标识」
     */
    @JsonProperty("executor_id")
    String executorId
    /**
     * 「执行人」
     */
    @JsonProperty("executor_name")
    String executorName
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id

    /**
     * 设置「执行人标识」值
     * @param val
     */
    RunExecutorDTO setExecutorId(String executorId) {
        this.executorId = executorId
        return this
    }


    /**
     * 设置「执行人」值
     * @param val
     */
    RunExecutorDTO setExecutorName(String executorName) {
        this.executorName = executorName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    RunExecutorDTO setId(String id) {
        this.id = id
        return this
    }

}
