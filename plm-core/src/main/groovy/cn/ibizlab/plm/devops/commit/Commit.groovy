package cn.ibizlab.plm.devops.commit

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.devops.commit.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[COMMIT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Commit extends GroovyDataEntityRuntime<Commit,CommitDTO,CommitFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Commit _instance
    void setInstance(Commit instance) {
        _instance = instance
    }
    static Commit getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CommitDTO create(CommitDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CommitDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CommitDTO update(CommitDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CommitDTO.class)
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
    CommitDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CommitDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CommitDTO getDraft(CommitDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CommitDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CommitDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CommitDTO save(CommitDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CommitDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<CommitDTO> fetchDefault(CommitFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, CommitDTO.class)
    }

}