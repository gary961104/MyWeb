package com.example.product.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "pms_brand", schema = "pms")
public class PmsBrand {
    @Id
    @Column(name = "brand_id", nullable = false)
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "logo", length = 2000)
    private String logo;

    @Lob
    @Column(name = "descript")
    private String descript;

    @Column(name = "show_status")
    private Byte showStatus;

    @Column(name = "first_letter")
    private Character firstLetter;

    @Column(name = "sort")
    private Integer sort;

}