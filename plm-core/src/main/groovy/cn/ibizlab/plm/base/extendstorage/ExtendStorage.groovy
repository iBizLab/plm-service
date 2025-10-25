package cn.ibizlab.plm.base.extendstorage

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.extendstorage.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[EXTEND_STORAGE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ExtendStorage extends GroovyDynaDataEntityRuntime<ExtendStorage,ExtendStorageDTO,ExtendStorageFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ExtendStorage _instance
    void setInstance(ExtendStorage instance) {
        _instance = instance
    }
    static ExtendStorage getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ExtendStorageDTO create(ExtendStorageDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ExtendStorageDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ExtendStorageDTO update(ExtendStorageDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ExtendStorageDTO.class)
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
    ExtendStorageDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ExtendStorageDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ExtendStorageDTO getDraft(ExtendStorageDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ExtendStorageDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ExtendStorageDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ExtendStorageDTO save(ExtendStorageDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ExtendStorageDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ExtendStorageDTO> fetchDefault(ExtendStorageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ExtendStorageDTO.class)
    }

}