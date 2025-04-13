package cn.ibizlab.plm.base.dynadashboard.dto

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
class DynaDashboardExampleChartDTO extends GroovyDTO<DynaDashboardExampleChartDTO> {

    /**
     * 「是否系统类型」
     * 字典[是否]
     */
    @JsonProperty("is_system")
    Integer isSystem
    /**
     * 「示例图」
     */
    @JsonProperty("example_chart")
    String exampleChart
    /**
     * 「应用标识」
     */
    @JsonProperty("app_id")
    String appId
    /**
     * 「描述」
     */
    @JsonProperty("desc")
    String desc
    /**
     * 「动态数据看板标识」
     */
    @JsonProperty("dyna_dashboard_id")
    String dynaDashboardId
    /**
     * 「看板类型」
     * 字典[动态看板类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「模型标识」
     */
    @JsonProperty("model_id")
    String modelId
    /**
     * 「序号」
     */
    @JsonProperty("sequences")
    BigDecimal sequences
    /**
     * 「名称」
     */
    @JsonProperty("dyna_dashboard_name")
    String dynaDashboardName

    /**
     * 设置「是否系统类型」值
     * 字典[是否]
     * @param val
     */
    DynaDashboardExampleChartDTO setIsSystem(Integer isSystem) {
        this.isSystem = isSystem
        return this
    }


    /**
     * 设置「示例图」值
     * @param val
     */
    DynaDashboardExampleChartDTO setExampleChart(String exampleChart) {
        this.exampleChart = exampleChart
        return this
    }


    /**
     * 设置「应用标识」值
     * @param val
     */
    DynaDashboardExampleChartDTO setAppId(String appId) {
        this.appId = appId
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    DynaDashboardExampleChartDTO setDesc(String desc) {
        this.desc = desc
        return this
    }


    /**
     * 设置「动态数据看板标识」值
     * @param val
     */
    DynaDashboardExampleChartDTO setDynaDashboardId(String dynaDashboardId) {
        this.dynaDashboardId = dynaDashboardId
        return this
    }


    /**
     * 设置「看板类型」值
     * 字典[动态看板类型]
     * @param val
     */
    DynaDashboardExampleChartDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「模型标识」值
     * @param val
     */
    DynaDashboardExampleChartDTO setModelId(String modelId) {
        this.modelId = modelId
        return this
    }


    /**
     * 设置「序号」值
     * @param val
     */
    DynaDashboardExampleChartDTO setSequences(BigDecimal sequences) {
        this.sequences = sequences
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    DynaDashboardExampleChartDTO setDynaDashboardName(String dynaDashboardName) {
        this.dynaDashboardName = dynaDashboardName
        return this
    }

}
