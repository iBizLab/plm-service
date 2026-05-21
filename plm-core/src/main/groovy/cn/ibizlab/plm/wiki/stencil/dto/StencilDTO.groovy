package cn.ibizlab.plm.wiki.stencil.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.attachment.dto.AttachmentDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class StencilDTO extends GroovyDTO<StencilDTO> {

    /**
     * 「正文格式」
     * 字典[内容输出格式]
     */
    @JsonProperty("format_type")
    String formatType
    /**
     * 「正文」
     */
    @JsonProperty("content")
    String content
    /**
     * 「全局模板」
     * 字典[是否]
     */
    @JsonProperty("is_global")
    Integer isGlobal
    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
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
     * 「空间标识」
     */
    @JsonProperty("space_id")
    String spaceId
    /**
     * 「空间名称」
     */
    @JsonProperty("space_name")
    String spaceName
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
     * 设置「正文格式」值
     * 字典[内容输出格式]
     * @param val
     */
    StencilDTO setFormatType(String formatType) {
        this.formatType = formatType
        return this
    }


    /**
     * 设置「正文」值
     * @param val
     */
    StencilDTO setContent(String content) {
        this.content = content
        return this
    }


    /**
     * 设置「全局模板」值
     * 字典[是否]
     * @param val
     */
    StencilDTO setIsGlobal(Integer isGlobal) {
        this.isGlobal = isGlobal
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    StencilDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    StencilDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    StencilDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    StencilDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    StencilDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「空间标识」值
     * @param val
     */
    StencilDTO setSpaceId(String spaceId) {
        this.spaceId = spaceId
        return this
    }


    /**
     * 设置「空间名称」值
     * @param val
     */
    StencilDTO setSpaceName(String spaceName) {
        this.spaceName = spaceName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    StencilDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    StencilDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
