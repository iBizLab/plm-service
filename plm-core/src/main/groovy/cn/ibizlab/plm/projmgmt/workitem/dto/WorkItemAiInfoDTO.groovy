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
class WorkItemAiInfoDTO extends GroovyDTO<WorkItemAiInfoDTO> {

    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「状态」
     * 字典[工作项状态（动态）]
     */
    @JsonProperty("state")
    String state
    /**
     * 「优先级」
     * 字典[优先级]
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「所属项目」
     */
    @JsonProperty("project_name")
    String projectName
    /**
     * 「负责人」
     */
    @JsonProperty("assignee_name")
    String assigneeName
    /**
     * 「工作项类型」
     */
    @JsonProperty("work_item_type_name")
    String workItemTypeName
    /**
     * 「内容格式」
     * 字典[报表输出格式]
     */
    @JsonProperty("format_type")
    String formatType
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「标签」
     */
    @JsonProperty("tags")
    String tags
    /**
     * 「严重程度」
     * 字典[严重程度]
     */
    @JsonProperty("severity")
    String severity
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
     * 「项目」
     */
    @JsonProperty("project_id")
    String projectId
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime

    /**
     * 设置「编号」值
     * @param val
     */
    WorkItemAiInfoDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    WorkItemAiInfoDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「状态」值
     * 字典[工作项状态（动态）]
     * @param val
     */
    WorkItemAiInfoDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[优先级]
     * @param val
     */
    WorkItemAiInfoDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「所属项目」值
     * @param val
     */
    WorkItemAiInfoDTO setProjectName(String projectName) {
        this.projectName = projectName
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    WorkItemAiInfoDTO setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName
        return this
    }


    /**
     * 设置「工作项类型」值
     * @param val
     */
    WorkItemAiInfoDTO setWorkItemTypeName(String workItemTypeName) {
        this.workItemTypeName = workItemTypeName
        return this
    }


    /**
     * 设置「内容格式」值
     * 字典[报表输出格式]
     * @param val
     */
    WorkItemAiInfoDTO setFormatType(String formatType) {
        this.formatType = formatType
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    WorkItemAiInfoDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    WorkItemAiInfoDTO setTags(String tags) {
        this.tags = tags
        return this
    }


    /**
     * 设置「严重程度」值
     * 字典[严重程度]
     * @param val
     */
    WorkItemAiInfoDTO setSeverity(String severity) {
        this.severity = severity
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    WorkItemAiInfoDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    WorkItemAiInfoDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「项目」值
     * @param val
     */
    WorkItemAiInfoDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    WorkItemAiInfoDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
