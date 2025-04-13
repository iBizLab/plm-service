package cn.ibizlab.plm.base.deliverable.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class DeliverableDTO extends GroovyDTO<DeliverableDTO> {

    /**
     * 「所属数据标识」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「所属对象子类型」
     */
    @JsonProperty("owner_subtype")
    String ownerSubtype
    /**
     * 「文件标识」
     */
    @JsonProperty("file_id")
    String fileId
    /**
     * 「工作项编号」
     */
    @JsonProperty("work_item_identifier")
    String workItemIdentifier
    /**
     * 「工作项标题」
     */
    @JsonProperty("work_item_title")
    String workItemTitle
    /**
     * 「工作项类型」
     */
    @JsonProperty("work_item_type_id")
    String workItemTypeId
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime

    /**
     * 设置「所属数据标识」值
     * @param val
     */
    DeliverableDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    DeliverableDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所属对象子类型」值
     * @param val
     */
    DeliverableDTO setOwnerSubtype(String ownerSubtype) {
        this.ownerSubtype = ownerSubtype
        return this
    }


    /**
     * 设置「文件标识」值
     * @param val
     */
    DeliverableDTO setFileId(String fileId) {
        this.fileId = fileId
        return this
    }


    /**
     * 设置「工作项编号」值
     * @param val
     */
    DeliverableDTO setWorkItemIdentifier(String workItemIdentifier) {
        this.workItemIdentifier = workItemIdentifier
        return this
    }


    /**
     * 设置「工作项标题」值
     * @param val
     */
    DeliverableDTO setWorkItemTitle(String workItemTitle) {
        this.workItemTitle = workItemTitle
        return this
    }


    /**
     * 设置「工作项类型」值
     * @param val
     */
    DeliverableDTO setWorkItemTypeId(String workItemTypeId) {
        this.workItemTypeId = workItemTypeId
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    DeliverableDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    DeliverableDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    DeliverableDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    DeliverableDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    DeliverableDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    DeliverableDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DeliverableDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
