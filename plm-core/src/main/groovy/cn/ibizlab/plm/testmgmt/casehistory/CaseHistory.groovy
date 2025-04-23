package cn.ibizlab.plm.testmgmt.casehistory

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.casehistory.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CASE_HISTORY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CaseHistory extends GroovyDataEntityRuntime<CaseHistory,CaseHistoryDTO,CaseHistoryFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static CaseHistory _instance
    void setInstance(CaseHistory instance) {
        _instance = instance
    }
    static CaseHistory getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CaseHistoryDTO create(CaseHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CaseHistoryDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CaseHistoryDTO update(CaseHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CaseHistoryDTO.class)
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
    CaseHistoryDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CaseHistoryDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CaseHistoryDTO getDraft(CaseHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CaseHistoryDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CaseHistoryDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CaseHistoryDTO save(CaseHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CaseHistoryDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<CaseHistoryDTO> fetchDefault(CaseHistoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, CaseHistoryDTO.class)
    }

}