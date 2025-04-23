package cn.ibizlab.plm.ebsx.sysemployee

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ebsx.sysemployee.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SYS_EMP]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SysEmployee extends GroovyDataEntityRuntime<SysEmployee,SysEmployeeDTO,SysEmployeeFilterDTO> {

    public static final String ACTION_CHANGEPWD = "ChangePwd"
    public static final String ACTION_INITPWD = "InitPwd"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_USER = "user"
    private static SysEmployee _instance
    void setInstance(SysEmployee instance) {
        _instance = instance
    }
    static SysEmployee getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    SysEmployeeDTO create(SysEmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SysEmployeeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SysEmployeeDTO update(SysEmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SysEmployeeDTO.class)
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
    SysEmployeeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SysEmployeeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SysEmployeeDTO getDraft(SysEmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SysEmployeeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SysEmployeeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SysEmployeeDTO save(SysEmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SysEmployeeDTO.class)
    }

    /**
     * 行为：变更密码 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGEPWD)
    def changePwd(SysEmployeeDTO dto) throws Throwable {
        this.execute(ACTION_CHANGEPWD, dto, SysEmployeeDTO.class)
    }

    /**
     * 行为：初始化密码 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_INITPWD)
    def initPwd(SysEmployeeDTO dto) throws Throwable {
        this.execute(ACTION_INITPWD, dto, SysEmployeeDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SysEmployeeDTO> fetchDefault(SysEmployeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SysEmployeeDTO.class)
    }

    /**
     * 数据集：当前用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    Page<SysEmployeeDTO> fetchUser(SysEmployeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context, SysEmployeeDTO.class)
    }

}