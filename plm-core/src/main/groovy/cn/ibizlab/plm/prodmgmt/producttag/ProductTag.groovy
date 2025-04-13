package cn.ibizlab.plm.prodmgmt.producttag

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.prodmgmt.producttag.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PRODUCT_TAG]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ProductTag extends GroovyDataEntityRuntime<ProductTag,ProductTagDTO,ProductTagFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_DELETE_TAG = "delete_tag"
    public static final String ACTION_GET_CON_PRODUCT_TAG = "get_con_product_tag"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_PRODUCT_TAG = "cur_product_tag"
    private static ProductTag _instance;
    void setInstance(ProductTag instance) {
        _instance = instance
    }
    static ProductTag getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(ProductTagDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(ProductTagDTO dto) throws Throwable {
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
    def getDraft(ProductTagDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(ProductTagDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(ProductTagDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：删除标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_TAG)
    def deleteTag(ProductTagDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_TAG, dto)
    }

    /**
     * 行为：获取关联的工单和需求数量 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_CON_PRODUCT_TAG)
    def getConProductTag(String key) throws Throwable {
        return this.execute(ACTION_GET_CON_PRODUCT_TAG, key)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(ProductTagFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：当前项目标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PRODUCT_TAG)
    def fetchCurProductTag(ProductTagFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PRODUCT_TAG, context)
    }

}