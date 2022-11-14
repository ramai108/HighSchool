package com.liceokeplero.school.model;

import com.liceokeplero.school.enums.AcademicYear;
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
    private AcademicYear academicYear;
}
