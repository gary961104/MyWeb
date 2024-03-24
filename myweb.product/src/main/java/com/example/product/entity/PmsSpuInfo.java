package com.example.product.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "pms_spu_info", schema = "pms")
public class PmsSpuInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "spu_name", length = 200)
    private String spuName;

    @Column(name = "spu_description", length = 1000)
    private String spuDescription;

    @Column(name = "catalog_id")
    private Long catalogId;

    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "weight", precision = 18, scale = 4)
    private BigDecimal weight;

    @Column(name = "publish_status")
    private Byte publishStatus;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "update_time")
    private Instant updateTime;

}