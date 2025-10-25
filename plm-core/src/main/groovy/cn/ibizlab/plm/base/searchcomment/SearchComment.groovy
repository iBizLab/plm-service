package cn.ibizlab.plm.base.searchcomment

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.searchcomment.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SEARCH_COMMENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SearchComment extends GroovyDynaDataEntityRuntime<SearchComment,SearchCommentDTO,SearchCommentFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ADVANCED_SEARCH = "advanced_search"
    public static final String DATASET_RELATION = "relation"
    private static SearchComment _instance
    void setInstance(SearchComment instance) {
        _instance = instance
    }
    static SearchComment getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    SearchCommentDTO create(SearchCommentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SearchCommentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SearchCommentDTO update(SearchCommentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SearchCommentDTO.class)
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
    SearchCommentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SearchCommentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SearchCommentDTO getDraft(SearchCommentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SearchCommentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SearchCommentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SearchCommentDTO save(SearchCommentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SearchCommentDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SearchCommentDTO> fetchDefault(SearchCommentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SearchCommentDTO.class)
    }

    /**
     * 数据集：高级搜索 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ADVANCED_SEARCH)
    Page<SearchCommentDTO> fetchAdvancedSearch(SearchCommentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ADVANCED_SEARCH, context, SearchCommentDTO.class)
    }

    /**
     * 数据集：关联查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELATION)
    Page<SearchCommentDTO> fetchRelation(SearchCommentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELATION, context, SearchCommentDTO.class)
    }

}