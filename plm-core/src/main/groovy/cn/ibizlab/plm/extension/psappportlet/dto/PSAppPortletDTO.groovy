package cn.ibizlab.plm.extension.psappportlet.dto

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
class PSAppPortletDTO extends GroovyDTO<PSAppPortletDTO> {

    /**
     * 「扩展模型」
     * 字典[是否]
     */
    @JsonProperty("dynamodelflag")
    Integer dynaModelFlag
    /**
     * 「代码名称」
     */
    @JsonProperty("codename")
    String codeName
    /**
     * 「备注」
     */
    @JsonProperty("memo")
    String memo
    /**
     * 「应用门户部件标识」
     */
    @JsonProperty("psappportletid")
    String pSAppPortletId
    /**
     * 「应用门户部件名称」
     */
    @JsonProperty("psappportletname")
    String pSAppPortletName
    /**
     * 「实体图表」
     */
    @JsonProperty("psdechartid")
    String pSDEChartId
    /**
     * 「实体图表」
     */
    @JsonProperty("psdechartname")
    String pSDEChartName
    /**
     * 「实体数据视图」
     */
    @JsonProperty("psdedataviewid")
    String pSDEDataViewId
    /**
     * 「实体数据视图」
     */
    @JsonProperty("psdedataviewname")
    String pSDEDataViewName
    /**
     * 「实体表单」
     */
    @JsonProperty("psdeformid")
    String pSDEFormId
    /**
     * 「实体表单」
     */
    @JsonProperty("psdeformname")
    String pSDEFormName
    /**
     * 「实体」
     */
    @JsonProperty("psdeid")
    String pSDEId
    /**
     * 「实体列表」
     */
    @JsonProperty("psdelistid")
    String pSDEListId
    /**
     * 「实体列表」
     */
    @JsonProperty("psdelistname")
    String pSDEListName
    /**
     * 「实体」
     */
    @JsonProperty("psdename")
    String pSDEName
    /**
     * 「实体报表」
     */
    @JsonProperty("psdereportid")
    String pSDEReportId
    /**
     * 「实体报表」
     */
    @JsonProperty("psdereportname")
    String pSDEReportName
    /**
     * 「工具栏」
     */
    @JsonProperty("psdetoolbarid")
    String pSDEToolbarId
    /**
     * 「工具栏」
     */
    @JsonProperty("psdetoolbarname")
    String pSDEToolbarName
    /**
     * 「界面行为组」
     */
    @JsonProperty("psdeuagroupid")
    String pSDEUAGroupId
    /**
     * 「界面行为组」
     */
    @JsonProperty("psdeuagroupname")
    String pSDEUAGroupName
    /**
     * 「系统视图」
     */
    @JsonProperty("psdeviewid")
    String pSDEViewId
    /**
     * 「系统视图」
     */
    @JsonProperty("psdeviewname")
    String pSDEViewName
    /**
     * 「系统应用」
     */
    @JsonProperty("pssysappid")
    String pSSysAppId
    /**
     * 「系统应用」
     */
    @JsonProperty("pssysappname")
    String pSSysAppName
    /**
     * 「日历部件」
     */
    @JsonProperty("pssyscalendarid")
    String pSSysCalendarId
    /**
     * 「日历部件」
     */
    @JsonProperty("pssyscalendarname")
    String pSSysCalendarName
    /**
     * 「地图部件」
     */
    @JsonProperty("pssysmapviewid")
    String pSSysMapViewId
    /**
     * 「地图部件」
     */
    @JsonProperty("pssysmapviewname")
    String pSSysMapViewName
    /**
     * 「部件分类」
     */
    @JsonProperty("pssysportletcatid")
    String pSSysPortletCatId
    /**
     * 「部件分类」
     */
    @JsonProperty("pssysportletcatname")
    String pSSysPortletCatName
    /**
     * 「看板部件类型」
     * 字典[云平台门户部件类型]
     */
    @JsonProperty("portlettype")
    String portletType
    /**
     * 「显示标题栏」
     * 字典[是否]
     */
    @JsonProperty("showtitlebar")
    Integer showTitleBar
    /**
     * 「是否启用」
     * 字典[是否]
     */
    @JsonProperty("validflag")
    Integer validFlag

    /**
     * 设置「扩展模型」值
     * 字典[是否]
     * @param val
     */
    PSAppPortletDTO setDynaModelFlag(Integer dynaModelFlag) {
        this.dynaModelFlag = dynaModelFlag
        return this
    }


    /**
     * 设置「代码名称」值
     * @param val
     */
    PSAppPortletDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    PSAppPortletDTO setMemo(String memo) {
        this.memo = memo
        return this
    }


    /**
     * 设置「应用门户部件标识」值
     * @param val
     */
    PSAppPortletDTO setPSAppPortletId(String pSAppPortletId) {
        this.pSAppPortletId = pSAppPortletId
        return this
    }


    /**
     * 设置「应用门户部件名称」值
     * @param val
     */
    PSAppPortletDTO setPSAppPortletName(String pSAppPortletName) {
        this.pSAppPortletName = pSAppPortletName
        return this
    }


    /**
     * 设置「实体图表」值
     * @param val
     */
    PSAppPortletDTO setPSDEChartId(String pSDEChartId) {
        this.pSDEChartId = pSDEChartId
        return this
    }


    /**
     * 设置「实体图表」值
     * @param val
     */
    PSAppPortletDTO setPSDEChartName(String pSDEChartName) {
        this.pSDEChartName = pSDEChartName
        return this
    }


    /**
     * 设置「实体数据视图」值
     * @param val
     */
    PSAppPortletDTO setPSDEDataViewId(String pSDEDataViewId) {
        this.pSDEDataViewId = pSDEDataViewId
        return this
    }


