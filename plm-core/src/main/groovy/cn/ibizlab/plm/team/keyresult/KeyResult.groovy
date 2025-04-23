package cn.ibizlab.plm.team.keyresult

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.team.keyresult.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[KEY_RESULT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class KeyResult extends GroovyDataEntityRuntime<KeyResult,KeyResultDTO,KeyResultFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static KeyResult _instance
    void setInstance(KeyResult instance) {
        _instance = instance
    }
    static KeyResult getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    KeyResultDTO create(KeyResultDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, KeyResultDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    KeyResultDTO update(KeyResultDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, KeyResultDTO.class)
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
    KeyResultDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, KeyResultDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    KeyResultDTO getDraft(KeyResultDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, KeyResultDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(KeyResultDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    KeyResultDTO save(KeyResultDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, KeyResultDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<KeyResultDTO> fetchDefault(KeyResultFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, KeyResultDTO.class)
    }

}