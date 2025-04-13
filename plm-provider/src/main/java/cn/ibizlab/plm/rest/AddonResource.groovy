package cn.ibizlab.plm.rest

import cn.ibizlab.plm.projmgmt.project.Project
import cn.ibizlab.plm.projmgmt.project.dto.ProjectDTO
import groovy.transform.CompileStatic
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub
import net.ibizsys.runtime.security.UserContext
import org.springframework.beans.factory.annotation.Autowired
import net.ibizsys.central.cloud.core.service.SysRestServiceAPIRuntimeBase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@CompileStatic
@RequestMapping("/ibizplm/serviceapi/addons")
class AddonResource  extends SysRestServiceAPIRuntimeBase{


    @Autowired
    private Project project;


    @Override
    protected void registerIgnoreAuthPatterns() {
        //注册免密接口
        ServiceHub.getInstance().registerIgnoreAuthPattern("${baseUrl}/projects/**/hello-word");
        super.registerIgnoreAuthPatterns();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello-word")
    public ResponseEntity<String> helloWord() {
        String ret = "${UserContext.current.username} <br> hello word!"
        return ResponseEntity.ok(ret);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/projects/{project_id}/hello-word")
    public ResponseEntity<ProjectDTO> helloWord(@PathVariable("project_id") String projectId) {

        ProjectDTO projectDTO = project.get(projectId) as ProjectDTO

        return ResponseEntity.ok(projectDTO);
    }
}
