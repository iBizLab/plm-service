package cn.ibizlab.plm.ebsx.authlog

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ebsx.authlog.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SYS_AUTHLOG]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AuthLog extends GroovyDynaDataEntityRuntime<AuthLog,AuthLogDTO,AuthLogFilterDTO> {

    public static final String DATASET_CURUSER = "CurUser"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AuthLog _instance
    void setInstance(AuthLog instance) {
        _instance = instance
    }
    static AuthLog getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AuthLogDTO create(AuthLogDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AuthLogDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AuthLogDTO update(AuthLogDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AuthLogDTO.class)
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
    AuthLogDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AuthLogDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AuthLogDTO getDraft(AuthLogDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AuthLogDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AuthLogDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AuthLogDTO save(AuthLogDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AuthLogDTO.class)
    }

    /**
     * 数据集：当前用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CURUSER)
    Page<AuthLogDTO> fetchCurUser(AuthLogFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CURUSER, context, AuthLogDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AuthLogDTO> fetchDefault(AuthLogFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AuthLogDTO.class)
    }

}