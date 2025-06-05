package com.project.demo.controller;

import com.project.demo.entity.DepartmentHead;
import com.project.demo.service.DepartmentHeadService;
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
 * 部门主管：(DepartmentHead)表控制层
 *
 */
@RestController
@RequestMapping("/department_head")
public class DepartmentHeadController extends BaseController<DepartmentHead, DepartmentHeadService> {

    /**
     * 部门主管对象
     */
    @Autowired
    public DepartmentHeadController(DepartmentHeadService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapsupervisor_no = new HashMap<>();
        mapsupervisor_no.put("supervisor_no",String.valueOf(paramMap.get("supervisor_no")));
        List listsupervisor_no = service.select(mapsupervisor_no, new HashMap<>()).getResultList();
        if (listsupervisor_no.size()>0){
            return error(30000, "字段主管编号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
