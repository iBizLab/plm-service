package cn.ibizlab.plm.ai.aiagentknowledgerel

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aiagentknowledgerel.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_AGENT_KNOWLEDGE_REL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiAgentKnowledgeRel extends GroovyDynaDataEntityRuntime<AiAgentKnowledgeRel,AiAgentKnowledgeRelDTO,AiAgentKnowledgeRelFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AiAgentKnowledgeRel _instance
    void setInstance(AiAgentKnowledgeRel instance) {
        _instance = instance
    }
    static AiAgentKnowledgeRel getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiAgentKnowledgeRelDTO create(AiAgentKnowledgeRelDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiAgentKnowledgeRelDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiAgentKnowledgeRelDTO update(AiAgentKnowledgeRelDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiAgentKnowledgeRelDTO.class)
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
    AiAgentKnowledgeRelDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiAgentKnowledgeRelDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiAgentKnowledgeRelDTO getDraft(AiAgentKnowledgeRelDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiAgentKnowledgeRelDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiAgentKnowledgeRelDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiAgentKnowledgeRelDTO save(AiAgentKnowledgeRelDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiAgentKnowledgeRelDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiAgentKnowledgeRelDTO> fetchDefault(AiAgentKnowledgeRelFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiAgentKnowledgeRelDTO.class)
    }

}