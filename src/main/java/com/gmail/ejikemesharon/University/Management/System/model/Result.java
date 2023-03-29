package com.gmail.ejikemesharon.University.Management.System.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "result")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
public class Result {

    @Id
    @Column
    private int studentId;

    @JsonProperty
    @Column
    private String firstName;

    @JsonProperty
    @Column
    private String lastName;

    @JsonProperty
    @Column
    private String courseTitle;

    @JsonProperty
    @Column
    private String courseCode;

    @JsonProperty
    @Column
    private String grade;

    @JsonProperty
    @Column
    private int score;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Result result = (Result) o;

        return Objects.equals(studentId, result.studentId);
    }

    @Override
    public int hashCode() {
        return 1925696220;
    }
}
