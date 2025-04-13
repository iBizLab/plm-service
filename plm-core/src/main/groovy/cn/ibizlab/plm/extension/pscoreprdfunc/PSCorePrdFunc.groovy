package cn.ibizlab.plm.extension.pscoreprdfunc

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.extension.pscoreprdfunc.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSCOREPRDFUNC]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSCorePrdFunc extends GroovyPSModelDERuntime<PSCorePrdFunc,PSCorePrdFuncDTO,PSCorePrdFuncFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_INSTALL = "INSTALL"
    public static final String ACTION_UNINSTALL = "UNINSTALL"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSCorePrdFunc _instance;
    void setInstance(PSCorePrdFunc instance) {
        _instance = instance
    }
    static PSCorePrdFunc getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(PSCorePrdFuncDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(PSCorePrdFuncDTO dto) throws Throwable {
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
    def getDraft(PSCorePrdFuncDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(PSCorePrdFuncDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(PSCorePrdFuncDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：安装 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_INSTALL)
    def install(PSCorePrdFuncDTO dto) throws Throwable {
        this.execute(ACTION_INSTALL, dto)
    }

    /**
     * 行为：卸载 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UNINSTALL)
    def uninstall(PSCorePrdFuncDTO dto) throws Throwable {
        this.execute(ACTION_UNINSTALL, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(PSCorePrdFuncFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

}