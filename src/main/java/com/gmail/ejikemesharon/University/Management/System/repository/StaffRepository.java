package com.gmail.ejikemesharon.University.Management.System.repository;

import com.gmail.ejikemesharon.University.Management.System.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StaffRepository extends JpaRepository<Staff, Long> {

    void updateStaffSalary(Long staffId, int updatedSalary);

    List<Staff> findByDepartment(String department);
}
