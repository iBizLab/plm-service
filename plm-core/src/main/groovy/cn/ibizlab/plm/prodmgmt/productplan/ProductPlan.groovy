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

    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_DELETE_CATEGORIES = "delete_categories"
    public static final String ACTION_PRODUCT_PLAN_RELATION_IDEA = "product_plan_relation_idea"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_NORMAL = "normal"
    private static ProductPlan _instance
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
    ProductPlanDTO create(ProductPlanDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ProductPlanDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ProductPlanDTO update(ProductPlanDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ProductPlanDTO.class)
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
    ProductPlanDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ProductPlanDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ProductPlanDTO getDraft(ProductPlanDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ProductPlanDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ProductPlanDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ProductPlanDTO save(ProductPlanDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ProductPlanDTO.class)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(ProductPlanDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto, ProductPlanDTO.class)
    }

    /**
     * 行为：删除类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_CATEGORIES)
    def deleteCategories(ProductPlanDTO dto) throws Throwable {
        return this.execute(ACTION_DELETE_CATEGORIES, dto, ProductPlanDTO.class)
    }

    /**
     * 行为：排期关联需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PRODUCT_PLAN_RELATION_IDEA)
    def productPlanRelationIdea(ProductPlanDTO dto) throws Throwable {
        this.execute(ACTION_PRODUCT_PLAN_RELATION_IDEA, dto, ProductPlanDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ProductPlanDTO> fetchDefault(ProductPlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ProductPlanDTO.class)
    }

    /**
     * 数据集：正常状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    Page<ProductPlanDTO> fetchNormal(ProductPlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context, ProductPlanDTO.class)
    }

}