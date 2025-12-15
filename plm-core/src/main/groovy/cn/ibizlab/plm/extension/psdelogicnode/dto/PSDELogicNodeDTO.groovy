package cn.ibizlab.plm.extension.psdelogicnode.dto

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
class PSDELogicNodeDTO extends GroovyDTO<PSDELogicNodeDTO> {

    /**
     * 「工作项类型」
     */
    @JsonProperty("work_item_type_id")
    String workItemTypeId
    /**
     * 「工作项类型」
     */
    @JsonProperty("work_item_type_name")
    String workItemTypeName
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「内容」
     */
    @JsonProperty("content")
    String content
    /**
     * 「排序属性」
     */
    @JsonProperty("ordervalue")
    Integer orderValue
    /**
     * 「智能体标识」
     */
    @JsonProperty("aiagenttag")
    String aiagenttag
    /**
     * 「代码名称」
     */
    @JsonProperty("codename")
    String codeName
    /**
     * 「操作参数」
     */
    @JsonProperty("dstpsdlparamid")
    String dstPSDLParamId
    /**
     * 「操作参数」
     */
    @JsonProperty("dstpsdlparamname")
    String dstPSDLParamName
    /**
     * 「输入流参数」
     */
    @JsonProperty("ispsdlparamid")
    String iSPSDLParamId
    /**
     * 「输入流参数」
     */
    @JsonProperty("ispsdlparamname")
    String iSPSDLParamName
    /**
     * 「逻辑节点子类型」
     */
    @JsonProperty("logicnodesubtype")
    String logicNodeSubType
    /**
     * 「逻辑节点类型」
     * 字典[实体逻辑处理节点类型(设计)3]
     */
    @JsonProperty("logicnodetype")
    String logicNodeType
    /**
     * 「输出流参数」
     */
    @JsonProperty("ospsdlparamid")
    String oSPSDLParamId
    /**
     * 「输出流参数」
     */
    @JsonProperty("ospsdlparamname")
    String oSPSDLParamName
    /**
     * 「实体处理逻辑」
     */
    @JsonProperty("psdelogicid")
    String pSDELogicId
    /**
     * 「实体处理逻辑」
     */
    @JsonProperty("psdelogicname")
    String pSDELogicName
    /**
     * 「实体处理逻辑节点标识」
     */
    @JsonProperty("psdelogicnodeid")
    String pSDELogicNodeId
    /**
     * 「逻辑处理名称」
     */
    @JsonProperty("psdelogicnodename")
    String pSDELogicNodeName
    /**
     * 「系统AI交谈代理标识」
     */
    @JsonProperty("pssysaichatagentid")
    String pSSysAIChatAgentId
    /**
     * 「系统AI交谈代理名称」
     */
    @JsonProperty("pssysaichatagentname")
    String pSSysAIChatAgentName
    /**
     * 「系统AI工厂标识」
     */
    @JsonProperty("pssysaifactoryid")
    String pSSysAIFactoryId
    /**
     * 「系统AI工厂」
     */
    @JsonProperty("pssysaifactoryname")
    String pSSysAIFactoryName
    /**
     * 「消息模板」
     */
    @JsonProperty("pssysmsgtemplid")
    String pSSysMsgTemplId
    /**
     * 「消息模板」
     */
    @JsonProperty("pssysmsgtemplname")
    String pSSysMsgTemplName
    /**
     * 「循环后续处理」
     * 字典[是否]
     */
    @JsonProperty("paralleloutput")
    Integer parallelOutput
    /**
     * 「参数1」
     */
    @JsonProperty("param1")
    String param1
    /**
     * 「参数10」
     * 字典[是否]
     */
    @JsonProperty("param10")
    Integer param10
    /**
     * 「参数11」
     */
    @JsonProperty("param11")
    String param11
    /**
     * 「参数12」
     */
    @JsonProperty("param12")
    String param12
    /**
     * 「参数13」
     */
    @JsonProperty("param13")
    String param13
    /**
     * 「参数4」
     */
    @JsonProperty("param4")
    String param4
    /**
     * 「参数7」
     */
    @JsonProperty("param7")
    Integer param7
    /**
     * 「参数8」
     */
    @JsonProperty("param8")
    Integer param8
    /**
     * 「参数9」
     * 字典[是否]
     */
    @JsonProperty("param9")
    Integer param9
    /**
     * 「返回绑定参数」
     */
    @JsonProperty("retpsdlparamid")
    String retPSDLParamId
    /**
     * 「返回绑定参数」
     */
    @JsonProperty("retpsdlparamname")
    String retPSDLParamName
    /**
     * 「源参数」
     */
    @JsonProperty("srcpsdlparamid")
    String srcPSDLParamId
    /**
     * 「源参数」
     */
    @JsonProperty("srcpsdlparamname")
    String srcPSDLParamName
    /**
     * 「项目标识」
     */
    @JsonProperty("project_id")
    String projectId
    /**
     * 「项目名称」
     */
    @JsonProperty("project_name")
    String projectName

