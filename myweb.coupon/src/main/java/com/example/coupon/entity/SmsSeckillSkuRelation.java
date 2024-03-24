package com.example.coupon.entity;

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
@Data
@Entity
@Table(name = "sms_seckill_sku_relation", schema = "sms")
public class SmsSeckillSkuRelation {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "promotion_id")
    private Long promotionId;

    @Column(name = "promotion_session_id")
    private Long promotionSessionId;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "seckill_price", precision = 10, scale = 4)
    private BigDecimal seckillPrice;

    @Column(name = "seckill_count")
    private Integer seckillCount;

    @Column(name = "seckill_limit")
    private Integer seckillLimit;

    @Column(name = "seckill_sort")
    private Integer seckillSort;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public Long getPromotionSessionId() {
        return promotionSessionId;
    }

    public void setPromotionSessionId(Long promotionSessionId) {
        this.promotionSessionId = promotionSessionId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public BigDecimal getSeckillPrice() {
        return seckillPrice;
    }

    public void setSeckillPrice(BigDecimal seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    public Integer getSeckillCount() {
        return seckillCount;
    }

    public void setSeckillCount(Integer seckillCount) {
        this.seckillCount = seckillCount;
    }

    public Integer getSeckillLimit() {
        return seckillLimit;
    }

    public void setSeckillLimit(Integer seckillLimit) {
        this.seckillLimit = seckillLimit;
    }

    public Integer getSeckillSort() {
        return seckillSort;
    }

    public void setSeckillSort(Integer seckillSort) {
        this.seckillSort = seckillSort;
    }

}