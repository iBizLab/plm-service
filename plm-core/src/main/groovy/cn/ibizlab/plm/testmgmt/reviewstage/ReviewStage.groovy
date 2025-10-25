package cn.ibizlab.plm.testmgmt.reviewstage

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.reviewstage.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[REVIEW_STAGE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ReviewStage extends GroovyDynaDataEntityRuntime<ReviewStage,ReviewStageDTO,ReviewStageFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ReviewStage _instance
    void setInstance(ReviewStage instance) {
        _instance = instance
    }
    static ReviewStage getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ReviewStageDTO create(ReviewStageDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ReviewStageDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ReviewStageDTO update(ReviewStageDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ReviewStageDTO.class)
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
    ReviewStageDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ReviewStageDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ReviewStageDTO getDraft(ReviewStageDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ReviewStageDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ReviewStageDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ReviewStageDTO save(ReviewStageDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ReviewStageDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ReviewStageDTO> fetchDefault(ReviewStageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ReviewStageDTO.class)
    }

}