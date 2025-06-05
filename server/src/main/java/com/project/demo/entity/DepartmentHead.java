package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 部门主管：(DepartmentHead)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "DepartmentHead")
public class DepartmentHead implements Serializable {

    // DepartmentHead编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_head_id")
    private Integer department_head_id;

    // 主管编号
    @Basic
    private String supervisor_no;
    // 主管姓名
    @Basic
    private String supervisor_name;
    // 性别
    @Basic
    private String gender;












    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;


    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
