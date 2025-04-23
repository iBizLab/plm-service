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
    private static InsightView _instance
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
    InsightViewDTO create(InsightViewDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, InsightViewDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    InsightViewDTO update(InsightViewDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, InsightViewDTO.class)
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
    InsightViewDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, InsightViewDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    InsightViewDTO getDraft(InsightViewDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, InsightViewDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(InsightViewDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    InsightViewDTO save(InsightViewDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, InsightViewDTO.class)
    }

    /**
     * 行为：变更管理员身份 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ADMIN_ROLE)
    def changeAdminRole(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ADMIN_ROLE, dto, InsightViewDTO.class)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto, InsightViewDTO.class)
    }

    /**
     * 行为：设置星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FAVORITE)
    def favorite(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_FAVORITE, dto, InsightViewDTO.class)
    }

    /**
     * 行为：判断是否需要选择模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOGNIZE_CHOOSE_TEMPLATE)
    def recognizeChooseTemplate(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_RECOGNIZE_CHOOSE_TEMPLATE, dto, InsightViewDTO.class)
    }

    /**
     * 行为：恢复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER)
    def recover(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER, dto, InsightViewDTO.class)
    }

    /**
     * 行为：取消星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UN_FAVORITE)
    def unFavorite(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_UN_FAVORITE, dto, InsightViewDTO.class)
    }

    /**
     * 行为：使用此模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_USE_CUR_TEMPLATE)
    def useCurTemplate(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_USE_CUR_TEMPLATE, dto, InsightViewDTO.class)
    }

    /**
     * 行为：移动视图 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_VIEW_MOVE)
    def viewMove(InsightViewDTO dto) throws Throwable {
        this.execute(ACTION_VIEW_MOVE, dto, InsightViewDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<InsightViewDTO> fetchDefault(InsightViewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, InsightViewDTO.class)
    }

    /**
     * 数据集：管理员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADMIN)
    Page<InsightViewDTO> fetchAdmin(InsightViewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADMIN, context, InsightViewDTO.class)
    }

    /**
     * 数据集：已删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DELETED)
    Page<InsightViewDTO> fetchDeleted(InsightViewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DELETED, context, InsightViewDTO.class)
    }

    /**
     * 数据集：星标页面 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FAVORITE)
    Page<InsightViewDTO> fetchFavorite(InsightViewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FAVORITE, context, InsightViewDTO.class)
    }

    /**
     * 数据集：主表格查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MAIN)
    Page<InsightViewDTO> fetchMain(InsightViewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MAIN, context, InsightViewDTO.class)
    }

    /**
     * 数据集：normal 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    Page<InsightViewDTO> fetchNormal(InsightViewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context, InsightViewDTO.class)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<InsightViewDTO> fetchReader(InsightViewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, InsightViewDTO.class)
    }

    /**
     * 数据集：操作用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    Page<InsightViewDTO> fetchUser(InsightViewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context, InsightViewDTO.class)
    }

}