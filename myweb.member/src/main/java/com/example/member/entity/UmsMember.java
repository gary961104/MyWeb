package com.example.member.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "ums_member", schema = "ums")
public class UmsMember {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "level_id")
    private Long levelId;

    @Column(name = "username", length = 64)
    private String username;

    @Column(name = "password", length = 64)
    private String password;

    @Column(name = "nickname", length = 64)
    private String nickname;

    @Column(name = "mobile", length = 20)
    private String mobile;

    @Column(name = "email", length = 64)
    private String email;

    @Column(name = "header", length = 500)
    private String header;

    @Column(name = "gender")
    private Byte gender;

    @Column(name = "birth")
    private LocalDate birth;

    @Column(name = "city", length = 500)
    private String city;

    @Column(name = "job")
    private String job;

    @Column(name = "sign")
    private String sign;

    @Column(name = "source_type")
    private Byte sourceType;

    @Column(name = "integration")
    private Integer integration;

    @Column(name = "growth")
    private Integer growth;

    @Column(name = "status")
    private Byte status;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "social_uid")
    private String socialUid;

    @Column(name = "access_token")
    private String accessToken;

    @Column(name = "expires_in")
    private String expiresIn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLevelId() {
        return levelId;
    }

    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Byte getSourceType() {
        return sourceType;
    }

    public void setSourceType(Byte sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

    public String getSocialUid() {
        return socialUid;
    }

    public void setSocialUid(String socialUid) {
        this.socialUid = socialUid;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

}