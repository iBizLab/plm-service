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

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_NEW_DRAFT_FORM_STENCIL = "new_draft_form_stencil"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_NO_SPACE_STENCIL = "no_space_stencil"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_SPACE_STENCIL = "space_stencil"
    private static Stencil _instance;
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
    def create(StencilDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(StencilDTO dto) throws Throwable {
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
    def getDraft(StencilDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(StencilDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(StencilDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：根据模板新建草稿 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_NEW_DRAFT_FORM_STENCIL)
    def newDraftFormStencil(StencilDTO dto) throws Throwable {
        this.execute(ACTION_NEW_DRAFT_FORM_STENCIL, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(StencilFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：非空间下模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_SPACE_STENCIL)
    def fetchNoSpaceStencil(StencilFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_SPACE_STENCIL, context)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    def fetchReader(StencilFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context)
    }

    /**
     * 数据集：空间下页面模板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPACE_STENCIL)
    def fetchSpaceStencil(StencilFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPACE_STENCIL, context)
    }

}