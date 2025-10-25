package cn.ibizlab.plm.base.dictionarydata

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.dictionarydata.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DICTIONARY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DictionaryData extends GroovyDynaDataEntityRuntime<DictionaryData,DictionaryDataDTO,DictionaryDataFilterDTO> {

    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_IDEA = "idea"
    public static final String DATASET_IDEA_PRIORITY = "idea_priority"
    public static final String DATASET_IDEA_SOURCE = "idea_source"
    public static final String DATASET_IDEA_STATE = "idea_state"
    public static final String DATASET_IDEA_TYPE = "idea_type"
    public static final String DATASET_RELEASE_STAGE = "release_stage"
    public static final String DATASET_TEST_CASE = "test_case"
    public static final String DATASET_TEST_CASE_IMPORTANCE_LEVEL = "test_case_importance_level"
    public static final String DATASET_TEST_CASE_STATUS = "test_case_status"
    public static final String DATASET_TEST_CASE_TEST_TYPE = "test_case_test_type"
    public static final String DATASET_TEST_CASE_TYPE = "test_case_type"
    public static final String DATASET_TICKET = "ticket"
    public static final String DATASET_TICKET_PRIORITY = "ticket_priority"
    public static final String DATASET_TICKET_SOLUTION = "ticket_solution"
    public static final String DATASET_TICKET_STATE = "ticket_state"
    public static final String DATASET_WORK_ITEM = "work_item"
    public static final String DATASET_WORK_ITEM_CATEGORY = "work_item_category"
    public static final String DATASET_WORK_ITEM_PRIORITY = "work_item_priority"
    public static final String DATASET_WORK_ITEM_PROBABILITY = "work_item_probability"
    public static final String DATASET_WORK_ITEM_RISK = "work_item_risk"
    public static final String DATASET_WORK_ITEM_SEVERITY = "work_item_severity"
    private static DictionaryData _instance
    void setInstance(DictionaryData instance) {
        _instance = instance
    }
    static DictionaryData getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DictionaryDataDTO create(DictionaryDataDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DictionaryDataDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DictionaryDataDTO update(DictionaryDataDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DictionaryDataDTO.class)
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
    DictionaryDataDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DictionaryDataDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DictionaryDataDTO getDraft(DictionaryDataDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DictionaryDataDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DictionaryDataDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DictionaryDataDTO save(DictionaryDataDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DictionaryDataDTO.class)
    }

    /**
     * 行为：移动排序 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(DictionaryDataDTO dto) throws Throwable {
        return this.executeForList(ACTION_MOVE_ORDER, dto, DictionaryDataDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DictionaryDataDTO> fetchDefault(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA)
    Page<DictionaryDataDTO> fetchIdea(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：需求优先级 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_PRIORITY)
    Page<DictionaryDataDTO> fetchIdeaPriority(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_PRIORITY, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：需求来源 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_SOURCE)
    Page<DictionaryDataDTO> fetchIdeaSource(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_SOURCE, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：需求状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_STATE)
    Page<DictionaryDataDTO> fetchIdeaState(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_STATE, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：需求类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_TYPE)
    Page<DictionaryDataDTO> fetchIdeaType(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_TYPE, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：发布阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELEASE_STAGE)
    Page<DictionaryDataDTO> fetchReleaseStage(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELEASE_STAGE, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：测试用例 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_CASE)
    Page<DictionaryDataDTO> fetchTestCase(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_CASE, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：测试用例重要程度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_CASE_IMPORTANCE_LEVEL)
    Page<DictionaryDataDTO> fetchTestCaseImportanceLevel(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_CASE_IMPORTANCE_LEVEL, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：测试用例状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_CASE_STATUS)
    Page<DictionaryDataDTO> fetchTestCaseStatus(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_CASE_STATUS, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：测试用例测试类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_CASE_TEST_TYPE)
    Page<DictionaryDataDTO> fetchTestCaseTestType(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_CASE_TEST_TYPE, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：测试用例类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TEST_CASE_TYPE)
    Page<DictionaryDataDTO> fetchTestCaseType(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TEST_CASE_TYPE, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：工单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TICKET)
    Page<DictionaryDataDTO> fetchTicket(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TICKET, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：工单优先级 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TICKET_PRIORITY)
    Page<DictionaryDataDTO> fetchTicketPriority(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TICKET_PRIORITY, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：工单解决方案 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TICKET_SOLUTION)
    Page<DictionaryDataDTO> fetchTicketSolution(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TICKET_SOLUTION, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：工单状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TICKET_STATE)
    Page<DictionaryDataDTO> fetchTicketState(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TICKET_STATE, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM)
    Page<DictionaryDataDTO> fetchWorkItem(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：工作项任务类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_CATEGORY)
    Page<DictionaryDataDTO> fetchWorkItemCategory(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_CATEGORY, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：工作项优先级 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_PRIORITY)
    Page<DictionaryDataDTO> fetchWorkItemPriority(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_PRIORITY, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：工作项复现概率 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_PROBABILITY)
    Page<DictionaryDataDTO> fetchWorkItemProbability(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_PROBABILITY, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：工作项风险 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_RISK)
    Page<DictionaryDataDTO> fetchWorkItemRisk(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_RISK, context, DictionaryDataDTO.class)
    }

    /**
     * 数据集：工作项严重程度 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_SEVERITY)
    Page<DictionaryDataDTO> fetchWorkItemSeverity(DictionaryDataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_SEVERITY, context, DictionaryDataDTO.class)
    }

}