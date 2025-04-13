package cn.ibizlab.plm.ebsx.authlogadmin

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ebsx.authlogadmin.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AUTH_LOG_ADMIN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AuthLogAdmin extends GroovyDataEntityRuntime<AuthLogAdmin,AuthLogAdminDTO,AuthLogAdminFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_USER = "cur_user"
    public static final String DATASET_DISTINCT_USERID = "distinct_userid"
    public static final String DATASET_GROUP_BY_DATA = "group_by_data"
    private static AuthLogAdmin _instance;
    void setInstance(AuthLogAdmin instance) {
        _instance = instance
    }
    static AuthLogAdmin getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(AuthLogAdminDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(AuthLogAdminDTO dto) throws Throwable {
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
    def getDraft(AuthLogAdminDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(AuthLogAdminDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(AuthLogAdminDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(AuthLogAdminFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：当前用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_USER)
    def fetchCurUser(AuthLogAdminFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER, context)
    }

    /**
     * 数据集：排重用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DISTINCT_USERID)
    def fetchDistinctUserid(AuthLogAdminFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DISTINCT_USERID, context)
    }

    /**
     * 数据集：日期分组集合 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_GROUP_BY_DATA)
    def fetchGroupByData(AuthLogAdminFilterDTO context) throws Throwable {
        return this.fetch(DATASET_GROUP_BY_DATA, context)
    }

}