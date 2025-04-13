package cn.ibizlab.plm.team.discussmember

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.team.discussmember.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DISCUSS_MEMBER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DiscussMember extends GroovyDataEntityRuntime<DiscussMember,DiscussMemberDTO,DiscussMemberFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_RESTART = "Restart"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_STOP = "Stop"
    public static final String ACTION_CHANGE_ROLE = "change_role"
    public static final String ACTION_CHOOSE_POSITION = "choose_position"
    public static final String ACTION_MOB_CREATE_TOPIC_MEMBER = "mob_create_topic_member"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static DiscussMember _instance;
    void setInstance(DiscussMember instance) {
        _instance = instance
    }
    static DiscussMember getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(DiscussMemberDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(DiscussMemberDTO dto) throws Throwable {
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
    def getDraft(DiscussMemberDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(DiscussMemberDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：重启 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RESTART)
    def restart(DiscussMemberDTO dto) throws Throwable {
        this.execute(ACTION_RESTART, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(DiscussMemberDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：停止 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_STOP)
    def stop(DiscussMemberDTO dto) throws Throwable {
        this.execute(ACTION_STOP, dto)
    }

    /**
     * 行为：变更角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ROLE)
    def changeRole(DiscussMemberDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ROLE, dto)
    }

    /**
     * 行为：选择职位 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHOOSE_POSITION)
    def choosePosition(DiscussMemberDTO dto) throws Throwable {
        this.execute(ACTION_CHOOSE_POSITION, dto)
    }

    /**
     * 行为：新建话题成员（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOB_CREATE_TOPIC_MEMBER)
    def mobCreateTopicMember(DiscussMemberDTO dto) throws Throwable {
        return this.execute(ACTION_MOB_CREATE_TOPIC_MEMBER, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(DiscussMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

}