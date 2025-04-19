package org.gfg.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {


    @Bean(name = {"emp","emp1","employee"})
    public Employee getEmployee(){
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Aaksash");
        return employee;
    }
}
