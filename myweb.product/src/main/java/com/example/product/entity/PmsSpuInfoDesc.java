package com.example.product.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "pms_spu_info_desc", schema = "pms")
public class PmsSpuInfoDesc {
    @Id
    @Column(name = "spu_id", nullable = false)
    private Long id;

    @Lob
    @Column(name = "decript")
    private String decript;

}