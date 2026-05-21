package cn.ibizlab.plm.wiki.articlepage.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.base.attachment.dto.AttachmentDTO
import cn.ibizlab.plm.base.attention.dto.AttentionDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ArticlePageDTO extends GroovyDTO<ArticlePageDTO> {

    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「是否开启共享」
     * 字典[是否]
     */
    @JsonProperty("is_shared")
    String isShared
    /**
     * 「共享有效期」
     */
    @JsonProperty("expiration_date")
    Timestamp expirationDate
    /**
     * 「访问密码」
     */
    @JsonProperty("access_password")
    String accessPassword
    /**
     * 「正文格式」
     * 字典[内容格式选择]
     */
    @JsonProperty("format_type")
    String formatType
    /**
     * 「序号」
     */
    @JsonProperty("sequence")
    BigDecimal sequence
    /**
     * 「正文」
     */
    @JsonProperty("content")
    String content
    /**
     * 「类型」
     * 字典[页面类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「是否星标」
     * 字典[是否]
     */
    @JsonProperty("is_favorite")
    String isFavorite
    /**
     * 「是否叶子节点」
     * 字典[是否]
     */
    @JsonProperty("is_leaf")
    Integer isLeaf
    /**
     * 「类别路径」
     */
    @JsonProperty("categories")
    String categories
    /**
     * 「空间编号」
     */
    @JsonProperty("space_identifier")
    String spaceIdentifier
    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
    /**
     * 「是否已归档」
     * 字典[是否]
     */
    @JsonProperty("is_archived")
    Integer isArchived
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
     * 「当前版本标识」
     */
    @JsonProperty("cur_version_id")
    String curVersionId
    /**
     * 「当前版本名称」
     */
    @JsonProperty("cur_version_name")
    String curVersionName
    /**
     * 「发布时间」
     */
    @JsonProperty("publish_time")
    Timestamp publishTime
    /**
     * 「是否发布」
     * 字典[是否]
     */
    @JsonProperty("is_published")
    Integer isPublished
    /**
     * 「发布人」
     */
    @JsonProperty("publish_man")
    String publishMan
    /**
     * 「发布正文」
     */
    @JsonProperty("publish_content")
    String publishContent
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「发布主题」
     */
    @JsonProperty("publish_name")
    String publishName
    /**
     * 「发布状态」
     * 字典[是否]
     */
    @JsonProperty("published")
    Integer published
    /**
     * 「是否锁定」
     * 字典[是否]
     */
    @JsonProperty("is_lock")
    Integer isLock
    /**
     * 「图标」
     */
    @JsonProperty("icon")
    String icon
    /**
     * 「是否同时共享子页面」
     * 字典[是否]
     */
    @JsonProperty("is_shared_subset")
    String isSharedSubset
    /**
     * 「共享只读能力」
     */
    @JsonProperty("read_shared")
    String readShared
    /**
     * 「共享人」
     */
    @JsonProperty("shared_by")
    String sharedBy
    /**
     * 「共享时间」
     */
    @JsonProperty("shared_time")
    Timestamp sharedTime
    /**
     * 「评审结果」
     * 字典[评审结果]
     */
    @JsonProperty("review_result_state")
    String reviewResultState
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
     * 「选择版本标识」
     */
    @JsonProperty("choose_version_id")
    String chooseVersionId
    /**
     * 「选择版本名称」
     */
    @JsonProperty("choose_version_name")
    String chooseVersionName
    /**
     * 「最近创建日期」
     */
    @JsonProperty("recent_create_days")
    Integer recentCreateDays
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
     * 「主题」
     */
    @JsonProperty("name")
    String name
    /**
     * 「父页面标识」
     */
    @JsonProperty("parent_id")
    String parentId
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
     * 「用户标记」
     */
    @JsonProperty("user_tag")
    String userTag
    /**
     * 「用户标记2」
     */
    @JsonProperty("user_tag2")
    String userTag2

    /**
     * 设置「编号」值
     * @param val
     */
    ArticlePageDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「是否开启共享」值
     * 字典[是否]
     * @param val
     */
    ArticlePageDTO setIsShared(String isShared) {
        this.isShared = isShared
        return this
    }


    /**
     * 设置「共享有效期」值
     * @param val
     */
    ArticlePageDTO setExpirationDate(Timestamp expirationDate) {
        this.expirationDate = expirationDate
        return this
    }


    /**
     * 设置「访问密码」值
     * @param val
     */
    ArticlePageDTO setAccessPassword(String accessPassword) {
        this.accessPassword = accessPassword
        return this
    }


    /**
     * 设置「正文格式」值
     * 字典[内容格式选择]
     * @param val
     */
    ArticlePageDTO setFormatType(String formatType) {
        this.formatType = formatType
        return this
    }


    /**
     * 设置「序号」值
     * @param val
     */
    ArticlePageDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「正文」值
     * @param val
     */
    ArticlePageDTO setContent(String content) {
        this.content = content
        return this
    }


    /**
     * 设置「类型」值
     * 字典[页面类型]
     * @param val
     */
    ArticlePageDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「是否星标」值
     * 字典[是否]
     * @param val
     */
    ArticlePageDTO setIsFavorite(String isFavorite) {
        this.isFavorite = isFavorite
        return this
    }


    /**
     * 设置「是否叶子节点」值
     * 字典[是否]
     * @param val
     */
    ArticlePageDTO setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf
        return this
    }


    /**
     * 设置「类别路径」值
     * @param val
     */
    ArticlePageDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「空间编号」值
     * @param val
     */
    ArticlePageDTO setSpaceIdentifier(String spaceIdentifier) {
        this.spaceIdentifier = spaceIdentifier
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    ArticlePageDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「是否已归档」值
     * 字典[是否]
     * @param val
     */
    ArticlePageDTO setIsArchived(Integer isArchived) {
        this.isArchived = isArchived
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    ArticlePageDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「关注」值
     * @param val
     */
    ArticlePageDTO setAttentions(List<AttentionDTO> attentions) {
        this.attentions = attentions
        return this
    }


    /**
     * 设置「当前版本标识」值
     * @param val
     */
    ArticlePageDTO setCurVersionId(String curVersionId) {
        this.curVersionId = curVersionId
        return this
    }


    /**
     * 设置「当前版本名称」值
     * @param val
     */
    ArticlePageDTO setCurVersionName(String curVersionName) {
        this.curVersionName = curVersionName
        return this
    }


    /**
     * 设置「发布时间」值
     * @param val
     */
    ArticlePageDTO setPublishTime(Timestamp publishTime) {
        this.publishTime = publishTime
        return this
    }


    /**
     * 设置「是否发布」值
     * 字典[是否]
     * @param val
     */
    ArticlePageDTO setIsPublished(Integer isPublished) {
        this.isPublished = isPublished
        return this
    }


    /**
     * 设置「发布人」值
     * @param val
     */
    ArticlePageDTO setPublishMan(String publishMan) {
        this.publishMan = publishMan
        return this
    }


    /**
     * 设置「发布正文」值
     * @param val
     */
    ArticlePageDTO setPublishContent(String publishContent) {
        this.publishContent = publishContent
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    ArticlePageDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「发布主题」值
     * @param val
     */
    ArticlePageDTO setPublishName(String publishName) {
        this.publishName = publishName
        return this
    }


    /**
     * 设置「发布状态」值
     * 字典[是否]
     * @param val
     */
    ArticlePageDTO setPublished(Integer published) {
        this.published = published
        return this
    }


    /**
     * 设置「是否锁定」值
     * 字典[是否]
     * @param val
     */
    ArticlePageDTO setIsLock(Integer isLock) {
        this.isLock = isLock
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    ArticlePageDTO setIcon(String icon) {
        this.icon = icon
        return this
    }


    /**
     * 设置「是否同时共享子页面」值
     * 字典[是否]
     * @param val
     */
    ArticlePageDTO setIsSharedSubset(String isSharedSubset) {
        this.isSharedSubset = isSharedSubset
        return this
    }


    /**
     * 设置「共享只读能力」值
     * @param val
     */
    ArticlePageDTO setReadShared(String readShared) {
        this.readShared = readShared
        return this
    }


    /**
     * 设置「共享人」值
     * @param val
     */
    ArticlePageDTO setSharedBy(String sharedBy) {
        this.sharedBy = sharedBy
        return this
    }


    /**
     * 设置「共享时间」值
     * @param val
     */
    ArticlePageDTO setSharedTime(Timestamp sharedTime) {
        this.sharedTime = sharedTime
        return this
    }


    /**
     * 设置「评审结果」值
     * 字典[评审结果]
     * @param val
     */
    ArticlePageDTO setReviewResultState(String reviewResultState) {
        this.reviewResultState = reviewResultState
        return this
    }


    /**
     * 设置「关注数」值
     * @param val
     */
    ArticlePageDTO setAttentionCount(String attentionCount) {
        this.attentionCount = attentionCount
        return this
    }


    /**
     * 设置「评论数」值
     * @param val
     */
    ArticlePageDTO setCommentCount(String commentCount) {
        this.commentCount = commentCount
        return this
    }


    /**
     * 设置「选择版本标识」值
     * @param val
     */
    ArticlePageDTO setChooseVersionId(String chooseVersionId) {
        this.chooseVersionId = chooseVersionId
        return this
    }


    /**
     * 设置「选择版本名称」值
     * @param val
     */
    ArticlePageDTO setChooseVersionName(String chooseVersionName) {
        this.chooseVersionName = chooseVersionName
        return this
    }


    /**
     * 设置「最近创建日期」值
     * @param val
     */
    ArticlePageDTO setRecentCreateDays(Integer recentCreateDays) {
        this.recentCreateDays = recentCreateDays
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ArticlePageDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ArticlePageDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ArticlePageDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「主题」值
     * @param val
     */
    ArticlePageDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「父页面标识」值
     * @param val
     */
    ArticlePageDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「空间标识」值
     * @param val
     */
    ArticlePageDTO setSpaceId(String spaceId) {
        this.spaceId = spaceId
        return this
    }


    /**
     * 设置「空间名称」值
     * @param val
     */
    ArticlePageDTO setSpaceName(String spaceName) {
        this.spaceName = spaceName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ArticlePageDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ArticlePageDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「用户标记」值
     * @param val
     */
    ArticlePageDTO setUserTag(String userTag) {
        this.userTag = userTag
        return this
    }


    /**
     * 设置「用户标记2」值
     * @param val
     */
    ArticlePageDTO setUserTag2(String userTag2) {
        this.userTag2 = userTag2
        return this
    }

}
