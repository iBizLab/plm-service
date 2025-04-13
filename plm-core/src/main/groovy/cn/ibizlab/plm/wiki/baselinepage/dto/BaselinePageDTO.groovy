package cn.ibizlab.plm.wiki.baselinepage.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.version.dto.VersionDTO
import cn.ibizlab.plm.base.baseline.dto.BaselineDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class BaselinePageDTO extends GroovyDTO<BaselinePageDTO> {

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
     * 「关联目标标识」
     */
    @JsonProperty("target_id")
    String targetId
    /**
     * 「目标对象版本标识」
     */
    @JsonProperty("target_version_id")
    String targetVersionId
    /**
     * 「页面类型」
     * 字典[页面类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「关联目标版本」
     */
    @JsonProperty("target_version")
    VersionDTO targetVersion
    /**
     * 「基线」
     */
    @JsonProperty("baseline")
    BaselineDTO baseline
    /**
     * 「空间标识」
     */
    @JsonProperty("space_id")
    String spaceId
    /**
     * 「当前版本标识」
     */
    @JsonProperty("cur_version_id")
    String curVersionId
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
     * 设置「关联主体标识」值
     * @param val
     */
    BaselinePageDTO setPrincipalId(String principalId) {
        this.principalId = principalId
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    BaselinePageDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「关联主体类型」值
     * @param val
     */
    BaselinePageDTO setPrincipalType(String principalType) {
        this.principalType = principalType
        return this
    }


    /**
     * 设置「关联目标类型」值
     * @param val
     */
    BaselinePageDTO setTargetType(String targetType) {
        this.targetType = targetType
        return this
    }


    /**
     * 设置「关联目标标识」值
     * @param val
     */
    BaselinePageDTO setTargetId(String targetId) {
        this.targetId = targetId
        return this
    }


    /**
     * 设置「目标对象版本标识」值
     * @param val
     */
    BaselinePageDTO setTargetVersionId(String targetVersionId) {
        this.targetVersionId = targetVersionId
        return this
    }


    /**
     * 设置「页面类型」值
     * 字典[页面类型]
     * @param val
     */
    BaselinePageDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「关联目标版本」值
     * @param val
     */
    BaselinePageDTO setTargetVersion(VersionDTO targetVersion) {
        this.targetVersion = targetVersion
        return this
    }


    /**
     * 设置「基线」值
     * @param val
     */
    BaselinePageDTO setBaseline(BaselineDTO baseline) {
        this.baseline = baseline
        return this
    }


    /**
     * 设置「空间标识」值
     * @param val
     */
    BaselinePageDTO setSpaceId(String spaceId) {
        this.spaceId = spaceId
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    BaselinePageDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    BaselinePageDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    BaselinePageDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    BaselinePageDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    BaselinePageDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    BaselinePageDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    BaselinePageDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
