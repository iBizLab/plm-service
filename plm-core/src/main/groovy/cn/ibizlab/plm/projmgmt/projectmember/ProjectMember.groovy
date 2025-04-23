package cn.ibizlab.plm.projmgmt.projectmember

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.projectmember.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PROJECT_MEMBER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ProjectMember extends GroovyDataEntityRuntime<ProjectMember,ProjectMemberDTO,ProjectMemberFilterDTO> {

    public static final String ACTION_CHANGE_POSITION = "change_position"
    public static final String ACTION_CHANGE_ROLE = "change_role"
    public static final String ACTION_MOB_CREATE_PROJECT_MEMBER = "mob_create_project_member"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_PROJECT = "CUR_PROJECT"
    public static final String DATASET_NO_ATTENTION = "no_attention"
    private static ProjectMember _instance
    void setInstance(ProjectMember instance) {
        _instance = instance
    }
    static ProjectMember getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ProjectMemberDTO create(ProjectMemberDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ProjectMemberDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ProjectMemberDTO update(ProjectMemberDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ProjectMemberDTO.class)
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
    ProjectMemberDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ProjectMemberDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ProjectMemberDTO getDraft(ProjectMemberDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ProjectMemberDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ProjectMemberDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ProjectMemberDTO save(ProjectMemberDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ProjectMemberDTO.class)
    }

    /**
     * 行为：变更职位 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_POSITION)
    def changePosition(ProjectMemberDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_POSITION, dto, ProjectMemberDTO.class)
    }

    /**
     * 行为：变更角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ROLE)
    def changeRole(ProjectMemberDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ROLE, dto, ProjectMemberDTO.class)
    }

    /**
     * 行为：新建项目成员（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOB_CREATE_PROJECT_MEMBER)
    def mobCreateProjectMember(ProjectMemberDTO dto) throws Throwable {
        return this.execute(ACTION_MOB_CREATE_PROJECT_MEMBER, dto, ProjectMemberDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ProjectMemberDTO> fetchDefault(ProjectMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ProjectMemberDTO.class)
    }

    /**
     * 数据集：当前项目成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PROJECT)
    Page<ProjectMemberDTO> fetchCurProject(ProjectMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PROJECT, context, ProjectMemberDTO.class)
    }

    /**
     * 数据集：未关注用户(工作项) 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_ATTENTION)
    Page<ProjectMemberDTO> fetchNoAttention(ProjectMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_ATTENTION, context, ProjectMemberDTO.class)
    }

}