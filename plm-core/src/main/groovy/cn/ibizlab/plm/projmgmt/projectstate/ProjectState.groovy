package cn.ibizlab.plm.projmgmt.projectstate

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.projectstate.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PROJECT_STATE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ProjectState extends GroovyDynaDataEntityRuntime<ProjectState,ProjectStateDTO,ProjectStateFilterDTO> {

    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ProjectState _instance
    void setInstance(ProjectState instance) {
        _instance = instance
    }
    static ProjectState getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ProjectStateDTO create(ProjectStateDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ProjectStateDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ProjectStateDTO update(ProjectStateDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ProjectStateDTO.class)
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
    ProjectStateDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ProjectStateDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ProjectStateDTO getDraft(ProjectStateDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ProjectStateDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ProjectStateDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ProjectStateDTO save(ProjectStateDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ProjectStateDTO.class)
    }

    /**
     * 行为：移动排序 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(ProjectStateDTO dto) throws Throwable {
        return this.executeForList(ACTION_MOVE_ORDER, dto, ProjectStateDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ProjectStateDTO> fetchDefault(ProjectStateFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ProjectStateDTO.class)
    }

}