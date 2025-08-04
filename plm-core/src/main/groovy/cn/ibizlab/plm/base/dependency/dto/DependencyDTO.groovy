package cn.ibizlab.plm.base.dependency.dto

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
class DependencyDTO extends GroovyDTO<DependencyDTO> {

    /**
     * 「重要程度」
     * 字典[通用重要程度]
     */
    @JsonProperty("level")
    String level
    /**
     * 「关联主体标识」
     */
    @JsonProperty("principal_id")
    String principalId
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「关联主体类型」
     */
    @JsonProperty("principal_type")
    String principalType
    /**
     * 「关联目标类型」
     */
    @JsonProperty("target_type")
    String targetType
    /**
     * 「目标主体标识」
     */
    @JsonProperty("target_id")
    String targetId
    /**
     * 「父对象版本标识」
     */
    @JsonProperty("parent_version_id")
    String parentVersionId
    /**
     * 「目标对象版本标识」
     */
    @JsonProperty("target_version_id")
    String targetVersionId
    /**
     * 「当前版本标识」
     */
    @JsonProperty("cur_version_id")
    String curVersionId
    /**
     * 「关联类型」
     */
    @JsonProperty("relation_type")
    String relationType
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
     * 设置「重要程度」值
     * 字典[通用重要程度]
     * @param val
     */
    DependencyDTO setLevel(String level) {
        this.level = level
        return this
    }


    /**
     * 设置「关联主体标识」值
     * @param val
     */
    DependencyDTO setPrincipalId(String principalId) {
        this.principalId = principalId
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    DependencyDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「关联主体类型」值
     * @param val
     */
    DependencyDTO setPrincipalType(String principalType) {
        this.principalType = principalType
        return this
    }


    /**
     * 设置「关联目标类型」值
     * @param val
     */
    DependencyDTO setTargetType(String targetType) {
        this.targetType = targetType
        return this
    }


    /**
     * 设置「目标主体标识」值
     * @param val
     */
    DependencyDTO setTargetId(String targetId) {
        this.targetId = targetId
        return this
    }


    /**
     * 设置「父对象版本标识」值
     * @param val
     */
    DependencyDTO setParentVersionId(String parentVersionId) {
        this.parentVersionId = parentVersionId
        return this
    }


    /**
     * 设置「目标对象版本标识」值
     * @param val
     */
    DependencyDTO setTargetVersionId(String targetVersionId) {
        this.targetVersionId = targetVersionId
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    DependencyDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }


    /**
     * 设置「关联类型」值
     * @param val
     */
    DependencyDTO setRelationType(String relationType) {
        this.relationType = relationType
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    DependencyDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    DependencyDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    DependencyDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    DependencyDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    DependencyDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DependencyDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
