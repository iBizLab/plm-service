package cn.ibizlab.plm.devops.branch

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.devops.branch.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[BRANCH]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Branch extends GroovyDataEntityRuntime<Branch,BranchDTO,BranchFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Branch _instance
    void setInstance(Branch instance) {
        _instance = instance
    }
    static Branch getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    BranchDTO create(BranchDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, BranchDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    BranchDTO update(BranchDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, BranchDTO.class)
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
    BranchDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, BranchDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    BranchDTO getDraft(BranchDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, BranchDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(BranchDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    BranchDTO save(BranchDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, BranchDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<BranchDTO> fetchDefault(BranchFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, BranchDTO.class)
    }

}