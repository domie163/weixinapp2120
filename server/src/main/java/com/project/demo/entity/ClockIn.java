package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 打卡签到：(ClockIn)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ClockIn")
public class ClockIn implements Serializable {

    // ClockIn编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clock_in_id")
    private Integer clock_in_id;

    // 员工工号
    @Basic
    private Integer employee_id;
    // 员工姓名
    @Basic
    private String employee_name;
    // 性别
    @Basic
    private String gender;
    // 打卡类型
    @Basic
    private String clock_type;
    // 打卡时间
    @Basic
    private Timestamp clocking_time;








    // 当前位置
    @Basic
    private String location_address;
    // 当前位置经度
    @Basic
    private String location_lng;
    // 当前位置纬度
    @Basic
    private String location_lat;






    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
