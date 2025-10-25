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
class Deliverable extends GroovyDynaDataEntityRuntime<Deliverable,DeliverableDTO,DeliverableFilterDTO> {

    public static final String ACTION_GET_DELIVERY = "get_delivery"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_MY_DELIVERABLE = "my_deliverable"
    public static final String DATASET_PROJECT_DELIVERABLE = "project_deliverable"
    private static Deliverable _instance
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
    DeliverableDTO create(DeliverableDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DeliverableDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DeliverableDTO update(DeliverableDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DeliverableDTO.class)
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
    DeliverableDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DeliverableDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DeliverableDTO getDraft(DeliverableDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DeliverableDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DeliverableDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DeliverableDTO save(DeliverableDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DeliverableDTO.class)
    }

    /**
     * 行为：获取交付物详情 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_DELIVERY)
    def getDelivery(String key) throws Throwable {
        return this.execute(ACTION_GET_DELIVERY, key, DeliverableDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DeliverableDTO> fetchDefault(DeliverableFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DeliverableDTO.class)
    }

    /**
     * 数据集：我的交付物 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_DELIVERABLE)
    Page<DeliverableDTO> fetchMyDeliverable(DeliverableFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_DELIVERABLE, context, DeliverableDTO.class)
    }

    /**
     * 数据集：项目下的交付物 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROJECT_DELIVERABLE)
    Page<DeliverableDTO> fetchProjectDeliverable(DeliverableFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROJECT_DELIVERABLE, context, DeliverableDTO.class)
    }

}