package com.gra.xin.demo.repository;

import com.gra.xin.demo.model.Enum.Sex;
import com.gra.xin.demo.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TeacherRepository  extends JpaRepository<Teacher, Integer> {

    String findTeacherNameByTeacherId(final Integer teacherId);

    Sex findTeacherSexByTeacherId(final Integer teacherId);

    Integer findTeacherAgeByTeacherId(final Integer teacherId);

    String findCollegeByTeacherId(final Integer teacherId);

}
