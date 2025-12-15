package cn.ibizlab.plm.ai.aimodel

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aimodel.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_MODEL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiModel extends GroovyDynaDataEntityRuntime<AiModel,AiModelDTO,AiModelFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AiModel _instance
    void setInstance(AiModel instance) {
        _instance = instance
    }
    static AiModel getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiModelDTO create(AiModelDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiModelDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiModelDTO update(AiModelDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiModelDTO.class)
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
    AiModelDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiModelDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiModelDTO getDraft(AiModelDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiModelDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiModelDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiModelDTO save(AiModelDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiModelDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiModelDTO> fetchDefault(AiModelFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiModelDTO.class)
    }

}