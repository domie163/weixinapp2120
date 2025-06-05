package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 通知列表：(NotificationList)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "NotificationList")
public class NotificationList implements Serializable {

    // NotificationList编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notification_list_id")
    private Integer notification_list_id;

    // 标题
    @Basic
    private String title;
    // 发布人
    @Basic
    private String publisher;
    // 发布时间
    @Basic
    private Timestamp release_time;
    // 内容相关
    @Basic
    private String content_related;
    // 内容详情
    @Basic
    private String content_details;

    // 点击数
    @Basic
    private Integer hits;

    // 点赞数
    @Basic
    private Integer praise_len;












    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
