package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 项目记录：(ProjectRecords)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ProjectRecords")
public class ProjectRecords implements Serializable {

    // ProjectRecords编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_records_id")
    private Integer project_records_id;

    // 员工工号
    @Basic
    private Integer employee_id;
    // 员工姓名
    @Basic
    private String employee_name;
    // 任务名称
    @Basic
    private String task_name;
    // 分派时间
    @Basic
    private String dispatch_time;
    // 完成情况
    @Basic
    private String completion;
    // 记录时间
    @Basic
    private Timestamp record_time;
    // 详情
    @Basic
    private String details;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
