package cn.ibizlab.plm.base.viewthemesetting.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.viewthemesetting.dto.ViewThemeSettingUsr1014979662DTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ViewThemeSettingDTO extends GroovyDTO<ViewThemeSettingDTO> {

    /**
     * 「启用标记」
     * 字典[是否]
     */
    @JsonProperty("valid_flag")
    Integer validFlag
    /**
     * 「主题模型」
     */
    @JsonProperty("theme_model")
    String themeModel
    /**
     * 「所有者类型」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「标题」
     */
    @JsonProperty("caption")
    String caption
    /**
     * 「过滤条件」
     */
    @JsonProperty("search_conds")
    List<ViewThemeSettingUsr1014979662DTO> searchConds
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
     * 「系统标记」
     */
    @JsonProperty("system_tag")
    String systemTag
    /**
     * 「应用标记」
     */
    @JsonProperty("app_tag")
    String appTag
    /**
     * 「应用视图标记」
     */
    @JsonProperty("app_view_tag")
    String appViewTag
    /**
     * 「排序值」
     */
    @JsonProperty("order_value")
    Integer orderValue

    /**
     * 设置「启用标记」值
     * 字典[是否]
     * @param val
     */
    ViewThemeSettingDTO setValidFlag(Integer validFlag) {
        this.validFlag = validFlag
        return this
    }


    /**
     * 设置「主题模型」值
     * @param val
     */
    ViewThemeSettingDTO setThemeModel(String themeModel) {
        this.themeModel = themeModel
        return this
    }


    /**
     * 设置「所有者类型」值
     * @param val
     */
    ViewThemeSettingDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    ViewThemeSettingDTO setCaption(String caption) {
        this.caption = caption
        return this
    }


    /**
     * 设置「过滤条件」值
     * @param val
     */
    ViewThemeSettingDTO setSearchConds(List<ViewThemeSettingUsr1014979662DTO> searchConds) {
        this.searchConds = searchConds
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ViewThemeSettingDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ViewThemeSettingDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ViewThemeSettingDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ViewThemeSettingDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ViewThemeSettingDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ViewThemeSettingDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「系统标记」值
     * @param val
     */
    ViewThemeSettingDTO setSystemTag(String systemTag) {
        this.systemTag = systemTag
        return this
    }


    /**
     * 设置「应用标记」值
     * @param val
     */
    ViewThemeSettingDTO setAppTag(String appTag) {
        this.appTag = appTag
        return this
    }


    /**
     * 设置「应用视图标记」值
     * @param val
     */
    ViewThemeSettingDTO setAppViewTag(String appViewTag) {
        this.appViewTag = appViewTag
        return this
    }


    /**
     * 设置「排序值」值
     * @param val
     */
    ViewThemeSettingDTO setOrderValue(Integer orderValue) {
        this.orderValue = orderValue
        return this
    }

}
