package cn.ibizlab.plm.projmgmt.board

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.projmgmt.board.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[BOARD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Board extends GroovyDataEntityRuntime<Board,BoardDTO,BoardFilterDTO> {

    public static final String ACTION_CHECK_BOARD_IS_DELETED = "check_board_is_deleted"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_BOARD_UPLOAD = "cur_board_upload"
    public static final String DATASET_CUR_PROJECT_BOARD = "cur_project_board"
    public static final String DATASET_READER = "reader"
    private static Board _instance
    void setInstance(Board instance) {
        _instance = instance
    }
    static Board getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    BoardDTO create(BoardDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, BoardDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    BoardDTO update(BoardDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, BoardDTO.class)
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
    BoardDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, BoardDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    BoardDTO getDraft(BoardDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, BoardDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(BoardDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    BoardDTO save(BoardDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, BoardDTO.class)
    }

    /**
     * 行为：拷贝 实际功能 BoardCopyDEActionRuntime
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COPY)
    def copy(BoardDTO dto) throws Throwable {
        this.execute(ACTION_COPY, dto, BoardDTO.class)
    }

    /**
     * 行为：判断看板是否已删除 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECK_BOARD_IS_DELETED)
    def checkBoardIsDeleted(BoardDTO dto) throws Throwable {
        this.execute(ACTION_CHECK_BOARD_IS_DELETED, dto, BoardDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<BoardDTO> fetchDefault(BoardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, BoardDTO.class)
    }

    /**
     * 数据集：当前项目看板（导入） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_BOARD_UPLOAD)
    Page<BoardDTO> fetchCurBoardUpload(BoardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_BOARD_UPLOAD, context, BoardDTO.class)
    }

    /**
     * 数据集：当前项目下看板 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_PROJECT_BOARD)
    Page<BoardDTO> fetchCurProjectBoard(BoardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_PROJECT_BOARD, context, BoardDTO.class)
    }

    /**
     * 数据集：只读用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_READER)
    Page<BoardDTO> fetchReader(BoardFilterDTO context) throws Throwable {
        return this.fetch(DATASET_READER, context, BoardDTO.class)
    }

}