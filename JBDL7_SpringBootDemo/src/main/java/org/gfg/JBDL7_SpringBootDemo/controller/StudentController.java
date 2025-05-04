package org.gfg.JBDL7_SpringBootDemo.controller;

import org.gfg.JBDL7_SpringBootDemo.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    static List<Student> list = null;
    static {
        list = Arrays.asList(new Student(1,"Robin","robin@gmail.com"),
                new Student(2,"Preeti", "preeti@gmail.com"),
                new Student(3, "Sahil", "Sahil@gmail.com"));
    }

    @GetMapping("/get/student/all")
    public List<Student> getAllStudent(){
        return list;
    }

    @GetMapping(value = "/get/student/id/{sid}")
    public Student getStudentById(@PathVariable("sid") int id, @RequestParam("lang") String lang){
        System.out.println(lang);
        for (Student s: list){
            if (s.getId()==id){
                return s;
            }
        }
        return null;
    }


    @PostMapping("/post/form/data")
    public String getFormData(@RequestParam("name") String name, @RequestParam("email") String email){
        System.out.println(name+" :"+email);
        return "OK";
    }

    @PostMapping("/post/form/data/map")
    public String getFormDataMap(@RequestParam Map<String,String> map){
        for (String key: map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
        return "OK";
    }






}
