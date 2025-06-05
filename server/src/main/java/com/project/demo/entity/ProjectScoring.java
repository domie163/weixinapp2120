package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 项目打分：(ProjectScoring)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ProjectScoring")
public class ProjectScoring implements Serializable {

    // ProjectScoring编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_scoring_id")
    private Integer project_scoring_id;

    // 员工工号
    @Basic
    private Integer employee_id;
    // 员工姓名
    @Basic
    private String employee_name;
    // 任务名称
    @Basic
    private String task_name;
    // 完成情况
    @Basic
    private String completion;
    // 打分时间
    @Basic
    private Timestamp scoring_time;
    // 分数
    @Basic
    private Integer fraction;
    // 标注说明
    @Basic
    private String annotation_notes;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
