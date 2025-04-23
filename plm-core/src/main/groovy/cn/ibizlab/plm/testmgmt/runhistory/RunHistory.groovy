package cn.ibizlab.plm.testmgmt.runhistory

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.runhistory.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RUN_HISTORY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class RunHistory extends GroovyDataEntityRuntime<RunHistory,RunHistoryDTO,RunHistoryFilterDTO> {

    public static final String ACTION_RUN_HISTORY_GET = "run_history_get"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_THIS = "this"
    private static RunHistory _instance
    void setInstance(RunHistory instance) {
        _instance = instance
    }
    static RunHistory getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    RunHistoryDTO create(RunHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, RunHistoryDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    RunHistoryDTO update(RunHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, RunHistoryDTO.class)
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
    RunHistoryDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, RunHistoryDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    RunHistoryDTO getDraft(RunHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, RunHistoryDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(RunHistoryDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    RunHistoryDTO save(RunHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, RunHistoryDTO.class)
    }

    /**
     * 行为：执行结果获取 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RUN_HISTORY_GET)
    def runHistoryGet(RunHistoryDTO dto) throws Throwable {
        this.execute(ACTION_RUN_HISTORY_GET, dto, RunHistoryDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<RunHistoryDTO> fetchDefault(RunHistoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, RunHistoryDTO.class)
    }

    /**
     * 数据集：当前用例执行结果 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_THIS)
    Page<RunHistoryDTO> fetchThis(RunHistoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_THIS, context, RunHistoryDTO.class)
    }

}