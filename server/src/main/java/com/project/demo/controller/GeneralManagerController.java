package com.project.demo.controller;

import com.project.demo.entity.GeneralManager;
import com.project.demo.service.GeneralManagerService;
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
 * 总经理：(GeneralManager)表控制层
 *
 */
@RestController
@RequestMapping("/general_manager")
public class GeneralManagerController extends BaseController<GeneralManager, GeneralManagerService> {

    /**
     * 总经理对象
     */
    @Autowired
    public GeneralManagerController(GeneralManagerService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapgeneral_manager_no = new HashMap<>();
        mapgeneral_manager_no.put("general_manager_no",String.valueOf(paramMap.get("general_manager_no")));
        List listgeneral_manager_no = service.select(mapgeneral_manager_no, new HashMap<>()).getResultList();
        if (listgeneral_manager_no.size()>0){
            return error(30000, "字段总经理编号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
