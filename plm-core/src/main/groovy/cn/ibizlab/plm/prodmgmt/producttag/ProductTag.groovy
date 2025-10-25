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
class ProductTag extends GroovyDynaDataEntityRuntime<ProductTag,ProductTagDTO,ProductTagFilterDTO> {

    public static final String ACTION_DELETE_TAG = "delete_tag"
    public static final String ACTION_GET_CON_PRODUCT_TAG = "get_con_product_tag"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_PRODUCT_TAG = "cur_product_tag"
    private static ProductTag _instance
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
    ProductTagDTO create(ProductTagDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ProductTagDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ProductTagDTO update(ProductTagDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ProductTagDTO.class)
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
    ProductTagDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ProductTagDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ProductTagDTO getDraft(ProductTagDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ProductTagDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ProductTagDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ProductTagDTO save(ProductTagDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ProductTagDTO.class)
    }

    /**
     * 行为：删除标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_TAG)
    def deleteTag(ProductTagDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_TAG, dto, ProductTagDTO.class)
    }

    /**
     * 行为：获取关联的工单和需求数量 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_CON_PRODUCT_TAG)
    def getConProductTag(String key) throws Throwable {
        return this.execute(ACTION_GET_CON_PRODUCT_TAG, key, ProductTagDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ProductTagDTO> fetchDefault(ProductTagFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ProductTagDTO.class)
    }

    /**
     * 数据集：当前项目标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PRODUCT_TAG)
    Page<ProductTagDTO> fetchCurProductTag(ProductTagFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PRODUCT_TAG, context, ProductTagDTO.class)
    }

}