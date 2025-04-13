package cn.ibizlab.plm.testmgmt.testcase.dto

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
class TestCaseMaintenanceDTO extends GroovyDTO<TestCaseMaintenanceDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「维护人」
     */
    @JsonProperty("maintenance_id")
    String maintenanceId
    /**
     * 「维护人」
     */
    @JsonProperty("maintenance_name")
    String maintenanceName

    /**
     * 设置「标识」值
     * @param val
     */
    TestCaseMaintenanceDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「维护人」值
     * @param val
     */
    TestCaseMaintenanceDTO setMaintenanceId(String maintenanceId) {
        this.maintenanceId = maintenanceId
        return this
    }


    /**
     * 设置「维护人」值
     * @param val
     */
    TestCaseMaintenanceDTO setMaintenanceName(String maintenanceName) {
        this.maintenanceName = maintenanceName
        return this
    }

}
