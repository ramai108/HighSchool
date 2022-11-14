package com.liceokeplero.school.entity;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "student")
public class StudentEntity
{

    @Id
    @Column (name= "student_id", nullable = false,length = 100)
    private String studentId;

    @Column (name ="name",length = 50, nullable = false)
    private String name;

    @Column(name ="last_name",length = 100, nullable = false)
    private String lastName;

    @Column (name = "address", length = 100, nullable = false)
    private String address;

    @Column (name = "birth_date", length = 20, nullable = false)
    private String birthDate;

    @Column (name = "enrollment_date",updatable = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date enrollmentDate;

    @Column (name = "academic_year", nullable = false)
    private Integer academicYear;

    @Column (name = "phone_number", nullable = false)
    private String phoneNumber;

}
