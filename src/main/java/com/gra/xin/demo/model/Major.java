package com.gra.xin.demo.model;
import javax.persistence.*;

import lombok.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Major")
public class Major implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "major_id", length = 20, unique = true, nullable = false, updatable = false)
    private final String   majorId;

    @Column(name = "major_name",length = 30,nullable = false)
    private final String majorName;

    @Column(name = "college_name",nullable = false)
    private String college;

    @Column(name = "major_student_sum")
    private Integer majorStudentSum;


    public Major(final String majorId,final String majorName,String college) {
        this.majorId = majorId;
        this.majorName = majorName;
        this.college = college;
    }

}
