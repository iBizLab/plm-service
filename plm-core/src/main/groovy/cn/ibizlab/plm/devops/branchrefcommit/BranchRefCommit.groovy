package cn.ibizlab.plm.devops.branchrefcommit

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.devops.branchrefcommit.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[BRANCH_REF_COMMIT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class BranchRefCommit extends GroovyDynaDataEntityRuntime<BranchRefCommit,BranchRefCommitDTO,BranchRefCommitFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static BranchRefCommit _instance
    void setInstance(BranchRefCommit instance) {
        _instance = instance
    }
    static BranchRefCommit getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    BranchRefCommitDTO create(BranchRefCommitDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, BranchRefCommitDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    BranchRefCommitDTO update(BranchRefCommitDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, BranchRefCommitDTO.class)
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
    BranchRefCommitDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, BranchRefCommitDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    BranchRefCommitDTO getDraft(BranchRefCommitDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, BranchRefCommitDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(BranchRefCommitDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    BranchRefCommitDTO save(BranchRefCommitDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, BranchRefCommitDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<BranchRefCommitDTO> fetchDefault(BranchRefCommitFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, BranchRefCommitDTO.class)
    }

}