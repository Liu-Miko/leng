package com.gra.xin.demo.model;
import javax.persistence.*;

import lombok.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "College")
public class College implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "college_id", length = 20, unique = true, nullable = false, updatable = false)
    private final String   collegeId;

    @Column(name = "college_name",length = 30,nullable = false)
    private final String collegeName;

    @Column(name = "college_teacher_sum")
    private Integer collegeTeacherSum;

    @Column(name = "college_student_sum")
    private Integer collegeStudentSum;

    public College(final String collegeId,final String collegeName) {
        this.collegeId = collegeId;
        this.collegeName = collegeName;
    }


}
