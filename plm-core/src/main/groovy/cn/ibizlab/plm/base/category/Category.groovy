package cn.ibizlab.plm.base.category

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.category.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CATEGORY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Category extends GroovyDataEntityRuntime<Category,CategoryDTO,CategoryFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_DELETE_CHILD_CATEGORY = "delete_child_category"
    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CHECK_NAME = "check_name"
    public static final String DATASET_COMMON_CATEGORIES = "common_categories"
    public static final String DATASET_CUR_PRODUCT_IDEA_CATEGORY = "cur_product_idea_category"
    public static final String DATASET_MY_CATEGORY = "my_category"
    public static final String DATASET_NO_PARENT = "no_parent"
    public static final String DATASET_NO_SECTION = "no_section"
    public static final String DATASET_POSITION_CATEGORY = "position_category"
    public static final String DATASET_PRODUCT_IDEA_CATEGORY = "product_idea_category"
    public static final String DATASET_PRODUCT_PLAN = "product_plan"
    public static final String DATASET_SPACE_CATEGORY = "space_category"
    public static final String DATASET_SPACE_CATEGORY_TOP = "space_category_top"
    private static Category _instance;
    void setInstance(Category instance) {
        _instance = instance
    }
    static Category getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(CategoryDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(CategoryDTO dto) throws Throwable {
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
    def getDraft(CategoryDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(CategoryDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(CategoryDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：删除子类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_CHILD_CATEGORY)
    def deleteChildCategory(CategoryDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_CHILD_CATEGORY, dto)
    }

    /**
     * 行为：移动需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(CategoryDTO dto) throws Throwable {
        return this.execute(ACTION_MOVE_ORDER, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(CategoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：检查名称是否重复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHECK_NAME)
    def fetchCheckName(CategoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHECK_NAME, context)
    }

    /**
     * 数据集：当前项目类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMON_CATEGORIES)
    def fetchCommonCategories(CategoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMON_CATEGORIES, context)
    }

    /**
     * 数据集：当前产品需求类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PRODUCT_IDEA_CATEGORY)
    def fetchCurProductIdeaCategory(CategoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PRODUCT_IDEA_CATEGORY, context)
    }

    /**
     * 数据集：我的类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_CATEGORY)
    def fetchMyCategory(CategoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_CATEGORY, context)
    }

    /**
     * 数据集：无父类 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_PARENT)
    def fetchNoParent(CategoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_PARENT, context)
    }

    /**
     * 数据集：无分组的类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_SECTION)
    def fetchNoSection(CategoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_SECTION, context)
    }

    /**
     * 数据集：职位类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_POSITION_CATEGORY)
    def fetchPositionCategory(CategoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_POSITION_CATEGORY, context)
    }

    /**
     * 数据集：主模块 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PRODUCT_IDEA_CATEGORY)
    def fetchProductIdeaCategory(CategoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PRODUCT_IDEA_CATEGORY, context)
    }

    /**
     * 数据集：排期计划类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PRODUCT_PLAN)
    def fetchProductPlan(CategoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PRODUCT_PLAN, context)
    }

    /**
     * 数据集：空间目录 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPACE_CATEGORY)
    def fetchSpaceCategory(CategoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPACE_CATEGORY, context)
    }

    /**
     * 数据集：空间目录（顶级） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPACE_CATEGORY_TOP)
    def fetchSpaceCategoryTop(CategoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPACE_CATEGORY_TOP, context)
    }

}