package com.example.ware.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "wms_ware_order_task", schema = "wms")
public class WmsWareOrderTask {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_sn")
    private String orderSn;

    @Column(name = "consignee", length = 100)
    private String consignee;

    @Column(name = "consignee_tel", length = 15)
    private String consigneeTel;

    @Column(name = "delivery_address", length = 500)
    private String deliveryAddress;

    @Column(name = "order_comment", length = 200)
    private String orderComment;

    @Column(name = "payment_way")
    private Boolean paymentWay;

    @Column(name = "task_status")
    private Byte taskStatus;

    @Column(name = "order_body")
    private String orderBody;

    @Column(name = "tracking_no", length = 30)
    private String trackingNo;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "ware_id")
    private Long wareId;

    @Column(name = "task_comment", length = 500)
    private String taskComment;

}