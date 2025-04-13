package cn.ibizlab.plm.extension.systemextensionnotifysetting

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.extension.systemextensionnotifysetting.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SYSTEM_EXTENSION_NOTIFY_SETTING]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SystemExtensionNotifySetting extends GroovyDataEntityRuntime<SystemExtensionNotifySetting,SystemExtensionNotifySettingDTO,SystemExtensionNotifySettingFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_VIEW = "VIEW"
    public static final String DATASET_CUR_USER = "CUR_USER"
    private static SystemExtensionNotifySetting _instance;
    void setInstance(SystemExtensionNotifySetting instance) {
        _instance = instance
    }
    static SystemExtensionNotifySetting getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(SystemExtensionNotifySettingDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(SystemExtensionNotifySettingDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE, dto)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    def remove(List<String> keys) throws Throwable {
        this.execute(ACTION_REMOVE, keys)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    def get(String key) throws Throwable {
        return this.execute(ACTION_GET, key)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    def getDraft(SystemExtensionNotifySettingDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(SystemExtensionNotifySettingDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(SystemExtensionNotifySettingDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(SystemExtensionNotifySettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：默认（全部数据） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_VIEW)
    def fetchView(SystemExtensionNotifySettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_VIEW, context)
    }

    /**
     * 数据集：当前用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_USER)
    def fetchCurUser(SystemExtensionNotifySettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER, context)
    }

}