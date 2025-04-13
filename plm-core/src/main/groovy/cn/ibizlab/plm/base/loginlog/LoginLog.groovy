package cn.ibizlab.plm.base.loginlog

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.loginlog.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[LOGIN_LOG]运行时对象
 * 此代码用户功能扩展代码
 *
 * 该实体存在实体映射，开启RTCode模式会导致映射功能失效
 */
class LoginLog extends GroovyDataEntityRuntime<LoginLog,LoginLogDTO,LoginLogFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String ACTION_ACTIVE_MEMBER = "active_member"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CALC_CHART_DATAS = "CALC_CHART_DATAS"
    public static final String DATASET_CUR_USER = "CUR_USER"
    public static final String DATASET_DISTINCT_USERID = "DISTINCT_USERID"
    public static final String DATASET_ECHARTS_DATAS = "ECHARTS_DATAS"
    private static LoginLog _instance;
    void setInstance(LoginLog instance) {
        _instance = instance
    }
    static LoginLog getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CREATE)
    def create(LoginLogDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    def update(LoginLogDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE, dto)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    //@DEAction(ACTION_REMOVE)
    def remove(List<String> keys) throws Throwable {
        this.execute(ACTION_REMOVE, keys)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    //@DEAction(ACTION_GET)
    def get(String key) throws Throwable {
        return this.execute(ACTION_GET, key)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    def getDraft(LoginLogDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    def checkKey(LoginLogDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    def save(LoginLogDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 行为：获取活跃成员数据 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_ACTIVE_MEMBER)
    def activeMember(LoginLogDTO dto) throws Throwable {
        return this.execute(ACTION_ACTIVE_MEMBER, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    def fetchDefault(LoginLogFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：计算活跃成员图表数据 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_CALC_CHART_DATAS)
    def fetchCalcChartDatas(LoginLogFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CALC_CHART_DATAS, context)
    }

    /**
     * 数据集：当前用户 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_CUR_USER)
    def fetchCurUser(LoginLogFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER, context)
    }

    /**
     * 数据集：排重用户 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DISTINCT_USERID)
    def fetchDistinctUserid(LoginLogFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DISTINCT_USERID, context)
    }

    /**
     * 数据集：获取活跃人员图表数据 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_ECHARTS_DATAS)
    def fetchEchartsDatas(LoginLogFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ECHARTS_DATAS, context)
    }

}