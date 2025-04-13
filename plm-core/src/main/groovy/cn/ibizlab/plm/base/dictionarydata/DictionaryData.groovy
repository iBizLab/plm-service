package cn.ibizlab.plm.base.dictionarydata

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.dictionarydata.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DICTIONARY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DictionaryData extends GroovyDataEntityRuntime<DictionaryData,DictionaryDataDTO,DictionaryDataFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_IDEA_STATE = "idea_state"
    public static final String DATASET_RELEASE_STAGE = "release_stage"
    public static final String DATASET_TICKET_STATE = "ticket_state"
    private static DictionaryData _instance;
    void setInstance(DictionaryData instance) {
        _instance = instance
    }
    static DictionaryData getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(DictionaryDataDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(DictionaryDataDTO dto) throws Throwable {
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
    def getDraft(DictionaryDataDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(DictionaryDataDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(DictionaryDataDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：移动排序 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(DictionaryDataDTO dto) throws Throwable {
        return this.execute(ACTION_MOVE_ORDER, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：需求状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_STATE)
    def fetchIdeaState(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_STATE, context)
    }

    /**
     * 数据集：发布阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELEASE_STAGE)
    def fetchReleaseStage(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELEASE_STAGE, context)
    }

    /**
     * 数据集：工单状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TICKET_STATE)
    def fetchTicketState(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TICKET_STATE, context)
    }

}