package cn.ibizlab.plm.ai.aiagenttoolrel

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aiagenttoolrel.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_AGENT_TOOL_REL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiAgentToolRel extends GroovyDynaDataEntityRuntime<AiAgentToolRel,AiAgentToolRelDTO,AiAgentToolRelFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AiAgentToolRel _instance
    void setInstance(AiAgentToolRel instance) {
        _instance = instance
    }
    static AiAgentToolRel getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiAgentToolRelDTO create(AiAgentToolRelDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiAgentToolRelDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiAgentToolRelDTO update(AiAgentToolRelDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiAgentToolRelDTO.class)
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
    AiAgentToolRelDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiAgentToolRelDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiAgentToolRelDTO getDraft(AiAgentToolRelDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiAgentToolRelDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiAgentToolRelDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiAgentToolRelDTO save(AiAgentToolRelDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiAgentToolRelDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiAgentToolRelDTO> fetchDefault(AiAgentToolRelFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiAgentToolRelDTO.class)
    }

}