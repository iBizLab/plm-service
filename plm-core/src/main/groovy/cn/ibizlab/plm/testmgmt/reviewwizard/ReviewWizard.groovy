package cn.ibizlab.plm.testmgmt.reviewwizard

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.reviewwizard.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[REVIEW_WIZARD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ReviewWizard extends GroovyDataEntityRuntime<ReviewWizard,ReviewWizardDTO,ReviewWizardFilterDTO> {

    public static final String ACTION_FILL_GUIDELINE = "fill_guideline"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ReviewWizard _instance
    void setInstance(ReviewWizard instance) {
        _instance = instance
    }
    static ReviewWizard getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ReviewWizardDTO create(ReviewWizardDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ReviewWizardDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ReviewWizardDTO update(ReviewWizardDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ReviewWizardDTO.class)
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
    ReviewWizardDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ReviewWizardDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ReviewWizardDTO getDraft(ReviewWizardDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ReviewWizardDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ReviewWizardDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ReviewWizardDTO save(ReviewWizardDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ReviewWizardDTO.class)
    }

    /**
     * 行为：填充评审规则 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILL_GUIDELINE)
    def fillGuideline(ReviewWizardDTO dto) throws Throwable {
        return this.execute(ACTION_FILL_GUIDELINE, dto, ReviewWizardDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ReviewWizardDTO> fetchDefault(ReviewWizardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ReviewWizardDTO.class)
    }

}