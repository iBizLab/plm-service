package cn.ibizlab.plm.projmgmt.workitem.dto

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
class WorkItemBaselineChooseDTO extends GroovyDTO<WorkItemBaselineChooseDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「工作项类型」
     * 字典[工作项类型]
     */
    @JsonProperty("work_item_type_id")
    String workItemTypeId
    /**
     * 「当前版本标识」
     */
    @JsonProperty("cur_version_id")
    String curVersionId
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_id")
    String assigneeId
    /**
     * 「项目」
     */
    @JsonProperty("project_id")
    String projectId
    /**
     * 「优先级」
     * 字典[优先级]
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「工作项类型」
     */
    @JsonProperty("work_item_type_name")
    String workItemTypeName
    /**
     * 「状态」
     * 字典[工作项状态（动态）]
     */
    @JsonProperty("state")
    String state
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName

    /**
     * 设置「标识」值
     * @param val
     */
    WorkItemBaselineChooseDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「工作项类型」值
     * 字典[工作项类型]
     * @param val
     */
    WorkItemBaselineChooseDTO setWorkItemTypeId(String workItemTypeId) {
        this.workItemTypeId = workItemTypeId
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    WorkItemBaselineChooseDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    WorkItemBaselineChooseDTO setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId
        return this
    }


    /**
     * 设置「项目」值
     * @param val
     */
    WorkItemBaselineChooseDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[优先级]
     * @param val
     */
    WorkItemBaselineChooseDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    WorkItemBaselineChooseDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    WorkItemBaselineChooseDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「工作项类型」值
     * @param val
     */
    WorkItemBaselineChooseDTO setWorkItemTypeName(String workItemTypeName) {
        this.workItemTypeName = workItemTypeName
        return this
    }


    /**
     * 设置「状态」值
     * 字典[工作项状态（动态）]
     * @param val
     */
    WorkItemBaselineChooseDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    WorkItemBaselineChooseDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }

}
