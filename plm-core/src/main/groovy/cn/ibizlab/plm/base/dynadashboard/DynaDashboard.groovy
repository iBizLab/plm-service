package cn.ibizlab.plm.base.dynadashboard

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.dynadashboard.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DYNADASHBOARD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DynaDashboard extends GroovyDynaDataEntityRuntime<DynaDashboard,DynaDashboardDTO,DynaDashboardFilterDTO> {

    public static final String ACTION_FILL_OTHER_BOARD = "fill_other_board"
    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String ACTION_ONLY_GET = "only_get"
    public static final String ACTION_USE_CUR_TEMPLATE = "use_cur_template"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_EXAMPLE_CHART = "example_chart"
    public static final String DATASET_IS_SYSTEM = "is_system"
    public static final String DATASET_MY_DASHBOARD = "my_dashboard"
    public static final String DATASET_NORMAL = "normal"
    private static DynaDashboard _instance
    void setInstance(DynaDashboard instance) {
        _instance = instance
    }
    static DynaDashboard getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DynaDashboardDTO create(DynaDashboardDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DynaDashboardDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DynaDashboardDTO update(DynaDashboardDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DynaDashboardDTO.class)
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
    DynaDashboardDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DynaDashboardDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DynaDashboardDTO getDraft(DynaDashboardDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DynaDashboardDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DynaDashboardDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DynaDashboardDTO save(DynaDashboardDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DynaDashboardDTO.class)
    }

    /**
     * 行为：获取其他仪表盘 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILL_OTHER_BOARD)
    def fillOtherBoard(DynaDashboardDTO dto) throws Throwable {
        this.execute(ACTION_FILL_OTHER_BOARD, dto, DynaDashboardDTO.class)
    }

    /**
     * 行为：移动排序 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(DynaDashboardDTO dto) throws Throwable {
        return this.executeForList(ACTION_MOVE_ORDER, dto, DynaDashboardDTO.class)
    }

    /**
     * 行为：仅获取数据 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_ONLY_GET)
    def onlyGet(String key) throws Throwable {
        return this.execute(ACTION_ONLY_GET, key, DynaDashboardDTO.class)
    }

    /**
     * 行为：使用此模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_USE_CUR_TEMPLATE)
    def useCurTemplate(DynaDashboardDTO dto) throws Throwable {
        this.execute(ACTION_USE_CUR_TEMPLATE, dto, DynaDashboardDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DynaDashboardDTO> fetchDefault(DynaDashboardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DynaDashboardDTO.class)
    }

    /**
     * 数据集：示例图 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EXAMPLE_CHART)
    Page<DynaDashboardExampleChartDTO> fetchExampleChart(DynaDashboardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EXAMPLE_CHART, context, DynaDashboardExampleChartDTO.class)
    }

    /**
     * 数据集：系统仪表盘 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IS_SYSTEM)
    Page<DynaDashboardDTO> fetchIsSystem(DynaDashboardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IS_SYSTEM, context, DynaDashboardDTO.class)
    }

    /**
     * 数据集：我的看板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_DASHBOARD)
    Page<DynaDashboardDTO> fetchMyDashboard(DynaDashboardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_DASHBOARD, context, DynaDashboardDTO.class)
    }

    /**
     * 数据集：正常数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    Page<DynaDashboardDTO> fetchNormal(DynaDashboardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context, DynaDashboardDTO.class)
    }

}