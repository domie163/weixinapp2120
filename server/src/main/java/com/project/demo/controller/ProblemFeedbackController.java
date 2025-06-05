package com.project.demo.controller;

import com.project.demo.entity.ProblemFeedback;
import com.project.demo.service.ProblemFeedbackService;
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
 * 问题反馈：(ProblemFeedback)表控制层
 *
 */
@RestController
@RequestMapping("/problem_feedback")
public class ProblemFeedbackController extends BaseController<ProblemFeedback, ProblemFeedbackService> {

    /**
     * 问题反馈对象
     */
    @Autowired
    public ProblemFeedbackController(ProblemFeedbackService service) {
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
