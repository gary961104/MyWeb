package com.example.ware.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "wms_ware_order_task_detail", schema = "wms")
public class WmsWareOrderTaskDetail {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "sku_name")
    private String skuName;

    @Column(name = "sku_num")
    private Integer skuNum;

    @Column(name = "task_id")
    private Long taskId;

    @Column(name = "ware_id")
    private Long wareId;

    @Column(name = "lock_status")
    private Integer lockStatus;

}