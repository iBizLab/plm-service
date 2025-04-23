package cn.ibizlab.plm.wiki.space

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.wiki.space.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SPACE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Space extends GroovyDataEntityRuntime<Space,SpaceDTO,SpaceFilterDTO> {

    public static final String ACTION_ACTIVATE = "activate"
    public static final String ACTION_ARCHIVE = "archive"
    public static final String ACTION_CHANGE_ADMIN_ROLE = "change_admin_role"
    public static final String ACTION_DEL_RELATION = "del_relation"
    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_FAVORITE = "favorite"
    public static final String ACTION_MOVE_OUT_CATEGORY = "move_out_category"
    public static final String ACTION_MOVE_SPACE = "move_space"
    public static final String ACTION_OPEN_SHARED = "open_shared"
    public static final String ACTION_OTHER_RE_SPACE = "other_re_space"
    public static final String ACTION_RECOGNIZE_CUR_USER_ROLE = "recognize_cur_user_role"
    public static final String ACTION_RECOVER = "recover"
    public static final String ACTION_SPACE_INDEX_ADDON_COUNTER = "space_index_addon_counter"
    public static final String ACTION_UN_FAVORITE = "un_favorite"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ADMIN = "admin"
    public static final String DATASET_ARCHIVED = "archived"
    public static final String DATASET_CATEGORY_SPACE = "category_space"
    public static final String DATASET_CURRENT = "current"
    public static final String DATASET_DELETED = "deleted"
    public static final String DATASET_FAVORITE = "favorite"
    public static final String DATASET_MAIN = "main"
    public static final String DATASET_MOB_MAIN = "mob_main"
    public static final String DATASET_NO_CATEGORY_SPACE = "no_category_space"
    public static final String DATASET_NO_RE_SPACE = "no_re_space"
    public static final String DATASET_NORMAL = "normal"
    public static final String DATASET_OTHER_RE_SPACE = "other_re_space"
    public static final String DATASET_QUICK = "quick"
    public static final String DATASET_QUICK_USER = "quick_user"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_USER = "user"
    private static Space _instance
    void setInstance(Space instance) {
        _instance = instance
    }
    static Space getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    SpaceDTO create(SpaceDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SpaceDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SpaceDTO update(SpaceDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SpaceDTO.class)
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
    SpaceDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SpaceDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SpaceDTO getDraft(SpaceDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SpaceDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SpaceDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SpaceDTO save(SpaceDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SpaceDTO.class)
    }

    /**
     * 行为：激活 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ACTIVATE)
    def activate(SpaceDTO dto) throws Throwable {
        this.execute(ACTION_ACTIVATE, dto, SpaceDTO.class)
    }

    /**
     * 行为：归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ARCHIVE)
    def archive(SpaceDTO dto) throws Throwable {
        this.execute(ACTION_ARCHIVE, dto, SpaceDTO.class)
    }

    /**
     * 行为：变更管理员角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ADMIN_ROLE)
    def changeAdminRole(SpaceDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ADMIN_ROLE, dto, SpaceDTO.class)
    }

    /**
     * 行为：取消关联 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DEL_RELATION)
    def delRelation(SpaceDTO dto) throws Throwable {
        this.execute(ACTION_DEL_RELATION, dto, SpaceDTO.class)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(SpaceDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto, SpaceDTO.class)
    }

    /**
     * 行为：设置星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FAVORITE)
    def favorite(SpaceDTO dto) throws Throwable {
        this.execute(ACTION_FAVORITE, dto, SpaceDTO.class)
    }

    /**
     * 行为：移出分类 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_OUT_CATEGORY)
    def moveOutCategory(SpaceDTO dto) throws Throwable {
        this.execute(ACTION_MOVE_OUT_CATEGORY, dto, SpaceDTO.class)
    }

    /**
     * 行为：移动空间 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_SPACE)
    def moveSpace(SpaceDTO dto) throws Throwable {
        this.execute(ACTION_MOVE_SPACE, dto, SpaceDTO.class)
    }

    /**
     * 行为：开启共享 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_OPEN_SHARED)
    def openShared(SpaceDTO dto) throws Throwable {
        this.execute(ACTION_OPEN_SHARED, dto, SpaceDTO.class)
    }

    /**
     * 行为：其他实体关联空间 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_OTHER_RE_SPACE)
    def otherReSpace(SpaceDTO dto) throws Throwable {
        this.execute(ACTION_OTHER_RE_SPACE, dto, SpaceDTO.class)
    }

    /**
     * 行为：判断当前用户角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOGNIZE_CUR_USER_ROLE)
    def recognizeCurUserRole(SpaceDTO dto) throws Throwable {
        this.execute(ACTION_RECOGNIZE_CUR_USER_ROLE, dto, SpaceDTO.class)
    }

    /**
     * 行为：恢复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER)
    def recover(SpaceDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER, dto, SpaceDTO.class)
    }

    /**
     * 行为：空间首页组件计数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SPACE_INDEX_ADDON_COUNTER)
    def spaceIndexAddonCounter(SpaceDTO dto) throws Throwable {
        this.execute(ACTION_SPACE_INDEX_ADDON_COUNTER, dto, SpaceDTO.class)
    }

    /**
     * 行为：取消星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UN_FAVORITE)
    def unFavorite(SpaceDTO dto) throws Throwable {
        this.execute(ACTION_UN_FAVORITE, dto, SpaceDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SpaceDTO> fetchDefault(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SpaceDTO.class)
    }

    /**
     * 数据集：管理员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADMIN)
    Page<SpaceDTO> fetchAdmin(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADMIN, context, SpaceDTO.class)
    }

    /**
     * 数据集：已归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ARCHIVED)
    Page<SpaceDTO> fetchArchived(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ARCHIVED, context, SpaceDTO.class)
    }

    /**
     * 数据集：目录下空间 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CATEGORY_SPACE)
    Page<SpaceDTO> fetchCategorySpace(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CATEGORY_SPACE, context, SpaceDTO.class)
    }

    /**
     * 数据集：当前空间 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CURRENT)
    Page<SpaceDTO> fetchCurrent(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CURRENT, context, SpaceDTO.class)
    }

    /**
     * 数据集：已删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DELETED)
    Page<SpaceDTO> fetchDeleted(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DELETED, context, SpaceDTO.class)
    }

    /**
     * 数据集：查询星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FAVORITE)
    Page<SpaceDTO> fetchFavorite(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FAVORITE, context, SpaceDTO.class)
    }

    /**
     * 数据集：主表格查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MAIN)
    Page<SpaceDTO> fetchMain(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MAIN, context, SpaceDTO.class)
    }

    /**
     * 数据集：移动端主表格查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_MAIN)
    Page<SpaceDTO> fetchMobMain(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_MAIN, context, SpaceDTO.class)
    }

    /**
     * 数据集：未存在目录中的空间 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_CATEGORY_SPACE)
    Page<SpaceDTO> fetchNoCategorySpace(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_CATEGORY_SPACE, context, SpaceDTO.class)
    }

    /**
     * 数据集：未关联的空间 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_RE_SPACE)
    Page<SpaceDTO> fetchNoReSpace(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_RE_SPACE, context, SpaceDTO.class)
    }

    /**
     * 数据集：正常状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    Page<SpaceDTO> fetchNormal(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context, SpaceDTO.class)
    }

    /**
     * 数据集：关联的空间 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OTHER_RE_SPACE)
    Page<SpaceDTO> fetchOtherReSpace(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OTHER_RE_SPACE, context, SpaceDTO.class)
    }

    /**
     * 数据集：快速新建查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_QUICK)
    Page<SpaceDTO> fetchQuick(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_QUICK, context, SpaceDTO.class)
    }

    /**
     * 数据集：快速新建查询（管理用户） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_QUICK_USER)
    Page<SpaceDTO> fetchQuickUser(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_QUICK_USER, context, SpaceDTO.class)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<SpaceDTO> fetchReader(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, SpaceDTO.class)
    }

    /**
     * 数据集：操作用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    Page<SpaceDTO> fetchUser(SpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context, SpaceDTO.class)
    }

}