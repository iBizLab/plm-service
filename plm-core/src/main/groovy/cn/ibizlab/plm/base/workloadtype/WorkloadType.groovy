package cn.ibizlab.plm.base.workloadtype

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.workloadtype.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[WORKLOAD_TYPE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class WorkloadType extends GroovyDynaDataEntityRuntime<WorkloadType,WorkloadTypeDTO,WorkloadTypeFilterDTO> {

    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static WorkloadType _instance
    void setInstance(WorkloadType instance) {
        _instance = instance
    }
    static WorkloadType getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    WorkloadTypeDTO create(WorkloadTypeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, WorkloadTypeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    WorkloadTypeDTO update(WorkloadTypeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, WorkloadTypeDTO.class)
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
    WorkloadTypeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, WorkloadTypeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    WorkloadTypeDTO getDraft(WorkloadTypeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, WorkloadTypeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(WorkloadTypeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    WorkloadTypeDTO save(WorkloadTypeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, WorkloadTypeDTO.class)
    }

    /**
     * 行为：移动排序 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(WorkloadTypeDTO dto) throws Throwable {
        return this.executeForList(ACTION_MOVE_ORDER, dto, WorkloadTypeDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<WorkloadTypeDTO> fetchDefault(WorkloadTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, WorkloadTypeDTO.class)
    }

}