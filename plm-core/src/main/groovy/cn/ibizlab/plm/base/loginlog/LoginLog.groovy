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

    public static final String ACTION_ACTIVE_MEMBER = "active_member"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CALC_CHART_DATAS = "CALC_CHART_DATAS"
    public static final String DATASET_CUR_USER = "CUR_USER"
    public static final String DATASET_DISTINCT_USERID = "DISTINCT_USERID"
    public static final String DATASET_ECHARTS_DATAS = "ECHARTS_DATAS"
    private static LoginLog _instance
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
    LoginLogDTO create(LoginLogDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, LoginLogDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    LoginLogDTO update(LoginLogDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, LoginLogDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    //@DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    //@DEAction(ACTION_GET)
    LoginLogDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, LoginLogDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    LoginLogDTO getDraft(LoginLogDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, LoginLogDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    int checkKey(LoginLogDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    LoginLogDTO save(LoginLogDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, LoginLogDTO.class)
    }

    /**
     * 行为：获取活跃成员数据 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_ACTIVE_MEMBER)
    def activeMember(LoginLogDTO dto) throws Throwable {
        return this.execute(ACTION_ACTIVE_MEMBER, dto, LoginLogDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    Page<LoginLogDTO> fetchDefault(LoginLogFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, LoginLogDTO.class)
    }

    /**
     * 数据集：计算活跃成员图表数据 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_CALC_CHART_DATAS)
    Page<LoginLogDTO> fetchCalcChartDatas(LoginLogFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CALC_CHART_DATAS, context, LoginLogDTO.class)
    }

    /**
     * 数据集：当前用户 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_CUR_USER)
    Page<LoginLogDTO> fetchCurUser(LoginLogFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER, context, LoginLogDTO.class)
    }

    /**
     * 数据集：排重用户 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DISTINCT_USERID)
    Page<LoginLogDTO> fetchDistinctUserid(LoginLogFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DISTINCT_USERID, context, LoginLogDTO.class)
    }

    /**
     * 数据集：获取活跃人员图表数据 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_ECHARTS_DATAS)
    Page<LoginLogDTO> fetchEchartsDatas(LoginLogFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ECHARTS_DATAS, context, LoginLogDTO.class)
    }

}