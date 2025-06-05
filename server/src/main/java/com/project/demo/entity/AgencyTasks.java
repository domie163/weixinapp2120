package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 代办任务：(AgencyTasks)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "AgencyTasks")
public class AgencyTasks implements Serializable {

    // AgencyTasks编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agency_tasks_id")
    private Integer agency_tasks_id;

    // 标题
    @Basic
    private String title;
    // 总经理编号
    @Basic
    private Integer general_manager_no;
    // 姓名
    @Basic
    private String full_name;
    // 任务名称
    @Basic
    private String task_name;
    // 创建时间
    @Basic
    private Timestamp creation_time;
    // 截止日期
    @Basic
    private Timestamp closing_date;
    // 任务详情
    @Basic
    private String task_details;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
