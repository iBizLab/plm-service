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
class WorkItemCreatePlanSnapshotDTO extends GroovyDTO<WorkItemCreatePlanSnapshotDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「当前版本标识」
     */
    @JsonProperty("cur_version_id")
    String curVersionId

    /**
     * 设置「标识」值
     * @param val
     */
    WorkItemCreatePlanSnapshotDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    WorkItemCreatePlanSnapshotDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }

}
