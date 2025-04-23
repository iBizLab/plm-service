package cn.ibizlab.plm.insight.insightmember

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.insight.insightmember.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[INSIGHT_MEMBER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class InsightMember extends GroovyDataEntityRuntime<InsightMember,InsightMemberDTO,InsightMemberFilterDTO> {

    public static final String ACTION_CHANGE_ROLE = "change_role"
    public static final String ACTION_CHOOSE_POSITION = "choose_position"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static InsightMember _instance
    void setInstance(InsightMember instance) {
        _instance = instance
    }
    static InsightMember getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    InsightMemberDTO create(InsightMemberDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, InsightMemberDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    InsightMemberDTO update(InsightMemberDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, InsightMemberDTO.class)
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
    InsightMemberDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, InsightMemberDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    InsightMemberDTO getDraft(InsightMemberDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, InsightMemberDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(InsightMemberDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    InsightMemberDTO save(InsightMemberDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, InsightMemberDTO.class)
    }

    /**
     * 行为：变更角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ROLE)
    def changeRole(InsightMemberDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ROLE, dto, InsightMemberDTO.class)
    }

    /**
     * 行为：变更职位 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHOOSE_POSITION)
    def choosePosition(InsightMemberDTO dto) throws Throwable {
        this.execute(ACTION_CHOOSE_POSITION, dto, InsightMemberDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<InsightMemberDTO> fetchDefault(InsightMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, InsightMemberDTO.class)
    }

}