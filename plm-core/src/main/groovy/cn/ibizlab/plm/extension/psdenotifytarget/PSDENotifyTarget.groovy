package cn.ibizlab.plm.extension.psdenotifytarget

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.extension.psdenotifytarget.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSDENOTIFYTARGET]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSDENotifyTarget extends GroovyPSModelDERuntime<PSDENotifyTarget,PSDENotifyTargetDTO,PSDENotifyTargetFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSDENotifyTarget _instance
    void setInstance(PSDENotifyTarget instance) {
        _instance = instance
    }
    static PSDENotifyTarget getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSDENotifyTargetDTO create(PSDENotifyTargetDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSDENotifyTargetDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSDENotifyTargetDTO update(PSDENotifyTargetDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSDENotifyTargetDTO.class)
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
    PSDENotifyTargetDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSDENotifyTargetDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSDENotifyTargetDTO getDraft(PSDENotifyTargetDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSDENotifyTargetDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSDENotifyTargetDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSDENotifyTargetDTO save(PSDENotifyTargetDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSDENotifyTargetDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSDENotifyTargetDTO> fetchDefault(PSDENotifyTargetFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSDENotifyTargetDTO.class)
    }

}