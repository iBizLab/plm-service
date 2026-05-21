package cn.ibizlab.plm.extension.about

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.extension.about.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ABOUT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ABOUT extends GroovyDynaDataEntityRuntime<ABOUT,ABOUTDTO,ABOUTFilterDTO> {

    public static final String ACTION_CHECKVERSION = "CheckVersion"
    public static final String ACTION_GETABOUTINFO = "GetAboutInfo"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ABOUT _instance
    void setInstance(ABOUT instance) {
        _instance = instance
    }
    static ABOUT getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ABOUTDTO create(ABOUTDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ABOUTDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ABOUTDTO update(ABOUTDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ABOUTDTO.class)
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
    ABOUTDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ABOUTDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ABOUTDTO getDraft(ABOUTDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ABOUTDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ABOUTDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ABOUTDTO save(ABOUTDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ABOUTDTO.class)
    }

    /**
     * 行为：检查新版本 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKVERSION)
    def checkVersion(ABOUTDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKVERSION, dto, ABOUTDTO.class)
    }

    /**
     * 行为：获取关于信息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETABOUTINFO)
    def getAboutInfo(ABOUTDTO dto) throws Throwable {
        return this.execute(ACTION_GETABOUTINFO, dto, ABOUTDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ABOUTDTO> fetchDefault(ABOUTFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ABOUTDTO.class)
    }

}