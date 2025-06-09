package cn.ibizlab.plm.base.attention

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.attention.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENTION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Attention extends GroovyDataEntityRuntime<Attention,AttentionDTO,AttentionFilterDTO> {

    public static final String ACTION_UN_ATTENTION = "un_attention"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ATTENTION_BY_OWNERID = "attention_by_ownerid"
    public static final String DATASET_COMMENT_ATTENTION = "comment_attention"
    public static final String DATASET_NOTIFY = "notify"
    public static final String DATASET_REVIEW_NOTIFY = "review_notify"
    private static Attention _instance
    void setInstance(Attention instance) {
        _instance = instance
    }
    static Attention getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttentionDTO create(AttentionDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttentionDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttentionDTO update(AttentionDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttentionDTO.class)
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
    AttentionDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttentionDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttentionDTO getDraft(AttentionDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttentionDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttentionDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttentionDTO save(AttentionDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttentionDTO.class)
    }

    /**
     * 行为：取消关注 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UN_ATTENTION)
    def unAttention(AttentionDTO dto) throws Throwable {
        return this.execute(ACTION_UN_ATTENTION, dto, AttentionDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttentionDTO> fetchDefault(AttentionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttentionDTO.class)
    }

    /**
     * 数据集：通过主数据标识查询通知对象 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ATTENTION_BY_OWNERID)
    Page<AttentionUserIdDTO> fetchAttentionByOwnerid(AttentionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ATTENTION_BY_OWNERID, context, AttentionUserIdDTO.class)
    }

    /**
     * 数据集：评论提醒 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMENT_ATTENTION)
    Page<AttentionUserIdDTO> fetchCommentAttention(AttentionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMENT_ATTENTION, context, AttentionUserIdDTO.class)
    }

    /**
     * 数据集：通知对象 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOTIFY)
    Page<AttentionDTO> fetchNotify(AttentionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOTIFY, context, AttentionDTO.class)
    }

    /**
     * 数据集：评审关注 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_REVIEW_NOTIFY)
    Page<AttentionDTO> fetchReviewNotify(AttentionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_REVIEW_NOTIFY, context, AttentionDTO.class)
    }

}