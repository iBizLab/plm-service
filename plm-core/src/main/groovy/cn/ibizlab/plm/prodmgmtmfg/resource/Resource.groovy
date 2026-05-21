package cn.ibizlab.plm.prodmgmtmfg.resource

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.prodmgmtmfg.resource.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RESOURCE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Resource extends GroovyDynaDataEntityRuntime<Resource,ResourceDTO,ResourceFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Resource _instance
    void setInstance(Resource instance) {
        _instance = instance
    }
    static Resource getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResourceDTO create(ResourceDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResourceDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResourceDTO update(ResourceDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResourceDTO.class)
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
    ResourceDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResourceDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResourceDTO getDraft(ResourceDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResourceDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResourceDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResourceDTO save(ResourceDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResourceDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ResourceDTO> fetchDefault(ResourceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ResourceDTO.class)
    }

}