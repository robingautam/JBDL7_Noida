package org.gfg.JBDL7_SpringBootDemo.controller;

import org.gfg.JBDL7_SpringBootDemo.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/application")
public class GenericController {


    @RequestMapping("/get/hello")
    public String getHello(){
        return "Hello World";
    }

   // @RequestMapping("/get/student")
    @GetMapping(value = "/get/student",  produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Student> getStudent(){            // Handler method
        Student student = new Student();
        student.setId(1);
        student.setName("Robin");
        student.setEmail("robingautam@gmail.com");
        return new ResponseEntity<>(student, HttpStatus.ACCEPTED);
    }


    @PostMapping(value = "/create/student", consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public String createStudent(@RequestBody Student student){
        System.out.println(student);
        return "OK";
    }

    @PostMapping("/create/student/map")
    public String createStudentMap(@RequestBody Map<String,Object> map){
        for (String key: map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
        return "OK";
    }
}
