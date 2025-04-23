package cn.ibizlab.plm.base.member

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.member.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MEMBER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Member extends GroovyDataEntityRuntime<Member,MemberDTO,MemberFilterDTO> {

    public static final String ACTION_ADD_MEMBER_POSITION = "add_member_position"
    public static final String ACTION_ADD_SHARED_PAGE_MEMBER = "add_shared_page_member"
    public static final String ACTION_CHANGE_ROLE = "change_role"
    public static final String ACTION_CREATE_MEMBER = "create_member"
    public static final String ACTION_MOB_ADD_SHARED_MEMBER = "mob_add_shared_member"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CHOOSE_PORTFOLIO_RESOURCE = "choose_portfolio_resource"
    public static final String DATASET_CHOOSE_PROJECT_RESOURCE = "choose_project_resource"
    public static final String DATASET_CHOOSE_RESOURCE_MEMBER = "choose_resource_member"
    public static final String DATASET_CUR_PORTFOLIO_RESOURCE = "cur_portfolio_resource"
    public static final String DATASET_CUR_PROJECT_RESOURCE = "cur_project_resource"
    public static final String DATASET_NO_ATTENTION = "no_attention"
    public static final String DATASET_NOT_SPACE_MMEBER = "not_space_mmeber"
    public static final String DATASET_RESOURCE_MEMBER = "resource_member"
    public static final String DATASET_SHARED_PAGE_MEMBER = "shared_page_member"
    public static final String DATASET_USER_GROUP_ADMIN = "user_group_admin"
    private static Member _instance
    void setInstance(Member instance) {
        _instance = instance
    }
    static Member getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MemberDTO create(MemberDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MemberDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MemberDTO update(MemberDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MemberDTO.class)
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
    MemberDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MemberDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MemberDTO getDraft(MemberDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MemberDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MemberDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MemberDTO save(MemberDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MemberDTO.class)
    }

    /**
     * 行为：添加成员（职位） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_MEMBER_POSITION)
    def addMemberPosition(MemberDTO dto) throws Throwable {
        this.execute(ACTION_ADD_MEMBER_POSITION, dto, MemberDTO.class)
    }

    /**
     * 行为：添加共享页面非空间下成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_SHARED_PAGE_MEMBER)
    def addSharedPageMember(MemberDTO dto) throws Throwable {
        this.execute(ACTION_ADD_SHARED_PAGE_MEMBER, dto, MemberDTO.class)
    }

    /**
     * 行为：变更角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ROLE)
    def changeRole(MemberDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ROLE, dto, MemberDTO.class)
    }

    /**
     * 行为：新建成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_MEMBER)
    def createMember(MemberDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_MEMBER, dto, MemberDTO.class)
    }

    /**
     * 行为：添加共享页面成员（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOB_ADD_SHARED_MEMBER)
    def mobAddSharedMember(MemberDTO dto) throws Throwable {
        this.execute(ACTION_MOB_ADD_SHARED_MEMBER, dto, MemberDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MemberDTO> fetchDefault(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MemberDTO.class)
    }

    /**
     * 数据集：选择项目集资源成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_PORTFOLIO_RESOURCE)
    Page<MemberDTO> fetchChoosePortfolioResource(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_PORTFOLIO_RESOURCE, context, MemberDTO.class)
    }

    /**
     * 数据集：选择项目资源成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_PROJECT_RESOURCE)
    Page<MemberDTO> fetchChooseProjectResource(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_PROJECT_RESOURCE, context, MemberDTO.class)
    }

    /**
     * 数据集：选择资源成员（全局） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_RESOURCE_MEMBER)
    Page<MemberDTO> fetchChooseResourceMember(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_RESOURCE_MEMBER, context, MemberDTO.class)
    }

    /**
     * 数据集：获取当前项目集下资源成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PORTFOLIO_RESOURCE)
    Page<MemberDTO> fetchCurPortfolioResource(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PORTFOLIO_RESOURCE, context, MemberDTO.class)
    }

    /**
     * 数据集：获取当前项目下资源成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PROJECT_RESOURCE)
    Page<MemberDTO> fetchCurProjectResource(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PROJECT_RESOURCE, context, MemberDTO.class)
    }

    /**
     * 数据集：未关注成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_ATTENTION)
    Page<MemberDTO> fetchNoAttention(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_ATTENTION, context, MemberDTO.class)
    }

    /**
     * 数据集：非空间下成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_SPACE_MMEBER)
    Page<MemberDTO> fetchNotSpaceMmeber(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_SPACE_MMEBER, context, MemberDTO.class)
    }

    /**
     * 数据集：获取资源成员（全局） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RESOURCE_MEMBER)
    Page<MemberDTO> fetchResourceMember(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RESOURCE_MEMBER, context, MemberDTO.class)
    }

    /**
     * 数据集：共享页面_非空间成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SHARED_PAGE_MEMBER)
    Page<MemberDTO> fetchSharedPageMember(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SHARED_PAGE_MEMBER, context, MemberDTO.class)
    }

    /**
     * 数据集：团队管理员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER_GROUP_ADMIN)
    Page<MemberDefGroupDTO> fetchUserGroupAdmin(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER_GROUP_ADMIN, context, MemberDefGroupDTO.class)
    }

}