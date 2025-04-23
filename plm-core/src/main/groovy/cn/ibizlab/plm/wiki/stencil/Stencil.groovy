package cn.ibizlab.plm.wiki.stencil

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.wiki.stencil.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[STENCIL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Stencil extends GroovyDataEntityRuntime<Stencil,StencilDTO,StencilFilterDTO> {

    public static final String ACTION_NEW_DRAFT_FORM_STENCIL = "new_draft_form_stencil"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_NO_SPACE_STENCIL = "no_space_stencil"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_SPACE_STENCIL = "space_stencil"
    private static Stencil _instance
    void setInstance(Stencil instance) {
        _instance = instance
    }
    static Stencil getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    StencilDTO create(StencilDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, StencilDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    StencilDTO update(StencilDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, StencilDTO.class)
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
    StencilDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, StencilDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    StencilDTO getDraft(StencilDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, StencilDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(StencilDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    StencilDTO save(StencilDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, StencilDTO.class)
    }

    /**
     * 行为：根据模板新建草稿 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_NEW_DRAFT_FORM_STENCIL)
    def newDraftFormStencil(StencilDTO dto) throws Throwable {
        this.execute(ACTION_NEW_DRAFT_FORM_STENCIL, dto, StencilDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<StencilDTO> fetchDefault(StencilFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, StencilDTO.class)
    }

    /**
     * 数据集：非空间下模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_SPACE_STENCIL)
    Page<StencilDTO> fetchNoSpaceStencil(StencilFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_SPACE_STENCIL, context, StencilDTO.class)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<StencilDTO> fetchReader(StencilFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, StencilDTO.class)
    }

    /**
     * 数据集：空间下页面模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPACE_STENCIL)
    Page<StencilDTO> fetchSpaceStencil(StencilFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPACE_STENCIL, context, StencilDTO.class)
    }

}