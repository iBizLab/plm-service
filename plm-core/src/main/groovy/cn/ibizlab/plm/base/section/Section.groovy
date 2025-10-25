package cn.ibizlab.plm.base.section

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.section.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SECTION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Section extends GroovyDynaDataEntityRuntime<Section,SectionDTO,SectionFilterDTO> {

    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_THIS_PRODUCT_SECTION = "This_product_section"
    public static final String DATASET_CHECK_NAME = "check_name"
    public static final String DATASET_IDEA_SECTION = "idea_section"
    public static final String DATASET_MY_SECTION = "my_section"
    private static Section _instance
    void setInstance(Section instance) {
        _instance = instance
    }
    static Section getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    SectionDTO create(SectionDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SectionDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SectionDTO update(SectionDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SectionDTO.class)
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
    SectionDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SectionDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SectionDTO getDraft(SectionDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SectionDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SectionDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SectionDTO save(SectionDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SectionDTO.class)
    }

    /**
     * 行为：移动需求 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(SectionDTO dto) throws Throwable {
        return this.executeForList(ACTION_MOVE_ORDER, dto, SectionDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SectionDTO> fetchDefault(SectionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SectionDTO.class)
    }

    /**
     * 数据集：产品排期分组 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_THIS_PRODUCT_SECTION)
    Page<SectionDTO> fetchThisProductSection(SectionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_THIS_PRODUCT_SECTION, context, SectionDTO.class)
    }

    /**
     * 数据集：检查名称是否重复 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHECK_NAME)
    Page<SectionDTO> fetchCheckName(SectionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHECK_NAME, context, SectionDTO.class)
    }

    /**
     * 数据集：需求子产品 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IDEA_SECTION)
    Page<SectionDTO> fetchIdeaSection(SectionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IDEA_SECTION, context, SectionDTO.class)
    }

    /**
     * 数据集：我的分组 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_SECTION)
    Page<SectionDTO> fetchMySection(SectionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_SECTION, context, SectionDTO.class)
    }

}