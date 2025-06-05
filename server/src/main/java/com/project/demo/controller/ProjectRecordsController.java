package com.project.demo.controller;

import com.project.demo.entity.ProjectRecords;
import com.project.demo.service.ProjectRecordsService;
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
 * 项目记录：(ProjectRecords)表控制层
 *
 */
@RestController
@RequestMapping("/project_records")
public class ProjectRecordsController extends BaseController<ProjectRecords, ProjectRecordsService> {

    /**
     * 项目记录对象
     */
    @Autowired
    public ProjectRecordsController(ProjectRecordsService service) {
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
