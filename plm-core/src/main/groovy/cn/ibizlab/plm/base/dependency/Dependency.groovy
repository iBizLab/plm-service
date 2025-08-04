package cn.ibizlab.plm.base.dependency

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.dependency.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DEPENDENCY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Dependency extends GroovyDataEntityRuntime<Dependency,DependencyDTO,DependencyFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_DEPENDENCY_WORK_ITEMS = "dependency_work_items"
    private static Dependency _instance
    void setInstance(Dependency instance) {
        _instance = instance
    }
    static Dependency getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DependencyDTO create(DependencyDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DependencyDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DependencyDTO update(DependencyDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DependencyDTO.class)
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
    DependencyDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DependencyDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DependencyDTO getDraft(DependencyDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DependencyDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DependencyDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DependencyDTO save(DependencyDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DependencyDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DependencyDTO> fetchDefault(DependencyFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DependencyDTO.class)
    }

    /**
     * 数据集：工作项依赖 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEPENDENCY_WORK_ITEMS)
    Page<DependencyDTO> fetchDependencyWorkItems(DependencyFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEPENDENCY_WORK_ITEMS, context, DependencyDTO.class)
    }

}