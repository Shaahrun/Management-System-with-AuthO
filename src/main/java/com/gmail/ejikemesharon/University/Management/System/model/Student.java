package com.gmail.ejikemesharon.University.Management.System.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.ManyToMany;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private UUID studentId;

    @JsonProperty
    private String name;

    @JsonProperty
    private String email;

    @JsonProperty
    private String department;

    @JsonProperty
    private int level;

    @JsonProperty
    private int cgpa;

    @JsonProperty
    @ManyToMany
    private List<Course> currentCourses;

    @JsonProperty
    private List<Course> completedCourses;
}
