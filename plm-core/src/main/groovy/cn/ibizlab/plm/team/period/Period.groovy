package cn.ibizlab.plm.team.period

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.team.period.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PERIOD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Period extends GroovyDataEntityRuntime<Period,PeriodDTO,PeriodFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Period _instance
    void setInstance(Period instance) {
        _instance = instance
    }
    static Period getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PeriodDTO create(PeriodDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PeriodDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PeriodDTO update(PeriodDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PeriodDTO.class)
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
    PeriodDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PeriodDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PeriodDTO getDraft(PeriodDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PeriodDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PeriodDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PeriodDTO save(PeriodDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PeriodDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PeriodDTO> fetchDefault(PeriodFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PeriodDTO.class)
    }

}