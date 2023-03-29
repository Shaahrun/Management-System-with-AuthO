package com.gmail.ejikemesharon.University.Management.System.repository;

import com.gmail.ejikemesharon.University.Management.System.model.Result;
import com.gmail.ejikemesharon.University.Management.System.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
    
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Modifying
    @Query("update Student s set s.cgpa=:currCgpa where s.id=:studentId")
    void updateCgpa(int studentId, double currCgpa);

    //@Query("select * from Student s where s.studentId=:studentId")
    Student findByStudentId(int studentId);

    @Query("select c.enrolledStudents from Course c")
    List<Student> findByCourse(String course);

    //@Query("select * from Student s where s.department=:department")
    List<Student> findByDepartment(String department);

    @Query(value = "SELECT * FROM result r WHERE r.id = studentId", nativeQuery = true)
    List<Result> getResults(int studentId);
}
