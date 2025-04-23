package cn.ibizlab.plm.testmgmt.reviewactionrule

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.reviewactionrule.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[REVIEW_ACTION_RULE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ReviewActionRule extends GroovyDataEntityRuntime<ReviewActionRule,ReviewActionRuleDTO,ReviewActionRuleFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ReviewActionRule _instance
    void setInstance(ReviewActionRule instance) {
        _instance = instance
    }
    static ReviewActionRule getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ReviewActionRuleDTO create(ReviewActionRuleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ReviewActionRuleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ReviewActionRuleDTO update(ReviewActionRuleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ReviewActionRuleDTO.class)
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
    ReviewActionRuleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ReviewActionRuleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ReviewActionRuleDTO getDraft(ReviewActionRuleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ReviewActionRuleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ReviewActionRuleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ReviewActionRuleDTO save(ReviewActionRuleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ReviewActionRuleDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ReviewActionRuleDTO> fetchDefault(ReviewActionRuleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ReviewActionRuleDTO.class)
    }

}