    /**
     * 设置「实体数据视图」值
     * @param val
     */
    PSAppPortletDTO setPSDEDataViewName(String pSDEDataViewName) {
        this.pSDEDataViewName = pSDEDataViewName
        return this
    }


    /**
     * 设置「实体表单」值
     * @param val
     */
    PSAppPortletDTO setPSDEFormId(String pSDEFormId) {
        this.pSDEFormId = pSDEFormId
        return this
    }


    /**
     * 设置「实体表单」值
     * @param val
     */
    PSAppPortletDTO setPSDEFormName(String pSDEFormName) {
        this.pSDEFormName = pSDEFormName
        return this
    }


    /**
     * 设置「实体」值
     * @param val
     */
    PSAppPortletDTO setPSDEId(String pSDEId) {
        this.pSDEId = pSDEId
        return this
    }


    /**
     * 设置「实体列表」值
     * @param val
     */
    PSAppPortletDTO setPSDEListId(String pSDEListId) {
        this.pSDEListId = pSDEListId
        return this
    }


    /**
     * 设置「实体列表」值
     * @param val
     */
    PSAppPortletDTO setPSDEListName(String pSDEListName) {
        this.pSDEListName = pSDEListName
        return this
    }


    /**
     * 设置「实体」值
     * @param val
     */
    PSAppPortletDTO setPSDEName(String pSDEName) {
        this.pSDEName = pSDEName
        return this
    }


    /**
     * 设置「实体报表」值
     * @param val
     */
    PSAppPortletDTO setPSDEReportId(String pSDEReportId) {
        this.pSDEReportId = pSDEReportId
        return this
    }


    /**
     * 设置「实体报表」值
     * @param val
     */
    PSAppPortletDTO setPSDEReportName(String pSDEReportName) {
        this.pSDEReportName = pSDEReportName
        return this
    }


    /**
     * 设置「工具栏」值
     * @param val
     */
    PSAppPortletDTO setPSDEToolbarId(String pSDEToolbarId) {
        this.pSDEToolbarId = pSDEToolbarId
        return this
    }


    /**
     * 设置「工具栏」值
     * @param val
     */
    PSAppPortletDTO setPSDEToolbarName(String pSDEToolbarName) {
        this.pSDEToolbarName = pSDEToolbarName
        return this
    }


    /**
     * 设置「界面行为组」值
     * @param val
     */
    PSAppPortletDTO setPSDEUAGroupId(String pSDEUAGroupId) {
        this.pSDEUAGroupId = pSDEUAGroupId
        return this
    }


    /**
     * 设置「界面行为组」值
     * @param val
     */
    PSAppPortletDTO setPSDEUAGroupName(String pSDEUAGroupName) {
        this.pSDEUAGroupName = pSDEUAGroupName
        return this
    }


    /**
     * 设置「系统视图」值
     * @param val
     */
    PSAppPortletDTO setPSDEViewId(String pSDEViewId) {
        this.pSDEViewId = pSDEViewId
        return this
    }


    /**
     * 设置「系统视图」值
     * @param val
     */
    PSAppPortletDTO setPSDEViewName(String pSDEViewName) {
        this.pSDEViewName = pSDEViewName
        return this
    }


    /**
     * 设置「系统应用」值
     * @param val
     */
    PSAppPortletDTO setPSSysAppId(String pSSysAppId) {
        this.pSSysAppId = pSSysAppId
        return this
    }


    /**
     * 设置「系统应用」值
     * @param val
     */
    PSAppPortletDTO setPSSysAppName(String pSSysAppName) {
        this.pSSysAppName = pSSysAppName
        return this
    }


    /**
     * 设置「日历部件」值
     * @param val
     */
    PSAppPortletDTO setPSSysCalendarId(String pSSysCalendarId) {
        this.pSSysCalendarId = pSSysCalendarId
        return this
    }


    /**
     * 设置「日历部件」值
     * @param val
     */
    PSAppPortletDTO setPSSysCalendarName(String pSSysCalendarName) {
        this.pSSysCalendarName = pSSysCalendarName
        return this
    }


    /**
     * 设置「地图部件」值
     * @param val
     */
    PSAppPortletDTO setPSSysMapViewId(String pSSysMapViewId) {
        this.pSSysMapViewId = pSSysMapViewId
        return this
    }


    /**
     * 设置「地图部件」值
     * @param val
     */
    PSAppPortletDTO setPSSysMapViewName(String pSSysMapViewName) {
        this.pSSysMapViewName = pSSysMapViewName
        return this
    }


    /**
     * 设置「部件分类」值
     * @param val
     */
    PSAppPortletDTO setPSSysPortletCatId(String pSSysPortletCatId) {
        this.pSSysPortletCatId = pSSysPortletCatId
        return this
    }


    /**
     * 设置「部件分类」值
     * @param val
     */
    PSAppPortletDTO setPSSysPortletCatName(String pSSysPortletCatName) {
        this.pSSysPortletCatName = pSSysPortletCatName
        return this
    }


    /**
     * 设置「看板部件类型」值
     * 字典[云平台门户部件类型]
     * @param val
     */
    PSAppPortletDTO setPortletType(String portletType) {
        this.portletType = portletType
        return this
    }


    /**
     * 设置「显示标题栏」值
     * 字典[是否]
     * @param val
     */
    PSAppPortletDTO setShowTitleBar(Integer showTitleBar) {
        this.showTitleBar = showTitleBar
        return this
    }


    /**
     * 设置「是否启用」值
     * 字典[是否]
     * @param val
     */
    PSAppPortletDTO setValidFlag(Integer validFlag) {
        this.validFlag = validFlag
        return this
    }

}
