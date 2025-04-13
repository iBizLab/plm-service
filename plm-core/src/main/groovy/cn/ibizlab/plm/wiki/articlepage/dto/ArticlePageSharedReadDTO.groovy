package cn.ibizlab.plm.wiki.articlepage.dto

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
class ArticlePageSharedReadDTO extends GroovyDTO<ArticlePageSharedReadDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「是否开启共享」
     * 字典[是否]
     */
    @JsonProperty("is_shared")
    String isShared
    /**
     * 「共享只读能力」
     */
    @JsonProperty("read_shared")
    String readShared

    /**
     * 设置「标识」值
     * @param val
     */
    ArticlePageSharedReadDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「是否开启共享」值
     * 字典[是否]
     * @param val
     */
    ArticlePageSharedReadDTO setIsShared(String isShared) {
        this.isShared = isShared
        return this
    }


    /**
     * 设置「共享只读能力」值
     * @param val
     */
    ArticlePageSharedReadDTO setReadShared(String readShared) {
        this.readShared = readShared
        return this
    }

}
