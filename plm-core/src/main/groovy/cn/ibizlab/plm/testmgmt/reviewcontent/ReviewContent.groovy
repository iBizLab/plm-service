package cn.ibizlab.plm.testmgmt.reviewcontent

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.reviewcontent.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[REVIEW_CONTENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ReviewContent extends GroovyDynaDataEntityRuntime<ReviewContent,ReviewContentDTO,ReviewContentFilterDTO> {

    public static final String ACTION_ADD_REVIEW_CONTENT = "add_review_content"
    public static final String ACTION_COMPLETE_REVIEW = "complete_review"
    public static final String ACTION_CREATE_REVIEW_DATA = "create_review_data"
    public static final String ACTION_PROGRAM_TEST_CASE = "program_test_case"
    public static final String ACTION_REVIEW_CONTENT_TOTAL = "review_content_total"
    public static final String ACTION_SET_REVIEW_RESULT = "set_review_result"
    public static final String ACTION_SET_REVIEW_RESULT_ALL = "set_review_result_all"
    public static final String ACTION_START_REVIEW = "start_review"
    public static final String ACTION_SUBMIT_REVIEW = "submit_review"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_CUR_HISTORY = "cur_history"
    public static final String DATASET_HISTORY_LIST = "history_list"
    private static ReviewContent _instance
    void setInstance(ReviewContent instance) {
        _instance = instance
    }
    static ReviewContent getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ReviewContentDTO create(ReviewContentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ReviewContentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ReviewContentDTO update(ReviewContentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ReviewContentDTO.class)
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
    ReviewContentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ReviewContentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ReviewContentDTO getDraft(ReviewContentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ReviewContentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ReviewContentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ReviewContentDTO save(ReviewContentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ReviewContentDTO.class)
    }

    /**
     * 行为：添加评审内容 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_REVIEW_CONTENT)
    def addReviewContent(ReviewContentDTO dto) throws Throwable {
        this.execute(ACTION_ADD_REVIEW_CONTENT, dto, ReviewContentDTO.class)
    }

    /**
     * 行为：完成评审 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COMPLETE_REVIEW)
    def completeReview(ReviewContentDTO dto) throws Throwable {
        return this.execute(ACTION_COMPLETE_REVIEW, dto, ReviewContentDTO.class)
    }

    /**
     * 行为：创建评审数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_REVIEW_DATA)
    def createReviewData(ReviewContentDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_REVIEW_DATA, dto, ReviewContentDTO.class)
    }

    /**
     * 行为：规划用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PROGRAM_TEST_CASE)
    def programTestCase(ReviewContentDTO dto) throws Throwable {
        this.execute(ACTION_PROGRAM_TEST_CASE, dto, ReviewContentDTO.class)
    }

    /**
     * 行为：评审内容条数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_REVIEW_CONTENT_TOTAL)
    def reviewContentTotal(ReviewContentDTO dto) throws Throwable {
        this.execute(ACTION_REVIEW_CONTENT_TOTAL, dto, ReviewContentDTO.class)
    }

    /**
     * 行为：设置评审结果 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_REVIEW_RESULT)
    def setReviewResult(ReviewContentDTO dto) throws Throwable {
        this.execute(ACTION_SET_REVIEW_RESULT, dto, ReviewContentDTO.class)
    }

    /**
     * 行为：设置评审结果（批） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_REVIEW_RESULT_ALL)
    def setReviewResultAll(ReviewContentDTO dto) throws Throwable {
        return this.execute(ACTION_SET_REVIEW_RESULT_ALL, dto, ReviewContentDTO.class)
    }

    /**
     * 行为：开始评审 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_START_REVIEW)
    def startReview(ReviewContentDTO dto) throws Throwable {
        return this.execute(ACTION_START_REVIEW, dto, ReviewContentDTO.class)
    }

    /**
     * 行为：提交评审 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SUBMIT_REVIEW)
    def submitReview(ReviewContentDTO dto) throws Throwable {
        return this.execute(ACTION_SUBMIT_REVIEW, dto, ReviewContentDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ReviewContentDTO> fetchDefault(ReviewContentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ReviewContentDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<ReviewContentDTO> fetchAll(ReviewContentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, ReviewContentDTO.class)
    }

    /**
     * 数据集：当前评审历史 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_HISTORY)
    Page<ReviewContentDTO> fetchCurHistory(ReviewContentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_HISTORY, context, ReviewContentDTO.class)
    }

    /**
     * 数据集：评审历史列表 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_HISTORY_LIST)
    Page<ReviewContentDTO> fetchHistoryList(ReviewContentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_HISTORY_LIST, context, ReviewContentDTO.class)
    }

}