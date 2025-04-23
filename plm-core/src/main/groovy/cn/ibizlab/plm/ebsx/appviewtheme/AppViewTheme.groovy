package cn.ibizlab.plm.ebsx.appviewtheme

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ebsx.appviewtheme.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[APP_VIEW_THEME]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AppViewTheme extends GroovyDataEntityRuntime<AppViewTheme,AppViewThemeDTO,AppViewThemeFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_SYSTEM = "CUR_SYSTEM"
    public static final String DATASET_CUR_SYSTEM_ALL = "CUR_SYSTEM_ALL"
    public static final String DATASET_CUR_USER = "CUR_USER"
    public static final String DATASET_CUR_USER_ALL = "CUR_USER_ALL"
    public static final String DATASET_PSMODEL_SYNC = "PSMODEL_SYNC"
    private static AppViewTheme _instance
    void setInstance(AppViewTheme instance) {
        _instance = instance
    }
    static AppViewTheme getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AppViewThemeDTO create(AppViewThemeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AppViewThemeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AppViewThemeDTO update(AppViewThemeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AppViewThemeDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    AppViewThemeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AppViewThemeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AppViewThemeDTO getDraft(AppViewThemeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AppViewThemeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AppViewThemeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AppViewThemeDTO save(AppViewThemeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AppViewThemeDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AppViewThemeDTO> fetchDefault(AppViewThemeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AppViewThemeDTO.class)
    }

    /**
     * 数据集：当前系统（全局） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_SYSTEM)
    Page<AppViewThemeDTO> fetchCurSystem(AppViewThemeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_SYSTEM, context, AppViewThemeDTO.class)
    }

    /**
     * 数据集：当前系统全部（含用户） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_SYSTEM_ALL)
    Page<AppViewThemeDTO> fetchCurSystemAll(AppViewThemeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_SYSTEM_ALL, context, AppViewThemeDTO.class)
    }

    /**
     * 数据集：当前用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_USER)
    Page<AppViewThemeDTO> fetchCurUser(AppViewThemeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER, context, AppViewThemeDTO.class)
    }

    /**
     * 数据集：当前用户全部（含全局） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_USER_ALL)
    Page<AppViewThemeDTO> fetchCurUserAll(AppViewThemeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER_ALL, context, AppViewThemeDTO.class)
    }

    /**
     * 数据集：实体数据关系界面组（同步） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PSMODEL_SYNC)
    Page<AppViewThemeDTO> fetchPsmodelSync(AppViewThemeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PSMODEL_SYNC, context, AppViewThemeDTO.class)
    }

}