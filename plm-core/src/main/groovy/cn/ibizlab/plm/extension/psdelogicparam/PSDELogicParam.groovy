package cn.ibizlab.plm.extension.psdelogicparam

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.extension.psdelogicparam.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSDELOGICPARAM]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSDELogicParam extends GroovyPSModelDERuntime<PSDELogicParam,PSDELogicParamDTO,PSDELogicParamFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSDELogicParam _instance
    void setInstance(PSDELogicParam instance) {
        _instance = instance
    }
    static PSDELogicParam getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSDELogicParamDTO create(PSDELogicParamDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSDELogicParamDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSDELogicParamDTO update(PSDELogicParamDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSDELogicParamDTO.class)
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
    PSDELogicParamDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSDELogicParamDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSDELogicParamDTO getDraft(PSDELogicParamDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSDELogicParamDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSDELogicParamDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSDELogicParamDTO save(PSDELogicParamDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSDELogicParamDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSDELogicParamDTO> fetchDefault(PSDELogicParamFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSDELogicParamDTO.class)
    }

}