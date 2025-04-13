package cn.ibizlab.plm.team.discusspost

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.team.discusspost.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DISCUSS_POST]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DiscussPost extends GroovyDataEntityRuntime<DiscussPost,DiscussPostDTO,DiscussPostFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_CLOSE = "close"
    public static final String ACTION_DEL_COMMENT = "del_comment"
    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_DISCUSS_POST_COUNT = "discuss_post_count"
    public static final String ACTION_FILL_ADDITION = "fill_addition"
    public static final String ACTION_GET_ATTENTION = "get_attention"
    public static final String ACTION_MOB_DISCUSS_POST_ATTENTION = "mob_discuss_post_attention"
    public static final String ACTION_MOVE = "move"
    public static final String ACTION_OPEN = "open"
    public static final String ACTION_RECOVER = "recover"
    public static final String ACTION_SEND_COMMENT = "send_comment"
    public static final String ACTION_UPDATE_COMMENT = "update_comment"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_DELETED = "deleted"
    public static final String DATASET_MOB_DISCUSS_POST_LIST = "mob_discuss_post_list"
    public static final String DATASET_MY_ATTENTION = "my_attention"
    public static final String DATASET_MY_CREATE = "my_create"
    public static final String DATASET_MY_POST = "my_post"
    public static final String DATASET_MY_REPLY = "my_reply"
    public static final String DATASET_NORMAL = "normal"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_RECENT = "recent"
    private static DiscussPost _instance;
    void setInstance(DiscussPost instance) {
        _instance = instance
    }
    static DiscussPost getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(DiscussPostDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(DiscussPostDTO dto) throws Throwable {
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
    def getDraft(DiscussPostDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(DiscussPostDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(DiscussPostDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：关闭 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CLOSE)
    def close(DiscussPostDTO dto) throws Throwable {
        this.execute(ACTION_CLOSE, dto)
    }

    /**
     * 行为：删除评论 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DEL_COMMENT)
    def delComment(DiscussPostDTO dto) throws Throwable {
        this.execute(ACTION_DEL_COMMENT, dto)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(DiscussPostDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto)
    }

    /**
     * 行为：讨论评论数计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DISCUSS_POST_COUNT)
    def discussPostCount(DiscussPostDTO dto) throws Throwable {
        this.execute(ACTION_DISCUSS_POST_COUNT, dto)
    }

    /**
     * 行为：填充附加数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILL_ADDITION)
    def fillAddition(DiscussPostDTO dto) throws Throwable {
        this.execute(ACTION_FILL_ADDITION, dto)
    }

    /**
     * 行为：获取关注人 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_ATTENTION)
    def getAttention(String key) throws Throwable {
        return this.execute(ACTION_GET_ATTENTION, key)
    }

    /**
     * 行为：讨论关注（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOB_DISCUSS_POST_ATTENTION)
    def mobDiscussPostAttention(DiscussPostDTO dto) throws Throwable {
        this.execute(ACTION_MOB_DISCUSS_POST_ATTENTION, dto)
    }

    /**
     * 行为：移动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE)
    def move(DiscussPostDTO dto) throws Throwable {
        this.execute(ACTION_MOVE, dto)
    }

    /**
     * 行为：打开 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_OPEN)
    def open(DiscussPostDTO dto) throws Throwable {
        this.execute(ACTION_OPEN, dto)
    }

    /**
     * 行为：恢复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER)
    def recover(DiscussPostDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER, dto)
    }

    /**
     * 行为：添加评论 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SEND_COMMENT)
    def sendComment(DiscussPostDTO dto) throws Throwable {
        this.execute(ACTION_SEND_COMMENT, dto)
    }

    /**
     * 行为：修改评论 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE_COMMENT)
    def updateComment(DiscussPostDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE_COMMENT, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(DiscussPostFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：已删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DELETED)
    def fetchDeleted(DiscussPostFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DELETED, context)
    }

    /**
     * 数据集：讨论集合 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_DISCUSS_POST_LIST)
    def fetchMobDiscussPostList(DiscussPostFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_DISCUSS_POST_LIST, context)
    }

    /**
     * 数据集：我关注的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ATTENTION)
    def fetchMyAttention(DiscussPostFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ATTENTION, context)
    }

    /**
     * 数据集：我发起的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_CREATE)
    def fetchMyCreate(DiscussPostFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_CREATE, context)
    }

    /**
     * 数据集：我的讨论 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_POST)
    def fetchMyPost(DiscussPostFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_POST, context)
    }

    /**
     * 数据集：我回复的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_REPLY)
    def fetchMyReply(DiscussPostFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_REPLY, context)
    }

    /**
     * 数据集：正常状态讨论 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    def fetchNormal(DiscussPostFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    def fetchReader(DiscussPostFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context)
    }

    /**
     * 数据集：最近讨论 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT)
    def fetchRecent(DiscussPostFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT, context)
    }

}