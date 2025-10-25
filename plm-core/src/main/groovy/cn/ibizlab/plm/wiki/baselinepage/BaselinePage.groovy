package cn.ibizlab.plm.wiki.baselinepage

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.wiki.baselinepage.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[BASELINE_PAGE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class BaselinePage extends GroovyDynaDataEntityRuntime<BaselinePage,BaselinePageDTO,BaselinePageFilterDTO> {

    public static final String ACTION_SHIFT_IN_BASELINE = "shift_in_baseline"
    public static final String ACTION_SHIFT_OUT_BASELINE = "shift_out_baseline"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_BASELINE_COMPARISON = "baseline_comparison"
    public static final String DATASET_FILL_VERSION_DATA = "fill_version_data"
    private static BaselinePage _instance
    void setInstance(BaselinePage instance) {
        _instance = instance
    }
    static BaselinePage getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    BaselinePageDTO create(BaselinePageDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, BaselinePageDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    BaselinePageDTO update(BaselinePageDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, BaselinePageDTO.class)
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
    BaselinePageDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, BaselinePageDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    BaselinePageDTO getDraft(BaselinePageDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, BaselinePageDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(BaselinePageDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    BaselinePageDTO save(BaselinePageDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, BaselinePageDTO.class)
    }

    /**
     * 行为：移入基线 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHIFT_IN_BASELINE)
    def shiftInBaseline(BaselinePageDTO dto) throws Throwable {
        return this.execute(ACTION_SHIFT_IN_BASELINE, dto, BaselinePageDTO.class)
    }

    /**
     * 行为：移出基线 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHIFT_OUT_BASELINE)
    def shiftOutBaseline(BaselinePageDTO dto) throws Throwable {
        this.execute(ACTION_SHIFT_OUT_BASELINE, dto, BaselinePageDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<BaselinePageDTO> fetchDefault(BaselinePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, BaselinePageDTO.class)
    }

    /**
     * 数据集：基线对比数据查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_COMPARISON)
    Page<BaselinePageDTO> fetchBaselineComparison(BaselinePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_COMPARISON, context, BaselinePageDTO.class)
    }

    /**
     * 数据集：填充页面版本数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FILL_VERSION_DATA)
    Page<BaselinePageDTO> fetchFillVersionData(BaselinePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FILL_VERSION_DATA, context, BaselinePageDTO.class)
    }

}