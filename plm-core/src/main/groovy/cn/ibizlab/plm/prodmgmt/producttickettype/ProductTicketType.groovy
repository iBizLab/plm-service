package cn.ibizlab.plm.prodmgmt.producttickettype

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.prodmgmt.producttickettype.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PRODUCT_TICKET_TYPE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ProductTicketType extends GroovyDynaDataEntityRuntime<ProductTicketType,ProductTicketTypeDTO,ProductTicketTypeFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ProductTicketType _instance
    void setInstance(ProductTicketType instance) {
        _instance = instance
    }
    static ProductTicketType getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ProductTicketTypeDTO create(ProductTicketTypeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ProductTicketTypeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ProductTicketTypeDTO update(ProductTicketTypeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ProductTicketTypeDTO.class)
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
    ProductTicketTypeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ProductTicketTypeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ProductTicketTypeDTO getDraft(ProductTicketTypeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ProductTicketTypeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ProductTicketTypeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ProductTicketTypeDTO save(ProductTicketTypeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ProductTicketTypeDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ProductTicketTypeDTO> fetchDefault(ProductTicketTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ProductTicketTypeDTO.class)
    }

}