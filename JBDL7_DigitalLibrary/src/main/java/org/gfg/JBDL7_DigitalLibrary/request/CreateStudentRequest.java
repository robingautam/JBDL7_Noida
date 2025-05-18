package org.gfg.JBDL7_DigitalLibrary.request;

import lombok.Builder;
import lombok.Data;
import org.gfg.JBDL7_DigitalLibrary.model.StudentType;

@Data
@Builder
public class CreateStudentRequest {

    String studentId;
    String name;
    String email;
    String phoneNo;
    StudentType studentType;
}
