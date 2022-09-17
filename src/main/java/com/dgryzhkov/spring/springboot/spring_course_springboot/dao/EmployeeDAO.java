package com.dgryzhkov.spring.springboot.spring_course_springboot.dao;


import com.dgryzhkov.spring.springboot.spring_course_springboot.entity.Employee;

import java.util.List;

/**
 * @author Dgryzhkov
 */
public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

//    public void saveEmployee(Employee employee);
//
//    public Employee getEmployee(int id);
//
//    public void deleteEmployee(int id);
}
