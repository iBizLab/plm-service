package cn.ibizlab.plm.base.viewthemesetting

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.viewthemesetting.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[VIEW_THEME_SETTING]运行时对象
 * 此代码用户功能扩展代码
 *
 * 该实体存在实体映射或者自定义动态扩展对象，开启RTCode模式会导致映射功能失效
 */
class ViewThemeSetting extends GroovyDynaDataEntityRuntime<ViewThemeSetting,ViewThemeSettingDTO,ViewThemeSettingFilterDTO> {

    public static final String ACTION_FILL_SEARCH_CONDS = "fill_search_conds"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_USER_ALL = "CUR_USER_ALL"
    public static final String DATASET_CUR_USER_ALL2 = "CUR_USER_ALL2"
    public static final String DATASET_MY_VIEW_THEME_SETTING = "my_view_theme_setting"
    public static final String DATASET_PSMODEL_SYNC = "PSMODEL_SYNC"
    private static ViewThemeSetting _instance
    void setInstance(ViewThemeSetting instance) {
        _instance = instance
    }
    static ViewThemeSetting getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CREATE)
    ViewThemeSettingDTO create(ViewThemeSettingDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ViewThemeSettingDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    ViewThemeSettingDTO update(ViewThemeSettingDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ViewThemeSettingDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    //@DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    //@DEAction(ACTION_GET)
    ViewThemeSettingDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ViewThemeSettingDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    ViewThemeSettingDTO getDraft(ViewThemeSettingDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ViewThemeSettingDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    int checkKey(ViewThemeSettingDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    ViewThemeSettingDTO save(ViewThemeSettingDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ViewThemeSettingDTO.class)
    }

    /**
     * 行为：获取过滤条件 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_FILL_SEARCH_CONDS)
    def fillSearchConds(ViewThemeSettingDTO dto) throws Throwable {
        this.execute(ACTION_FILL_SEARCH_CONDS, dto, ViewThemeSettingDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    Page<ViewThemeSettingDTO> fetchDefault(ViewThemeSettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ViewThemeSettingDTO.class)
    }

    /**
     * 数据集：当前用户全部（含全局） 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_CUR_USER_ALL)
    Page<ViewThemeSettingDTO> fetchCurUserAll(ViewThemeSettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER_ALL, context, ViewThemeSettingDTO.class)
    }

    /**
     * 数据集：当前用户全部（含全局去重） 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_CUR_USER_ALL2)
    Page<ViewThemeSettingDTO> fetchCurUserAll2(ViewThemeSettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER_ALL2, context, ViewThemeSettingDTO.class)
    }

    /**
     * 数据集：我的主题设置 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_MY_VIEW_THEME_SETTING)
    Page<ViewThemeSettingDTO> fetchMyViewThemeSetting(ViewThemeSettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_VIEW_THEME_SETTING, context, ViewThemeSettingDTO.class)
    }

    /**
     * 数据集：实体数据关系界面组（同步） 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_PSMODEL_SYNC)
    Page<ViewThemeSettingDTO> fetchPsmodelSync(ViewThemeSettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PSMODEL_SYNC, context, ViewThemeSettingDTO.class)
    }

}