package cn.ibizlab.plm.base.workload

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.workload.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[WORKLOAD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Workload extends GroovyDataEntityRuntime<Workload,WorkloadDTO,WorkloadFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_CREATE_WORKLOAD = "create_workload"
    public static final String ACTION_FILL_WORKLOAD_DATA = "fill_workload_data"
    public static final String ACTION_GET_REGISTER_WORKLOAD = "get_register_workload"
    public static final String ACTION_UPDATE_WORKLOAD = "update_workload"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_BI_DETAIL = "bi_detail"
    public static final String DATASET_BI_SEARCH = "bi_search"
    public static final String DATASET_CALENDAR = "calendar"
    public static final String DATASET_GROUP_MEMBER_DIMENSION = "group_member_dimension"
    public static final String DATASET_IDEA_DIMENSION = "idea_dimension"
    public static final String DATASET_IDEA_MANAGEMENT_DIMENSION = "idea_management_dimension"
    public static final String DATASET_IDEA_WORKLOAD = "idea_workload"
    public static final String DATASET_LOG = "log"
    public static final String DATASET_MEMBER_DIMENSION = "member_dimension"
    public static final String DATASET_MOB_CALENDAR = "mob_calendar"
    public static final String DATASET_MY_CALENDAR = "my_calendar"
    public static final String DATASET_MY_IDEA_WORKLOAD = "my_idea_workload"
    public static final String DATASET_MY_LOG = "my_log"
    public static final String DATASET_MY_MOB_LOG = "my_mob_log"
    public static final String DATASET_MY_TEST_CASE_WORKLOAD = "my_test_case_workload"
    public static final String DATASET_MY_TYPE_OF = "my_type_of"
    public static final String DATASET_MY_WORK_ITEM_WORKLOAD = "my_work_item_workload"
    public static final String DATASET_MY_WORKLOAD = "my_workload"
    public static final String DATASET_TEST_CASE_DIMENSION = "test_case_dimension"
    public static final String DATASET_TEST_CASE_MANAGEMENT_DIMENSION = "test_case_management_dimension"
    public static final String DATASET_TEST_CASE_WORKLOAD = "test_case_workload"
    public static final String DATASET_TYPE_OF = "type_of"
    public static final String DATASET_TYPE_OF_DIMENSION = "type_of_dimension"
    public static final String DATASET_TYPE_OF_MANAGEMENT_DIMENSION = "type_of_management_dimension"
    public static final String DATASET_USER_GROUP_DIMENSION = "user_group_dimension"
    public static final String DATASET_USER_GROUP_LINK = "user_group_link"
    public static final String DATASET_USER_GROUP_WORKLOAD = "user_group_workload"
    public static final String DATASET_WORK_ITEM_DIMENSION = "work_item_dimension"
    public static final String DATASET_WORK_ITEM_MANAGEMENT_DIMENSION = "work_item_management_dimension"
    public static final String DATASET_WORK_ITEM_WORKLOAD = "work_item_workload"
    private static Workload _instance;
    void setInstance(Workload instance) {
        _instance = instance
    }
    static Workload getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(WorkloadDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(WorkloadDTO dto) throws Throwable {
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
    def getDraft(WorkloadDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(WorkloadDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(WorkloadDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：登记工时并更新剩余工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_WORKLOAD)
    def createWorkload(WorkloadDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_WORKLOAD, dto)
    }

    /**
     * 行为：填充工时数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILL_WORKLOAD_DATA)
    def fillWorkloadData(WorkloadDTO dto) throws Throwable {
        this.execute(ACTION_FILL_WORKLOAD_DATA, dto)
    }

    /**
     * 行为：获取已登记工时 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_REGISTER_WORKLOAD)
    def getRegisterWorkload(String key) throws Throwable {
        return this.execute(ACTION_GET_REGISTER_WORKLOAD, key)
    }

    /**
     * 行为：修改工时并更新剩余工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE_WORKLOAD)
    def updateWorkload(WorkloadDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE_WORKLOAD, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：BI反查 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_DETAIL)
    def fetchBiDetail(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_DETAIL, context)
    }

    /**
     * 数据集：BI查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    def fetchBiSearch(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context)
    }

    /**
     * 数据集：工时日历 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CALENDAR)
    def fetchCalendar(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CALENDAR, context)
    }

    /**
     * 数据集：团队下成员维度工时日历 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_GROUP_MEMBER_DIMENSION)
    def fetchGroupMemberDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_GROUP_MEMBER_DIMENSION, context)
    }

    /**
     * 数据集：产品需求维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_DIMENSION)
    def fetchIdeaDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_DIMENSION, context)
    }

    /**
     * 数据集：产品需求管理维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_MANAGEMENT_DIMENSION)
    def fetchIdeaManagementDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_MANAGEMENT_DIMENSION, context)
    }

    /**
     * 数据集：产品需求工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_WORKLOAD)
    def fetchIdeaWorkload(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_WORKLOAD, context)
    }

    /**
     * 数据集：工时日志 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_LOG)
    def fetchLog(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_LOG, context)
    }

    /**
     * 数据集：人员维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MEMBER_DIMENSION)
    def fetchMemberDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MEMBER_DIMENSION, context)
    }

    /**
     * 数据集：工时日历移动端 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_CALENDAR)
    def fetchMobCalendar(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_CALENDAR, context)
    }

    /**
     * 数据集：我的工时日历 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_CALENDAR)
    def fetchMyCalendar(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_CALENDAR, context)
    }

    /**
     * 数据集：我的产品需求工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_IDEA_WORKLOAD)
    def fetchMyIdeaWorkload(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_IDEA_WORKLOAD, context)
    }

    /**
     * 数据集：我登记的工时日志 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_LOG)
    def fetchMyLog(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_LOG, context)
    }

    /**
     * 数据集：工时日志 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_MOB_LOG)
    def fetchMyMobLog(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_MOB_LOG, context)
    }

    /**
     * 数据集：我的测试用例工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_TEST_CASE_WORKLOAD)
    def fetchMyTestCaseWorkload(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_TEST_CASE_WORKLOAD, context)
    }

    /**
     * 数据集：我的工作类别记录 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_TYPE_OF)
    def fetchMyTypeOf(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_TYPE_OF, context)
    }

    /**
     * 数据集：我的工作项工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_WORK_ITEM_WORKLOAD)
    def fetchMyWorkItemWorkload(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_WORK_ITEM_WORKLOAD, context)
    }

    /**
     * 数据集：我的工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_WORKLOAD)
    def fetchMyWorkload(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_WORKLOAD, context)
    }

    /**
     * 数据集：测试用例维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_CASE_DIMENSION)
    def fetchTestCaseDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_CASE_DIMENSION, context)
    }

    /**
     * 数据集：测试用例管理维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_CASE_MANAGEMENT_DIMENSION)
    def fetchTestCaseManagementDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_CASE_MANAGEMENT_DIMENSION, context)
    }

    /**
     * 数据集：测试用例工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_CASE_WORKLOAD)
    def fetchTestCaseWorkload(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_CASE_WORKLOAD, context)
    }

    /**
     * 数据集：工作类别记录 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TYPE_OF)
    def fetchTypeOf(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TYPE_OF, context)
    }

    /**
     * 数据集：工作类别维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TYPE_OF_DIMENSION)
    def fetchTypeOfDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TYPE_OF_DIMENSION, context)
    }

    /**
     * 数据集：工作类别管理维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TYPE_OF_MANAGEMENT_DIMENSION)
    def fetchTypeOfManagementDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TYPE_OF_MANAGEMENT_DIMENSION, context)
    }

    /**
     * 数据集：团队维度工时日历查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER_GROUP_DIMENSION)
    def fetchUserGroupDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER_GROUP_DIMENSION, context)
    }

    /**
     * 数据集：团队维度日历链接 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER_GROUP_LINK)
    def fetchUserGroupLink(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER_GROUP_LINK, context)
    }

    /**
     * 数据集：团队工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER_GROUP_WORKLOAD)
    def fetchUserGroupWorkload(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER_GROUP_WORKLOAD, context)
    }

    /**
     * 数据集：工作项维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_DIMENSION)
    def fetchWorkItemDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_DIMENSION, context)
    }

    /**
     * 数据集：工作项管理维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_MANAGEMENT_DIMENSION)
    def fetchWorkItemManagementDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_MANAGEMENT_DIMENSION, context)
    }

    /**
     * 数据集：工作项工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_WORKLOAD)
    def fetchWorkItemWorkload(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_WORKLOAD, context)
    }

}