package cn.ibizlab.plm.prodmgmt.ideatemplate

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.prodmgmt.ideatemplate.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IDEA_TEMPLATE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IdeaTemplate extends GroovyDataEntityRuntime<IdeaTemplate,IdeaTemplateDTO,IdeaTemplateFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_GLOBAL = "global"
    private static IdeaTemplate _instance
    void setInstance(IdeaTemplate instance) {
        _instance = instance
    }
    static IdeaTemplate getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IdeaTemplateDTO create(IdeaTemplateDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IdeaTemplateDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IdeaTemplateDTO update(IdeaTemplateDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IdeaTemplateDTO.class)
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
    IdeaTemplateDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IdeaTemplateDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IdeaTemplateDTO getDraft(IdeaTemplateDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IdeaTemplateDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IdeaTemplateDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IdeaTemplateDTO save(IdeaTemplateDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IdeaTemplateDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<IdeaTemplateDTO> fetchDefault(IdeaTemplateFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, IdeaTemplateDTO.class)
    }

    /**
     * 数据集：全局需求模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_GLOBAL)
    Page<IdeaTemplateDTO> fetchGlobal(IdeaTemplateFilterDTO context) throws Throwable {
        return this.fetch(DATASET_GLOBAL, context, IdeaTemplateDTO.class)
    }

}