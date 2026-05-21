package cn.ibizlab.plm.ebsx.systodo

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ebsx.systodo.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SYS_TODO]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SysTodo extends GroovyDynaDataEntityRuntime<SysTodo,SysTodoDTO,SysTodoFilterDTO> {

    public static final String ACTION_DELUNDO = "DelUndo"
    public static final String ACTION_GETLINKURL = "GetLinkUrl"
    public static final String DATASET_CURUSER = "CurUser"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static SysTodo _instance
    void setInstance(SysTodo instance) {
        _instance = instance
    }
    static SysTodo getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    SysTodoDTO create(SysTodoDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SysTodoDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SysTodoDTO update(SysTodoDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SysTodoDTO.class)
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
    SysTodoDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SysTodoDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SysTodoDTO getDraft(SysTodoDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SysTodoDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SysTodoDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SysTodoDTO save(SysTodoDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SysTodoDTO.class)
    }

    /**
     * 行为：GetLinkUrl 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GETLINKURL)
    def getLinkUrl(String key) throws Throwable {
        return this.execute(ACTION_GETLINKURL, key, SysTodoDTO.class)
    }

    /**
     * 数据集：当前用户数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CURUSER)
    Page<SysTodoDTO> fetchCurUser(SysTodoFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CURUSER, context, SysTodoDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SysTodoDTO> fetchDefault(SysTodoFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SysTodoDTO.class)
    }

}