package cn.ibizlab.plm.team.discusspost.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.attention.dto.AttentionDTO
import cn.ibizlab.plm.base.attachment.dto.AttachmentDTO
import cn.ibizlab.plm.base.comment.dto.CommentDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class DiscussPostDTO extends GroovyDTO<DiscussPostDTO> {

    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「是否已删除」
     * 字典[是否]
     */
    @JsonProperty("is_deleted")
    Integer isDeleted
    /**
     * 「关注」
     */
    @JsonProperty("attentions")
    List<AttentionDTO> attentions
    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
    /**
     * 「状态」
     * 字典[讨论状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「评论」
     */
    @JsonProperty("comments")
    List<CommentDTO> comments
    /**
     * 「热度」
     */
    @JsonProperty("heat")
    Integer heat
    /**
     * 「讨论回复数」
     */
    @JsonProperty("replies")
    String replies
    /**
     * 「关注数」
     */
    @JsonProperty("attention_count")
    String attentionCount
    /**
     * 「评论数」
     */
    @JsonProperty("comment_count")
    String commentCount
    /**
     * 「阅读次数」
     */
    @JsonProperty("read_count")
    String readCount
    /**
     * 「话题标识」
     */
    @JsonProperty("topic_identifier")
    String topicIdentifier
    /**
     * 「讨论内容」
     */
    @JsonProperty("content")
    String content
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
     * 「标题」
     */
    @JsonProperty("name")
    String name
    /**
     * 「话题标识」
     */
    @JsonProperty("topic_id")
    String topicId
    /**
     * 「话题」
     */
    @JsonProperty("topic_name")
    String topicName
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
     * 设置「编号」值
     * @param val
     */
    DiscussPostDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    DiscussPostDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「关注」值
     * @param val
     */
    DiscussPostDTO setAttentions(List<AttentionDTO> attentions) {
        this.attentions = attentions
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    DiscussPostDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「状态」值
     * 字典[讨论状态]
     * @param val
     */
    DiscussPostDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「评论」值
     * @param val
     */
    DiscussPostDTO setComments(List<CommentDTO> comments) {
        this.comments = comments
        return this
    }


    /**
     * 设置「热度」值
     * @param val
     */
    DiscussPostDTO setHeat(Integer heat) {
        this.heat = heat
        return this
    }


    /**
     * 设置「讨论回复数」值
     * @param val
     */
    DiscussPostDTO setReplies(String replies) {
        this.replies = replies
        return this
    }


    /**
     * 设置「关注数」值
     * @param val
     */
    DiscussPostDTO setAttentionCount(String attentionCount) {
        this.attentionCount = attentionCount
        return this
    }


    /**
     * 设置「评论数」值
     * @param val
     */
    DiscussPostDTO setCommentCount(String commentCount) {
        this.commentCount = commentCount
        return this
    }


    /**
     * 设置「阅读次数」值
     * @param val
     */
    DiscussPostDTO setReadCount(String readCount) {
        this.readCount = readCount
        return this
    }


    /**
     * 设置「话题标识」值
     * @param val
     */
    DiscussPostDTO setTopicIdentifier(String topicIdentifier) {
        this.topicIdentifier = topicIdentifier
        return this
    }


    /**
     * 设置「讨论内容」值
     * @param val
     */
    DiscussPostDTO setContent(String content) {
        this.content = content
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    DiscussPostDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    DiscussPostDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    DiscussPostDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    DiscussPostDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「话题标识」值
     * @param val
     */
    DiscussPostDTO setTopicId(String topicId) {
        this.topicId = topicId
        return this
    }


    /**
     * 设置「话题」值
     * @param val
     */
    DiscussPostDTO setTopicName(String topicName) {
        this.topicName = topicName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    DiscussPostDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DiscussPostDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
