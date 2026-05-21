package cn.ibizlab.plm.base.template

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.template.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[TEMPLATE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Template extends GroovyDynaDataEntityRuntime<Template,TemplateDTO,TemplateFilterDTO> {

    public static final String ACTION_SAVE_TEMPLATE = "save_template"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Template _instance
    void setInstance(Template instance) {
        _instance = instance
    }
    static Template getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    TemplateDTO create(TemplateDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, TemplateDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    TemplateDTO update(TemplateDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, TemplateDTO.class)
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
    TemplateDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, TemplateDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    TemplateDTO getDraft(TemplateDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, TemplateDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(TemplateDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    TemplateDTO save(TemplateDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, TemplateDTO.class)
    }

    /**
     * 行为：保存模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE_TEMPLATE)
    def saveTemplate(TemplateDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE_TEMPLATE, dto, TemplateDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<TemplateDTO> fetchDefault(TemplateFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, TemplateDTO.class)
    }

}