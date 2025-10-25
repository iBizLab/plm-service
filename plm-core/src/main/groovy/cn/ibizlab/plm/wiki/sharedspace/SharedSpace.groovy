package cn.ibizlab.plm.wiki.sharedspace

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.wiki.sharedspace.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SHARED_SPACE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SharedSpace extends GroovyDynaDataEntityRuntime<SharedSpace,SharedSpaceDTO,SharedSpaceFilterDTO> {

    public static final String ACTION_CHECK_ACCESS_PASSWORD = "check_access_password"
    public static final String ACTION_CHECK_SHARED = "check_shared"
    public static final String ACTION_CLOSED_SHARED = "closed_shared"
    public static final String ACTION_SHARED_SETTING = "shared_setting"
    public static final String ACTION_SHARED_SPACE_INFO = "shared_space_info"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ADMIN = "admin"
    public static final String DATASET_SHARED = "shared"
    private static SharedSpace _instance
    void setInstance(SharedSpace instance) {
        _instance = instance
    }
    static SharedSpace getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    SharedSpaceDTO create(SharedSpaceDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SharedSpaceDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SharedSpaceDTO update(SharedSpaceDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SharedSpaceDTO.class)
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
    SharedSpaceDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SharedSpaceDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SharedSpaceDTO getDraft(SharedSpaceDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SharedSpaceDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SharedSpaceDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SharedSpaceDTO save(SharedSpaceDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SharedSpaceDTO.class)
    }

    /**
     * 行为：校验共享访问密码 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECK_ACCESS_PASSWORD)
    def checkAccessPassword(SharedSpaceDTO dto) throws Throwable {
        this.execute(ACTION_CHECK_ACCESS_PASSWORD, dto, SharedSpaceDTO.class)
    }

    /**
     * 行为：检验共享页面 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_CHECK_SHARED)
    def checkShared(String key) throws Throwable {
        return this.execute(ACTION_CHECK_SHARED, key, SharedSpaceDTO.class)
    }

    /**
     * 行为：关闭共享 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CLOSED_SHARED)
    def closedShared(SharedSpaceDTO dto) throws Throwable {
        this.execute(ACTION_CLOSED_SHARED, dto, SharedSpaceDTO.class)
    }

    /**
     * 行为：共享设置 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SHARED_SETTING)
    def sharedSetting(SharedSpaceDTO dto) throws Throwable {
        this.execute(ACTION_SHARED_SETTING, dto, SharedSpaceDTO.class)
    }

    /**
     * 行为：共享空间信息 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_SHARED_SPACE_INFO)
    def sharedSpaceInfo(String key) throws Throwable {
        return this.execute(ACTION_SHARED_SPACE_INFO, key, SharedSpaceDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SharedSpaceDTO> fetchDefault(SharedSpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SharedSpaceDTO.class)
    }

    /**
     * 数据集：管理员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADMIN)
    Page<SharedSpaceDTO> fetchAdmin(SharedSpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADMIN, context, SharedSpaceDTO.class)
    }

    /**
     * 数据集：共享空间 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SHARED)
    Page<SharedSpaceDTO> fetchShared(SharedSpaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SHARED, context, SharedSpaceDTO.class)
    }

}