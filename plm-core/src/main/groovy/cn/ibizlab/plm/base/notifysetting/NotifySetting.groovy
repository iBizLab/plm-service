package cn.ibizlab.plm.base.notifysetting

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.notifysetting.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[NOTIFY_SETTING]运行时对象
 * 此代码用户功能扩展代码
 *
 * 该实体存在实体映射，开启RTCode模式会导致映射功能失效
 */
class NotifySetting extends GroovyDataEntityRuntime<NotifySetting,NotifySettingDTO,NotifySettingFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_GET_BY_USER = "get_by_user"
    public static final String ACTION_SAVE_SETTING = "save_setting"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_USER = "CUR_USER"
    private static NotifySetting _instance;
    void setInstance(NotifySetting instance) {
        _instance = instance
    }
    static NotifySetting getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CREATE)
    def create(NotifySettingDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    def update(NotifySettingDTO dto) throws Throwable {
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
    def getDraft(NotifySettingDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    def checkKey(NotifySettingDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    def save(NotifySettingDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：获取用户设置 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GET_BY_USER)
    def getByUser(NotifySettingDTO dto) throws Throwable {
        return this.execute(ACTION_GET_BY_USER, dto)
    }

    /**
     * 行为：保存配置 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE_SETTING)
    def saveSetting(NotifySettingDTO dto) throws Throwable {
        this.execute(ACTION_SAVE_SETTING, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    def fetchDefault(NotifySettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：当前用户 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_CUR_USER)
    def fetchCurUser(NotifySettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER, context)
    }

}