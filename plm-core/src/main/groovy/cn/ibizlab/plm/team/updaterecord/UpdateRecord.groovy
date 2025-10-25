package cn.ibizlab.plm.team.updaterecord

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.team.updaterecord.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[UPDATE_RECORD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class UpdateRecord extends GroovyDynaDataEntityRuntime<UpdateRecord,UpdateRecordDTO,UpdateRecordFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static UpdateRecord _instance
    void setInstance(UpdateRecord instance) {
        _instance = instance
    }
    static UpdateRecord getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    UpdateRecordDTO create(UpdateRecordDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, UpdateRecordDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    UpdateRecordDTO update(UpdateRecordDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, UpdateRecordDTO.class)
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
    UpdateRecordDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, UpdateRecordDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    UpdateRecordDTO getDraft(UpdateRecordDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, UpdateRecordDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(UpdateRecordDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    UpdateRecordDTO save(UpdateRecordDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, UpdateRecordDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<UpdateRecordDTO> fetchDefault(UpdateRecordFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, UpdateRecordDTO.class)
    }

}