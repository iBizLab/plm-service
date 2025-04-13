package cn.ibizlab.plm.base.executor.dto

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
class ExecutorUserIdDTO extends GroovyDTO<ExecutorUserIdDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「执行人标识」
     */
    @JsonProperty("user_id")
    String userId

    /**
     * 设置「标识」值
     * @param val
     */
    ExecutorUserIdDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「执行人标识」值
     * @param val
     */
    ExecutorUserIdDTO setUserId(String userId) {
        this.userId = userId
        return this
    }

}
