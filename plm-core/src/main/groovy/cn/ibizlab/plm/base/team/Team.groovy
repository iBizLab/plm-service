package cn.ibizlab.plm.base.team

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.team.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[TEAM]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Team extends GroovyDynaDataEntityRuntime<Team,TeamDTO,TeamFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Team _instance
    void setInstance(Team instance) {
        _instance = instance
    }
    static Team getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    TeamDTO create(TeamDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, TeamDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    TeamDTO update(TeamDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, TeamDTO.class)
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
    TeamDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, TeamDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    TeamDTO getDraft(TeamDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, TeamDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(TeamDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    TeamDTO save(TeamDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, TeamDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<TeamDTO> fetchDefault(TeamFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, TeamDTO.class)
    }

}