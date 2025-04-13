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
class DynaDashboard extends GroovyDataEntityRuntime<DynaDashboard,DynaDashboardDTO,DynaDashboardFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_FILL_OTHER_BOARD = "fill_other_board"
    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String ACTION_ONLY_GET = "only_get"
    public static final String ACTION_USE_CUR_TEMPLATE = "use_cur_template"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_EXAMPLE_CHART = "example_chart"
    public static final String DATASET_IS_SYSTEM = "is_system"
    public static final String DATASET_MY_DASHBOARD = "my_dashboard"
    public static final String DATASET_NORMAL = "normal"
    private static DynaDashboard _instance;
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
    def create(DynaDashboardDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(DynaDashboardDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE, dto)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    def remove(List<String> keys) throws Throwable {
        this.execute(ACTION_REMOVE, keys)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    def get(String key) throws Throwable {
        return this.execute(ACTION_GET, key)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    def getDraft(DynaDashboardDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(DynaDashboardDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(DynaDashboardDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：获取其他仪表盘 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILL_OTHER_BOARD)
    def fillOtherBoard(DynaDashboardDTO dto) throws Throwable {
        this.execute(ACTION_FILL_OTHER_BOARD, dto)
    }

    /**
     * 行为：移动排序 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(DynaDashboardDTO dto) throws Throwable {
        return this.execute(ACTION_MOVE_ORDER, dto)
    }

    /**
     * 行为：仅获取数据 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_ONLY_GET)
    def onlyGet(String key) throws Throwable {
        return this.execute(ACTION_ONLY_GET, key)
    }

    /**
     * 行为：使用此模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_USE_CUR_TEMPLATE)
    def useCurTemplate(DynaDashboardDTO dto) throws Throwable {
        this.execute(ACTION_USE_CUR_TEMPLATE, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(DynaDashboardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：示例图 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EXAMPLE_CHART)
    def fetchExampleChart(DynaDashboardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EXAMPLE_CHART, context)
    }

    /**
     * 数据集：系统仪表盘 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IS_SYSTEM)
    def fetchIsSystem(DynaDashboardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IS_SYSTEM, context)
    }

    /**
     * 数据集：我的看板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_DASHBOARD)
    def fetchMyDashboard(DynaDashboardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_DASHBOARD, context)
    }

    /**
     * 数据集：正常数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    def fetchNormal(DynaDashboardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context)
    }

}