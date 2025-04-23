package cn.ibizlab.plm.testmgmt.reviewresult

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.reviewresult.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[REVIEW_RESULT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ReviewResult extends GroovyDataEntityRuntime<ReviewResult,ReviewResultDTO,ReviewResultFilterDTO> {

    public static final String ACTION_SET_RESULT = "set_result"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ReviewResult _instance
    void setInstance(ReviewResult instance) {
        _instance = instance
    }
    static ReviewResult getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ReviewResultDTO create(ReviewResultDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ReviewResultDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ReviewResultDTO update(ReviewResultDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ReviewResultDTO.class)
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
    ReviewResultDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ReviewResultDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ReviewResultDTO getDraft(ReviewResultDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ReviewResultDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ReviewResultDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ReviewResultDTO save(ReviewResultDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ReviewResultDTO.class)
    }

    /**
     * 行为：设置结果 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_RESULT)
    def setResult(ReviewResultDTO dto) throws Throwable {
        this.execute(ACTION_SET_RESULT, dto, ReviewResultDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ReviewResultDTO> fetchDefault(ReviewResultFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ReviewResultDTO.class)
    }

}