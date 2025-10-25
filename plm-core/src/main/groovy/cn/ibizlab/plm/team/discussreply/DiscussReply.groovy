package cn.ibizlab.plm.team.discussreply

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.team.discussreply.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DISCUSS_REPLY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DiscussReply extends GroovyDynaDataEntityRuntime<DiscussReply,DiscussReplyDTO,DiscussReplyFilterDTO> {

    public static final String ACTION_ADD_REPLY = "add_reply"
    public static final String ACTION_DEL_COMMENT = "del_comment"
    public static final String ACTION_DEL_REPLY = "del_reply"
    public static final String ACTION_EDIT_REPLY = "edit_reply"
    public static final String ACTION_SEND_COMMENT = "send_comment"
    public static final String ACTION_UPDATE_COMMENT = "update_comment"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_MY_ALL_REPLY = "my_all_reply"
    public static final String DATASET_MY_REPLY = "my_reply"
    public static final String DATASET_RECENT = "recent"
    public static final String DATASET_SUB_REPLY = "sub_reply"
    private static DiscussReply _instance
    void setInstance(DiscussReply instance) {
        _instance = instance
    }
    static DiscussReply getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DiscussReplyDTO create(DiscussReplyDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DiscussReplyDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DiscussReplyDTO update(DiscussReplyDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DiscussReplyDTO.class)
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
    DiscussReplyDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DiscussReplyDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DiscussReplyDTO getDraft(DiscussReplyDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DiscussReplyDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DiscussReplyDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DiscussReplyDTO save(DiscussReplyDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DiscussReplyDTO.class)
    }

    /**
     * 行为：添加回复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_REPLY)
    def addReply(DiscussReplyDTO dto) throws Throwable {
        this.execute(ACTION_ADD_REPLY, dto, DiscussReplyDTO.class)
    }

    /**
     * 行为：删除评论 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DEL_COMMENT)
    def delComment(DiscussReplyDTO dto) throws Throwable {
        return this.execute(ACTION_DEL_COMMENT, dto, DiscussReplyDTO.class)
    }

    /**
     * 行为：删除回复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DEL_REPLY)
    def delReply(DiscussReplyDTO dto) throws Throwable {
        this.execute(ACTION_DEL_REPLY, dto, DiscussReplyDTO.class)
    }

    /**
     * 行为：编辑回复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_EDIT_REPLY)
    def editReply(DiscussReplyDTO dto) throws Throwable {
        this.execute(ACTION_EDIT_REPLY, dto, DiscussReplyDTO.class)
    }

    /**
     * 行为：发送评论 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SEND_COMMENT)
    def sendComment(DiscussReplyDTO dto) throws Throwable {
        this.execute(ACTION_SEND_COMMENT, dto, DiscussReplyDTO.class)
    }

    /**
     * 行为：修改评论 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE_COMMENT)
    def updateComment(DiscussReplyDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE_COMMENT, dto, DiscussReplyDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DiscussReplyDTO> fetchDefault(DiscussReplyFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DiscussReplyDTO.class)
    }

    /**
     * 数据集：我的全部回复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ALL_REPLY)
    Page<DiscussReplyDTO> fetchMyAllReply(DiscussReplyFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ALL_REPLY, context, DiscussReplyDTO.class)
    }

    /**
     * 数据集：我的回复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_REPLY)
    Page<DiscussReplyDTO> fetchMyReply(DiscussReplyFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_REPLY, context, DiscussReplyDTO.class)
    }

    /**
     * 数据集：最新回复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT)
    Page<DiscussReplyDTO> fetchRecent(DiscussReplyFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT, context, DiscussReplyDTO.class)
    }

    /**
     * 数据集：子回复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SUB_REPLY)
    Page<DiscussReplyDTO> fetchSubReply(DiscussReplyFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SUB_REPLY, context, DiscussReplyDTO.class)
    }

}