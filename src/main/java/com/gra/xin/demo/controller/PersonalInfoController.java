package com.gra.xin.demo.controller;

import com.gra.xin.demo.dto.FeildsDto;
import com.gra.xin.demo.repository.StudentRepository;
import com.gra.xin.demo.service.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PersonalInfoController {

    @Autowired
    private PersonalInfoService personalInfoService;

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(value = "/student/personalInfo",method = RequestMethod.GET)
    public void getStudentInfo(Model mv) {
        Map<String, String> map = new HashMap<>();
        map = personalInfoService.getStudentPersonalInfo(FeildsDto.userID);
        mv.addAttribute("name",map.get("name"));
        mv.addAttribute("studentId",map.get("studentId"));
        mv.addAttribute("sex",map.get("sex"));
        mv.addAttribute("age",map.get("age"));
        mv.addAttribute("college",map.get("college"));
        mv.addAttribute("major",map.get("major"));
        mv.addAttribute("ClassIn",map.get("ClassIn"));
    }

    @RequestMapping(value = "/teacher/personalInfo",method = RequestMethod.GET)
    public void getTeacherInfo(Model mv) {
        Map<String, String> map = new HashMap<>();
        map = personalInfoService.getTeacherPersonalInfo(FeildsDto.userID);
        mv.addAttribute("name",map.get("name"));
        mv.addAttribute("studentId",map.get("studentId"));
        mv.addAttribute("sex",map.get("sex"));
        mv.addAttribute("age",map.get("age"));
        mv.addAttribute("college",map.get("college"));
        mv.addAttribute("major",map.get("major"));
    }
}
