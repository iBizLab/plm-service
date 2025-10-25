package cn.ibizlab.plm.projmgmt.transitionhistory

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.transitionhistory.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[TRANSITION_HISTORY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class TransitionHistory extends GroovyDynaDataEntityRuntime<TransitionHistory,TransitionHistoryDTO,TransitionHistoryFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static TransitionHistory _instance
    void setInstance(TransitionHistory instance) {
        _instance = instance
    }
    static TransitionHistory getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    TransitionHistoryDTO create(TransitionHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, TransitionHistoryDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    TransitionHistoryDTO update(TransitionHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, TransitionHistoryDTO.class)
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
    TransitionHistoryDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, TransitionHistoryDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    TransitionHistoryDTO getDraft(TransitionHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, TransitionHistoryDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(TransitionHistoryDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    TransitionHistoryDTO save(TransitionHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, TransitionHistoryDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<TransitionHistoryDTO> fetchDefault(TransitionHistoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, TransitionHistoryDTO.class)
    }

}