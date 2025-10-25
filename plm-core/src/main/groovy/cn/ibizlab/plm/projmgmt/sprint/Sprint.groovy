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
class Sprint extends GroovyDynaDataEntityRuntime<Sprint,SprintDTO,SprintFilterDTO> {

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
    private static Sprint _instance
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
    SprintDTO create(SprintDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SprintDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SprintDTO update(SprintDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SprintDTO.class)
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
    SprintDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SprintDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SprintDTO getDraft(SprintDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SprintDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SprintDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SprintDTO save(SprintDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SprintDTO.class)
    }

    /**
     * 行为：计算发布工作项数量 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_CAL_SPRINT_WORK_ITEM_NUM)
    def calSprintWorkItemNum(String key) throws Throwable {
        return this.execute(ACTION_CAL_SPRINT_WORK_ITEM_NUM, key, SprintDTO.class)
    }

    /**
     * 行为：发布取消关联迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DEL_RELATION)
    def delRelation(SprintDTO dto) throws Throwable {
        this.execute(ACTION_DEL_RELATION, dto, SprintDTO.class)
    }

    /**
     * 行为：删除类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_CATEGORIES)
    def deleteCategories(SprintDTO dto) throws Throwable {
        return this.execute(ACTION_DELETE_CATEGORIES, dto, SprintDTO.class)
    }

    /**
     * 行为：结束迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_END_SPRINT)
    def endSprint(SprintDTO dto) throws Throwable {
        this.execute(ACTION_END_SPRINT, dto, SprintDTO.class)
    }

    /**
     * 行为：行为 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_NOT_FINISH)
    def getNotFinish(String key) throws Throwable {
        return this.execute(ACTION_GET_NOT_FINISH, key, SprintDTO.class)
    }

    /**
     * 行为：获取概览基本信息 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_OVERVIEW)
    def overview(String key) throws Throwable {
        return this.execute(ACTION_OVERVIEW, key, SprintDTO.class)
    }

    /**
     * 行为：迭代关联发布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SPRINT_RELATION_RELEASE)
    def sprintRelationRelease(SprintDTO dto) throws Throwable {
        return this.execute(ACTION_SPRINT_RELATION_RELEASE, dto, SprintDTO.class)
    }

    /**
     * 行为：开始迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_START_SPRINT)
    def startSprint(SprintDTO dto) throws Throwable {
        this.execute(ACTION_START_SPRINT, dto, SprintDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SprintDTO> fetchDefault(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SprintDTO.class)
    }

    /**
     * 数据集：主表格查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<SprintDTO> fetchAll(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, SprintDTO.class)
    }

    /**
     * 数据集：BI反查 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_DETAIL)
    Page<SprintDTO> fetchBiDetail(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_DETAIL, context, SprintDTO.class)
    }

    /**
     * 数据集：BI查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    Page<SprintBiSearchGroupDTO> fetchBiSearch(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context, SprintBiSearchGroupDTO.class)
    }

    /**
     * 数据集：移动至 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_MOVE)
    Page<SprintDTO> fetchChooseMove(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_MOVE, context, SprintDTO.class)
    }

    /**
     * 数据集：选择关联的迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_SPRINT_RELATION)
    Page<SprintDTO> fetchChooseSprintRelation(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_SPRINT_RELATION, context, SprintDTO.class)
    }

    /**
     * 数据集：当前项目未完成的迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_SPRINT_NOT_FINISH)
    Page<SprintDTO> fetchCurSprintNotFinish(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_SPRINT_NOT_FINISH, context, SprintDTO.class)
    }

    /**
     * 数据集：项目下迭代（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_PROJECT_SPRINT)
    Page<SprintDTO> fetchMobProjectSprint(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_PROJECT_SPRINT, context, SprintDTO.class)
    }

    /**
     * 数据集：未结束的迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_FINISH)
    Page<SprintDTO> fetchNotFinish(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_FINISH, context, SprintDTO.class)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<SprintDTO> fetchReader(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, SprintDTO.class)
    }

    /**
     * 数据集：发布关联迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELEASE_RELATION)
    Page<SprintDTO> fetchReleaseRelation(SprintFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELEASE_RELATION, context, SprintDTO.class)
    }

}