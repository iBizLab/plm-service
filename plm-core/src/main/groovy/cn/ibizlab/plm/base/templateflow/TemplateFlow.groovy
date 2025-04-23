package cn.ibizlab.plm.base.templateflow

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.templateflow.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[TEMPLATE_FLOW]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class TemplateFlow extends GroovyDataEntityRuntime<TemplateFlow,TemplateFlowDTO,TemplateFlowFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static TemplateFlow _instance
    void setInstance(TemplateFlow instance) {
        _instance = instance
    }
    static TemplateFlow getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    TemplateFlowDTO create(TemplateFlowDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, TemplateFlowDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    TemplateFlowDTO update(TemplateFlowDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, TemplateFlowDTO.class)
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
    TemplateFlowDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, TemplateFlowDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    TemplateFlowDTO getDraft(TemplateFlowDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, TemplateFlowDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(TemplateFlowDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    TemplateFlowDTO save(TemplateFlowDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, TemplateFlowDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<TemplateFlowDTO> fetchDefault(TemplateFlowFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, TemplateFlowDTO.class)
    }

}