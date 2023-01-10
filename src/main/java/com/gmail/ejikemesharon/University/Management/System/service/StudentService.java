package com.gmail.ejikemesharon.University.Management.System.service;


import com.gmail.ejikemesharon.University.Management.System.model.Course;
import com.gmail.ejikemesharon.University.Management.System.model.Result;
import com.gmail.ejikemesharon.University.Management.System.model.Student;
import com.gmail.ejikemesharon.University.Management.System.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService {

    @Autowired
      private final StudentRepository studentRepository;

      public StudentService(StudentRepository studentRepository) {

          this.studentRepository = studentRepository;
      }

      public void createStudentAccount(Student newStudent) {
          studentRepository.save(newStudent);
      }

      public void updateStudentCgpa(int studentId, double currCgpa) {
          studentRepository.updateCgpa(studentId, currCgpa);
      }

      public Student findById(int studentId) {
          return studentRepository.findById(studentId);
      }

      public List<Student> findByDepartment(String department) {
          return studentRepository.findByDepartment(department);
      }

      public List<Student> findByCourse(String course) {
          return studentRepository.findByCourse(course);
      }

      public List<Result> getResults(int studentId) {
          return studentRepository.getResults(studentId);
      }
}
