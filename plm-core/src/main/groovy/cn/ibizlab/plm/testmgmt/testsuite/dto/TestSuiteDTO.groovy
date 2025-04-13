package cn.ibizlab.plm.testmgmt.testsuite.dto

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
class TestSuiteDTO extends GroovyDTO<TestSuiteDTO> {

    /**
     * 「序号」
     */
    @JsonProperty("sequence")
    BigDecimal sequence
    /**
     * 「模块路径」
     */
    @JsonProperty("suites")
    String suites
    /**
     * 「是否叶子节点」
     * 字典[是否]
     */
    @JsonProperty("is_leaf")
    Integer isLeaf
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
     * 「测试库标识」
     */
    @JsonProperty("library_id")
    String libraryId
    /**
     * 「测试库名称」
     */
    @JsonProperty("library_name")
    String libraryName
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「父标识」
     */
    @JsonProperty("pid")
    String pid
    /**
     * 「名称」
     */
    @JsonProperty("pname")
    String pname
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
    TestSuiteDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「模块路径」值
     * @param val
     */
    TestSuiteDTO setSuites(String suites) {
        this.suites = suites
        return this
    }


    /**
     * 设置「是否叶子节点」值
     * 字典[是否]
     * @param val
     */
    TestSuiteDTO setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    TestSuiteDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    TestSuiteDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    TestSuiteDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「测试库标识」值
     * @param val
     */
    TestSuiteDTO setLibraryId(String libraryId) {
        this.libraryId = libraryId
        return this
    }


    /**
     * 设置「测试库名称」值
     * @param val
     */
    TestSuiteDTO setLibraryName(String libraryName) {
        this.libraryName = libraryName
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    TestSuiteDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    TestSuiteDTO setPid(String pid) {
        this.pid = pid
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    TestSuiteDTO setPname(String pname) {
        this.pname = pname
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    TestSuiteDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    TestSuiteDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
