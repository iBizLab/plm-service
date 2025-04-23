package cn.ibizlab.plm.projmgmt.entry

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.entry.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ENTRY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Entry extends GroovyDataEntityRuntime<Entry,EntryDTO,EntryFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Entry _instance
    void setInstance(Entry instance) {
        _instance = instance
    }
    static Entry getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    EntryDTO create(EntryDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, EntryDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    EntryDTO update(EntryDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, EntryDTO.class)
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
    EntryDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, EntryDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    EntryDTO getDraft(EntryDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, EntryDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(EntryDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    EntryDTO save(EntryDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, EntryDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<EntryDTO> fetchDefault(EntryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, EntryDTO.class)
    }

}