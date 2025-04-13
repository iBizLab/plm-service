package cn.ibizlab.plm.ibizsysmgr.sysperson

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ibizsysmgr.sysperson.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SYS_PERSON]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SysPerson extends GroovyDataEntityRuntime<SysPerson,SysPersonDTO,SysPersonFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_GETSIMPLE = "GetSimple"
    public static final String ACTION_RESETPASSWORD = "ResetPassword"
    public static final String ACTION_SAVE = "Save"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_USER = "user"
    private static SysPerson _instance;
    void setInstance(SysPerson instance) {
        _instance = instance
    }
    static SysPerson getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(SysPersonDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(SysPersonDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE, dto)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    def remove(List<String> keys) throws Throwable {
        this.execute(ACTION_REMOVE, keys)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    def get(String key) throws Throwable {
        return this.execute(ACTION_GET, key)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    def getDraft(SysPersonDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(SysPersonDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：获取人员简要信息 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GETSIMPLE)
    def getSimple(String key) throws Throwable {
        return this.execute(ACTION_GETSIMPLE, key)
    }

    /**
     * 行为：重置密码 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RESETPASSWORD)
    def resetPassword(SysPersonDTO dto) throws Throwable {
        this.execute(ACTION_RESETPASSWORD, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(SysPersonDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(SysPersonFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：当前用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    def fetchUser(SysPersonFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context)
    }

}