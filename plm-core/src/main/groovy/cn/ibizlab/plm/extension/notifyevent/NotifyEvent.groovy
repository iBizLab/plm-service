package cn.ibizlab.plm.extension.notifyevent

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.extension.notifyevent.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[NOTIFY_EVENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class NotifyEvent extends GroovyDynaDataEntityRuntime<NotifyEvent,NotifyEventDTO,NotifyEventFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static NotifyEvent _instance
    void setInstance(NotifyEvent instance) {
        _instance = instance
    }
    static NotifyEvent getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    NotifyEventDTO create(NotifyEventDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, NotifyEventDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    NotifyEventDTO update(NotifyEventDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, NotifyEventDTO.class)
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
    NotifyEventDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, NotifyEventDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    NotifyEventDTO getDraft(NotifyEventDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, NotifyEventDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(NotifyEventDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    NotifyEventDTO save(NotifyEventDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, NotifyEventDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<NotifyEventDTO> fetchDefault(NotifyEventFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, NotifyEventDTO.class)
    }

}