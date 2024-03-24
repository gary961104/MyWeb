package com.example.product.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "pms_attr", schema = "pms")
public class PmsAttr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attr_id", nullable = false)
    private Long id;

    @Column(name = "attr_name", length = 30)
    private String attrName;

    @Column(name = "search_type")
    private Byte searchType;

    @Column(name = "value_type")
    private Byte valueType;

    @Column(name = "icon")
    private String icon;

    @Column(name = "value_select")
    private String valueSelect;

    @Column(name = "attr_type")
    private Byte attrType;

    @Column(name = "enable")
    private Long enable;

    @Column(name = "catelog_id")
    private Long catelogId;

    @Column(name = "show_desc")
    private Byte showDesc;

}