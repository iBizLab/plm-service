package cn.ibizlab.plm.devops.scmreview

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.devops.scmreview.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SCM_REVIEW]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ScmReview extends GroovyDynaDataEntityRuntime<ScmReview,ScmReviewDTO,ScmReviewFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ScmReview _instance
    void setInstance(ScmReview instance) {
        _instance = instance
    }
    static ScmReview getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ScmReviewDTO create(ScmReviewDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ScmReviewDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ScmReviewDTO update(ScmReviewDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ScmReviewDTO.class)
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
    ScmReviewDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ScmReviewDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ScmReviewDTO getDraft(ScmReviewDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ScmReviewDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ScmReviewDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ScmReviewDTO save(ScmReviewDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ScmReviewDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ScmReviewDTO> fetchDefault(ScmReviewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ScmReviewDTO.class)
    }

}