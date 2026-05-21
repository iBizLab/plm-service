package cn.ibizlab.plm.base.extendscheduledtask

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.extendscheduledtask.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[EXTEND_SCHEDULED_TASK]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ExtendScheduledTask extends GroovyDynaDataEntityRuntime<ExtendScheduledTask,ExtendScheduledTaskDTO,ExtendScheduledTaskFilterDTO> {

    public static final String ACTION_DOC_PARSING_RECORD = "doc_parsing_record"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ExtendScheduledTask _instance
    void setInstance(ExtendScheduledTask instance) {
        _instance = instance
    }
    static ExtendScheduledTask getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ExtendScheduledTaskDTO create(ExtendScheduledTaskDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ExtendScheduledTaskDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ExtendScheduledTaskDTO update(ExtendScheduledTaskDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ExtendScheduledTaskDTO.class)
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
    ExtendScheduledTaskDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ExtendScheduledTaskDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ExtendScheduledTaskDTO getDraft(ExtendScheduledTaskDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ExtendScheduledTaskDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ExtendScheduledTaskDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ExtendScheduledTaskDTO save(ExtendScheduledTaskDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ExtendScheduledTaskDTO.class)
    }

    /**
     * 行为：文档解析记录 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DOC_PARSING_RECORD)
    def docParsingRecord(ExtendScheduledTaskDTO dto) throws Throwable {
        this.execute(ACTION_DOC_PARSING_RECORD, dto, ExtendScheduledTaskDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ExtendScheduledTaskDTO> fetchDefault(ExtendScheduledTaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ExtendScheduledTaskDTO.class)
    }

}