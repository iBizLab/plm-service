package cn.ibizlab.plm.base.management

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.management.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MANAGEMENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Management extends GroovyDataEntityRuntime<Management,ManagementDTO,ManagementFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Management _instance
    void setInstance(Management instance) {
        _instance = instance
    }
    static Management getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ManagementDTO create(ManagementDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ManagementDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ManagementDTO update(ManagementDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ManagementDTO.class)
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
    ManagementDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ManagementDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ManagementDTO getDraft(ManagementDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ManagementDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ManagementDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ManagementDTO save(ManagementDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ManagementDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ManagementDTO> fetchDefault(ManagementFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ManagementDTO.class)
    }

}