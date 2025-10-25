package cn.ibizlab.plm.base.work

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.work.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[WORK]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Work extends GroovyDynaDataEntityRuntime<Work,WorkDTO,WorkFilterDTO> {

    public static final String ACTION_ADD_PROJECT = "add_project"
    public static final String ACTION_ADD_PROJECT_PORTFOLIO = "add_project_portfolio"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ITEM_SET_OWNER = "item_set_owner"
    private static Work _instance
    void setInstance(Work instance) {
        _instance = instance
    }
    static Work getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    WorkDTO create(WorkDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, WorkDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    WorkDTO update(WorkDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, WorkDTO.class)
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
    WorkDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, WorkDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    WorkDTO getDraft(WorkDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, WorkDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(WorkDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    WorkDTO save(WorkDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, WorkDTO.class)
    }

    /**
     * 行为：添加项目 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_PROJECT)
    def addProject(WorkDTO dto) throws Throwable {
        return this.execute(ACTION_ADD_PROJECT, dto, WorkDTO.class)
    }

    /**
     * 行为：添加项目集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_PROJECT_PORTFOLIO)
    def addProjectPortfolio(WorkDTO dto) throws Throwable {
        return this.execute(ACTION_ADD_PROJECT_PORTFOLIO, dto, WorkDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<WorkDTO> fetchDefault(WorkFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, WorkDTO.class)
    }

    /**
     * 数据集：项目集下的工作 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ITEM_SET_OWNER)
    Page<WorkDTO> fetchItemSetOwner(WorkFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ITEM_SET_OWNER, context, WorkDTO.class)
    }

}