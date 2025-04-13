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

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
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
    private static Member _instance;
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
    def create(MemberDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(MemberDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE, dto)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    def remove(List<String> keys) throws Throwable {
        this.execute(ACTION_REMOVE, keys)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    def get(String key) throws Throwable {
        return this.execute(ACTION_GET, key)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    def getDraft(MemberDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(MemberDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(MemberDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：添加成员（职位） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_MEMBER_POSITION)
    def addMemberPosition(MemberDTO dto) throws Throwable {
        this.execute(ACTION_ADD_MEMBER_POSITION, dto)
    }

    /**
     * 行为：添加共享页面非空间下成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_SHARED_PAGE_MEMBER)
    def addSharedPageMember(MemberDTO dto) throws Throwable {
        this.execute(ACTION_ADD_SHARED_PAGE_MEMBER, dto)
    }

    /**
     * 行为：变更角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ROLE)
    def changeRole(MemberDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ROLE, dto)
    }

    /**
     * 行为：新建成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_MEMBER)
    def createMember(MemberDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_MEMBER, dto)
    }

    /**
     * 行为：添加共享页面成员（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOB_ADD_SHARED_MEMBER)
    def mobAddSharedMember(MemberDTO dto) throws Throwable {
        this.execute(ACTION_MOB_ADD_SHARED_MEMBER, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：选择项目集资源成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_PORTFOLIO_RESOURCE)
    def fetchChoosePortfolioResource(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_PORTFOLIO_RESOURCE, context)
    }

    /**
     * 数据集：选择项目资源成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_PROJECT_RESOURCE)
    def fetchChooseProjectResource(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_PROJECT_RESOURCE, context)
    }

    /**
     * 数据集：选择资源成员（全局） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_RESOURCE_MEMBER)
    def fetchChooseResourceMember(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_RESOURCE_MEMBER, context)
    }

    /**
     * 数据集：获取当前项目集下资源成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PORTFOLIO_RESOURCE)
    def fetchCurPortfolioResource(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PORTFOLIO_RESOURCE, context)
    }

    /**
     * 数据集：获取当前项目下资源成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PROJECT_RESOURCE)
    def fetchCurProjectResource(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PROJECT_RESOURCE, context)
    }

    /**
     * 数据集：未关注成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_ATTENTION)
    def fetchNoAttention(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_ATTENTION, context)
    }

    /**
     * 数据集：非空间下成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_SPACE_MMEBER)
    def fetchNotSpaceMmeber(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_SPACE_MMEBER, context)
    }

    /**
     * 数据集：获取资源成员（全局） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RESOURCE_MEMBER)
    def fetchResourceMember(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RESOURCE_MEMBER, context)
    }

    /**
     * 数据集：共享页面_非空间成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SHARED_PAGE_MEMBER)
    def fetchSharedPageMember(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SHARED_PAGE_MEMBER, context)
    }

    /**
     * 数据集：团队管理员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER_GROUP_ADMIN)
    def fetchUserGroupAdmin(MemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER_GROUP_ADMIN, context)
    }

}