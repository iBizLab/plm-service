package cn.ibizlab.plm.extension.mcpservertagproxy

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.plm.extension.mcpservertagproxy.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MCPSERVERTAGPROXY]运行时对象
 * 此代码用户功能扩展代码
 *
 * 该实体存在实体映射或者自定义动态扩展对象，开启RTCode模式会导致映射功能失效
 */
class McpServerTagProxy extends GroovyDynaDataEntityRuntime<McpServerTagProxy,McpServerTagProxyDTO,McpServerTagProxyFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static McpServerTagProxy _instance
    void setInstance(McpServerTagProxy instance) {
        _instance = instance
    }
    static McpServerTagProxy getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CREATE)
    McpServerTagProxyDTO create(McpServerTagProxyDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, McpServerTagProxyDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    McpServerTagProxyDTO update(McpServerTagProxyDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, McpServerTagProxyDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    //@DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    //@DEAction(ACTION_GET)
    McpServerTagProxyDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, McpServerTagProxyDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    McpServerTagProxyDTO getDraft(McpServerTagProxyDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, McpServerTagProxyDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    int checkKey(McpServerTagProxyDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    McpServerTagProxyDTO save(McpServerTagProxyDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, McpServerTagProxyDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    Page<McpServerTagProxyDTO> fetchDefault(McpServerTagProxyFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, McpServerTagProxyDTO.class)
    }

}