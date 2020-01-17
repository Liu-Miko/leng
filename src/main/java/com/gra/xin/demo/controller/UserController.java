package com.gra.xin.demo.controller;

import com.gra.xin.demo.model.User;
import com.gra.xin.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping
    public String index() {
        return "login";
    }

    @RequestMapping(value="/save",  method= RequestMethod.POST)
    public String save(String id,@RequestParam(required = false) String psd) {
        User user;
        if(psd==null) user = new User(id);
        else user = new User(id,psd);
        userService.save(user);
        return "save successfully";
    }
}
