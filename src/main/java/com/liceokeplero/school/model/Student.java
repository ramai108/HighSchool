package com.liceokeplero.school.model;
import lombok.*;

import java.util.Date;

@Data
public class Student

{
    private String studentId;
    private String name;
    private String lastName;
    private String address;
    private String birthDate;
    private Date enrollmentDate;
    private Integer academicYear;
    private String phoneNumber;
}
