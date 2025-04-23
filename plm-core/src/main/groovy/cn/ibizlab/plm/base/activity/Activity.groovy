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

    public static final String ACTION_GET_ACTIVITY_OBJ_DETAIL = "get_activity_obj_detail"
    public static final String DATASET_ALL = "ALL"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Activity _instance
    void setInstance(Activity instance) {
        _instance = instance
    }
    static Activity getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ActivityDTO create(ActivityDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ActivityDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ActivityDTO update(ActivityDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ActivityDTO.class)
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
    ActivityDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ActivityDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ActivityDTO getDraft(ActivityDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ActivityDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ActivityDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ActivityDTO save(ActivityDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ActivityDTO.class)
    }

    /**
     * 行为：获取活动对象详情 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_ACTIVITY_OBJ_DETAIL)
    def getActivityObjDetail(ActivityDTO dto) throws Throwable {
        this.execute(ACTION_GET_ACTIVITY_OBJ_DETAIL, dto, ActivityDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<ActivityDTO> fetchALL(ActivityFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, ActivityDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ActivityDTO> fetchDefault(ActivityFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ActivityDTO.class)
    }

}