package com.gra.xin.demo.repository;

import com.gra.xin.demo.model.Enum.Sex;
import com.gra.xin.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer> {

    String findStudentNameByStudentId(final Integer studentId);

    Sex findStudentSexByStudentId(final Integer studentId);

    Integer findStudentAgeByStudentId(final Integer studentId);

    String findCollegeByStudentId(final Integer studentId);

    String findMajorByStudentId(final Integer studentId);

    String findClassInByStudentId(final Integer studentId);

}
