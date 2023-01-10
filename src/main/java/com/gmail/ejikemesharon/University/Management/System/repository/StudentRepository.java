package com.gmail.ejikemesharon.University.Management.System.repository;

import com.gmail.ejikemesharon.University.Management.System.model.Result;
import com.gmail.ejikemesharon.University.Management.System.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
    
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("update Student s set s.cgpa=:currCgpa where s.id=:studentId")
    void updateCgpa(int studentId, double currCgpa);

    @Query("select * from Student s where s.id=:studentId")
    Student findById(int studentId);

    @Query("select * ")
    List<Student> findByCourse(String course);

    @Query("select * from Student s where s.department=:department")
    List<Student> findByDepartment(String department);

    List<Result> getResults(int studentId);
}
