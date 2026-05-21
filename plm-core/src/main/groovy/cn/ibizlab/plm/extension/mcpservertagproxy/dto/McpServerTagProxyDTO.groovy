package cn.ibizlab.plm.extension.mcpservertagproxy.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class McpServerTagProxyDTO extends GroovyDTO<McpServerTagProxyDTO> {

    /**
     * 「服务标记」
     */
    @JsonProperty("servertag")
    String serverTag
    /**
     * 「建立时间」
     */
    @JsonProperty("createdate")
    Timestamp createDate
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("createman")
    String createMan
    /**
     * 「MCP服务标记代理标识」
     */
    @JsonProperty("mcpservertagproxyid")
    String mcpServerTagProxyId
    /**
     * 「MCP服务标记代理名称」
     */
    @JsonProperty("mcpservertagproxyname")
    String mcpServerTagProxyName
    /**
     * 「更新时间」
     */
    @JsonProperty("updatedate")
    Timestamp updateDate
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("updateman")
    String updateMan

    /**
     * 设置「服务标记」值
     * @param val
     */
    McpServerTagProxyDTO setServerTag(String serverTag) {
        this.serverTag = serverTag
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    McpServerTagProxyDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    McpServerTagProxyDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「MCP服务标记代理标识」值
     * @param val
     */
    McpServerTagProxyDTO setMcpServerTagProxyId(String mcpServerTagProxyId) {
        this.mcpServerTagProxyId = mcpServerTagProxyId
        return this
    }


    /**
     * 设置「MCP服务标记代理名称」值
     * @param val
     */
    McpServerTagProxyDTO setMcpServerTagProxyName(String mcpServerTagProxyName) {
        this.mcpServerTagProxyName = mcpServerTagProxyName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    McpServerTagProxyDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    McpServerTagProxyDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }

}
