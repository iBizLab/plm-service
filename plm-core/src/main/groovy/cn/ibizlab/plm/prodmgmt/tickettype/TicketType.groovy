package cn.ibizlab.plm.prodmgmt.tickettype

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.prodmgmt.tickettype.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[TICKET_TYPE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class TicketType extends GroovyDataEntityRuntime<TicketType,TicketTypeDTO,TicketTypeFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_GET_CON_TICKET = "get_con_ticket"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_NOT_EXISTS_TICKET_TYPE = "not_exists_ticket_type"
    private static TicketType _instance;
    void setInstance(TicketType instance) {
        _instance = instance
    }
    static TicketType getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(TicketTypeDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(TicketTypeDTO dto) throws Throwable {
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
    def getDraft(TicketTypeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(TicketTypeDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(TicketTypeDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：获取关联的工单 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_CON_TICKET)
    def getConTicket(String key) throws Throwable {
        return this.execute(ACTION_GET_CON_TICKET, key)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(TicketTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：不存在的产品工单类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_EXISTS_TICKET_TYPE)
    def fetchNotExistsTicketType(TicketTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_EXISTS_TICKET_TYPE, context)
    }

}