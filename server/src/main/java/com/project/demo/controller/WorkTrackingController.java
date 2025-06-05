package com.project.demo.controller;

import com.project.demo.entity.WorkTracking;
import com.project.demo.service.WorkTrackingService;
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
 * 工作追踪：(WorkTracking)表控制层
 *
 */
@RestController
@RequestMapping("/work_tracking")
public class WorkTrackingController extends BaseController<WorkTracking, WorkTrackingService> {

    /**
     * 工作追踪对象
     */
    @Autowired
    public WorkTrackingController(WorkTrackingService service) {
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
