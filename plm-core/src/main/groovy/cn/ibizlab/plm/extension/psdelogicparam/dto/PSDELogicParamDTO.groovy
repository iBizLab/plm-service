package cn.ibizlab.plm.extension.psdelogicparam.dto

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
class PSDELogicParamDTO extends GroovyDTO<PSDELogicParamDTO> {

    /**
     * 「默认变量」
     * 字典[是否]
     */
    @JsonProperty("defaultparam")
    Integer defaultParam
    /**
     * 「变量类别」
     * 字典[实体逻辑变量类型]
     */
    @JsonProperty("globalparam")
    Integer globalParam
    /**
     * 「中文名称」
     */
    @JsonProperty("logicname")
    String logicName
    /**
     * 「原始数据对象」
     * 字典[是否]
     */
    @JsonProperty("originentityflag")
    Integer originEntityFlag
    /**
     * 「实体处理逻辑标识」
     */
    @JsonProperty("psdelogicid")
    String pSDELogicId
    /**
     * 「实体逻辑参数标识」
     */
    @JsonProperty("psdelogicparamid")
    String pSDELogicParamId
    /**
     * 「参数标识」
     */
    @JsonProperty("psdelogicparamname")
    String pSDELogicParamName

    /**
     * 设置「默认变量」值
     * 字典[是否]
     * @param val
     */
    PSDELogicParamDTO setDefaultParam(Integer defaultParam) {
        this.defaultParam = defaultParam
        return this
    }


    /**
     * 设置「变量类别」值
     * 字典[实体逻辑变量类型]
     * @param val
     */
    PSDELogicParamDTO setGlobalParam(Integer globalParam) {
        this.globalParam = globalParam
        return this
    }


    /**
     * 设置「中文名称」值
     * @param val
     */
    PSDELogicParamDTO setLogicName(String logicName) {
        this.logicName = logicName
        return this
    }


    /**
     * 设置「原始数据对象」值
     * 字典[是否]
     * @param val
     */
    PSDELogicParamDTO setOriginEntityFlag(Integer originEntityFlag) {
        this.originEntityFlag = originEntityFlag
        return this
    }


    /**
     * 设置「实体处理逻辑标识」值
     * @param val
     */
    PSDELogicParamDTO setPSDELogicId(String pSDELogicId) {
        this.pSDELogicId = pSDELogicId
        return this
    }


    /**
     * 设置「实体逻辑参数标识」值
     * @param val
     */
    PSDELogicParamDTO setPSDELogicParamId(String pSDELogicParamId) {
        this.pSDELogicParamId = pSDELogicParamId
        return this
    }


    /**
     * 设置「参数标识」值
     * @param val
     */
    PSDELogicParamDTO setPSDELogicParamName(String pSDELogicParamName) {
        this.pSDELogicParamName = pSDELogicParamName
        return this
    }

}
