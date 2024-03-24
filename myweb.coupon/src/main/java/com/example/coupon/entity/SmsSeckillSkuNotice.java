package com.example.coupon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "sms_seckill_sku_notice", schema = "sms")
public class SmsSeckillSkuNotice {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "session_id")
    private Long sessionId;

    @Column(name = "subcribe_time")
    private Instant subcribeTime;

    @Column(name = "send_time")
    private Instant sendTime;

    @Column(name = "notice_type")
    private Boolean noticeType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public Instant getSubcribeTime() {
        return subcribeTime;
    }

    public void setSubcribeTime(Instant subcribeTime) {
        this.subcribeTime = subcribeTime;
    }

    public Instant getSendTime() {
        return sendTime;
    }

    public void setSendTime(Instant sendTime) {
        this.sendTime = sendTime;
    }

    public Boolean getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(Boolean noticeType) {
        this.noticeType = noticeType;
    }

}