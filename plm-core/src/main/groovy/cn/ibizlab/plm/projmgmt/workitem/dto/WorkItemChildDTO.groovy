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
class WorkItemChildDTO extends GroovyDTO<WorkItemChildDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「顶级工作项标识」
     */
    @JsonProperty("top_id")
    String topId
    /**
     * 「父标识」
     */
    @JsonProperty("pid")
    String pid
    /**
     * 「项目」
     */
    @JsonProperty("project_id")
    String projectId

    /**
     * 设置「标识」值
     * @param val
     */
    WorkItemChildDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「顶级工作项标识」值
     * @param val
     */
    WorkItemChildDTO setTopId(String topId) {
        this.topId = topId
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    WorkItemChildDTO setPid(String pid) {
        this.pid = pid
        return this
    }


    /**
     * 设置「项目」值
     * @param val
     */
    WorkItemChildDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }

}
