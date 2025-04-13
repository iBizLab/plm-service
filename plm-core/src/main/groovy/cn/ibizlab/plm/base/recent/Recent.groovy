package cn.ibizlab.plm.base.recent

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.recent.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RECENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Recent extends GroovyDataEntityRuntime<Recent,RecentDTO,RecentFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_MY_CHARGE_ENTRY = "my_charge_entry"
    public static final String ACTION_MY_CREATED_ENTRY = "my_created_entry"
    public static final String ACTION_MY_SUMMARY = "my_summary"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_MOB_HOME_RECENT_ACCESS = "mob_home_recent_access"
    public static final String DATASET_ONLY_TEN_ACCESS_USE = "only_ten_access_use"
    public static final String DATASET_RECENT_ACCESS = "recent_access"
    public static final String DATASET_RECENT_ACCESS_LOGIC = "recent_access_logic"
    public static final String DATASET_RECENT_CURPRODUCT_TICKET = "recent_curproduct_ticket"
    public static final String DATASET_RECENT_CURPROJECT_CHILD_WORK_ITEM = "recent_curproject_child_work_item"
    public static final String DATASET_RECENT_CURPROJECT_WORK_ITEM = "recent_curproject_work_item"
    public static final String DATASET_RECENT_IDEA = "recent_idea"
    public static final String DATASET_RECENT_PAGE = "recent_page"
    public static final String DATASET_RECENT_PROJECT = "recent_project"
    public static final String DATASET_RECENT_TEST_CASE = "recent_test_case"
    public static final String DATASET_RECENT_TEST_CASE_INDEX = "recent_test_case_index"
    public static final String DATASET_RECENT_TICKET = "recent_ticket"
    public static final String DATASET_RECENT_USE = "recent_use"
    public static final String DATASET_RECENT_WORK_ITEM = "recent_work_item"
    public static final String DATASET_RECENT_WORK_ITEM_AND_NOBUG = "recent_work_item_and_nobug"
    public static final String DATASET_RECENT_WORK_ITEM_BUG = "recent_work_item_bug"
    public static final String DATASET_RECENT_WORK_ITEM_DEPENDENCY = "recent_work_item_dependency"
    public static final String DATASET_USER = "user"
    private static Recent _instance;
    void setInstance(Recent instance) {
        _instance = instance
    }
    static Recent getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(RecentDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(RecentDTO dto) throws Throwable {
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
    def getDraft(RecentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(RecentDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(RecentDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：我负责的事项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MY_CHARGE_ENTRY)
    def myChargeEntry(RecentDTO dto) throws Throwable {
        return this.execute(ACTION_MY_CHARGE_ENTRY, dto)
    }

    /**
     * 行为：我创建的事项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MY_CREATED_ENTRY)
    def myCreatedEntry(RecentDTO dto) throws Throwable {
        return this.execute(ACTION_MY_CREATED_ENTRY, dto)
    }

    /**
     * 行为：我的任务总结 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MY_SUMMARY)
    def mySummary(RecentDTO dto) throws Throwable {
        return this.execute(ACTION_MY_SUMMARY, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：移动端首页_最近访问 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_HOME_RECENT_ACCESS)
    def fetchMobHomeRecentAccess(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_HOME_RECENT_ACCESS, context)
    }

    /**
     * 数据集：最近使用（10条） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ONLY_TEN_ACCESS_USE)
    def fetchOnlyTenAccessUse(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ONLY_TEN_ACCESS_USE, context)
    }

    /**
     * 数据集：最近访问 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_ACCESS)
    def fetchRecentAccess(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_ACCESS, context)
    }

    /**
     * 数据集：最近访问（逻辑生成） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_ACCESS_LOGIC)
    def fetchRecentAccessLogic(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_ACCESS_LOGIC, context)
    }

    /**
     * 数据集：最近浏览当前产品内工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_CURPRODUCT_TICKET)
    def fetchRecentCurproductTicket(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_CURPRODUCT_TICKET, context)
    }

    /**
     * 数据集：最近浏览当前项目子工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_CURPROJECT_CHILD_WORK_ITEM)
    def fetchRecentCurprojectChildWorkItem(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_CURPROJECT_CHILD_WORK_ITEM, context)
    }

    /**
     * 数据集：最近浏览当前项目工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_CURPROJECT_WORK_ITEM)
    def fetchRecentCurprojectWorkItem(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_CURPROJECT_WORK_ITEM, context)
    }

    /**
     * 数据集：最近浏览_需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_IDEA)
    def fetchRecentIdea(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_IDEA, context)
    }

    /**
     * 数据集：最近访问页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_PAGE)
    def fetchRecentPage(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_PAGE, context)
    }

    /**
     * 数据集：最近访问项目 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_PROJECT)
    def fetchRecentProject(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_PROJECT, context)
    }

    /**
     * 数据集：最近浏览_用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_TEST_CASE)
    def fetchRecentTestCase(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_TEST_CASE, context)
    }

    /**
     * 数据集：最近访问的用例_首页 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_TEST_CASE_INDEX)
    def fetchRecentTestCaseIndex(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_TEST_CASE_INDEX, context)
    }

    /**
     * 数据集：最近浏览_工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_TICKET)
    def fetchRecentTicket(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_TICKET, context)
    }

    /**
     * 数据集：最近使用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_USE)
    def fetchRecentUse(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_USE, context)
    }

    /**
     * 数据集：最近浏览_工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_WORK_ITEM)
    def fetchRecentWorkItem(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_WORK_ITEM, context)
    }

    /**
     * 数据集：最近浏览工作项且不含缺陷 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_WORK_ITEM_AND_NOBUG)
    def fetchRecentWorkItemAndNobug(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_WORK_ITEM_AND_NOBUG, context)
    }

    /**
     * 数据集：最近浏览_缺陷 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_WORK_ITEM_BUG)
    def fetchRecentWorkItemBug(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_WORK_ITEM_BUG, context)
    }

    /**
     * 数据集：最近浏览_工作项(依赖) 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_WORK_ITEM_DEPENDENCY)
    def fetchRecentWorkItemDependency(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_WORK_ITEM_DEPENDENCY, context)
    }

    /**
     * 数据集：本人最新访问 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    def fetchUser(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context)
    }

}