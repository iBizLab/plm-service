package cn.ibizlab.plm.base.searchattachment

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.searchattachment.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SEARCH_ATTACHMENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SearchAttachment extends GroovyDynaDataEntityRuntime<SearchAttachment,SearchAttachmentDTO,SearchAttachmentFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ADVANCED_SEARCH = "advanced_search"
    public static final String DATASET_CUR_PRODUCT = "cur_product"
    public static final String DATASET_CUR_PROJECT = "cur_project"
    public static final String DATASET_PRODUCT_FILE = "product_file"
    public static final String DATASET_PROJECT_FILE = "project_file"
    public static final String DATASET_RELATION = "relation"
    private static SearchAttachment _instance
    void setInstance(SearchAttachment instance) {
        _instance = instance
    }
    static SearchAttachment getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    SearchAttachmentDTO create(SearchAttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SearchAttachmentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SearchAttachmentDTO update(SearchAttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SearchAttachmentDTO.class)
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
    SearchAttachmentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SearchAttachmentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SearchAttachmentDTO getDraft(SearchAttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SearchAttachmentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SearchAttachmentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SearchAttachmentDTO save(SearchAttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SearchAttachmentDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SearchAttachmentDTO> fetchDefault(SearchAttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SearchAttachmentDTO.class)
    }

    /**
     * 数据集：高级搜索 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADVANCED_SEARCH)
    Page<SearchAttachmentDTO> fetchAdvancedSearch(SearchAttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADVANCED_SEARCH, context, SearchAttachmentDTO.class)
    }

    /**
     * 数据集：当前产品下的附件 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PRODUCT)
    Page<SearchAttachmentDTO> fetchCurProduct(SearchAttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PRODUCT, context, SearchAttachmentDTO.class)
    }

    /**
     * 数据集：当前项目下的附件 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PROJECT)
    Page<SearchAttachmentDTO> fetchCurProject(SearchAttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PROJECT, context, SearchAttachmentDTO.class)
    }

    /**
     * 数据集：产品附件 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PRODUCT_FILE)
    Page<SearchAttachmentDTO> fetchProductFile(SearchAttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PRODUCT_FILE, context, SearchAttachmentDTO.class)
    }

    /**
     * 数据集：项目附件 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROJECT_FILE)
    Page<SearchAttachmentDTO> fetchProjectFile(SearchAttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROJECT_FILE, context, SearchAttachmentDTO.class)
    }

    /**
     * 数据集：关联查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELATION)
    Page<SearchAttachmentDTO> fetchRelation(SearchAttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELATION, context, SearchAttachmentDTO.class)
    }

}