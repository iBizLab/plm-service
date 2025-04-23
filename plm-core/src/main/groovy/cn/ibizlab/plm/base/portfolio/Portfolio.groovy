package cn.ibizlab.plm.base.portfolio

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.portfolio.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PORTFOLIO]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Portfolio extends GroovyDataEntityRuntime<Portfolio,PortfolioDTO,PortfolioFilterDTO> {

    public static final String ACTION_DELETE_PROJECT_SET = "delete_project_set"
    public static final String ACTION_FAVORITE = "favorite"
    public static final String ACTION_PORTFOLIO_INDEX_ADDON_COUNTER = "portfolio_index_addon_counter"
    public static final String ACTION_RECOVER_PROJECT_SET = "recover_project_set"
    public static final String ACTION_REMOVE_FROM_PROJECT_SET = "remove_from_project_set"
    public static final String ACTION_RESOURCE_SETTING = "resource_setting"
    public static final String ACTION_UN_FAVORITE = "un_favorite"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ADMIN = "admin"
    public static final String DATASET_CHOOSE_PROJECT_PORTFOLIO = "choose_project_portfolio"
    public static final String DATASET_FAVORITE = "favorite"
    public static final String DATASET_PROJECT_SET_DELETED = "project_set_deleted"
    public static final String DATASET_PROJECT_SET_GOING = "project_set_going"
    public static final String DATASET_READER = "reader"
    public static final String DATASET_USER = "user"
    public static final String DATASET_WORK_PROJECT_PORTFOLIO = "work_project_portfolio"
    private static Portfolio _instance
    void setInstance(Portfolio instance) {
        _instance = instance
    }
    static Portfolio getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PortfolioDTO create(PortfolioDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PortfolioDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PortfolioDTO update(PortfolioDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PortfolioDTO.class)
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
    PortfolioDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PortfolioDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PortfolioDTO getDraft(PortfolioDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PortfolioDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PortfolioDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PortfolioDTO save(PortfolioDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PortfolioDTO.class)
    }

    /**
     * 行为：删除项目集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_PROJECT_SET)
    def deleteProjectSet(PortfolioDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_PROJECT_SET, dto, PortfolioDTO.class)
    }

    /**
     * 行为：设置星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FAVORITE)
    def favorite(PortfolioDTO dto) throws Throwable {
        this.execute(ACTION_FAVORITE, dto, PortfolioDTO.class)
    }

    /**
     * 行为：项目集首页组件计数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PORTFOLIO_INDEX_ADDON_COUNTER)
    def portfolioIndexAddonCounter(PortfolioDTO dto) throws Throwable {
        this.execute(ACTION_PORTFOLIO_INDEX_ADDON_COUNTER, dto, PortfolioDTO.class)
    }

    /**
     * 行为：恢复项目集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOVER_PROJECT_SET)
    def recoverProjectSet(PortfolioDTO dto) throws Throwable {
        this.execute(ACTION_RECOVER_PROJECT_SET, dto, PortfolioDTO.class)
    }

    /**
     * 行为：从项目集中移除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE_FROM_PROJECT_SET)
    def removeFromProjectSet(PortfolioDTO dto) throws Throwable {
        return this.execute(ACTION_REMOVE_FROM_PROJECT_SET, dto, PortfolioDTO.class)
    }

    /**
     * 行为：项目资源成员设置 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RESOURCE_SETTING)
    def resourceSetting(PortfolioDTO dto) throws Throwable {
        return this.execute(ACTION_RESOURCE_SETTING, dto, PortfolioDTO.class)
    }

    /**
     * 行为：取消星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UN_FAVORITE)
    def unFavorite(PortfolioDTO dto) throws Throwable {
        this.execute(ACTION_UN_FAVORITE, dto, PortfolioDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PortfolioDTO> fetchDefault(PortfolioFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PortfolioDTO.class)
    }

    /**
     * 数据集：管理员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADMIN)
    Page<PortfolioDTO> fetchAdmin(PortfolioFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADMIN, context, PortfolioDTO.class)
    }

    /**
     * 数据集：选择项目集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHOOSE_PROJECT_PORTFOLIO)
    Page<PortfolioDTO> fetchChooseProjectPortfolio(PortfolioFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHOOSE_PROJECT_PORTFOLIO, context, PortfolioDTO.class)
    }

    /**
     * 数据集：查询星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FAVORITE)
    Page<PortfolioDTO> fetchFavorite(PortfolioFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FAVORITE, context, PortfolioDTO.class)
    }

    /**
     * 数据集：已删除的项目集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROJECT_SET_DELETED)
    Page<PortfolioDTO> fetchProjectSetDeleted(PortfolioFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROJECT_SET_DELETED, context, PortfolioDTO.class)
    }

    /**
     * 数据集：进行中的项目集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROJECT_SET_GOING)
    Page<PortfolioDTO> fetchProjectSetGoing(PortfolioFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROJECT_SET_GOING, context, PortfolioDTO.class)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<PortfolioDTO> fetchReader(PortfolioFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, PortfolioDTO.class)
    }

    /**
     * 数据集：普通成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER)
    Page<PortfolioDTO> fetchUser(PortfolioFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context, PortfolioDTO.class)
    }

    /**
     * 数据集：工作下的项目集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_PROJECT_PORTFOLIO)
    Page<PortfolioDTO> fetchWorkProjectPortfolio(PortfolioFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_PROJECT_PORTFOLIO, context, PortfolioDTO.class)
    }

}