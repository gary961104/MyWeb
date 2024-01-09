package com.example.backend2.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USER")
@Data
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;

    @Column
    private String userName;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private String addr;

    @Column
    private String phone;

    @Column
    private Date creatTime;

    @Column
    private Date updataTime;
}
