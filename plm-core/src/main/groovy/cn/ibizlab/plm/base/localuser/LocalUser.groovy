package cn.ibizlab.plm.base.localuser

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.localuser.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[LOCAL_USER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class LocalUser extends GroovyDataEntityRuntime<LocalUser,LocalUserDTO,LocalUserFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static LocalUser _instance
    void setInstance(LocalUser instance) {
        _instance = instance
    }
    static LocalUser getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    LocalUserDTO create(LocalUserDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, LocalUserDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    LocalUserDTO update(LocalUserDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, LocalUserDTO.class)
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
    LocalUserDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, LocalUserDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    LocalUserDTO getDraft(LocalUserDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, LocalUserDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(LocalUserDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    LocalUserDTO save(LocalUserDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, LocalUserDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<LocalUserDTO> fetchDefault(LocalUserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, LocalUserDTO.class)
    }

}