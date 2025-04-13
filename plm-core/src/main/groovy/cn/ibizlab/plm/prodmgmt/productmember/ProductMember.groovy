package cn.ibizlab.plm.prodmgmt.productmember

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.prodmgmt.productmember.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PRODUCT_MEMBER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ProductMember extends GroovyDataEntityRuntime<ProductMember,ProductMemberDTO,ProductMemberFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_CHANGE_POSITION = "change_position"
    public static final String ACTION_CHANGE_ROLE = "change_role"
    public static final String ACTION_CREATE_PRODUCT_MEMBER = "create_product_member"
    public static final String ACTION_MOB_CREATE_PRODUCT_MEMBER = "mob_create_product_member"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_PRODUCT = "cur_product"
    public static final String DATASET_WITH_PRODUCT = "with_product"
    private static ProductMember _instance;
    void setInstance(ProductMember instance) {
        _instance = instance
    }
    static ProductMember getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(ProductMemberDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(ProductMemberDTO dto) throws Throwable {
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
    def getDraft(ProductMemberDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(ProductMemberDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(ProductMemberDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：变更职位 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_POSITION)
    def changePosition(ProductMemberDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_POSITION, dto)
    }

    /**
     * 行为：变更角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ROLE)
    def changeRole(ProductMemberDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ROLE, dto)
    }

    /**
     * 行为：新建产品成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_PRODUCT_MEMBER)
    def createProductMember(ProductMemberDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_PRODUCT_MEMBER, dto)
    }

    /**
     * 行为：新建产品成员（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOB_CREATE_PRODUCT_MEMBER)
    def mobCreateProductMember(ProductMemberDTO dto) throws Throwable {
        return this.execute(ACTION_MOB_CREATE_PRODUCT_MEMBER, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(ProductMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：当前产品成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PRODUCT)
    def fetchCurProduct(ProductMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PRODUCT, context)
    }

    /**
     * 数据集：产品下成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WITH_PRODUCT)
    def fetchWithProduct(ProductMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WITH_PRODUCT, context)
    }

}