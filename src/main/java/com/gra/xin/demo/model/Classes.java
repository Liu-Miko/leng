package com.gra.xin.demo.model;
import javax.persistence.*;

import lombok.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Class")
public class Classes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id", length = 20, unique = true, nullable = false, updatable = false)
    private final String   classId;

    @Column(name = "college_name",nullable = false)
    private String college;

    @Column(name = "major_name",nullable = false)
    private String major;

    @Column(name = "class_student_sum")
    private Integer classStudentSum;

    public Classes(final String classId,String major,String college) {
        this.classId = classId;
        this.major = major;
        this.college = college;
    }

}
