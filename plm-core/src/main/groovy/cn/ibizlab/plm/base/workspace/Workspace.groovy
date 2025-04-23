package cn.ibizlab.plm.base.workspace

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.workspace.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[WORKSPACE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Workspace extends GroovyDataEntityRuntime<Workspace,WorkspaceDTO,WorkspaceFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Workspace _instance
    void setInstance(Workspace instance) {
        _instance = instance
    }
    static Workspace getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    WorkspaceDTO create(WorkspaceDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, WorkspaceDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    WorkspaceDTO update(WorkspaceDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, WorkspaceDTO.class)
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
    WorkspaceDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, WorkspaceDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    WorkspaceDTO getDraft(WorkspaceDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, WorkspaceDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(WorkspaceDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    WorkspaceDTO save(WorkspaceDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, WorkspaceDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<WorkspaceDTO> fetchDefault(WorkspaceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, WorkspaceDTO.class)
    }

}