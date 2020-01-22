package com.gra.xin.demo.repository;

import com.gra.xin.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserId(final Integer userId);
}
