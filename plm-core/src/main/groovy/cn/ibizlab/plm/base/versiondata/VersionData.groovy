package cn.ibizlab.plm.base.versiondata

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.versiondata.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[VERSION_DATA]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class VersionData extends GroovyDataEntityRuntime<VersionData,VersionDataDTO,VersionDataFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static VersionData _instance
    void setInstance(VersionData instance) {
        _instance = instance
    }
    static VersionData getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    VersionDataDTO create(VersionDataDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, VersionDataDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    VersionDataDTO update(VersionDataDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, VersionDataDTO.class)
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
    VersionDataDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, VersionDataDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    VersionDataDTO getDraft(VersionDataDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, VersionDataDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(VersionDataDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    VersionDataDTO save(VersionDataDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, VersionDataDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<VersionDataDTO> fetchDefault(VersionDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, VersionDataDTO.class)
    }

}