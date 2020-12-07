package com.demo.springreact.repostories;

import com.demo.springreact.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, Long> {

}
