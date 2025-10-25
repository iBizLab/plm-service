package cn.ibizlab.plm.base.addonrolemember

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.addonrolemember.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ADDON_ROLE_MEMBER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AddonRoleMember extends GroovyDynaDataEntityRuntime<AddonRoleMember,AddonRoleMemberDTO,AddonRoleMemberFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AddonRoleMember _instance
    void setInstance(AddonRoleMember instance) {
        _instance = instance
    }
    static AddonRoleMember getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AddonRoleMemberDTO create(AddonRoleMemberDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AddonRoleMemberDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AddonRoleMemberDTO update(AddonRoleMemberDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AddonRoleMemberDTO.class)
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
    AddonRoleMemberDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AddonRoleMemberDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AddonRoleMemberDTO getDraft(AddonRoleMemberDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AddonRoleMemberDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AddonRoleMemberDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AddonRoleMemberDTO save(AddonRoleMemberDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AddonRoleMemberDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AddonRoleMemberDTO> fetchDefault(AddonRoleMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AddonRoleMemberDTO.class)
    }

}