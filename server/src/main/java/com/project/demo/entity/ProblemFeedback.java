package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 问题反馈：(ProblemFeedback)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ProblemFeedback")
public class ProblemFeedback implements Serializable {

    // ProblemFeedback编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "problem_feedback_id")
    private Integer problem_feedback_id;

    // 标题
    @Basic
    private String title;
    // 员工工号
    @Basic
    private Integer employee_id;
    // 员工姓名
    @Basic
    private String employee_name;
    // 反馈时间
    @Basic
    private Timestamp feedback_time;
    // 问题描述
    @Basic
    private String problem_description;



    // 审核状态
    @Basic
    private String examine_state;








    // 审核回复
    @Basic
    private String examine_reply;



    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
