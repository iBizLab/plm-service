package cn.ibizlab.plm.ftr.searchhub

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ftr.searchhub.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SEARCH_HUB]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SearchHub extends GroovyDataEntityRuntime<SearchHub,SearchHubDTO,SearchHubFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static SearchHub _instance
    void setInstance(SearchHub instance) {
        _instance = instance
    }
    static SearchHub getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    SearchHubDTO create(SearchHubDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SearchHubDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SearchHubDTO update(SearchHubDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SearchHubDTO.class)
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
    SearchHubDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SearchHubDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SearchHubDTO getDraft(SearchHubDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SearchHubDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SearchHubDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SearchHubDTO save(SearchHubDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SearchHubDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SearchHubDTO> fetchDefault(SearchHubFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SearchHubDTO.class)
    }

}