    /**
     * 设置「工作项类型」值
     * @param val
     */
    PSDELogicNodeDTO setWorkItemTypeId(String workItemTypeId) {
        this.workItemTypeId = workItemTypeId
        return this
    }


    /**
     * 设置「工作项类型」值
     * @param val
     */
    PSDELogicNodeDTO setWorkItemTypeName(String workItemTypeName) {
        this.workItemTypeName = workItemTypeName
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    PSDELogicNodeDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「内容」值
     * @param val
     */
    PSDELogicNodeDTO setContent(String content) {
        this.content = content
        return this
    }


    /**
     * 设置「排序属性」值
     * @param val
     */
    PSDELogicNodeDTO setOrderValue(Integer orderValue) {
        this.orderValue = orderValue
        return this
    }


    /**
     * 设置「智能体标识」值
     * @param val
     */
    PSDELogicNodeDTO setAiagenttag(String aiagenttag) {
        this.aiagenttag = aiagenttag
        return this
    }


    /**
     * 设置「代码名称」值
     * @param val
     */
    PSDELogicNodeDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }


    /**
     * 设置「操作参数」值
     * @param val
     */
    PSDELogicNodeDTO setDstPSDLParamId(String dstPSDLParamId) {
        this.dstPSDLParamId = dstPSDLParamId
        return this
    }


    /**
     * 设置「操作参数」值
     * @param val
     */
    PSDELogicNodeDTO setDstPSDLParamName(String dstPSDLParamName) {
        this.dstPSDLParamName = dstPSDLParamName
        return this
    }


    /**
     * 设置「输入流参数」值
     * @param val
     */
    PSDELogicNodeDTO setISPSDLParamId(String iSPSDLParamId) {
        this.iSPSDLParamId = iSPSDLParamId
        return this
    }


    /**
     * 设置「输入流参数」值
     * @param val
     */
    PSDELogicNodeDTO setISPSDLParamName(String iSPSDLParamName) {
        this.iSPSDLParamName = iSPSDLParamName
        return this
    }


    /**
     * 设置「逻辑节点子类型」值
     * @param val
     */
    PSDELogicNodeDTO setLogicNodeSubType(String logicNodeSubType) {
        this.logicNodeSubType = logicNodeSubType
        return this
    }


    /**
     * 设置「逻辑节点类型」值
     * 字典[实体逻辑处理节点类型(设计)3]
     * @param val
     */
    PSDELogicNodeDTO setLogicNodeType(String logicNodeType) {
        this.logicNodeType = logicNodeType
        return this
    }


    /**
     * 设置「输出流参数」值
     * @param val
     */
    PSDELogicNodeDTO setOSPSDLParamId(String oSPSDLParamId) {
        this.oSPSDLParamId = oSPSDLParamId
        return this
    }


    /**
     * 设置「输出流参数」值
     * @param val
     */
    PSDELogicNodeDTO setOSPSDLParamName(String oSPSDLParamName) {
        this.oSPSDLParamName = oSPSDLParamName
        return this
    }


    /**
     * 设置「实体处理逻辑」值
     * @param val
     */
    PSDELogicNodeDTO setPSDELogicId(String pSDELogicId) {
        this.pSDELogicId = pSDELogicId
        return this
    }


    /**
     * 设置「实体处理逻辑」值
     * @param val
     */
    PSDELogicNodeDTO setPSDELogicName(String pSDELogicName) {
        this.pSDELogicName = pSDELogicName
        return this
    }


    /**
     * 设置「实体处理逻辑节点标识」值
     * @param val
     */
    PSDELogicNodeDTO setPSDELogicNodeId(String pSDELogicNodeId) {
        this.pSDELogicNodeId = pSDELogicNodeId
        return this
    }


    /**
     * 设置「逻辑处理名称」值
     * @param val
     */
    PSDELogicNodeDTO setPSDELogicNodeName(String pSDELogicNodeName) {
        this.pSDELogicNodeName = pSDELogicNodeName
        return this
    }


