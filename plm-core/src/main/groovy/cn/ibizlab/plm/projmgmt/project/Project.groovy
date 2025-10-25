package cn.ibizlab.plm.projmgmt.project

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.project.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PROJECT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Project extends GroovyDynaDataEntityRuntime<Project,ProjectDTO,ProjectFilterDTO> {

    public static final String ACTION_ACTIVATE = "activate"
    public static final String ACTION_ARCHIVE = "archive"
    public static final String ACTION_CHANGE_ADMIN_ROLE = "change_admin_role"
    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_FAVORITE = "favorite"
    public static final String ACTION_GET_MAJOR_DATA = "get_major_data"
    public static final String ACTION_HYBRID_INDEX_ADDON_COUNTER = "hybrid_index_addon_counter"
    public static final String ACTION_KANBAN_INDEX_ADDON_COUNTER = "kanban_index_addon_counter"
    public static final String ACTION_OTHER_RE_PROJECT = "other_re_project"
    public static final String ACTION_OTHER_RE_SPACE = "other_re_space"
    public static final String ACTION_PROJECT_AUTOMATIC_CHANGE_STATE = "project_automatic_change_state"
    public static final String ACTION_PROJECT_MOVE = "project_move"
    public static final String ACTION_RECOVER = "recover"
    public static final String ACTION_REMOVE_FROM_PROJECT_SET = "remove_from_project_set"
    public static final String ACTION_SCRUM_INDEX_ADDON_COUNTER = "scrum_index_addon_counter"
    public static final String ACTION_UN_FAVORITE = "un_favorite"
    public static final String ACTION_WARNING_COUNT_LOGIC = "warning_count_logic"
    public static final String ACTION_WATERFALL_INDEX_ADDON_COUNTER = "waterfall_index_addon_counter"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_VIEW = "VIEW"
    public static final String DATASET_ADMIN = "admin"
    public static final String DATASET_ARCHIVED = "archived"
    public static final String DATASET_BI_DETAIL = "bi_detail"
    public static final String DATASET_BI_SEARCH = "bi_search"
    public static final String DATASET_CHOOSE_PROJECT = "choose_project"
    public static final String DATASET_CURRENT = "current"
    public static final String DATASET_DELETED = "deleted"
    public static final String DATASET_FAVORITE = "favorite"
    public static final String DATASET_MAIN = "main"
    public static final String DATASET_MOB_MAIN = "mob_main"
    public static final String DATASET_NO_RELATION = "no_relation"
    public static final String DATASET_NORMAL = "normal"
    public static final String DATASET_PRODUCT_RE_PROJECT = "product_re_project"
    public static final String DATASET_QUICK = "quick"
    public static final String DATASET_QUICK_USER = "quick_user"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_SAME_TYPE = "same_type"
    public static final String DATASET_UNDER_PROJECT_PORTFOLIO = "under_project_portfolio"
    public static final String DATASET_USER = "user"
    public static final String DATASET_WORK_PROJECT = "work_project"
    private static Project _instance
    void setInstance(Project instance) {
        _instance = instance
    }
    static Project getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ProjectDTO create(ProjectDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ProjectDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ProjectDTO update(ProjectDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ProjectDTO.class)
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
    ProjectDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ProjectDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ProjectDTO getDraft(ProjectDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ProjectDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ProjectDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ProjectDTO save(ProjectDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ProjectDTO.class)
    }

    /**
     * 行为：激活 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ACTIVATE)
    def activate(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_ACTIVATE, dto, ProjectDTO.class)
    }

    /**
     * 行为：归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ARCHIVE)
    def archive(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_ARCHIVE, dto, ProjectDTO.class)
    }

    /**
     * 行为：变更管理员角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ADMIN_ROLE)
    def changeAdminRole(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ADMIN_ROLE, dto, ProjectDTO.class)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto, ProjectDTO.class)
    }

    /**
     * 行为：设置星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FAVORITE)
    def favorite(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_FAVORITE, dto, ProjectDTO.class)
    }

    /**
     * 行为：获取主数据 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_MAJOR_DATA)
    def getMajorData(String key) throws Throwable {
        return this.execute(ACTION_GET_MAJOR_DATA, key, ProjectRedirctDefGroupDTO.class)
    }

    /**
     * 行为：混合项目组件计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_HYBRID_INDEX_ADDON_COUNTER)
    def hybridIndexAddonCounter(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_HYBRID_INDEX_ADDON_COUNTER, dto, ProjectDTO.class)
    }

    /**
     * 行为：看板项目首页组件计数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_KANBAN_INDEX_ADDON_COUNTER)
    def kanbanIndexAddonCounter(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_KANBAN_INDEX_ADDON_COUNTER, dto, ProjectDTO.class)
    }

    /**
     * 行为：关联项目 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_OTHER_RE_PROJECT)
    def otherReProject(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_OTHER_RE_PROJECT, dto, ProjectDTO.class)
    }

    /**
     * 行为：其他实体关联空间 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_OTHER_RE_SPACE)
    def otherReSpace(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_OTHER_RE_SPACE, dto, ProjectDTO.class)
    }

    /**
     * 行为：刷新项目状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PROJECT_AUTOMATIC_CHANGE_STATE)
    def projectAutomaticChangeState(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_PROJECT_AUTOMATIC_CHANGE_STATE, dto, ProjectDTO.class)
    }

    /**
     * 行为：移动项目 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PROJECT_MOVE)
    def projectMove(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_PROJECT_MOVE, dto, ProjectDTO.class)
    }

    /**
     * 行为：恢复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER)
    def recover(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER, dto, ProjectDTO.class)
    }

    /**
     * 行为：从项目集中移除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE_FROM_PROJECT_SET)
    def removeFromProjectSet(ProjectDTO dto) throws Throwable {
        return this.execute(ACTION_REMOVE_FROM_PROJECT_SET, dto, ProjectDTO.class)
    }

    /**
     * 行为：敏捷项目首页组件计数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SCRUM_INDEX_ADDON_COUNTER)
    def scrumIndexAddonCounter(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_SCRUM_INDEX_ADDON_COUNTER, dto, ProjectDTO.class)
    }

    /**
     * 行为：取消星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UN_FAVORITE)
    def unFavorite(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_UN_FAVORITE, dto, ProjectDTO.class)
    }

    /**
     * 行为：预警计数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_WARNING_COUNT_LOGIC)
    def warningCountLogic(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_WARNING_COUNT_LOGIC, dto, ProjectDTO.class)
    }

    /**
     * 行为：瀑布项目首页组件计数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_WATERFALL_INDEX_ADDON_COUNTER)
    def waterfallIndexAddonCounter(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_WATERFALL_INDEX_ADDON_COUNTER, dto, ProjectDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ProjectDTO> fetchDefault(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ProjectDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_VIEW)
    Page<ProjectDTO> fetchVIEW(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_VIEW, context, ProjectDTO.class)
    }

    /**
     * 数据集：管理员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADMIN)
    Page<ProjectDTO> fetchAdmin(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADMIN, context, ProjectDTO.class)
    }

    /**
     * 数据集：已归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ARCHIVED)
    Page<ProjectDTO> fetchArchived(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ARCHIVED, context, ProjectDTO.class)
    }

    /**
     * 数据集：BI反查 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_DETAIL)
    Page<ProjectDTO> fetchBiDetail(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_DETAIL, context, ProjectDTO.class)
    }

    /**
     * 数据集：BI查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    Page<ProjectBiSearchGroupDTO> fetchBiSearch(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context, ProjectBiSearchGroupDTO.class)
    }

    /**
     * 数据集：选择项目 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_PROJECT)
    Page<ProjectDTO> fetchChooseProject(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_PROJECT, context, ProjectDTO.class)
    }

    /**
     * 数据集：当前项目 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CURRENT)
    Page<ProjectDTO> fetchCurrent(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CURRENT, context, ProjectDTO.class)
    }

    /**
     * 数据集：已删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DELETED)
    Page<ProjectDTO> fetchDeleted(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DELETED, context, ProjectDTO.class)
    }

    /**
     * 数据集：查询星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FAVORITE)
    Page<ProjectDTO> fetchFavorite(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FAVORITE, context, ProjectDTO.class)
    }

    /**
     * 数据集：主表格查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MAIN)
    Page<ProjectDTO> fetchMain(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MAIN, context, ProjectDTO.class)
    }

    /**
     * 数据集：主查询（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_MAIN)
    Page<ProjectDTO> fetchMobMain(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_MAIN, context, ProjectDTO.class)
    }

    /**
     * 数据集：未关联的项目 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_RELATION)
    Page<ProjectDTO> fetchNoRelation(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_RELATION, context, ProjectDTO.class)
    }

    /**
     * 数据集：正常状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    Page<ProjectDTO> fetchNormal(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context, ProjectDTO.class)
    }

    /**
     * 数据集：产品关联项目 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PRODUCT_RE_PROJECT)
    Page<ProjectDTO> fetchProductReProject(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PRODUCT_RE_PROJECT, context, ProjectDTO.class)
    }

    /**
     * 数据集：快速新建查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_QUICK)
    Page<ProjectDTO> fetchQuick(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_QUICK, context, ProjectDTO.class)
    }

    /**
     * 数据集：快速新建查询（管理用户） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_QUICK_USER)
    Page<ProjectDTO> fetchQuickUser(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_QUICK_USER, context, ProjectDTO.class)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<ProjectDTO> fetchReader(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, ProjectDTO.class)
    }

    /**
     * 数据集：相同类型项目 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SAME_TYPE)
    Page<ProjectDTO> fetchSameType(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SAME_TYPE, context, ProjectDTO.class)
    }

    /**
     * 数据集：项目集下的项目 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_UNDER_PROJECT_PORTFOLIO)
    Page<ProjectDTO> fetchUnderProjectPortfolio(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_UNDER_PROJECT_PORTFOLIO, context, ProjectDTO.class)
    }

    /**
     * 数据集：操作用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    Page<ProjectDTO> fetchUser(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context, ProjectDTO.class)
    }

    /**
     * 数据集：项目集工作下的项目 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_PROJECT)
    Page<ProjectDTO> fetchWorkProject(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_PROJECT, context, ProjectDTO.class)
    }

}