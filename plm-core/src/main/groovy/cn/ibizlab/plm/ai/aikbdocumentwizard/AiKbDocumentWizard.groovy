package cn.ibizlab.plm.ai.aikbdocumentwizard

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aikbdocumentwizard.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_KB_DOCUMENT_WIZARD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiKbDocumentWizard extends GroovyDynaDataEntityRuntime<AiKbDocumentWizard,AiKbDocumentWizardDTO,AiKbDocumentWizardFilterDTO> {

    public static final String ACTION_CREATE_AI_KB_DOC = "create_ai_kb_doc"
    public static final String ACTION_FILL_KB_CHUNK = "fill_kb_chunk"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AiKbDocumentWizard _instance
    void setInstance(AiKbDocumentWizard instance) {
        _instance = instance
    }
    static AiKbDocumentWizard getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiKbDocumentWizardDTO create(AiKbDocumentWizardDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiKbDocumentWizardDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiKbDocumentWizardDTO update(AiKbDocumentWizardDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiKbDocumentWizardDTO.class)
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
    AiKbDocumentWizardDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiKbDocumentWizardDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiKbDocumentWizardDTO getDraft(AiKbDocumentWizardDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiKbDocumentWizardDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiKbDocumentWizardDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiKbDocumentWizardDTO save(AiKbDocumentWizardDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiKbDocumentWizardDTO.class)
    }

    /**
     * 行为：创建知识库文档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_AI_KB_DOC)
    def createAiKbDoc(AiKbDocumentWizardDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_AI_KB_DOC, dto, AiKbDocumentWizardDTO.class)
    }

    /**
     * 行为：填充知识库切片策略 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILL_KB_CHUNK)
    def fillKbChunk(AiKbDocumentWizardDTO dto) throws Throwable {
        this.execute(ACTION_FILL_KB_CHUNK, dto, AiKbDocumentWizardDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiKbDocumentWizardDTO> fetchDefault(AiKbDocumentWizardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiKbDocumentWizardDTO.class)
    }

}