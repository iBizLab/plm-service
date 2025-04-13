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
class DynaDashboardDTO extends GroovyDTO<DynaDashboardDTO> {

    /**
     * 「是否系统类型」
     * 字典[是否]
     */
    @JsonProperty("is_system")
    Integer isSystem
    /**
     * 「看板类型」
     * 字典[动态看板类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「所属数据类型」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「所属数据标识」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「描述」
     */
    @JsonProperty("desc")
    String desc
    /**
     * 「示例图」
     */
    @JsonProperty("example_chart")
    String exampleChart
    /**
     * 「序号」
     */
    @JsonProperty("sequences")
    BigDecimal sequences
    /**
     * 「应用标识」
     */
    @JsonProperty("app_id")
    String appId
    /**
     * 「建立时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「动态数据看板标识」
     */
    @JsonProperty("dyna_dashboard_id")
    String dynaDashboardId
    /**
     * 「名称」
     */
    @JsonProperty("dyna_dashboard_name")
    String dynaDashboardName
    /**
     * 「模型」
     */
    @JsonProperty("model")
    String model
    /**
     * 「模型标识」
     */
    @JsonProperty("model_id")
    String modelId
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
     * 「用户标识」
     */
    @JsonProperty("user_id")
    String userId

    /**
     * 设置「是否系统类型」值
     * 字典[是否]
     * @param val
     */
    DynaDashboardDTO setIsSystem(Integer isSystem) {
        this.isSystem = isSystem
        return this
    }


    /**
     * 设置「看板类型」值
     * 字典[动态看板类型]
     * @param val
     */
    DynaDashboardDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「所属数据类型」值
     * @param val
     */
    DynaDashboardDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所属数据标识」值
     * @param val
     */
    DynaDashboardDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    DynaDashboardDTO setDesc(String desc) {
        this.desc = desc
        return this
    }


    /**
     * 设置「示例图」值
     * @param val
     */
    DynaDashboardDTO setExampleChart(String exampleChart) {
        this.exampleChart = exampleChart
        return this
    }


    /**
     * 设置「序号」值
     * @param val
     */
    DynaDashboardDTO setSequences(BigDecimal sequences) {
        this.sequences = sequences
        return this
    }


    /**
     * 设置「应用标识」值
     * @param val
     */
    DynaDashboardDTO setAppId(String appId) {
        this.appId = appId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    DynaDashboardDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    DynaDashboardDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「动态数据看板标识」值
     * @param val
     */
    DynaDashboardDTO setDynaDashboardId(String dynaDashboardId) {
        this.dynaDashboardId = dynaDashboardId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    DynaDashboardDTO setDynaDashboardName(String dynaDashboardName) {
        this.dynaDashboardName = dynaDashboardName
        return this
    }


    /**
     * 设置「模型」值
     * @param val
     */
    DynaDashboardDTO setModel(String model) {
        this.model = model
        return this
    }


    /**
     * 设置「模型标识」值
     * @param val
     */
    DynaDashboardDTO setModelId(String modelId) {
        this.modelId = modelId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    DynaDashboardDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DynaDashboardDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「用户标识」值
     * @param val
     */
    DynaDashboardDTO setUserId(String userId) {
        this.userId = userId
        return this
    }

}
