package com.example.product.entity;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "pms_spu_comment", schema = "pms")
public class PmsSpuComment {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "spu_id")
    private Long spuId;

    @Column(name = "spu_name")
    private String spuName;

    @Column(name = "member_nick_name")
    private String memberNickName;

    @Column(name = "star")
    private Boolean star;

    @Column(name = "member_ip", length = 64)
    private String memberIp;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "show_status")
    private Boolean showStatus;

    @Column(name = "spu_attributes")
    private String spuAttributes;

    @Column(name = "likes_count")
    private Integer likesCount;

    @Column(name = "reply_count")
    private Integer replyCount;

    @Column(name = "resources", length = 1000)
    private String resources;

    @Lob
    @Column(name = "content")
    private String content;

    @Column(name = "member_icon")
    private String memberIcon;

    @Column(name = "comment_type")
    private Byte commentType;

}