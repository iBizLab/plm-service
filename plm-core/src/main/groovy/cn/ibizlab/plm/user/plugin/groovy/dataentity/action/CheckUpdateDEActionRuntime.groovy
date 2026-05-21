package cn.ibizlab.plm.user.plugin.groovy.dataentity.action

import net.ibizsys.central.cloud.core.util.domain.V2DeploySystem
import net.ibizsys.central.plugin.util.dataentity.action.DEActionRuntimeBase
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.model.IPSSystem
import org.apache.commons.logging.LogFactory

import java.time.Duration
import java.time.Instant

public class CheckUpdateDEActionRuntime extends DEActionRuntimeBase {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(CheckUpdateDEActionRuntime.class);

    public CheckUpdateDEActionRuntime() {

    }




    /**
     * 使用Java 8 Time API计算天数差
     */
    static long getDaysDifferenceWithTimeAPI(long timestamp1, long timestamp2) {
        Instant instant1 = Instant.ofEpochMilli(timestamp1)
        Instant instant2 = Instant.ofEpochMilli(timestamp2)
        return Duration.between(instant2, instant1).toHours()
    }

    private static IEntityDTO currentVersion;
    private static int errorCount = 0;

    @Override
    protected Object onExecute(IEntityDTO entity) throws Throwable {

        boolean needcache = entity.getBoolean("needcache",false);

        if(needcache && currentVersion!=null && getDaysDifferenceWithTimeAPI(System.currentTimeMillis(),currentVersion.getLong("check_time",System.currentTimeMillis()))<8)
            return currentVersion;

        IPSSystem psSystem = this.getSystemRuntime().getPSSystem();
        entity.set("name", psSystem.getLogicName());
        String current = psSystem.getDefaultPSSysSFPub().getVersionString();
        entity.set("version", current);
        entity.set("id", this.getSystemRuntime().getDeploySystemId());
        entity.set("description", psSystem.getMemo());
        entity.set("license", "MIT");
        boolean checkForUpdates = this.getSystemRuntime().getSystemRuntimeSetting().getParam("check_for_updates",true);
        entity.set("check_for_updates", checkForUpdates);
        entity.set("check_time", System.currentTimeMillis());

        String productId = sys.getDeploySystemId();
        try {
            V2DeploySystem v2DeploySystem = this.getSystemRuntime().getV2DeploySystem();
            if(v2DeploySystem != null && v2DeploySystem.getProductId() != null)
                productId = v2DeploySystem.getProductId();
            String updateCheckUrl = sys.getSystemRuntimeSetting().getParam("update_check_url", "https://release.ibizlab.cn/versions/${productId}/latest.json");
            updateCheckUrl = updateCheckUrl+"?current=${current}&t=${System.currentTimeMillis()}";
            if (checkForUpdates) {
                def response = sys.webclient().get(updateCheckUrl,null,null,null,HashMap.class,null);
                if (response!=null && response.getStatusCode() == 200) {
                    String latest = response.getBody().get("version");
                    entity.set("latest_version",latest);
                    entity.set("latest", response.getBody());
                    boolean hasUpdate = VersionComparator.hasNewVersion(current, latest);
                    entity.set("has_update",hasUpdate);

                }
            }
            if (needcache)
                currentVersion = entity;
        }catch (Exception ex) {
            errorCount ++;
            if(errorCount>3 && needcache)
                currentVersion = entity;
        }


        return entity;
    }

    static void main(String[] args) {
        println "${CheckUpdateDEActionRuntime.getDaysDifferenceWithTimeAPI(System.currentTimeMillis(),System.currentTimeMillis()-8*60*60*1000)}"
        println "${VersionComparator.hasNewVersion("V1.0-alpha","V1.0.1-alpha.20251223")}"
    }
}