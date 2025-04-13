package cn.ibizlab.plm.prodmgmt.productplan

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.prodmgmt.productplan.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PRODUCT_PLAN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ProductPlan extends GroovyDataEntityRuntime<ProductPlan,ProductPlanDTO,ProductPlanFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_DELETE_CATEGORIES = "delete_categories"
    public static final String ACTION_PRODUCT_PLAN_RELATION_IDEA = "product_plan_relation_idea"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_NORMAL = "normal"
    private static ProductPlan _instance;
    void setInstance(ProductPlan instance) {
        _instance = instance
    }
    static ProductPlan getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(ProductPlanDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(ProductPlanDTO dto) throws Throwable {
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
    def getDraft(ProductPlanDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(ProductPlanDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(ProductPlanDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(ProductPlanDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto)
    }

    /**
     * 行为：删除类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_CATEGORIES)
    def deleteCategories(ProductPlanDTO dto) throws Throwable {
        return this.execute(ACTION_DELETE_CATEGORIES, dto)
    }

    /**
     * 行为：排期关联需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PRODUCT_PLAN_RELATION_IDEA)
    def productPlanRelationIdea(ProductPlanDTO dto) throws Throwable {
        this.execute(ACTION_PRODUCT_PLAN_RELATION_IDEA, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(ProductPlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：正常状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    def fetchNormal(ProductPlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context)
    }

}