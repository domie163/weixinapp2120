package com.project.demo.controller;

import com.project.demo.entity.EmployeeLog;
import com.project.demo.service.EmployeeLogService;
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
 * 员工日志：(EmployeeLog)表控制层
 *
 */
@RestController
@RequestMapping("/employee_log")
public class EmployeeLogController extends BaseController<EmployeeLog, EmployeeLogService> {

    /**
     * 员工日志对象
     */
    @Autowired
    public EmployeeLogController(EmployeeLogService service) {
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
