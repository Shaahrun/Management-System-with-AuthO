package com.gmail.ejikemesharon.University.Management.System.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "student")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
// @NoArgsConstructor
public class Student {

    @Id
    @Column
    private int studentId;

    @JsonProperty
    @Column
    private String name;

    @JsonProperty
    @Column
    private String email;

    @JsonProperty
    @Column
    private String department;

    @JsonProperty
    @Column
    private int currentLevel;

    @JsonProperty
    @Column
    private double cgpa;

    @JsonProperty
    @ManyToMany
    @JoinColumn(name = "course_codes", referencedColumnName = "course_code")
    @ToString.Exclude
    private List<Course> coursesOffered;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Student student = (Student) o;

        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return 1128121276;
    }
}
