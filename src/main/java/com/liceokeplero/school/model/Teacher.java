package com.liceokeplero.school.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Teacher
{
    private String teacherId;
    private String name;
    private String lastName;
    private String address;
    private String birthDate;
    private Date hiringDate;
    private String phoneNumber;

}
