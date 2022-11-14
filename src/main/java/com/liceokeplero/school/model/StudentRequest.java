package com.liceokeplero.school.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequest
{
    @JsonProperty("student_id")
    private String id;

    @JsonProperty("student_name")
    private String name;

    @JsonProperty("student_lastname")
    private String lastName;

    @JsonProperty("address")
    private String address;

    @JsonProperty("birth_date")
    private String birthDate;

    @JsonProperty("academic_year")
    private Integer academicYear;

    @JsonProperty("phone_number")
    private String phoneNumber;

}
