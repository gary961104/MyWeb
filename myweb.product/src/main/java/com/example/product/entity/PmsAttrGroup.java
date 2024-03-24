package com.example.product.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "pms_attr_group", schema = "pms")
public class PmsAttrGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attr_group_id", nullable = false)
    private Long id;

    @Column(name = "attr_group_name", length = 20)
    private String attrGroupName;

    @Column(name = "sort")
    private Integer sort;

    @Column(name = "descript")
    private String descript;

    @Column(name = "icon")
    private String icon;

    @Column(name = "catelog_id")
    private Long catelogId;

}