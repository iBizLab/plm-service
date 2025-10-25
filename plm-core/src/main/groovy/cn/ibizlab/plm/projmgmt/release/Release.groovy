package cn.ibizlab.plm.projmgmt.release

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.release.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RELEASE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Release extends GroovyDynaDataEntityRuntime<Release,ReleaseDTO,ReleaseFilterDTO> {

    public static final String ACTION_CAL_RELEASE_WORK_ITEM_NUM = "cal_release_work_item_num"
    public static final String ACTION_CHANGE_DRAFT = "change_draft"
    public static final String ACTION_CHANGE_STAGE = "change_stage"
    public static final String ACTION_DEL_RELATION = "del_relation"
    public static final String ACTION_DELETE_CATEGORIES = "delete_categories"
    public static final String ACTION_PLAN_WORK_ITEM = "plan_work_item"
    public static final String ACTION_RELEASE_RELATION_SPRINT = "release_relation_sprint"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_BI_DETAIL = "bi_detail"
    public static final String DATASET_BI_SEARCH = "bi_search"
    public static final String DATASET_CHOOSE_RELESE_RELATION = "choose_relese_relation"
    public static final String DATASET_MOB_PROJECT_RELEASE = "mob_project_release"
    public static final String DATASET_NOT_PUBLISHED = "not_published"
    public static final String DATASET_PRODUCT_RE_PROJECT_PUBLISHED = "product_re_project_published"
    public static final String DATASET_PUBLISHED = "published"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_SPRINT_RELATION = "sprint_relation"
    private static Release _instance
    void setInstance(Release instance) {
        _instance = instance
    }
    static Release getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ReleaseDTO create(ReleaseDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ReleaseDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ReleaseDTO update(ReleaseDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ReleaseDTO.class)
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
    ReleaseDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ReleaseDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ReleaseDTO getDraft(ReleaseDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ReleaseDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ReleaseDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ReleaseDTO save(ReleaseDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ReleaseDTO.class)
    }

    /**
     * 行为：计算发布工作项数量 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_CAL_RELEASE_WORK_ITEM_NUM)
    def calReleaseWorkItemNum(String key) throws Throwable {
        return this.execute(ACTION_CAL_RELEASE_WORK_ITEM_NUM, key, ReleaseDTO.class)
    }

    /**
     * 行为：获取修改阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_DRAFT)
    def changeDraft(ReleaseDTO dto) throws Throwable {
        return this.execute(ACTION_CHANGE_DRAFT, dto, ReleaseDTO.class)
    }

    /**
     * 行为：修改发布当前阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_STAGE)
    def changeStage(ReleaseDTO dto) throws Throwable {
        return this.execute(ACTION_CHANGE_STAGE, dto, ReleaseDTO.class)
    }

    /**
     * 行为：迭代取消关联发布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DEL_RELATION)
    def delRelation(ReleaseDTO dto) throws Throwable {
        this.execute(ACTION_DEL_RELATION, dto, ReleaseDTO.class)
    }

    /**
     * 行为：删除类别 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_CATEGORIES)
    def deleteCategories(ReleaseDTO dto) throws Throwable {
        return this.execute(ACTION_DELETE_CATEGORIES, dto, ReleaseDTO.class)
    }

    /**
     * 行为：规划工作项 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PLAN_WORK_ITEM)
    def planWorkItem(ReleaseDTO dto) throws Throwable {
        this.execute(ACTION_PLAN_WORK_ITEM, dto, ReleaseDTO.class)
    }

    /**
     * 行为：发布关联迭代 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RELEASE_RELATION_SPRINT)
    def releaseRelationSprint(ReleaseDTO dto) throws Throwable {
        return this.execute(ACTION_RELEASE_RELATION_SPRINT, dto, ReleaseDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ReleaseDTO> fetchDefault(ReleaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ReleaseDTO.class)
    }

    /**
     * 数据集：BI反查 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_DETAIL)
    Page<ReleaseDTO> fetchBiDetail(ReleaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_DETAIL, context, ReleaseDTO.class)
    }

    /**
     * 数据集：BI查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    Page<ReleaseBiSearchGroupDTO> fetchBiSearch(ReleaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context, ReleaseBiSearchGroupDTO.class)
    }

    /**
     * 数据集：选择发布关联 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_RELESE_RELATION)
    Page<ReleaseDTO> fetchChooseReleseRelation(ReleaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_RELESE_RELATION, context, ReleaseDTO.class)
    }

    /**
     * 数据集：项目下发布（移动端） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_PROJECT_RELEASE)
    Page<ReleaseDTO> fetchMobProjectRelease(ReleaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_PROJECT_RELEASE, context, ReleaseDTO.class)
    }

    /**
     * 数据集：未已发布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_PUBLISHED)
    Page<ReleaseDTO> fetchNotPublished(ReleaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_PUBLISHED, context, ReleaseDTO.class)
    }

    /**
     * 数据集：产品所属发布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PRODUCT_RE_PROJECT_PUBLISHED)
    Page<ReleaseDTO> fetchProductReProjectPublished(ReleaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PRODUCT_RE_PROJECT_PUBLISHED, context, ReleaseDTO.class)
    }

    /**
     * 数据集：已发布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PUBLISHED)
    Page<ReleaseDTO> fetchPublished(ReleaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PUBLISHED, context, ReleaseDTO.class)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<ReleaseDTO> fetchReader(ReleaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, ReleaseDTO.class)
    }

    /**
     * 数据集：迭代关联发布 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SPRINT_RELATION)
    Page<ReleaseDTO> fetchSprintRelation(ReleaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SPRINT_RELATION, context, ReleaseDTO.class)
    }

}