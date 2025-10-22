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

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ATTACHMENTS = "attachments"
    public static final String DATASET_MOB_WORK_ITEM_ATTACHMENT = "mob_work_item_attachment"
    public static final String DATASET_PROJECT_DELIVERABLE = "project_deliverable"
    public static final String DATASET_WORK_ITEM_DELIVERABLE = "work_item_deliverable"
    private static Attachment _instance
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
    AttachmentDTO create(AttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttachmentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttachmentDTO update(AttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttachmentDTO.class)
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
    AttachmentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttachmentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttachmentDTO getDraft(AttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttachmentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttachmentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttachmentDTO save(AttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttachmentDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttachmentDTO> fetchDefault(AttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttachmentDTO.class)
    }

    /**
     * 数据集：附件 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ATTACHMENTS)
    Page<AttachmentDTO> fetchAttachments(AttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ATTACHMENTS, context, AttachmentDTO.class)
    }

    /**
     * 数据集：移动端工作项附件 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MOB_WORK_ITEM_ATTACHMENT)
    Page<AttachmentDTO> fetchMobWorkItemAttachment(AttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MOB_WORK_ITEM_ATTACHMENT, context, AttachmentDTO.class)
    }

    /**
     * 数据集：项目下的交付物 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PROJECT_DELIVERABLE)
    Page<AttachmentDTO> fetchProjectDeliverable(AttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PROJECT_DELIVERABLE, context, AttachmentDTO.class)
    }

    /**
     * 数据集：工作项交付物 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WORK_ITEM_DELIVERABLE)
    Page<AttachmentDTO> fetchWorkItemDeliverable(AttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WORK_ITEM_DELIVERABLE, context, AttachmentDTO.class)
    }

}