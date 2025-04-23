package cn.ibizlab.plm.devops.build

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.devops.build.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[BUILD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Build extends GroovyDataEntityRuntime<Build,BuildDTO,BuildFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Build _instance
    void setInstance(Build instance) {
        _instance = instance
    }
    static Build getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    BuildDTO create(BuildDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, BuildDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    BuildDTO update(BuildDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, BuildDTO.class)
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
    BuildDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, BuildDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    BuildDTO getDraft(BuildDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, BuildDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(BuildDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    BuildDTO save(BuildDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, BuildDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<BuildDTO> fetchDefault(BuildFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, BuildDTO.class)
    }

}