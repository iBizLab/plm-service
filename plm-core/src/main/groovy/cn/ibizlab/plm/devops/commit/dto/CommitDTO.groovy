package cn.ibizlab.plm.devops.commit.dto

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
class CommitDTO extends GroovyDTO<CommitDTO> {

    /**
     * 「提交消息」
     */
    @JsonProperty("message")
    String message
    /**
     * 「SHA值」
     */
    @JsonProperty("sha")
    String sha

    /**
     * 设置「提交消息」值
     * @param val
     */
    CommitDTO setMessage(String message) {
        this.message = message
        return this
    }


    /**
     * 设置「SHA值」值
     * @param val
     */
    CommitDTO setSha(String sha) {
        this.sha = sha
        return this
    }

}
