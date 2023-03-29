package com.gmail.ejikemesharon.University.Management.System.repository;

import com.gmail.ejikemesharon.University.Management.System.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StaffRepository extends JpaRepository<Staff, Long> {

    @Query(value = "UPDATE staff s SET s.salary = updatedSalary WHERE s.id = staffId ", nativeQuery = true)
    void updateStaffSalary(Long staffId, int updatedSalary);

    List<Staff> findByDepartment(String department);
}
