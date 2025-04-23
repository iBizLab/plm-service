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

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_VIEW = "VIEW"
    public static final String DATASET_CUR_USER = "CUR_USER"
    private static SystemExtensionNotifySetting _instance
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
    SystemExtensionNotifySettingDTO create(SystemExtensionNotifySettingDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SystemExtensionNotifySettingDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SystemExtensionNotifySettingDTO update(SystemExtensionNotifySettingDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SystemExtensionNotifySettingDTO.class)
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
    SystemExtensionNotifySettingDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SystemExtensionNotifySettingDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SystemExtensionNotifySettingDTO getDraft(SystemExtensionNotifySettingDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SystemExtensionNotifySettingDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SystemExtensionNotifySettingDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SystemExtensionNotifySettingDTO save(SystemExtensionNotifySettingDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SystemExtensionNotifySettingDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SystemExtensionNotifySettingDTO> fetchDefault(SystemExtensionNotifySettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SystemExtensionNotifySettingDTO.class)
    }

    /**
     * 数据集：默认（全部数据） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_VIEW)
    Page<SystemExtensionNotifySettingDTO> fetchView(SystemExtensionNotifySettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_VIEW, context, SystemExtensionNotifySettingDTO.class)
    }

    /**
     * 数据集：当前用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_USER)
    Page<SystemExtensionNotifySettingDTO> fetchCurUser(SystemExtensionNotifySettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER, context, SystemExtensionNotifySettingDTO.class)
    }

}