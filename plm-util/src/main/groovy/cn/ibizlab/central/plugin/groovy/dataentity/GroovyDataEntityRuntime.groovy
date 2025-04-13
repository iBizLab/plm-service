package cn.ibizlab.central.plugin.groovy.dataentity

import cn.ibizlab.central.plugin.groovy.dataentity.action.GroovyActionPlugin
import cn.ibizlab.central.plugin.groovy.dataentity.ds.GroovyFetchPlugin
import cn.ibizlab.central.plugin.groovy.dataentity.dto.GroovyDTO
import cn.ibizlab.central.plugin.groovy.dataentity.dto.GroovyFilter
import net.ibizsys.central.ISystemRuntime
import net.ibizsys.central.util.ISearchContextDTO
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime
import net.ibizsys.runtime.dataentity.ds.IDEDataSetPluginRuntime
import net.ibizsys.runtime.util.IAction
import net.ibizsys.runtime.util.IEntityBase
import net.ibizsys.central.cloud.core.dataentity.DataEntityRuntime
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

class GroovyDataEntityRuntime<T extends GroovyDataEntityRuntime,D extends GroovyDTO,F extends GroovyFilter> extends DataEntityRuntime{

    public static final Log log = LogFactory.getLog(GroovyDataEntityRuntime.class)

    void setInstance(T instance) {

    }

    ISystemRuntime sys

    @Override
    protected void onInit() throws Exception {
        super.onInit()
        this.setInstance(this)
        sys = this.getSystemRuntime()
    }

    D entity() {
        return (D) super.createEntity();
    }

    F filter() {
        return (F) super.createSearchContext();
    }

    List<D> list() {
        return (List<D>) super.createEntityList()
    }

    @Override
    int checkKeyState(Object objKey) {
        return super.checkKeyState(objKey)
    }

    @Override
    D get(Object objKey) throws Throwable {
        return super.get(objKey)
    }

    @Override
    D get(Object objKey, boolean bTryMode) {
        return super.get(objKey, bTryMode)
    }

    @Override
    void create(IEntityBase iEntityBase) throws Throwable {
        super.create(iEntityBase)
    }

    @Override
    void update(IEntityBase iEntityBase) throws Throwable {
        super.update(iEntityBase)
    }

    @Override
    void remove(Object objKey) throws Throwable {
        super.remove(objKey)
    }


    protected Object execute(String strActionName, Object arg) throws Throwable {
        log.debug(String.format("ACTION: [%s]/[%s]",this.getClass().getSimpleName(),strActionName.uncapitalize()))
        return doExecuteActionReal(strActionName, this.getPSDEAction(strActionName), [arg] as Object[], null)
    }

    protected Object fetch(String strDataSetName, Object arg) throws Throwable {
        log.debug(String.format("FETCH: [%s]/[%s]",this.getClass().getSimpleName(),strDataSetName.uncapitalize()))
        return doFetchDataSetReal(strDataSetName, this.getPSDEDataSet(strDataSetName), [arg] as Object[], null)
    }

    /**
     * 注册实体行为插件运行时对象接口
     *
     * @param strAction
     * @param iAction
     * @return
     */
    IDEActionPluginRuntime registerDEActionPluginRuntime(String strAction, IAction iAction) {
        IDEActionPluginRuntime iDEActionPluginRuntime = new GroovyActionPlugin() {
            @Override
            protected Object onExecute(Object args) throws Throwable {
                return iAction.execute(args);
            }
        };

        this.registerDEActionPluginRuntime(strAction, iDEActionPluginRuntime);
        return iDEActionPluginRuntime;
    }

    /**
     * 注册实体结果集插件运行时对象接口
     *
     * @param strDataSet
     * @param iDataSet
     * @return
     */
    protected IDEDataSetPluginRuntime registerDEDataSetPluginRuntime(String strDataSet, IAction iAction) {
        IDEDataSetPluginRuntime iDEDataSetPluginRuntime = new GroovyFetchPlugin() {
            @Override
            protected Object onFetch(ISearchContextDTO args) throws Throwable {
                return iAction.execute(args);
            }
        };

        this.registerDEDataSetPluginRuntime(strDataSet, iDEDataSetPluginRuntime);
        return iDEDataSetPluginRuntime;
    }



}
