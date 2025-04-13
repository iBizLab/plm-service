package cn.ibizlab.plm.projmgmt.sprint

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.sprint.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SPRINT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Sprint extends GroovyDataEntityRuntime<Sprint,SprintDTO,SprintFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_CAL_SPRINT_WORK_ITEM_NUM = "cal_sprint_work_item_num"
    public static final String ACTION_DEL_RELATION = "del_relation"
    public static final String ACTION_DELETE_CATEGORIES = "delete_categories"
    public static final String ACTION_END_SPRINT = "end_sprint"
    public static final String ACTION_GET_NOT_FINISH = "get_not_finish"
    public static final String ACTION_OVERVIEW = "overview"
    public static final String ACTION_SPRINT_RELATION_RELEASE = "sprint_relation_release"
    public static final String ACTION_START_SPRINT = "start_sprint"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_BI_DETAIL = "bi_detail"
    public static final String DATASET_BI_SEARCH = "bi_search"
    public static final String DATASET_CHOOSE_MOVE = "choose_move"
    public static final String DATASET_CHOOSE_SPRINT_RELATION = "choose_sprint_relation"
    public static final String DATASET_CUR_SPRINT_NOT_FINISH = "cur_sprint_not_finish"
    public static final String DATASET_MOB_PROJECT_SPRINT = "mob_project_sprint"
    public static final String DATASET_NOT_FINISH = "not_finish"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_RELEASE_RELATION = "release_relation"
    private static Sprint _instance;
    void setInstance(Sprint instance) {
        _instance = instance
    }
    static Sprint getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(SprintDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(SprintDTO dto) throws Throwable {
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
    def getDraft(SprintDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(SprintDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(SprintDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：计算发布工作项数量 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_CAL_SPRINT_WORK_ITEM_NUM)
    def calSprintWorkItemNum(String key) throws Throwable {
        return this.execute(ACTION_CAL_SPRINT_WORK_ITEM_NUM, key)
    }

    /**
     * 行为：发布取消关联迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DEL_RELATION)
    def delRelation(SprintDTO dto) throws Throwable {
        this.execute(ACTION_DEL_RELATION, dto)
    }

    /**
     * 行为：删除类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_CATEGORIES)
    def deleteCategories(SprintDTO dto) throws Throwable {
        return this.execute(ACTION_DELETE_CATEGORIES, dto)
    }

    /**
     * 行为：结束迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_END_SPRINT)
    def endSprint(SprintDTO dto) throws Throwable {
        this.execute(ACTION_END_SPRINT, dto)
    }

    /**
     * 行为：行为 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_NOT_FINISH)
    def getNotFinish(String key) throws Throwable {
        return this.execute(ACTION_GET_NOT_FINISH, key)
    }

    /**
     * 行为：获取概览基本信息 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_OVERVIEW)
    def overview(String key) throws Throwable {
        return this.execute(ACTION_OVERVIEW, key)
    }

    /**
     * 行为：迭代关联发布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SPRINT_RELATION_RELEASE)
    def sprintRelationRelease(SprintDTO dto) throws Throwable {
        return this.execute(ACTION_SPRINT_RELATION_RELEASE, dto)
    }

    /**
     * 行为：开始迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_START_SPRINT)
    def startSprint(SprintDTO dto) throws Throwable {
        this.execute(ACTION_START_SPRINT, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：主表格查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    def fetchAll(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context)
    }

    /**
     * 数据集：BI反查 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_DETAIL)
    def fetchBiDetail(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_DETAIL, context)
    }

    /**
     * 数据集：BI查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    def fetchBiSearch(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context)
    }

    /**
     * 数据集：移动至 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_MOVE)
    def fetchChooseMove(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_MOVE, context)
    }

    /**
     * 数据集：选择关联的迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_SPRINT_RELATION)
    def fetchChooseSprintRelation(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_SPRINT_RELATION, context)
    }

    /**
     * 数据集：当前项目未完成的迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_SPRINT_NOT_FINISH)
    def fetchCurSprintNotFinish(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_SPRINT_NOT_FINISH, context)
    }

    /**
     * 数据集：项目下迭代（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_PROJECT_SPRINT)
    def fetchMobProjectSprint(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_PROJECT_SPRINT, context)
    }

    /**
     * 数据集：未结束的迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_FINISH)
    def fetchNotFinish(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_FINISH, context)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    def fetchReader(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context)
    }

    /**
     * 数据集：发布关联迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELEASE_RELATION)
    def fetchReleaseRelation(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELEASE_RELATION, context)
    }

}