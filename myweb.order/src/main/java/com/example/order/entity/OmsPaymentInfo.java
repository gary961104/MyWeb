package com.example.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "oms_payment_info", schema = "oms")
public class OmsPaymentInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "order_sn", length = 64)
    private String orderSn;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "alipay_trade_no", length = 50)
    private String alipayTradeNo;

    @Column(name = "total_amount", precision = 18, scale = 4)
    private BigDecimal totalAmount;

    @Column(name = "subject", length = 200)
    private String subject;

    @Column(name = "payment_status", length = 20)
    private String paymentStatus;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "confirm_time")
    private Instant confirmTime;

    @Column(name = "callback_content", length = 4000)
    private String callbackContent;

    @Column(name = "callback_time")
    private Instant callbackTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getAlipayTradeNo() {
        return alipayTradeNo;
    }

    public void setAlipayTradeNo(String alipayTradeNo) {
        this.alipayTradeNo = alipayTradeNo;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

    public Instant getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Instant confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getCallbackContent() {
        return callbackContent;
    }

    public void setCallbackContent(String callbackContent) {
        this.callbackContent = callbackContent;
    }

    public Instant getCallbackTime() {
        return callbackTime;
    }

    public void setCallbackTime(Instant callbackTime) {
        this.callbackTime = callbackTime;
    }

}