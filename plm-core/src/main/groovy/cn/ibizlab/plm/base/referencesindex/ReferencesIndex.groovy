package cn.ibizlab.plm.base.referencesindex

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.referencesindex.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[REFERENCES_INDEX]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ReferencesIndex extends GroovyDataEntityRuntime<ReferencesIndex,ReferencesIndexDTO,ReferencesIndexFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_INDEXDER = "IndexDER"
    private static ReferencesIndex _instance
    void setInstance(ReferencesIndex instance) {
        _instance = instance
    }
    static ReferencesIndex getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ReferencesIndexDTO create(ReferencesIndexDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ReferencesIndexDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ReferencesIndexDTO update(ReferencesIndexDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ReferencesIndexDTO.class)
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
    ReferencesIndexDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ReferencesIndexDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ReferencesIndexDTO getDraft(ReferencesIndexDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ReferencesIndexDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ReferencesIndexDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ReferencesIndexDTO save(ReferencesIndexDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ReferencesIndexDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ReferencesIndexDTO> fetchDefault(ReferencesIndexFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ReferencesIndexDTO.class)
    }

    /**
     * 数据集：数据集2 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_INDEXDER)
    Page<ReferencesIndexDTO> fetchIndexDER(ReferencesIndexFilterDTO context) throws Throwable {
        return this.fetch(DATASET_INDEXDER, context, ReferencesIndexDTO.class)
    }

}