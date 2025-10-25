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
class ProductMember extends GroovyDynaDataEntityRuntime<ProductMember,ProductMemberDTO,ProductMemberFilterDTO> {

    public static final String ACTION_CHANGE_POSITION = "change_position"
    public static final String ACTION_CHANGE_ROLE = "change_role"
    public static final String ACTION_CREATE_PRODUCT_MEMBER = "create_product_member"
    public static final String ACTION_MOB_CREATE_PRODUCT_MEMBER = "mob_create_product_member"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_PRODUCT = "cur_product"
    public static final String DATASET_WITH_PRODUCT = "with_product"
    private static ProductMember _instance
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
    ProductMemberDTO create(ProductMemberDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ProductMemberDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ProductMemberDTO update(ProductMemberDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ProductMemberDTO.class)
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
    ProductMemberDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ProductMemberDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ProductMemberDTO getDraft(ProductMemberDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ProductMemberDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ProductMemberDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ProductMemberDTO save(ProductMemberDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ProductMemberDTO.class)
    }

    /**
     * 行为：变更职位 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_POSITION)
    def changePosition(ProductMemberDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_POSITION, dto, ProductMemberDTO.class)
    }

    /**
     * 行为：变更角色 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_ROLE)
    def changeRole(ProductMemberDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_ROLE, dto, ProductMemberDTO.class)
    }

    /**
     * 行为：新建产品成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_PRODUCT_MEMBER)
    def createProductMember(ProductMemberDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_PRODUCT_MEMBER, dto, ProductMemberDTO.class)
    }

    /**
     * 行为：新建产品成员（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOB_CREATE_PRODUCT_MEMBER)
    def mobCreateProductMember(ProductMemberDTO dto) throws Throwable {
        return this.execute(ACTION_MOB_CREATE_PRODUCT_MEMBER, dto, ProductMemberDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ProductMemberDTO> fetchDefault(ProductMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ProductMemberDTO.class)
    }

    /**
     * 数据集：当前产品成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PRODUCT)
    Page<ProductMemberDTO> fetchCurProduct(ProductMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PRODUCT, context, ProductMemberDTO.class)
    }

    /**
     * 数据集：产品下成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WITH_PRODUCT)
    Page<ProductMemberDTO> fetchWithProduct(ProductMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WITH_PRODUCT, context, ProductMemberDTO.class)
    }

}