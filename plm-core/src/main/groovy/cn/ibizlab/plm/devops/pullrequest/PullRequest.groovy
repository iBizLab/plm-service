package cn.ibizlab.plm.devops.pullrequest

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.devops.pullrequest.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PULL_REQUEST]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PullRequest extends GroovyDataEntityRuntime<PullRequest,PullRequestDTO,PullRequestFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PullRequest _instance
    void setInstance(PullRequest instance) {
        _instance = instance
    }
    static PullRequest getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PullRequestDTO create(PullRequestDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PullRequestDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PullRequestDTO update(PullRequestDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PullRequestDTO.class)
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
    PullRequestDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PullRequestDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PullRequestDTO getDraft(PullRequestDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PullRequestDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PullRequestDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PullRequestDTO save(PullRequestDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PullRequestDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PullRequestDTO> fetchDefault(PullRequestFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PullRequestDTO.class)
    }

}