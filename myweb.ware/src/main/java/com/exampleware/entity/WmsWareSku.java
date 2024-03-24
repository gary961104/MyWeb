package com.exampleware.entity;

import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "wms_ware_sku", schema = "wms")
public class WmsWareSku {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "ware_id")
    private Long wareId;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "sku_name", length = 200)
    private String skuName;

    @Column(name = "stock_locked")
    private Integer stockLocked;

}