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
@Table(name = "sms_spu_bounds", schema = "sms")
public class SmsSpuBound {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "spu_id")
    private Long spuId;

    @Column(name = "grow_bounds", precision = 18, scale = 4)
    private BigDecimal growBounds;

    @Column(name = "buy_bounds", precision = 18, scale = 4)
    private BigDecimal buyBounds;

    @Column(name = "work")
    private Boolean work;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public BigDecimal getGrowBounds() {
        return growBounds;
    }

    public void setGrowBounds(BigDecimal growBounds) {
        this.growBounds = growBounds;
    }

    public BigDecimal getBuyBounds() {
        return buyBounds;
    }

    public void setBuyBounds(BigDecimal buyBounds) {
        this.buyBounds = buyBounds;
    }

    public Boolean getWork() {
        return work;
    }

    public void setWork(Boolean work) {
        this.work = work;
    }

}