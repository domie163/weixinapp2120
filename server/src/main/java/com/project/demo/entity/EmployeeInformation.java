package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 员工信息：(EmployeeInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "EmployeeInformation")
public class EmployeeInformation implements Serializable {

    // EmployeeInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_information_id")
    private Integer employee_information_id;

    // 员工工号
    @Basic
    private Integer employee_id;
    // 员工姓名
    @Basic
    private String employee_name;
    // 性别
    @Basic
    private String gender;
    // 年龄
    @Basic
    private Integer age;
    // 籍贯
    @Basic
    private String native_place;
    // 联系电话
    @Basic
    private String contact_number;
    // 专业技能
    @Basic
    private String professional_skills;
    // 平均分
    @Basic
    private Integer average;
    // 完成项目数量
    @Basic
    private Integer number_of_completed_projects;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
