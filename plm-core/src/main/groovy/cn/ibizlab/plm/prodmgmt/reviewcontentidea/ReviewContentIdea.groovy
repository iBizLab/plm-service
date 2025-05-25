package cn.ibizlab.plm.prodmgmt.reviewcontentidea

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.prodmgmt.reviewcontentidea.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[REVIEW_CONTENT_IDEA]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ReviewContentIdea extends GroovyDataEntityRuntime<ReviewContentIdea,ReviewContentIdeaDTO,ReviewContentIdeaFilterDTO> {

    public static final String ACTION_REVIEW_CONTENT_TOTAL = "review_content_total"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_CUR_HISTORY = "cur_history"
    public static final String DATASET_HISTORY_LIST = "history_list"
    private static ReviewContentIdea _instance
    void setInstance(ReviewContentIdea instance) {
        _instance = instance
    }
    static ReviewContentIdea getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ReviewContentIdeaDTO create(ReviewContentIdeaDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ReviewContentIdeaDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ReviewContentIdeaDTO update(ReviewContentIdeaDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ReviewContentIdeaDTO.class)
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
    ReviewContentIdeaDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ReviewContentIdeaDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ReviewContentIdeaDTO getDraft(ReviewContentIdeaDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ReviewContentIdeaDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ReviewContentIdeaDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ReviewContentIdeaDTO save(ReviewContentIdeaDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ReviewContentIdeaDTO.class)
    }

    /**
     * 行为：评审内容条数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_REVIEW_CONTENT_TOTAL)
    def reviewContentTotal(ReviewContentIdeaDTO dto) throws Throwable {
        this.execute(ACTION_REVIEW_CONTENT_TOTAL, dto, ReviewContentIdeaDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ReviewContentIdeaDTO> fetchDefault(ReviewContentIdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ReviewContentIdeaDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<ReviewContentIdeaDTO> fetchAll(ReviewContentIdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, ReviewContentIdeaDTO.class)
    }

    /**
     * 数据集：当前评审历史 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_HISTORY)
    Page<ReviewContentIdeaDTO> fetchCurHistory(ReviewContentIdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_HISTORY, context, ReviewContentIdeaDTO.class)
    }

    /**
     * 数据集：评审历史列表 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_HISTORY_LIST)
    Page<ReviewContentIdeaDTO> fetchHistoryList(ReviewContentIdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_HISTORY_LIST, context, ReviewContentIdeaDTO.class)
    }

}