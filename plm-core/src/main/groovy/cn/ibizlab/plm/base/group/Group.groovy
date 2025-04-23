package cn.ibizlab.plm.base.group

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.group.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[GROUP]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Group extends GroovyDataEntityRuntime<Group,GroupDTO,GroupFilterDTO> {

    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_NO_SECTION = "no_section"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_USER = "user"
    public static final String DATASET_USER_GROUP_ADMIN = "user_group_admin"
    private static Group _instance
    void setInstance(Group instance) {
        _instance = instance
    }
    static Group getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    GroupDTO create(GroupDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, GroupDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    GroupDTO update(GroupDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, GroupDTO.class)
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
    GroupDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, GroupDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    GroupDTO getDraft(GroupDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, GroupDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(GroupDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    GroupDTO save(GroupDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, GroupDTO.class)
    }

    /**
     * 行为：移动需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(GroupDTO dto) throws Throwable {
        return this.executeForList(ACTION_MOVE_ORDER, dto, GroupDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<GroupDTO> fetchDefault(GroupFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, GroupDTO.class)
    }

    /**
     * 数据集：无分组 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_SECTION)
    Page<GroupDTO> fetchNoSection(GroupFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_SECTION, context, GroupDTO.class)
    }

    /**
     * 数据集：团队默认读取 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<GroupDTO> fetchReader(GroupFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, GroupDTO.class)
    }

    /**
     * 数据集：团队成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    Page<GroupDTO> fetchUser(GroupFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context, GroupDTO.class)
    }

    /**
     * 数据集：团队管理员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER_GROUP_ADMIN)
    Page<GroupDTO> fetchUserGroupAdmin(GroupFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER_GROUP_ADMIN, context, GroupDTO.class)
    }

}