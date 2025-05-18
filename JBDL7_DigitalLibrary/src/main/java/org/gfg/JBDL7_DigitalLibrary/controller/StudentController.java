package org.gfg.JBDL7_DigitalLibrary.controller;

import org.gfg.JBDL7_DigitalLibrary.model.Student;
import org.gfg.JBDL7_DigitalLibrary.request.CreateStudentRequest;
import org.gfg.JBDL7_DigitalLibrary.response.StudentResponse;
import org.gfg.JBDL7_DigitalLibrary.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping(value = "/create/student", produces = MediaType.APPLICATION_JSON_VALUE
    , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StudentResponse> createStudent(@RequestBody(required = true)CreateStudentRequest createStudentRequest){
        StudentResponse studentResponse = new StudentResponse();
        if (createStudentRequest==null){
            studentResponse.setErrCode("FAILED");
            studentResponse.setMessage("Request is Empty");
            return new ResponseEntity<>(studentResponse, HttpStatus.OK);
        }

        Student student =  studentService.createStudent(createStudentRequest);
        if (student==null){
            studentResponse.setErrCode("FAILED");
            studentResponse.setMessage("Data Not Created");
            return new ResponseEntity<>(studentResponse, HttpStatus.OK);
        }


        studentResponse.setErrCode("00");
        studentResponse.setMessage("Student Has been created");
        studentResponse.setStudentId(Integer.toString(student.getStudentId()));
        studentResponse.setName(student.getName());

        return new ResponseEntity<>(studentResponse,HttpStatus.CREATED);
    }


}