    /**
     * 设置「系统AI交谈代理标识」值
     * @param val
     */
    PSDELogicNodeDTO setPSSysAIChatAgentId(String pSSysAIChatAgentId) {
        this.pSSysAIChatAgentId = pSSysAIChatAgentId
        return this
    }


    /**
     * 设置「系统AI交谈代理名称」值
     * @param val
     */
    PSDELogicNodeDTO setPSSysAIChatAgentName(String pSSysAIChatAgentName) {
        this.pSSysAIChatAgentName = pSSysAIChatAgentName
        return this
    }


    /**
     * 设置「系统AI工厂标识」值
     * @param val
     */
    PSDELogicNodeDTO setPSSysAIFactoryId(String pSSysAIFactoryId) {
        this.pSSysAIFactoryId = pSSysAIFactoryId
        return this
    }


    /**
     * 设置「系统AI工厂」值
     * @param val
     */
    PSDELogicNodeDTO setPSSysAIFactoryName(String pSSysAIFactoryName) {
        this.pSSysAIFactoryName = pSSysAIFactoryName
        return this
    }


    /**
     * 设置「消息模板」值
     * @param val
     */
    PSDELogicNodeDTO setPSSysMsgTemplId(String pSSysMsgTemplId) {
        this.pSSysMsgTemplId = pSSysMsgTemplId
        return this
    }


    /**
     * 设置「消息模板」值
     * @param val
     */
    PSDELogicNodeDTO setPSSysMsgTemplName(String pSSysMsgTemplName) {
        this.pSSysMsgTemplName = pSSysMsgTemplName
        return this
    }


    /**
     * 设置「循环后续处理」值
     * 字典[是否]
     * @param val
     */
    PSDELogicNodeDTO setParallelOutput(Integer parallelOutput) {
        this.parallelOutput = parallelOutput
        return this
    }


    /**
     * 设置「参数1」值
     * @param val
     */
    PSDELogicNodeDTO setParam1(String param1) {
        this.param1 = param1
        return this
    }


    /**
     * 设置「参数10」值
     * 字典[是否]
     * @param val
     */
    PSDELogicNodeDTO setParam10(Integer param10) {
        this.param10 = param10
        return this
    }


    /**
     * 设置「参数11」值
     * @param val
     */
    PSDELogicNodeDTO setParam11(String param11) {
        this.param11 = param11
        return this
    }


    /**
     * 设置「参数12」值
     * @param val
     */
    PSDELogicNodeDTO setParam12(String param12) {
        this.param12 = param12
        return this
    }


    /**
     * 设置「参数13」值
     * @param val
     */
    PSDELogicNodeDTO setParam13(String param13) {
        this.param13 = param13
        return this
    }


    /**
     * 设置「参数4」值
     * @param val
     */
    PSDELogicNodeDTO setParam4(String param4) {
        this.param4 = param4
        return this
    }


    /**
     * 设置「参数7」值
     * @param val
     */
    PSDELogicNodeDTO setParam7(Integer param7) {
        this.param7 = param7
        return this
    }


    /**
     * 设置「参数8」值
     * @param val
     */
    PSDELogicNodeDTO setParam8(Integer param8) {
        this.param8 = param8
        return this
    }


    /**
     * 设置「参数9」值
     * 字典[是否]
     * @param val
     */
    PSDELogicNodeDTO setParam9(Integer param9) {
        this.param9 = param9
        return this
    }


    /**
     * 设置「返回绑定参数」值
     * @param val
     */
    PSDELogicNodeDTO setRetPSDLParamId(String retPSDLParamId) {
        this.retPSDLParamId = retPSDLParamId
        return this
    }


    /**
     * 设置「返回绑定参数」值
     * @param val
     */
    PSDELogicNodeDTO setRetPSDLParamName(String retPSDLParamName) {
        this.retPSDLParamName = retPSDLParamName
        return this
    }


    /**
     * 设置「源参数」值
     * @param val
     */
    PSDELogicNodeDTO setSrcPSDLParamId(String srcPSDLParamId) {
        this.srcPSDLParamId = srcPSDLParamId
        return this
    }


    /**
     * 设置「源参数」值
     * @param val
     */
    PSDELogicNodeDTO setSrcPSDLParamName(String srcPSDLParamName) {
        this.srcPSDLParamName = srcPSDLParamName
        return this
    }


    /**
     * 设置「项目标识」值
     * @param val
     */
    PSDELogicNodeDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「项目名称」值
     * @param val
     */
    PSDELogicNodeDTO setProjectName(String projectName) {
        this.projectName = projectName
        return this
    }

}
