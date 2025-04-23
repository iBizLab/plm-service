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

    public static final String ACTION_ACTIVATE = "Activate"
    public static final String ACTION_CHANGEPWD = "ChangePwd"
    public static final String ACTION_FREEZE = "Freeze"
    public static final String ACTION_GETFULL = "GetFull"
    public static final String ACTION_INITPWD = "InitPwd"
    public static final String ACTION_RESETPASSWORD = "ResetPassword"
    public static final String ACTION_CANCEL_REPORT_FLAG = "cancel_report_flag"
    public static final String ACTION_SET_REPORT_FLAG = "set_report_flag"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_NOT_SPACE_MMEBER = "not_space_mmeber"
    public static final String DATASET_UNASSIGNED_DEPT = "unassigned_dept"
    public static final String DATASET_USER = "user"
    public static final String DATASET_WORKLOAD = "workload"
    private static User _instance
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
    UserDTO create(UserDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, UserDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    UserDTO update(UserDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, UserDTO.class)
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
    UserDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, UserDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    UserDTO getDraft(UserDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, UserDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    int checkKey(UserDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    UserDTO save(UserDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, UserDTO.class)
    }

    /**
     * 行为：激活用户 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_ACTIVATE)
    def activate(UserDTO dto) throws Throwable {
        this.execute(ACTION_ACTIVATE, dto, UserDTO.class)
    }

    /**
     * 行为：变更密码 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHANGEPWD)
    def changePwd(UserDTO dto) throws Throwable {
        this.execute(ACTION_CHANGEPWD, dto, UserDTO.class)
    }

    /**
     * 行为：冻结用户 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_FREEZE)
    def freeze(UserDTO dto) throws Throwable {
        this.execute(ACTION_FREEZE, dto, UserDTO.class)
    }

    /**
     * 行为：获取人员全量信息 实际功能
     * @param key
     * @throws Throwable
     */
    //@DEAction(ACTION_GETFULL)
    def getFull(String key) throws Throwable {
        return this.execute(ACTION_GETFULL, key, UserDTO.class)
    }

    /**
     * 行为：初始化密码 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_INITPWD)
    def initPwd(UserDTO dto) throws Throwable {
        this.execute(ACTION_INITPWD, dto, UserDTO.class)
    }

    /**
     * 行为：重置密码 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_RESETPASSWORD)
    def resetPassword(UserDTO dto) throws Throwable {
        this.execute(ACTION_RESETPASSWORD, dto, UserDTO.class)
    }

    /**
     * 行为：取消统计 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CANCEL_REPORT_FLAG)
    def cancelReportFlag(UserDTO dto) throws Throwable {
        this.execute(ACTION_CANCEL_REPORT_FLAG, dto, UserDTO.class)
    }

    /**
     * 行为：设置统计 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SET_REPORT_FLAG)
    def setReportFlag(UserDTO dto) throws Throwable {
        this.execute(ACTION_SET_REPORT_FLAG, dto, UserDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    Page<UserDTO> fetchDefault(UserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, UserDTO.class)
    }

    /**
     * 数据集：非空间下成员 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_NOT_SPACE_MMEBER)
    Page<UserDTO> fetchNotSpaceMmeber(UserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_SPACE_MMEBER, context, UserDTO.class)
    }

    /**
     * 数据集：未分配部门 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_UNASSIGNED_DEPT)
    Page<UserDTO> fetchUnassignedDept(UserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_UNASSIGNED_DEPT, context, UserDTO.class)
    }

    /**
     * 数据集：当前用户 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_USER)
    Page<UserDTO> fetchUser(UserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context, UserDTO.class)
    }

    /**
     * 数据集：工时统计 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_WORKLOAD)
    Page<UserDTO> fetchWorkload(UserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORKLOAD, context, UserDTO.class)
    }

}