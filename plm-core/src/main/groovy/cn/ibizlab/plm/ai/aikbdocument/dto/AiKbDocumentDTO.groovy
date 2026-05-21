package cn.ibizlab.plm.ai.aikbdocument.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.ai.aikbchunkingstrategy.dto.AiKbChunkingStrategyDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class AiKbDocumentDTO extends GroovyDTO<AiKbDocumentDTO> {

    /**
     * 「知识库文档标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「知识库文档名称」
     */
    @JsonProperty("name")
    String name
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
     * 「是否启用」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「知识库标识」
     */
    @JsonProperty("kb_id")
    String kbId
    /**
     * 「文档同步标识」
     */
    @JsonProperty("sync_id")
    String syncId
    /**
     * 「切片方法」
     * 字典[切片策略]
     */
    @JsonProperty("chunk_method")
    String chunkMethod
    /**
     * 「同步频率」
     * 字典[知识库同步频率]
     */
    @JsonProperty("sync_frequency")
    String syncFrequency
    /**
     * 「源类型」
     * 字典[最近访问]
     */
    @JsonProperty("source_type")
    String sourceType
    /**
     * 「源标识」
     */
    @JsonProperty("source_id")
    String sourceId
    /**
     * 「文档类型」
     * 字典[知识库文档类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「上传文件」
     */
    @JsonProperty("file")
    String file
    /**
     * 「文档元数据」
     */
    @JsonProperty("meta_data")
    String metaData
    /**
     * 「状态」
     * 字典[文档切片状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「切片数量」
     */
    @JsonProperty("chunk_num")
    BigDecimal chunkNum
    /**
     * 「内容大小」
     */
    @JsonProperty("size")
    BigDecimal size
    /**
     * 「文件类型」
     * 字典[文件类型]
     */
    @JsonProperty("file_type")
    String fileType
    /**
     * 「自定义切片」
     * 字典[自定义切片]
     */
    @JsonProperty("custom_chunk")
    Integer customChunk
    /**
     * 「解析配置」
     */
    @JsonProperty("parser_config")
    AiKbChunkingStrategyDTO parserConfig
    /**
     * 「解析内容」
     */
    @JsonProperty("parsed_content")
    String parsedContent
    /**
     * 「错误信息」
     */
    @JsonProperty("parse_error")
    String parseError
    /**
     * 「标签集」
     * 字典[知识库标签集]
     */
    @JsonProperty("tag_sets")
    String tagSets
    /**
     * 「参考引用」
     */
    @JsonProperty("references")
    List<IEntity> references
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
     * 设置「知识库文档标识」值
     * @param val
     */
    AiKbDocumentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「知识库文档名称」值
     * @param val
     */
    AiKbDocumentDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbDocumentDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AiKbDocumentDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbDocumentDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKbDocumentDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「是否启用」值
     * 字典[是否]
     * @param val
     */
    AiKbDocumentDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「知识库标识」值
     * @param val
     */
    AiKbDocumentDTO setKbId(String kbId) {
        this.kbId = kbId
        return this
    }


    /**
     * 设置「文档同步标识」值
     * @param val
     */
    AiKbDocumentDTO setSyncId(String syncId) {
        this.syncId = syncId
        return this
    }


    /**
     * 设置「切片方法」值
     * 字典[切片策略]
     * @param val
     */
    AiKbDocumentDTO setChunkMethod(String chunkMethod) {
        this.chunkMethod = chunkMethod
        return this
    }


    /**
     * 设置「同步频率」值
     * 字典[知识库同步频率]
     * @param val
     */
    AiKbDocumentDTO setSyncFrequency(String syncFrequency) {
        this.syncFrequency = syncFrequency
        return this
    }


    /**
     * 设置「源类型」值
     * 字典[最近访问]
     * @param val
     */
    AiKbDocumentDTO setSourceType(String sourceType) {
        this.sourceType = sourceType
        return this
    }


    /**
     * 设置「源标识」值
     * @param val
     */
    AiKbDocumentDTO setSourceId(String sourceId) {
        this.sourceId = sourceId
        return this
    }


    /**
     * 设置「文档类型」值
     * 字典[知识库文档类型]
     * @param val
     */
    AiKbDocumentDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「上传文件」值
     * @param val
     */
    AiKbDocumentDTO setFile(String file) {
        this.file = file
        return this
    }


    /**
     * 设置「文档元数据」值
     * @param val
     */
    AiKbDocumentDTO setMetaData(String metaData) {
        this.metaData = metaData
        return this
    }


    /**
     * 设置「状态」值
     * 字典[文档切片状态]
     * @param val
     */
    AiKbDocumentDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「切片数量」值
     * @param val
     */
    AiKbDocumentDTO setChunkNum(BigDecimal chunkNum) {
        this.chunkNum = chunkNum
        return this
    }


    /**
     * 设置「内容大小」值
     * @param val
     */
    AiKbDocumentDTO setSize(BigDecimal size) {
        this.size = size
        return this
    }


    /**
     * 设置「文件类型」值
     * 字典[文件类型]
     * @param val
     */
    AiKbDocumentDTO setFileType(String fileType) {
        this.fileType = fileType
        return this
    }


    /**
     * 设置「自定义切片」值
     * 字典[自定义切片]
     * @param val
     */
    AiKbDocumentDTO setCustomChunk(Integer customChunk) {
        this.customChunk = customChunk
        return this
    }


    /**
     * 设置「解析配置」值
     * @param val
     */
    AiKbDocumentDTO setParserConfig(AiKbChunkingStrategyDTO parserConfig) {
        this.parserConfig = parserConfig
        return this
    }


    /**
     * 设置「解析内容」值
     * @param val
     */
    AiKbDocumentDTO setParsedContent(String parsedContent) {
        this.parsedContent = parsedContent
        return this
    }


    /**
     * 设置「错误信息」值
     * @param val
     */
    AiKbDocumentDTO setParseError(String parseError) {
        this.parseError = parseError
        return this
    }


    /**
     * 设置「标签集」值
     * 字典[知识库标签集]
     * @param val
     */
    AiKbDocumentDTO setTagSets(String tagSets) {
        this.tagSets = tagSets
        return this
    }


    /**
     * 设置「参考引用」值
     * @param val
     */
    AiKbDocumentDTO setReferences(List<IEntity> references) {
        this.references = references
        return this
    }


    /**
     * 设置「用户标记」值
     * @param val
     */
    AiKbDocumentDTO setUserTag(String userTag) {
        this.userTag = userTag
        return this
    }


    /**
     * 设置「用户标记2」值
     * @param val
     */
    AiKbDocumentDTO setUserTag2(String userTag2) {
        this.userTag2 = userTag2
        return this
    }

}
