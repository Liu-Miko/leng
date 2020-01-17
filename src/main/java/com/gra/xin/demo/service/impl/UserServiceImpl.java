package com.gra.xin.demo.service.impl;

import com.gra.xin.demo.model.User;
import com.gra.xin.demo.repository.UserRepository;
import com.gra.xin.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
