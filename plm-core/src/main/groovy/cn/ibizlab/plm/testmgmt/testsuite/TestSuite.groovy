package cn.ibizlab.plm.testmgmt.testsuite

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.testsuite.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[TEST_SUITE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class TestSuite extends GroovyDataEntityRuntime<TestSuite,TestSuiteDTO,TestSuiteFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_TEST_SUITE = "cur_test_suite"
    public static final String DATASET_NO_PARENT = "no_parent"
    public static final String DATASET_NORMAL = "normal"
    public static final String DATASET_ROOT = "root"
    private static TestSuite _instance;
    void setInstance(TestSuite instance) {
        _instance = instance
    }
    static TestSuite getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(TestSuiteDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(TestSuiteDTO dto) throws Throwable {
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
    def getDraft(TestSuiteDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(TestSuiteDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(TestSuiteDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：移动需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(TestSuiteDTO dto) throws Throwable {
        return this.execute(ACTION_MOVE_ORDER, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(TestSuiteFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：当前测试库用例模块 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_TEST_SUITE)
    def fetchCurTestSuite(TestSuiteFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_TEST_SUITE, context)
    }

    /**
     * 数据集：无父类 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_PARENT)
    def fetchNoParent(TestSuiteFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_PARENT, context)
    }

    /**
     * 数据集：正常 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    def fetchNormal(TestSuiteFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context)
    }

    /**
     * 数据集：顶级模块 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ROOT)
    def fetchRoot(TestSuiteFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ROOT, context)
    }

}