package cn.ibizlab.plm.insight.insightreport.dto

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
class InsightReportDTO extends GroovyDTO<InsightReportDTO> {

    /**
     * 「描述」
     */
    @JsonProperty("desc")
    String desc
    /**
     * 「是否系统类型」
     * 字典[是否]
     */
    @JsonProperty("is_system")
    Integer isSystem
    /**
     * 「图表类型」
     * 字典[BI图表类型]
     */
    @JsonProperty("chart_type")
    String chartType
    /**
     * 「组别」
     * 字典[报表_数据集BI]
     */
    @JsonProperty("group")
    String group
    /**
     * 「类别」
     * 字典[类别]
     */
    @JsonProperty("categories")
    String categories
    /**
     * 「类别」
     */
    @JsonProperty("categories_name")
    String categoriesName
    /**
     * 「模板模型」
     */
    @JsonProperty("template_model")
    String templateModel
    /**
     * 「分组数据」
     */
    @JsonProperty("group_data")
    IEntity groupData
    /**
     * 「报表部件标识」
     */
    @JsonProperty("ctrl_id")
    String ctrlId
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
     * 「名称」
     */
    @JsonProperty("name")
    String name
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
     * 「视图标识」
     */
    @JsonProperty("view_id")
    String viewId
    /**
     * 「名称」
     */
    @JsonProperty("view_name")
    String viewName

    /**
     * 设置「描述」值
     * @param val
     */
    InsightReportDTO setDesc(String desc) {
        this.desc = desc
        return this
    }


    /**
     * 设置「是否系统类型」值
     * 字典[是否]
     * @param val
     */
    InsightReportDTO setIsSystem(Integer isSystem) {
        this.isSystem = isSystem
        return this
    }


    /**
     * 设置「图表类型」值
     * 字典[BI图表类型]
     * @param val
     */
    InsightReportDTO setChartType(String chartType) {
        this.chartType = chartType
        return this
    }


    /**
     * 设置「组别」值
     * 字典[报表_数据集BI]
     * @param val
     */
    InsightReportDTO setGroup(String group) {
        this.group = group
        return this
    }


    /**
     * 设置「类别」值
     * 字典[类别]
     * @param val
     */
    InsightReportDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    InsightReportDTO setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName
        return this
    }


    /**
     * 设置「模板模型」值
     * @param val
     */
    InsightReportDTO setTemplateModel(String templateModel) {
        this.templateModel = templateModel
        return this
    }


    /**
     * 设置「分组数据」值
     * @param val
     */
    InsightReportDTO setGroupData(IEntity groupData) {
        this.groupData = groupData
        return this
    }


    /**
     * 设置「报表部件标识」值
     * @param val
     */
    InsightReportDTO setCtrlId(String ctrlId) {
        this.ctrlId = ctrlId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    InsightReportDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    InsightReportDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    InsightReportDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    InsightReportDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    InsightReportDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    InsightReportDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「视图标识」值
     * @param val
     */
    InsightReportDTO setViewId(String viewId) {
        this.viewId = viewId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    InsightReportDTO setViewName(String viewName) {
        this.viewName = viewName
        return this
    }

}
