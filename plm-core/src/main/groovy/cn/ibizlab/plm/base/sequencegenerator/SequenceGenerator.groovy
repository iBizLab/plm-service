package cn.ibizlab.plm.base.sequencegenerator

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.sequencegenerator.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SEQUENCE_GENERATOR]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SequenceGenerator extends GroovyDynaDataEntityRuntime<SequenceGenerator,SequenceGeneratorDTO,SequenceGeneratorFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static SequenceGenerator _instance
    void setInstance(SequenceGenerator instance) {
        _instance = instance
    }
    static SequenceGenerator getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    SequenceGeneratorDTO create(SequenceGeneratorDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SequenceGeneratorDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SequenceGeneratorDTO update(SequenceGeneratorDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SequenceGeneratorDTO.class)
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
    SequenceGeneratorDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SequenceGeneratorDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SequenceGeneratorDTO getDraft(SequenceGeneratorDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SequenceGeneratorDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SequenceGeneratorDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SequenceGeneratorDTO save(SequenceGeneratorDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SequenceGeneratorDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SequenceGeneratorDTO> fetchDefault(SequenceGeneratorFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SequenceGeneratorDTO.class)
    }

}