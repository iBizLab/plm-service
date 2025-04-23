package cn.ibizlab.plm.testmgmt.reviewcontentextend

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.reviewcontentextend.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[REVIEW_CONTENT_EXTEND]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ReviewContentExtend extends GroovyDataEntityRuntime<ReviewContentExtend,ReviewContentExtendDTO,ReviewContentExtendFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ReviewContentExtend _instance
    void setInstance(ReviewContentExtend instance) {
        _instance = instance
    }
    static ReviewContentExtend getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ReviewContentExtendDTO create(ReviewContentExtendDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ReviewContentExtendDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ReviewContentExtendDTO update(ReviewContentExtendDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ReviewContentExtendDTO.class)
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
    ReviewContentExtendDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ReviewContentExtendDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ReviewContentExtendDTO getDraft(ReviewContentExtendDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ReviewContentExtendDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ReviewContentExtendDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ReviewContentExtendDTO save(ReviewContentExtendDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ReviewContentExtendDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ReviewContentExtendDTO> fetchDefault(ReviewContentExtendFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ReviewContentExtendDTO.class)
    }

}