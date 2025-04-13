package cn.ibizlab.plm.base.version

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.version.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[VERSION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Version extends GroovyDataEntityRuntime<Version,VersionDTO,VersionFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_COMMIT = "COMMIT"
    public static final String ACTION_RESTORE = "RESTORE"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_FIXCOMMIT = "FixCommit"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_NAME_VERSION = "name_version"
    public static final String DATASET_OWNER = "owner"
    private static Version _instance;
    void setInstance(Version instance) {
        _instance = instance
    }
    static Version getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(VersionDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(VersionDTO dto) throws Throwable {
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
    def getDraft(VersionDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(VersionDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：提交版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COMMIT)
    def commit(VersionDTO dto) throws Throwable {
        this.execute(ACTION_COMMIT, dto)
    }

    /**
     * 行为：恢复指定版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RESTORE)
    def restore(VersionDTO dto) throws Throwable {
        this.execute(ACTION_RESTORE, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(VersionDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：修复版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FIXCOMMIT)
    def fixCommit(VersionDTO dto) throws Throwable {
        this.execute(ACTION_FIXCOMMIT, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(VersionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：命名版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NAME_VERSION)
    def fetchNameVersion(VersionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NAME_VERSION, context)
    }

    /**
     * 数据集：所属对象版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OWNER)
    def fetchOwner(VersionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OWNER, context)
    }

}