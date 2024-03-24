package com.example.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "oms_refund_info", schema = "oms")
public class OmsRefundInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "order_return_id")
    private Long orderReturnId;

    @Column(name = "refund", precision = 18, scale = 4)
    private BigDecimal refund;

    @Column(name = "refund_sn", length = 64)
    private String refundSn;

    @Column(name = "refund_status")
    private Boolean refundStatus;

    @Column(name = "refund_channel")
    private Byte refundChannel;

    @Column(name = "refund_content", length = 5000)
    private String refundContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderReturnId() {
        return orderReturnId;
    }

    public void setOrderReturnId(Long orderReturnId) {
        this.orderReturnId = orderReturnId;
    }

    public BigDecimal getRefund() {
        return refund;
    }

    public void setRefund(BigDecimal refund) {
        this.refund = refund;
    }

    public String getRefundSn() {
        return refundSn;
    }

    public void setRefundSn(String refundSn) {
        this.refundSn = refundSn;
    }

    public Boolean getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Boolean refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Byte getRefundChannel() {
        return refundChannel;
    }

    public void setRefundChannel(Byte refundChannel) {
        this.refundChannel = refundChannel;
    }

    public String getRefundContent() {
        return refundContent;
    }

    public void setRefundContent(String refundContent) {
        this.refundContent = refundContent;
    }

}