package com.gra.xin.demo.model;
import javax.persistence.*;

import com.gra.xin.demo.model.Enum.Sex;
import lombok.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Teacher")
public class Teacher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id", length = 20, unique = true, nullable = false, updatable = false)
    private final String   teacherId;

    @Column(name = "teacher_name",length = 10,nullable = false)
    private final String teacherName;

    @Enumerated(EnumType.STRING)
    @Column(name = "teacher_sex",nullable = false)
    private final Sex teacherSex;

    @Column(name = "teacher_age",nullable = false)
    private Integer teacherAge;

    @Column(name = "college_name",nullable = false)
    private String college;

    public Teacher(final String teacherId,final String teacherName,final Sex teacherSex,final Integer teacherAge,String college) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherSex = teacherSex;
        this.teacherAge = teacherAge;
        this.college = college;
    }

}
