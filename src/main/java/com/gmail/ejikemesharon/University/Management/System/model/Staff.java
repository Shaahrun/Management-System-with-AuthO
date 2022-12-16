package com.gmail.ejikemesharon.University.Management.System.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long staffId;

    @JsonProperty
    private String name;

    @JsonProperty
    private String department;

    @JsonProperty
    private int salary;

    @JsonProperty
    private String rank;

    @JsonProperty
    @ManyToMany
    private List<Course> courseList;
}
