package com.gra.xin.demo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "UserLogin")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true, nullable = false)
    private Integer   userId;

    @Column(name = "user_psw",length = 30)
    private  String userPsw;

    public User() {
        this.userPsw = "111111";
    }

    public User(Integer id) {
        this.userId = id;
        this.userPsw = "1111111";
    }


    public User(Integer userId,String userPsw) {
        this.userId = userId;
        this.userPsw = userPsw;
    }
}
