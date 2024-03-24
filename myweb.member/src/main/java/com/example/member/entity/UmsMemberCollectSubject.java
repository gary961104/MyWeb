package com.example.member.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "ums_member_collect_subject", schema = "ums")
public class UmsMemberCollectSubject {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "subject_id")
    private Long subjectId;

    @Column(name = "subject_name")
    private String subjectName;

    @Column(name = "subject_img", length = 500)
    private String subjectImg;

    @Column(name = "subject_urll", length = 500)
    private String subjectUrll;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectImg() {
        return subjectImg;
    }

    public void setSubjectImg(String subjectImg) {
        this.subjectImg = subjectImg;
    }

    public String getSubjectUrll() {
        return subjectUrll;
    }

    public void setSubjectUrll(String subjectUrll) {
        this.subjectUrll = subjectUrll;
    }

}