package com.gra.xin.demo.service.impl;

import com.gra.xin.demo.repository.StudentRepository;
import com.gra.xin.demo.repository.TeacherRepository;
import com.gra.xin.demo.service.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PersonalInfoServiceImpl implements PersonalInfoService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Map getStudentPersonalInfo(Integer studentUserID) {
        Map<String, String> map = new HashMap<>();
        map.put("name", studentRepository.findStudentNameByStudentId(studentUserID));
        map.put("sex", studentRepository.findStudentSexByStudentId(studentUserID).toString());
        map.put("age", studentRepository.findStudentAgeByStudentId(studentUserID).toString());
        map.put("college", studentRepository.findCollegeByStudentId(studentUserID));
        map.put("major", studentRepository.findMajorByStudentId(studentUserID));
        map.put("ClassIn", studentRepository.findClassInByStudentId(studentUserID));
        map.put("studentId",studentUserID.toString());
        return map;
    }

    @Override
    public Map getTeacherPersonalInfo(Integer teacherUserID) {
        Map<String, String> map = new HashMap<>();
        map.put("name", teacherRepository.findTeacherNameByTeacherId(teacherUserID));
        map.put("sex", teacherRepository.findTeacherSexByTeacherId(teacherUserID).toString());
        map.put("age", teacherRepository.findTeacherAgeByTeacherId(teacherUserID).toString());
        map.put("college", teacherRepository.findCollegeByTeacherId(teacherUserID));
        map.put("teacherId",teacherUserID.toString());
        return map;

    }


}
