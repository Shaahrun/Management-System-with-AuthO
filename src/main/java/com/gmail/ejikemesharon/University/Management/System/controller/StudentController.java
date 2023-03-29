package com.gmail.ejikemesharon.University.Management.System.controller;

import com.gmail.ejikemesharon.University.Management.System.model.Result;
import com.gmail.ejikemesharon.University.Management.System.model.Student;
import com.gmail.ejikemesharon.University.Management.System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudentAccount(@RequestBody Student student) {
        studentService.createStudentAccount(student);
    }

    @GetMapping("/student/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<Student> getStudent(@PathVariable int id) {
        Student student = studentService.findById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/{department}")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<List<Student>> getStudentsByDepartment(@PathVariable String department) {
        List<Student> studentsInDepartment = studentService.findByDepartment(department);
        return new ResponseEntity<>(studentsInDepartment, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateCgpa(@PathVariable int id, @RequestBody double currentCgpa) {
        studentService.updateStudentCgpa(id, currentCgpa);
    }

    @GetMapping("/result/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<List<Result>> getStudentResults(@PathVariable int id) {
        List<Result> studentResults = studentService.getResults(id);
        return new ResponseEntity<>(studentResults, HttpStatus.OK);
    }
}
