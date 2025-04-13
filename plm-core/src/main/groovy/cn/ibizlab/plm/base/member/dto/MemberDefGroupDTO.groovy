package cn.ibizlab.plm.base.member.dto

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
class MemberDefGroupDTO extends GroovyDTO<MemberDefGroupDTO> {

    /**
     * 「登录名」
     */
    @JsonProperty("user_id")
    String userId

    /**
     * 设置「登录名」值
     * @param val
     */
    MemberDefGroupDTO setUserId(String userId) {
        this.userId = userId
        return this
    }

}
