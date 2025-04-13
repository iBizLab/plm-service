package cn.ibizlab.plm.insight.insightreport

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.insight.insightreport.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[INSIGHT_REPORT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class InsightReport extends GroovyDataEntityRuntime<InsightReport,InsightReportDTO,InsightReportFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_COPY_REPORT = "copy_report"
    public static final String ACTION_DELETE_CATEGORIES = "delete_categories"
    public static final String ACTION_SYNC_MODEL = "sync_model"
    public static final String ACTION_USE_CUR_TEMPLATE = "use_cur_template"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_IS_SYSTEM = "is_system"
    public static final String DATASET_NORMAL = "normal"
    private static InsightReport _instance;
    void setInstance(InsightReport instance) {
        _instance = instance
    }
    static InsightReport getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(InsightReportDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(InsightReportDTO dto) throws Throwable {
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
    def getDraft(InsightReportDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(InsightReportDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(InsightReportDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：复制报表 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COPY_REPORT)
    def copyReport(InsightReportDTO dto) throws Throwable {
        this.execute(ACTION_COPY_REPORT, dto)
    }

    /**
     * 行为：删除类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_CATEGORIES)
    def deleteCategories(InsightReportDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_CATEGORIES, dto)
    }

    /**
     * 行为：同步模板模型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SYNC_MODEL)
    def syncModel(InsightReportDTO dto) throws Throwable {
        this.execute(ACTION_SYNC_MODEL, dto)
    }

    /**
     * 行为：使用此模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_USE_CUR_TEMPLATE)
    def useCurTemplate(InsightReportDTO dto) throws Throwable {
        this.execute(ACTION_USE_CUR_TEMPLATE, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(InsightReportFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：模板报表 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IS_SYSTEM)
    def fetchIsSystem(InsightReportFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IS_SYSTEM, context)
    }

    /**
     * 数据集：正常数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    def fetchNormal(InsightReportFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context)
    }

}