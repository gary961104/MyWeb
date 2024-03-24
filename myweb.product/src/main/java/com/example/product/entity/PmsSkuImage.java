package com.example.product.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "pms_sku_images", schema = "pms")
public class PmsSkuImage {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "img_sort")
    private Integer imgSort;

    @Column(name = "default_img")
    private Integer defaultImg;

}