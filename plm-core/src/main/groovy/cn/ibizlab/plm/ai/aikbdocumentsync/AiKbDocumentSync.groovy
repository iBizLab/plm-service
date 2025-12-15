package cn.ibizlab.plm.ai.aikbdocumentsync

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aikbdocumentsync.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_KB_DOCUMENT_SYNC]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiKbDocumentSync extends GroovyDynaDataEntityRuntime<AiKbDocumentSync,AiKbDocumentSyncDTO,AiKbDocumentSyncFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AiKbDocumentSync _instance
    void setInstance(AiKbDocumentSync instance) {
        _instance = instance
    }
    static AiKbDocumentSync getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiKbDocumentSyncDTO create(AiKbDocumentSyncDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiKbDocumentSyncDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiKbDocumentSyncDTO update(AiKbDocumentSyncDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiKbDocumentSyncDTO.class)
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
    AiKbDocumentSyncDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiKbDocumentSyncDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiKbDocumentSyncDTO getDraft(AiKbDocumentSyncDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiKbDocumentSyncDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiKbDocumentSyncDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiKbDocumentSyncDTO save(AiKbDocumentSyncDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiKbDocumentSyncDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiKbDocumentSyncDTO> fetchDefault(AiKbDocumentSyncFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiKbDocumentSyncDTO.class)
    }

}