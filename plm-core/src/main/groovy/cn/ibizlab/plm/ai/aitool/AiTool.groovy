package cn.ibizlab.plm.ai.aitool

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aitool.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_TOOL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiTool extends GroovyDynaDataEntityRuntime<AiTool,AiToolDTO,AiToolFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AiTool _instance
    void setInstance(AiTool instance) {
        _instance = instance
    }
    static AiTool getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiToolDTO create(AiToolDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiToolDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiToolDTO update(AiToolDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiToolDTO.class)
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
    AiToolDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiToolDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiToolDTO getDraft(AiToolDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiToolDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiToolDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiToolDTO save(AiToolDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiToolDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiToolDTO> fetchDefault(AiToolFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiToolDTO.class)
    }

}