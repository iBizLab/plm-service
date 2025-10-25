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
class Stage extends GroovyDynaDataEntityRuntime<Stage,StageDTO,StageFilterDTO> {

    public static final String ACTION_ADD_ADD_PREDEFINED = "add_add_predefined"
    public static final String ACTION_DEL = "del"
    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_OWNER_SYS = "cur_owner_sys"
    public static final String DATASET_CUR_PROJECT = "cur_project"
    public static final String DATASET_CUR_STAGE = "cur_stage"
    public static final String DATASET_OWNER = "owner"
    public static final String DATASET_SYSTEM = "system"
    private static Stage _instance
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
    StageDTO create(StageDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, StageDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    StageDTO update(StageDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, StageDTO.class)
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
    StageDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, StageDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    StageDTO getDraft(StageDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, StageDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(StageDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    StageDTO save(StageDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, StageDTO.class)
    }

    /**
     * 行为：添加全局预定义阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_ADD_PREDEFINED)
    def addPredefined(StageDTO dto) throws Throwable {
        this.execute(ACTION_ADD_ADD_PREDEFINED, dto, StageDTO.class)
    }

    /**
     * 行为：删除发布阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DEL)
    def del(StageDTO dto) throws Throwable {
        this.execute(ACTION_DEL, dto, StageDTO.class)
    }

    /**
     * 行为：移动排序 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(StageDTO dto) throws Throwable {
        return this.executeForList(ACTION_MOVE_ORDER, dto, StageDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<StageDTO> fetchDefault(StageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, StageDTO.class)
    }

    /**
     * 数据集：全局阶段和所属阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_OWNER_SYS)
    Page<StageDTO> fetchCurOwnerSys(StageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_OWNER_SYS, context, StageDTO.class)
    }

    /**
     * 数据集：当前项目下的发布阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PROJECT)
    Page<StageDTO> fetchCurProject(StageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PROJECT, context, StageDTO.class)
    }

    /**
     * 数据集：发布所属阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_STAGE)
    Page<StageDTO> fetchCurStage(StageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_STAGE, context, StageDTO.class)
    }

    /**
     * 数据集：发布所属阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OWNER)
    Page<StageDTO> fetchOwner(StageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OWNER, context, StageDTO.class)
    }

    /**
     * 数据集：全局级发布阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SYSTEM)
    Page<StageDTO> fetchSystem(StageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SYSTEM, context, StageDTO.class)
    }

}