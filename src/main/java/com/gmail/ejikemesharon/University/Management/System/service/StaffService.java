package com.gmail.ejikemesharon.University.Management.System.service;

import com.gmail.ejikemesharon.University.Management.System.model.Staff;
import com.gmail.ejikemesharon.University.Management.System.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    @Autowired
    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {

        this.staffRepository = staffRepository;
    }

    public List<Staff> getAllStaff() {
       return staffRepository.findAll();
    }

    public void createStaffAccount(Staff staff) {
        staffRepository.save(staff);
    }

    public void updateStaffSalary(Long staffId, int updatedSalary) {
        staffRepository.updateStaffSalary(staffId, updatedSalary);
    }

    public List<Staff> getStaffByDept(String department) {
        return staffRepository.findByDepartment(department);
    }
}
