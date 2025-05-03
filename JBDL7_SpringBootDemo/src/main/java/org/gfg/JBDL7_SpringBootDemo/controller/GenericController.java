package org.gfg.JBDL7_SpringBootDemo.controller;

import org.gfg.JBDL7_SpringBootDemo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/application")
public class GenericController {


    @RequestMapping("/get/hello")
    public String getHello(){
        return "Hello World";
    }

   // @RequestMapping("/get/student")
    @GetMapping("/get/student")
    public Student getStudent(){
        Student student = new Student();
        student.setId(1);
        student.setName("Robin");
        student.setEmail("robingautam@gmail.com");
        return student;
    }
}
