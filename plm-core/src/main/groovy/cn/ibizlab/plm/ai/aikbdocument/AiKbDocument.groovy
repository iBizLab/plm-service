package cn.ibizlab.plm.ai.aikbdocument

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.ai.aikbdocument.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AI_KB_DOCUMENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AiKbDocument extends GroovyDynaDataEntityRuntime<AiKbDocument,AiKbDocumentDTO,AiKbDocumentFilterDTO> {

    public static final String ACTION_ASYNC_PARSE = "Async_parse"
    public static final String ACTION_ASYNC_RECHUNK = "Async_RECHUNK"
    public static final String ACTION_ASYNC_REINDEX = "Async_REINDEX"
    public static final String ACTION_CHUNK = "CHUNK"
    public static final String ACTION_EXTRACT_META_DATA = "extract_meta_data"
    public static final String ACTION_FILL_KB_CHUNK = "fill_kb_chunk"
    public static final String ACTION_PARSE = "parse"
    public static final String ACTION_RECHUNK = "RECHUNK"
    public static final String ACTION_REINDEX = "REINDEX"
    public static final String ACTION_REPARSE = "reparse"
    public static final String ACTION_UPDATE_STATUS = "UPDATE_STATUS"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_SIMPLE = "simple"
    public static final String DATASET_UNPARSED = "UNPARSED"
    private static AiKbDocument _instance
    void setInstance(AiKbDocument instance) {
        _instance = instance
    }
    static AiKbDocument getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AiKbDocumentDTO create(AiKbDocumentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AiKbDocumentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AiKbDocumentDTO update(AiKbDocumentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AiKbDocumentDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    AiKbDocumentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AiKbDocumentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AiKbDocumentDTO getDraft(AiKbDocumentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AiKbDocumentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AiKbDocumentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AiKbDocumentDTO save(AiKbDocumentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AiKbDocumentDTO.class)
    }

    /**
     * 行为：异步文档解析 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ASYNC_PARSE)
    def asyncParse(AiKbDocumentDTO dto) throws Throwable {
        return this.execute(ACTION_ASYNC_PARSE, dto, Object.class)
    }

    /**
     * 行为：异步重新切片 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ASYNC_RECHUNK)
    def asyncRechunk(AiKbDocumentDTO dto) throws Throwable {
        return this.execute(ACTION_ASYNC_RECHUNK, dto, Object.class)
    }

    /**
     * 行为：异步重新索引 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ASYNC_REINDEX)
    def asyncReindex(AiKbDocumentDTO dto) throws Throwable {
        return this.execute(ACTION_ASYNC_REINDEX, dto, Object.class)
    }

    /**
     * 行为：切片 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHUNK)
    def chunk(AiKbDocumentDTO dto) throws Throwable {
        this.execute(ACTION_CHUNK, dto, AiKbDocumentDTO.class)
    }

    /**
     * 行为：提取元数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_EXTRACT_META_DATA)
    def extractMetaData(AiKbDocumentDTO dto) throws Throwable {
        return this.execute(ACTION_EXTRACT_META_DATA, dto, AiKbDocumentDTO.class)
    }

    /**
     * 行为：填充知识库切片策略 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILL_KB_CHUNK)
    def fillKbChunk(AiKbDocumentDTO dto) throws Throwable {
        this.execute(ACTION_FILL_KB_CHUNK, dto, AiKbDocumentDTO.class)
    }

    /**
     * 行为：文档解析处理 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PARSE)
    def parse(AiKbDocumentDTO dto) throws Throwable {
        this.execute(ACTION_PARSE, dto, AiKbDocumentDTO.class)
    }

    /**
     * 行为：重新切片 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECHUNK)
    def rechunk(AiKbDocumentDTO dto) throws Throwable {
        this.execute(ACTION_RECHUNK, dto, AiKbDocumentDTO.class)
    }

    /**
     * 行为：重新索引 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_REINDEX)
    def reindex(AiKbDocumentDTO dto) throws Throwable {
        this.execute(ACTION_REINDEX, dto, AiKbDocumentDTO.class)
    }

    /**
     * 行为：文档重新解析 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_REPARSE)
    def reparse(AiKbDocumentDTO dto) throws Throwable {
        this.execute(ACTION_REPARSE, dto, AiKbDocumentDTO.class)
    }

    /**
     * 行为：更新状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE_STATUS)
    def updateStatus(AiKbDocumentDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE_STATUS, dto, AiKbDocumentDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AiKbDocumentDTO> fetchDefault(AiKbDocumentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AiKbDocumentDTO.class)
    }

    /**
     * 数据集：简单查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SIMPLE)
    Page<AiKbDocumentSimpleDTO> fetchSimple(AiKbDocumentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SIMPLE, context, AiKbDocumentSimpleDTO.class)
    }

    /**
     * 数据集：未解析文档 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_UNPARSED)
    Page<AiKbDocumentDTO> fetchUnparsed(AiKbDocumentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_UNPARSED, context, AiKbDocumentDTO.class)
    }

}