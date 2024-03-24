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
@Table(name = "pms_category_brand_relation", schema = "pms")
public class PmsCategoryBrandRelation {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "catelog_id")
    private Long catelogId;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "catelog_name")
    private String catelogName;

}