package com.gra.xin.demo.service;

import java.util.Map;

public interface PersonalInfoService {

    Map getStudentPersonalInfo(Integer studentUserID);

    Map getTeacherPersonalInfo(Integer teacherUserID);

}
