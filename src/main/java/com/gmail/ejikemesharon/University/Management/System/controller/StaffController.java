package com.gmail.ejikemesharon.University.Management.System.controller;

import com.gmail.ejikemesharon.University.Management.System.model.Staff;
import com.gmail.ejikemesharon.University.Management.System.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  
@RequestMapping("/api/v1/staff")
public class StaffController {

    private final StaffService staffService;

    @Autowired
    public StaffController(StaffService staffService) {

        this.staffService = staffService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Staff>> getAllStaff() {
        List<Staff> allStaff = staffService.getAllStaff();
        return new ResponseEntity<>(allStaff, HttpStatus.OK);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createStaffAccount(@RequestBody Staff staff) {
        staffService.createStaffAccount(staff);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateStaffSalary(@PathVariable Long staffId, @RequestBody int salary) {
        staffService.updateStaffSalary(staffId, salary);
    }

    @GetMapping("/{department}")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<List<Staff>> getStaffByDept(@PathVariable String department) {
        List<Staff> deptStaff = staffService.getStaffByDept(department);
        return new ResponseEntity<>(deptStaff, HttpStatus.OK);
    }
}
