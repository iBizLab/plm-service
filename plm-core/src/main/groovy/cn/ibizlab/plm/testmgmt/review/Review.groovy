package cn.ibizlab.plm.testmgmt.review

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.review.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[REVIEW]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Review extends GroovyDynaDataEntityRuntime<Review,ReviewDTO,ReviewFilterDTO> {

    public static final String ACTION_ADD_REVIEW_CONTENT = "add_review_content"
    public static final String ACTION_CHANGE_REVIEW_STAGE = "change_review_stage"
    public static final String ACTION_COMPLETED_REVIEW = "completed_review"
    public static final String ACTION_FILL_CUREENT_STAGE_INFO = "fill_cureent_stage_info"
    public static final String ACTION_FILL_GUIDELINE = "fill_guideline"
    public static final String ACTION_FILL_STAGE_REVIEWER = "fill_stage_reviewer"
    public static final String ACTION_GET_REDIRECT_DATA = "get_redirect_data"
    public static final String ACTION_REPEAL_REVIEW = "repeal_review"
    public static final String ACTION_SUBMIT_REVIEW = "submit_review"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_MYTODO = "MyTodo"
    public static final String DATASET_BI_SEARCH = "bi_search"
    public static final String DATASET_MY_ATTENTION = "my_attention"
    public static final String DATASET_MY_REVIEWED = "my_reviewed"
    private static Review _instance
    void setInstance(Review instance) {
        _instance = instance
    }
    static Review getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ReviewDTO create(ReviewDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ReviewDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ReviewDTO update(ReviewDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ReviewDTO.class)
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
    ReviewDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ReviewDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ReviewDTO getDraft(ReviewDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ReviewDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ReviewDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ReviewDTO save(ReviewDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ReviewDTO.class)
    }

    /**
     * 行为：添加评审内容 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_REVIEW_CONTENT)
    def addReviewContent(ReviewDTO dto) throws Throwable {
        this.execute(ACTION_ADD_REVIEW_CONTENT, dto, ReviewDTO.class)
    }

    /**
     * 行为：变更评审内阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_REVIEW_STAGE)
    def changeReviewStage(ReviewDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_REVIEW_STAGE, dto, ReviewDTO.class)
    }

    /**
     * 行为：完成评审 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COMPLETED_REVIEW)
    def completedReview(ReviewDTO dto) throws Throwable {
        this.execute(ACTION_COMPLETED_REVIEW, dto, ReviewDTO.class)
    }

    /**
     * 行为：填充当前阶段信息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILL_CUREENT_STAGE_INFO)
    def fillCureentStageInfo(ReviewDTO dto) throws Throwable {
        return this.execute(ACTION_FILL_CUREENT_STAGE_INFO, dto, ReviewDTO.class)
    }

    /**
     * 行为：填充评审规则 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILL_GUIDELINE)
    def fillGuideline(ReviewDTO dto) throws Throwable {
        return this.execute(ACTION_FILL_GUIDELINE, dto, ReviewDTO.class)
    }

    /**
     * 行为：填充阶段评审人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILL_STAGE_REVIEWER)
    def fillStageReviewer(ReviewDTO dto) throws Throwable {
        this.execute(ACTION_FILL_STAGE_REVIEWER, dto, ReviewDTO.class)
    }

    /**
     * 行为：获取重定向数据 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_REDIRECT_DATA)
    def getRedirectData(String key) throws Throwable {
        return this.execute(ACTION_GET_REDIRECT_DATA, key, ReviewDTO.class)
    }

    /**
     * 行为：撤销评审 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_REPEAL_REVIEW)
    def repealReview(ReviewDTO dto) throws Throwable {
        this.execute(ACTION_REPEAL_REVIEW, dto, ReviewDTO.class)
    }

    /**
     * 行为：提交评审 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SUBMIT_REVIEW)
    def submitReview(ReviewDTO dto) throws Throwable {
        this.execute(ACTION_SUBMIT_REVIEW, dto, ReviewDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ReviewDTO> fetchDefault(ReviewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ReviewDTO.class)
    }

    /**
     * 数据集：我的待办 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MYTODO)
    Page<ReviewDTO> fetchMyTodo(ReviewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MYTODO, context, ReviewDTO.class)
    }

    /**
     * 数据集：BI查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    Page<ReviewBiSearchGroupDTO> fetchBiSearch(ReviewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context, ReviewBiSearchGroupDTO.class)
    }

    /**
     * 数据集：我关注的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ATTENTION)
    Page<ReviewDTO> fetchMyAttention(ReviewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ATTENTION, context, ReviewDTO.class)
    }

    /**
     * 数据集：我评审的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_REVIEWED)
    Page<ReviewDTO> fetchMyReviewed(ReviewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_REVIEWED, context, ReviewDTO.class)
    }

}