package cn.ibizlab.plm.base.organization

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.organization.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ORGANIZATION]运行时对象
 * 此代码用户功能扩展代码
 *
 * 该实体存在实体映射，开启RTCode模式会导致映射功能失效
 */
class Organization extends GroovyDataEntityRuntime<Organization,OrganizationDTO,OrganizationFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ROOT = "root"
    private static Organization _instance
    void setInstance(Organization instance) {
        _instance = instance
    }
    static Organization getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CREATE)
    OrganizationDTO create(OrganizationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, OrganizationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    OrganizationDTO update(OrganizationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, OrganizationDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    //@DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    //@DEAction(ACTION_GET)
    OrganizationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, OrganizationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    OrganizationDTO getDraft(OrganizationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, OrganizationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    int checkKey(OrganizationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    OrganizationDTO save(OrganizationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, OrganizationDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    Page<OrganizationDTO> fetchDefault(OrganizationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, OrganizationDTO.class)
    }

    /**
     * 数据集：根节点 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_ROOT)
    Page<OrganizationDTO> fetchRoot(OrganizationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ROOT, context, OrganizationDTO.class)
    }

}