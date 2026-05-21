package cn.ibizlab.plm.ai.aiknowledgebase

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aiknowledgebase.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_KNOWLEDGE_BASE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiKnowledgeBase extends GroovyDynaDataEntityRuntime<AiKnowledgeBase,AiKnowledgeBaseDTO,AiKnowledgeBaseFilterDTO> {

    public static final String ACTION_CHANGE_ADMIN_ROLE = "change_admin_role"
    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_FILL_TEMP = "fill_temp"
    public static final String ACTION_RECOVER = "recover"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ADMIN = "admin"
    public static final String DATASET_DELETED = "deleted"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_USER = "user"
    public static final String DATASET_VALID = "VALID"
    private static AiKnowledgeBase _instance
    void setInstance(AiKnowledgeBase instance) {
        _instance = instance
    }
    static AiKnowledgeBase getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiKnowledgeBaseDTO create(AiKnowledgeBaseDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiKnowledgeBaseDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiKnowledgeBaseDTO update(AiKnowledgeBaseDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiKnowledgeBaseDTO.class)
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
    AiKnowledgeBaseDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiKnowledgeBaseDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiKnowledgeBaseDTO getDraft(AiKnowledgeBaseDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiKnowledgeBaseDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiKnowledgeBaseDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiKnowledgeBaseDTO save(AiKnowledgeBaseDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiKnowledgeBaseDTO.class)
    }

    /**
     * 行为：变更管理员角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ADMIN_ROLE)
    def changeAdminRole(AiKnowledgeBaseDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ADMIN_ROLE, dto, AiKnowledgeBaseDTO.class)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(AiKnowledgeBaseDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto, AiKnowledgeBaseDTO.class)
    }

    /**
     * 行为：填充拷贝数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILL_TEMP)
    def fillTemp(AiKnowledgeBaseDTO dto) throws Throwable {
        this.execute(ACTION_FILL_TEMP, dto, AiKnowledgeBaseDTO.class)
    }

    /**
     * 行为：恢复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER)
    def recover(AiKnowledgeBaseDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER, dto, AiKnowledgeBaseDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiKnowledgeBaseDTO> fetchDefault(AiKnowledgeBaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiKnowledgeBaseDTO.class)
    }

    /**
     * 数据集：管理员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADMIN)
    Page<AiKnowledgeBaseDTO> fetchAdmin(AiKnowledgeBaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADMIN, context, AiKnowledgeBaseDTO.class)
    }

    /**
     * 数据集：已删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DELETED)
    Page<AiKnowledgeBaseDTO> fetchDeleted(AiKnowledgeBaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DELETED, context, AiKnowledgeBaseDTO.class)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<AiKnowledgeBaseDTO> fetchReader(AiKnowledgeBaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, AiKnowledgeBaseDTO.class)
    }

    /**
     * 数据集：操作用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    Page<AiKnowledgeBaseDTO> fetchUser(AiKnowledgeBaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context, AiKnowledgeBaseDTO.class)
    }

    /**
     * 数据集：启用数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_VALID)
    Page<AiKnowledgeBaseDefGroupDTO> fetchValid(AiKnowledgeBaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_VALID, context, AiKnowledgeBaseDefGroupDTO.class)
    }

}