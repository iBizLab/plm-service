package cn.ibizlab.plm.ebsx.openuser

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ebsx.openuser.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[OPENUSER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Openuser extends GroovyDynaDataEntityRuntime<Openuser,OpenuserDTO,OpenuserFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_WXWORK = "wxwork"
    private static Openuser _instance
    void setInstance(Openuser instance) {
        _instance = instance
    }
    static Openuser getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    OpenuserDTO create(OpenuserDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, OpenuserDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    OpenuserDTO update(OpenuserDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, OpenuserDTO.class)
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
    OpenuserDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, OpenuserDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    OpenuserDTO getDraft(OpenuserDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, OpenuserDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(OpenuserDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    OpenuserDTO save(OpenuserDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, OpenuserDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<OpenuserDTO> fetchDefault(OpenuserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, OpenuserDTO.class)
    }

    /**
     * 数据集：企业微信 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WXWORK)
    Page<OpenuserDTO> fetchWxwork(OpenuserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WXWORK, context, OpenuserDTO.class)
    }

}