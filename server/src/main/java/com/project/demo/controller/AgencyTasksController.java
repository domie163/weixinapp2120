package com.project.demo.controller;

import com.project.demo.entity.AgencyTasks;
import com.project.demo.service.AgencyTasksService;
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
 * 代办任务：(AgencyTasks)表控制层
 *
 */
@RestController
@RequestMapping("/agency_tasks")
public class AgencyTasksController extends BaseController<AgencyTasks, AgencyTasksService> {

    /**
     * 代办任务对象
     */
    @Autowired
    public AgencyTasksController(AgencyTasksService service) {
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
