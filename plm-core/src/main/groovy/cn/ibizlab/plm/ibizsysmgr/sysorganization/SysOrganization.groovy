package cn.ibizlab.plm.ibizsysmgr.sysorganization

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ibizsysmgr.sysorganization.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SYS_ORGANIZATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SysOrganization extends GroovyDataEntityRuntime<SysOrganization,SysOrganizationDTO,SysOrganizationFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_NAV = "Nav"
    private static SysOrganization _instance
    void setInstance(SysOrganization instance) {
        _instance = instance
    }
    static SysOrganization getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    SysOrganizationDTO create(SysOrganizationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SysOrganizationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SysOrganizationDTO update(SysOrganizationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SysOrganizationDTO.class)
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
    SysOrganizationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SysOrganizationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SysOrganizationDTO getDraft(SysOrganizationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SysOrganizationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SysOrganizationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SysOrganizationDTO save(SysOrganizationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SysOrganizationDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SysOrganizationDTO> fetchDefault(SysOrganizationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SysOrganizationDTO.class)
    }

    /**
     * 数据集：Nav 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NAV)
    Page<SysOrganizationDTO> fetchNav(SysOrganizationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NAV, context, SysOrganizationDTO.class)
    }

}