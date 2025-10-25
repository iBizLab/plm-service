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
class AuthLogAdmin extends GroovyDynaDataEntityRuntime<AuthLogAdmin,AuthLogAdminDTO,AuthLogAdminFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_USER = "cur_user"
    public static final String DATASET_DISTINCT_USERID = "distinct_userid"
    public static final String DATASET_GROUP_BY_DATA = "group_by_data"
    private static AuthLogAdmin _instance
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
    AuthLogAdminDTO create(AuthLogAdminDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AuthLogAdminDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AuthLogAdminDTO update(AuthLogAdminDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AuthLogAdminDTO.class)
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
    AuthLogAdminDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AuthLogAdminDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AuthLogAdminDTO getDraft(AuthLogAdminDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AuthLogAdminDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AuthLogAdminDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AuthLogAdminDTO save(AuthLogAdminDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AuthLogAdminDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AuthLogAdminDTO> fetchDefault(AuthLogAdminFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AuthLogAdminDTO.class)
    }

    /**
     * 数据集：当前用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_USER)
    Page<AuthLogAdminDTO> fetchCurUser(AuthLogAdminFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER, context, AuthLogAdminDTO.class)
    }

    /**
     * 数据集：排重用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DISTINCT_USERID)
    Page<AuthLogAdminDTO> fetchDistinctUserid(AuthLogAdminFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DISTINCT_USERID, context, AuthLogAdminDTO.class)
    }

    /**
     * 数据集：日期分组集合 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_GROUP_BY_DATA)
    Page<AuthLogAdminDTO> fetchGroupByData(AuthLogAdminFilterDTO context) throws Throwable {
        return this.fetch(DATASET_GROUP_BY_DATA, context, AuthLogAdminDTO.class)
    }

}