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

    public static final String ACTION_CREATE_WORKLOAD = "create_workload"
    public static final String ACTION_FILL_WORKLOAD_DATA = "fill_workload_data"
    public static final String ACTION_GET_REDIRECT_DATA = "get_redirect_data"
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
    private static Workload _instance
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
    WorkloadDTO create(WorkloadDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, WorkloadDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    WorkloadDTO update(WorkloadDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, WorkloadDTO.class)
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
    WorkloadDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, WorkloadDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    WorkloadDTO getDraft(WorkloadDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, WorkloadDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(WorkloadDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    WorkloadDTO save(WorkloadDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, WorkloadDTO.class)
    }

    /**
     * 行为：登记工时并更新剩余工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_WORKLOAD)
    def createWorkload(WorkloadDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_WORKLOAD, dto, WorkloadDTO.class)
    }

    /**
     * 行为：填充工时数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILL_WORKLOAD_DATA)
    def fillWorkloadData(WorkloadDTO dto) throws Throwable {
        this.execute(ACTION_FILL_WORKLOAD_DATA, dto, WorkloadDTO.class)
    }

    /**
     * 行为：获取重定向数据 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_REDIRECT_DATA)
    def getRedirectData(String key) throws Throwable {
        return this.execute(ACTION_GET_REDIRECT_DATA, key, WorkloadDTO.class)
    }

    /**
     * 行为：获取已登记工时 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_REGISTER_WORKLOAD)
    def getRegisterWorkload(String key) throws Throwable {
        return this.execute(ACTION_GET_REGISTER_WORKLOAD, key, WorkloadDTO.class)
    }

    /**
     * 行为：修改工时并更新剩余工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE_WORKLOAD)
    def updateWorkload(WorkloadDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE_WORKLOAD, dto, WorkloadDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<WorkloadDTO> fetchDefault(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, WorkloadDTO.class)
    }

    /**
     * 数据集：BI反查 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_DETAIL)
    Page<WorkloadDTO> fetchBiDetail(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_DETAIL, context, WorkloadDTO.class)
    }

    /**
     * 数据集：BI查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    Page<WorkloadBiSearchGroupDTO> fetchBiSearch(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context, WorkloadBiSearchGroupDTO.class)
    }

    /**
     * 数据集：工时日历 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CALENDAR)
    Page<WorkloadDTO> fetchCalendar(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CALENDAR, context, WorkloadDTO.class)
    }

    /**
     * 数据集：团队下成员维度工时日历 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_GROUP_MEMBER_DIMENSION)
    Page<WorkloadDTO> fetchGroupMemberDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_GROUP_MEMBER_DIMENSION, context, WorkloadDTO.class)
    }

    /**
     * 数据集：产品需求维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_DIMENSION)
    Page<WorkloadDTO> fetchIdeaDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_DIMENSION, context, WorkloadDTO.class)
    }

    /**
     * 数据集：产品需求管理维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_MANAGEMENT_DIMENSION)
    Page<WorkloadDTO> fetchIdeaManagementDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_MANAGEMENT_DIMENSION, context, WorkloadDTO.class)
    }

    /**
     * 数据集：产品需求工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_WORKLOAD)
    Page<WorkloadDTO> fetchIdeaWorkload(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_WORKLOAD, context, WorkloadDTO.class)
    }

    /**
     * 数据集：工时日志 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_LOG)
    Page<WorkloadDTO> fetchLog(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_LOG, context, WorkloadDTO.class)
    }

    /**
     * 数据集：人员维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MEMBER_DIMENSION)
    Page<WorkloadDTO> fetchMemberDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MEMBER_DIMENSION, context, WorkloadDTO.class)
    }

    /**
     * 数据集：工时日历移动端 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_CALENDAR)
    Page<WorkloadDTO> fetchMobCalendar(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_CALENDAR, context, WorkloadDTO.class)
    }

    /**
     * 数据集：我的工时日历 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_CALENDAR)
    Page<WorkloadDTO> fetchMyCalendar(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_CALENDAR, context, WorkloadDTO.class)
    }

    /**
     * 数据集：我的产品需求工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_IDEA_WORKLOAD)
    Page<WorkloadDTO> fetchMyIdeaWorkload(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_IDEA_WORKLOAD, context, WorkloadDTO.class)
    }

    /**
     * 数据集：我登记的工时日志 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_LOG)
    Page<WorkloadDTO> fetchMyLog(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_LOG, context, WorkloadDTO.class)
    }

    /**
     * 数据集：工时日志 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_MOB_LOG)
    Page<WorkloadDTO> fetchMyMobLog(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_MOB_LOG, context, WorkloadDTO.class)
    }

    /**
     * 数据集：我的测试用例工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_TEST_CASE_WORKLOAD)
    Page<WorkloadDTO> fetchMyTestCaseWorkload(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_TEST_CASE_WORKLOAD, context, WorkloadDTO.class)
    }

    /**
     * 数据集：我的工作类别记录 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_TYPE_OF)
    Page<WorkloadDTO> fetchMyTypeOf(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_TYPE_OF, context, WorkloadDTO.class)
    }

    /**
     * 数据集：我的工作项工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_WORK_ITEM_WORKLOAD)
    Page<WorkloadDTO> fetchMyWorkItemWorkload(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_WORK_ITEM_WORKLOAD, context, WorkloadDTO.class)
    }

    /**
     * 数据集：我的工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_WORKLOAD)
    Page<WorkloadDTO> fetchMyWorkload(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_WORKLOAD, context, WorkloadDTO.class)
    }

    /**
     * 数据集：测试用例维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_CASE_DIMENSION)
    Page<WorkloadDTO> fetchTestCaseDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_CASE_DIMENSION, context, WorkloadDTO.class)
    }

    /**
     * 数据集：测试用例管理维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_CASE_MANAGEMENT_DIMENSION)
    Page<WorkloadDTO> fetchTestCaseManagementDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_CASE_MANAGEMENT_DIMENSION, context, WorkloadDTO.class)
    }

    /**
     * 数据集：测试用例工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_CASE_WORKLOAD)
    Page<WorkloadDTO> fetchTestCaseWorkload(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_CASE_WORKLOAD, context, WorkloadDTO.class)
    }

    /**
     * 数据集：工作类别记录 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TYPE_OF)
    Page<WorkloadDTO> fetchTypeOf(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TYPE_OF, context, WorkloadDTO.class)
    }

    /**
     * 数据集：工作类别维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TYPE_OF_DIMENSION)
    Page<WorkloadDTO> fetchTypeOfDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TYPE_OF_DIMENSION, context, WorkloadDTO.class)
    }

    /**
     * 数据集：工作类别管理维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TYPE_OF_MANAGEMENT_DIMENSION)
    Page<WorkloadDTO> fetchTypeOfManagementDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TYPE_OF_MANAGEMENT_DIMENSION, context, WorkloadDTO.class)
    }

    /**
     * 数据集：团队维度工时日历查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER_GROUP_DIMENSION)
    Page<WorkloadDTO> fetchUserGroupDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER_GROUP_DIMENSION, context, WorkloadDTO.class)
    }

    /**
     * 数据集：团队维度日历链接 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER_GROUP_LINK)
    Page<WorkloadDTO> fetchUserGroupLink(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER_GROUP_LINK, context, WorkloadDTO.class)
    }

    /**
     * 数据集：团队工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER_GROUP_WORKLOAD)
    Page<WorkloadDTO> fetchUserGroupWorkload(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER_GROUP_WORKLOAD, context, WorkloadDTO.class)
    }

    /**
     * 数据集：工作项维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_DIMENSION)
    Page<WorkloadDTO> fetchWorkItemDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_DIMENSION, context, WorkloadDTO.class)
    }

    /**
     * 数据集：工作项管理维度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_MANAGEMENT_DIMENSION)
    Page<WorkloadDTO> fetchWorkItemManagementDimension(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_MANAGEMENT_DIMENSION, context, WorkloadDTO.class)
    }

    /**
     * 数据集：工作项工时 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_WORKLOAD)
    Page<WorkloadDTO> fetchWorkItemWorkload(WorkloadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_WORKLOAD, context, WorkloadDTO.class)
    }

}