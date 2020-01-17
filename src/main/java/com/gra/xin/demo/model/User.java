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
    @Column(name = "user_id", length = 20, unique = true, nullable = false, updatable = false)
    private final String   userId;

    @Column(name = "user_psw",length = 30,nullable = false)
    private  String userPsw = "111111";

    public User(final String userId) {
        this.userId = userId;
    }
    public User(final String userId,String userPsw) {
        this.userId = userId;
        this.userPsw = userPsw;
    }
}
