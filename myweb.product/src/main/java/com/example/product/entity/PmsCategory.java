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
@Table(name = "pms_category", schema = "pms")
public class PmsCategory {
    @Id
    @Column(name = "cat_id", nullable = false)
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "parent_cid")
    private Long parentCid;

    @Column(name = "cat_level")
    private Integer catLevel;

    @Column(name = "show_status")
    private Byte showStatus;

    @Column(name = "sort")
    private Integer sort;

    @Column(name = "icon")
    private String icon;

    @Column(name = "product_unit", length = 50)
    private String productUnit;

    @Column(name = "product_count")
    private Integer productCount;

}