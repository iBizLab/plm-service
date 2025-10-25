package cn.ibizlab.plm.base.addonapplicationactivity

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.addonapplicationactivity.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ADDON_APPLICATION_ACTIVITY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AddonApplicationActivity extends GroovyDynaDataEntityRuntime<AddonApplicationActivity,AddonApplicationActivityDTO,AddonApplicationActivityFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AddonApplicationActivity _instance
    void setInstance(AddonApplicationActivity instance) {
        _instance = instance
    }
    static AddonApplicationActivity getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AddonApplicationActivityDTO create(AddonApplicationActivityDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AddonApplicationActivityDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AddonApplicationActivityDTO update(AddonApplicationActivityDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AddonApplicationActivityDTO.class)
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
    AddonApplicationActivityDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AddonApplicationActivityDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AddonApplicationActivityDTO getDraft(AddonApplicationActivityDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AddonApplicationActivityDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AddonApplicationActivityDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AddonApplicationActivityDTO save(AddonApplicationActivityDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AddonApplicationActivityDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AddonApplicationActivityDTO> fetchDefault(AddonApplicationActivityFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AddonApplicationActivityDTO.class)
    }

}