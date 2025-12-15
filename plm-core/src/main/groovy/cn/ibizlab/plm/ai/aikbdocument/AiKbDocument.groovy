package cn.ibizlab.plm.ai.aikbdocument

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aikbdocument.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_KB_DOCUMENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiKbDocument extends GroovyDynaDataEntityRuntime<AiKbDocument,AiKbDocumentDTO,AiKbDocumentFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AiKbDocument _instance
    void setInstance(AiKbDocument instance) {
        _instance = instance
    }
    static AiKbDocument getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiKbDocumentDTO create(AiKbDocumentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiKbDocumentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiKbDocumentDTO update(AiKbDocumentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiKbDocumentDTO.class)
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
    AiKbDocumentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiKbDocumentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiKbDocumentDTO getDraft(AiKbDocumentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiKbDocumentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiKbDocumentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiKbDocumentDTO save(AiKbDocumentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiKbDocumentDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiKbDocumentDTO> fetchDefault(AiKbDocumentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiKbDocumentDTO.class)
    }

}