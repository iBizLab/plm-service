package cn.ibizlab.plm.extension.psdenotify

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.extension.psdenotify.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSDENOTIFY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSDENotify extends GroovyPSModelDERuntime<PSDENotify,PSDENotifyDTO,PSDENotifyFilterDTO> {

    public static final String ACTION_APPLY = "APPLY"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSDENotify _instance
    void setInstance(PSDENotify instance) {
        _instance = instance
    }
    static PSDENotify getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSDENotifyDTO create(PSDENotifyDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSDENotifyDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSDENotifyDTO update(PSDENotifyDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSDENotifyDTO.class)
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
    PSDENotifyDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSDENotifyDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSDENotifyDTO getDraft(PSDENotifyDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSDENotifyDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSDENotifyDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSDENotifyDTO save(PSDENotifyDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSDENotifyDTO.class)
    }

    /**
     * 行为：应用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_APPLY)
    def apply(PSDENotifyDTO dto) throws Throwable {
        this.execute(ACTION_APPLY, dto, PSDENotifyDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSDENotifyDTO> fetchDefault(PSDENotifyFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSDENotifyDTO.class)
    }

}