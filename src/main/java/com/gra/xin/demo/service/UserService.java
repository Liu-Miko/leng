package com.gra.xin.demo.service;

import com.gra.xin.demo.model.User;

import javax.servlet.http.HttpServletRequest;


public interface UserService {
    /**
     * save userId & userPsw to database
     *
     * @param user
     */
    void save(User user);

    /**
     * validation the userPsw if equal to database password
     *
     * @param
     * @return
     */
    boolean validPsw(Integer id,String psd);
}
