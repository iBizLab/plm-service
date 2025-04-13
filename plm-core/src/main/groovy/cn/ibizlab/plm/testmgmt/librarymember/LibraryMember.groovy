package cn.ibizlab.plm.testmgmt.librarymember

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.librarymember.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[LIBRARY_MEMBER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class LibraryMember extends GroovyDataEntityRuntime<LibraryMember,LibraryMemberDTO,LibraryMemberFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_CHANGE_POSITION = "change_position"
    public static final String ACTION_CHANGE_ROLE = "change_role"
    public static final String ACTION_CREATE_LIBRARY_MEMBER = "create_library_member"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_LIBRARY_MEMBER = "cur_library_member"
    public static final String DATASET_MOB_CUR_MEMBER = "mob_cur_member"
    public static final String DATASET_NO_ATTENTION = "no_attention"
    private static LibraryMember _instance;
    void setInstance(LibraryMember instance) {
        _instance = instance
    }
    static LibraryMember getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(LibraryMemberDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(LibraryMemberDTO dto) throws Throwable {
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
    def getDraft(LibraryMemberDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(LibraryMemberDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(LibraryMemberDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：职位变更 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_POSITION)
    def changePosition(LibraryMemberDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_POSITION, dto)
    }

    /**
     * 行为：变更角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ROLE)
    def changeRole(LibraryMemberDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ROLE, dto)
    }

    /**
     * 行为：新建测试库成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_LIBRARY_MEMBER)
    def createLibraryMember(LibraryMemberDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_LIBRARY_MEMBER, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(LibraryMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：当前测试库成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_LIBRARY_MEMBER)
    def fetchCurLibraryMember(LibraryMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_LIBRARY_MEMBER, context)
    }

    /**
     * 数据集：移动端当前测试库成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_CUR_MEMBER)
    def fetchMobCurMember(LibraryMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_CUR_MEMBER, context)
    }

    /**
     * 数据集：未关注用户(测试用例) 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_ATTENTION)
    def fetchNoAttention(LibraryMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_ATTENTION, context)
    }

}