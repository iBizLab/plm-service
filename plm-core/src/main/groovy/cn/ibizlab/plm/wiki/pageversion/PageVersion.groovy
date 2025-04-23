package cn.ibizlab.plm.wiki.pageversion

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.wiki.pageversion.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PAGE_VERSION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PageVersion extends GroovyDataEntityRuntime<PageVersion,PageVersionDTO,PageVersionFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PageVersion _instance
    void setInstance(PageVersion instance) {
        _instance = instance
    }
    static PageVersion getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PageVersionDTO create(PageVersionDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PageVersionDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PageVersionDTO update(PageVersionDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PageVersionDTO.class)
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
    PageVersionDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PageVersionDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PageVersionDTO getDraft(PageVersionDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PageVersionDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PageVersionDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PageVersionDTO save(PageVersionDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PageVersionDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PageVersionDTO> fetchDefault(PageVersionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PageVersionDTO.class)
    }

}