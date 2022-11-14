package com.liceokeplero.school.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subject
{
    private String subjectId;
    private String description;
    private Integer academicYear;
}
