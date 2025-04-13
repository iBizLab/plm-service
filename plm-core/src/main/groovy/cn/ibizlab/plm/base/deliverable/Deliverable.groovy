package cn.ibizlab.plm.base.deliverable

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.deliverable.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DELIVERABLE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Deliverable extends GroovyDataEntityRuntime<Deliverable,DeliverableDTO,DeliverableFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_GET_DELIVERY = "get_delivery"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_MY_DELIVERABLE = "my_deliverable"
    public static final String DATASET_PROJECT_DELIVERABLE = "project_deliverable"
    private static Deliverable _instance;
    void setInstance(Deliverable instance) {
        _instance = instance
    }
    static Deliverable getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(DeliverableDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(DeliverableDTO dto) throws Throwable {
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
    def getDraft(DeliverableDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(DeliverableDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(DeliverableDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：获取交付物详情 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_DELIVERY)
    def getDelivery(String key) throws Throwable {
        return this.execute(ACTION_GET_DELIVERY, key)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(DeliverableFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：我的交付物 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_DELIVERABLE)
    def fetchMyDeliverable(DeliverableFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_DELIVERABLE, context)
    }

    /**
     * 数据集：项目下的交付物 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROJECT_DELIVERABLE)
    def fetchProjectDeliverable(DeliverableFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROJECT_DELIVERABLE, context)
    }

}