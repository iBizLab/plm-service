package cn.ibizlab.plm.projmgmt.stage

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.stage.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[STAGE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Stage extends GroovyDataEntityRuntime<Stage,StageDTO,StageFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_ADD_ADD_PREDEFINED = "add_add_predefined"
    public static final String ACTION_DEL = "del"
    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_OWNER_SYS = "cur_owner_sys"
    public static final String DATASET_CUR_PROJECT = "cur_project"
    public static final String DATASET_CUR_STAGE = "cur_stage"
    public static final String DATASET_OWNER = "owner"
    public static final String DATASET_SYSTEM = "system"
    private static Stage _instance;
    void setInstance(Stage instance) {
        _instance = instance
    }
    static Stage getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(StageDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(StageDTO dto) throws Throwable {
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
    def getDraft(StageDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(StageDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(StageDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：添加全局预定义阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_ADD_PREDEFINED)
    def addPredefined(StageDTO dto) throws Throwable {
        this.execute(ACTION_ADD_ADD_PREDEFINED, dto)
    }

    /**
     * 行为：删除发布阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DEL)
    def del(StageDTO dto) throws Throwable {
        this.execute(ACTION_DEL, dto)
    }

    /**
     * 行为：移动排序 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(StageDTO dto) throws Throwable {
        return this.execute(ACTION_MOVE_ORDER, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(StageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：全局阶段和所属阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_OWNER_SYS)
    def fetchCurOwnerSys(StageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_OWNER_SYS, context)
    }

    /**
     * 数据集：当前项目下的发布阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PROJECT)
    def fetchCurProject(StageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PROJECT, context)
    }

    /**
     * 数据集：发布所属阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_STAGE)
    def fetchCurStage(StageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_STAGE, context)
    }

    /**
     * 数据集：发布所属阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OWNER)
    def fetchOwner(StageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OWNER, context)
    }

    /**
     * 数据集：全局级发布阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SYSTEM)
    def fetchSystem(StageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SYSTEM, context)
    }

}