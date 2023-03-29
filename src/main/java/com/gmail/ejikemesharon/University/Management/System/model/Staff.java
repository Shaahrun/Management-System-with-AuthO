package com.gmail.ejikemesharon.University.Management.System.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "staff")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long staffId;

    @JsonProperty
    @Column
    private String name;

    @JsonProperty
    @Column
    private String department;

    @JsonProperty
    @Column
    private int salary;

    @JsonProperty
    @Column
    private String rank;

    @JsonProperty
    @ManyToMany
    @JoinColumn(name = "courses", referencedColumnName = "course_code")
    @ToString.Exclude
    private List<Course> courseList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Staff staff = (Staff) o;

        return Objects.equals(staffId, staff.staffId);
    }

    @Override
    public int hashCode() {
        return 479966412;
    }
}
