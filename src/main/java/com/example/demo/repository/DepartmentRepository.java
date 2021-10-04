package com.example.demo.repository;

import com.example.demo.enntity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

    public Department findById(long id);
}
