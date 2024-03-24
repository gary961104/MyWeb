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
@Table(name = "pms_spu_images", schema = "pms")
public class PmsSpuImage {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "spu_id")
    private Long spuId;

    @Column(name = "img_name", length = 200)
    private String imgName;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "img_sort")
    private Integer imgSort;

    @Column(name = "default_img")
    private Byte defaultImg;

}