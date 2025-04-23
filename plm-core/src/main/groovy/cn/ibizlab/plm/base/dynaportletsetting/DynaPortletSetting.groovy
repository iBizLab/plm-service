package cn.ibizlab.plm.base.dynaportletsetting

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.dynaportletsetting.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DYNA_PORTLET_SETTING]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DynaPortletSetting extends GroovyDataEntityRuntime<DynaPortletSetting,DynaPortletSettingDTO,DynaPortletSettingFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static DynaPortletSetting _instance
    void setInstance(DynaPortletSetting instance) {
        _instance = instance
    }
    static DynaPortletSetting getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DynaPortletSettingDTO create(DynaPortletSettingDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DynaPortletSettingDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DynaPortletSettingDTO update(DynaPortletSettingDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DynaPortletSettingDTO.class)
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
    DynaPortletSettingDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DynaPortletSettingDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DynaPortletSettingDTO getDraft(DynaPortletSettingDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DynaPortletSettingDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DynaPortletSettingDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DynaPortletSettingDTO save(DynaPortletSettingDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DynaPortletSettingDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DynaPortletSettingDTO> fetchDefault(DynaPortletSettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DynaPortletSettingDTO.class)
    }

}