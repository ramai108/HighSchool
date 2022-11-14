package com.liceokeplero.school.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "subject")
public class SubjectEntity {

    @Id
    @Column(name = "subject_id", nullable = false, length = 255)
    private String subjectId;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "academic_year", nullable = false, length = 10)
    private Integer academicYear;


}
