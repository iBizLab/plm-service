package cn.ibizlab.plm.projmgmt.sprintalteration

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.sprintalteration.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SPRINT_ALTERATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SprintAlteration extends GroovyDataEntityRuntime<SprintAlteration,SprintAlterationDTO,SprintAlterationFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_REP_CHANGE = "rep_change"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CHANGE = "change"
    private static SprintAlteration _instance;
    void setInstance(SprintAlteration instance) {
        _instance = instance
    }
    static SprintAlteration getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(SprintAlterationDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(SprintAlterationDTO dto) throws Throwable {
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
    def getDraft(SprintAlterationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(SprintAlterationDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(SprintAlterationDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：迭代变更统计 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_REP_CHANGE)
    def repChange(SprintAlterationDTO dto) throws Throwable {
        return this.execute(ACTION_REP_CHANGE, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(SprintAlterationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：工作项迭代变更记录 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHANGE)
    def fetchChange(SprintAlterationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHANGE, context)
    }

}