package com.exampleware.entity;

import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "wms_purchase_detail", schema = "wms")
public class WmsPurchaseDetail {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "purchase_id")
    private Long purchaseId;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "sku_num")
    private Integer skuNum;

    @Column(name = "sku_price", precision = 18, scale = 4)
    private BigDecimal skuPrice;

    @Column(name = "ware_id")
    private Long wareId;

    @Column(name = "status")
    private Integer status;

}