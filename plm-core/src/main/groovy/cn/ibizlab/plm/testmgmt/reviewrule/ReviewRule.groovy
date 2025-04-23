package cn.ibizlab.plm.testmgmt.reviewrule

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.reviewrule.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[REVIEW_RULE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ReviewRule extends GroovyDataEntityRuntime<ReviewRule,ReviewRuleDTO,ReviewRuleFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ReviewRule _instance
    void setInstance(ReviewRule instance) {
        _instance = instance
    }
    static ReviewRule getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ReviewRuleDTO create(ReviewRuleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ReviewRuleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ReviewRuleDTO update(ReviewRuleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ReviewRuleDTO.class)
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
    ReviewRuleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ReviewRuleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ReviewRuleDTO getDraft(ReviewRuleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ReviewRuleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ReviewRuleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ReviewRuleDTO save(ReviewRuleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ReviewRuleDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ReviewRuleDTO> fetchDefault(ReviewRuleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ReviewRuleDTO.class)
    }

}