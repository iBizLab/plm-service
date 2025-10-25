package cn.ibizlab.plm.testmgmt.library

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.library.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[LIBRARY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Library extends GroovyDynaDataEntityRuntime<Library,LibraryDTO,LibraryFilterDTO> {

    public static final String ACTION_ACTIVATE = "activate"
    public static final String ACTION_ARCHIVE = "archive"
    public static final String ACTION_CHANGE_ADMIN_ROLE = "change_admin_role"
    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_FAVORITE = "favorite"
    public static final String ACTION_LIBRARY_INDEX_ADDON_COUNTER = "library_index_addon_counter"
    public static final String ACTION_MOVE_LIBRARY = "move_library"
    public static final String ACTION_RECOVER = "recover"
    public static final String ACTION_UN_FAVORITE = "un_favorite"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ADMIN = "admin"
    public static final String DATASET_ARCHIVED = "archived"
    public static final String DATASET_DELETED = "deleted"
    public static final String DATASET_FAVORITE = "favorite"
    public static final String DATASET_MAIN = "main"
    public static final String DATASET_MOB_MAIN = "mob_main"
    public static final String DATASET_NORMAL = "normal"
    public static final String DATASET_PROJECT_RELATION_LIBRARY = "project_relation_library"
    public static final String DATASET_QUICK = "quick"
    public static final String DATASET_QUICK_USER = "quick_user"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_USER = "user"
    private static Library _instance
    void setInstance(Library instance) {
        _instance = instance
    }
    static Library getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    LibraryDTO create(LibraryDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, LibraryDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    LibraryDTO update(LibraryDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, LibraryDTO.class)
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
    LibraryDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, LibraryDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    LibraryDTO getDraft(LibraryDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, LibraryDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(LibraryDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    LibraryDTO save(LibraryDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, LibraryDTO.class)
    }

    /**
     * 行为：激活 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ACTIVATE)
    def activate(LibraryDTO dto) throws Throwable {
        this.execute(ACTION_ACTIVATE, dto, LibraryDTO.class)
    }

    /**
     * 行为：归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ARCHIVE)
    def archive(LibraryDTO dto) throws Throwable {
        this.execute(ACTION_ARCHIVE, dto, LibraryDTO.class)
    }

    /**
     * 行为：变更管理员角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ADMIN_ROLE)
    def changeAdminRole(LibraryDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ADMIN_ROLE, dto, LibraryDTO.class)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(LibraryDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto, LibraryDTO.class)
    }

    /**
     * 行为：设置星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FAVORITE)
    def favorite(LibraryDTO dto) throws Throwable {
        this.execute(ACTION_FAVORITE, dto, LibraryDTO.class)
    }

    /**
     * 行为：测试库首页组件计数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_LIBRARY_INDEX_ADDON_COUNTER)
    def libraryIndexAddonCounter(LibraryDTO dto) throws Throwable {
        this.execute(ACTION_LIBRARY_INDEX_ADDON_COUNTER, dto, LibraryDTO.class)
    }

    /**
     * 行为：移动测试库 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_LIBRARY)
    def moveLibrary(LibraryDTO dto) throws Throwable {
        this.execute(ACTION_MOVE_LIBRARY, dto, LibraryDTO.class)
    }

    /**
     * 行为：恢复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER)
    def recover(LibraryDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER, dto, LibraryDTO.class)
    }

    /**
     * 行为：取消星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UN_FAVORITE)
    def unFavorite(LibraryDTO dto) throws Throwable {
        this.execute(ACTION_UN_FAVORITE, dto, LibraryDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<LibraryDTO> fetchDefault(LibraryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, LibraryDTO.class)
    }

    /**
     * 数据集：管理员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADMIN)
    Page<LibraryDTO> fetchAdmin(LibraryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADMIN, context, LibraryDTO.class)
    }

    /**
     * 数据集：已归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ARCHIVED)
    Page<LibraryDTO> fetchArchived(LibraryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ARCHIVED, context, LibraryDTO.class)
    }

    /**
     * 数据集：已删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DELETED)
    Page<LibraryDTO> fetchDeleted(LibraryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DELETED, context, LibraryDTO.class)
    }

    /**
     * 数据集：查询星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FAVORITE)
    Page<LibraryDTO> fetchFavorite(LibraryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FAVORITE, context, LibraryDTO.class)
    }

    /**
     * 数据集：主表格查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MAIN)
    Page<LibraryDTO> fetchMain(LibraryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MAIN, context, LibraryDTO.class)
    }

    /**
     * 数据集：主列表查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_MAIN)
    Page<LibraryDTO> fetchMobMain(LibraryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_MAIN, context, LibraryDTO.class)
    }

    /**
     * 数据集：正常状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    Page<LibraryDTO> fetchNormal(LibraryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context, LibraryDTO.class)
    }

    /**
     * 数据集：与项目关联的测试库 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROJECT_RELATION_LIBRARY)
    Page<LibraryDTO> fetchProjectRelationLibrary(LibraryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROJECT_RELATION_LIBRARY, context, LibraryDTO.class)
    }

    /**
     * 数据集：快速新建查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_QUICK)
    Page<LibraryDTO> fetchQuick(LibraryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_QUICK, context, LibraryDTO.class)
    }

    /**
     * 数据集：快速新建查询（管理用户） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_QUICK_USER)
    Page<LibraryDTO> fetchQuickUser(LibraryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_QUICK_USER, context, LibraryDTO.class)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<LibraryDTO> fetchReader(LibraryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, LibraryDTO.class)
    }

    /**
     * 数据集：操作用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    Page<LibraryDTO> fetchUser(LibraryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context, LibraryDTO.class)
    }

}