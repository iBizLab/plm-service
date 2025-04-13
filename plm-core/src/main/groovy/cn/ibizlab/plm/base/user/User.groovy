package cn.ibizlab.plm.base.user

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.user.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[USER]运行时对象
 * 此代码用户功能扩展代码
 *
 * 该实体存在实体映射，开启RTCode模式会导致映射功能失效
 */
class User extends GroovyDataEntityRuntime<User,UserDTO,UserFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_ACTIVATE = "Activate"
    public static final String ACTION_CHANGEPWD = "ChangePwd"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_FREEZE = "Freeze"
    public static final String ACTION_GETFULL = "GetFull"
    public static final String ACTION_INITPWD = "InitPwd"
    public static final String ACTION_RESETPASSWORD = "ResetPassword"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_CANCEL_REPORT_FLAG = "cancel_report_flag"
    public static final String ACTION_SET_REPORT_FLAG = "set_report_flag"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_NOT_SPACE_MMEBER = "not_space_mmeber"
    public static final String DATASET_UNASSIGNED_DEPT = "unassigned_dept"
    public static final String DATASET_USER = "user"
    public static final String DATASET_WORKLOAD = "workload"
    private static User _instance;
    void setInstance(User instance) {
        _instance = instance
    }
    static User getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CREATE)
    def create(UserDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    def update(UserDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE, dto)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    //@DEAction(ACTION_REMOVE)
    def remove(List<String> keys) throws Throwable {
        this.execute(ACTION_REMOVE, keys)
    }

    /**
     * 行为：获取用户简要信息 实际功能
     * @param key
     * @throws Throwable
     */
    //@DEAction(ACTION_GET)
    def get(String key) throws Throwable {
        return this.execute(ACTION_GET, key)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    def getDraft(UserDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：激活用户 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_ACTIVATE)
    def activate(UserDTO dto) throws Throwable {
        this.execute(ACTION_ACTIVATE, dto)
    }

    /**
     * 行为：变更密码 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHANGEPWD)
    def changePwd(UserDTO dto) throws Throwable {
        this.execute(ACTION_CHANGEPWD, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    def checkKey(UserDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：冻结用户 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_FREEZE)
    def freeze(UserDTO dto) throws Throwable {
        this.execute(ACTION_FREEZE, dto)
    }

    /**
     * 行为：获取人员全量信息 实际功能
     * @param key
     * @throws Throwable
     */
    //@DEAction(ACTION_GETFULL)
    def getFull(String key) throws Throwable {
        return this.execute(ACTION_GETFULL, key)
    }

    /**
     * 行为：初始化密码 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_INITPWD)
    def initPwd(UserDTO dto) throws Throwable {
        this.execute(ACTION_INITPWD, dto)
    }

    /**
     * 行为：重置密码 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_RESETPASSWORD)
    def resetPassword(UserDTO dto) throws Throwable {
        this.execute(ACTION_RESETPASSWORD, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    def save(UserDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：取消统计 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CANCEL_REPORT_FLAG)
    def cancelReportFlag(UserDTO dto) throws Throwable {
        this.execute(ACTION_CANCEL_REPORT_FLAG, dto)
    }

    /**
     * 行为：设置统计 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SET_REPORT_FLAG)
    def setReportFlag(UserDTO dto) throws Throwable {
        this.execute(ACTION_SET_REPORT_FLAG, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    def fetchDefault(UserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：非空间下成员 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_NOT_SPACE_MMEBER)
    def fetchNotSpaceMmeber(UserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_SPACE_MMEBER, context)
    }

    /**
     * 数据集：未分配部门 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_UNASSIGNED_DEPT)
    def fetchUnassignedDept(UserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_UNASSIGNED_DEPT, context)
    }

    /**
     * 数据集：当前用户 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_USER)
    def fetchUser(UserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context)
    }

    /**
     * 数据集：工时统计 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_WORKLOAD)
    def fetchWorkload(UserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORKLOAD, context)
    }

}