package com.gmail.ejikemesharon.University.Management.System.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    private int courseCode;

    @JsonProperty
    private String courseTitle;

    @JsonProperty
    private String semester;

    @JsonProperty
    private int unit;

    @JsonProperty
    @ManyToMany
    private List<Staff> lecturers;

    @JsonProperty
    @ManyToMany
    private List<Student> enrolledStudents;
}
