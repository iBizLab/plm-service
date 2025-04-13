package cn.ibizlab.plm.base.baseline

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.baseline.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[BASELINE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Baseline extends GroovyDataEntityRuntime<Baseline,BaselineDTO,BaselineFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_DELETE_CATEGORIES = "delete_categories"
    public static final String ACTION_PLAN_SNAPSHOT = "plan_snapshot"
    public static final String ACTION_SET_COMPLETE_LIBRARY = "set_complete_library"
    public static final String ACTION_SET_COMPLETE_PRODUCT = "set_complete_product"
    public static final String ACTION_SET_COMPLETE_PROJECT = "set_complete_project"
    public static final String ACTION_SET_COMPLETE_SPACE = "set_complete_space"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_BASELINE = "baseline"
    public static final String DATASET_SNAPSHOT = "snapshot"
    private static Baseline _instance;
    void setInstance(Baseline instance) {
        _instance = instance
    }
    static Baseline getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(BaselineDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(BaselineDTO dto) throws Throwable {
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
    def getDraft(BaselineDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(BaselineDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(BaselineDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：删除类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_CATEGORIES)
    def deleteCategories(BaselineDTO dto) throws Throwable {
        return this.execute(ACTION_DELETE_CATEGORIES, dto)
    }

    /**
     * 行为：建立关联数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PLAN_SNAPSHOT)
    def planSnapshot(BaselineDTO dto) throws Throwable {
        this.execute(ACTION_PLAN_SNAPSHOT, dto)
    }

    /**
     * 行为：设立完成（测试库） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_COMPLETE_LIBRARY)
    def setCompleteLibrary(BaselineDTO dto) throws Throwable {
        this.execute(ACTION_SET_COMPLETE_LIBRARY, dto)
    }

    /**
     * 行为：设立完成（产品） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_COMPLETE_PRODUCT)
    def setCompleteProduct(BaselineDTO dto) throws Throwable {
        this.execute(ACTION_SET_COMPLETE_PRODUCT, dto)
    }

    /**
     * 行为：设立完成（项目） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_COMPLETE_PROJECT)
    def setCompleteProject(BaselineDTO dto) throws Throwable {
        this.execute(ACTION_SET_COMPLETE_PROJECT, dto)
    }

    /**
     * 行为：设立完成（空间） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_COMPLETE_SPACE)
    def setCompleteSpace(BaselineDTO dto) throws Throwable {
        this.execute(ACTION_SET_COMPLETE_SPACE, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(BaselineFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：基线查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE)
    def fetchBaseline(BaselineFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE, context)
    }

    /**
     * 数据集：规划快照 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SNAPSHOT)
    def fetchSnapshot(BaselineFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SNAPSHOT, context)
    }

}