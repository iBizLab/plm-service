package cn.ibizlab.plm.devops.repository

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.devops.repository.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[REPOSITORY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Repository extends GroovyDataEntityRuntime<Repository,RepositoryDTO,RepositoryFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Repository _instance
    void setInstance(Repository instance) {
        _instance = instance
    }
    static Repository getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    RepositoryDTO create(RepositoryDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, RepositoryDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    RepositoryDTO update(RepositoryDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, RepositoryDTO.class)
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
    RepositoryDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, RepositoryDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    RepositoryDTO getDraft(RepositoryDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, RepositoryDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(RepositoryDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    RepositoryDTO save(RepositoryDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, RepositoryDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<RepositoryDTO> fetchDefault(RepositoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, RepositoryDTO.class)
    }

}