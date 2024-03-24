package com.example.product.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "pms_sku_info", schema = "pms")
public class PmsSkuInfo {
    @Id
    @Column(name = "sku_id", nullable = false)
    private Long id;

    @Column(name = "spu_id")
    private Long spuId;

    @Column(name = "sku_name")
    private String skuName;

    @Column(name = "sku_desc", length = 2000)
    private String skuDesc;

    @Column(name = "catalog_id")
    private Long catalogId;

    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "sku_default_img")
    private String skuDefaultImg;

    @Column(name = "sku_title")
    private String skuTitle;

    @Column(name = "sku_subtitle", length = 2000)
    private String skuSubtitle;

    @Column(name = "price", precision = 18, scale = 4)
    private BigDecimal price;

    @Column(name = "sale_count")
    private Long saleCount;

}