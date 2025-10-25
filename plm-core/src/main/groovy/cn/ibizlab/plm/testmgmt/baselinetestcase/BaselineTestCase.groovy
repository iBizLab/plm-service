package cn.ibizlab.plm.testmgmt.baselinetestcase

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.baselinetestcase.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[BASELINE_TEST_CASE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class BaselineTestCase extends GroovyDynaDataEntityRuntime<BaselineTestCase,BaselineTestCaseDTO,BaselineTestCaseFilterDTO> {

    public static final String ACTION_SHIFT_IN_BASELINE = "shift_in_baseline"
    public static final String ACTION_SHIFT_OUT_BASELINE = "shift_out_baseline"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_BASELINE_COMPARISON = "baseline_comparison"
    public static final String DATASET_BASELINE_RELATION_VERSION = "baseline_relation_version"
    public static final String DATASET_FILL_VERSION_DATA = "fill_version_data"
    private static BaselineTestCase _instance
    void setInstance(BaselineTestCase instance) {
        _instance = instance
    }
    static BaselineTestCase getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    BaselineTestCaseDTO create(BaselineTestCaseDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, BaselineTestCaseDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    BaselineTestCaseDTO update(BaselineTestCaseDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, BaselineTestCaseDTO.class)
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
    BaselineTestCaseDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, BaselineTestCaseDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    BaselineTestCaseDTO getDraft(BaselineTestCaseDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, BaselineTestCaseDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(BaselineTestCaseDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    BaselineTestCaseDTO save(BaselineTestCaseDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, BaselineTestCaseDTO.class)
    }

    /**
     * 行为：移入基线 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHIFT_IN_BASELINE)
    def shiftInBaseline(BaselineTestCaseDTO dto) throws Throwable {
        return this.execute(ACTION_SHIFT_IN_BASELINE, dto, BaselineTestCaseDTO.class)
    }

    /**
     * 行为：移出基线 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHIFT_OUT_BASELINE)
    def shiftOutBaseline(BaselineTestCaseDTO dto) throws Throwable {
        this.execute(ACTION_SHIFT_OUT_BASELINE, dto, BaselineTestCaseDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<BaselineTestCaseDTO> fetchDefault(BaselineTestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, BaselineTestCaseDTO.class)
    }

    /**
     * 数据集：基线对比数据查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_COMPARISON)
    Page<BaselineTestCaseDTO> fetchBaselineComparison(BaselineTestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_COMPARISON, context, BaselineTestCaseDTO.class)
    }

    /**
     * 数据集：基线关联测试用例版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_RELATION_VERSION)
    Page<BaselineTestCaseDTO> fetchBaselineRelationVersion(BaselineTestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_RELATION_VERSION, context, BaselineTestCaseDTO.class)
    }

    /**
     * 数据集：填充测试用例版本数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FILL_VERSION_DATA)
    Page<BaselineTestCaseDTO> fetchFillVersionData(BaselineTestCaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FILL_VERSION_DATA, context, BaselineTestCaseDTO.class)
    }

}