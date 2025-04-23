package cn.ibizlab.plm.ebsx.userrole

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ebsx.userrole.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SYS_USER_ROLE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class UserRole extends GroovyDataEntityRuntime<UserRole,UserRoleDTO,UserRoleFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static UserRole _instance
    void setInstance(UserRole instance) {
        _instance = instance
    }
    static UserRole getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    UserRoleDTO create(UserRoleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, UserRoleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    UserRoleDTO update(UserRoleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, UserRoleDTO.class)
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
    UserRoleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, UserRoleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    UserRoleDTO getDraft(UserRoleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, UserRoleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(UserRoleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    UserRoleDTO save(UserRoleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, UserRoleDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<UserRoleDTO> fetchDefault(UserRoleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, UserRoleDTO.class)
    }

}