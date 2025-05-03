package org.gfg.JBDL7_SpringBootDemo;

import org.gfg.parellel.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication           //: Its combination of 3 different annotation
//@Configuration                  : it requires to create the beam
//@ComponentScan("org.gfg")       : to scan the packages
//@EnableAutoConfiguration        :  to enable the autoconfiguration
@ComponentScan("org.gfg")      // : for manually scaning the pakages, generally required if bean is created outside the base package
//@SpringBootApplication(exclude = {DispatcherServletAutoConfiguration.class, ErrorMvcAutoConfiguration.class}) // to disable the autoconfiguration
public class Jbdl7SpringBootDemoApplication implements CommandLineRunner {

	@Autowired
	ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(Jbdl7SpringBootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(applicationContext.getBean("employee", Employee.class));
	}
}
