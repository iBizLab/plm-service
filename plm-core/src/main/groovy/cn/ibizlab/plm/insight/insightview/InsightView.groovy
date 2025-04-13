package cn.ibizlab.plm.insight.insightview

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.insight.insightview.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[INSIGHT_VIEW]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class InsightView extends GroovyDataEntityRuntime<InsightView,InsightViewDTO,InsightViewFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_CHANGE_ADMIN_ROLE = "change_admin_role"
    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_FAVORITE = "favorite"
    public static final String ACTION_RECOGNIZE_CHOOSE_TEMPLATE = "recognize_choose_template"
    public static final String ACTION_RECOVER = "recover"
    public static final String ACTION_UN_FAVORITE = "un_favorite"
    public static final String ACTION_USE_CUR_TEMPLATE = "use_cur_template"
    public static final String ACTION_VIEW_MOVE = "view_move"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ADMIN = "admin"
    public static final String DATASET_DELETED = "deleted"
    public static final String DATASET_FAVORITE = "favorite"
    public static final String DATASET_MAIN = "main"
    public static final String DATASET_NORMAL = "normal"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_USER = "user"
    private static InsightView _instance;
    void setInstance(InsightView instance) {
        _instance = instance
    }
    static InsightView getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(InsightViewDTO dto) throws Throwable {
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
    def getDraft(InsightViewDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(InsightViewDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：变更管理员身份 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ADMIN_ROLE)
    def changeAdminRole(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ADMIN_ROLE, dto)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto)
    }

    /**
     * 行为：设置星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FAVORITE)
    def favorite(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_FAVORITE, dto)
    }

    /**
     * 行为：判断是否需要选择模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOGNIZE_CHOOSE_TEMPLATE)
    def recognizeChooseTemplate(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_RECOGNIZE_CHOOSE_TEMPLATE, dto)
    }

    /**
     * 行为：恢复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER)
    def recover(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER, dto)
    }

    /**
     * 行为：取消星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UN_FAVORITE)
    def unFavorite(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_UN_FAVORITE, dto)
    }

    /**
     * 行为：使用此模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_USE_CUR_TEMPLATE)
    def useCurTemplate(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_USE_CUR_TEMPLATE, dto)
    }

    /**
     * 行为：移动视图 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_VIEW_MOVE)
    def viewMove(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_VIEW_MOVE, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(InsightViewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：管理员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADMIN)
    def fetchAdmin(InsightViewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADMIN, context)
    }

    /**
     * 数据集：已删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DELETED)
    def fetchDeleted(InsightViewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DELETED, context)
    }

    /**
     * 数据集：星标页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FAVORITE)
    def fetchFavorite(InsightViewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FAVORITE, context)
    }

    /**
     * 数据集：主表格查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MAIN)
    def fetchMain(InsightViewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MAIN, context)
    }

    /**
     * 数据集：normal 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    def fetchNormal(InsightViewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    def fetchReader(InsightViewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context)
    }

    /**
     * 数据集：操作用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    def fetchUser(InsightViewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context)
    }

}