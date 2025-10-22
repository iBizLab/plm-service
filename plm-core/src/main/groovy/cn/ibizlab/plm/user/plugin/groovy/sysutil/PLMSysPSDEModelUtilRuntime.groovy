package cn.ibizlab.plm.user.plugin.groovy.sysutil;


import net.ibizsys.central.plugin.extension.sysutil.SysPSDEModelUtilRuntime;
import net.ibizsys.central.plugin.extension.sysutil.addin.ISysPSDEModelUtilRTAddin;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import cn.ibizlab.plm.user.plugin.groovy.sysutil.addin.PSDESearchBarSyncTool;

public class PLMSysPSDEModelUtilRuntime extends SysPSDEModelUtilRuntime {
    static {
        RuntimeObjectFactory.getInstance().registerObjectIf(ISysPSDEModelUtilRTAddin.class, "*:PSDEMODELSYNCTOOL:PSSYSSEARCHBAR", PSDESearchBarSyncTool.class);
    }
}
