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
class SearchAttachment extends GroovyDataEntityRuntime<SearchAttachment,SearchAttachmentDTO,SearchAttachmentFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ADVANCED_SEARCH = "advanced_search"
    public static final String DATASET_CUR_PRODUCT = "cur_product"
    public static final String DATASET_CUR_PROJECT = "cur_project"
    public static final String DATASET_PRODUCT_FILE = "product_file"
    public static final String DATASET_PROJECT_FILE = "project_file"
    public static final String DATASET_RELATION = "relation"
    private static SearchAttachment _instance;
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
    def create(SearchAttachmentDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(SearchAttachmentDTO dto) throws Throwable {
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
    def getDraft(SearchAttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(SearchAttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(SearchAttachmentDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(SearchAttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：高级搜索 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADVANCED_SEARCH)
    def fetchAdvancedSearch(SearchAttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADVANCED_SEARCH, context)
    }

    /**
     * 数据集：当前产品下的附件 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PRODUCT)
    def fetchCurProduct(SearchAttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PRODUCT, context)
    }

    /**
     * 数据集：当前项目下的附件 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PROJECT)
    def fetchCurProject(SearchAttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PROJECT, context)
    }

    /**
     * 数据集：产品附件 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PRODUCT_FILE)
    def fetchProductFile(SearchAttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PRODUCT_FILE, context)
    }

    /**
     * 数据集：项目附件 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROJECT_FILE)
    def fetchProjectFile(SearchAttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROJECT_FILE, context)
    }

    /**
     * 数据集：关联查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELATION)
    def fetchRelation(SearchAttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELATION, context)
    }

}