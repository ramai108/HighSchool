package com.liceokeplero.school.model;
import com.liceokeplero.school.enums.AcademicYear;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student

{
    private String studentId;
    private String name;
    private String lastName;
    private String address;
    private String birthDate;
    private Date enrollmentDate;
    private AcademicYear academicYear;
    private String phoneNumber;

}
