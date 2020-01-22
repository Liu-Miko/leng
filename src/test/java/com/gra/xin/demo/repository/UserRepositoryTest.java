package com.gra.xin.demo.repository;

import com.gra.xin.demo.model.User;
import com.gra.xin.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Autowired
    private User user;

    @Autowired
    private UserRepository userRepository;

    @Test
    void findByUserId() {
        user = new User(2016060501,"123456");
        userRepository.save(user);
        User user3;
        User user2 = this.userRepository.findByUserId(6);
        assertEquals("123456",user2.getUserPsw());
    }
}