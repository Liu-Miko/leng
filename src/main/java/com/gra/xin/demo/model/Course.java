package com.gra.xin.demo.model;
import javax.persistence.*;

import com.gra.xin.demo.model.Enum.Sex;
import lombok.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "Course")
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id", length = 20, unique = true, nullable = false, updatable = false)
    private final String   courseId;

    @Column(name = "course_name",length = 30,nullable = false)
    private final String courseName;

    @Column(name = "teacher_name",length = 20,nullable = false)
    private String teacher;

    @Column(name = "test_mode",length = 50,nullable = false)
    private String testMode;

    @Column(name = "school_time",length = 30)
    private String schoolTime;

    public Course(final String courseId,final String courseName,String teacher,String testMode) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
        this.testMode = testMode;
    }

    public Course(final String courseId,final String courseName,String teacher,String testMode,String schoolTime) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
        this.testMode = testMode;
        this.schoolTime = schoolTime;
    }

}
