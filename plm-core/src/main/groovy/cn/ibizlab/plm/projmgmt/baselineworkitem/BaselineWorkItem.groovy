package cn.ibizlab.plm.projmgmt.baselineworkitem

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.baselineworkitem.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[BASELINE_WORK_ITEM]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class BaselineWorkItem extends GroovyDataEntityRuntime<BaselineWorkItem,BaselineWorkItemDTO,BaselineWorkItemFilterDTO> {

    public static final String ACTION_SHIFT_IN_BASELINE = "shift_in_baseline"
    public static final String ACTION_SHIFT_OUT_BASELINE = "shift_out_baseline"
    public static final String ACTION_SNAPSHOT_SET_BASELINE = "snapshot_set_baseline"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_BASELINE_COMPARISON = "baseline_comparison"
    public static final String DATASET_BASELINE_RELATION_VERSION = "baseline_relation_version"
    public static final String DATASET_FILL_VERSION_DATA = "fill_version_data"
    private static BaselineWorkItem _instance
    void setInstance(BaselineWorkItem instance) {
        _instance = instance
    }
    static BaselineWorkItem getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    BaselineWorkItemDTO create(BaselineWorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, BaselineWorkItemDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    BaselineWorkItemDTO update(BaselineWorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, BaselineWorkItemDTO.class)
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
    BaselineWorkItemDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, BaselineWorkItemDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    BaselineWorkItemDTO getDraft(BaselineWorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, BaselineWorkItemDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(BaselineWorkItemDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    BaselineWorkItemDTO save(BaselineWorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, BaselineWorkItemDTO.class)
    }

    /**
     * 行为：移入基线 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHIFT_IN_BASELINE)
    def shiftInBaseline(BaselineWorkItemDTO dto) throws Throwable {
        return this.execute(ACTION_SHIFT_IN_BASELINE, dto, BaselineWorkItemDTO.class)
    }

    /**
     * 行为：移出基线 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHIFT_OUT_BASELINE)
    def shiftOutBaseline(BaselineWorkItemDTO dto) throws Throwable {
        this.execute(ACTION_SHIFT_OUT_BASELINE, dto, BaselineWorkItemDTO.class)
    }

    /**
     * 行为：快照设立基线 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SNAPSHOT_SET_BASELINE)
    def snapshotSetBaseline(BaselineWorkItemDTO dto) throws Throwable {
        this.execute(ACTION_SNAPSHOT_SET_BASELINE, dto, BaselineWorkItemDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<BaselineWorkItemDTO> fetchDefault(BaselineWorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, BaselineWorkItemDTO.class)
    }

    /**
     * 数据集：基线对比数据查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_COMPARISON)
    Page<BaselineWorkItemDTO> fetchBaselineComparison(BaselineWorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_COMPARISON, context, BaselineWorkItemDTO.class)
    }

    /**
     * 数据集：基线关联工作项版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_RELATION_VERSION)
    Page<BaselineWorkItemDTO> fetchBaselineRelationVersion(BaselineWorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_RELATION_VERSION, context, BaselineWorkItemDTO.class)
    }

    /**
     * 数据集：填充工作项版本数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FILL_VERSION_DATA)
    Page<BaselineWorkItemDTO> fetchFillVersionData(BaselineWorkItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FILL_VERSION_DATA, context, BaselineWorkItemDTO.class)
    }

}