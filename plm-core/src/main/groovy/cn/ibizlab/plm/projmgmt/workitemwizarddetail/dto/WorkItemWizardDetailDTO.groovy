package cn.ibizlab.plm.projmgmt.workitemwizarddetail.dto

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
class WorkItemWizardDetailDTO extends GroovyDTO<WorkItemWizardDetailDTO> {

    /**
     * 「原工作项类型」
     * 字典[工作项类型]
     */
    @JsonProperty("origin_type")
    String originType
    /**
     * 「目标类型」
     * 字典[工作项类型]
     */
    @JsonProperty("target_type")
    String targetType
    /**
     * 「状态变更」
     */
    @JsonProperty("states")
    List<IEntity> states
    /**
     * 「子工作项类型」
     */
    @JsonProperty("child_work_item_types")
    List<IEntity> childWorkItemTypes
    /**
     * 「属性补充集合」
     */
    @JsonProperty("properties")
    List<IEntity> properties
    /**
     * 「影响工作项数量」
     */
    @JsonProperty("influence")
    Integer influence
    /**
     * 「目标工作项状态」
     * 字典[项目工作项代码表]
     */
    @JsonProperty("target_state")
    String targetState
    /**
     * 「原工作项状态」
     * 字典[项目工作项代码表]
     */
    @JsonProperty("origin_state")
    String originState
    /**
     * 「项目标识」
     */
    @JsonProperty("project_id")
    String projectId
    /**
     * 「工作项标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「负责人」
     */
    @JsonProperty("assigee_name")
    String assigeeName
    /**
     * 「优先级」
     * 字典[优先级]
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「目标父工作项」
     */
    @JsonProperty("target_parent")
    String targetParent
    /**
     * 「原父工作项」
     */
    @JsonProperty("origin_parent")
    String originParent
    /**
     * 「子工作项类型」
     * 字典[工作项类型]
     */
    @JsonProperty("child_type")
    String childType
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
     * 「向导标识」
     */
    @JsonProperty("wizard_id")
    String wizardId

    /**
     * 设置「原工作项类型」值
     * 字典[工作项类型]
     * @param val
     */
    WorkItemWizardDetailDTO setOriginType(String originType) {
        this.originType = originType
        return this
    }


    /**
     * 设置「目标类型」值
     * 字典[工作项类型]
     * @param val
     */
    WorkItemWizardDetailDTO setTargetType(String targetType) {
        this.targetType = targetType
        return this
    }


    /**
     * 设置「状态变更」值
     * @param val
     */
    WorkItemWizardDetailDTO setStates(List<IEntity> states) {
        this.states = states
        return this
    }


    /**
     * 设置「子工作项类型」值
     * @param val
     */
    WorkItemWizardDetailDTO setChildWorkItemTypes(List<IEntity> childWorkItemTypes) {
        this.childWorkItemTypes = childWorkItemTypes
        return this
    }


    /**
     * 设置「属性补充集合」值
     * @param val
     */
    WorkItemWizardDetailDTO setProperties(List<IEntity> properties) {
        this.properties = properties
        return this
    }


    /**
     * 设置「影响工作项数量」值
     * @param val
     */
    WorkItemWizardDetailDTO setInfluence(Integer influence) {
        this.influence = influence
        return this
    }


    /**
     * 设置「目标工作项状态」值
     * 字典[项目工作项代码表]
     * @param val
     */
    WorkItemWizardDetailDTO setTargetState(String targetState) {
        this.targetState = targetState
        return this
    }


    /**
     * 设置「原工作项状态」值
     * 字典[项目工作项代码表]
     * @param val
     */
    WorkItemWizardDetailDTO setOriginState(String originState) {
        this.originState = originState
        return this
    }


    /**
     * 设置「项目标识」值
     * @param val
     */
    WorkItemWizardDetailDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「工作项标题」值
     * @param val
     */
    WorkItemWizardDetailDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    WorkItemWizardDetailDTO setAssigeeName(String assigeeName) {
        this.assigeeName = assigeeName
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[优先级]
     * @param val
     */
    WorkItemWizardDetailDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「目标父工作项」值
     * @param val
     */
    WorkItemWizardDetailDTO setTargetParent(String targetParent) {
        this.targetParent = targetParent
        return this
    }


    /**
     * 设置「原父工作项」值
     * @param val
     */
    WorkItemWizardDetailDTO setOriginParent(String originParent) {
        this.originParent = originParent
        return this
    }


    /**
     * 设置「子工作项类型」值
     * 字典[工作项类型]
     * @param val
     */
    WorkItemWizardDetailDTO setChildType(String childType) {
        this.childType = childType
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkItemWizardDetailDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    WorkItemWizardDetailDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    WorkItemWizardDetailDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    WorkItemWizardDetailDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkItemWizardDetailDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    WorkItemWizardDetailDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「向导标识」值
     * @param val
     */
    WorkItemWizardDetailDTO setWizardId(String wizardId) {
        this.wizardId = wizardId
        return this
    }

}
