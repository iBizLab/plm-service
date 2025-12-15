package cn.ibizlab.plm.prodmgmt.product

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.prodmgmt.product.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PRODUCT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Product extends GroovyDynaDataEntityRuntime<Product,ProductDTO,ProductFilterDTO> {

    public static final String ACTION_ACTIVATE = "activate"
    public static final String ACTION_ARCHIVE = "archive"
    public static final String ACTION_CHANGE_ADMIN_ROLE = "change_admin_role"
    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_FAVORITE = "favorite"
    public static final String ACTION_OTHER_RE_PRODUCT = "other_re_product"
    public static final String ACTION_OTHER_RE_SPACE = "other_re_space"
    public static final String ACTION_PRODUCT_COUNTERS = "product_counters"
    public static final String ACTION_PRODUCT_INDEX_ADDON_COUNTER = "product_index_addon_counter"
    public static final String ACTION_PRODUCT_MOVE = "product_move"
    public static final String ACTION_PRODUCT_READONLY_RECOGNIZE = "product_readonly_recognize"
    public static final String ACTION_RECOVER = "recover"
    public static final String ACTION_UN_FAVORITE = "un_favorite"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ADMIN = "admin"
    public static final String DATASET_AI_INFO = "ai_info"
    public static final String DATASET_ARCHIVED = "archived"
    public static final String DATASET_CUR_PRODUCT = "cur_product"
    public static final String DATASET_CUSTOMER_USER = "customer_user"
    public static final String DATASET_DELETED = "deleted"
    public static final String DATASET_FAVORITE = "favorite"
    public static final String DATASET_MAIN = "main"
    public static final String DATASET_MOB_MAIN = "mob_main"
    public static final String DATASET_NO_RELATION = "no_relation"
    public static final String DATASET_NORMAL = "normal"
    public static final String DATASET_QUICK = "quick"
    public static final String DATASET_QUICK_USER = "quick_user"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_USER = "user"
    private static Product _instance
    void setInstance(Product instance) {
        _instance = instance
    }
    static Product getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ProductDTO create(ProductDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ProductDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ProductDTO update(ProductDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ProductDTO.class)
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
    ProductDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ProductDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ProductDTO getDraft(ProductDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ProductDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ProductDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ProductDTO save(ProductDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ProductDTO.class)
    }

    /**
     * 行为：激活 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ACTIVATE)
    def activate(ProductDTO dto) throws Throwable {
        this.execute(ACTION_ACTIVATE, dto, ProductDTO.class)
    }

    /**
     * 行为：归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ARCHIVE)
    def archive(ProductDTO dto) throws Throwable {
        this.execute(ACTION_ARCHIVE, dto, ProductDTO.class)
    }

    /**
     * 行为：变更管理员角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ADMIN_ROLE)
    def changeAdminRole(ProductDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ADMIN_ROLE, dto, ProductDTO.class)
    }

    /**
     * 行为：删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(ProductDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto, ProductDTO.class)
    }

    /**
     * 行为：设置星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FAVORITE)
    def favorite(ProductDTO dto) throws Throwable {
        this.execute(ACTION_FAVORITE, dto, ProductDTO.class)
    }

    /**
     * 行为：其他实体关联产品 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_OTHER_RE_PRODUCT)
    def otherReProduct(ProductDTO dto) throws Throwable {
        return this.execute(ACTION_OTHER_RE_PRODUCT, dto, ProductDTO.class)
    }

    /**
     * 行为：其他实体关联空间 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_OTHER_RE_SPACE)
    def otherReSpace(ProductDTO dto) throws Throwable {
        return this.execute(ACTION_OTHER_RE_SPACE, dto, ProductDTO.class)
    }

    /**
     * 行为：产品计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PRODUCT_COUNTERS)
    def productCounters(ProductDTO dto) throws Throwable {
        this.execute(ACTION_PRODUCT_COUNTERS, dto, ProductDTO.class)
    }

    /**
     * 行为：产品首页组件计数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PRODUCT_INDEX_ADDON_COUNTER)
    def productIndexAddonCounter(ProductDTO dto) throws Throwable {
        this.execute(ACTION_PRODUCT_INDEX_ADDON_COUNTER, dto, ProductDTO.class)
    }

    /**
     * 行为：产品移动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PRODUCT_MOVE)
    def productMove(ProductDTO dto) throws Throwable {
        this.execute(ACTION_PRODUCT_MOVE, dto, ProductDTO.class)
    }

    /**
     * 行为：产品只读用户判断 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PRODUCT_READONLY_RECOGNIZE)
    def productReadonlyRecognize(ProductDTO dto) throws Throwable {
        this.execute(ACTION_PRODUCT_READONLY_RECOGNIZE, dto, ProductDTO.class)
    }

    /**
     * 行为：恢复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER)
    def recover(ProductDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER, dto, ProductDTO.class)
    }

    /**
     * 行为：取消星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UN_FAVORITE)
    def unFavorite(ProductDTO dto) throws Throwable {
        this.execute(ACTION_UN_FAVORITE, dto, ProductDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ProductDTO> fetchDefault(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ProductDTO.class)
    }

    /**
     * 数据集：管理员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADMIN)
    Page<ProductDTO> fetchAdmin(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADMIN, context, ProductDTO.class)
    }

    /**
     * 数据集：查询产品信息（AI调用） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_AI_INFO)
    Page<ProductAiInfoDTO> fetchAiInfo(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_AI_INFO, context, ProductAiInfoDTO.class)
    }

    /**
     * 数据集：已归档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ARCHIVED)
    Page<ProductDTO> fetchArchived(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ARCHIVED, context, ProductDTO.class)
    }

    /**
     * 数据集：当前产品 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PRODUCT)
    Page<ProductDTO> fetchCurProduct(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PRODUCT, context, ProductDTO.class)
    }

    /**
     * 数据集：特定用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUSTOMER_USER)
    Page<ProductDTO> fetchCustomerUser(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUSTOMER_USER, context, ProductDTO.class)
    }

    /**
     * 数据集：已删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DELETED)
    Page<ProductDTO> fetchDeleted(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DELETED, context, ProductDTO.class)
    }

    /**
     * 数据集：查询星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FAVORITE)
    Page<ProductDTO> fetchFavorite(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FAVORITE, context, ProductDTO.class)
    }

    /**
     * 数据集：主表格查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MAIN)
    Page<ProductDTO> fetchMain(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MAIN, context, ProductDTO.class)
    }

    /**
     * 数据集：主表格查询（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_MAIN)
    Page<ProductDTO> fetchMobMain(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_MAIN, context, ProductDTO.class)
    }

    /**
     * 数据集：未关联项目 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NO_RELATION)
    Page<ProductDTO> fetchNoRelation(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NO_RELATION, context, ProductDTO.class)
    }

    /**
     * 数据集：正常状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    Page<ProductDTO> fetchNormal(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context, ProductDTO.class)
    }

    /**
     * 数据集：快速新建查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_QUICK)
    Page<ProductDTO> fetchQuick(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_QUICK, context, ProductDTO.class)
    }

    /**
     * 数据集：快速新建查询（管理用户） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_QUICK_USER)
    Page<ProductDTO> fetchQuickUser(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_QUICK_USER, context, ProductDTO.class)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<ProductDTO> fetchReader(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, ProductDTO.class)
    }

    /**
     * 数据集：操作用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    Page<ProductDTO> fetchUser(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context, ProductDTO.class)
    }

}