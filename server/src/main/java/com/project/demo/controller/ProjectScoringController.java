package com.project.demo.controller;

import com.project.demo.entity.ProjectScoring;
import com.project.demo.service.ProjectScoringService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 项目打分：(ProjectScoring)表控制层
 *
 */
@RestController
@RequestMapping("/project_scoring")
public class ProjectScoringController extends BaseController<ProjectScoring, ProjectScoringService> {

    /**
     * 项目打分对象
     */
    @Autowired
    public ProjectScoringController(ProjectScoringService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
