package com.example.product.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "pms_attr_attrgroup_relation", schema = "pms")
public class PmsAttrAttrgroupRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "attr_id")
    private Long attrId;

    @Column(name = "attr_group_id")
    private Long attrGroupId;

    @Column(name = "attr_sort")
    private Integer attrSort;

}