package cn.ibizlab.plm.ai.aikbdocumentwizard.dto

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
class AiKbDocumentWizardDTO extends GroovyDTO<AiKbDocumentWizardDTO> {

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
     * 「逻辑有效标识」
     */
    @JsonProperty("enable")
    Integer enable
    /**
     * 「创建人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「创建时间」
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
     * 「导入方式」
     * 字典[导入方式]
     */
    @JsonProperty("import_method")
    String importMethod
    /**
     * 「同步频率」
     * 字典[知识库同步频率]
     */
    @JsonProperty("sync_frequency")
    String syncFrequency
    /**
     * 「知识库标识」
     */
    @JsonProperty("kb_id")
    String kbId
    /**
     * 「选择文件」
     */
    @JsonProperty("selection_file_ids")
    String selectionFileIds
    /**
     * 「选择页面」
     */
    @JsonProperty("selection_page_ids")
    String selectionPageIds
    /**
     * 「选择空间」
     * 字典[空间列表]
     */
    @JsonProperty("space_selection")
    String spaceSelection
    /**
     * 「解析配置」
     */
    @JsonProperty("parser_config")
    AiKbChunkingStrategyDTO parserConfig
    /**
     * 「已选择文件」
     */
    @JsonProperty("selected_file_name")
    List<IEntity> selectedFileName
    /**
     * 「已选择页面」
     */
    @JsonProperty("selected_page_name")
    List<IEntity> selectedPageName
    /**
     * 「自定义切片」
     * 字典[自定义切片]
     */
    @JsonProperty("custom_chunk")
    Integer customChunk
    /**
     * 「切片方法」
     * 字典[切片策略]
     */
    @JsonProperty("chunk_method")
    String chunkMethod

    /**
     * 设置「标识」值
     * @param val
     */
    AiKbDocumentWizardDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AiKbDocumentWizardDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「逻辑有效标识」值
     * @param val
     */
    AiKbDocumentWizardDTO setEnable(Integer enable) {
        this.enable = enable
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbDocumentWizardDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AiKbDocumentWizardDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AiKbDocumentWizardDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AiKbDocumentWizardDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「导入方式」值
     * 字典[导入方式]
     * @param val
     */
    AiKbDocumentWizardDTO setImportMethod(String importMethod) {
        this.importMethod = importMethod
        return this
    }


    /**
     * 设置「同步频率」值
     * 字典[知识库同步频率]
     * @param val
     */
    AiKbDocumentWizardDTO setSyncFrequency(String syncFrequency) {
        this.syncFrequency = syncFrequency
        return this
    }


    /**
     * 设置「知识库标识」值
     * @param val
     */
    AiKbDocumentWizardDTO setKbId(String kbId) {
        this.kbId = kbId
        return this
    }


    /**
     * 设置「选择文件」值
     * @param val
     */
    AiKbDocumentWizardDTO setSelectionFileIds(String selectionFileIds) {
        this.selectionFileIds = selectionFileIds
        return this
    }


    /**
     * 设置「选择页面」值
     * @param val
     */
    AiKbDocumentWizardDTO setSelectionPageIds(String selectionPageIds) {
        this.selectionPageIds = selectionPageIds
        return this
    }


    /**
     * 设置「选择空间」值
     * 字典[空间列表]
     * @param val
     */
    AiKbDocumentWizardDTO setSpaceSelection(String spaceSelection) {
        this.spaceSelection = spaceSelection
        return this
    }


    /**
     * 设置「解析配置」值
     * @param val
     */
    AiKbDocumentWizardDTO setParserConfig(AiKbChunkingStrategyDTO parserConfig) {
        this.parserConfig = parserConfig
        return this
    }


    /**
     * 设置「已选择文件」值
     * @param val
     */
    AiKbDocumentWizardDTO setSelectedFileName(List<IEntity> selectedFileName) {
        this.selectedFileName = selectedFileName
        return this
    }


    /**
     * 设置「已选择页面」值
     * @param val
     */
    AiKbDocumentWizardDTO setSelectedPageName(List<IEntity> selectedPageName) {
        this.selectedPageName = selectedPageName
        return this
    }


    /**
     * 设置「自定义切片」值
     * 字典[自定义切片]
     * @param val
     */
    AiKbDocumentWizardDTO setCustomChunk(Integer customChunk) {
        this.customChunk = customChunk
        return this
    }


    /**
     * 设置「切片方法」值
     * 字典[切片策略]
     * @param val
     */
    AiKbDocumentWizardDTO setChunkMethod(String chunkMethod) {
        this.chunkMethod = chunkMethod
        return this
    }

}
