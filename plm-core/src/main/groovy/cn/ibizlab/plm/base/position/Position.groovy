package cn.ibizlab.plm.base.position

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.position.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[POSITION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Position extends GroovyDynaDataEntityRuntime<Position,PositionDTO,PositionFilterDTO> {

    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_NO_CATEGORY = "no_category"
    private static Position _instance
    void setInstance(Position instance) {
        _instance = instance
    }
    static Position getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PositionDTO create(PositionDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PositionDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PositionDTO update(PositionDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PositionDTO.class)
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
    PositionDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PositionDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PositionDTO getDraft(PositionDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PositionDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PositionDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PositionDTO save(PositionDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PositionDTO.class)
    }

    /**
     * 行为：移动职位 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(PositionDTO dto) throws Throwable {
        return this.executeForList(ACTION_MOVE_ORDER, dto, PositionDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PositionDTO> fetchDefault(PositionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PositionDTO.class)
    }

    /**
     * 数据集：无分组 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_CATEGORY)
    Page<PositionDTO> fetchNoCategory(PositionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_CATEGORY, context, PositionDTO.class)
    }

}