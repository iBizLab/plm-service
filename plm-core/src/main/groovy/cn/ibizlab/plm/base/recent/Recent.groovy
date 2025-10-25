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
class Recent extends GroovyDynaDataEntityRuntime<Recent,RecentDTO,RecentFilterDTO> {

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
    private static Recent _instance
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
    RecentDTO create(RecentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, RecentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    RecentDTO update(RecentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, RecentDTO.class)
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
    RecentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, RecentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    RecentDTO getDraft(RecentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, RecentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(RecentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    RecentDTO save(RecentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, RecentDTO.class)
    }

    /**
     * 行为：我负责的事项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MY_CHARGE_ENTRY)
    def myChargeEntry(RecentDTO dto) throws Throwable {
        return this.execute(ACTION_MY_CHARGE_ENTRY, dto, RecentDTO.class)
    }

    /**
     * 行为：我创建的事项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MY_CREATED_ENTRY)
    def myCreatedEntry(RecentDTO dto) throws Throwable {
        return this.execute(ACTION_MY_CREATED_ENTRY, dto, RecentDTO.class)
    }

    /**
     * 行为：我的任务总结 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MY_SUMMARY)
    def mySummary(RecentDTO dto) throws Throwable {
        return this.execute(ACTION_MY_SUMMARY, dto, RecentDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<RecentDTO> fetchDefault(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, RecentDTO.class)
    }

    /**
     * 数据集：移动端首页_最近访问 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_HOME_RECENT_ACCESS)
    Page<RecentDTO> fetchMobHomeRecentAccess(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_HOME_RECENT_ACCESS, context, RecentDTO.class)
    }

    /**
     * 数据集：最近使用（10条） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ONLY_TEN_ACCESS_USE)
    Page<RecentDTO> fetchOnlyTenAccessUse(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ONLY_TEN_ACCESS_USE, context, RecentDTO.class)
    }

    /**
     * 数据集：最近访问 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_ACCESS)
    Page<RecentDTO> fetchRecentAccess(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_ACCESS, context, RecentDTO.class)
    }

    /**
     * 数据集：最近访问（逻辑生成） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_ACCESS_LOGIC)
    Page<RecentDTO> fetchRecentAccessLogic(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_ACCESS_LOGIC, context, RecentDTO.class)
    }

    /**
     * 数据集：最近浏览当前产品内工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_CURPRODUCT_TICKET)
    Page<RecentDTO> fetchRecentCurproductTicket(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_CURPRODUCT_TICKET, context, RecentDTO.class)
    }

    /**
     * 数据集：最近浏览当前项目子工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_CURPROJECT_CHILD_WORK_ITEM)
    Page<RecentDTO> fetchRecentCurprojectChildWorkItem(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_CURPROJECT_CHILD_WORK_ITEM, context, RecentDTO.class)
    }

    /**
     * 数据集：最近浏览当前项目工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_CURPROJECT_WORK_ITEM)
    Page<RecentDTO> fetchRecentCurprojectWorkItem(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_CURPROJECT_WORK_ITEM, context, RecentDTO.class)
    }

    /**
     * 数据集：最近浏览_需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_IDEA)
    Page<RecentDTO> fetchRecentIdea(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_IDEA, context, RecentDTO.class)
    }

    /**
     * 数据集：最近访问页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_PAGE)
    Page<RecentDTO> fetchRecentPage(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_PAGE, context, RecentDTO.class)
    }

    /**
     * 数据集：最近访问项目 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_PROJECT)
    Page<RecentDTO> fetchRecentProject(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_PROJECT, context, RecentDTO.class)
    }

    /**
     * 数据集：最近浏览_用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_TEST_CASE)
    Page<RecentDTO> fetchRecentTestCase(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_TEST_CASE, context, RecentDTO.class)
    }

    /**
     * 数据集：最近访问的用例_首页 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_TEST_CASE_INDEX)
    Page<RecentDTO> fetchRecentTestCaseIndex(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_TEST_CASE_INDEX, context, RecentDTO.class)
    }

    /**
     * 数据集：最近浏览_工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_TICKET)
    Page<RecentDTO> fetchRecentTicket(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_TICKET, context, RecentDTO.class)
    }

    /**
     * 数据集：最近使用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_USE)
    Page<RecentDTO> fetchRecentUse(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_USE, context, RecentDTO.class)
    }

    /**
     * 数据集：最近浏览_工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_WORK_ITEM)
    Page<RecentDTO> fetchRecentWorkItem(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_WORK_ITEM, context, RecentDTO.class)
    }

    /**
     * 数据集：最近浏览工作项且不含缺陷 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_WORK_ITEM_AND_NOBUG)
    Page<RecentDTO> fetchRecentWorkItemAndNobug(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_WORK_ITEM_AND_NOBUG, context, RecentDTO.class)
    }

    /**
     * 数据集：最近浏览_缺陷 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_WORK_ITEM_BUG)
    Page<RecentDTO> fetchRecentWorkItemBug(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_WORK_ITEM_BUG, context, RecentDTO.class)
    }

    /**
     * 数据集：最近浏览_工作项(依赖) 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECENT_WORK_ITEM_DEPENDENCY)
    Page<RecentDTO> fetchRecentWorkItemDependency(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECENT_WORK_ITEM_DEPENDENCY, context, RecentDTO.class)
    }

    /**
     * 数据集：本人最新访问 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    Page<RecentDTO> fetchUser(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context, RecentDTO.class)
    }

}