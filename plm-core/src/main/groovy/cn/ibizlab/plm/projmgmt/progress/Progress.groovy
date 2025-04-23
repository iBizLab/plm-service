package cn.ibizlab.plm.projmgmt.progress

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.progress.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PROGRESS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Progress extends GroovyDataEntityRuntime<Progress,ProgressDTO,ProgressFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Progress _instance
    void setInstance(Progress instance) {
        _instance = instance
    }
    static Progress getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ProgressDTO create(ProgressDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ProgressDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ProgressDTO update(ProgressDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ProgressDTO.class)
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
    ProgressDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ProgressDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ProgressDTO getDraft(ProgressDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ProgressDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ProgressDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ProgressDTO save(ProgressDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ProgressDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ProgressDTO> fetchDefault(ProgressFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ProgressDTO.class)
    }

}