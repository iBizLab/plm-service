package cn.ibizlab.plm.base.attachment

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.base.attachment.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTACHMENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Attachment extends GroovyDataEntityRuntime<Attachment,AttachmentDTO,AttachmentFilterDTO> {

    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_MOB_WORK_ITEM_ATTACHMENT = "mob_work_item_attachment"
    public static final String DATASET_PROJECT_DELIVERABLE = "project_deliverable"
    public static final String DATASET_WORK_ITEM_DELIVERABLE = "work_item_deliverable"
    private static Attachment _instance;
    void setInstance(Attachment instance) {
        _instance = instance
    }
    static Attachment getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    def create(AttachmentDTO dto) throws Throwable {
        this.execute(ACTION_CREATE, dto)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    def update(AttachmentDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE, dto)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    def remove(List<String> keys) throws Throwable {
        this.execute(ACTION_REMOVE, keys)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    def get(String key) throws Throwable {
        return this.execute(ACTION_GET, key)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    def getDraft(AttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    def checkKey(AttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_CHECKKEY, dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    def save(AttachmentDTO dto) throws Throwable {
        this.execute(ACTION_SAVE, dto)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    def fetchDefault(AttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context)
    }

    /**
     * 数据集：移动端工作项附件 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_WORK_ITEM_ATTACHMENT)
    def fetchMobWorkItemAttachment(AttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_WORK_ITEM_ATTACHMENT, context)
    }

    /**
     * 数据集：项目下的交付物 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROJECT_DELIVERABLE)
    def fetchProjectDeliverable(AttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROJECT_DELIVERABLE, context)
    }

    /**
     * 数据集：工作项交付物 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_DELIVERABLE)
    def fetchWorkItemDeliverable(AttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_DELIVERABLE, context)
    }

}