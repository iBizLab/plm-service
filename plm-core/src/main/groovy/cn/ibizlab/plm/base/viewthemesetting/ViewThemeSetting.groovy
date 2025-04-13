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
 * 该实体存在实体映射，开启RTCode模式会导致映射功能失效
 */
class ViewThemeSetting extends GroovyDataEntityRuntime<ViewThemeSetting,ViewThemeSettingDTO,ViewThemeSettingFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_FILL_SEARCH_CONDS = "fill_search_conds"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_USER_ALL = "CUR_USER_ALL"
    public static final String DATASET_CUR_USER_ALL2 = "CUR_USER_ALL2"
    public static final String DATASET_MY_VIEW_THEME_SETTING = "my_view_theme_setting"
    public static final String DATASET_PSMODEL_SYNC = "PSMODEL_SYNC"
    private static ViewThemeSetting _instance;
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
    def create(ViewThemeSettingDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    def update(ViewThemeSettingDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE, dto)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    //@DEAction(ACTION_REMOVE)
    def remove(List<String> keys) throws Throwable {
        this.execute(ACTION_REMOVE, keys)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    //@DEAction(ACTION_GET)
    def get(String key) throws Throwable {
        return this.execute(ACTION_GET, key)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    def getDraft(ViewThemeSettingDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    def checkKey(ViewThemeSettingDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    def save(ViewThemeSettingDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：获取过滤条件 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_FILL_SEARCH_CONDS)
    def fillSearchConds(ViewThemeSettingDTO dto) throws Throwable {
        this.execute(ACTION_FILL_SEARCH_CONDS, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    def fetchDefault(ViewThemeSettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：当前用户全部（含全局） 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_CUR_USER_ALL)
    def fetchCurUserAll(ViewThemeSettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER_ALL, context)
    }

    /**
     * 数据集：当前用户全部（含全局去重） 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_CUR_USER_ALL2)
    def fetchCurUserAll2(ViewThemeSettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER_ALL2, context)
    }

    /**
     * 数据集：我的主题设置 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_MY_VIEW_THEME_SETTING)
    def fetchMyViewThemeSetting(ViewThemeSettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_VIEW_THEME_SETTING, context)
    }

    /**
     * 数据集：实体数据关系界面组（同步） 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_PSMODEL_SYNC)
    def fetchPsmodelSync(ViewThemeSettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PSMODEL_SYNC, context)
    }

}