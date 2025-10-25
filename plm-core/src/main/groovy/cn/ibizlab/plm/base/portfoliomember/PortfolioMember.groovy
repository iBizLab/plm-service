package cn.ibizlab.plm.base.portfoliomember

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.portfoliomember.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PORTFOLIO_MEMBER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PortfolioMember extends GroovyDynaDataEntityRuntime<PortfolioMember,PortfolioMemberDTO,PortfolioMemberFilterDTO> {

    public static final String ACTION_CHANGE_ROLE = "change_role"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_PROJECT_SET = "cur_project_set"
    private static PortfolioMember _instance
    void setInstance(PortfolioMember instance) {
        _instance = instance
    }
    static PortfolioMember getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PortfolioMemberDTO create(PortfolioMemberDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PortfolioMemberDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PortfolioMemberDTO update(PortfolioMemberDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PortfolioMemberDTO.class)
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
    PortfolioMemberDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PortfolioMemberDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PortfolioMemberDTO getDraft(PortfolioMemberDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PortfolioMemberDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PortfolioMemberDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PortfolioMemberDTO save(PortfolioMemberDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PortfolioMemberDTO.class)
    }

    /**
     * 行为：变更角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ROLE)
    def changeRole(PortfolioMemberDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ROLE, dto, PortfolioMemberDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PortfolioMemberDTO> fetchDefault(PortfolioMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PortfolioMemberDTO.class)
    }

    /**
     * 数据集：当前项目集下成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PROJECT_SET)
    Page<PortfolioMemberDTO> fetchCurProjectSet(PortfolioMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PROJECT_SET, context, PortfolioMemberDTO.class)
    }

}