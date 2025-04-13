package cn.ibizlab.plm.base.activity

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.activity.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ACTIVITY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Activity extends GroovyDataEntityRuntime<Activity,ActivityDTO,ActivityFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_GET_ACTIVITY_OBJ_DETAIL = "get_activity_obj_detail"
    public static final String DATASET_ALL = "ALL"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Activity _instance;
    void setInstance(Activity instance) {
        _instance = instance
    }
    static Activity getInstance() {
        return _instance
    }

    /**
     * 行为：创建活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(ActivityDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：更新活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(ActivityDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE, dto)
    }

    /**
     * 行为：删除活动 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    def remove(List<String> keys) throws Throwable {
        this.execute(ACTION_REMOVE, keys)
    }

    /**
     * 行为：获取活动 实际功能
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
    def getDraft(ActivityDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(ActivityDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(ActivityDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：获取活动对象详情 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_ACTIVITY_OBJ_DETAIL)
    def getActivityObjDetail(ActivityDTO dto) throws Throwable {
        this.execute(ACTION_GET_ACTIVITY_OBJ_DETAIL, dto)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    def fetchALL(ActivityFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(ActivityFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

}