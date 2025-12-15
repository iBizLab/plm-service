package cn.ibizlab.plm.wiki.articlepage

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.wiki.articlepage.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PAGE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ArticlePage extends GroovyDynaDataEntityRuntime<ArticlePage,ArticlePageDTO,ArticlePageFilterDTO> {

    public static final String ACTION_AI_CREATE_PAGE = "ai_create_page"
    public static final String ACTION_CHECK_ACCESS_PASSWORD = "check_access_password"
    public static final String ACTION_CHECK_SHARED = "check_shared"
    public static final String ACTION_CLOSED_SHARED = "closed_shared"
    public static final String ACTION_COMMIT_VERSION = "commit_version"
    public static final String ACTION_COPY_PAGE = "copy_page"
    public static final String ACTION_COUNT_COMMENT = "count_comment"
    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_EXPORT_TO_PDF = "export_to_pdf"
    public static final String ACTION_FAVORITE = "favorite"
    public static final String ACTION_FINISH_ADD_ATTENTION = "finish_add_attention"
    public static final String ACTION_GET_DRAFT_PAGES = "get_draft_pages"
    public static final String ACTION_LOCK_PAGE = "lock_page"
    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String ACTION_MOVE_PAGE = "move_page"
    public static final String ACTION_SET_NAME_VERSION = "set_name_version"
    public static final String ACTION_PUBLISH_NAME = "publish_name"
    public static final String ACTION_PUBLISH_PAGE = "publish_page"
    public static final String ACTION_RECOVER = "recover"
    public static final String ACTION_RECOVER_VERSION = "recover_version"
    public static final String ACTION_SAVE_TO_STENCIL = "save_to_stencil"
    public static final String ACTION_SHARED = "shared"
    public static final String ACTION_SHARED_SETTING = "shared_setting"
    public static final String ACTION_SHARED_URL = "shared_url"
    public static final String ACTION_UN_FAVORITE = "un_favorite"
    public static final String ACTION_UNLOCK_PAGE = "unlock_page"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ADVANCED_SEARCH = "advanced_search"
    public static final String DATASET_AI_INFO = "ai_info"
    public static final String DATASET_ALL_SHARED_PAGES = "all_shared_pages"
    public static final String DATASET_BASELINE_CHOOSE_PAGE = "baseline_choose_page"
    public static final String DATASET_BASELINE_PLAN_PAGE = "baseline_plan_page"
    public static final String DATASET_CHOOSE_SHARED = "choose_shared"
    public static final String DATASET_DRAFT_PAGE = "draft_page"
    public static final String DATASET_HOME_PAGE = "home_page"
    public static final String DATASET_IS_DELETED = "is_deleted"
    public static final String DATASET_MY_FAVORITE_PAGE = "my_favorite_page"
    public static final String DATASET_MY_FILTER = "my_filter"
    public static final String DATASET_NO_PARENT_PAGE = "no_parent_page"
    public static final String DATASET_NORMAL = "normal"
    public static final String DATASET_NORMAL_TREE_PAGE = "normal_tree_page"
    public static final String DATASET_ONLY_PAGE = "only_page"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_SHARED_PAGE = "shared_page"
    public static final String DATASET_SHARED_READER = "shared_reader"
    public static final String DATASET_SHARED_SEARCH = "shared_search"
    public static final String DATASET_SHARED_SUB_PAGES = "shared_sub_pages"
    public static final String DATASET_SHARED_WITH_ME = "shared_with_me"
    public static final String DATASET_SHARED_WITH_ME_EDIT = "shared_with_me_edit"
    public static final String DATASET_SPACE_SHARED_HOME = "space_shared_home"
    public static final String DATASET_SPACE_SHARED_PAGES = "space_shared_pages"
    public static final String DATASET_SPACE_SHARED_SEARCH = "space_shared_search"
    public static final String DATASET_SPACE_SHARED_TOP = "space_shared_top"
    private static ArticlePage _instance
    void setInstance(ArticlePage instance) {
        _instance = instance
    }
    static ArticlePage getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ArticlePageDTO create(ArticlePageDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ArticlePageDTO update(ArticlePageDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ArticlePageDTO.class)
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
    ArticlePageDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ArticlePageDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ArticlePageDTO getDraft(ArticlePageDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ArticlePageDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ArticlePageDTO save(ArticlePageDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：AI创建页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_AI_CREATE_PAGE)
    def aiCreatePage(ArticlePageDTO dto) throws Throwable {
        return this.execute(ACTION_AI_CREATE_PAGE, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：校验共享访问密码 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECK_ACCESS_PASSWORD)
    def checkAccessPassword(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_CHECK_ACCESS_PASSWORD, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：检验共享页面 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_CHECK_SHARED)
    def checkShared(String key) throws Throwable {
        return this.execute(ACTION_CHECK_SHARED, key, ArticlePageDTO.class)
    }

    /**
     * 行为：关闭共享 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CLOSED_SHARED)
    def closedShared(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_CLOSED_SHARED, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：生成版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COMMIT_VERSION)
    def commitVersion(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_COMMIT_VERSION, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：复制页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COPY_PAGE)
    def copyPage(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_COPY_PAGE, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：统计评论 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COUNT_COMMENT)
    def countComment(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_COUNT_COMMENT, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：导出页面为PDF 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_EXPORT_TO_PDF)
    def exportToPdf(ArticlePageDTO dto) throws Throwable {
        return this.execute(ACTION_EXPORT_TO_PDF, dto, Object.class)
    }

    /**
     * 行为：设置星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FAVORITE)
    def favorite(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_FAVORITE, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：完成关注 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FINISH_ADD_ATTENTION)
    def finishAddAttention(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_FINISH_ADD_ATTENTION, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：获取草稿页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_DRAFT_PAGES)
    def getDraftPages(ArticlePageDTO dto) throws Throwable {
        return this.execute(ACTION_GET_DRAFT_PAGES, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：锁定页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_LOCK_PAGE)
    def lockPage(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_LOCK_PAGE, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：移动需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(ArticlePageDTO dto) throws Throwable {
        return this.executeForList(ACTION_MOVE_ORDER, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：移动页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_PAGE)
    def movePage(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_MOVE_PAGE, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：保存命名版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_NAME_VERSION)
    def nameVersionSave(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_SET_NAME_VERSION, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：发布名称 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PUBLISH_NAME)
    def publishName(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_PUBLISH_NAME, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：发布页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PUBLISH_PAGE)
    def publishPage(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_PUBLISH_PAGE, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：恢复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER)
    def recover(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：恢复到历史版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER_VERSION)
    def recoverVersion(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER_VERSION, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：另存为模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE_TO_STENCIL)
    def saveToStencil(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_SAVE_TO_STENCIL, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：获取共享设置 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_SHARED)
    def shared(String key) throws Throwable {
        return this.execute(ACTION_SHARED, key, ArticlePageDTO.class)
    }

    /**
     * 行为：共享设置 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHARED_SETTING)
    def sharedSetting(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_SHARED_SETTING, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：获取页面共享链接 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHARED_URL)
    def sharedUrl(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_SHARED_URL, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：取消星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UN_FAVORITE)
    def unFavorite(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_UN_FAVORITE, dto, ArticlePageDTO.class)
    }

    /**
     * 行为：解锁页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UNLOCK_PAGE)
    def unlockPage(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_UNLOCK_PAGE, dto, ArticlePageDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ArticlePageDTO> fetchDefault(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：高级搜索 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADVANCED_SEARCH)
    Page<ArticlePageDTO> fetchAdvancedSearch(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADVANCED_SEARCH, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：查询知识空间的页面信息（AI调用） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_AI_INFO)
    Page<ArticlePageAiInfoDTO> fetchAiInfo(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_AI_INFO, context, ArticlePageAiInfoDTO.class)
    }

    /**
     * 数据集：全部共享页面查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL_SHARED_PAGES)
    Page<ArticlePageSharedFieldsDTO> fetchAllSharedPages(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL_SHARED_PAGES, context, ArticlePageSharedFieldsDTO.class)
    }

    /**
     * 数据集：基线选择页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_CHOOSE_PAGE)
    Page<ArticlePageDTO> fetchBaselineChoosePage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_CHOOSE_PAGE, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：基线规划页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_PLAN_PAGE)
    Page<ArticlePageDTO> fetchBaselinePlanPage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_PLAN_PAGE, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：选择共享页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_SHARED)
    Page<ArticlePageNameDTO> fetchChooseShared(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_SHARED, context, ArticlePageNameDTO.class)
    }

    /**
     * 数据集：草稿页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DRAFT_PAGE)
    Page<ArticlePageDTO> fetchDraftPage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DRAFT_PAGE, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：主页 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_HOME_PAGE)
    Page<ArticlePageDTO> fetchHomePage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_HOME_PAGE, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：已删除页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IS_DELETED)
    Page<ArticlePageDTO> fetchIsDeleted(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IS_DELETED, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：我的收藏 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_FAVORITE_PAGE)
    Page<ArticlePageDTO> fetchMyFavoritePage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_FAVORITE_PAGE, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：过滤器默认查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_FILTER)
    Page<ArticlePageDTO> fetchMyFilter(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_FILTER, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：无父页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_PARENT_PAGE)
    Page<ArticlePageDTO> fetchNoParentPage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_PARENT_PAGE, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：正常 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    Page<ArticlePageDTO> fetchNormal(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：空间页面(移动端) 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL_TREE_PAGE)
    Page<ArticlePageDTO> fetchNormalTreePage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL_TREE_PAGE, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：仅页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ONLY_PAGE)
    Page<ArticlePageDTO> fetchOnlyPage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ONLY_PAGE, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：reader 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<ArticlePageDTO> fetchReader(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：共享页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SHARED_PAGE)
    Page<ArticlePageDTO> fetchSharedPage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SHARED_PAGE, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：共享只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SHARED_READER)
    Page<ArticlePageSharedReadDTO> fetchSharedReader(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SHARED_READER, context, ArticlePageSharedReadDTO.class)
    }

    /**
     * 数据集：共享搜索页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SHARED_SEARCH)
    Page<ArticlePageDTO> fetchSharedSearch(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SHARED_SEARCH, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：共享子页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SHARED_SUB_PAGES)
    Page<ArticlePageDTO> fetchSharedSubPages(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SHARED_SUB_PAGES, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：与我共享 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SHARED_WITH_ME)
    Page<ArticlePageSharedFieldsDTO> fetchSharedWithMe(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SHARED_WITH_ME, context, ArticlePageSharedFieldsDTO.class)
    }

    /**
     * 数据集：与我共享编辑权限 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SHARED_WITH_ME_EDIT)
    Page<ArticlePageDTO> fetchSharedWithMeEdit(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SHARED_WITH_ME_EDIT, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：共享空间主页 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPACE_SHARED_HOME)
    Page<ArticlePageDTO> fetchSpaceSharedHome(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPACE_SHARED_HOME, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：查询空间下的共享页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPACE_SHARED_PAGES)
    Page<ArticlePageDTO> fetchSpaceSharedPages(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPACE_SHARED_PAGES, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：共享空间下搜索页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPACE_SHARED_SEARCH)
    Page<ArticlePageDTO> fetchSpaceSharedSearch(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPACE_SHARED_SEARCH, context, ArticlePageDTO.class)
    }

    /**
     * 数据集：共享空间查询顶层页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPACE_SHARED_TOP)
    Page<ArticlePageDTO> fetchSpaceSharedTop(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPACE_SHARED_TOP, context, ArticlePageDTO.class)
    }

}