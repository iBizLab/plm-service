package cn.ibizlab.plm.base.insight

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.insight.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[INSIGHT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Insight extends GroovyDataEntityRuntime<Insight,InsightDTO,InsightFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Insight _instance
    void setInstance(Insight instance) {
        _instance = instance
    }
    static Insight getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    InsightDTO create(InsightDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, InsightDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    InsightDTO update(InsightDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, InsightDTO.class)
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
    InsightDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, InsightDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    InsightDTO getDraft(InsightDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, InsightDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(InsightDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    InsightDTO save(InsightDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, InsightDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<InsightDTO> fetchDefault(InsightFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, InsightDTO.class)
    }

}