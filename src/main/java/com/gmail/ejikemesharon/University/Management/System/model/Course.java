package com.gmail.ejikemesharon.University.Management.System.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "course")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
public class Course {

    @Id
    @Column
    private String courseCode;

    @JsonProperty
    @Column
    private String courseTitle;

    @JsonProperty
    @Column
    private String semester;

    @JsonProperty
    @Column
    private int unit;

    @JsonProperty
    @JoinColumn(name = "staff", referencedColumnName = "staff_id")
    @ManyToMany
    @ToString.Exclude
    private List<Staff> lecturers;

    @JsonProperty
    @JoinColumn(name = "students", referencedColumnName = "student_id")
    @ManyToMany
    @ToString.Exclude
    private List<Student> enrolledStudents;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Course course = (Course) o;

        return courseCode != null && courseCode.equals(course.courseCode);
    }

    @Override
    public int hashCode() {
        return 1702818130;
    }
}
