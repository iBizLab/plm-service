package cn.ibizlab.plm.ai.aikbmember

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aikbmember.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_KB_MEMBER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiKbMember extends GroovyDynaDataEntityRuntime<AiKbMember,AiKbMemberDTO,AiKbMemberFilterDTO> {

    public static final String ACTION_CHANGE_ROLE = "change_role"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_VALID = "VALID"
    private static AiKbMember _instance
    void setInstance(AiKbMember instance) {
        _instance = instance
    }
    static AiKbMember getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiKbMemberDTO create(AiKbMemberDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiKbMemberDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiKbMemberDTO update(AiKbMemberDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiKbMemberDTO.class)
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
    AiKbMemberDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiKbMemberDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiKbMemberDTO getDraft(AiKbMemberDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiKbMemberDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiKbMemberDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiKbMemberDTO save(AiKbMemberDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiKbMemberDTO.class)
    }

    /**
     * 行为：变更角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ROLE)
    def changeRole(AiKbMemberDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ROLE, dto, AiKbMemberDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiKbMemberDTO> fetchDefault(AiKbMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiKbMemberDTO.class)
    }

    /**
     * 数据集：启用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_VALID)
    Page<AiKbMemberDTO> fetchValid(AiKbMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_VALID, context, AiKbMemberDTO.class)
    }

}