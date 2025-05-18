package org.gfg.JBDL7_DigitalLibrary.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentResponse extends Response{
    String studentId;
    String name;
}
