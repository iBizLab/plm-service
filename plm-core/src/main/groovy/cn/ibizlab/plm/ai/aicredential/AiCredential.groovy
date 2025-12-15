package cn.ibizlab.plm.ai.aicredential

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aicredential.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_CREDENTIAL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiCredential extends GroovyDynaDataEntityRuntime<AiCredential,AiCredentialDTO,AiCredentialFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AiCredential _instance
    void setInstance(AiCredential instance) {
        _instance = instance
    }
    static AiCredential getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiCredentialDTO create(AiCredentialDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiCredentialDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiCredentialDTO update(AiCredentialDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiCredentialDTO.class)
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
    AiCredentialDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiCredentialDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiCredentialDTO getDraft(AiCredentialDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiCredentialDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiCredentialDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiCredentialDTO save(AiCredentialDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiCredentialDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiCredentialDTO> fetchDefault(AiCredentialFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiCredentialDTO.class)
    }

}