package com.gra.xin.demo.repository;

import com.gra.xin.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(User user) {
        jdbcTemplate.update("insert into user_login(user_id,user_psw) values(?,?)",user.getUserId(),user.getUserPsw());
    }
}
