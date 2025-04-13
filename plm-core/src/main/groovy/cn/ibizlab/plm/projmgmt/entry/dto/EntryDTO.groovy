package cn.ibizlab.plm.projmgmt.entry.dto

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
class EntryDTO extends GroovyDTO<EntryDTO> {

    /**
     * 「排序」
     */
    @JsonProperty("show_order")
    Integer showOrder
    /**
     * 「是否系统标记」
     * 字典[是否]
     */
    @JsonProperty("is_system")
    Integer isSystem
    /**
     * 「是否将看板栏拆分为进行中和已完成」
     * 字典[是否]
     */
    @JsonProperty("is_split")
    Integer isSplit
    /**
     * 「看板标识」
     */
    @JsonProperty("board_id")
    String boardId
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
     * 「项目标识」
     */
    @JsonProperty("project_id")
    String projectId
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
     * 设置「排序」值
     * @param val
     */
    EntryDTO setShowOrder(Integer showOrder) {
        this.showOrder = showOrder
        return this
    }


    /**
     * 设置「是否系统标记」值
     * 字典[是否]
     * @param val
     */
    EntryDTO setIsSystem(Integer isSystem) {
        this.isSystem = isSystem
        return this
    }


    /**
     * 设置「是否将看板栏拆分为进行中和已完成」值
     * 字典[是否]
     * @param val
     */
    EntryDTO setIsSplit(Integer isSplit) {
        this.isSplit = isSplit
        return this
    }


    /**
     * 设置「看板标识」值
     * @param val
     */
    EntryDTO setBoardId(String boardId) {
        this.boardId = boardId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    EntryDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    EntryDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    EntryDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    EntryDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「项目标识」值
     * @param val
     */
    EntryDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    EntryDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    EntryDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
