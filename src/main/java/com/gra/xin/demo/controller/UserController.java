package com.gra.xin.demo.controller;

import com.gra.xin.demo.model.User;
import com.gra.xin.demo.repository.UserRepository;
import com.gra.xin.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String index() {
        return "login";
    }

    @RequestMapping(value = "/student/scm")
    public String scm() {
        return "studentScm";
    }

    @RequestMapping(value = "/student/studentScmPersonalInfo")
    public String ScmPersonalInfo() {
        return "studentScmPersonalInfo";
    }

    @RequestMapping(value = "/student/studentScmTakeTheCourse")
    public String ScmTakeTheCourse() {
        return "studentScmTakeTheCourse";
    }

    @RequestMapping(value = "/student/studentScmCourseInfo")
    public String ScmCourseInfo() {
        return "studentScmCourseInfo";
    }

    @RequestMapping(value = "/student/studentScmPasswordUpdate")
    public String ScmPasswordUpdate() {
        return "studentScmPasswordUpdate";
    }



    @RequestMapping(value="/login/save",  method= RequestMethod.POST)
    public String save(Integer id,@RequestParam(defaultValue="111111") String psd) {
        User user = new User(id,psd);
        userService.save(user);
        return "scm";
    }

    @RequestMapping(value="/login/validation",method=RequestMethod.GET)
    public String validPsw(Model mv, @RequestParam("username")String id, @RequestParam("password")String psd, HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer userId = Integer.parseInt(id);
        boolean validResult= userService.validPsw(userId,psd);
        if(validResult == true) {
            return "/studentScm";
        }
        else {;
            mv.addAttribute("msg","用户名或密码错误");
            return "login";
        }
    }
}
