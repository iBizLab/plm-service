package cn.ibizlab.plm.ai.aikbchunkingstrategy.dto

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
class AiKbChunkingStrategyRedactionRuleDTO extends GroovyDTO<AiKbChunkingStrategyRedactionRuleDTO> {

    /**
     * 「null」
     */
    @JsonProperty("pattern")
    Object pattern
    /**
     * 「null」
     */
    @JsonProperty("replacement")
    Object replacement

    /**
     * 设置「null」值
     * @param val
     */
    AiKbChunkingStrategyRedactionRuleDTO setPattern(Object pattern) {
        this.pattern = pattern
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    AiKbChunkingStrategyRedactionRuleDTO setReplacement(Object replacement) {
        this.replacement = replacement
        return this
    }

}
