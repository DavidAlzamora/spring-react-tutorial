package com.demo.springreact.repostories;

import com.demo.springreact.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Employee employee = new Employee("Frodo", "Baggins", "ring bearer");
        this.repository.save(employee);
    }

}
