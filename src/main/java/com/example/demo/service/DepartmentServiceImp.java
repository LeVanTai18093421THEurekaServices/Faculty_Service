package com.example.demo.service;

import com.example.demo.enntity.Department;
import com.example.demo.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImp implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;


    @Override
    public Department getDepartmentById(long id) {
        return departmentRepository.findById(id);
    }
}
