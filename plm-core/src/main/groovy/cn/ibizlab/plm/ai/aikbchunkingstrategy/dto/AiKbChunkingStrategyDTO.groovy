package cn.ibizlab.plm.ai.aikbchunkingstrategy.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.plm.ai.aikbchunkingstrategy.dto.AiKbChunkingStrategyRedactionRuleDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class AiKbChunkingStrategyDTO extends GroovyDTO<AiKbChunkingStrategyDTO> {

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
     * 「文本预处理规则」
     * 字典[通用文本清洗配置]
     */
    @JsonProperty("pre_process_rules")
    String preProcessRules
    /**
     * 「脱敏规则」
     */
    @JsonProperty("redaction_rules")
    List<AiKbChunkingStrategyRedactionRuleDTO> redactionRules
    /**
     * 「自动关键字」
     */
    @JsonProperty("auto_keywords")
    BigDecimal autoKeywords
    /**
     * 「自动问题」
     */
    @JsonProperty("auto_questions")
    BigDecimal autoQuestions
    /**
     * 「分块最大token数」
     */
    @JsonProperty("chunk_token_num")
    BigDecimal chunkTokenNum
    /**
     * 「分隔符」
     */
    @JsonProperty("delimiter")
    String delimiter
    /**
     * 「布局识别方式」
     */
    @JsonProperty("layout_recognize")
    String layoutRecognize
    /**
     * 「任务页面大小」
     */
    @JsonProperty("task_page_size")
    BigDecimal taskPageSize
    /**
     * 「RAPTOR设置」
     */
    @JsonProperty("raptor")
    IEntity raptor
    /**
     * 「Excel转HTML」
     * 字典[是否]
     */
    @JsonProperty("html4excel")
    Integer html4excel
    /**
     * 「图检索增强」
     */
    @JsonProperty("graphrag")
    IEntity graphrag
    /**
     * 「忽略文件图片」
     * 字典[是否]
     */
    @JsonProperty("ignore_parsing_image")
    Integer ignoreParsingImage
    /**
     * 「忽略文件链接引用」
     * 字典[是否]
     */
    @JsonProperty("ignore_parsing_oss_link")
    Integer ignoreParsingOssLink
    /**
     * 「片段展开提示词」
     */
    @JsonProperty("chunk_extraction_prompt")
    String chunkExtractionPrompt
    /**
     * 「片段展开子提示词」
     */
    @JsonProperty("chunk_extraction_sub_pnompt")
    String chunkExtractionSubPnompt
    /**
     * 「消除歧义提示词」
     */
    @JsonProperty("disambiguation_prompt")
    String disambiguationPrompt
    /**
     * 「消除歧义子提示词」
     */
    @JsonProperty("disambiguation_sub_prompt")
    String disambiguationSubPrompt
    /**
     * 「关系消歧提示词」
     */
    @JsonProperty("relation_disambiguation_prompt")
    String relationDisambiguationPrompt
    /**
     * 「关系消歧子提示词」
     */
    @JsonProperty("relation_disambiguation_sub_prompt")
    String relationDisambiguationSubPrompt
    /**
     * 「块重叠」
     */
    @JsonProperty("chunk_overlap")
    Integer chunkOverlap
    /**
     * 「块重叠」
     */
    @JsonProperty("chunk_overlap_num")
    Integer chunkOverlapNum
    /**
     * 「块大小」
     */
    @JsonProperty("chunk_size")
    Integer chunkSize
    /**
     * 「保留分隔符」
     * 字典[是否]
     */
    @JsonProperty("keep_separator")
    Integer keepSeparator
    /**
     * 「单文档最大块数」
     */
    @JsonProperty("max_chunk_count_per_doc")
    Integer maxChunkCountPerDoc
    /**
     * 「分隔符」
     */
    @JsonProperty("separator")
    String separator

    /**
     * 设置「标识」值
     * @param val
     */
    AiKbChunkingStrategyDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiKbChunkingStrategyDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「文本预处理规则」值
     * 字典[通用文本清洗配置]
     * @param val
     */
    AiKbChunkingStrategyDTO setPreProcessRules(String preProcessRules) {
        this.preProcessRules = preProcessRules
        return this
    }


    /**
     * 设置「脱敏规则」值
     * @param val
     */
    AiKbChunkingStrategyDTO setRedactionRules(List<AiKbChunkingStrategyRedactionRuleDTO> redactionRules) {
        this.redactionRules = redactionRules
        return this
    }


    /**
     * 设置「自动关键字」值
     * @param val
     */
    AiKbChunkingStrategyDTO setAutoKeywords(BigDecimal autoKeywords) {
        this.autoKeywords = autoKeywords
        return this
    }


    /**
     * 设置「自动问题」值
     * @param val
     */
    AiKbChunkingStrategyDTO setAutoQuestions(BigDecimal autoQuestions) {
        this.autoQuestions = autoQuestions
        return this
    }


    /**
     * 设置「分块最大token数」值
     * @param val
     */
    AiKbChunkingStrategyDTO setChunkTokenNum(BigDecimal chunkTokenNum) {
        this.chunkTokenNum = chunkTokenNum
        return this
    }


    /**
     * 设置「分隔符」值
     * @param val
     */
    AiKbChunkingStrategyDTO setDelimiter(String delimiter) {
        this.delimiter = delimiter
        return this
    }


    /**
     * 设置「布局识别方式」值
     * @param val
     */
    AiKbChunkingStrategyDTO setLayoutRecognize(String layoutRecognize) {
        this.layoutRecognize = layoutRecognize
        return this
    }


    /**
     * 设置「任务页面大小」值
     * @param val
     */
    AiKbChunkingStrategyDTO setTaskPageSize(BigDecimal taskPageSize) {
        this.taskPageSize = taskPageSize
        return this
    }


    /**
     * 设置「RAPTOR设置」值
     * @param val
     */
    AiKbChunkingStrategyDTO setRaptor(IEntity raptor) {
        this.raptor = raptor
        return this
    }


    /**
     * 设置「Excel转HTML」值
     * 字典[是否]
     * @param val
     */
    AiKbChunkingStrategyDTO setHtml4excel(Integer html4excel) {
        this.html4excel = html4excel
        return this
    }


    /**
     * 设置「图检索增强」值
     * @param val
     */
    AiKbChunkingStrategyDTO setGraphrag(IEntity graphrag) {
        this.graphrag = graphrag
        return this
    }


    /**
     * 设置「忽略文件图片」值
     * 字典[是否]
     * @param val
     */
    AiKbChunkingStrategyDTO setIgnoreParsingImage(Integer ignoreParsingImage) {
        this.ignoreParsingImage = ignoreParsingImage
        return this
    }


    /**
     * 设置「忽略文件链接引用」值
     * 字典[是否]
     * @param val
     */
    AiKbChunkingStrategyDTO setIgnoreParsingOssLink(Integer ignoreParsingOssLink) {
        this.ignoreParsingOssLink = ignoreParsingOssLink
        return this
    }


    /**
     * 设置「片段展开提示词」值
     * @param val
     */
    AiKbChunkingStrategyDTO setChunkExtractionPrompt(String chunkExtractionPrompt) {
        this.chunkExtractionPrompt = chunkExtractionPrompt
        return this
    }


    /**
     * 设置「片段展开子提示词」值
     * @param val
     */
    AiKbChunkingStrategyDTO setChunkExtractionSubPnompt(String chunkExtractionSubPnompt) {
        this.chunkExtractionSubPnompt = chunkExtractionSubPnompt
        return this
    }


    /**
     * 设置「消除歧义提示词」值
     * @param val
     */
    AiKbChunkingStrategyDTO setDisambiguationPrompt(String disambiguationPrompt) {
        this.disambiguationPrompt = disambiguationPrompt
        return this
    }


    /**
     * 设置「消除歧义子提示词」值
     * @param val
     */
    AiKbChunkingStrategyDTO setDisambiguationSubPrompt(String disambiguationSubPrompt) {
        this.disambiguationSubPrompt = disambiguationSubPrompt
        return this
    }


    /**
     * 设置「关系消歧提示词」值
     * @param val
     */
    AiKbChunkingStrategyDTO setRelationDisambiguationPrompt(String relationDisambiguationPrompt) {
        this.relationDisambiguationPrompt = relationDisambiguationPrompt
        return this
    }


    /**
     * 设置「关系消歧子提示词」值
     * @param val
     */
    AiKbChunkingStrategyDTO setRelationDisambiguationSubPrompt(String relationDisambiguationSubPrompt) {
        this.relationDisambiguationSubPrompt = relationDisambiguationSubPrompt
        return this
    }


    /**
     * 设置「块重叠」值
     * @param val
     */
    AiKbChunkingStrategyDTO setChunkOverlap(Integer chunkOverlap) {
        this.chunkOverlap = chunkOverlap
        return this
    }


    /**
     * 设置「块重叠」值
     * @param val
     */
    AiKbChunkingStrategyDTO setChunkOverlapNum(Integer chunkOverlapNum) {
        this.chunkOverlapNum = chunkOverlapNum
        return this
    }


    /**
     * 设置「块大小」值
     * @param val
     */
    AiKbChunkingStrategyDTO setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize
        return this
    }


    /**
     * 设置「保留分隔符」值
     * 字典[是否]
     * @param val
     */
    AiKbChunkingStrategyDTO setKeepSeparator(Integer keepSeparator) {
        this.keepSeparator = keepSeparator
        return this
    }


    /**
     * 设置「单文档最大块数」值
     * @param val
     */
    AiKbChunkingStrategyDTO setMaxChunkCountPerDoc(Integer maxChunkCountPerDoc) {
        this.maxChunkCountPerDoc = maxChunkCountPerDoc
        return this
    }


    /**
     * 设置「分隔符」值
     * @param val
     */
    AiKbChunkingStrategyDTO setSeparator(String separator) {
        this.separator = separator
        return this
    }

}
