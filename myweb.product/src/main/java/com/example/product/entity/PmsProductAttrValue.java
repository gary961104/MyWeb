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
@Table(name = "pms_product_attr_value", schema = "pms")
public class PmsProductAttrValue {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "spu_id")
    private Long spuId;

    @Column(name = "attr_id")
    private Long attrId;

    @Column(name = "attr_name", length = 200)
    private String attrName;

    @Column(name = "attr_value", length = 200)
    private String attrValue;

    @Column(name = "attr_sort")
    private Integer attrSort;

    @Column(name = "quick_show")
    private Byte quickShow;

}