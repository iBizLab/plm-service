package cn.ibizlab.plm.testmgmt.guideline

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.testmgmt.guideline.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[GUIDELINE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Guideline extends GroovyDynaDataEntityRuntime<Guideline,GuidelineDTO,GuidelineFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_BASE = "base"
    public static final String DATASET_NORMAL = "normal"
    public static final String DATASET_UNDER_LIBRARY = "under_library"
    private static Guideline _instance
    void setInstance(Guideline instance) {
        _instance = instance
    }
    static Guideline getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    GuidelineDTO create(GuidelineDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, GuidelineDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    GuidelineDTO update(GuidelineDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, GuidelineDTO.class)
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
    GuidelineDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, GuidelineDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    GuidelineDTO getDraft(GuidelineDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, GuidelineDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(GuidelineDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    GuidelineDTO save(GuidelineDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, GuidelineDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<GuidelineDefGroupDTO> fetchDefault(GuidelineFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, GuidelineDefGroupDTO.class)
    }

    /**
     * 数据集：基础准则 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BASE)
    Page<GuidelineDefGroupDTO> fetchBase(GuidelineFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BASE, context, GuidelineDefGroupDTO.class)
    }

    /**
     * 数据集：正常状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    Page<GuidelineDTO> fetchNormal(GuidelineFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context, GuidelineDTO.class)
    }

    /**
     * 数据集：测试库下流程准则 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_UNDER_LIBRARY)
    Page<GuidelineDefGroupDTO> fetchUnderLibrary(GuidelineFilterDTO context) throws Throwable {
        return this.fetch(DATASET_UNDER_LIBRARY, context, GuidelineDefGroupDTO.class)
    }

}