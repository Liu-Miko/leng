package com.gra.xin.demo.model;
import javax.persistence.*;

import com.gra.xin.demo.model.Enum.Sex;
import lombok.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Student")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", length = 20, unique = true, nullable = false, updatable = false)
    private final String   studentId;

    @Column(name = "student_name",length = 10,nullable = false)
    private final String studentName;

    @Enumerated(EnumType.STRING)
    @Column(name = "student_sex",nullable = false)
    private final Sex studentSex;

    @Column(name = "student_age",nullable = false)
    private Integer studentAge;

    @Column(name = "college",length = 30,nullable = false)
    private String college;

    @Column(name = "major",length = 10,nullable = false)
    private String major;

    @Column(name = "classes",length = 20,nullable = false)
    private String classIn;

}
