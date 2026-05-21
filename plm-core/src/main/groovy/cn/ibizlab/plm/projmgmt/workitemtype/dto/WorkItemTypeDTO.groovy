package cn.ibizlab.plm.projmgmt.workitemtype.dto

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
class WorkItemTypeDTO extends GroovyDTO<WorkItemTypeDTO> {

    /**
     * 「序号」
     */
    @JsonProperty("sequence")
    BigDecimal sequence
    /**
     * 「是否系统类型」
     * 字典[是否]
     */
    @JsonProperty("is_system")
    Integer isSystem
    /**
     * 「项目类型」
     * 字典[项目类型]
     */
    @JsonProperty("project_type")
    String projectType
    /**
     * 「类型分组」
     * 字典[工作项类型分组]
     */
    @JsonProperty("group")
    String group
    /**
     * 「编码」
     */
    @JsonProperty("code")
    String code
    /**
     * 「图标」
     */
    @JsonProperty("icon")
    String icon
    /**
     * 「下级类型」
     */
    @JsonProperty("sub_type")
    String subType
    /**
     * 「原始状态」
     */
    @JsonProperty("orgin_state")
    String orginState
    /**
     * 「图标（显示）」
     */
    @JsonProperty("icon_disp")
    String iconDisp
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
     * 设置「序号」值
     * @param val
     */
    WorkItemTypeDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「是否系统类型」值
     * 字典[是否]
     * @param val
     */
    WorkItemTypeDTO setIsSystem(Integer isSystem) {
        this.isSystem = isSystem
        return this
    }


    /**
     * 设置「项目类型」值
     * 字典[项目类型]
     * @param val
     */
    WorkItemTypeDTO setProjectType(String projectType) {
        this.projectType = projectType
        return this
    }


    /**
     * 设置「类型分组」值
     * 字典[工作项类型分组]
     * @param val
     */
    WorkItemTypeDTO setGroup(String group) {
        this.group = group
        return this
    }


    /**
     * 设置「编码」值
     * @param val
     */
    WorkItemTypeDTO setCode(String code) {
        this.code = code
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    WorkItemTypeDTO setIcon(String icon) {
        this.icon = icon
        return this
    }


    /**
     * 设置「下级类型」值
     * @param val
     */
    WorkItemTypeDTO setSubType(String subType) {
        this.subType = subType
        return this
    }


    /**
     * 设置「原始状态」值
     * @param val
     */
    WorkItemTypeDTO setOrginState(String orginState) {
        this.orginState = orginState
        return this
    }


    /**
     * 设置「图标（显示）」值
     * @param val
     */
    WorkItemTypeDTO setIconDisp(String iconDisp) {
        this.iconDisp = iconDisp
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkItemTypeDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    WorkItemTypeDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    WorkItemTypeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    WorkItemTypeDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「项目标识」值
     * @param val
     */
    WorkItemTypeDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkItemTypeDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    WorkItemTypeDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
