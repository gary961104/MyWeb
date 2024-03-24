package com.example.member.entity;

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
@Table(name = "ums_member_collect_spu", schema = "ums")
public class UmsMemberCollectSpu {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "spu_id")
    private Long spuId;

    @Column(name = "spu_name", length = 500)
    private String spuName;

    @Column(name = "spu_img", length = 500)
    private String spuImg;

    @Column(name = "create_time")
    private Instant createTime;

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

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public String getSpuImg() {
        return spuImg;
    }

    public void setSpuImg(String spuImg) {
        this.spuImg = spuImg;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

}