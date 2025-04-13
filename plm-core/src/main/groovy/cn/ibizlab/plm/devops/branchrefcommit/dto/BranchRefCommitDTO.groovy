package cn.ibizlab.plm.devops.branchrefcommit.dto

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
class BranchRefCommitDTO extends GroovyDTO<BranchRefCommitDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("meta_id")
    String metaId
    /**
     * 「仓库标识」
     */
    @JsonProperty("repository_id")
    String repositoryId
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
     * 「SHA值」
     */
    @JsonProperty("sha")
    String sha
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
     * 设置「标识」值
     * @param val
     */
    BranchRefCommitDTO setMetaId(String metaId) {
        this.metaId = metaId
        return this
    }


    /**
     * 设置「仓库标识」值
     * @param val
     */
    BranchRefCommitDTO setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    BranchRefCommitDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    BranchRefCommitDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    BranchRefCommitDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    BranchRefCommitDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「SHA值」值
     * @param val
     */
    BranchRefCommitDTO setSha(String sha) {
        this.sha = sha
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    BranchRefCommitDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    BranchRefCommitDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
