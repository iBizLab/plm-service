package cn.ibizlab.plm.base.addonresource

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.addonresource.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ADDON_RESOURCE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AddonResource extends GroovyDataEntityRuntime<AddonResource,AddonResourceDTO,AddonResourceFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_CHECK_RESOURCE_IS_DELETED = "check_resource_is_deleted"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_EMPTY = "empty"
    private static AddonResource _instance;
    void setInstance(AddonResource instance) {
        _instance = instance
    }
    static AddonResource getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(AddonResourceDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(AddonResourceDTO dto) throws Throwable {
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
    def getDraft(AddonResourceDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(AddonResourceDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(AddonResourceDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：检验资源是否已删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECK_RESOURCE_IS_DELETED)
    def checkResourceIsDeleted(AddonResourceDTO dto) throws Throwable {
        this.execute(ACTION_CHECK_RESOURCE_IS_DELETED, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(AddonResourceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：资源组件 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    def fetchAll(AddonResourceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context)
    }

    /**
     * 数据集：空查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EMPTY)
    def fetchEmpty(AddonResourceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EMPTY, context)
    }

}