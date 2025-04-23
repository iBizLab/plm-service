package cn.ibizlab.plm.base.addon

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.addon.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ADDON]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Addon extends GroovyDataEntityRuntime<Addon,AddonDTO,AddonFilterDTO> {

    public static final String ACTION_ADDON_AUTHORITY = "addon_authority"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_OWNER_SYS = "cur_owner_sys"
    public static final String DATASET_PSMODEL_SYNC = "PSMODEL_SYNC"
    private static Addon _instance
    void setInstance(Addon instance) {
        _instance = instance
    }
    static Addon getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AddonDTO create(AddonDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AddonDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AddonDTO update(AddonDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AddonDTO.class)
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
    AddonDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AddonDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AddonDTO getDraft(AddonDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AddonDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AddonDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AddonDTO save(AddonDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AddonDTO.class)
    }

    /**
     * 行为：组件权限 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADDON_AUTHORITY)
    def addonAuthority(AddonDTO dto) throws Throwable {
        this.execute(ACTION_ADDON_AUTHORITY, dto, AddonDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AddonDTO> fetchDefault(AddonFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AddonDTO.class)
    }

    /**
     * 数据集：当前所有者及系统预定义 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_OWNER_SYS)
    Page<AddonDTO> fetchCurOwnerSys(AddonFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_OWNER_SYS, context, AddonDTO.class)
    }

    /**
     * 数据集：实体数据关系界面组（同步） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PSMODEL_SYNC)
    Page<AddonDTO> fetchPsmodelSync(AddonFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PSMODEL_SYNC, context, AddonDTO.class)
    }

}