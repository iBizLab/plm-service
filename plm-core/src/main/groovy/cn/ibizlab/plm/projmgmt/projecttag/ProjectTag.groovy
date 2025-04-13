package cn.ibizlab.plm.projmgmt.projecttag

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.projecttag.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PROJECT_TAG]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ProjectTag extends GroovyDataEntityRuntime<ProjectTag,ProjectTagDTO,ProjectTagFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_DELETE_TAG = "delete_tag"
    public static final String ACTION_GET_CON_PROJECT_TAG = "get_con_project_tag"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ProjectTag _instance;
    void setInstance(ProjectTag instance) {
        _instance = instance
    }
    static ProjectTag getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(ProjectTagDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(ProjectTagDTO dto) throws Throwable {
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
    def getDraft(ProjectTagDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(ProjectTagDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(ProjectTagDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：删除标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_TAG)
    def deleteTag(ProjectTagDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_TAG, dto)
    }

    /**
     * 行为：获取关联的工作项 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_CON_PROJECT_TAG)
    def getConProjectTag(String key) throws Throwable {
        return this.execute(ACTION_GET_CON_PROJECT_TAG, key)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(ProjectTagFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

}