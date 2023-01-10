package com.gmail.ejikemesharon.University.Management.System.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    @Id
    private UUID studentId;

    @JsonProperty
    private String firstName;

    @JsonProperty
    private String lastName;

    @JsonProperty
    private String courseTitle;

    @JsonProperty
    private String courseCode;

    @JsonProperty
    private char grade;

    @JsonProperty
    private int score;
}
