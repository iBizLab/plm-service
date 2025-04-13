package cn.ibizlab.plm.team.discussreply.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.comment.dto.CommentDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class DiscussReplyDTO extends GroovyDTO<DiscussReplyDTO> {

    /**
     * 「评论」
     */
    @JsonProperty("comments")
    List<CommentDTO> comments
    /**
     * 「回复评论数」
     */
    @JsonProperty("reply_comment_num")
    String replyCommentNum
    /**
     * 「讨论名称」
     */
    @JsonProperty("discuss_name")
    String discussName
    /**
     * 「回复评论数」
     */
    @JsonProperty("comment_count")
    String commentCount
    /**
     * 「话题标识」
     */
    @JsonProperty("topic_id")
    String topicId
    /**
     * 「回复内容」
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
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「讨论标识」
     */
    @JsonProperty("post_id")
    String postId
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
     * 设置「评论」值
     * @param val
     */
    DiscussReplyDTO setComments(List<CommentDTO> comments) {
        this.comments = comments
        return this
    }


    /**
     * 设置「回复评论数」值
     * @param val
     */
    DiscussReplyDTO setReplyCommentNum(String replyCommentNum) {
        this.replyCommentNum = replyCommentNum
        return this
    }


    /**
     * 设置「讨论名称」值
     * @param val
     */
    DiscussReplyDTO setDiscussName(String discussName) {
        this.discussName = discussName
        return this
    }


    /**
     * 设置「回复评论数」值
     * @param val
     */
    DiscussReplyDTO setCommentCount(String commentCount) {
        this.commentCount = commentCount
        return this
    }


    /**
     * 设置「话题标识」值
     * @param val
     */
    DiscussReplyDTO setTopicId(String topicId) {
        this.topicId = topicId
        return this
    }


    /**
     * 设置「回复内容」值
     * @param val
     */
    DiscussReplyDTO setContent(String content) {
        this.content = content
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    DiscussReplyDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    DiscussReplyDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    DiscussReplyDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    DiscussReplyDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「讨论标识」值
     * @param val
     */
    DiscussReplyDTO setPostId(String postId) {
        this.postId = postId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    DiscussReplyDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DiscussReplyDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
