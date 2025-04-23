package cn.ibizlab.plm.prodmgmt.baselineidea

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.prodmgmt.baselineidea.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[BASELINE_IDEA]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class BaselineIdea extends GroovyDataEntityRuntime<BaselineIdea,BaselineIdeaDTO,BaselineIdeaFilterDTO> {

    public static final String ACTION_SHIFT_IN_BASELINE = "shift_in_baseline"
    public static final String ACTION_SHIFT_OUT_BASELINE = "shift_out_baseline"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_BASELINE_COMPARISON = "baseline_comparison"
    public static final String DATASET_BASELINE_RELATION_VERSION = "baseline_relation_version"
    public static final String DATASET_FILL_VERSION_DATA = "fill_version_data"
    private static BaselineIdea _instance
    void setInstance(BaselineIdea instance) {
        _instance = instance
    }
    static BaselineIdea getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    BaselineIdeaDTO create(BaselineIdeaDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, BaselineIdeaDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    BaselineIdeaDTO update(BaselineIdeaDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, BaselineIdeaDTO.class)
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
    BaselineIdeaDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, BaselineIdeaDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    BaselineIdeaDTO getDraft(BaselineIdeaDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, BaselineIdeaDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(BaselineIdeaDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    BaselineIdeaDTO save(BaselineIdeaDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, BaselineIdeaDTO.class)
    }

    /**
     * 行为：移入基线 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHIFT_IN_BASELINE)
    def shiftInBaseline(BaselineIdeaDTO dto) throws Throwable {
        return this.execute(ACTION_SHIFT_IN_BASELINE, dto, BaselineIdeaDTO.class)
    }

    /**
     * 行为：移出基线 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHIFT_OUT_BASELINE)
    def shiftOutBaseline(BaselineIdeaDTO dto) throws Throwable {
        this.execute(ACTION_SHIFT_OUT_BASELINE, dto, BaselineIdeaDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<BaselineIdeaDTO> fetchDefault(BaselineIdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, BaselineIdeaDTO.class)
    }

    /**
     * 数据集：基线对比数据查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_COMPARISON)
    Page<BaselineIdeaDTO> fetchBaselineComparison(BaselineIdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_COMPARISON, context, BaselineIdeaDTO.class)
    }

    /**
     * 数据集：基线关联版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_RELATION_VERSION)
    Page<BaselineIdeaDTO> fetchBaselineRelationVersion(BaselineIdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_RELATION_VERSION, context, BaselineIdeaDTO.class)
    }

    /**
     * 数据集：填充产品需求版本数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FILL_VERSION_DATA)
    Page<BaselineIdeaDTO> fetchFillVersionData(BaselineIdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FILL_VERSION_DATA, context, BaselineIdeaDTO.class)
    }

}