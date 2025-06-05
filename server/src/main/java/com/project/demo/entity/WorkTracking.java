package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 工作追踪：(WorkTracking)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "WorkTracking")
public class WorkTracking implements Serializable {

    // WorkTracking编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_tracking_id")
    private Integer work_tracking_id;

    // 标题
    @Basic
    private String title;
    // 主管编号
    @Basic
    private Integer supervisor_no;
    // 主管姓名
    @Basic
    private String supervisor_name;
    // 任务名称
    @Basic
    private String task_name;
    // 截止日期
    @Basic
    private Timestamp closing_date;
    // 追踪情况
    @Basic
    private String tracking;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
