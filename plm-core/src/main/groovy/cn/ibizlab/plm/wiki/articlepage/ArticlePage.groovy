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
class ArticlePage extends GroovyDataEntityRuntime<ArticlePage,ArticlePageDTO,ArticlePageFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
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
    private static ArticlePage _instance;
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
    def create(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(ArticlePageDTO dto) throws Throwable {
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
    def getDraft(ArticlePageDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(ArticlePageDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：校验共享访问密码 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECK_ACCESS_PASSWORD)
    def checkAccessPassword(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_CHECK_ACCESS_PASSWORD, dto)
    }

    /**
     * 行为：检验共享页面 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_CHECK_SHARED)
    def checkShared(String key) throws Throwable {
        return this.execute(ACTION_CHECK_SHARED, key)
    }

    /**
     * 行为：关闭共享 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CLOSED_SHARED)
    def closedShared(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_CLOSED_SHARED, dto)
    }

    /**
     * 行为：生成版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COMMIT_VERSION)
    def commitVersion(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_COMMIT_VERSION, dto)
    }

    /**
     * 行为：复制页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COPY_PAGE)
    def copyPage(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_COPY_PAGE, dto)
    }

    /**
     * 行为：统计评论 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COUNT_COMMENT)
    def countComment(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_COUNT_COMMENT, dto)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto)
    }

    /**
     * 行为：导出页面为PDF 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_EXPORT_TO_PDF)
    def exportToPdf(ArticlePageDTO dto) throws Throwable {
        return this.execute(ACTION_EXPORT_TO_PDF, dto)
    }

    /**
     * 行为：设置星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FAVORITE)
    def favorite(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_FAVORITE, dto)
    }

    /**
     * 行为：完成关注 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FINISH_ADD_ATTENTION)
    def finishAddAttention(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_FINISH_ADD_ATTENTION, dto)
    }

    /**
     * 行为：获取草稿页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_DRAFT_PAGES)
    def getDraftPages(ArticlePageDTO dto) throws Throwable {
        return this.execute(ACTION_GET_DRAFT_PAGES, dto)
    }

    /**
     * 行为：锁定页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_LOCK_PAGE)
    def lockPage(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_LOCK_PAGE, dto)
    }

    /**
     * 行为：移动需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(ArticlePageDTO dto) throws Throwable {
        return this.execute(ACTION_MOVE_ORDER, dto)
    }

    /**
     * 行为：移动页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_PAGE)
    def movePage(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_MOVE_PAGE, dto)
    }

    /**
     * 行为：保存命名版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_NAME_VERSION)
    def nameVersionSave(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_SET_NAME_VERSION, dto)
    }

    /**
     * 行为：发布页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PUBLISH_PAGE)
    def publishPage(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_PUBLISH_PAGE, dto)
    }

    /**
     * 行为：恢复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER)
    def recover(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER, dto)
    }

    /**
     * 行为：恢复到历史版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER_VERSION)
    def recoverVersion(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER_VERSION, dto)
    }

    /**
     * 行为：另存为模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE_TO_STENCIL)
    def saveToStencil(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_SAVE_TO_STENCIL, dto)
    }

    /**
     * 行为：获取共享设置 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_SHARED)
    def shared(String key) throws Throwable {
        return this.execute(ACTION_SHARED, key)
    }

    /**
     * 行为：共享设置 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHARED_SETTING)
    def sharedSetting(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_SHARED_SETTING, dto)
    }

    /**
     * 行为：获取页面共享链接 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHARED_URL)
    def sharedUrl(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_SHARED_URL, dto)
    }

    /**
     * 行为：取消星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UN_FAVORITE)
    def unFavorite(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_UN_FAVORITE, dto)
    }

    /**
     * 行为：解锁页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UNLOCK_PAGE)
    def unlockPage(ArticlePageDTO dto) throws Throwable {
        this.execute(ACTION_UNLOCK_PAGE, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：高级搜索 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADVANCED_SEARCH)
    def fetchAdvancedSearch(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADVANCED_SEARCH, context)
    }

    /**
     * 数据集：全部共享页面查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL_SHARED_PAGES)
    def fetchAllSharedPages(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL_SHARED_PAGES, context)
    }

    /**
     * 数据集：基线选择页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_CHOOSE_PAGE)
    def fetchBaselineChoosePage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_CHOOSE_PAGE, context)
    }

    /**
     * 数据集：基线规划页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASELINE_PLAN_PAGE)
    def fetchBaselinePlanPage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASELINE_PLAN_PAGE, context)
    }

    /**
     * 数据集：选择共享页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_SHARED)
    def fetchChooseShared(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_SHARED, context)
    }

    /**
     * 数据集：草稿页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DRAFT_PAGE)
    def fetchDraftPage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DRAFT_PAGE, context)
    }

    /**
     * 数据集：主页 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_HOME_PAGE)
    def fetchHomePage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_HOME_PAGE, context)
    }

    /**
     * 数据集：已删除页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IS_DELETED)
    def fetchIsDeleted(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IS_DELETED, context)
    }

    /**
     * 数据集：我的收藏 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_FAVORITE_PAGE)
    def fetchMyFavoritePage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_FAVORITE_PAGE, context)
    }

    /**
     * 数据集：过滤器默认查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_FILTER)
    def fetchMyFilter(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_FILTER, context)
    }

    /**
     * 数据集：无父页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_PARENT_PAGE)
    def fetchNoParentPage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_PARENT_PAGE, context)
    }

    /**
     * 数据集：正常 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    def fetchNormal(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context)
    }

    /**
     * 数据集：空间页面(移动端) 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL_TREE_PAGE)
    def fetchNormalTreePage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL_TREE_PAGE, context)
    }

    /**
     * 数据集：仅页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ONLY_PAGE)
    def fetchOnlyPage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ONLY_PAGE, context)
    }

    /**
     * 数据集：reader 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    def fetchReader(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context)
    }

    /**
     * 数据集：共享页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SHARED_PAGE)
    def fetchSharedPage(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SHARED_PAGE, context)
    }

    /**
     * 数据集：共享只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SHARED_READER)
    def fetchSharedReader(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SHARED_READER, context)
    }

    /**
     * 数据集：共享搜索页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SHARED_SEARCH)
    def fetchSharedSearch(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SHARED_SEARCH, context)
    }

    /**
     * 数据集：共享子页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SHARED_SUB_PAGES)
    def fetchSharedSubPages(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SHARED_SUB_PAGES, context)
    }

    /**
     * 数据集：与我共享 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SHARED_WITH_ME)
    def fetchSharedWithMe(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SHARED_WITH_ME, context)
    }

    /**
     * 数据集：与我共享编辑权限 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SHARED_WITH_ME_EDIT)
    def fetchSharedWithMeEdit(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SHARED_WITH_ME_EDIT, context)
    }

    /**
     * 数据集：共享空间主页 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPACE_SHARED_HOME)
    def fetchSpaceSharedHome(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPACE_SHARED_HOME, context)
    }

    /**
     * 数据集：查询空间下的共享页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPACE_SHARED_PAGES)
    def fetchSpaceSharedPages(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPACE_SHARED_PAGES, context)
    }

    /**
     * 数据集：共享空间下搜索页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPACE_SHARED_SEARCH)
    def fetchSpaceSharedSearch(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPACE_SHARED_SEARCH, context)
    }

    /**
     * 数据集：共享空间查询顶层页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPACE_SHARED_TOP)
    def fetchSpaceSharedTop(ArticlePageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPACE_SHARED_TOP, context)
    }

}