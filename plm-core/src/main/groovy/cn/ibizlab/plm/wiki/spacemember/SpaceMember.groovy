package cn.ibizlab.plm.wiki.spacemember

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.wiki.spacemember.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SPACE_MEMBER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SpaceMember extends GroovyDataEntityRuntime<SpaceMember,SpaceMemberDTO,SpaceMemberFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_CHANGE_ROLE = "change_role"
    public static final String ACTION_CHOOSE_POSITION = "choose_position"
    public static final String ACTION_MOB_CREATE_SPACE_MEMBER = "mob_create_space_member"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_SPACE = "cur_space"
    public static final String DATASET_NO_ATTENTION = "no_attention"
    private static SpaceMember _instance;
    void setInstance(SpaceMember instance) {
        _instance = instance
    }
    static SpaceMember getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(SpaceMemberDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(SpaceMemberDTO dto) throws Throwable {
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
    def getDraft(SpaceMemberDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(SpaceMemberDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(SpaceMemberDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：变更角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ROLE)
    def changeRole(SpaceMemberDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ROLE, dto)
    }

    /**
     * 行为：变更职位 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHOOSE_POSITION)
    def choosePosition(SpaceMemberDTO dto) throws Throwable {
        this.execute(ACTION_CHOOSE_POSITION, dto)
    }

    /**
     * 行为：新建项目成员（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOB_CREATE_SPACE_MEMBER)
    def mobCreateSpaceMember(SpaceMemberDTO dto) throws Throwable {
        return this.execute(ACTION_MOB_CREATE_SPACE_MEMBER, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(SpaceMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：当前空间下成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_SPACE)
    def fetchCurSpace(SpaceMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_SPACE, context)
    }

    /**
     * 数据集：未关注用户(测试用例) 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_ATTENTION)
    def fetchNoAttention(SpaceMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_ATTENTION, context)
    }

}