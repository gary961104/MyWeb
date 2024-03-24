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
@Table(name = "pms_sku_sale_attr_value", schema = "pms")
public class PmsSkuSaleAttrValue {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "attr_id")
    private Long attrId;

    @Column(name = "attr_name", length = 200)
    private String attrName;

    @Column(name = "attr_value", length = 200)
    private String attrValue;

    @Column(name = "attr_sort")
    private Integer attrSort;

}