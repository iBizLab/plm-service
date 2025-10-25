package cn.ibizlab.plm.base.datasynctask

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.datasynctask.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DATA_SYNC_TASK]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DataSyncTask extends GroovyDynaDataEntityRuntime<DataSyncTask,DataSyncTaskDTO,DataSyncTaskFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static DataSyncTask _instance
    void setInstance(DataSyncTask instance) {
        _instance = instance
    }
    static DataSyncTask getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DataSyncTaskDTO create(DataSyncTaskDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DataSyncTaskDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DataSyncTaskDTO update(DataSyncTaskDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DataSyncTaskDTO.class)
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
    DataSyncTaskDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DataSyncTaskDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DataSyncTaskDTO getDraft(DataSyncTaskDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DataSyncTaskDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DataSyncTaskDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DataSyncTaskDTO save(DataSyncTaskDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DataSyncTaskDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DataSyncTaskDTO> fetchDefault(DataSyncTaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DataSyncTaskDTO.class)
    }

}