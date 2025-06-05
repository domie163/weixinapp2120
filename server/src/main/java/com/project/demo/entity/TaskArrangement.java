package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 任务安排：(TaskArrangement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "TaskArrangement")
public class TaskArrangement implements Serializable {

    // TaskArrangement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_arrangement_id")
    private Integer task_arrangement_id;

    // 员工工号
    @Basic
    private Integer employee_id;
    // 员工姓名
    @Basic
    private String employee_name;
    // 联系电话
    @Basic
    private String contact_number;
    // 专业技能
    @Basic
    private String professional_skills;
    // 任务名称
    @Basic
    private String task_name;
    // 分派时间
    @Basic
    private Timestamp dispatch_time;
    // 任务要求
    @Basic
    private String task_requirements;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
