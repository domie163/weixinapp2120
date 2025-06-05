package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 员工日志：(EmployeeLog)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "EmployeeLog")
public class EmployeeLog implements Serializable {

    // EmployeeLog编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_log_id")
    private Integer employee_log_id;

    // 日志标题
    @Basic
    private String log_title;
    // 员工工号
    @Basic
    private Integer employee_id;
    // 员工姓名
    @Basic
    private String employee_name;
    // 记录时间
    @Basic
    private Timestamp record_time;
    // 内容详情
    @Basic
    private String content_details;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
