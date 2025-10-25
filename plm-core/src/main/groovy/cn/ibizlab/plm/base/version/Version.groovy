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
class Version extends GroovyDynaDataEntityRuntime<Version,VersionDTO,VersionFilterDTO> {

    public static final String ACTION_COMMIT = "COMMIT"
    public static final String ACTION_RESTORE = "RESTORE"
    public static final String ACTION_FIXCOMMIT = "FixCommit"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_NAME_VERSION = "name_version"
    public static final String DATASET_OWNER = "owner"
    private static Version _instance
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
    VersionDTO create(VersionDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, VersionDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    VersionDTO update(VersionDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, VersionDTO.class)
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
    VersionDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, VersionDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    VersionDTO getDraft(VersionDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, VersionDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(VersionDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    VersionDTO save(VersionDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, VersionDTO.class)
    }

    /**
     * 行为：提交版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COMMIT)
    def commit(VersionDTO dto) throws Throwable {
        this.execute(ACTION_COMMIT, dto, VersionDTO.class)
    }

    /**
     * 行为：恢复指定版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RESTORE)
    def restore(VersionDTO dto) throws Throwable {
        this.execute(ACTION_RESTORE, dto, VersionDTO.class)
    }

    /**
     * 行为：修复版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FIXCOMMIT)
    def fixCommit(VersionDTO dto) throws Throwable {
        this.execute(ACTION_FIXCOMMIT, dto, VersionDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<VersionDTO> fetchDefault(VersionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, VersionDTO.class)
    }

    /**
     * 数据集：命名版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NAME_VERSION)
    Page<VersionDTO> fetchNameVersion(VersionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NAME_VERSION, context, VersionDTO.class)
    }

    /**
     * 数据集：所属对象版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OWNER)
    Page<VersionDTO> fetchOwner(VersionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OWNER, context, VersionDTO.class)
    }

}