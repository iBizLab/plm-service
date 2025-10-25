package cn.ibizlab.plm.team.discusstopic

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.team.discusstopic.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DISCUSS_TOPIC]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DiscussTopic extends GroovyDynaDataEntityRuntime<DiscussTopic,DiscussTopicDTO,DiscussTopicFilterDTO> {

    public static final String ACTION_ACTIVATE = "activate"
    public static final String ACTION_ARCHIVE = "archive"
    public static final String ACTION_CHANGE_ADMIN_ROLE = "change_admin_role"
    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_FAVORITE = "favorite"
    public static final String ACTION_MOB_CHANGE_ADMIN_ROLE = "mob_change_admin_role"
    public static final String ACTION_MOVE_DISCUSS_TOPIC = "move_discuss_topic"
    public static final String ACTION_RECOVER = "recover"
    public static final String ACTION_UN_FAVORITE = "un_favorite"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ADMIN = "admin"
    public static final String DATASET_ARCHIVED = "archived"
    public static final String DATASET_ARCHIVED_MAIN = "archived_main"
    public static final String DATASET_DELETED = "deleted"
    public static final String DATASET_FAVORITE = "favorite"
    public static final String DATASET_GROUP = "group"
    public static final String DATASET_MAIN = "main"
    public static final String DATASET_NORMAL = "normal"
    public static final String DATASET_OSS_MAIN = "oss_main"
    public static final String DATASET_QUICK = "quick"
    public static final String DATASET_QUICK_USER = "quick_user"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_USER = "user"
    private static DiscussTopic _instance
    void setInstance(DiscussTopic instance) {
        _instance = instance
    }
    static DiscussTopic getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DiscussTopicDTO create(DiscussTopicDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DiscussTopicDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DiscussTopicDTO update(DiscussTopicDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DiscussTopicDTO.class)
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
    DiscussTopicDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DiscussTopicDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DiscussTopicDTO getDraft(DiscussTopicDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DiscussTopicDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DiscussTopicDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DiscussTopicDTO save(DiscussTopicDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DiscussTopicDTO.class)
    }

    /**
     * 行为：激活 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ACTIVATE)
    def activate(DiscussTopicDTO dto) throws Throwable {
        this.execute(ACTION_ACTIVATE, dto, DiscussTopicDTO.class)
    }

    /**
     * 行为：归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ARCHIVE)
    def archive(DiscussTopicDTO dto) throws Throwable {
        this.execute(ACTION_ARCHIVE, dto, DiscussTopicDTO.class)
    }

    /**
     * 行为：变更管理员角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ADMIN_ROLE)
    def changeAdminRole(DiscussTopicDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ADMIN_ROLE, dto, DiscussTopicDTO.class)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(DiscussTopicDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto, DiscussTopicDTO.class)
    }

    /**
     * 行为：设置星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FAVORITE)
    def favorite(DiscussTopicDTO dto) throws Throwable {
        this.execute(ACTION_FAVORITE, dto, DiscussTopicDTO.class)
    }

    /**
     * 行为：变更管理员角色（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOB_CHANGE_ADMIN_ROLE)
    def mobChangeAdminRole(DiscussTopicDTO dto) throws Throwable {
        this.execute(ACTION_MOB_CHANGE_ADMIN_ROLE, dto, DiscussTopicDTO.class)
    }

    /**
     * 行为：移动话题 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_DISCUSS_TOPIC)
    def moveDiscussTopic(DiscussTopicDTO dto) throws Throwable {
        this.execute(ACTION_MOVE_DISCUSS_TOPIC, dto, DiscussTopicDTO.class)
    }

    /**
     * 行为：恢复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER)
    def recover(DiscussTopicDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER, dto, DiscussTopicDTO.class)
    }

    /**
     * 行为：取消星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UN_FAVORITE)
    def unFavorite(DiscussTopicDTO dto) throws Throwable {
        this.execute(ACTION_UN_FAVORITE, dto, DiscussTopicDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DiscussTopicDTO> fetchDefault(DiscussTopicFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DiscussTopicDTO.class)
    }

    /**
     * 数据集：管理员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADMIN)
    Page<DiscussTopicDTO> fetchAdmin(DiscussTopicFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADMIN, context, DiscussTopicDTO.class)
    }

    /**
     * 数据集：已归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ARCHIVED)
    Page<DiscussTopicDTO> fetchArchived(DiscussTopicFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ARCHIVED, context, DiscussTopicDTO.class)
    }

    /**
     * 数据集：已归档（主视图） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ARCHIVED_MAIN)
    Page<DiscussTopicDTO> fetchArchivedMain(DiscussTopicFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ARCHIVED_MAIN, context, DiscussTopicDTO.class)
    }

    /**
     * 数据集：已删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DELETED)
    Page<DiscussTopicDTO> fetchDeleted(DiscussTopicFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DELETED, context, DiscussTopicDTO.class)
    }

    /**
     * 数据集：星标话题 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FAVORITE)
    Page<DiscussTopicDTO> fetchFavorite(DiscussTopicFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FAVORITE, context, DiscussTopicDTO.class)
    }

    /**
     * 数据集：团队话题 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_GROUP)
    Page<DiscussTopicDTO> fetchGroup(DiscussTopicFilterDTO context) throws Throwable {
        return this.fetch(DATASET_GROUP, context, DiscussTopicDTO.class)
    }

    /**
     * 数据集：主表格查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MAIN)
    Page<DiscussTopicDTO> fetchMain(DiscussTopicFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MAIN, context, DiscussTopicDTO.class)
    }

    /**
     * 数据集：正常状态话题 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    Page<DiscussTopicDTO> fetchNormal(DiscussTopicFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context, DiscussTopicDTO.class)
    }

    /**
     * 数据集：开源社区查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OSS_MAIN)
    Page<DiscussTopicDTO> fetchOssMain(DiscussTopicFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OSS_MAIN, context, DiscussTopicDTO.class)
    }

    /**
     * 数据集：快速新建查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_QUICK)
    Page<DiscussTopicDTO> fetchQuick(DiscussTopicFilterDTO context) throws Throwable {
        return this.fetch(DATASET_QUICK, context, DiscussTopicDTO.class)
    }

    /**
     * 数据集：快速新建查询（管理用户） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_QUICK_USER)
    Page<DiscussTopicDTO> fetchQuickUser(DiscussTopicFilterDTO context) throws Throwable {
        return this.fetch(DATASET_QUICK_USER, context, DiscussTopicDTO.class)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<DiscussTopicDTO> fetchReader(DiscussTopicFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, DiscussTopicDTO.class)
    }

    /**
     * 数据集：操作用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    Page<DiscussTopicDTO> fetchUser(DiscussTopicFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context, DiscussTopicDTO.class)
    }

}