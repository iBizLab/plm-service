package cn.ibizlab.plm.projmgmt.project.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.projmgmt.projectmember.dto.ProjectMemberDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ProjectAiInfoDTO extends GroovyDTO<ProjectAiInfoDTO> {

    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「项目名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「项目标识」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「成员」
     */
    @JsonProperty("members")
    List<ProjectMemberDTO> members

    /**
     * 设置「建立时间」值
     * @param val
     */
    ProjectAiInfoDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ProjectAiInfoDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「项目名称」值
     * @param val
     */
    ProjectAiInfoDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「项目标识」值
     * @param val
     */
    ProjectAiInfoDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ProjectAiInfoDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ProjectAiInfoDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「成员」值
     * @param val
     */
    ProjectAiInfoDTO setMembers(List<ProjectMemberDTO> members) {
        this.members = members
        return this
    }

}
